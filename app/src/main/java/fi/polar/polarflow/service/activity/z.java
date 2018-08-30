package fi.polar.polarflow.service.activity;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class z {
   private final Context a;
   private final fi.polar.polarflow.service.datalayer.u b;
   private final Map c;
   private final Map d;
   private final Set e;

   public z(Context var1, fi.polar.polarflow.service.datalayer.u var2) {
      this.a = var1;
      this.b = var2;
      this.c = new HashMap();
      this.d = new HashMap();
      this.e = new HashSet();
   }

   // $FF: synthetic method
   static Set a(z var0) {
      return var0.e;
   }

   private boolean b() {
      Iterator var1 = this.d.values().iterator();

      boolean var2;
      while(true) {
         if (var1.hasNext()) {
            if (!((fi.polar.polarflow.util.x)var1.next()).b) {
               continue;
            }

            var2 = true;
            break;
         }

         var2 = false;
         break;
      }

      return var2;
   }

   public void a() {
      // $FF: Couldn't be decompiled
   }

   public void a(ab var1) {
      this.e.add(var1);
   }

   public void a(fi.polar.polarflow.service.datalayer.s var1) {
      synchronized(this){}

      try {
         this.c.put(var1.b(), var1);
      } finally {
         ;
      }

   }

   public void a(fi.polar.polarflow.service.datalayer.s var1, fi.polar.polarflow.util.x var2) {
      synchronized(this){}

      try {
         this.c.put(var1.b(), var1);
         if (var2.b || !this.d.containsKey(var2.a)) {
            this.d.put(var2.a, var2);
         }
      } finally {
         ;
      }

   }

   public void b(ab var1) {
      this.e.remove(var1);
   }
}
