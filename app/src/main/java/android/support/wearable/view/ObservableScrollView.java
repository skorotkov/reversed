package android.support.wearable.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView {
   private an a;

   public ObservableScrollView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected void onScrollChanged(int var1, int var2, int var3, int var4) {
      super.onScrollChanged(var1, var2, var3, var4);
      if (this.a != null) {
         this.a.a((float)(var4 - var2));
      }

   }

   public void setOnScrollListener(an var1) {
      this.a = var1;
   }
}
