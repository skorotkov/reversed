package android.support.wearable.view;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

@Deprecated
@TargetApi(20)
class at extends Drawable implements Callback {
   private Drawable a;
   private int b;
   private boolean c;
   private int d;
   private Mode e;
   private ColorFilter f;
   private boolean g;
   private int h;
   private int i;
   private int j;
   private float k;
   private float l;
   private int m;
   private int n;
   private final Rect o;
   private float p;
   private int q;
   private int r;
   private float s;
   private float t;

   public at() {
      this((Drawable)null);
   }

   public at(Drawable var1) {
      this.b = 255;
      this.c = true;
      this.g = true;
      this.i = 2;
      this.j = 2;
      this.k = 1.0F;
      this.l = 1.0F;
      this.o = new Rect();
      this.p = 1.0F;
      this.a(var1);
   }

   private static float a(float var0, int var1, int var2) {
      float var3;
      if (var0 < (float)var1) {
         var3 = (float)var1;
      } else {
         var3 = var0;
         if (var0 > (float)var2) {
            var3 = (float)var2;
         }
      }

      return var3;
   }

   private void a() {
      if (this.a != null && this.o.width() != 0 && this.o.height() != 0) {
         this.q = this.a.getIntrinsicWidth();
         this.r = this.a.getIntrinsicHeight();
         if (this.q != -1 && this.r != -1) {
            this.s = (float)this.o.width() * 0.2F;
            this.t = (float)this.o.height() * 0.2F;
            float var1 = (float)this.o.width() + (float)this.i * this.s;
            float var2 = (float)this.o.height() + (float)this.j * this.t;
            this.p = Math.max(var1 / (float)this.q, var2 / (float)this.r);
            float var3 = (float)this.q * this.p;
            float var4 = (float)this.r;
            float var5 = this.p;
            if (var3 > var1) {
               this.m = (int)((var3 - var1) / 2.0F);
               this.n = 0;
            } else {
               this.n = (int)((var4 * var5 - var2) / 2.0F);
               this.m = 0;
            }
         } else {
            this.q = this.o.width();
            this.r = this.o.height();
            this.p = 1.0F;
            this.s = 0.0F;
            this.t = 0.0F;
            this.m = 0;
            this.n = 0;
         }
      }

   }

   private void a(Rect var1) {
      if (this.a != null) {
         int var2 = this.a.getIntrinsicWidth();
         int var3 = this.a.getIntrinsicHeight();
         if (var2 != -1 && var3 != -1) {
            this.a.setBounds(var1.left, var1.top, var2 + var1.left, var3 + var1.top);
         } else {
            this.a.setBounds(var1);
         }
      }

   }

   public void a(float var1, float var2) {
      if (this.k != var1 || this.l != var2) {
         this.k = a(var1, 0, this.i);
         this.l = a(var2, 0, this.j);
         this.invalidateSelf();
      }

   }

   public void a(int var1, int var2) {
      var1 = Math.max(0, var1 - 1);
      var2 = Math.max(0, var2 - 1);
      if (var1 != this.i || var2 != this.j) {
         this.i = var1;
         this.j = var2;
         this.k = a(this.k, 0, this.i);
         this.l = a(this.l, 0, this.j);
         this.a();
         this.invalidateSelf();
      }

   }

   public void a(Drawable var1) {
      if (this.a != var1) {
         if (this.a != null) {
            this.a.setCallback((Callback)null);
         }

         this.a = var1;
         if (this.a != null) {
            this.a.setAlpha(this.getAlpha());
            this.a(this.getBounds());
            this.a.setCallback(this);
            if (this.f != null) {
               this.a.setColorFilter(this.f);
            }

            if (this.e != null) {
               this.a.setColorFilter(this.d, this.e);
            }

            this.a.setDither(this.c);
            this.a.setFilterBitmap(this.g);
            this.a.setState(this.getState());
            this.a();
            this.invalidateSelf();
         }
      }

   }

   public void clearColorFilter() {
      if (this.e != null) {
         this.e = null;
         if (this.a != null) {
            this.a.clearColorFilter();
         }
      }

   }

   public void draw(Canvas var1) {
      if (this.a != null) {
         var1.save();
         var1.clipRect(this.getBounds());
         float var2 = (float)this.m;
         float var3 = this.k;
         float var4 = this.s;
         float var5 = (float)this.n;
         float var6 = this.l;
         float var7 = this.t;
         var1.translate(-(var2 + var3 * var4), -(var5 + var6 * var7));
         var1.scale(this.p, this.p);
         this.a.draw(var1);
         var1.restore();
      }

   }

   public int getAlpha() {
      return this.b;
   }

   public int getChangingConfigurations() {
      return this.h;
   }

   public int getOpacity() {
      int var1;
      if (this.a != null) {
         var1 = this.a.getOpacity();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public void invalidateDrawable(Drawable var1) {
      if (var1 == this.a && this.getCallback() != null) {
         this.getCallback().invalidateDrawable(this);
      }

   }

   public boolean isStateful() {
      boolean var1;
      if (this.a != null) {
         var1 = this.a.isStateful();
      } else {
         var1 = false;
      }

      return var1;
   }

   public void jumpToCurrentState() {
      if (this.a != null) {
         this.a.jumpToCurrentState();
      }

   }

   protected void onBoundsChange(Rect var1) {
      this.o.set(var1);
      this.a(var1);
      this.a();
      this.invalidateSelf();
   }

   protected boolean onLevelChange(int var1) {
      boolean var2;
      if (this.a != null) {
         var2 = this.a.setLevel(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   protected boolean onStateChange(int[] var1) {
      boolean var2;
      if (this.a != null) {
         var2 = this.a.setState(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
      if (var1 == this.a && this.getCallback() != null) {
         this.getCallback().scheduleDrawable(this, var2, var3);
      }

   }

   public void setAlpha(int var1) {
      if (this.b != var1) {
         this.b = var1;
         if (this.a != null) {
            this.a.setAlpha(var1);
         }
      }

   }

   public void setChangingConfigurations(int var1) {
      if (this.h != var1) {
         this.h = var1;
         if (this.a != null) {
            this.a.setChangingConfigurations(var1);
         }
      }

   }

   public void setColorFilter(int var1, Mode var2) {
      if (this.d != var1 || this.e != var2) {
         this.d = var1;
         this.e = var2;
         if (this.a != null) {
            this.a.setColorFilter(var1, var2);
         }
      }

   }

   public void setColorFilter(ColorFilter var1) {
      if (this.f != var1) {
         this.f = var1;
         if (this.a != null) {
            this.a.setColorFilter(var1);
         }
      }

   }

   public void setDither(boolean var1) {
      if (this.c != var1) {
         this.c = var1;
         if (this.a != null) {
            this.a.setDither(var1);
         }
      }

   }

   public void setFilterBitmap(boolean var1) {
      if (this.g != var1) {
         this.g = var1;
         if (this.a != null) {
            this.a.setFilterBitmap(var1);
         }
      }

   }

   public void unscheduleDrawable(Drawable var1, Runnable var2) {
      if (var1 == this.a && this.getCallback() != null) {
         this.getCallback().unscheduleDrawable(this, var2);
      }

   }
}
