package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

class w extends Handler {
   // $FF: synthetic field
   final v a;

   w(v var1) {
      this.a = var1;
   }

   w(v var1, Handler var2) {
      super(var2.getLooper());
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         this.a.a.onShowPress(this.a.e);
         break;
      case 2:
         this.a.a();
         break;
      case 3:
         if (this.a.b != null) {
            if (!this.a.c) {
               this.a.b.onSingleTapConfirmed(this.a.e);
            } else {
               this.a.d = true;
            }
         }
         break;
      default:
         throw new RuntimeException("Unknown message " + var1);
      }

   }
}
