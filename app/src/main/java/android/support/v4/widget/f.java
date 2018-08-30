package android.support.v4.widget;

import android.database.DataSetObserver;

class f extends DataSetObserver {
   // $FF: synthetic field
   final d a;

   f(d var1) {
      this.a = var1;
   }

   public void onChanged() {
      this.a.a = true;
      this.a.notifyDataSetChanged();
   }

   public void onInvalidated() {
      this.a.a = false;
      this.a.notifyDataSetInvalidated();
   }
}
