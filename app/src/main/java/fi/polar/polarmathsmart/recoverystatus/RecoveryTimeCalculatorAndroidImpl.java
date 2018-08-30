package fi.polar.polarmathsmart.recoverystatus;

import fi.polar.polarmathsmart.common.DoubleSportFactorToByte;
import fi.polar.polarmathsmart.types.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecoveryTimeCalculatorAndroidImpl implements RecoveryTimeCalculator {
   private native DailyTotalLoad native_calculateDailyTotalLoad(double[] var1, byte[] var2, byte[] var3, int var4, int var5, double var6, double var8, int var10, int var11, int var12, int var13, int var14, double var15, double var17, double var19, double var21, double var23, double var25, int var27);

   private native void native_scaleRecoveryTime(float[] var1, float[] var2, double var3);

   private double sumDoubleListBetweenIndexes(List var1, int var2, int var3) {
      double var4;
      double var6;
      for(var4 = 0.0D; var2 <= var3; var4 += var6) {
         var6 = (Double)var1.get(var2 - 1);
         ++var2;
      }

      return var4;
   }

   public double calculateDailyRecoveryTimeSum(List var1) {
      Iterator var5 = var1.iterator();
      double var2 = 0.0D;

      while(var5.hasNext()) {
         Double var4 = (Double)var5.next();
         if (var4 > 0.0D) {
            var2 += var4;
         }
      }

      return var2;
   }

   public DailyTotalLoad calculateDailyTotalLoad(List var1, List var2, List var3, Gender var4, int var5, double var6, double var8, int var10, int var11, int var12, int var13, int var14, double var15, double var17, double var19, double var21, double var23, double var25, int var27) {
      if (var1.size() != var2.size()) {
         throw new InvalidNumberOfDataPointsException("mets and sportFactors need to be equal in size!");
      } else {
         new ArrayList();
         new ArrayList();
         new ArrayList();
         new ArrayList();
         double[] var28 = new double[var1.size()];
         byte[] var29 = new byte[var2.size()];
         byte[] var30 = new byte[var3.size()];
         DoubleSportFactorToByte var31 = new DoubleSportFactorToByte();

         for(int var32 = 0; var32 < var1.size(); ++var32) {
            var28[var32] = (Double)var1.get(var32);
            var29[var32] = var31.DoubleSportFactorToByte((Double)var2.get(var32));
            var30[var32] = ((Integer)var3.get(var32)).byteValue();
         }

         return this.native_calculateDailyTotalLoad(var28, var29, var30, var4.ordinal(), var5, var6, var8, var12, var10, var11, var13, var14, var25, var15, var17, var19, var21, var23, var27);
      }
   }

   public double calculateWeeklyRecoveryTimeSumAvg(List var1, List var2, TrainingBackground var3) {
      double var4 = var3.getTypicalWeeklyRecoveryTimeSumAvg();
      ArrayList var7 = new ArrayList();

      for(int var6 = 1; var6 <= 14; ++var6) {
         if ((Integer)var2.get(var6 - 1) == 1) {
            var7.add(this.sumDoubleListBetweenIndexes(var1, (var6 - 1) * 7 + 1, var6 * 7));
         } else {
            var7.add(var4);
         }
      }

      return this.sumDoubleListBetweenIndexes(var7, 1, var7.size()) / 14.0D;
   }

   public List scaleRecoveryTime(List var1, double var2) {
      byte var4 = 0;
      ArrayList var5 = new ArrayList();
      float[] var6 = new float[var1.size()];
      float[] var7 = new float[var1.size()];

      int var8;
      for(var8 = 0; var8 < var1.size(); ++var8) {
         var6[var8] = ((Double)var1.get(var8)).floatValue();
      }

      this.native_scaleRecoveryTime(var6, var7, var2);

      for(var8 = var4; var8 < var1.size(); ++var8) {
         var5.add((double)var7[var8]);
      }

      return var5;
   }
}
