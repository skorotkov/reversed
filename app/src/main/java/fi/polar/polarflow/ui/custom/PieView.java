package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

public class PieView extends View {
   private ShapeDrawable a;
   private RectF b;
   private final float c = 360.0F;
   private final float d = -90.0F;
   private float e = 4.5F;
   private Paint f;
   private float g = 0.0F;
   private int h;

   public PieView(Context var1) {
      super(var1);
      this.a((AttributeSet)null, 0, var1);
   }

   public PieView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var2, 0, var1);
   }

   public PieView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var2, var3, var1);
   }

   private void a(AttributeSet var1, int var2, Context var3) {
      this.f = new Paint();
      this.f.setAntiAlias(true);
      this.f.setStrokeWidth(this.e);
      this.f.setColor(this.h);
      this.a = new ShapeDrawable(new OvalShape());
      var2 = this.getResources().getDimensionPixelSize(2131362204);
      this.a.setBounds(2, 3, var2 - 2, var2 - 2);
      this.b = new RectF(this.a.getBounds());
      this.a.getPaint().setStyle(Style.FILL);
   }

   public int getColor() {
      return this.h;
   }

   public float getProgress() {
      return this.g;
   }

   public float getStrokeWidth() {
      return this.e;
   }

   protected void onDraw(Canvas var1) {
      float var2 = this.g;
      var1.rotate(-90.0F, (float)this.a.getBounds().centerX(), (float)this.a.getBounds().centerY());
      this.f.setStyle(Style.STROKE);
      var1.drawOval(this.b, this.f);
      this.f.setStyle(Style.FILL);
      var1.drawArc(this.b, 360.0F * this.g, 360.0F - var2 * 360.0F, true, this.f);
   }

   public void setColor(int var1) {
      this.h = var1;
      this.f.setColor(this.h);
   }

   public void setProgress(float var1) {
      if (var1 != this.g && var1 >= 0.0F && var1 <= 1.0F) {
         this.g = var1;
         this.invalidate();
      }

   }

   public void setStrokeWidth(float var1) {
      this.e = var1;
      this.f.setStrokeWidth(this.e);
   }
}
