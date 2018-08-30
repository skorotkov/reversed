package fi.polar.polarmathsmart.fitnesstest;

import fi.polar.polarmathsmart.types.Gender;
import java.util.List;

public class FitnessTestCalculatorAndroidImpl implements FitnessTestCalculator {
   byte[] validityData = new byte[this.native_getFitnessTestValidityDataSize()];

   public FitnessTestCalculatorAndroidImpl() {
      this.native_fitnessTestValidityDataCtor(this.validityData);
   }

   private native int native_calculateFitnessClass(int var1, int var2, int var3);

   private native int native_calculateFitnessTest(int var1, int var2, double var3, double var5, int var7, int var8, byte[] var9);

   private native int native_fitnessTestValidityDataCtor(byte[] var1);

   private native int native_getFitnessTestValidityDataSize();

   public int calculateFitnessTest(int var1, Gender var2, double var3, double var5, int var7, int var8) {
      return this.native_calculateFitnessTest(var1, var2.ordinal(), var3, var5, var7, var8, this.validityData);
   }

   public FitnessTestResult calculateFitnessTestForRRList(int var1, Gender var2, double var3, double var5, int var7, List var8) {
      int var9 = 0;
      int var10 = 0;

      while(true) {
         int var11 = var9;
         if (var10 < var8.size()) {
            var9 = this.native_calculateFitnessTest(var1, var2.ordinal(), var3, var5, var7, (Integer)var8.get(var10), this.validityData);
            var11 = var9;
            if (var9 <= 0) {
               if (var9 == -1000) {
                  break;
               }

               ++var10;
               continue;
            }
         }

         var9 = var11;
         break;
      }

      FitnessTestResult var12;
      if (var9 < 0) {
         var12 = new FitnessTestResult(var9, 0, "0");
      } else {
         var12 = this.convertIntResultToResult(var1, var2, var9);
      }

      return var12;
   }

   public FitnessTestResult convertIntResultToResult(int var1, Gender var2, int var3) {
      var1 = this.native_calculateFitnessClass(var1, var2.ordinal(), var3);
      String var4;
      switch(var1) {
      case 1:
         var4 = new String("Very low");
         break;
      case 2:
         var4 = new String("Low");
         break;
      case 3:
         var4 = new String("Fair");
         break;
      case 4:
         var4 = new String("Moderate");
         break;
      case 5:
         var4 = new String("Good");
         break;
      case 6:
         var4 = new String("Very good");
         break;
      case 7:
         var4 = new String("Elite");
         break;
      default:
         var4 = new String("N/A");
      }

      return new FitnessTestResult(var3, var1, var4);
   }
}
