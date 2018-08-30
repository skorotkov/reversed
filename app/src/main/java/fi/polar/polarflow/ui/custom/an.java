package fi.polar.polarflow.ui.custom;

import android.util.Property;

class an extends Property {
   // $FF: synthetic field
   final WearableLinearLayoutManager a;

   an(WearableLinearLayoutManager var1) {
      super(Integer.class, "scrollVertically");
      this.a = var1;
   }

   public Integer a(WearableLinearLayoutManager var1) {
      return WearableLinearLayoutManager.a(var1);
   }

   public void a(WearableLinearLayoutManager var1, Integer var2) {
      WearableLinearLayoutManager.a(var1, var2);
   }

   // $FF: synthetic method
   public Object get(Object var1) {
      return this.a((WearableLinearLayoutManager)var1);
   }

   // $FF: synthetic method
   public void set(Object var1, Object var2) {
      this.a((WearableLinearLayoutManager)var1, (Integer)var2);
   }
}
