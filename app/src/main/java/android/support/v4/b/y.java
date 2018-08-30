package android.support.v4.b;

import android.os.Handler;
import android.os.Message;

class y extends Handler {
   // $FF: synthetic field
   final x a;

   y(x var1) {
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         if (this.a.g) {
            this.a.a(false);
         }
         break;
      case 2:
         this.a.a();
         this.a.d.n();
         break;
      default:
         super.handleMessage(var1);
      }

   }
}
