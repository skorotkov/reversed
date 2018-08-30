package android.support.v4.b;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public class br {
   static final cb a;

   static {
      if (android.support.v4.f.c.a()) {
         a = new ce();
      } else if (VERSION.SDK_INT >= 21) {
         a = new cd();
      } else if (VERSION.SDK_INT >= 20) {
         a = new cc();
      } else if (VERSION.SDK_INT >= 19) {
         a = new cj();
      } else if (VERSION.SDK_INT >= 16) {
         a = new ci();
      } else if (VERSION.SDK_INT >= 14) {
         a = new ch();
      } else if (VERSION.SDK_INT >= 11) {
         a = new cg();
      } else {
         a = new cf();
      }

   }

   static void a(bp var0, ArrayList var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         var0.a((bs)var2.next());
      }

   }

   static void a(bq var0, ck var1) {
      if (var1 != null) {
         if (var1 instanceof bv) {
            bv var2 = (bv)var1;
            cx.a(var0, var2.e, var2.g, var2.f, var2.a);
         } else if (var1 instanceof by) {
            by var3 = (by)var1;
            cx.a(var0, var3.e, var3.g, var3.f, var3.a);
         } else if (var1 instanceof bu) {
            bu var4 = (bu)var1;
            cx.a(var0, var4.e, var4.g, var4.f, var4.a, var4.b, var4.c);
         }
      }

   }

   static void b(bq var0, ck var1) {
      if (var1 != null) {
         if (var1 instanceof bz) {
            bz var2 = (bz)var1;
            ArrayList var3 = new ArrayList();
            ArrayList var4 = new ArrayList();
            ArrayList var5 = new ArrayList();
            ArrayList var9 = new ArrayList();
            ArrayList var6 = new ArrayList();
            Iterator var7 = var2.c.iterator();

            while(var7.hasNext()) {
               ca var8 = (ca)var7.next();
               var3.add(var8.a());
               var4.add(var8.b());
               var5.add(var8.c());
               var9.add(var8.d());
               var6.add(var8.e());
            }

            cp.a(var0, var2.a, var2.b, var3, var4, var5, var9, var6);
         } else {
            a(var0, var1);
         }
      }

   }
}
