package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class PolarGlyphView extends TextView {
   public PolarGlyphView(Context var1) {
      super(var1);
      this.a((AttributeSet)null, 0, var1);
   }

   public PolarGlyphView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var2, 0, var1);
   }

   public PolarGlyphView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var2, var3, var1);
   }

   private void a(AttributeSet var1, int var2, Context var3) {
      TypedArray var4 = var3.obtainStyledAttributes(var1, fi.polar.polarflow.i.PolarGlyphView, var2, 0);
      String var7 = var4.getString(0);
      float var5 = var4.getDimension(2, 24.0F);
      ColorStateList var6 = var4.getColorStateList(1);
      var4.recycle();
      this.setTextSize(0, var5);
      this.setGravity(17);
      if (var6 != null) {
         this.setTextColor(var6);
      } else {
         this.setTextColor(-1);
      }

      if (this.isInEditMode()) {
         this.setText(var7);
      } else {
         s.a(this, var7);
      }

   }

   public CharSequence getGlyph() {
      return this.getText();
   }

   public void setGlyph(CharSequence var1) {
      this.setText(var1);
   }

   public void setGlyphColor(int var1) {
      this.setTextColor(var1);
   }
}
