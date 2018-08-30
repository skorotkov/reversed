package fi.polar.polarflow.service;

import android.content.ComponentName;
import android.content.Context;
import fi.polar.polarflow.service.provider.DailyActivityComplicationProvider;
import fi.polar.polarflow.service.provider.OnDemandHrComplicationProvider;
import fi.polar.polarflow.service.provider.TimeFormatProvider;

public class d {
   private final Context a;

   private d(Context var1) {
      this.a = var1;
   }

   public static d a(Context var0) {
      return new d(var0);
   }

   public void a(int var1, int... var2) {
      fi.polar.polarflow.util.d.c("ComplicationUpdateHelper", "updateComplications(type=" + var1 + ")");
      Context var3 = this.a.getApplicationContext();
      ComponentName var4;
      switch(var1) {
      case 0:
         var4 = new ComponentName(var3, DailyActivityComplicationProvider.class);
         break;
      case 1:
         var4 = new ComponentName(var3, OnDemandHrComplicationProvider.class);
         break;
      case 2:
         var4 = new ComponentName(var3, TimeFormatProvider.class);
         break;
      default:
         fi.polar.polarflow.util.d.b("ComplicationUpdateHelper", "Unknown complication type");
         var4 = null;
      }

      if (var4 != null) {
         if (var2.length > 0) {
            (new android.support.wearable.complications.r(var3, var4)).a(var2);
         } else {
            (new android.support.wearable.complications.r(var3, var4)).a();
         }
      }

   }
}
