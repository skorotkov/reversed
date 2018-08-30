package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements bw {
   private bx a;

   public FitWindowsLinearLayout(Context var1) {
      super(var1);
   }

   public FitWindowsLinearLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected boolean fitSystemWindows(Rect var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

      return super.fitSystemWindows(var1);
   }

   public void setOnFitSystemWindowsListener(bx var1) {
      this.a = var1;
   }
}
