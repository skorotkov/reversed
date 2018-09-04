package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.os.SystemClock;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class bp extends br {
   protected TextView a;
   protected TextView c;

   public bp() {
      super(60000);
   }

   private void e() {
      Date var1 = Calendar.getInstance().getTime();
      if (DateFormat.is24HourFormat(this.c.getContext())) {
         this.c.setText(DateFormat.format("HH:mm", var1));
         this.a.setText((CharSequence)null);
      } else {
         this.c.setText(DateFormat.format("h:mm", var1));
         this.a.setText(DateFormat.format("a", var1));
      }

   }

   public int a() {
      int var1;
      switch(bq.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968699;
         break;
      case 2:
         var1 = 2130968698;
         break;
      case 3:
         var1 = 2130968697;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      this.a = (TextView)var1.findViewById(2131755376);
      this.c = (TextView)var1.findViewById(2131755377);
      this.e();
      this.e(SystemClock.uptimeMillis() + (60000L - System.currentTimeMillis() % 60000L));
   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }

   public void g() {
      this.e();
   }
}
