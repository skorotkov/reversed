package fi.polar.polarflow.service.activity.a;

import fi.polar.polarflow.data.orm.ActivityInfo;
import fi.polar.polarflow.data.orm.ActivitySamplesInfoChild;
import fi.polar.polarflow.data.orm.SportInfo;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

class r implements Iterator {
   // $FF: synthetic field
   final q a;
   private final List b;
   private final List c;
   private final List d;
   private DateTime e;
   private int f;
   private int g;
   private int h;

   public r(q var1) {
      this.a = var1;
      this.b = q.a(var1).cloneMetSampleList();
      this.c = q.a(var1).cloneSportInfoList();
      this.d = q.a(var1).cloneActivityInfoList();
      this.e = q.a(var1).getStartTime();
   }

   private int a(int var1, List var2) {
      int var3 = var1 + 1;
      int var4 = var1;

      for(var1 = var3; var1 < var2.size(); var4 = var1++) {
         DateTime var5 = ((ActivitySamplesInfoChild)var2.get(var1)).getTimestamp();
         if (this.e.isBefore(var5)) {
            break;
         }
      }

      return var4;
   }

   private int b() {
      int var1;
      if (this.h < this.d.size()) {
         var1 = ((ActivityInfo)this.d.get(this.h)).getValue();
      } else {
         var1 = 8;
      }

      return var1;
   }

   private long c() {
      long var1;
      if (this.g < this.c.size()) {
         var1 = ((SportInfo)this.c.get(this.g)).getSportId();
      } else {
         var1 = -1L;
      }

      return var1;
   }

   public p a() {
      p var1 = new p(this.e, (Float)this.b.get(this.f), this.c(), this.b());
      this.e = this.e.plusMillis((int)q.a(this.a).getMetRecordingInterval());
      ++this.f;
      this.g = this.a(this.g, this.c);
      this.h = this.a(this.h, this.d);
      return var1;
   }

   public boolean hasNext() {
      boolean var1;
      if (this.f < this.b.size()) {
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
      fi.polar.polarflow.util.d.c("SummarizerInputMetIterable", "", new UnsupportedOperationException("remove() not supported"));
   }
}
