package fi.polar.polarflow.service;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;

public class f {
   private static final String a = f.class.getSimpleName();
   private static final Uri b = (new Builder()).scheme("content").authority("com.google.android.wearable.settings").path("play_store_availability").build();
   private static final SparseArray f = new h();
   private final Context c;
   private HandlerThread d;
   private ContentObserver e;

   public f(Context var1) {
      this.c = var1;
   }

   public static int a(Context var0) {
      Cursor var6 = var0.getContentResolver().query(b, (String[])null, (String)null, (String[])null, (String)null);
      int var1;
      if (var6 != null) {
         try {
            while(var6.moveToNext()) {
               if ("play_store_availability".equals(var6.getString(0))) {
                  var1 = var6.getInt(1);
                  fi.polar.polarflow.util.u.a().a(var1);
                  String var2 = a;
                  StringBuilder var3 = new StringBuilder();
                  fi.polar.polarflow.util.d.c(var2, var3.append("getPlayStoreAvailability(").append(b(var1)).append(")").toString());
                  return var1;
               }
            }
         } finally {
            var6.close();
         }
      }

      var1 = 0;
      return var1;
   }

   // $FF: synthetic method
   static Context a(f var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static String a(int var0) {
      return b(var0);
   }

   private void a(Handler var1, ContentResolver var2) {
      this.e = new g(this, var1);
      var2.registerContentObserver(b, true, this.e);
      this.e.dispatchChange(true, b);
   }

   private static String b(int var0) {
      String var1 = (String)f.get(var0);
      if (var1 == null) {
         var1 = String.valueOf(var0);
      }

      return var1;
   }

   // $FF: synthetic method
   static Uri c() {
      return b;
   }

   // $FF: synthetic method
   static String d() {
      return a;
   }

   public void a() {
      this.d = new HandlerThread("PlayStoreAvailabilityThread");
      this.d.start();
      this.a(new Handler(this.d.getLooper()), this.c.getContentResolver());
   }

   public void b() {
      this.c.getContentResolver().unregisterContentObserver(this.e);
      this.d.quitSafely();
   }
}
