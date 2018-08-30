package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.types.Gender;

public class DecideMetSourceAndroidImpl implements DecideMetSource {
   private native float native_decideMetSource(float var1, float var2, int var3, int var4, boolean var5);

   public float decideMetSource(float var1, float var2, int var3, Gender var4, boolean var5) {
      return this.native_decideMetSource(var1, var2, var3, var4.ordinal(), var5);
   }
}
