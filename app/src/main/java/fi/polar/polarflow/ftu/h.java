package fi.polar.polarflow.ftu;

import android.widget.GridLayout;
import java.util.List;
import java.util.Random;

class h implements Runnable {
   // $FF: synthetic field
   final GridLayout a;
   // $FF: synthetic field
   final List b;
   // $FF: synthetic field
   final Random c;
   // $FF: synthetic field
   final int d;
   // $FF: synthetic field
   final int e;
   // $FF: synthetic field
   final GridAnimationLayout f;

   h(GridAnimationLayout var1, GridLayout var2, List var3, Random var4, int var5, int var6) {
      this.f = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   public void run() {
      if (!GridAnimationLayout.a(this.f)) {
         GridAnimationLayout.a(this.f, true);
         GridAnimationLayout.a(this.a, this.b);
      }

      int var1 = this.c.nextInt(17);

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = GridAnimationLayout.a(this.c, this.d * this.e);
         if (!GridAnimationLayout.a(this.f, var3)) {
            GridAnimationLayout.a(this.f, var3, true);
            GridAnimationLayout.a(this.f, this.b, this.c, var3);
         }
      }

      GridAnimationLayout.b(this.f).postDelayed(this, 1000L);
   }
}
