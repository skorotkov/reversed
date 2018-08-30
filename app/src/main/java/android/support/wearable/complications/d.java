package android.support.wearable.complications;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;

@TargetApi(24)
public abstract class d extends Service {
   private f a;
   private final Handler b = new Handler(Looper.getMainLooper());

   // $FF: synthetic method
   static Handler a(d var0) {
      return var0.b;
   }

   public void a(int var1) {
   }

   public void a(int var1, int var2, c var3) {
   }

   public abstract void b(int var1, int var2, c var3);

   public IBinder onBind(Intent var1) {
      f var2 = null;
      if ("android.support.wearable.complications.ACTION_COMPLICATION_UPDATE_REQUEST".equals(var1.getAction())) {
         if (this.a == null) {
            this.a = new f(this, (e)null);
         }

         var2 = this.a;
      }

      return var2;
   }
}
