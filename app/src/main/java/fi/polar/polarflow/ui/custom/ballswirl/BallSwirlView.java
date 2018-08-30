package fi.polar.polarflow.ui.custom.ballswirl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class BallSwirlView extends View {
   private a[] a;
   private Paint b;
   private long c;
   private int d;
   private int e;
   private int f;
   private boolean g;

   public BallSwirlView(Context var1) {
      super(var1);
      this.a(var1, (AttributeSet)null, 0, 0);
   }

   public BallSwirlView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1, var2, 0, 0);
   }

   public BallSwirlView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1, var2, var3, 0);
   }

   public BallSwirlView(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.a(var1, var2, var3, var4);
   }

   private int a(long var1) {
      return Math.round((float)(120L * var1 / 4000L));
   }

   private void a(Context var1, AttributeSet var2, int var3, int var4) {
      this.a = fi.polar.polarflow.ui.custom.ballswirl.b.a();
      this.b = new Paint(1);
      this.b.setStyle(Style.FILL);
      this.b.setColor(fi.polar.polarflow.ui.custom.ballswirl.b.a);
      this.c = 0L;
      this.d = 0;
      this.e = 0;
      this.f = 0;
   }

   public void a() {
      a[] var1 = this.a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3].c();
      }

      this.c = 0L;
      this.d = 0;
      this.g = true;
      this.invalidate();
   }

   public void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.g) {
         long var2 = SystemClock.elapsedRealtime();
         if (this.c == 0L) {
            this.c = var2;
         }

         var2 -= this.c;
         if (var2 < 4000L) {
            int var4 = this.d;
            this.d = this.a(var2);
            a[] var5 = this.a;
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               a var8 = var5[var7];
               var8.a(this.d, this.d - var4);
               if (var8.a(this.d)) {
                  float var9 = (float)(this.e + var8.a());
                  int var10 = this.f;
                  var1.drawCircle(var9, (float)(var8.b() + var10), 6.0F, this.b);
               }
            }

            this.invalidate();
         }
      }

   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      this.e = var1 / 2;
      this.f = var2 / 2;
   }
}
