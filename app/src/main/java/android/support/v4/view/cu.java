package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;
import android.view.View.OnApplyWindowInsetsListener;

final class cu implements OnApplyWindowInsetsListener {
   // $FF: synthetic field
   final cv a;

   cu(cv var1) {
      this.a = var1;
   }

   public WindowInsets onApplyWindowInsets(View var1, WindowInsets var2) {
      return (WindowInsets)this.a.a(var1, var2);
   }
}
