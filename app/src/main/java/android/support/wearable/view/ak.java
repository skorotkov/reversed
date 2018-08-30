package android.support.wearable.view;

import android.database.DataSetObserver;

class ak extends DataSetObserver {
   // $FF: synthetic field
   final GridViewPager a;

   private ak(GridViewPager var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   ak(GridViewPager var1, ae var2) {
      this(var1);
   }

   public void onChanged() {
      GridViewPager.b(this.a);
   }

   public void onInvalidated() {
      GridViewPager.b(this.a);
   }
}
