package fi.polar.polarflow.ui.a_package;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.data.Lap;
import java.util.Collection;

public abstract class y extends s {
   private final v a;

   public y(v var1) {
      super(var1);
      this.a = var1;
   }

   private void c(Intent var1) {
      if (var1 != null && this.a.c.equals(var1.getAction())) {
         this.a(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1));
         Lap var3 = (Lap)var1.getParcelableExtra("ExerciseLapCalc.KEY_LAP");
         float var2;
         if (var3 != null) {
            var2 = this.a(var3);
         } else {
            var2 = this.a.j;
         }

         this.b(var2);
      }

   }

   public abstract float a(Lap var1);

   public void a(Intent var1) {
      this.c(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.a(0);
   }

   public void a(Collection var1) {
      this.c(e(var1, this.a.c));
   }

   public void d() {
      this.c(this.a((String)this.a.c));
   }
}
