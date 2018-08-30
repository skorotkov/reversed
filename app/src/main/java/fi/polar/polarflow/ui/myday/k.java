package fi.polar.polarflow.ui.myday;

import android.app.FragmentManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class k extends fi.polar.polarflow.ui.custom.p {
   private static final Map d;

   static {
      HashMap var0 = new HashMap();
      var0.put(fi.polar.polarflow.ui.myday.e.a, h.class);
      var0.put(fi.polar.polarflow.ui.myday.e.b, l.class);
      d = Collections.unmodifiableMap(var0);
   }

   public k(FragmentManager var1, boolean var2) {
      super(var1, a(var2));
   }

   private static List a(boolean var0) {
      ArrayList var1 = new ArrayList();
      var1.add(fi.polar.polarflow.ui.myday.e.a);
      if (var0) {
         var1.add(fi.polar.polarflow.ui.myday.e.b);
      }

      return var1;
   }

   protected Class a(e var1) {
      return (Class)d.get(var1);
   }
}
