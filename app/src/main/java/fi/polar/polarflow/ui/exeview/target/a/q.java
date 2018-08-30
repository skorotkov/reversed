package fi.polar.polarflow.ui.exeview.target.a;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.ui.exeview.a.a.br;
import fi.polar.polarflow.ui.exeview.target.TargetCircularProgressBar;
import java.util.Collection;

public class q extends br {
   protected TargetCircularProgressBar a;
   protected fi.polar.polarflow.ui.exeview.target.m c = new fi.polar.polarflow.ui.exeview.target.m();
   private int d;

   public q() {
      super(1000);
   }

   private void e() {
      int var1 = this.c.a(this.Q);
      if (var1 >= 100 && this.d < 100) {
         this.c.a();
      }

      if (this.d != var1) {
         this.d = var1;
         this.a.setProgress(var1);
      }

   }

   public int a() {
      return 2130968693;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      this.d = -1;
      this.a = (TargetCircularProgressBar)var1.findViewById(2131755355);
      this.a.setGlyphByVolumeTarget(this.c.b(this.Q));
      this.e();
      if (this.Q.isRunning() && !this.Q.isPaused()) {
         this.f();
      }

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
