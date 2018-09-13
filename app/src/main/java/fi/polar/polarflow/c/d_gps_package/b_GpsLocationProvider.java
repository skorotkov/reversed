package fi.polar.polarflow.c.d_gps_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.g_AndroidSensorEventListener;
import fi.polar.polarflow.c.j_PolarSensorEventListener;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.util.aa_TimeUtils;
import fi.polar.polarflow.util.n_PowerManagerHelper;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentCalculatorAndroidImpl;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentOutput;
import fi.polar.polarmathsmart.gps.LocationDataCalculator;
import fi.polar.polarmathsmart.gps.LocationDataCalculatorAndroidImpl;

public class b_GpsLocationProvider extends a_GpsLocationProviderBase {
   private static final String w_className = b_GpsLocationProvider.class.getSimpleName();
   private e_PolarSensorListenerEx A_polarSensorListener;
   private boolean B_gpsSensorStarted;
   private final Handler C_handler;
   private long D;
   private long E_gpsLocationProviderStartTime;
   private aa_TimeUtils F_timeUtils;
   private n_PowerManagerHelper G_powerManagerHelper;
   private final j_PolarSensorEventListener H_polarSensorEventListener;
   private final g_AndroidSensorEventListener I_androidSensorEventListener;
   private final BroadcastReceiver J_powerSaveModeBroadcastReceiver;
   private LocationDataCalculator x_locationDataCalculator;
   private AscentDescentCalculatorAndroidImpl y_ascentDescentCalculator;
   private final i_GpsSensor z_gpsSensor;

   public b_GpsLocationProvider(Context var1) {
      this(var1, new LocationDataCalculatorAndroidImpl(30, 10, 5));
   }

   b_GpsLocationProvider(Context var1, LocationDataCalculatorAndroidImpl var2) {
      super(var1, n_SENSOR_TYPE.b_IN_DEVICE_GPS);
      this.y_ascentDescentCalculator = null;
      this.A_polarSensorListener = null;
      this.C_handler = new Handler();
      this.D = 0L;
      this.E_gpsLocationProviderStartTime = 0L;
      this.H_polarSensorEventListener = new c_GpsPolarSensorEventListener(this);
      this.I_androidSensorEventListener = new d_GpsAndroidSensorEventListener(this, this.H_polarSensorEventListener, this.C_handler);
      this.J_powerSaveModeBroadcastReceiver = new e_PowerSaveModeBroadcastReceiver(this);
      fi.polar.polarflow.util.d.c(w_className, "GpsLocationProvider");
      this.z_gpsSensor = new i_GpsSensor(this, (c_GpsPolarSensorEventListener)null);
      this.x_locationDataCalculator = var2;
      this.F_timeUtils = new aa_TimeUtils();
      this.G_powerManagerHelper = new n_PowerManagerHelper(this.a_context);
   }

   // $FF: synthetic method
   static double a_boundSpeed(double var0) {
      return b_boundSpeed(var0);
   }

   // $FF: synthetic method
   static long a_setD(b_GpsLocationProvider var0, long var1) {
      var0.D = var1;
      return var1;
   }

   // $FF: synthetic method
   static e_PolarSensorListenerEx a_getPolarSensorListener(b_GpsLocationProvider var0) {
      return var0.A_polarSensorListener;
   }

   // $FF: synthetic method
   static AscentDescentCalculatorAndroidImpl a_setAscentDescentCalculator(b_GpsLocationProvider var0, AscentDescentCalculatorAndroidImpl var1) {
      var0.y_ascentDescentCalculator = var1;
      return var1;
   }

   // $FF: synthetic method
   static void a_setState(b_GpsLocationProvider var0, m_SENSOR_STATE var1, boolean var2) {
      var0.a_setState(var1, var2);
   }

   // $FF: synthetic method
   static boolean a_setGpsSensorStarted(b_GpsLocationProvider var0, boolean var1) {
      var0.B_gpsSensorStarted = var1;
      return var1;
   }

   private static double b_boundSpeed(double var0) {
      double var2;
      if (var0 < 0.0D) {
         fi.polar.polarflow.util.d.e(w_className, "Speed is below minimum: " + var0 + " m/s");
         var2 = 0.0D;
      } else {
         var2 = var0;
         if (var0 > 110.83333626941406D) {
            fi.polar.polarflow.util.d.e(w_className, "Speed is above maximum : " + var0 + " m/s");
            var2 = 110.83333626941406D;
         }
      }

      return var2;
   }

   // $FF: synthetic method
   static void b_setState(b_GpsLocationProvider var0, m_SENSOR_STATE var1, boolean var2) {
      var0.a_setState(var1, var2);
   }

   // $FF: synthetic method
   static boolean b_isGpsSensorStarted(b_GpsLocationProvider var0) {
      return var0.B_gpsSensorStarted;
   }

   // $FF: synthetic method
   static n_PowerManagerHelper c(b_GpsLocationProvider var0) {
      return var0.G_powerManagerHelper;
   }

   // $FF: synthetic method
   static void c_setState(b_GpsLocationProvider var0, m_SENSOR_STATE var1, boolean var2) {
      var0.a_setState(var1, var2);
   }

   // $FF: synthetic method
   static aa_TimeUtils d_getTimeUtils(b_GpsLocationProvider var0) {
      return var0.F_timeUtils;
   }

   // $FF: synthetic method
   static void d_setState(b_GpsLocationProvider var0, m_SENSOR_STATE var1, boolean var2) {
      var0.a_setState(var1, var2);
   }

   // $FF: synthetic method
   static g_AndroidSensorEventListener e_getAndroidSensorEventListener(b_GpsLocationProvider var0) {
      return var0.I_androidSensorEventListener;
   }

   // $FF: synthetic method
   static i_GpsSensor f_getGpsSensor(b_GpsLocationProvider var0) {
      return var0.z_gpsSensor;
   }

   // $FF: synthetic method
   static Context g_getContext(b_GpsLocationProvider var0) {
      return var0.a_context;
   }

   // $FF: synthetic method
   static LocationDataCalculator h_getLocationDataCalculator(b_GpsLocationProvider var0) {
      return var0.x_locationDataCalculator;
   }

   // $FF: synthetic method
   static long i_getD(b_GpsLocationProvider var0) {
      return var0.D;
   }

   // $FF: synthetic method
   static long j_getGpsLocationProviderStartTime(b_GpsLocationProvider var0) {
      return var0.E_gpsLocationProviderStartTime;
   }

   // $FF: synthetic method
   static AscentDescentCalculatorAndroidImpl k_getAscentDescentCalculator(b_GpsLocationProvider var0) {
      return var0.y_ascentDescentCalculator;
   }

   // $FF: synthetic method
   static boolean l_isActive(b_GpsLocationProvider var0) {
      return var0.e_isActive;
   }

   // $FF: synthetic method
   static m_SENSOR_STATE m_getState(b_GpsLocationProvider var0) {
      return var0.b_sensorState;
   }

   // $FF: synthetic method
   static m_SENSOR_STATE n_getState(b_GpsLocationProvider var0) {
      return var0.b_sensorState;
   }

   // $FF: synthetic method
   static n_SENSOR_TYPE o_getType(b_GpsLocationProvider var0) {
      return var0.c_sensorType;
   }

   // $FF: synthetic method
   static Context p_getContext(b_GpsLocationProvider var0) {
      return var0.a_context;
   }

   // $FF: synthetic method
   static Context q_getContext(b_GpsLocationProvider var0) {
      return var0.a_context;
   }

   // $FF: synthetic method
   static boolean r(b_GpsLocationProvider var0) {
      return var0.d_sensorStarted;
   }

   // $FF: synthetic method
   static m_SENSOR_STATE s_getState(b_GpsLocationProvider var0) {
      return var0.b_sensorState;
   }

   // $FF: synthetic method
   static String s_getClassName() {
      return w_className;
   }

   protected void a_reset() {
      super.a_reset();
      this.n_referenceDistanceInMeters = (float)this.x_locationDataCalculator.getDistanceInMeters();
      this.i_altitudeInMetersChecked = a_DataTypes.b_adjust(4, this.x_locationDataCalculator.getAltitudeInMeters(true));
   }

   public void a_setPolarSensorListener(l_PolarSensorListener var1) {
      this.A_polarSensorListener = (e_PolarSensorListenerEx)var1;
   }

   public void a_setState(m_SENSOR_STATE var1) {
      if (m_SENSOR_STATE.d_READY.equals(var1)) {
         if (!this.x_locationDataCalculator.getFix()) {
            super.a_setState(m_SENSOR_STATE.c_SEARCHING, false);
         } else {
            super.a_setState(var1, false);
         }
      } else {
         super.a_setState(var1, false);
      }

   }

   public void b_start() {
      this.E_gpsLocationProviderStartTime = this.F_timeUtils.b_elapsedRealtime();
      fi.polar.polarflow.util.d.c(w_className, "start() at: " + this.E_gpsLocationProviderStartTime);
      if (!fi.polar.polarflow.ui.o.d(this.a_context, "android.permission.ACCESS_FINE_LOCATION")) {
         this.a_setState(m_SENSOR_STATE.a_DISABLED, true);
      } else if (!this.d_sensorStarted) {
         this.d_sensorStarted = true;
         this.a_context.registerReceiver(this.J_powerSaveModeBroadcastReceiver, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), (String)null, this.C_handler);
         if (this.G_powerManagerHelper.a_isPowerSaveMode()) {
            this.a_setState(m_SENSOR_STATE.a_DISABLED, true);
         } else if (!this.B_gpsSensorStarted) {
            i_GpsSensor.b_startListeningUpdates(this.z_gpsSensor);
         }
      } else {
         this.d_broadcastStateChanged();
      }

   }

   public void c_stop() {
      fi.polar.polarflow.util.d.c(w_className, "stop()");
      if (this.d_sensorStarted) {
         this.d_sensorStarted = false;
         this.a_context.unregisterReceiver(this.J_powerSaveModeBroadcastReceiver);
         i_GpsSensor.c_stopListeningUpdates(this.z_gpsSensor);
      } else {
         this.d_broadcastStateChanged();
      }

      this.C_handler.removeCallbacksAndMessages((Object)null);
      i_GpsSensor.d_removeFromStickyLocalBroadcastManagerMap(this.z_gpsSensor);
   }

   public void d_broadcastStateChanged() {
      i_GpsSensor.e_broadcastStateChanged(this.z_gpsSensor);
   }

   public void f_pause() {
      this.e_isActive = false;
      this.f_isPaused = true;
   }

   public void g_resume() {
      this.m_totalDistanceDuringPauseInMeters += (float)this.x_locationDataCalculator.getDistanceInMeters() - this.l_totalDirtyDistanceInMeters;
      if (this.y_ascentDescentCalculator != null) {
         AscentDescentOutput var1 = this.y_ascentDescentCalculator.addAltitude((float)this.i_altitudeInMetersChecked);
         this.p_totalAscentDuringPause += var1.getAscent() - this.r_totalDirtyAscent;
         this.q_totalDescentDuringPause += var1.getDescent() - this.s_totalDirtyDescent;
         this.r_totalDirtyAscent = var1.getAscent();
         this.s_totalDirtyDescent = var1.getDescent();
      }

      this.e_isActive = true;
      this.f_isPaused = false;
   }

   public void h() {
      super.h();
      if (this.d_sensorStarted && this.B_gpsSensorStarted) {
         i_GpsSensor.a_collectAndBroadcastLocationData(this.z_gpsSensor);
      }

   }
}
