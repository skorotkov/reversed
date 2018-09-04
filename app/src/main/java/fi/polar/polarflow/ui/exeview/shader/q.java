package fi.polar.polarflow.ui.exeview.shader;

import android.app.FragmentManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q extends fi.polar.polarflow.ui.custom.p {
   private static final Map d;

   static {
      HashMap var0 = new HashMap();
      var0.put(p.b, e.class);
      var0.put(p.a, d.class);
      var0.put(p.c, j.class);
      d = Collections.unmodifiableMap(var0);
   }

   public q(FragmentManager var1, List var2) {
      super(var1, var2);
   }

   protected Class a(Enum var) {
      p var1 = (p)var;
      return (Class)d.get(var1);
   }
}
