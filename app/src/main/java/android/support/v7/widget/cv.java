package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class cv implements OnItemSelectedListener {
   // $FF: synthetic field
   final ct a;

   cv(ct var1) {
      this.a = var1;
   }

   public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      if (var3 != -1) {
         bv var6 = this.a.c;
         if (var6 != null) {
            var6.setListSelectionHidden(false);
         }
      }

   }

   public void onNothingSelected(AdapterView var1) {
   }
}
