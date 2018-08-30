package fi.polar.polarflow.ui.exeview;

class u implements android.support.wearable.view.aj {
   // $FF: synthetic field
   final ExeViewActivity a;

   private u(ExeViewActivity var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   u(ExeViewActivity var1, k var2) {
      this(var1);
   }

   public void a(int var1) {
      ExeViewActivity var2 = this.a;
      boolean var3;
      if (var1 != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      ExeViewActivity.d(var2, var3);
      if (ExeViewActivity.a(this.a)) {
         if (ExeViewActivity.s(this.a)) {
            if (ExeViewActivity.o(this.a) != null) {
               ExeViewActivity.o(this.a).animate().cancel();
            }
         } else if (ExeViewActivity.l(this.a) == 1) {
            ExeViewActivity.v(this.a);
         } else {
            ExeViewActivity.p(this.a).setVisibility(8);
         }
      }

   }

   public void a(int var1, int var2) {
      if (ExeViewActivity.b(this.a).d() != null && !ExeViewActivity.b(this.a).d().g()) {
         ExeViewActivity.t(this.a).setShaderAccessLimit(20.0F);
      } else {
         ExeViewActivity.t(this.a).setShaderAccessLimit(61.0F);
      }

      ExeViewActivity.u(this.a);
      if (ExeViewActivity.a(this.a) && ExeViewActivity.o(this.a) != null) {
         ExeViewActivity.o(this.a).animate().cancel();
         if (var2 == 0) {
            ExeViewActivity.a(this.a, 60.0F);
            ExeViewActivity.o(this.a).animate().x(ExeViewActivity.n(this.a)).setStartDelay(0L).withEndAction(new v(this)).start();
         } else {
            ExeViewActivity.a(this.a, 148.0F);
            ExeViewActivity.p(this.a).setVisibility(0);
            ExeViewActivity.p(this.a).setX(-95.0F);
         }
      }

      ExeViewActivity.a(this.a, var2);
   }

   public void a(int var1, int var2, float var3, float var4, int var5, int var6) {
      if (ExeViewActivity.a(this.a) && ExeViewActivity.o(this.a) != null && ExeViewActivity.s(this.a)) {
         if (ExeViewActivity.n(this.a) == 148.0F) {
            if (var2 == 0) {
               var3 = ExeViewActivity.n(this.a) - (240.0F - (float)var6) / 1.75F;
            } else {
               var3 = ExeViewActivity.n(this.a) + (float)var6 / 1.25F;
            }

            ExeViewActivity.o(this.a).setX(var3);
         } else if (var6 >= 0 && (float)var6 <= 240.0F) {
            ExeViewActivity.o(this.a).setX(ExeViewActivity.n(this.a) + (float)var6 / 2.0F);
         }
      }

   }
}
