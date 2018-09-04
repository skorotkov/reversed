package fi.polar.polarflow.ui.a_package;

import android.content.Intent;
import java.util.Collection;

final class u extends ac {
   // $FF: synthetic field
   final s a;

   private u(s var1) {
      super(var1);
      this.a = var1;
   }

   // $FF: synthetic method
   u(s var1, t var2) {
      this(var1);
   }

   private void b(Intent var1) {
      if (var1 != null && s.a(this.a) == var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1)) {
         this.a.b(var1.getFloatExtra(s.b(this.a).h, s.b(this.a).j));
      }

   }

   public void a() {
      this.b(this.a.a((String)s.b(this.a).d));
   }

   public void a(Intent var1) {
      if (var1 != null && s.b(this.a).d.equals(var1.getAction())) {
         this.b(var1);
      }

   }

   public void a(Collection var1) {
      this.b(s.b(var1, s.b(this.a).d));
   }
}
