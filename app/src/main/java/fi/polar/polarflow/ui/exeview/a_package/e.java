package fi.polar.polarflow.ui.exeview.a_package;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.data.SportProfileDisplaySettings;
import fi.polar.polarflow.data.SportProfileDisplaySettings$Display;
import fi.polar.polarflow.data.SportProfileDisplaySettings$DisplayItem;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ai;
import fi.polar.polarflow.ui.exeview.a_package.a_package.bj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e {
   private static final int[] a = new int[]{2131755162, 2131755163, 2131755164, 2131755165};

   static View a(LayoutInflater var0, ViewGroup var1, a var2) {
      View var4 = var0.inflate(var2.a(), var1, false);

      for(int var3 = 0; var3 < var2.f(); ++var3) {
         var0.inflate(((ah)var2.e().get(var3)).a(), (ViewGroup)a(var4, var3), true);
      }

      return var4;
   }

   public static View a(View var0, int var1) {
      return var0.findViewById(a[var1]);
   }

   private static bj a(int var0, int var1) {
      bj var2;
      switch(var0) {
      case 1:
         var2 = bj.c;
         break;
      case 2:
         var2 = bj.b;
         break;
      case 3:
         if (var1 >= 1) {
            var2 = bj.a;
         } else {
            var2 = bj.b;
         }
         break;
      case 4:
         var2 = bj.a;
         break;
      default:
         var2 = bj.d;
      }

      return var2;
   }

   static List a(SportProfileDisplaySettings var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         Iterator var4 = var0.getDisplayList().iterator();

         while(var4.hasNext()) {
            SportProfileDisplaySettings$Display var2 = (SportProfileDisplaySettings$Display)var4.next();
            a var3 = new a();
            var3.a(a(var2.getDisplayItems()));
            var1.add(var3);
         }
      }

      return var1;
   }

   static List a(List var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         ai var3 = new ai();
         var3.a(var2);
         var3.b(((SportProfileDisplaySettings$DisplayItem)var0.get(var2)).getValue());
         var3.a(a(var0.size(), var2));
         var1.add(var3.a());
      }

      return var1;
   }
}
