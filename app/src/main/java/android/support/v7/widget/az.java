package android.support.v7.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

class az implements OnDismissListener {
   // $FF: synthetic field
   final OnGlobalLayoutListener a;
   // $FF: synthetic field
   final aw b;

   az(aw var1, OnGlobalLayoutListener var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onDismiss() {
      ViewTreeObserver var1 = this.b.b.getViewTreeObserver();
      if (var1 != null) {
         var1.removeGlobalOnLayoutListener(this.a);
      }

   }
}
