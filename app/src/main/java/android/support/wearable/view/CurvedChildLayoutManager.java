package android.support.wearable.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.View;

@TargetApi(23)
public class CurvedChildLayoutManager extends WearableRecyclerView$ChildLayoutManager {
   private WearableRecyclerView A;
   private boolean B;
   private int C;
   private int D;
   private final Path a = new Path();
   private final PathMeasure b = new PathMeasure();
   private int c;
   private int d;
   private float e;
   private float f;
   private float g;
   private float h;
   private final float[] x = new float[2];
   private final float[] y = new float[2];
   private final float[] z = new float[2];

   public CurvedChildLayoutManager(Context var1) {
      super(var1);
      this.B = var1.getResources().getConfiguration().isScreenRound();
      this.d = var1.getResources().getDimensionPixelSize(android.support.wearable.b.wrv_curve_default_x_offset);
   }

   private void a(int var1, int var2) {
      if (this.c != var2) {
         this.c = var2;
         this.f = -0.048F * (float)var2;
         this.g = 1.048F * (float)var2;
         this.h = 10.416667F;
         this.a.reset();
         this.a.moveTo(0.5F * (float)var1, this.f);
         this.a.lineTo((float)var1 * 0.34F, 0.075F * (float)var2);
         this.a.cubicTo((float)var1 * 0.22F, 0.17F * (float)var2, (float)var1 * 0.13F, 0.32F * (float)var2, (float)var1 * 0.13F, (float)(var2 / 2));
         this.a.cubicTo((float)var1 * 0.13F, 0.68F * (float)var2, (float)var1 * 0.22F, 0.83F * (float)var2, (float)var1 * 0.34F, 0.925F * (float)var2);
         this.a.lineTo((float)(var1 / 2), this.g);
         this.b.setPath(this.a, false);
         this.e = this.b.getLength();
      }

   }

   public void a(View var1, WearableRecyclerView var2) {
      if (this.A != var2) {
         this.A = var2;
         this.C = this.A.getWidth();
         this.D = this.A.getHeight();
      }

      if (this.B) {
         this.a(this.C, this.D);
         this.z[0] = (float)this.d;
         this.z[1] = (float)var1.getHeight() / 2.0F;
         this.a(var1, this.z);
         float var3 = -((float)var1.getHeight()) / 2.0F;
         float var4 = (float)this.D + (float)var1.getHeight() / 2.0F;
         float var5 = (float)var1.getTop() + this.z[1];
         float var6 = (Math.abs(var3) + var5) / (var4 - var3);
         this.b.getPosTan(var6 * this.e, this.x, this.y);
         boolean var7;
         if (Math.abs(this.x[1] - this.f) < 0.001F && var3 < this.x[1]) {
            var7 = true;
         } else {
            var7 = false;
         }

         boolean var8;
         if (Math.abs(this.x[1] - this.g) < 0.001F && var4 > this.x[1]) {
            var8 = true;
         } else {
            var8 = false;
         }

         if (var7 || var8) {
            this.x[1] = var5;
            this.x[0] = Math.abs(var5) * this.h;
         }

         var1.offsetLeftAndRight((int)(this.x[0] - this.z[0]) - var1.getLeft());
         var1.setTranslationY(this.x[1] - var5);
      }

   }

   public void a(View var1, float[] var2) {
   }
}
