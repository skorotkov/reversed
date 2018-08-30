package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bj implements q {
   private static final String a = bj.class.getSimpleName();
   private final List b = new ArrayList();

   public bj() {
      this.b.add(new bk());
      this.b.add(new ad());
      this.b.add(new ah());
      this.b.add(new ag());
      this.b.add(new ae());
      this.b.add(new af());
      this.b.add(new aa());
      this.b.add(new ab());
      this.b.add(new ai());
      this.b.add(new ac());
      this.b.add(new bq());
      this.b.add(new bb());
   }

   private q b(String var1) {
      Iterator var2 = this.b.iterator();

      q var4;
      while(true) {
         if (var2.hasNext()) {
            q var3 = (q)var2.next();
            if (!var1.matches(var3.a())) {
               continue;
            }

            var4 = var3;
            break;
         }

         var4 = null;
         break;
      }

      return var4;
   }

   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+";
   }

   public void a(Context var1, String var2, InputStream var3) {
      q var4 = this.b(var2);
      if (var4 != null) {
         var4.a(var1, var2, var3);
      } else if (!"ID".equals(v.c(v.b(var2)))) {
         fi.polar.polarflow.util.d.e(a, "No receiver found for " + var2);
      }

   }

   public void a(String var1) {
      q var2 = this.b(var1);
      if (var2 != null) {
         var2.a(var1);
      } else if (!"ID".equals(v.c(v.b(var1)))) {
         fi.polar.polarflow.util.d.e(a, "No receiver found for " + var1);
      }

   }
}
