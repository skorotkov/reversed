package fi.polar.polarflow.ui.exewait;

import android.app.FragmentManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class h extends fi.polar.polarflow.ui.custom.p {
   private static final Map d;

   static {
      HashMap var0 = new HashMap();
      var0.put(o.a, x.class);
      var0.put(o.b, v.class);
      var0.put(o.c, m.class);
      d = Collections.unmodifiableMap(var0);
   }

   public h(FragmentManager var1, boolean var2, boolean var3, boolean var4) {
      super(var1, b(var2, var3, var4));
   }

   private static List b(boolean var0, boolean var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      var3.add(o.a);
      if (!var0) {
         if (var1) {
            var3.add(o.b);
         }

         if (var2) {
            var3.add(o.c);
         }
      }

      return var3;
   }

   protected Class a(Enum var) {
      o var1 = (o)var;
      return (Class)d.get(var1);
   }

   public boolean a(boolean var1, boolean var2, boolean var3) {
      boolean var4 = true;
      List var5 = b(var1, var2, var3);
      List var6 = this.f();
      if (var6.size() != var5.size()) {
         var1 = var4;
      } else {
         Iterator var7 = var6.iterator();
         var1 = false;

         while(var7.hasNext()) {
            if (!var5.contains((o)var7.next())) {
               var1 = true;
            }
         }
      }

      if (var1) {
         this.a((List)var5);
      }

      return var1;
   }
}
