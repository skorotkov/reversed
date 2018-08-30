package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class cm extends MarginLayoutParams {
   public float g;
   public int h = -1;

   public cm(int var1, int var2) {
      super(var1, var2);
      this.g = 0.0F;
   }

   public cm(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, android.support.v7.a.k.LinearLayoutCompat_Layout);
      this.g = var3.getFloat(android.support.v7.a.k.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      this.h = var3.getInt(android.support.v7.a.k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      var3.recycle();
   }

   public cm(LayoutParams var1) {
      super(var1);
   }
}
