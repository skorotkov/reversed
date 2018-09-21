package fi.polar.polarflow.sensor.fusedgps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;

import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

import fi.polar.polarflow.sensor.fusedgps.a_package.a_DataTypes;
import fi.polar.polarflow.sensor.fusedgps.proxy.AndroidSensorEventListener;
import fi.polar.polarflow.sensor.fusedgps.proxy.PolarSensorEvent;
import fi.polar.polarflow.sensor.fusedgps.proxy.SENSOR_STATE;
import fi.polar.polarflow.sensor.fusedgps.proxy.SENSOR_TYPE;
import fi.polar.polarflow.sensor.fusedgps.proxy.Sensor;
import fi.polar.polarflow.sensor.fusedgps.proxy.StickyLocalBroadcastManager;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentCalculatorAndroidImpl;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentOutput;

public class FusedGpsLocationProvider extends Sensor {
    private static final String TAG = FusedGpsLocationProvider.class.getSimpleName();

    private long mProviderStartTime;
    private long mEventTime;
    private long mLastFixElapsedRealtime;

    private Handler mHandler = new Handler();
    private BroadcastReceiver mPowerSaveModeBroadcastReceiver;
    private AndroidSensorEventListener mAndroidSensorEventListener;

    private PowerManagerHelper mPowerManagerHelper;
    private AscentDescentCalculatorAndroidImpl mAscentDescentCalculator = null;

    private FusedGpsSensor mSensor;
    private boolean mSensorStarted;
    private FusedLocationDataCalculator mLocationDataCalculator;

    private FusedGpsLog mGpsLog = null;

    private double mLatitudeInDecimalDegrees = 0.0D;
    private double mLongitudeInDecimalDegrees = 0.0D;
    private double mAltitudeInMetersChecked = Double.NaN;
    private double mAltitudeInMeters = Double.NaN;
    private int mNumberOfSatellites = 0;
    private float mSpeedInMetersPerSecond = Float.NaN;
    private boolean mFix = false;

    private float mReferenceDistanceInMeters = 0.0F;
    private float mDirtyTotalDistanceInMeters = 0.0F;
    private float mTotalDistanceDuringPauseInMeters = 0.0F;

    private float mTotalAscentDuringPause = 0.0F;
    private float mTotalDescentDuringPause = 0.0F;
    private float mTotalDirtyAscent = 0.0F;
    private float mTotalDirtyDescent = 0.0F;

    private Location mPreviousLocation = null;
    private long mPreviousLocationTimestamp = 0L;
    private Deque<Location> mLocationQueue = new ConcurrentLinkedDeque<>();
    private Runnable mSamplerTask = new Runnable() {
        @Override
        public void run() {
            if (isStarted()) {
                Location location = mLocationQueue.poll();
                if (location != null) {
                    handleLocation(location);
                } else {
                    Log.i(TAG, "mSamplerTask: location queue is empty");
                }
                mHandler.postDelayed(mSamplerTask, 1000L);
            }
        }
    };

    public FusedGpsLocationProvider(Context context) {
        super(context, SENSOR_TYPE.FUSED_GPS);
        Log.i(TAG, "FusedGpsLocationProvider");

        mPowerManagerHelper = new PowerManagerHelper(context);
        mSensor = new FusedGpsSensor(this);
        mSensorStarted = false;
        mPowerSaveModeBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                boolean isPowerSaveMode = mPowerManagerHelper.isPowerSaveMode();
                Log.i(TAG, "onReceive: ACTION_POWER_SAVE_MODE_CHANGED, enabled= " + isPowerSaveMode);
                if (isPowerSaveMode) {
                    mEventTime = SystemClock.elapsedRealtime();
                    mFix = false;
                    mAndroidSensorEventListener.onEvent(createPolarSensorEvent());
                    mHandler.removeCallbacks(mSamplerTask);
                    mSensor.stopListeningUpdates();
                } else {
                    mHandler.post(mSamplerTask);
                    mSensor.startListeningUpdates();
                }
            }
            }
        };
        mLocationDataCalculator = new FusedLocationDataCalculator();

        mHandler = new Handler();
        mAndroidSensorEventListener = new AndroidSensorEventListener(mPolarSensorEventListener, mHandler) {
            public void onEvent(PolarSensorEvent event) {
                Log.i(TAG+"::AndroidSensorEventListener", "onEvent");
                if (mSensorStarted) {
                    super.onEvent(event);
                }
            }
        };
        this.mLastFixElapsedRealtime = 0L;
        this.mProviderStartTime = 0L;
    }

    @Override
    protected void reset() {
        Log.i(TAG, "reset");

        mLatitudeInDecimalDegrees = 0.0D;
        mLongitudeInDecimalDegrees = 0.0D;
        mAltitudeInMetersChecked = Double.NaN;
        mAltitudeInMeters = Double.NaN;
        mNumberOfSatellites = 0;
        mSpeedInMetersPerSecond = Float.NaN;
        mFix = false;
        mEventTime = 0L;

        mTotalDirtyAscent = 0.0F;
        mTotalDirtyDescent = 0.0F;
        mTotalAscentDuringPause = 0.0F;
        mTotalDescentDuringPause = 0.0F;

        mReferenceDistanceInMeters = (float)mLocationDataCalculator.getDistanceInMeters();
        mAltitudeInMetersChecked = a_DataTypes.b_adjust(a_DataTypes.ALTITUDE_INDEX, mLocationDataCalculator.getAltitudeInMeters(true));
    }

    @Override
    public void start() {
        mProviderStartTime = SystemClock.elapsedRealtime();
        mGpsLog = new FusedGpsLog(getContext());

        Log.i(TAG, "start() at: " + mProviderStartTime);
        if (!fi.polar.polarflow.ui.o.d(getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            Log.i(TAG, "Disabled because of lack of permission");
            setState(SENSOR_STATE.DISABLED, true);
        } else if (!isStarted()) {
            setStarted(true);
            getContext().registerReceiver(mPowerSaveModeBroadcastReceiver, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), null, mHandler);
            
            if (this.mPowerManagerHelper.isPowerSaveMode()) {
                Log.i(TAG, "Disabled because of power save mode");
                setState(SENSOR_STATE.DISABLED, true);
            } else if (!mSensorStarted) {
                mSensorStarted = true;
                mHandler.post(mSamplerTask);
                mSensor.startListeningUpdates();
            }
        } else {
            broadcastStateChanged();
        }
    }

    @Override
    public void stop() {
        Log.i(TAG, "stop()");
        if (mGpsLog != null) {
            mGpsLog.close();
            mGpsLog = null;
        }
        if (isStarted()) {
            setStarted(false);
            getContext().unregisterReceiver(mPowerSaveModeBroadcastReceiver);
            mSensor.stopListeningUpdates();
            mSensorStarted = false;
            if (mPowerManagerHelper.isPowerSaveMode()) {
                setState(SENSOR_STATE.DISABLED, true);
            } else {
                setState(SENSOR_STATE.NOT_READY, true);
            }

        } else {
            broadcastStateChanged();
        }

        mHandler.removeCallbacks(mSamplerTask);
        mHandler.removeCallbacksAndMessages(null);
        StickyLocalBroadcastManager.removeFromMap("fi.polar.polarflow.ACTION_LOCATION_DATA", "fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
    }

    @Override
    protected void broadcastStateChanged() {
        Log.i(TAG, "broadcastStateChanged: " + getState());

        Intent intent = new Intent("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
        intent.putExtra("fi.polar.polarflow.SENSOR_STATE", SENSOR_STATE.toPolar(getState()));
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_TYPE", SENSOR_TYPE.toPolar(getType()));

        StickyLocalBroadcastManager.sendStickyBroadcast(intent);
    }

    @Override
    protected void pause() {
        Log.i(TAG, "pause");
        setActive(false);
    }

    @Override
    protected void resume() {
        Log.i(TAG, "resume");
        mTotalDistanceDuringPauseInMeters += (float)mLocationDataCalculator.getDistanceInMeters() - mDirtyTotalDistanceInMeters;
        if (mAscentDescentCalculator != null) {
            AscentDescentOutput ascentDescentOutput = mAscentDescentCalculator.addAltitude((float)mAltitudeInMetersChecked);
            mTotalAscentDuringPause += ascentDescentOutput.getAscent() - mTotalDirtyAscent;
            mTotalDescentDuringPause += ascentDescentOutput.getDescent() - mTotalDirtyDescent;
            mTotalDirtyAscent = ascentDescentOutput.getAscent();
            mTotalDirtyDescent = ascentDescentOutput.getDescent();
        }

        setActive(true);
        mHandler.postDelayed(mSamplerTask, 1000L);
    }

    @Override
    public void setState(SENSOR_STATE var1) {
        if (SENSOR_STATE.READY.equals(var1)) {
            if (!mFix) { // TODO: may be more actual data is needed here
                super.setState(SENSOR_STATE.SEARCHING, false);
            } else {
                super.setState(var1, false);
            }
        } else {
            super.setState(var1, false);
        }
    }

    private void storeLocation(Location location) {
//        Log.i(TAG, "storeLocation: " + location.toString());

        long elapsedRealtime = SystemClock.elapsedRealtime();

        if (mLastFixElapsedRealtime == 0L) {
            Log.i(TAG, "First location handled, diff to GPS start time(" + elapsedRealtime + " - " + mProviderStartTime + ") :" + (elapsedRealtime - mProviderStartTime));
        }
        mLastFixElapsedRealtime = elapsedRealtime;

        if (mPreviousLocation != null) {
            long timeDifference = location.getElapsedRealtimeNanos() - mPreviousLocation.getElapsedRealtimeNanos();
            if (timeDifference > TimeUnit.MILLISECONDS.toNanos(1200)) {
                int numberOfExtraPoints = (int)(timeDifference / TimeUnit.SECONDS.toNanos(1));
                float extraAccuracy = (mPreviousLocation.getAccuracy()   + location.getAccuracy())  / 2;
                double latDifference = location.getLatitude() - mPreviousLocation.getLatitude();
                double lonDifference = location.getLongitude() - mPreviousLocation.getLongitude();
                double altDifference = location.getAltitude() - mPreviousLocation.getAltitude();
                for (int i = 1; i <= numberOfExtraPoints; i++) {
                    Location extraLocation = new Location("fused");
                    extraLocation.setAccuracy(extraAccuracy);
                    extraLocation.setLatitude(mPreviousLocation.getLatitude() + latDifference / (double)timeDifference);
                    extraLocation.setLongitude(mPreviousLocation.getLongitude() + lonDifference / (double)timeDifference);
                    extraLocation.setAltitude(mPreviousLocation.getAltitude()   + altDifference / (double)timeDifference);
                    extraLocation.setElapsedRealtimeNanos(mPreviousLocation.getElapsedRealtimeNanos() + i * TimeUnit.SECONDS.toNanos(1));
                    mLocationQueue.add(extraLocation);
                    Log.i(TAG, "storeLocation: extraLocation added to queue " + extraLocation);
                }
            }
        }
        mLocationQueue.add(location);
        Log.i(TAG, "storeLocation: location added to queue " + location);
        mPreviousLocation = location;
    }

    private void handleLocation(Location location) {
        Log.i(TAG, "handleLocation: " + location);
        mLocationDataCalculator.handleLocation(location);

        mEventTime = SystemClock.elapsedRealtime();//mLastFixElapsedRealtime;
        mFix = mLocationDataCalculator.getFix();
        mNumberOfSatellites = mLocationDataCalculator.getNumberOfSatellites();
        mAltitudeInMetersChecked = a_DataTypes.b_adjust(a_DataTypes.ALTITUDE_INDEX, mLocationDataCalculator.getAltitudeInMeters(true));
        mAltitudeInMeters = a_DataTypes.b_adjust(a_DataTypes.ALTITUDE_INDEX, mLocationDataCalculator.getAltitudeInMeters(false));
        mSpeedInMetersPerSecond = (float)boundSpeed(mLocationDataCalculator.getSpeedInMetersPerSecond());
        mLatitudeInDecimalDegrees = a_DataTypes.b_adjust(a_DataTypes.LAT_INDEX, mLocationDataCalculator.getLatitudeInDecimalDegrees());
        mLongitudeInDecimalDegrees = a_DataTypes.b_adjust(a_DataTypes.LON_INDEX, mLocationDataCalculator.getLongitudeInDecimalDegrees());
        AscentDescentOutput ascentDescentOutput = null;
        if (mAscentDescentCalculator != null) {
            ascentDescentOutput = mAscentDescentCalculator.addAltitude((float)mAltitudeInMetersChecked);
        }

        setState(SENSOR_STATE.READY);

        if (isActive()) {
            mDirtyTotalDistanceInMeters = (float)mLocationDataCalculator.getDistanceInMeters();
            if (mAscentDescentCalculator == null && !Double.isNaN(mAltitudeInMetersChecked)) {
                mAscentDescentCalculator = new AscentDescentCalculatorAndroidImpl(1, (float)mAltitudeInMetersChecked);
            } else if (ascentDescentOutput != null) {
                mTotalDirtyAscent = ascentDescentOutput.getAscent();
                mTotalDirtyDescent = ascentDescentOutput.getDescent();
            }

            broadcastLocationData(mSpeedInMetersPerSecond,
                    getPureTotalDistance(),
                    mAltitudeInMetersChecked,
                    getPureAscent(),
                    getPureDescent());
        }

        PolarSensorEvent event = createPolarSensorEvent();
        if (mGpsLog != null)
            mGpsLog.write(location, event);
        mAndroidSensorEventListener.onEvent(event);
    }

    private static double boundSpeed(double speed) {
        double result;
        if (speed < 0.0D) {
            Log.i(TAG, "Speed is below minimum: " + speed + " m/s");
            result = 0.0D;
        } else {
            result = speed;
            if (speed > 110.83333626941406D) {
                Log.i(TAG, "Speed is above maximum : " + speed + " m/s");
                result = 110.83333626941406D;
            }
        }
        return result;
    }

    void storeLocationList(List<Location> locationList){
        Log.i(TAG, "storeLocationList: size = " + locationList.size());
        for (Location location : locationList) {
            storeLocation(location);
        }
    }

    private float getPureTotalDistance() {
        return a_DataTypes.a_adjust(a_DataTypes.DISTANCE_INDEX,
                mDirtyTotalDistanceInMeters - (mReferenceDistanceInMeters + mTotalDistanceDuringPauseInMeters));
    }

    private float getPureAscent() {
        float result;
        if (mTotalDirtyAscent > mTotalAscentDuringPause) {
            result = mTotalDirtyAscent - mTotalAscentDuringPause;
        } else {
            result = 0.0F;
        }

        return result;
    }

    private float getPureDescent() {
        float result;
        if (mTotalDirtyDescent > mTotalDescentDuringPause) {
            result = mTotalDirtyDescent - mTotalDescentDuringPause;
        } else {
            result = 0.0F;
        }

        return result;
    }

    private void broadcastLocationData(float speed, float pureTotalDistance, double altitude, float pureAscent, float pureDescent) {
        Log.i(TAG, "broadcastLocationData");

        Intent intent = new Intent("fi.polar.polarflow.ACTION_LOCATION_DATA");

        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE", "fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR");
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_CURRENT_SPEED_VALUE", speed);
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE", pureTotalDistance);
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ALTITUDE_VALUE", altitude);
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ASCENT_VALUE", pureAscent);
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DESCENT_VALUE", pureDescent);
        intent.putExtra("fi.polar.polarflow.SENSOR_STATE", SENSOR_STATE.toPolar(getState()));

        StickyLocalBroadcastManager.sendStickyBroadcast(intent);
    }

    protected synchronized PolarSensorEvent createPolarSensorEvent() {
        StringBuilder s = new StringBuilder();
        TimeUtils.formatDuration(mEventTime, s);
        String eventString = PolarSensorEvent.class.getSimpleName() + String.format(Locale.US,
                "[t:%s f:%s D:%.2f S:%.2f La:%.6f Lo:%.6f A:%.2f a:%.2f u:%.2f d:%.2f n:%d]",
                s.toString(), mFix,
                getPureTotalDistance(),
                mSpeedInMetersPerSecond,
                mLatitudeInDecimalDegrees,
                mLongitudeInDecimalDegrees,
                mAltitudeInMetersChecked,
                mAltitudeInMeters,
                getPureAscent(),
                getPureDescent(),
                mNumberOfSatellites);
        Log.i(TAG, "createPolarSensorEvent: " + eventString);

        return new PolarSensorEvent(
                mEventTime,
                mFix,
                getPureTotalDistance(),
                mSpeedInMetersPerSecond,
                mLatitudeInDecimalDegrees,
                mLongitudeInDecimalDegrees,
                mNumberOfSatellites,
                mAltitudeInMetersChecked,
                mAltitudeInMeters,
                getPureAscent(),
                getPureDescent());
    }

    void setFix(boolean fix) {
        mFix = fix;
    }

    protected float getSpeedInMetersPerSecond() {
        return mSpeedInMetersPerSecond;
    }
}
