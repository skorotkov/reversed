package fi.polar.polarflow.ui.exeview.summary;

import android.content.Context;
import android.os.Bundle;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.SwimmingStyleStatistics;
import fi.polar.polarflow.data.orm.Zones;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class h {
   public static Bundle a(Training var0) {
      Bundle var1 = new Bundle();
      var1.putLong(ah.B, var0.getSportId());
      var1.putLong(ah.o, var0.getStartTime());
      var1.putString(ah.p, var0.getSessionName());
      var1.putLong(ah.q, var0.getDurationMs());
      var1.putFloat(ah.r, var0.getTotalDistance());
      var1.putInt(ah.u, var0.getCalories());
      var1.putInt(ah.F, var0.getFatConsumption());
      Zones var2 = var0.getZones();
      if (var2 != null) {
         var1.putLongArray(ah.G, var2.getTimeInZones());
      }

      var1.putLong(ah.H, var0.getRecoveryTime());
      return var1;
   }

   public static String a(Context var0, int var1) {
      String var2;
      switch(var1) {
      case 0:
         var2 = var0.getString(2131230818);
         break;
      case 1:
         var2 = var0.getString(2131230815);
         break;
      case 2:
         var2 = var0.getString(2131230816);
         break;
      case 3:
         var2 = var0.getString(2131230817);
         break;
      default:
         var2 = "";
      }

      return var2;
   }

   static List a(SportProfileSettings var0, Context var1, Bundle var2) {
      boolean var3 = false;
      ArrayList var4 = new ArrayList();
      boolean var5;
      if (var0 != null && var0.isSwimmingSport()) {
         var5 = true;
      } else {
         var5 = false;
      }

      var4.add(g.a);
      if (var2 == null) {
         var4.add(g.r);
      } else {
         var4.add(g.b);
      }

      var4.add(g.c);
      if (a(var0, var2) || var5) {
         var4.add(g.d);
      }

      if (var5) {
         var4.add(g.i);
         var4.add(g.j);
         if (var2 != null) {
            ArrayList var6 = var2.getParcelableArrayList(ah.L);
            if (var6 != null && var6.size() > 0) {
               Iterator var7 = var6.iterator();
               var5 = var3;

               while(var7.hasNext()) {
                  SwimmingStyleStatistics var8 = (SwimmingStyleStatistics)var7.next();
                  if (var8.getDistance() > 0.0F) {
                     var3 = var5;
                     if (!var5) {
                        var4.add(g.w);
                        var3 = true;
                     }

                     switch(var8.getSwimmingStyle()) {
                     case 0:
                        var4.add(g.x);
                        var5 = var3;
                        break;
                     case 1:
                        var4.add(g.y);
                        var5 = var3;
                        break;
                     case 2:
                        var4.add(g.z);
                        var5 = var3;
                        break;
                     case 3:
                        var4.add(g.A);
                        var5 = var3;
                        break;
                     default:
                        fi.polar.polarflow.util.d.f("Utils", "Unsupported swimming style: " + var8.getSwimmingStyle());
                        var5 = var3;
                     }
                  }
               }
            }
         }

         var4.add(g.f);
         var4.add(g.g);
      } else {
         if (d(var0, var2)) {
            var4.add(g.f);
            var4.add(g.g);
         }

         if (a(var0, var2)) {
            var4.add(g.i);
            var4.add(g.j);
         }

         if (c(var0, var2)) {
            var4.add(g.u);
            var4.add(g.v);
         }

         if (b(var0, var2)) {
            var4.add(g.l);
            var4.add(g.m);
            var4.add(g.n);
         }
      }

      var4.add(g.k);
      var4.add(g.t);
      if (d(var0, var2)) {
         var4.add(g.s);
      }

      if (b(var2)) {
         var4.add(g.o);
      }

      if (c(var2)) {
         var4.add(g.p);
      }

      if (a(var2)) {
         var4.add(g.q);
      }

      return a((List)var4, var1, var2);
   }

   static List a(SportProfile var0, Context var1) {
      SportProfileSettings var2;
      if (var0 != null) {
         var2 = var0.getSettings();
      } else {
         var2 = null;
      }

      return a((SportProfileSettings)var2, var1, (Bundle)null);
   }

   public static List a(List var0, Context var1, Bundle var2) {
      ArrayList var3 = new ArrayList();

      for(int var4 = 0; var4 < var0.size(); ++var4) {
         fi.polar.polarflow.ui.exeview.summary.a.f var5 = new fi.polar.polarflow.ui.exeview.summary.a.f();
         var5.a((g)var0.get(var4));
         var5.a(var2);
         var5.a((List)var3);
         var3.add(var5.a(var1));
      }

      return var3;
   }

   private static boolean a(Bundle var0) {
      boolean var1;
      if (var0 != null && var0.getInt(ah.D, -1) != -1) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static boolean a(SportProfileSettings var0, Bundle var1) {
      boolean var2 = false;
      boolean var3;
      if (var0 != null && var0.isSensorEnabled(4)) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4;
      if (var1 != null && var1.getFloat(ah.r, -1.0F) > 0.0F) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var3 || var4) {
         var2 = true;
      }

      return var2;
   }

   private static boolean b(Bundle var0) {
      boolean var1;
      if (var0 != null && var0.getInt(ah.E, -1) != -1) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static boolean b(SportProfileSettings var0, Bundle var1) {
      boolean var2 = false;
      boolean var3;
      if (var0 != null && var0.isSensorEnabled(4)) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4;
      if (var1 != null && !Float.isNaN(var1.getFloat(ah.I, Float.NaN))) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var3 || var4) {
         var2 = true;
      }

      return var2;
   }

   private static boolean c(Bundle var0) {
      boolean var1;
      if (var0 != null && var0.getLong(ah.H, -1L) != -1L) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static boolean c(SportProfileSettings var0, Bundle var1) {
      boolean var2 = false;
      boolean var3;
      if (var0 != null && var0.isSensorEnabled(8)) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4;
      if (var1 != null && var1.getInt(ah.s, -1) != -1) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var3 || var4) {
         var2 = true;
      }

      return var2;
   }

   private static boolean d(SportProfileSettings var0, Bundle var1) {
      boolean var2 = false;
      boolean var3;
      if (var0 != null && var0.isSensorEnabled(1)) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4;
      if (var1 != null && var1.getInt(ah.v, -1) > 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var3 || var4) {
         var2 = true;
      }

      return var2;
   }
}
