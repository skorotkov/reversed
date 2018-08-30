package android.support.wearable.view;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;

@TargetApi(20)
class ao extends Drawable {
   private static final Property a = new ap(Integer.class, "level");
   private static final TimeInterpolator b;
   private final RectF c = new RectF();
   private final Paint d = new Paint();
   private final ObjectAnimator e;
   private float f;
   private int g;

   static {
      b = am.a;
   }

   public ao() {
      this.d.setAntiAlias(true);
      this.d.setStyle(Style.STROKE);
      this.e = ObjectAnimator.ofInt(this, a, new int[]{0, 10000});
      this.e.setRepeatCount(-1);
      this.e.setRepeatMode(1);
      this.e.setDuration(6000L);
      this.e.setInterpolator(new LinearInterpolator());
   }

   private static float a(float var0, float var1, float var2) {
      if (var0 != var1) {
         var0 = (var2 - var0) / (var1 - var0);
      } else {
         var0 = 0.0F;
      }

      return var0;
   }

   public void a() {
      if (!this.e.isStarted()) {
         this.e.start();
      }

   }

   public void a(float var1) {
      this.f = var1;
   }

   public void a(int var1) {
      this.g = var1;
   }

   public void b() {
      this.e.cancel();
   }

   public void draw(Canvas var1) {
      float var2 = 0.0F;
      var1.save();
      this.c.set(this.getBounds());
      this.c.inset(this.f / 2.0F, this.f / 2.0F);
      this.d.setStrokeWidth(this.f);
      this.d.setColor(this.g);
      int var3 = this.getLevel();
      float var4 = (float)(var3 - var3 / 2000 * 2000) / 2000.0F;
      boolean var5;
      if (var4 < 0.5F) {
         var5 = true;
      } else {
         var5 = false;
      }

      float var6;
      if (var5) {
         var6 = b.getInterpolation(a(0.0F, 0.5F, var4)) * 306.0F;
      } else {
         var6 = (1.0F - b.getInterpolation(a(0.5F, 1.0F, var4))) * 306.0F;
      }

      float var7 = Math.max(1.0F, var6);
      var1.rotate((float)var3 * 1.0E-4F * 2.0F * 360.0F - 90.0F + 54.0F * var4, this.c.centerX(), this.c.centerY());
      RectF var8 = this.c;
      if (var5) {
         var6 = var2;
      } else {
         var6 = 306.0F - var7;
      }

      var1.drawArc(var8, var6, var7, false, this.d);
      var1.restore();
   }

   public int getOpacity() {
      return -1;
   }

   protected boolean onLevelChange(int var1) {
      return true;
   }

   public void setAlpha(int var1) {
   }

   public void setColorFilter(ColorFilter var1) {
   }
}
