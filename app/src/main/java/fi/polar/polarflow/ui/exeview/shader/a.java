package fi.polar.polarflow.ui.exeview.shader;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnTouchListener;

abstract class a extends n {
   protected View a;
   protected float b;
   protected boolean c = false;
   protected boolean d = false;
   private OnTouchListener e = new c(this);

   protected a(p var1) {
      super(var1);
   }

   protected void a(View var1) {
      if (this.a != null) {
         var1.setOnTouchListener(this.e);
      }

   }

   protected void b() {
      if (this.a != null) {
         this.c = true;
         this.a.animate().setStartDelay(0L).scaleX(this.b).scaleY(this.b).setDuration(500L).withEndAction(new b(this)).start();
      }

   }

   protected void c() {
      this.d = false;
      if (this.c && this.a != null) {
         this.a.animate().cancel();
      }

      this.c = false;
      this.d();
   }

   protected void d() {
      if (this.a != null) {
         this.a.setScaleX(0.0F);
         this.a.setScaleY(0.0F);
      }

   }

   protected boolean e() {
      return this.c;
   }

   protected void f() {
      this.c = false;
      if (!this.d) {
         this.d();
      }

   }

   public void onPause() {
      this.c();
      super.onPause();
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      this.b = (float)this.getContext().getResources().getDisplayMetrics().widthPixels;
      this.a = var1.findViewById(2131755150);
   }
}
