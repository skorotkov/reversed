package fi.polar.polarflow.service.activity.a;

import fi.polar.polarflow.data.orm.ActivitySamples;
import java.util.Iterator;

class t implements Iterable {
   private final ActivitySamples a;

   public t(ActivitySamples var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   static ActivitySamples a(t var0) {
      return var0.a;
   }

   public Iterator iterator() {
      return new u(this);
   }
}
