package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

public class ai extends Animation {
   private final Context a;
   private final float b;
   private final float c;
   private final TextView d;
   private final String e;
   private final int f;
   private Camera g;
   private aj h;
   private final float[] i = new float[]{0.25F, 0.33F, 0.42F, 0.83F, 0.92F};

   public ai(Context var1, TextView var2, int var3, int var4) {
      this.a = var1;
      this.d = var2;
      this.b = (float)(var2.getWidth() / 2);
      this.c = (float)(var2.getHeight() / 2);
      this.h = aj.a;
      this.e = String.valueOf(var3);
      if (var4 == 0) {
         this.f = 2131230861;
      } else {
         this.f = 2131230943;
      }

   }

   private float a(float var1, float var2, float var3, float var4, float var5) {
      return (var1 - var2) / (var3 - var2) * (var5 - var4) + var4;
   }

   private void a(float var1, float var2, float var3, Transformation var4) {
      this.a((var2 - var1) * var3 + var1, var4);
   }

   private void a(float var1, Transformation var2) {
      Matrix var3 = var2.getMatrix();
      this.g.save();
      this.g.rotateY(var1);
      this.g.getMatrix(var3);
      this.g.restore();
      var3.preTranslate(-this.b, -this.c);
      var3.postTranslate(this.b, this.c);
   }

   protected void applyTransformation(float var1, Transformation var2) {
      if (this.h == aj.a && var1 >= this.i[0]) {
         this.h = aj.b;
      }

      if (this.h == aj.b) {
         if (var1 >= this.i[1]) {
            this.d.setText(this.f);
            this.d.setTextScaleX(-1.0F);
            this.d.setTextSize(0, (float)this.a.getResources().getDimensionPixelSize(2131361978));
            this.h = aj.c;
         } else {
            this.a(0.0F, 360.0F, this.a(var1, this.i[0], this.i[1], 0.0F, 0.25F), var2);
         }
      }

      if (this.h == aj.c) {
         if (var1 >= this.i[2]) {
            this.h = aj.d;
         } else {
            this.a(0.0F, 360.0F, this.a(var1, this.i[1], this.i[2], 0.25F, 0.5F), var2);
         }
      }

      if (this.h == aj.d) {
         if (var1 >= this.i[3]) {
            this.h = aj.e;
         }

         this.a(180.0F, var2);
      }

      if (this.h == aj.e) {
         if (var1 >= this.i[4]) {
            this.d.setText(this.e);
            this.d.setTextScaleX(1.0F);
            this.d.setTextSize(0, (float)this.a.getResources().getDimensionPixelSize(2131361979));
            this.h = aj.f;
         } else {
            this.a(0.0F, 360.0F, this.a(var1, this.i[3], this.i[4], 0.5F, 0.75F), var2);
         }
      }

      if (this.h == aj.f) {
         this.a(0.0F, 360.0F, this.a(var1, this.i[4], 1.0F, 0.75F, 1.0F), var2);
      }

   }

   public void initialize(int var1, int var2, int var3, int var4) {
      super.initialize(var1, var2, var3, var4);
      this.g = new Camera();
   }
}
