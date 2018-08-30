package android.support.wearable.view.drawer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.support.v4.view.ViewPager;
import android.support.v4.view.br;
import android.support.v4.view.dl;
import android.support.wearable.g;
import android.support.wearable.h;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

@TargetApi(23)
public class PageIndicatorView extends View implements dl {
   private int a;
   private float b;
   private float c;
   private int d;
   private int e;
   private boolean f;
   private int g;
   private int h;
   private int i;
   private float j;
   private float k;
   private float l;
   private int m;
   private br n;
   private int o;
   private int p;
   private int q;
   private final Paint r;
   private final Paint s;
   private final Paint t;
   private final Paint u;
   private boolean v;

   public PageIndicatorView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public PageIndicatorView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public PageIndicatorView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      TypedArray var4 = this.getContext().obtainStyledAttributes(var2, android.support.wearable.h.PageIndicatorView, var3, android.support.wearable.g.PageIndicatorViewStyle);
      this.a = var4.getDimensionPixelOffset(android.support.wearable.h.PageIndicatorView_pageIndicatorDotSpacing, 0);
      this.b = var4.getDimension(android.support.wearable.h.PageIndicatorView_pageIndicatorDotRadius, 0.0F);
      this.c = var4.getDimension(android.support.wearable.h.PageIndicatorView_pageIndicatorDotRadiusSelected, 0.0F);
      this.d = var4.getColor(android.support.wearable.h.PageIndicatorView_pageIndicatorDotColor, 0);
      this.e = var4.getColor(android.support.wearable.h.PageIndicatorView_pageIndicatorDotColorSelected, 0);
      this.g = var4.getInt(android.support.wearable.h.PageIndicatorView_pageIndicatorDotFadeOutDelay, 0);
      this.h = var4.getInt(android.support.wearable.h.PageIndicatorView_pageIndicatorDotFadeOutDuration, 0);
      this.i = var4.getInt(android.support.wearable.h.PageIndicatorView_pageIndicatorDotFadeInDuration, 0);
      this.f = var4.getBoolean(android.support.wearable.h.PageIndicatorView_pageIndicatorDotFadeWhenIdle, false);
      this.j = var4.getDimension(android.support.wearable.h.PageIndicatorView_pageIndicatorDotShadowDx, 0.0F);
      this.k = var4.getDimension(android.support.wearable.h.PageIndicatorView_pageIndicatorDotShadowDy, 0.0F);
      this.l = var4.getDimension(android.support.wearable.h.PageIndicatorView_pageIndicatorDotShadowRadius, 0.0F);
      this.m = var4.getColor(android.support.wearable.h.PageIndicatorView_pageIndicatorDotShadowColor, 0);
      var4.recycle();
      this.r = new Paint(1);
      this.r.setColor(this.d);
      this.r.setStyle(Style.FILL);
      this.t = new Paint(1);
      this.t.setColor(this.e);
      this.t.setStyle(Style.FILL);
      this.s = new Paint(1);
      this.u = new Paint(1);
      this.q = 0;
      if (this.isInEditMode()) {
         this.o = 5;
         this.p = 2;
         this.f = false;
      }

      if (this.f) {
         this.v = false;
         this.animate().alpha(0.0F).setStartDelay(2000L).setDuration((long)this.h).start();
      } else {
         this.animate().cancel();
         this.setAlpha(1.0F);
      }

      this.a();
   }

   // $FF: synthetic method
   static int a(PageIndicatorView var0) {
      return var0.h;
   }

   private void a() {
      this.a(this.r, this.s, this.b, this.l, this.d, this.m);
      this.a(this.t, this.u, this.c, this.l, this.e, this.m);
   }

   private void a(long var1) {
      this.v = false;
      this.animate().cancel();
      this.animate().alpha(0.0F).setStartDelay(var1).setDuration((long)this.h).start();
   }

   private void a(Paint var1, Paint var2, float var3, float var4, int var5, int var6) {
      var4 += var3;
      var3 /= var4;
      TileMode var7 = TileMode.CLAMP;
      var2.setShader(new RadialGradient(0.0F, 0.0F, var4, new int[]{var6, var6, 0}, new float[]{0.0F, var3, 1.0F}, var7));
      var1.setColor(var5);
      var1.setStyle(Style.FILL);
   }

   // $FF: synthetic method
   static boolean a(PageIndicatorView var0, boolean var1) {
      var0.v = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PageIndicatorView var0) {
      return var0.g;
   }

   private void b() {
      int var1 = this.n.a();
      if (var1 != this.o) {
         this.o = var1;
         this.requestLayout();
      }

   }

   private void c() {
      this.v = true;
      this.animate().cancel();
      this.animate().alpha(1.0F).setStartDelay(0L).setDuration((long)this.i).start();
   }

   private void c(int var1) {
      this.p = var1;
      this.invalidate();
   }

   private void d() {
      this.v = true;
      this.animate().cancel();
      this.animate().alpha(1.0F).setStartDelay(0L).setDuration((long)this.i).setListener(new a(this)).start();
   }

   public void a(int var1) {
      if (var1 != this.p) {
         this.c(var1);
      }

   }

   public void a(int var1, float var2, int var3) {
      if (this.f && this.q == 1) {
         if (var2 != 0.0F) {
            if (!this.v) {
               this.c();
            }
         } else if (this.v) {
            this.a(0L);
         }
      }

   }

   public void b(int var1) {
      if (this.q != var1) {
         this.q = var1;
         if (this.f && var1 == 0) {
            if (this.v) {
               this.a((long)this.g);
            } else {
               this.d();
            }
         }
      }

   }

   public int getDotColor() {
      return this.d;
   }

   public int getDotColorSelected() {
      return this.e;
   }

   public int getDotFadeInDuration() {
      return this.i;
   }

   public int getDotFadeOutDelay() {
      return this.g;
   }

   public int getDotFadeOutDuration() {
      return this.h;
   }

   public boolean getDotFadeWhenIdle() {
      return this.f;
   }

   public float getDotRadius() {
      return this.b;
   }

   public float getDotRadiusSelected() {
      return this.c;
   }

   public int getDotShadowColor() {
      return this.m;
   }

   public float getDotShadowDx() {
      return this.j;
   }

   public float getDotShadowDy() {
      return this.k;
   }

   public float getDotShadowRadius() {
      return this.l;
   }

   public float getDotSpacing() {
      return (float)this.a;
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.o > 1) {
         float var2 = (float)this.getPaddingLeft();
         float var3 = (float)this.a / 2.0F;
         float var4 = (float)this.getHeight() / 2.0F;
         var1.save();
         var1.translate(var2 + var3, var4);

         for(int var5 = 0; var5 < this.o; ++var5) {
            if (var5 == this.p) {
               var2 = this.c;
               var3 = this.l;
               var1.drawCircle(this.j, this.k, var2 + var3, this.u);
               var1.drawCircle(0.0F, 0.0F, this.c, this.t);
            } else {
               var3 = this.b;
               var2 = this.l;
               var1.drawCircle(this.j, this.k, var3 + var2, this.s);
               var1.drawCircle(0.0F, 0.0F, this.b, this.r);
            }

            var1.translate((float)this.a, 0.0F);
         }

         var1.restore();
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var3;
      if (MeasureSpec.getMode(var1) == 1073741824) {
         var3 = MeasureSpec.getSize(var1);
      } else {
         var3 = this.o * this.a + this.getPaddingLeft() + this.getPaddingRight();
      }

      int var4;
      if (MeasureSpec.getMode(var2) == 1073741824) {
         var4 = MeasureSpec.getSize(var2);
      } else {
         var4 = (int)((float)((int)Math.ceil((double)(Math.max(this.b + this.l, this.c + this.l) * 2.0F))) + this.k) + this.getPaddingTop() + this.getPaddingBottom();
      }

      this.setMeasuredDimension(resolveSizeAndState(var3, var1, 0), resolveSizeAndState(var4, var2, 0));
   }

   public void setDotColor(int var1) {
      if (this.d != var1) {
         this.d = var1;
         this.invalidate();
      }

   }

   public void setDotColorSelected(int var1) {
      if (this.e != var1) {
         this.e = var1;
         this.invalidate();
      }

   }

   public void setDotFadeOutDelay(int var1) {
      this.g = var1;
   }

   public void setDotFadeWhenIdle(boolean var1) {
      this.f = var1;
      if (!var1) {
         this.c();
      }

   }

   public void setDotRadius(int var1) {
      if (this.b != (float)var1) {
         this.b = (float)var1;
         this.a();
         this.invalidate();
      }

   }

   public void setDotRadiusSelected(int var1) {
      if (this.c != (float)var1) {
         this.c = (float)var1;
         this.a();
         this.invalidate();
      }

   }

   public void setDotShadowColor(int var1) {
      this.m = var1;
      this.a();
      this.invalidate();
   }

   public void setDotShadowDx(float var1) {
      this.j = var1;
      this.invalidate();
   }

   public void setDotShadowDy(float var1) {
      this.k = var1;
      this.invalidate();
   }

   public void setDotShadowRadius(float var1) {
      if (this.l != var1) {
         this.l = var1;
         this.a();
         this.invalidate();
      }

   }

   public void setDotSpacing(int var1) {
      if (this.a != var1) {
         this.a = var1;
         this.requestLayout();
      }

   }

   public void setPager(ViewPager var1) {
      var1.a((dl)this);
      this.setPagerAdapter(var1.getAdapter());
      this.n = var1.getAdapter();
      if (this.n != null && this.n.a() > 0) {
         this.c(0);
      }

   }

   public void setPagerAdapter(br var1) {
      this.n = var1;
      if (this.n != null) {
         this.b();
         if (this.f) {
            this.d();
         }
      }

   }
}
