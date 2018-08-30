package android.support.v4.d.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

@TargetApi(9)
class n extends Drawable implements Callback, m, w {
   static final Mode a;
   o b;
   Drawable c;
   private int d;
   private Mode e;
   private boolean f;
   private boolean g;

   static {
      a = Mode.SRC_IN;
   }

   n(Drawable var1) {
      this.b = this.b();
      this.a(var1);
   }

   n(o var1, Resources var2) {
      this.b = var1;
      this.a(var2);
   }

   private void a(Resources var1) {
      if (this.b != null && this.b.b != null) {
         this.a(this.a(this.b.b, var1));
      }

   }

   private boolean a(int[] var1) {
      boolean var2 = false;
      if (this.c()) {
         ColorStateList var3 = this.b.c;
         Mode var4 = this.b.d;
         if (var3 != null && var4 != null) {
            int var5 = var3.getColorForState(var1, var3.getDefaultColor());
            if (!this.f || var5 != this.d || var4 != this.e) {
               this.setColorFilter(var5, var4);
               this.d = var5;
               this.e = var4;
               this.f = true;
               var2 = true;
            }
         } else {
            this.f = false;
            this.clearColorFilter();
         }
      }

      return var2;
   }

   public final Drawable a() {
      return this.c;
   }

   protected Drawable a(ConstantState var1, Resources var2) {
      return var1.newDrawable(var2);
   }

   public final void a(Drawable var1) {
      if (this.c != null) {
         this.c.setCallback((Callback)null);
      }

      this.c = var1;
      if (var1 != null) {
         var1.setCallback(this);
         this.setVisible(var1.isVisible(), true);
         this.setState(var1.getState());
         this.setLevel(var1.getLevel());
         this.setBounds(var1.getBounds());
         if (this.b != null) {
            this.b.b = var1.getConstantState();
         }
      }

      this.invalidateSelf();
   }

   o b() {
      return new p(this.b, (Resources)null);
   }

   protected boolean c() {
      return true;
   }

   public void draw(Canvas var1) {
      this.c.draw(var1);
   }

   public int getChangingConfigurations() {
      int var1 = super.getChangingConfigurations();
      int var2;
      if (this.b != null) {
         var2 = this.b.getChangingConfigurations();
      } else {
         var2 = 0;
      }

      return var2 | var1 | this.c.getChangingConfigurations();
   }

   public ConstantState getConstantState() {
      o var1;
      if (this.b != null && this.b.a()) {
         this.b.a = this.getChangingConfigurations();
         var1 = this.b;
      } else {
         var1 = null;
      }

      return var1;
   }

   public Drawable getCurrent() {
      return this.c.getCurrent();
   }

   public int getIntrinsicHeight() {
      return this.c.getIntrinsicHeight();
   }

   public int getIntrinsicWidth() {
      return this.c.getIntrinsicWidth();
   }

   public int getMinimumHeight() {
      return this.c.getMinimumHeight();
   }

   public int getMinimumWidth() {
      return this.c.getMinimumWidth();
   }

   public int getOpacity() {
      return this.c.getOpacity();
   }

   public boolean getPadding(Rect var1) {
      return this.c.getPadding(var1);
   }

   public int[] getState() {
      return this.c.getState();
   }

   public Region getTransparentRegion() {
      return this.c.getTransparentRegion();
   }

   public void invalidateDrawable(Drawable var1) {
      this.invalidateSelf();
   }

   public boolean isStateful() {
      ColorStateList var1;
      if (this.c() && this.b != null) {
         var1 = this.b.c;
      } else {
         var1 = null;
      }

      boolean var2;
      if ((var1 == null || !var1.isStateful()) && !this.c.isStateful()) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public Drawable mutate() {
      if (!this.g && super.mutate() == this) {
         this.b = this.b();
         if (this.c != null) {
            this.c.mutate();
         }

         if (this.b != null) {
            o var1 = this.b;
            ConstantState var2;
            if (this.c != null) {
               var2 = this.c.getConstantState();
            } else {
               var2 = null;
            }

            var1.b = var2;
         }

         this.g = true;
      }

      return this;
   }

   protected void onBoundsChange(Rect var1) {
      if (this.c != null) {
         this.c.setBounds(var1);
      }

   }

   protected boolean onLevelChange(int var1) {
      return this.c.setLevel(var1);
   }

   public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
      this.scheduleSelf(var2, var3);
   }

   public void setAlpha(int var1) {
      this.c.setAlpha(var1);
   }

   public void setChangingConfigurations(int var1) {
      this.c.setChangingConfigurations(var1);
   }

   public void setColorFilter(ColorFilter var1) {
      this.c.setColorFilter(var1);
   }

   public void setDither(boolean var1) {
      this.c.setDither(var1);
   }

   public void setFilterBitmap(boolean var1) {
      this.c.setFilterBitmap(var1);
   }

   public boolean setState(int[] var1) {
      boolean var2 = this.c.setState(var1);
      if (!this.a(var1) && !var2) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public void setTint(int var1) {
      this.setTintList(ColorStateList.valueOf(var1));
   }

   public void setTintList(ColorStateList var1) {
      this.b.c = var1;
      this.a(this.getState());
   }

   public void setTintMode(Mode var1) {
      this.b.d = var1;
      this.a(this.getState());
   }

   public boolean setVisible(boolean var1, boolean var2) {
      if (!super.setVisible(var1, var2) && !this.c.setVisible(var1, var2)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void unscheduleDrawable(Drawable var1, Runnable var2) {
      this.unscheduleSelf(var2);
   }
}
