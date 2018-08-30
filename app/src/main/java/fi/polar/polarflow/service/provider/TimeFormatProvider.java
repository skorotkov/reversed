package fi.polar.polarflow.service.provider;

import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.b;
import android.support.wearable.complications.c;
import android.support.wearable.complications.d;
import android.support.wearable.complications.l;
import android.text.format.DateFormat;

public class TimeFormatProvider extends d {
   public void b(int var1, int var2, c var3) {
      fi.polar.polarflow.util.d.c("TimeFormatProvider", "onComplicationUpdate(complicationId=" + var1 + ", dataType=" + var2 + ")");
      l var4 = new l();
      String var5;
      if (DateFormat.is24HourFormat(this.getApplicationContext())) {
         var5 = "HH:mm";
      } else {
         var5 = "h:mm a";
      }

      l var6 = var4.a(var5).a(2);
      ComplicationData var7;
      switch(var2) {
      case 3:
         var7 = (new b(3)).b(var6.a()).a();
         break;
      case 4:
         var7 = (new b(4)).a(var6.a()).a();
         break;
      default:
         fi.polar.polarflow.util.d.e("TimeFormatProvider", "Unknown data type(dataType=" + var2 + ")");
         var7 = null;
      }

      if (var7 != null) {
         var3.a(var1, var7);
      }

   }
}
