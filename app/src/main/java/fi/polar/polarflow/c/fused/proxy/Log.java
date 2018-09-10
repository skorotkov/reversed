package fi.polar.polarflow.c.fused.proxy;

public class Log {
    public static int i(String tag, String msg) {
        return android.util.Log.i(tag, msg);
    }
    public static int w(String tag, String msg) {
        return android.util.Log.w(tag, msg);
    }
    public static int w(String tag, String msg, Throwable ex) {
        return android.util.Log.w(tag, msg, ex);
    }
    public static int e(String tag, String msg) {
        return android.util.Log.e(tag, msg);
    }
    public static int e(String tag, String msg, Throwable ex) {
        return android.util.Log.e(tag, msg, ex);
    }
}
