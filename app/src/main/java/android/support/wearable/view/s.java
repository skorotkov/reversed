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
public class s extends Drawable implements Callback {
   private Drawable a;
   private Drawable b;
   private float c;
   private int d;
   private int e;
   private ColorFilter f;
   private boolean g;
   private boolean h;
   private int i;
   private Mode j;

   private void c(Drawable var1) {
      var1.setCallback(this);
      var1.setState(this.getState());
      if (this.f != null) {
         var1.setColorFilter(this.f);
      }

      if (this.j != null) {
         var1.setColorFilter(this.i, this.j);
      }

      var1.setDither(this.h);
      var1.setFilterBitmap(this.g);
      var1.setBounds(this.getBounds());
   }

   public void a(float var1) {
      var1 = x.a(var1, 0, 1);
      if (var1 != this.c) {
         this.c = var1;
         this.invalidateSelf();
      }

   }

   public void a(Drawable var1) {
      if (this.a != var1) {
         if (this.a != null) {
            this.a.setCallback((Callback)null);
         }

         this.a = var1;
         if (var1 != null) {
            this.c(var1);
         }

         this.invalidateSelf();
      }

   }

   public void b(Drawable var1) {
      if (this.b != var1) {
         if (this.b != null) {
            this.b.setCallback((Callback)null);
         }

         this.b = var1;
         this.c(var1);
         this.invalidateSelf();
      }

   }

   public void clearColorFilter() {
      if (this.j != null) {
         this.j = null;
         if (this.a != null) {
            this.a.clearColorFilter();
         }

         if (this.b != null) {
            this.b.clearColorFilter();
         }
      }

   }

   public void draw(Canvas var1) {
      if (this.b != null && (this.c < 1.0F || this.a == null)) {
         this.b.setAlpha(255);
         this.b.draw(var1);
      }

      if (this.a != null && this.c > 0.0F) {
         this.a.setAlpha((int)(255.0F * this.c));
         this.a.draw(var1);
      }

   }

   public int getAlpha() {
      return this.d;
   }

   public int getChangingConfigurations() {
      return this.e;
   }

   public int getIntrinsicHeight() {
      int var1 = -1;
      int var2;
      if (this.a == null) {
         var2 = -1;
      } else {
         var2 = this.a.getIntrinsicHeight();
      }

      if (this.b != null) {
         var1 = this.b.getIntrinsicHeight();
      }

      return Math.max(var2, var1);
   }

   public int getIntrinsicWidth() {
      int var1 = -1;
      int var2;
      if (this.a == null) {
         var2 = -1;
      } else {
         var2 = this.a.getIntrinsicWidth();
      }

      if (this.b != null) {
         var1 = this.b.getIntrinsicHeight();
      }

      return Math.max(var2, var1);
   }

   public int getOpacity() {
      int var1 = 0;
      int var2;
      if (this.a == null) {
         var2 = 0;
      } else {
         var2 = this.a.getOpacity();
      }

      if (this.b != null) {
         var1 = this.b.getOpacity();
      }

      return resolveOpacity(var2, var1);
   }

   public void invalidateDrawable(Drawable var1) {
      if ((var1 == this.a || var1 == this.b) && this.getCallback() != null) {
         this.getCallback().invalidateDrawable(this);
      }

   }

   public boolean isStateful() {
      boolean var1;
      if ((this.a == null || !this.a.isStateful()) && (this.b == null || !this.b.isStateful())) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void jumpToCurrentState() {
      if (this.a != null) {
         this.a.jumpToCurrentState();
      }

      if (this.b != null) {
         this.b.jumpToCurrentState();
      }

   }

   protected void onBoundsChange(Rect var1) {
      if (this.b != null) {
         this.b.setBounds(var1);
      }

      if (this.a != null) {
         this.a.setBounds(var1);
      }

      this.invalidateSelf();
   }

   protected boolean onLevelChange(int var1) {
      boolean var2 = false;
      if (this.a != null) {
         var2 = false | this.a.setLevel(var1);
      }

      boolean var3 = var2;
      if (this.b != null) {
         var3 = var2 | this.b.setLevel(var1);
      }

      return var3;
   }

   protected boolean onStateChange(int[] var1) {
      boolean var2 = false;
      if (this.a != null) {
         var2 = false | this.a.setState(var1);
      }

      boolean var3 = var2;
      if (this.b != null) {
         var3 = var2 | this.b.setState(var1);
      }

      return var3;
   }

   public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
      if ((var1 == this.a || var1 == this.b) && this.getCallback() != null) {
         this.getCallback().scheduleDrawable(this, var2, var3);
      }

   }

   public void setAlpha(int var1) {
      if (var1 != this.d) {
         this.d = var1;
         this.invalidateSelf();
      }

   }

   public void setChangingConfigurations(int var1) {
      if (this.e != var1) {
         this.e = var1;
         if (this.a != null) {
            this.a.setChangingConfigurations(var1);
         }

         if (this.b != null) {
            this.b.setChangingConfigurations(var1);
         }
      }

   }

   public void setColorFilter(int var1, Mode var2) {
      if (this.i != var1 || this.j != var2) {
         this.i = var1;
         this.j = var2;
         if (this.a != null) {
            this.a.setColorFilter(var1, var2);
         }

         if (this.b != null) {
            this.b.setColorFilter(var1, var2);
         }
      }

   }

   public void setColorFilter(ColorFilter var1) {
      if (this.f != var1) {
         this.f = var1;
         if (this.a != null) {
            this.a.setColorFilter(var1);
         }

         if (this.b != null) {
            this.b.setColorFilter(var1);
         }
      }

   }

   public void setDither(boolean var1) {
      if (this.h != var1) {
         this.h = var1;
         if (this.a != null) {
            this.a.setDither(var1);
         }

         if (this.b != null) {
            this.b.setDither(var1);
         }
      }

   }

   public void setFilterBitmap(boolean var1) {
      if (this.g != var1) {
         this.g = var1;
         if (this.a != null) {
            this.a.setFilterBitmap(var1);
         }

         if (this.b != null) {
            this.b.setFilterBitmap(var1);
         }
      }

   }

   public void unscheduleDrawable(Drawable var1, Runnable var2) {
      if ((var1 == this.a || var1 == this.b) && this.getCallback() != null) {
         this.getCallback().unscheduleDrawable(this, var2);
      }

   }
}
