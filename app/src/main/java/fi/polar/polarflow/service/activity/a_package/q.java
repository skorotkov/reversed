package fi.polar.polarflow.service.activity.a_package;

import fi.polar.polarflow.data.orm.ActivitySamples;
import java.util.Iterator;

class q implements Iterable {
   private final ActivitySamples a;

   public q(ActivitySamples var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   static ActivitySamples a(q var0) {
      return var0.a;
   }

   public Iterator iterator() {
      return new r(this);
   }
}
