package android.support.wearable.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;

public class ah extends MarginLayoutParams {
   public int a;
   public boolean b;

   public ah() {
      super(-1, -1);
   }

   public ah(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, GridViewPager.b());
      this.a = var3.getInteger(0, 48);
      var3.recycle();
   }
}
