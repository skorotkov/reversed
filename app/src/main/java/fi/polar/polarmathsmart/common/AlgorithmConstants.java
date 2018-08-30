package fi.polar.polarmathsmart.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AlgorithmConstants {
   public static final double AVG_UNDEFINED = Double.NaN;

   // $FF: synthetic method
   static double access$000(int var0) {
      return calculateAcceptableDelta(var0);
   }

   public static List asList(Collection var0, Class var1) {
      ArrayList var4;
      if (var0 == null) {
         var4 = null;
      } else {
         ArrayList var2 = new ArrayList(var0.size());
         Iterator var3 = var0.iterator();

         while(true) {
            var4 = var2;
            if (!var3.hasNext()) {
               break;
            }

            var2.add(var1.cast(var3.next()));
         }
      }

      return var4;
   }

   private static double calculateAcceptableDelta(int var0) {
      return 1.0D / Math.pow(10.0D, (double)(var0 + 1));
   }

   public static double chooseMinimumOf(Double... var0) {
      Double var1 = null;
      int var2 = var0.length;

      Double var5;
      for(int var3 = 0; var3 < var2; var1 = var5) {
         Double var4 = var0[var3];
         var5 = var4;
         if (var1 != null) {
            if (var1.compareTo(var4) > 0) {
               var5 = var4;
            } else {
               var5 = var1;
            }
         }

         ++var3;
      }

      return var1;
   }
}
