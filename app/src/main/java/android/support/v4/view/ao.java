package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.LayoutInflater.Factory;

class ao implements Factory {
   final as a;

   ao(as var1) {
      this.a = var1;
   }

   public View onCreateView(String var1, Context var2, AttributeSet var3) {
      return this.a.a((View)null, var1, var2, var3);
   }

   public String toString() {
      return this.getClass().getName() + "{" + this.a + "}";
   }
}
