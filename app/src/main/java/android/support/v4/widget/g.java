package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
//import android.widget.Filter.FilterResults;

class g extends Filter {
   h a;

   g(h var1) {
      this.a = var1;
   }

   public CharSequence convertResultToString(Object var1) {
      return this.a.c((Cursor)var1);
   }

   protected FilterResults performFiltering(CharSequence var1) {
      Cursor var3 = this.a.a(var1);
      FilterResults var2 = new FilterResults();
      if (var3 != null) {
         var2.count = var3.getCount();
         var2.values = var3;
      } else {
         var2.count = 0;
         var2.values = null;
      }

      return var2;
   }

   protected void publishResults(CharSequence var1, FilterResults var2) {
      Cursor var3 = this.a.a();
      if (var2.values != null && var2.values != var3) {
         this.a.a((Cursor)var2.values);
      }

   }
}
