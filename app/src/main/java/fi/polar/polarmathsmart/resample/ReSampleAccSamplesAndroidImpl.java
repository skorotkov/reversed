package fi.polar.polarmathsmart.resample;

public class ReSampleAccSamplesAndroidImpl {
   float lastAccX;
   float lastAccY;
   float lastAccZ;
   long mProcessedTimeStamp = 0L;
   boolean mfillGaps;

   public ReSampleAccSamplesAndroidImpl(boolean var1) {
      this.mfillGaps = var1;
      this.lastAccX = 0.0F;
      this.lastAccY = 0.0F;
      this.lastAccZ = 0.0F;
   }

   public ReSampleOutput feedAccSample(float var1, float var2, float var3, long var4) {
      ReSampleOutput var6 = null;
      ReSampleOutput var7 = null;
      if (this.mProcessedTimeStamp == 0L) {
         var7 = new ReSampleOutput(var1, var2, var3, var4);
         this.mProcessedTimeStamp = var4;
         this.lastAccX = var1;
         this.lastAccY = var2;
         this.lastAccZ = var3;
      } else if (var4 - this.mProcessedTimeStamp >= 20000000L) {
         this.mProcessedTimeStamp += 20000000L;
         var7 = var6;
         if (var4 - this.mProcessedTimeStamp >= 20000000L) {
            if (this.mfillGaps) {
               var6 = new ReSampleOutput();

               while(true) {
                  var7 = var6;
                  if (var4 - this.mProcessedTimeStamp < 20000000L) {
                     break;
                  }

                  var6.add(this.lastAccX, this.lastAccY, this.lastAccZ, this.mProcessedTimeStamp);
                  this.mProcessedTimeStamp += 20000000L;
               }
            } else {
               this.mProcessedTimeStamp = var4;
               var7 = var6;
            }
         }

         this.lastAccX = var1;
         this.lastAccY = var2;
         this.lastAccZ = var3;
         if (var7 == null) {
            var7 = new ReSampleOutput(var1, var2, var3, this.mProcessedTimeStamp);
         } else {
            var7.add(var1, var2, var3, this.mProcessedTimeStamp);
         }
      }

      return var7;
   }
}
