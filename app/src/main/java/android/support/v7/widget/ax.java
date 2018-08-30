package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class ax implements OnItemClickListener {
   // $FF: synthetic field
   final at a;
   // $FF: synthetic field
   final aw b;

   ax(aw var1, at var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      this.b.b.setSelection(var3);
      if (this.b.b.getOnItemClickListener() != null) {
         this.b.b.performItemClick(var2, var3, this.b.a.getItemId(var3));
      }

      this.b.c();
   }
}
