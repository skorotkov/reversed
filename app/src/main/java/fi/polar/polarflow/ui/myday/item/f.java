package fi.polar.polarflow.ui.myday.item;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import fi.polar.polarflow.ui.myday.StopSleepActivity;
import fi.polar.polarflow.ui.myday.u;

public class f extends c {
   private Context c;
   private long d;

   public f() {
      super(Long.MAX_VALUE, 0, false);
   }

   public int a() {
      return 2130968727;
   }

   public void a(View var1) {
      super.a(var1);
      this.c = var1.getContext();
   }

   public void i() {
      long var1 = SystemClock.elapsedRealtime();
      if (this.d <= 0L || var1 - this.d >= 1000L) {
         Intent var3 = new Intent(this.c, StopSleepActivity.class);
         u.a(this.c, var3, 3);
         this.d = var1;
      }

   }
}
