package fi.polar.polarflow.ui.myday.sleep.a_package;

import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.util.ab;
import org.joda.time.DateTime;

public class j extends i {
   private final long a;
   private final long c;

   public j(DateTime var1, DateTime var2) {
      this.a = ab.b(var1).getMillis();
      this.c = ab.b(var2).getMillis();
   }

   public int a() {
      return 2130968777;
   }

   public void a(View var1) {
      super.a(var1);
      TextView var2 = (TextView)var1.findViewById(2131755511);
      TextView var3 = (TextView)var1.findViewById(2131755512);
      TextView var4 = (TextView)var1.findViewById(2131755514);
      TextView var5 = (TextView)var1.findViewById(2131755515);
      if (DateFormat.is24HourFormat(var1.getContext())) {
         var2.setText(DateFormat.format("HH:mm", this.a));
         var3.setText((CharSequence)null);
         var4.setText(DateFormat.format("HH:mm", this.c));
         var5.setText((CharSequence)null);
      } else {
         var2.setText(DateFormat.format("h:mm", this.a));
         var3.setText(DateFormat.format("a", this.a));
         var4.setText(DateFormat.format("h:mm", this.c));
         var5.setText(DateFormat.format("a", this.c));
      }

   }
}
