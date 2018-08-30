package fi.polar.polarmathsmart.types;

import java.util.Map;
import java.util.NavigableMap;

public enum FitnessClass {
   ELITE,
   FAIR,
   GOOD,
   LOW,
   MODERATE,
   VERY_GOOD,
   VERY_LOW;

   private static Map indexMap = new FitnessClass$3();
   private static NavigableMap vo2maxLowerLimitsForFemale = new FitnessClass$2();
   private static NavigableMap vo2maxLowerLimitsForMale = new FitnessClass$1();

   private static FitnessClass findFitnessClass(Integer var0, Short[] var1) {
      int var2 = var1.length - 1;

      FitnessClass var4;
      while(true) {
         if (var2 < 0) {
            var4 = VERY_LOW;
            break;
         }

         Short var3 = var1[var2];
         if (var0 >= var3) {
            var4 = fromIndex(var2 + 1);
            break;
         }

         --var2;
      }

      return var4;
   }

   private static FitnessClass fromIndex(int var0) {
      return (FitnessClass)indexMap.get(var0);
   }

   public static FitnessClass fromVo2Max(Integer var0, Integer var1, Gender var2) {
      NavigableMap var3;
      if (var2 == Gender.MALE) {
         var3 = vo2maxLowerLimitsForMale;
      } else {
         var3 = vo2maxLowerLimitsForFemale;
      }

      return findFitnessClass(var0, (Short[])var3.ceilingEntry(var1).getValue());
   }
}
