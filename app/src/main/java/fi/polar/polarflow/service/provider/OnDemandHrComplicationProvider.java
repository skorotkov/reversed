package fi.polar.polarflow.service.provider;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.b;
import android.support.wearable.complications.c;
import android.support.wearable.complications.d;
import fi.polar.polarflow.ui.myheartrate.MyHeartRateActivity;
import fi.polar.polarflow.util.f;

public class OnDemandHrComplicationProvider extends d {
   private f a;

   private ComplicationData a(int var1, int var2) {
      Intent var3 = new Intent(this.getApplicationContext(), MyHeartRateActivity.class);
      var3.addFlags(1342210048);
      Bundle var4 = new Bundle();
      var4.putBoolean("tap_to_exit", true);
      var4.putBoolean("polar_button_to_exit", false);
      var4.putBoolean("is_ambient_enabled", false);
      var4.putInt("measurement_timeout", 60000);
      var3.putExtras(var4);
      PendingIntent var5 = PendingIntent.getActivity(this.getApplicationContext(), var1, var3, 268435456);
      ComplicationData var6;
      switch(var2) {
      case 6:
         var6 = (new b(6)).a(Icon.createWithBitmap(this.a.a(this.getApplicationContext(), 2131231138, this.getApplicationContext().getResources().getDimension(2131362303), -1))).a(var5).a();
         break;
      default:
         fi.polar.polarflow.util.d.e("OnDemandHrComplicationProvider", "Unexpected complication type: " + var2);
         var6 = null;
      }

      return var6;
   }

   public void b(int var1, int var2, c var3) {
      fi.polar.polarflow.util.d.c("OnDemandHrComplicationProvider", "onComplicationUpdate(complicationId=" + var1 + ", dataType=" + var2 + ")");
      ComplicationData var4 = this.a(var1, var2);
      if (var4 != null) {
         var3.a(var1, var4);
      }

   }

   public void onCreate() {
      super.onCreate();
      this.a = new f();
   }
}
