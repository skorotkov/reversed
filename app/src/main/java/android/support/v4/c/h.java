package android.support.v4.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class h extends Handler {
   // $FF: synthetic field
   final g a;

   h(g var1, Looper var2) {
      super(var2);
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         g.a(this.a);
         break;
      default:
         super.handleMessage(var1);
      }

   }
}
