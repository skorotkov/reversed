package fi.polar.polarflow.service.provider;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.b;
import android.support.wearable.complications.c;
import android.support.wearable.complications.d;
import fi.polar.polarflow.data.orm.DailySummary;
import fi.polar.polarflow.util.f;
import fi.polar.polarflow.util.u;
import fi.polar.polarflow.util.v;

public class DailyActivityComplicationProvider extends d {
   private v a;
   private f b;

   private ComplicationData a() {
      return (new b(10)).a();
   }

   private ComplicationData a(int var1, int var2) {
      Intent var3 = this.a.a((BroadcastReceiver)null, (String)"DailyActivityService.action.DAILY_ACTIVITY_STATUS");
      DailySummary var6;
      if (var3 == null) {
         fi.polar.polarflow.util.d.c("DailyActivityComplicationProvider", "DailyActivityComplicationData requested but no summary found from broadcast");
         var6 = DailySummary.getDailySummary();
      } else {
         var6 = (DailySummary)var3.getParcelableExtra("DailyActivityService.extra.DAILY_SUMMARY");
      }

      ComplicationData var8;
      if (var6 == null) {
         fi.polar.polarflow.util.d.b("DailyActivityComplicationProvider", "DailyActivityComplicationData requested but cannot be provided");
         var8 = null;
      } else {
         Intent var4 = new Intent(this.getApplicationContext(), ComplicationActionReceiver.class);
         var4.setAction("fi.polar.polarflow.action.COMPLICATION_TAP");
         var4.putExtra("fi.polar.polarflow.extra.COMPLICATION_ID", 0);
         PendingIntent var7 = PendingIntent.getBroadcast(this.getApplicationContext(), var1, var4, 0);
         switch(var2) {
         case 5:
            float var5 = var6.getAchievedPercentage();
            var8 = (new b(5)).b(ComplicationText.a(this.getResources().getString(2131231060, new Object[]{(int)var5}))).a(var5).b(0.0F).c(100.0F).a(var7).a(Icon.createWithBitmap(this.b.a(this.getApplicationContext(), 2131231116, this.getApplicationContext().getResources().getDimension(2131362303), -1))).a();
            break;
         default:
            fi.polar.polarflow.util.d.e("DailyActivityComplicationProvider", "Unexpected complication type: " + var2);
            var8 = null;
         }
      }

      return var8;
   }

   public void b(int var1, int var2, c var3) {
      fi.polar.polarflow.util.d.c("DailyActivityComplicationProvider", "onComplicationUpdate(id=" + var1 + ", dataType=" + var2 + ")");
      ComplicationData var4;
      if (!u.a().e()) {
         fi.polar.polarflow.util.d.c("DailyActivityComplicationProvider", "Not provisioned, empty data");
         var4 = this.a();
      } else {
         var4 = this.a(var1, var2);
      }

      if (var4 != null) {
         fi.polar.polarflow.util.d.c("DailyActivityComplicationProvider", "Update requested");
         var3.a(var1, var4);
      } else {
         fi.polar.polarflow.util.d.e("DailyActivityComplicationProvider", "No complication data could be generated");
         var3.a(var1);
      }

   }

   public void onCreate() {
      super.onCreate();
      this.a = v.a();
      this.b = new f();
   }
}
