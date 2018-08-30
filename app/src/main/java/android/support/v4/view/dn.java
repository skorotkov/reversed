package android.support.v4.view;

import android.database.DataSetObserver;

class dn extends DataSetObserver {
   // $FF: synthetic field
   final ViewPager a;

   dn(ViewPager var1) {
      this.a = var1;
   }

   public void onChanged() {
      this.a.b();
   }

   public void onInvalidated() {
      this.a.b();
   }
}
