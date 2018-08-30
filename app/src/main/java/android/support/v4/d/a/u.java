package android.support.v4.d.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;

@TargetApi(21)
class u extends s {
   u(Drawable var1) {
      super(var1);
   }

   u(o var1, Resources var2) {
      super(var1, var2);
   }

   o b() {
      return new v(this.b, (Resources)null);
   }

   protected boolean c() {
      boolean var1 = false;
      boolean var2 = var1;
      if (VERSION.SDK_INT == 21) {
         Drawable var3 = this.c;
         if (!(var3 instanceof GradientDrawable) && !(var3 instanceof DrawableContainer)) {
            var2 = var1;
            if (!(var3 instanceof InsetDrawable)) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public Rect getDirtyBounds() {
      return this.c.getDirtyBounds();
   }

   public void getOutline(Outline var1) {
      this.c.getOutline(var1);
   }

   public void setHotspot(float var1, float var2) {
      this.c.setHotspot(var1, var2);
   }

   public void setHotspotBounds(int var1, int var2, int var3, int var4) {
      this.c.setHotspotBounds(var1, var2, var3, var4);
   }

   public boolean setState(int[] var1) {
      boolean var2;
      if (super.setState(var1)) {
         this.invalidateSelf();
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void setTint(int var1) {
      if (this.c()) {
         super.setTint(var1);
      } else {
         this.c.setTint(var1);
      }

   }

   public void setTintList(ColorStateList var1) {
      if (this.c()) {
         super.setTintList(var1);
      } else {
         this.c.setTintList(var1);
      }

   }

   public void setTintMode(Mode var1) {
      if (this.c()) {
         super.setTintMode(var1);
      } else {
         this.c.setTintMode(var1);
      }

   }
}
