package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class Space extends View {
   public Space(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public Space(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public Space(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      if (this.getVisibility() == 0) {
         this.setVisibility(4);
      }

   }

   private static int a(int var0, int var1) {
      int var2 = MeasureSpec.getMode(var1);
      int var3 = MeasureSpec.getSize(var1);
      var1 = var0;
      switch(var2) {
      case Integer.MIN_VALUE:
         var1 = Math.min(var0, var3);
      case 0:
         break;
      case 1073741824:
         var1 = var3;
         break;
      default:
         var1 = var0;
      }

      return var1;
   }

   public void draw(Canvas var1) {
   }

   protected void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(a(this.getSuggestedMinimumWidth(), var1), a(this.getSuggestedMinimumHeight(), var2));
   }
}
