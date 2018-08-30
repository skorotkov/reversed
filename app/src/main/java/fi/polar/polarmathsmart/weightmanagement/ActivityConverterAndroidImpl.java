package fi.polar.polarmathsmart.weightmanagement;

import fi.polar.polarmathsmart.types.Gender;

public class ActivityConverterAndroidImpl implements ActivityConverter {
   private native double native_convertKilocaloriesToActivityMetMinutes(int var1, int var2, double var3, double var5, int var7);

   public double convertKilocaloriesToActivityMetMinutes(int var1, int var2, double var3, double var5, Gender var7) {
      return this.native_convertKilocaloriesToActivityMetMinutes(var1, var2, var3, var5, var7.ordinal());
   }
}
