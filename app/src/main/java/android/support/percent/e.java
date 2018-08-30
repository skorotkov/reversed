package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout.LayoutParams;

public class e extends LayoutParams implements c {
   private b a;

   public e(int var1, int var2) {
      super(var1, var2);
   }

   public e(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = android.support.percent.a.a(var1, var2);
   }

   public b a() {
      if (this.a == null) {
         this.a = new b();
      }

      return this.a;
   }

   protected void setBaseAttributes(TypedArray var1, int var2, int var3) {
      android.support.percent.a.a(this, var1, var2, var3);
   }
}
