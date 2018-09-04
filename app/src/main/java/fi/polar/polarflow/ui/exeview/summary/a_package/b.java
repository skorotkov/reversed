package fi.polar.polarflow.ui.exeview.summary.a_package;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.Collection;

public class b extends ah {
   protected TextView a;

   private void a(int var1, int var2) {
      if (var1 > 0) {
         this.a.setText(fi.polar.polarflow.ui.o.e(this.a.getContext(), var2));
      }

   }

   private void b(Intent var1) {
      if (var1 != null && "DailyActivityService.action.TRAINING_LOAD_DATA".equals(var1.getAction())) {
         this.a(var1.getIntExtra("DailyActivityService.extra.TOTAL_CALORIES", -1), var1.getIntExtra("DailyActivityService.extra.FAT_CONSUMPTION", -1));
      }

   }

   public int a() {
      return 2130968663;
   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      this.a = (TextView)var1.findViewById(2131755282);
      if (this.P != null) {
         this.a(this.P.getInt(u, -1), this.P.getInt(F, -1));
      }

   }

   public void a(Collection var1) {
      this.b(e(var1, "DailyActivityService.action.TRAINING_LOAD_DATA"));
   }

   public void d() {
      if (this.P == null) {
         this.b(this.a((String)"DailyActivityService.action.TRAINING_LOAD_DATA"));
      }

   }
}
