package android.support.v7.widget;

import android.database.DataSetObserver;

class cx extends DataSetObserver {
   // $FF: synthetic field
   final ct a;

   cx(ct var1) {
      this.a = var1;
   }

   public void onChanged() {
      if (this.a.d()) {
         this.a.a();
      }

   }

   public void onInvalidated() {
      this.a.c();
   }
}
