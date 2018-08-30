package android.support.percent;

import android.support.v4.view.at;
import android.support.v4.view.bz;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class b {
   public float a = -1.0F;
   public float b = -1.0F;
   public float c = -1.0F;
   public float d = -1.0F;
   public float e = -1.0F;
   public float f = -1.0F;
   public float g = -1.0F;
   public float h = -1.0F;
   public float i;
   final d j = new d(0, 0);

   public void a(View var1, MarginLayoutParams var2, int var3, int var4) {
      boolean var5 = true;
      this.a(var2, var3, var4);
      this.j.leftMargin = var2.leftMargin;
      this.j.topMargin = var2.topMargin;
      this.j.rightMargin = var2.rightMargin;
      this.j.bottomMargin = var2.bottomMargin;
      at.a(this.j, at.a(var2));
      at.b(this.j, at.b(var2));
      if (this.c >= 0.0F) {
         var2.leftMargin = Math.round((float)var3 * this.c);
      }

      if (this.d >= 0.0F) {
         var2.topMargin = Math.round((float)var4 * this.d);
      }

      if (this.e >= 0.0F) {
         var2.rightMargin = Math.round((float)var3 * this.e);
      }

      if (this.f >= 0.0F) {
         var2.bottomMargin = Math.round((float)var4 * this.f);
      }

      boolean var6 = false;
      if (this.g >= 0.0F) {
         at.a(var2, Math.round((float)var3 * this.g));
         var6 = true;
      }

      if (this.h >= 0.0F) {
         at.b(var2, Math.round((float)var3 * this.h));
         var6 = var5;
      }

      if (var6 && var1 != null) {
         at.c(var2, bz.g(var1));
      }

   }

   public void a(LayoutParams var1) {
      if (!android.support.percent.d.a(this.j)) {
         var1.width = this.j.width;
      }

      if (!android.support.percent.d.b(this.j)) {
         var1.height = this.j.height;
      }

      android.support.percent.d.a(this.j, false);
      android.support.percent.d.b(this.j, false);
   }

   public void a(LayoutParams var1, int var2, int var3) {
      boolean var4 = false;
      this.j.width = var1.width;
      this.j.height = var1.height;
      boolean var5;
      if ((android.support.percent.d.a(this.j) || this.j.width == 0) && this.a < 0.0F) {
         var5 = true;
      } else {
         var5 = false;
      }

      boolean var6;
      label36: {
         if (!android.support.percent.d.b(this.j)) {
            var6 = var4;
            if (this.j.height != 0) {
               break label36;
            }
         }

         var6 = var4;
         if (this.b < 0.0F) {
            var6 = true;
         }
      }

      if (this.a >= 0.0F) {
         var1.width = Math.round((float)var2 * this.a);
      }

      if (this.b >= 0.0F) {
         var1.height = Math.round((float)var3 * this.b);
      }

      if (this.i >= 0.0F) {
         if (var5) {
            var1.width = Math.round((float)var1.height * this.i);
            android.support.percent.d.a(this.j, true);
         }

         if (var6) {
            var1.height = Math.round((float)var1.width / this.i);
            android.support.percent.d.b(this.j, true);
         }
      }

   }

   public void a(MarginLayoutParams var1) {
      this.a((LayoutParams)var1);
      var1.leftMargin = this.j.leftMargin;
      var1.topMargin = this.j.topMargin;
      var1.rightMargin = this.j.rightMargin;
      var1.bottomMargin = this.j.bottomMargin;
      at.a(var1, at.a(this.j));
      at.b(var1, at.b(this.j));
   }

   public String toString() {
      return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
   }
}
