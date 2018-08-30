package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class PolarGlyphViewInFrame extends FrameLayout {
   private TextView a;

   public PolarGlyphViewInFrame(Context var1) {
      super(var1);
      this.a((AttributeSet)null, 0, var1);
   }

   public PolarGlyphViewInFrame(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var2, 0, var1);
   }

   public PolarGlyphViewInFrame(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var2, var3, var1);
   }

   private void a(AttributeSet var1, int var2, Context var3) {
      TypedArray var4 = var3.obtainStyledAttributes(var1, fi.polar.polarflow.i.PolarGlyphView, var2, 0);
      String var6 = var4.getString(0);
      float var5 = var4.getDimension(2, 24.0F);
      var2 = var4.getColor(1, -1);
      var4.recycle();
      this.a = new TextView(var3);
      this.a.setId(2131755017);
      this.a.setTextSize(0, var5);
      this.a.setGravity(17);
      this.a.setTextColor(var2);
      if (this.isInEditMode()) {
         this.a.setText(var6);
      } else {
         s.a(this.a, var6);
      }

      this.addView(this.a);
   }

   public CharSequence getGlyph() {
      return this.a.getText();
   }

   public void setGlyph(CharSequence var1) {
      this.a.setText(var1);
   }

   public void setGlyphColor(int var1) {
      this.a.setTextColor(var1);
   }
}
