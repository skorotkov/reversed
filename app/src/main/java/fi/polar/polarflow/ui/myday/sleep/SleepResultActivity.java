package fi.polar.polarflow.ui.myday.sleep;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import fi.polar.polarflow.ui.NotificationReceiver;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.ui.myday.sleep.a.f;
import fi.polar.polarflow.ui.myday.sleep.a.g;
import fi.polar.polarflow.ui.myday.sleep.a.j;
import fi.polar.polarflow.ui.myday.sleep.a.k;
import java.util.ArrayList;
import java.util.List;

public class SleepResultActivity extends Activity {
   private List a() {
      ArrayList var1 = new ArrayList();
      fi.polar.polarflow.util.b.a var2 = (fi.polar.polarflow.util.b.a)this.getIntent().getParcelableExtra("SleepResultActivity.sleep_analysis");
      if (var2 != null) {
         var1.add(new k(var2.d));
         var1.add(new j(var2.a, var2.b));
         var1.add(new f(var2.i, var2.e));
         var1.add(new fi.polar.polarflow.ui.myday.sleep.a.c(var2.j, var2.k));
         var1.add(new fi.polar.polarflow.ui.myday.sleep.a.a(var2));
         var1.add(new fi.polar.polarflow.ui.myday.sleep.a.b(var2.e, var2.f));
         var1.add(new g(var2.h));
      }

      return var1;
   }

   private void b() {
      o.a((Context)this.getApplicationContext(), 30);
      this.setResult(-1, (new fi.polar.polarflow.ui.b()).a(true).a());
      this.finishAfterTransition();
      this.overridePendingTransition(0, 2131034140);
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968783);
      b var2 = new b(this, this.a());
      ((SleepWearableListView)this.findViewById(2131755173)).setAdapter(var2);
      NotificationReceiver.a(this.getApplicationContext(), 7);
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      boolean var4;
      if (var1 == 265) {
         var4 = var3;
         if (var2.getRepeatCount() == 0) {
            this.b();
            var4 = var3;
         }
      } else if (var1 == 263) {
         this.finishAfterTransition();
         this.overridePendingTransition(0, 2131034140);
         var4 = var3;
      } else {
         var4 = super.onKeyDown(var1, var2);
      }

      return var4;
   }
}
