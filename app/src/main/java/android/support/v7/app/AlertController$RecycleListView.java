package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.k;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView extends ListView {
   private final int a;
   private final int b;

   public AlertController$RecycleListView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public AlertController$RecycleListView(Context var1, AttributeSet var2) {
      super(var1, var2);
      TypedArray var3 = var1.obtainStyledAttributes(var2, k.RecycleListView);
      this.b = var3.getDimensionPixelOffset(k.RecycleListView_paddingBottomNoButtons, -1);
      this.a = var3.getDimensionPixelOffset(k.RecycleListView_paddingTopNoTitle, -1);
   }
}
