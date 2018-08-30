package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class ft extends ef {
   fz a;
   boolean b;

   public ft(int var1, int var2) {
      super(var1, var2);
   }

   public ft(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public ft(LayoutParams var1) {
      super(var1);
   }

   public ft(MarginLayoutParams var1) {
      super(var1);
   }

   public boolean a() {
      return this.b;
   }

   public final int b() {
      int var1;
      if (this.a == null) {
         var1 = -1;
      } else {
         var1 = this.a.e;
      }

      return var1;
   }
}
