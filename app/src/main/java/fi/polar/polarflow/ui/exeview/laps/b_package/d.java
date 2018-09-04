package fi.polar.polarflow.ui.exeview.laps.b_package;

import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.ui.exeview.a_package.a_package.bj;
import java.util.ArrayList;
import java.util.List;

public class d {
   static List a(SportProfileSettings var0, boolean var1) {
      int var2 = 0;
      boolean var3;
      boolean var4;
      if (var0 != null) {
         var3 = var0.isSensorEnabled(4);
         var4 = var0.isSwimmingSport();
      } else {
         var4 = false;
         var3 = false;
      }

      List var5 = a(var3, var1, var4);

      ArrayList var6;
      for(var6 = new ArrayList(); var2 < var5.size(); ++var2) {
         fi.polar.polarflow.ui.exeview.laps.b_package.a_package.a var7 = new fi.polar.polarflow.ui.exeview.laps.b_package.a_package.a();
         var7.a(var2);
         var7.b((Integer)var5.get(var2));
         var7.a(bj.a);
         var6.add(var7.a());
      }

      return var6;
   }

   private static List a(boolean var0, boolean var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      if (var2) {
         if (var1) {
            var3.add(7);
         } else {
            var3.add(6);
         }

         var3.add(38);
         var3.add(44);
      } else if (var0) {
         if (var1) {
            var3.add(7);
         } else {
            var3.add(6);
         }

         var3.add(44);
         var3.add(24);
      } else {
         if (var1) {
            var3.add(7);
         } else {
            var3.add(6);
         }

         var3.add(25);
         var3.add(24);
      }

      return var3;
   }
}
