package fi.polar.polarflow.service.activity.a_package;

import android.util.SparseArray;

class a {
   private final SparseArray a = new b(this);

   public a() {
   }

   public long a(int var1) {
      Long var2 = (Long)this.a.get(var1);
      long var3;
      if (var2 != null) {
         var3 = var2;
      } else {
         var3 = 0L;
      }

      return var3;
   }

   public void a() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         this.a.setValueAt(var1, 0L);
      }

   }

   public void a(int var1, long var2) {
      var1 = this.a.indexOfKey(var1);
      if (var1 >= 0) {
         this.a.setValueAt(var1, (Long)this.a.valueAt(var1) + var2);
      }

   }
}
