package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

class n extends aq implements r {
   // $FF: synthetic field
   final j a;
   private final float[] b;

   public n(j var1, Context var2) {
      super(var2, (AttributeSet)null, android.support.v7.a.b.actionOverflowButtonStyle);
      this.a = var1;
      this.b = new float[2];
      this.setClickable(true);
      this.setFocusable(true);
      this.setVisibility(0);
      this.setEnabled(true);
      this.setOnTouchListener(new o(this, this, var1));
   }

   public boolean c() {
      return false;
   }

   public boolean d() {
      return false;
   }

   public boolean performClick() {
      if (!super.performClick()) {
         this.playSoundEffect(0);
         this.a.d();
      }

      return true;
   }

   protected boolean setFrame(int var1, int var2, int var3, int var4) {
      boolean var5 = super.setFrame(var1, var2, var3, var4);
      Drawable var6 = this.getDrawable();
      Drawable var7 = this.getBackground();
      if (var6 != null && var7 != null) {
         int var8 = this.getWidth();
         var2 = this.getHeight();
         var1 = Math.max(var8, var2) / 2;
         int var9 = this.getPaddingLeft();
         int var10 = this.getPaddingRight();
         var4 = this.getPaddingTop();
         var3 = this.getPaddingBottom();
         var8 = (var8 + (var9 - var10)) / 2;
         var2 = (var2 + (var4 - var3)) / 2;
         android.support.v4.d.a.a.a(var7, var8 - var1, var2 - var1, var8 + var1, var2 + var1);
      }

      return var5;
   }
}
