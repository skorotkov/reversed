package android.support.wearable.view;

import android.util.Property;

class ap extends Property {
   ap(Class var1, String var2) {
      super(var1, var2);
   }

   public Integer a(ao var1) {
      return var1.getLevel();
   }

   public void a(ao var1, Integer var2) {
      var1.setLevel(var2);
      var1.invalidateSelf();
   }

   // $FF: synthetic method
   public Object get(Object var1) {
      return this.a((ao)var1);
   }

   // $FF: synthetic method
   public void set(Object var1, Object var2) {
      this.a((ao)var1, (Integer)var2);
   }
}
