package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

public class ImageOrGlyphView extends TextView {
   public ImageOrGlyphView(Context var1) {
      super(var1);
      this.a((AttributeSet)null, 0, var1);
   }

   public ImageOrGlyphView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var2, 0, var1);
   }

   public ImageOrGlyphView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var2, var3, var1);
   }

   private void a(AttributeSet var1, int var2, Context var3) {
      TypedArray var6 = var3.obtainStyledAttributes(var1, fi.polar.polarflow.i.ImageOrGlyphView, var2, 0);
      if (var6.hasValue(0)) {
         Drawable var7 = var6.getDrawable(0);
         if (var7 != null) {
            this.setBackground(var7);
         }
      } else {
         TypedValue var4 = new TypedValue();
         if (var3.getTheme().resolveAttribute(16842904, var4, true)) {
            var2 = var4.data;
         } else {
            var2 = -1;
         }

         int var5 = this.getResources().getDimensionPixelSize(2131362037);
         this.setHeight(var5);
         this.setWidth(var5);
         this.setTextSize(0, (float)var5);
         this.setGravity(17);
         this.setTextColor(var2);
         if (this.isInEditMode()) {
            this.setText(var6.getString(1));
         } else {
            s.a(this, var6.getString(1));
         }
      }

      var6.recycle();
   }
}
