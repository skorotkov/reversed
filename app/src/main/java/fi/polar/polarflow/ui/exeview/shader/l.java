package fi.polar.polarflow.ui.exeview.shader;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class l implements OnTouchListener {
   // $FF: synthetic field
   final ShaderContainerView a;
   private final android.support.v4.view.t b;
   private float c;
   private float d;
   private float e;
   private float f;
   private int g;

   private l(ShaderContainerView var1) {
      this.a = var1;
      this.b = new android.support.v4.view.t(this.a.getContext(), new m(this, (k)null));
      this.c = 0.0F;
      this.d = 0.0F;
      this.e = 0.0F;
      this.f = 0.0F;
      this.g = 0;
   }

   // $FF: synthetic method
   l(ShaderContainerView var1, k var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(l var0) {
      return var0.g;
   }

   @SuppressLint({"ClickableViewAccessibility"})
   public boolean onTouch(View var1, MotionEvent var2) {
      this.b.a(var2);
      float var3 = var2.getRawY();
      float var4 = var2.getRawX();
      switch(var2.getAction() & 255) {
      case 0:
         this.a.animate().cancel();
         this.f = var3 - this.a.getY();
         this.c = var3;
         this.d = var4;
         break;
      case 1:
      case 3:
         if (ShaderContainerView.a(this.a) == -1.0F) {
            ShaderContainerView var5 = this.a;
            if (this.a.getY() + 120.0F > 0.0F) {
               var4 = 0.0F;
            } else {
               var4 = -240.0F;
            }

            ShaderContainerView.a(var5, var4);
         }

         ShaderContainerView.b(this.a, ShaderContainerView.a(this.a));
         this.f = 0.0F;
         ShaderContainerView.a(this.a, 0);
         this.g = 0;
         ShaderContainerView.a(this.a, -1.0F);
         break;
      case 2:
         if (this.f == 0.0F) {
            this.a.animate().cancel();
            this.f = var3 - this.a.getY();
            this.c = var3;
            this.d = var4;
         } else {
            if (Math.abs(this.c - var3) > Math.abs(this.d - var4)) {
               ShaderContainerView.a(this.a, 2);
            } else {
               ShaderContainerView.a(this.a, 1);
            }

            if (ShaderContainerView.b(this.a) == 2) {
               this.a.a();
               if (var3 - this.f < 0.0F) {
                  this.a.setY(var3 - this.f);
               }

               if (this.e > var3) {
                  this.g = 4;
               } else {
                  this.g = 8;
               }
            }
         }

         this.e = var3;
      }

      return false;
   }
}
