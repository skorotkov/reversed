package fi.polar.polarflow.sensor.fusedgps;

import android.content.Context;
import android.location.Location;
import android.os.Environment;
import android.support.v4.util.TimeUtils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.ISODateTimeFormat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import fi.polar.polarflow.sensor.fusedgps.proxy.PolarSensorEvent;

class FusedGpsLog {
    private static final String TAG = FusedGpsLog.class.getSimpleName();

    private FileOutputStream mFs;
    private PrintWriter mWriter;
    private String mFileName;

    FusedGpsLog(Context context) {
        if (!fi.polar.polarflow.ui.o.d(context, "android.permission.WRITE_EXTERNAL_STORAGE"))
            return;
        String dirName = Environment.getExternalStorageDirectory().getPath();
        mFileName = "gps-" + DateTime.now(DateTimeZone.UTC).toString(ISODateTimeFormat.basicDateTime()) + ".csv";
//        String dirName = "/sdcard/";
//        mFileName = "gps.csv";
        File file = new File(dirName, mFileName);
        try {
            mFs = new FileOutputStream(file);
            mWriter = new PrintWriter(mFs);
            mWriter.println(
                    "event:timestamp;" +
                    "event:fix;" +
                    "event:distance;" +
                    "event:speed;" +
                    "event:latitude;" +
                    "event:longitude;" +
                    "event:satellites;" +
                    "event:altitudeChecked;" +
                    "event:altitude;" +
                    "event:ascent;" +
                    "event:descent;" +
                    "location:latitude;" +
                    "location:longitude;" +
                    "location:hacc;" +
                    "location:alt;" +
                    "location:vacc;" +
                    "location:bearing;" +
                    "location:bacc;" +
                    "location:speed;" +
                    "location:sacc;" +
                    "location:time;" +
                    "location:et");
            mWriter.flush();
            Log.i(TAG, "open file: " + mFileName);
        } catch (FileNotFoundException e) {
            Log.e(TAG, "fail opening file: " + mFileName, e);
        }
    }

    private String locationToCsvString(Location location) {
        StringBuilder s = new StringBuilder();
        TimeUtils.formatDuration(location.getElapsedRealtimeNanos() / 1000000L, s);
        return String.format(Locale.US, "%.6f;%.6f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f;%s;%s",
                location.getLatitude(),
                location.getLongitude(),
                location.hasAccuracy() ? location.getAccuracy() : Float.NaN,
                location.hasAltitude() ? location.getAltitude() : Double.NaN,
                location.hasVerticalAccuracy() ? location.getVerticalAccuracyMeters() : Float.NaN,
                location.hasBearing()  ? location.getBearing()  : Float.NaN,
                location.hasBearingAccuracy() ? location.getBearingAccuracyDegrees() : Float.NaN,
                location.hasSpeed() ? location.getSpeed() : Float.NaN,
                location.hasSpeedAccuracy() ? location.getSpeedAccuracyMetersPerSecond() : Float.NaN,
                new DateTime(location.getTime()).toString(ISODateTimeFormat.dateTime()),
                s);
    }

    void write(Location location, PolarSensorEvent event) {
        if (mWriter != null) {
            String line = String.format(Locale.US,
                    "%s;%s",
                    event.toCsvString(),
                    locationToCsvString(location));
            mWriter.println(line);
        }
    }

    void close() {
        if (mWriter != null) {
            mWriter.close();
            mWriter = null;
        }
        if (mFs != null) {
            try {
                mFs.close();
            } catch (IOException e) {
                Log.e(TAG, "fail closing file: " + mFileName, e);
            }
        }
    }
}
