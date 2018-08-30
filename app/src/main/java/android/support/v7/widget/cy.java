package android.support.v7.widget;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class cy implements OnScrollListener {
   // $FF: synthetic field
   final ct a;

   cy(ct var1) {
      this.a = var1;
   }

   public void onScroll(AbsListView var1, int var2, int var3, int var4) {
   }

   public void onScrollStateChanged(AbsListView var1, int var2) {
      if (var2 == 1 && !this.a.n() && this.a.g.getContentView() != null) {
         this.a.f.removeCallbacks(this.a.e);
         this.a.e.run();
      }

   }
}
