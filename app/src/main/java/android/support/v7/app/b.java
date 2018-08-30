package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.k;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class b extends MarginLayoutParams {
   public int a = 0;

   public b(int var1, int var2) {
      super(var1, var2);
      this.a = 8388627;
   }

   public b(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, k.ActionBarLayout);
      this.a = var3.getInt(k.ActionBarLayout_android_layout_gravity, 0);
      var3.recycle();
   }

   public b(b var1) {
      super(var1);
      this.a = var1.a;
   }

   public b(LayoutParams var1) {
      super(var1);
   }
}
