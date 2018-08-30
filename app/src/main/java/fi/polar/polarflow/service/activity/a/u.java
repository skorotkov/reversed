package fi.polar.polarflow.service.activity.a;

import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

class u implements Iterator {
   // $FF: synthetic field
   final t a;
   private final List b;
   private DateTime c;
   private int d;

   public u(t var1) {
      this.a = var1;
      this.b = t.a(var1).cloneStepsSampleList();
      int var2 = (int)(t.a(var1).getStepsRecordingInterval() - t.a(var1).getMetRecordingInterval());
      this.c = t.a(var1).getStartTime().plusMillis(var2);
      this.d = 0;
   }

   public s a() {
      s var1 = new s(this.c, (float)(Integer)this.b.get(this.d));
      this.c = this.c.plusMillis((int)t.a(this.a).getStepsRecordingInterval());
      ++this.d;
      return var1;
   }

   public boolean hasNext() {
      boolean var1;
      if (this.d < this.b.size()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   // $FF: synthetic method
   public Object next() {
      return this.a();
   }

   public void remove() {
      fi.polar.polarflow.util.d.c("SummarizerInputStepsIterable", "", new UnsupportedOperationException("remove() not supported"));
   }
}
