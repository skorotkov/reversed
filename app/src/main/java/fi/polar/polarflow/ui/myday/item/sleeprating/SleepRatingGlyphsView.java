package fi.polar.polarflow.ui.myday.item.sleeprating;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.myday.a_package.d;
import java.util.Iterator;

public class SleepRatingGlyphsView extends LinearLayout {
   public SleepRatingGlyphsView(Context var1) {
      super(var1);
      this.a(var1);
   }

   public SleepRatingGlyphsView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1);
   }

   public SleepRatingGlyphsView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1);
   }

   private PolarGlyphView a(LayoutInflater var1, CharSequence var2, int var3) {
      PolarGlyphView var4 = (PolarGlyphView)var1.inflate(2130968780, (ViewGroup)null);
      var4.setLayoutParams(new LayoutParams(0, -2, 1.0F));
      var4.setGlyph(var2);
      var4.setTag(var3);
      return var4;
   }

   private void a(Context var1) {
      this.setGravity(17);
      this.setOrientation(0);
      LayoutInflater var2 = LayoutInflater.from(var1);
      Iterator var3 = d.b(var1.getResources()).iterator();

      while(var3.hasNext()) {
         d var4 = (d)var3.next();
         this.addView(this.a(var2, var4.b, var4.a));
      }

   }

   public void setSelectedRating(int var1) {
      for(int var2 = 0; var2 < this.getChildCount(); ++var2) {
         PolarGlyphView var3 = (PolarGlyphView)this.getChildAt(var2);
         Object var4 = var3.getTag();
         if (var4 instanceof Integer && (Integer)var4 == var1) {
            var3.setSelected(true);
         } else {
            var3.setSelected(false);
         }
      }

   }
}
