package android.support.wearable.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

@Deprecated
@SuppressLint({"ClickableViewAccessibility"})
@TargetApi(21)
public class l extends View {
   private static final double a = Math.sqrt(2.0D);
   private int b;
   private final ShapeDrawable c;
   private RippleDrawable d;
   private final Interpolator e;
   private ColorStateList f;
   private Drawable g;
   private int h;
   private int i;

   public l(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public l(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public l(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public l(Context var1, AttributeSet var2, int var3, int var4) {
      byte var5 = 0;
      super(var1, var2, var3, var4);
      this.b = -1;
      this.c = new ShapeDrawable(new OvalShape());
      this.c.getPaint().setColor(-3355444);
      super.setBackgroundDrawable(this.c);
      this.setOutlineProvider(new n(this, (m)null));
      this.e = new AccelerateInterpolator(2.0F);
      this.i = 0;
      boolean var6 = true;
      TypedArray var8 = var1.obtainStyledAttributes(var2, android.support.wearable.h.CircularButton, var3, var4);

      boolean var7;
      for(var3 = var5; var3 < var8.getIndexCount(); var6 = var7) {
         var4 = var8.getIndex(var3);
         if (var4 == android.support.wearable.h.CircularButton_android_color) {
            this.f = var8.getColorStateList(var4);
            this.c.getPaint().setColor(this.f.getDefaultColor());
            var7 = var6;
         } else if (var4 == android.support.wearable.h.CircularButton_android_src) {
            this.g = var8.getDrawable(var4);
            var7 = var6;
         } else if (var4 == android.support.wearable.h.CircularButton_buttonRippleColor) {
            this.setRippleColor(var8.getColor(var4, -1));
            var7 = var6;
         } else if (var4 == android.support.wearable.h.CircularButton_pressedButtonTranslationZ) {
            this.setPressedTranslationZ(var8.getDimension(var4, 0.0F));
            var7 = var6;
         } else if (var4 == android.support.wearable.h.CircularButton_imageScaleMode) {
            this.i = var8.getInt(var4, this.i);
            var7 = var6;
         } else {
            var7 = var6;
            if (var4 == android.support.wearable.h.CircularButton_android_clickable) {
               var7 = var8.getBoolean(android.support.wearable.h.CircularButton_android_clickable, var6);
            }
         }

         ++var3;
      }

      var8.recycle();
      this.setClickable(var6);
   }

   private int a(float var1) {
      return (int)Math.ceil((double)TypedValue.applyDimension(1, var1, this.getResources().getDisplayMetrics()));
   }

   private static int a(int var0) {
      return (int)Math.floor((double)var0 * a);
   }

   // $FF: synthetic method
   static int a(l var0) {
      return var0.h;
   }

   private Animator a(Animator var1) {
      var1.setInterpolator(this.e);
      return var1;
   }

   private static boolean a(Drawable var0) {
      boolean var1;
      if (var0 != null && var0.getIntrinsicHeight() > 0 && var0.getIntrinsicWidth() > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static int b(int var0) {
      return (int)Math.floor((double)var0 / a);
   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      if (this.f != null && this.f.isStateful()) {
         this.c.getPaint().setColor(this.f.getColorForState(this.getDrawableState(), this.f.getDefaultColor()));
         this.c.invalidateSelf();
      }

   }

   public Drawable getImageDrawable() {
      return this.g;
   }

   public int getImageScaleMode() {
      return this.i;
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.g != null) {
         this.g.draw(var1);
      }

   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (this.g != null) {
         int var6 = this.g.getIntrinsicWidth();
         int var7 = this.g.getIntrinsicHeight();
         if (this.i != 0 && a(this.g)) {
            var2 = (int)((float)(var4 - var2 - var6) / 2.0F);
            var3 = (int)((float)(var5 - var3 - var7) / 2.0F);
            this.g.setBounds(var2, var3, var6 + var2, var7 + var3);
         } else {
            var3 = a(this.h / 2);
            var2 = (this.h - var3) / 2;
            if (!a(this.g)) {
               this.g.setBounds(var2, var2, var2 + var3, var3 + var2);
            } else {
               if (var6 == var7) {
                  var4 = var2;
                  var5 = var3;
                  var7 = var3;
               } else {
                  float var8 = (float)var6 / (float)var7;
                  if (var6 > var7) {
                     var7 = (int)((float)var3 / var8);
                     var4 = (int)((float)(var3 - var7) / 2.0F);
                     var5 = var3;
                  } else {
                     var5 = (int)(var8 * (float)var3);
                     var7 = (int)((float)(var3 - var5) / 2.0F);
                     var4 = var2;
                     var2 = var7;
                     var7 = var3;
                  }
               }

               this.g.setBounds(var2, var4, var5 + var2, var7 + var4);
            }
         }
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var3 = MeasureSpec.getMode(var1);
      var1 = MeasureSpec.getSize(var1);
      int var4 = MeasureSpec.getMode(var2);
      int var5 = MeasureSpec.getSize(var2);
      if (var3 == 1073741824 && var4 == 1073741824) {
         this.h = Math.min(var1, var5);
      } else if (var3 == 1073741824) {
         this.h = var1;
      } else if (var4 == 1073741824) {
         this.h = var5;
      } else {
         if (a(this.g)) {
            var2 = Math.max(this.g.getIntrinsicHeight(), this.g.getIntrinsicWidth());
         } else {
            var2 = this.a(48.0F);
         }

         if (var3 != Integer.MIN_VALUE && var4 != Integer.MIN_VALUE) {
            this.h = var2;
         } else {
            if (var3 != Integer.MIN_VALUE) {
               var1 = var5;
            } else if (var4 == Integer.MIN_VALUE) {
               var1 = Math.min(var1, var5);
            }

            this.h = Math.min(var1, b(var2) * 2);
         }
      }

      this.setMeasuredDimension(this.h, this.h);
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2 = super.onTouchEvent(var1);
      if (var2) {
         switch(var1.getAction() & 255) {
         case 0:
            this.getBackground().setHotspot(var1.getX(), var1.getY());
         }
      }

      return var2;
   }

   public void setBackgroundDrawable(Drawable var1) {
   }

   public void setColor(int var1) {
      this.f = ColorStateList.valueOf(var1);
      this.c.getPaint().setColor(this.f.getDefaultColor());
   }

   public void setColor(ColorStateList var1) {
      this.f = var1;
      this.c.getPaint().setColor(this.f.getDefaultColor());
   }

   public void setImageDrawable(Drawable var1) {
      if (this.g != null) {
         this.g.setCallback((Callback)null);
      }

      if (this.g != var1) {
         this.g = var1;
         this.requestLayout();
         this.invalidate();
      }

      if (this.g != null) {
         this.g.setCallback(this);
      }

   }

   public void setImageResource(int var1) {
      this.setImageDrawable(this.getResources().getDrawable(var1, (Theme)null));
   }

   public void setImageScaleMode(int var1) {
      this.i = var1;
      if (this.g != null) {
         this.invalidate();
         this.requestLayout();
      }

   }

   public void setPressedTranslationZ(float var1) {
      StateListAnimator var2 = new StateListAnimator();
      var2.addState(PRESSED_ENABLED_STATE_SET, this.a((Animator)ObjectAnimator.ofFloat(this, "translationZ", new float[]{var1})));
      var2.addState(ENABLED_FOCUSED_STATE_SET, this.a((Animator)ObjectAnimator.ofFloat(this, "translationZ", new float[]{var1})));
      var2.addState(EMPTY_STATE_SET, this.a((Animator)ObjectAnimator.ofFloat(this, "translationZ", new float[]{this.getElevation()})));
      this.setStateListAnimator(var2);
   }

   public void setRippleColor(int var1) {
      this.b = var1;
      if (this.d != null) {
         this.d.setColor(ColorStateList.valueOf(var1));
      } else if (this.b != -1 && !this.isInEditMode()) {
         this.d = new RippleDrawable(ColorStateList.valueOf(var1), this.c, this.c);
         super.setBackgroundDrawable(this.d);
      } else {
         this.d = null;
         super.setBackgroundDrawable(this.c);
      }

   }

   protected boolean verifyDrawable(Drawable var1) {
      boolean var2;
      if (this.g != var1 && !super.verifyDrawable(var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }
}
