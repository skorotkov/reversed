package fi.polar.polarflow.ui.myday.sleep.a_package;

import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.util.ab;
import java.util.concurrent.TimeUnit;
import org.joda.time.Period;

public class k extends i {
   private final int a;

   public k(int var1) {
      this.a = var1;
   }

   public int a() {
      return 2130968778;
   }

   public void a(View var1) {
      super.a(var1);
      Period var2 = new Period(ab.a(TimeUnit.SECONDS.toMillis((long)this.a)));
      ((TextView)var1.findViewById(2131755423)).setText(String.valueOf(var2.getHours()));
      ((TextView)var1.findViewById(2131755425)).setText(String.valueOf(var2.getMinutes()));
   }
}
