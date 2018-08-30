package android.support.v7.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

class t extends FrameLayout implements android.support.v7.view.b {
   final CollapsibleActionView a;

   t(View var1) {
      super(var1.getContext());
      this.a = (CollapsibleActionView)var1;
      this.addView(var1);
   }

   public void a() {
      this.a.onActionViewExpanded();
   }

   public void b() {
      this.a.onActionViewCollapsed();
   }

   View c() {
      return (View)this.a;
   }
}
