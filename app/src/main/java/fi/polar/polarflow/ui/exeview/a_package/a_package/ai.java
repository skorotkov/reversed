package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ai {
   private static final Map e;
   private int a;
   private int b;
   private Bundle c = null;
   private bj d;

   static {
      HashMap var0 = new HashMap();
      var0.put(3, z.class);
      var0.put(37, x.class);
      var0.put(41, bk.class);
      var0.put(42, bl.class);
      var0.put(43, bm.class);
      var0.put(2, bp.class);
      var0.put(20, ab.class);
      var0.put(21, ac.class);
      var0.put(22, ad.class);
      var0.put(49, q.class);
      var0.put(50, r.class);
      var0.put(240, s.class);
      var0.put(208, c.class);
      var0.put(212, d.class);
      var0.put(51, al.class);
      var0.put(52, am.class);
      var0.put(53, ba.class);
      var0.put(27, t.class);
      var0.put(8, m.class);
      var0.put(7, bg.class);
      var0.put(6, au.class);
      var0.put(201, l.class);
      var0.put(200, h.class);
      var0.put(24, aq.class);
      var0.put(218, aw.class);
      var0.put(26, bc.class);
      var0.put(210, i.class);
      var0.put(219, ax.class);
      var0.put(25, ar.class);
      var0.put(28, bd.class);
      var0.put(205, g.class);
      var0.put(38, ap.class);
      var0.put(217, av.class);
      var0.put(39, bb.class);
      var0.put(204, j.class);
      var0.put(44, as.class);
      var0.put(215, ay.class);
      var0.put(220, be.class);
      var0.put(211, k.class);
      var0.put(47, at.class);
      var0.put(216, az.class);
      var0.put(48, bf.class);
      var0.put(10, n.class);
      var0.put(12, v.class);
      var0.put(11, o.class);
      var0.put(206, a.class);
      var0.put(207, e.class);
      var0.put(16, aj.class);
      var0.put(17, an.class);
      var0.put(32, ae.class);
      var0.put(33, bn.class);
      var0.put(69, bh.class);
      e = Collections.unmodifiableMap(var0);
   }

   public ah a() {
      Class var1 = (Class)e.get(this.b);
      Object var4;
      if (var1 != null) {
         label16: {
            try {
               var4 = (ah)var1.newInstance();
               break label16;
            } catch (InstantiationException var2) {
               var4 = var2;
            } catch (IllegalAccessException var3) {
               var4 = var3;
            }

            fi.polar.polarflow.util.d.c(ah.q(), "", (Throwable)var4);
            var4 = new y();
         }
      } else {
         var4 = new y();
      }

      ((ah)var4).f(this.b);
      ((ah)var4).e(this.a);
      ((ah)var4).a(this.d);
      ((ah)var4).b(this.c);
      return (ah)var4;
   }

   public ai a(int var1) {
      this.a = var1;
      return this;
   }

   public ai a(Bundle var1) {
      this.c = var1;
      return this;
   }

   public ai a(bj var1) {
      this.d = var1;
      return this;
   }

   public ai b(int var1) {
      this.b = var1;
      return this;
   }
}
