package fi.polar.polarflow.ftu;

import android.content.Context;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.service.datalayer.s;
import fi.polar.polarflow.service.datalayer.t;
import fi.polar.polarflow.util.w;
import java.util.ArrayList;
import java.util.List;

public class a {
   public static List a(Context var0) {
      synchronized(a.class){}

      List var6;
      try {
         ArrayList var1 = new ArrayList();
         s var2 = new s(2, "/U/0/SPROF");
         var2.a(1);
         s var3 = new s(2, "/U/0/SPORT");
         var3.a(1);
         var1.add(var2);
         var1.add(var3);
         t var7 = new t(var0);
         var7.execute((s[])var1.toArray(new s[var1.size()]));
         c(var0);
         var6 = SportProfile.listAllInOrder();
         SportProfile.setSport(var6, Sport.listAll(Sport.class));
      } finally {
         ;
      }

      return var6;
   }

   public static List b(Context param0) {
      // $FF: Couldn't be decompiled
      return null;
   }

   public static void c(Context var0) {
      synchronized(a.class){}

      try {
         List var1 = b(var0);
         var1.add(w.a().createDataLayerRequest());
         t var2 = new t(var0);
         var2.execute((s[])var1.toArray(new s[var1.size()]));
      } finally {
         ;
      }

   }

   private static List d(Context param0) {
      // $FF: Couldn't be decompiled
      return null;
   }
}
