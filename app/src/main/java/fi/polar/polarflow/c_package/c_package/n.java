package fi.polar.polarflow.c_package.c_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class n extends BroadcastReceiver {
   // $FF: synthetic field
   final j a;

   n(j var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if (j.c(this.a)) {
         String var4 = var2.getAction();
         fi.polar.polarflow.util.d.c("HeartRateSensorManager", var4);
         byte var3 = -1;
         switch(var4.hashCode()) {
         case 92332207:
            if (var4.equals("fi.polar.polarflow.ACTION_SENSOR_PAIRING_CONFIRMED")) {
               var3 = 1;
            }
            break;
         case 1814043169:
            if (var4.equals("TrainingService.action.TRAINING_STARTED")) {
               var3 = 0;
            }
            break;
         case 2121134270:
            if (var4.equals("fi.polar.polarflow.ACTION_SENSOR_PAIRING_DECLINED")) {
               var3 = 2;
            }
         }

         switch(var3) {
         case 0:
            j.m(this.a).post(new r(this.a, (k)null));
            break;
         case 1:
            j.m(this.a).post(new p(this.a, var2.getStringExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS")));
            break;
         case 2:
            j.m(this.a).post(new q(this.a, var2.getStringExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS")));
         }
      }

   }
}
