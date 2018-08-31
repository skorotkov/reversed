package android.support.percent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;

public class PercentRelativeLayout extends RelativeLayout {
   private final a a = new a(this);

   public PercentRelativeLayout(Context var1) {
      super(var1);
   }

   public PercentRelativeLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public PercentRelativeLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   protected e a() {
      return new e(-1, -1);
   }

   public e a(AttributeSet var1) {
      return new e(this.getContext(), var1);
   }

   // $FF: synthetic method
   protected LayoutParams generateDefaultLayoutParams() {
      return this.a();
   }

   // $FF: synthetic method
   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
//   public android.widget.RelativeLayout.LayoutParams generateLayoutParams(AttributeSet var1) {
//      return this.a(var1);
//   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.a.a();
   }

   protected void onMeasure(int var1, int var2) {
      this.a.a(var1, var2);
      super.onMeasure(var1, var2);
      if (this.a.b()) {
         super.onMeasure(var1, var2);
      }

   }
}
