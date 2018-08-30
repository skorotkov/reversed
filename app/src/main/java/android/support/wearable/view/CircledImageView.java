package android.support.wearable.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.Objects;

@TargetApi(23)
public class CircledImageView extends View {
   private static final ArgbEvaluator c = new ArgbEvaluator();
   private Integer A;
   private Integer B;
   private final Callback C;
   private int D;
   private final AnimatorUpdateListener E;
   private ValueAnimator F;
   final RectF a;
   final Rect b;
   private final Paint d;
   private final k e;
   private ColorStateList f;
   private Drawable g;
   private float h;
   private float i;
   private float j;
   private float k;
   private float l;
   private int m;
   private Cap n;
   private float o;
   private boolean p;
   private final float q;
   private float r;
   private boolean s;
   private boolean t;
   private boolean u;
   private boolean v;
   private final ao w;
   private long x;
   private float y;
   private float z;

   public CircledImageView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public CircledImageView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public CircledImageView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.b = new Rect();
      this.p = false;
      this.r = 1.0F;
      this.s = false;
      this.x = 0L;
      this.y = 1.0F;
      this.z = 0.0F;
      this.C = new i(this);
      this.E = new j(this);
      TypedArray var5 = this.getContext().obtainStyledAttributes(var2, android.support.wearable.h.CircledImageView);
      this.g = var5.getDrawable(android.support.wearable.h.CircledImageView_android_src);
      if (this.g != null && this.g.getConstantState() != null) {
         if (VERSION.SDK_INT >= 21) {
            this.g = this.g.getConstantState().newDrawable(var1.getResources(), var1.getTheme());
         } else {
            this.g = this.g.getConstantState().newDrawable(var1.getResources());
         }

         this.g = this.g.mutate();
      }

      this.f = var5.getColorStateList(android.support.wearable.h.CircledImageView_circle_color);
      if (this.f == null) {
         this.f = ColorStateList.valueOf(17170432);
      }

      this.h = var5.getDimension(android.support.wearable.h.CircledImageView_circle_radius, 0.0F);
      this.q = this.h;
      this.j = var5.getDimension(android.support.wearable.h.CircledImageView_circle_radius_pressed, this.h);
      this.m = var5.getColor(android.support.wearable.h.CircledImageView_circle_border_color, -16777216);
      this.n = Cap.values()[var5.getInt(android.support.wearable.h.CircledImageView_circle_border_cap, 0)];
      this.o = var5.getDimension(android.support.wearable.h.CircledImageView_circle_border_width, 0.0F);
      if (this.o > 0.0F) {
         this.l += this.o / 2.0F;
      }

      float var4 = var5.getDimension(android.support.wearable.h.CircledImageView_circle_padding, 0.0F);
      if (var4 > 0.0F) {
         this.l += var4;
      }

      this.y = var5.getFloat(android.support.wearable.h.CircledImageView_image_circle_percentage, 0.0F);
      this.z = var5.getFloat(android.support.wearable.h.CircledImageView_image_horizontal_offcenter_percentage, 0.0F);
      if (var5.hasValue(android.support.wearable.h.CircledImageView_image_tint)) {
         this.A = var5.getColor(android.support.wearable.h.CircledImageView_image_tint, 0);
      }

      if (var5.hasValue(android.support.wearable.h.CircledImageView_square_dimen)) {
         this.B = var5.getInt(android.support.wearable.h.CircledImageView_square_dimen, 0);
      }

      this.i = var5.getFraction(android.support.wearable.h.CircledImageView_circle_radius_percent, 1, 1, 0.0F);
      this.k = var5.getFraction(android.support.wearable.h.CircledImageView_circle_radius_pressed_percent, 1, 1, this.i);
      var4 = var5.getDimension(android.support.wearable.h.CircledImageView_shadow_width, 0.0F);
      var5.recycle();
      this.a = new RectF();
      this.d = new Paint();
      this.d.setAntiAlias(true);
      this.e = new k(var4, 0.0F, this.getCircleRadius(), this.o);
      this.w = new ao();
      this.w.setCallback(this.C);
      this.setWillNotDraw(false);
      this.a();
   }

   // $FF: synthetic method
   static int a(CircledImageView var0) {
      return var0.D;
   }

   // $FF: synthetic method
   static int a(CircledImageView var0, int var1) {
      var0.D = var1;
      return var1;
   }

   private void a() {
      int var1 = this.f.getColorForState(this.getDrawableState(), this.f.getDefaultColor());
      if (this.x > 0L) {
         if (this.F != null) {
            this.F.cancel();
         } else {
            this.F = new ValueAnimator();
         }

         this.F.setIntValues(new int[]{this.D, var1});
         this.F.setEvaluator(c);
         this.F.setDuration(this.x);
         this.F.addUpdateListener(this.E);
         this.F.start();
      } else if (var1 != this.D) {
         this.D = var1;
         this.invalidate();
      }

   }

   public void a(boolean var1) {
      this.t = var1;
      if (this.w != null) {
         if (var1 && this.u && this.v) {
            this.w.a();
         } else {
            this.w.b();
         }
      }

   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      this.a();
   }

   public ColorStateList getCircleColorStateList() {
      return this.f;
   }

   public float getCircleRadius() {
      float var1 = this.h;
      float var2 = var1;
      if (this.h <= 0.0F) {
         var2 = var1;
         if (this.i > 0.0F) {
            var2 = (float)Math.max(this.getMeasuredHeight(), this.getMeasuredWidth()) * this.i;
         }
      }

      return var2 - this.l;
   }

   public float getCircleRadiusPercent() {
      return this.i;
   }

   public float getCircleRadiusPressed() {
      float var1 = this.j;
      float var2 = var1;
      if (this.j <= 0.0F) {
         var2 = var1;
         if (this.k > 0.0F) {
            var2 = (float)Math.max(this.getMeasuredHeight(), this.getMeasuredWidth()) * this.k;
         }
      }

      return var2 - this.l;
   }

   public float getCircleRadiusPressedPercent() {
      return this.k;
   }

   public long getColorChangeAnimationDuration() {
      return this.x;
   }

   public int getDefaultCircleColor() {
      return this.f.getDefaultColor();
   }

   public Drawable getImageDrawable() {
      return this.g;
   }

   public float getInitialCircleRadius() {
      return this.q;
   }

   protected void onDraw(Canvas var1) {
      int var2 = this.getPaddingLeft();
      int var3 = this.getPaddingTop();
      float var4;
      if (this.s) {
         var4 = this.getCircleRadiusPressed();
      } else {
         var4 = this.getCircleRadius();
      }

      this.e.a(var1, this.getAlpha());
      this.a.set((float)var2, (float)var3, (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()));
      this.a.set(this.a.centerX() - var4, this.a.centerY() - var4, this.a.centerX() + var4, this.a.centerY() + var4);
      if (this.o > 0.0F) {
         this.d.setColor(this.m);
         this.d.setAlpha(Math.round((float)this.d.getAlpha() * this.getAlpha()));
         this.d.setStyle(Style.STROKE);
         this.d.setStrokeWidth(this.o);
         this.d.setStrokeCap(this.n);
         if (this.t) {
            this.a.roundOut(this.b);
            this.b.inset((int)(-this.o / 2.0F), (int)(-this.o / 2.0F));
            this.w.setBounds(this.b);
            this.w.a(this.m);
            this.w.a(this.o);
            this.w.draw(var1);
         } else {
            var1.drawArc(this.a, -90.0F, this.r * 360.0F, false, this.d);
         }
      }

      if (!this.p) {
         this.d.setColor(this.D);
         this.d.setAlpha(Math.round((float)this.d.getAlpha() * this.getAlpha()));
         this.d.setStyle(Style.FILL);
         var1.drawCircle(this.a.centerX(), this.a.centerY(), var4, this.d);
      }

      if (this.g != null) {
         this.g.setAlpha(Math.round(this.getAlpha() * 255.0F));
         if (this.A != null) {
            this.g.setTint(this.A);
         }

         this.g.draw(var1);
      }

      super.onDraw(var1);
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if (this.g != null) {
         int var6 = this.g.getIntrinsicWidth();
         int var7 = this.g.getIntrinsicHeight();
         int var8 = this.getMeasuredWidth();
         int var9 = this.getMeasuredHeight();
         float var10;
         if (this.y > 0.0F) {
            var10 = this.y;
         } else {
            var10 = 1.0F;
         }

         float var11;
         if ((float)var6 != 0.0F) {
            var11 = (float)var8 * var10 / (float)var6;
         } else {
            var11 = 1.0F;
         }

         if ((float)var7 != 0.0F) {
            var10 = (float)var9 * var10 / (float)var7;
         } else {
            var10 = 1.0F;
         }

         var11 = Math.min(1.0F, Math.min(var11, var10));
         var6 = Math.round((float)var6 * var11);
         var7 = Math.round(var11 * (float)var7);
         var8 = (var8 - var6) / 2 + Math.round(this.z * (float)var6);
         var9 = (var9 - var7) / 2;
         this.g.setBounds(var8, var9, var6 + var8, var7 + var9);
      }

      super.onLayout(var1, var2, var3, var4, var5);
   }

   protected void onMeasure(int var1, int var2) {
      float var3 = this.getCircleRadius() + this.o + android.support.wearable.view.k.a(this.e) * android.support.wearable.view.k.b(this.e);
      float var4 = var3 * 2.0F;
      var3 = 2.0F * var3;
      int var5 = MeasureSpec.getMode(var1);
      var1 = MeasureSpec.getSize(var1);
      int var6 = MeasureSpec.getMode(var2);
      var2 = MeasureSpec.getSize(var2);
      if (var5 != 1073741824) {
         if (var5 == Integer.MIN_VALUE) {
            var1 = (int)Math.min(var4, (float)var1);
         } else {
            var1 = (int)var4;
         }
      }

      if (var6 != 1073741824) {
         if (var6 == Integer.MIN_VALUE) {
            var2 = (int)Math.min(var3, (float)var2);
         } else {
            var2 = (int)var3;
         }
      }

      var6 = var2;
      var5 = var1;
      if (this.B != null) {
         switch(this.B) {
         case 1:
            var5 = var2;
            var6 = var2;
            break;
         case 2:
            var6 = var1;
            var5 = var1;
            break;
         default:
            var5 = var1;
            var6 = var2;
         }
      }

      super.onMeasure(MeasureSpec.makeMeasureSpec(var5, 1073741824), MeasureSpec.makeMeasureSpec(var6, 1073741824));
   }

   protected boolean onSetAlpha(int var1) {
      return true;
   }

   public void onSizeChanged(int var1, int var2, int var3, int var4) {
      if (var1 != var3 || var2 != var4) {
         this.e.a(this.getPaddingLeft(), this.getPaddingTop(), var1 - this.getPaddingRight(), var2 - this.getPaddingBottom());
      }

   }

   protected void onVisibilityChanged(View var1, int var2) {
      super.onVisibilityChanged(var1, var2);
      boolean var3;
      if (var2 == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.u = var3;
      this.a(this.t);
   }

   protected void onWindowVisibilityChanged(int var1) {
      super.onWindowVisibilityChanged(var1);
      boolean var2;
      if (var1 == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.v = var2;
      this.a(this.t);
   }

   public void setCircleBorderCap(Cap var1) {
      if (var1 != this.n) {
         this.n = var1;
         this.invalidate();
      }

   }

   public void setCircleBorderColor(int var1) {
      this.m = var1;
   }

   public void setCircleBorderWidth(float var1) {
      if (var1 != this.o) {
         this.o = var1;
         this.e.b(var1);
         this.invalidate();
      }

   }

   public void setCircleColor(int var1) {
      this.setCircleColorStateList(ColorStateList.valueOf(var1));
   }

   public void setCircleColorStateList(ColorStateList var1) {
      if (!Objects.equals(var1, this.f)) {
         this.f = var1;
         this.a();
         this.invalidate();
      }

   }

   public void setCircleHidden(boolean var1) {
      if (var1 != this.p) {
         this.p = var1;
         this.invalidate();
      }

   }

   public void setCircleRadius(float var1) {
      if (var1 != this.h) {
         this.h = var1;
         k var2 = this.e;
         if (this.s) {
            var1 = this.getCircleRadiusPressed();
         } else {
            var1 = this.getCircleRadius();
         }

         var2.a(var1);
         this.invalidate();
      }

   }

   public void setCircleRadiusPercent(float var1) {
      if (var1 != this.i) {
         this.i = var1;
         k var2 = this.e;
         if (this.s) {
            var1 = this.getCircleRadiusPressed();
         } else {
            var1 = this.getCircleRadius();
         }

         var2.a(var1);
         this.invalidate();
      }

   }

   public void setCircleRadiusPressed(float var1) {
      if (var1 != this.j) {
         this.j = var1;
         this.invalidate();
      }

   }

   public void setCircleRadiusPressedPercent(float var1) {
      if (var1 != this.k) {
         this.k = var1;
         k var2 = this.e;
         if (this.s) {
            var1 = this.getCircleRadiusPressed();
         } else {
            var1 = this.getCircleRadius();
         }

         var2.a(var1);
         this.invalidate();
      }

   }

   public void setColorChangeAnimationDuration(long var1) {
      this.x = var1;
   }

   public void setImageCirclePercentage(float var1) {
      var1 = Math.max(0.0F, Math.min(1.0F, var1));
      if (var1 != this.y) {
         this.y = var1;
         this.invalidate();
      }

   }

   public void setImageDrawable(Drawable var1) {
      if (var1 != this.g) {
         Drawable var2 = this.g;
         this.g = var1;
         if (this.g != null && this.g.getConstantState() != null) {
            this.g = this.g.getConstantState().newDrawable(this.getResources(), this.getContext().getTheme()).mutate();
         }

         boolean var3;
         if (var1 != null && var2 != null && var2.getIntrinsicHeight() == var1.getIntrinsicHeight() && var2.getIntrinsicWidth() == var1.getIntrinsicWidth()) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3) {
            this.g.setBounds(var2.getBounds());
         } else {
            this.requestLayout();
         }

         this.invalidate();
      }

   }

   public void setImageHorizontalOffcenterPercentage(float var1) {
      if (var1 != this.z) {
         this.z = var1;
         this.invalidate();
      }

   }

   public void setImageResource(int var1) {
      Drawable var2;
      if (var1 == 0) {
         var2 = null;
      } else {
         var2 = this.getContext().getDrawable(var1);
      }

      this.setImageDrawable(var2);
   }

   public void setImageTint(int var1) {
      if (this.A == null || var1 != this.A) {
         this.A = var1;
         this.invalidate();
      }

   }

   public void setPadding(int var1, int var2, int var3, int var4) {
      if (var1 != this.getPaddingLeft() || var2 != this.getPaddingTop() || var3 != this.getPaddingRight() || var4 != this.getPaddingBottom()) {
         this.e.a(var1, var2, this.getWidth() - var3, this.getHeight() - var4);
      }

      super.setPadding(var1, var2, var3, var4);
   }

   public void setPressed(boolean var1) {
      super.setPressed(var1);
      if (var1 != this.s) {
         this.s = var1;
         k var2 = this.e;
         float var3;
         if (this.s) {
            var3 = this.getCircleRadiusPressed();
         } else {
            var3 = this.getCircleRadius();
         }

         var2.a(var3);
         this.invalidate();
      }

   }

   public void setProgress(float var1) {
      if (var1 != this.r) {
         this.r = var1;
         this.invalidate();
      }

   }

   public void setShadowVisibility(float var1) {
      if (var1 != android.support.wearable.view.k.b(this.e)) {
         this.e.c(var1);
         this.invalidate();
      }

   }
}
