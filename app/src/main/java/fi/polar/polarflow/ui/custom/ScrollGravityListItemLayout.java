package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ScrollGravityListItemLayout extends FrameLayout {
   private int a;
   private int b;

   public ScrollGravityListItemLayout(Context var1) {
      this(var1, (AttributeSet)null, 0, 0);
   }

   public ScrollGravityListItemLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 0, 0);
   }

   public ScrollGravityListItemLayout(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public ScrollGravityListItemLayout(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      TypedArray var5 = this.getContext().obtainStyledAttributes(var2, fi.polar.polarflow.i.ScrollGravityListItemLayout);
      this.a = var5.getInt(0, 17);
      this.b = var5.getInt(1, 17);
      var5.recycle();
   }

   public int getBackwardScrollGravity() {
      return this.b;
   }

   public int getForwardScrollGravity() {
      return this.a;
   }

   public void setBackwardScrollGravity(int var1) {
      this.b = var1;
   }

   public void setForwardScrollGravity(int var1) {
      this.a = var1;
   }
}
