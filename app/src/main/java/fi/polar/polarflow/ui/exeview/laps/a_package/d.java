package fi.polar.polarflow.ui.exeview.laps.a_package;

import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.ui.exeview.a_package.a_package.bj;
import java.util.ArrayList;
import java.util.List;

public class d {
   static List a(SportProfileSettings var0, boolean var1) {
      byte var2 = 0;
      boolean var3;
      int var4;
      boolean var5;
      if (var0 != null) {
         var3 = var0.isSensorEnabled(4);
         var4 = var0.getAutomaticLap();
         var5 = var0.isSwimmingSport();
      } else {
         var4 = -1;
         var3 = false;
         var5 = false;
      }

      List var8 = a(var3, var4, var1, var5);
      ArrayList var6 = new ArrayList();

      for(var4 = var2; var4 < var8.size(); ++var4) {
         fi.polar.polarflow.ui.exeview.laps.a_package.a_package.a var7 = new fi.polar.polarflow.ui.exeview.laps.a_package.a_package.a();
         var7.a(var4);
         var7.b((Integer)var8.get(var4));
         var7.a(bj.a);
         var6.add(var7.a());
      }

      return var6;
   }

   private static List a(boolean var0, int var1, boolean var2, boolean var3) {
      ArrayList var4 = new ArrayList();
      if (var3) {
         if (var2) {
            var4.add(8);
         } else {
            var4.add(201);
         }

         var4.add(205);
         var4.add(204);
      } else if (var0) {
         if (var1 == 3) {
            var4.add(205);
         } else if (var2) {
            var4.add(8);
         } else {
            var4.add(201);
         }

         var4.add(204);
         var4.add(200);
      } else {
         if (var2) {
            var4.add(8);
         } else {
            var4.add(201);
         }

         var4.add(210);
         var4.add(200);
      }

      return var4;
   }
}
