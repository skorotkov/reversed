package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.activity.model.ActivityGuidance;
import fi.polar.polarmathsmart.types.Gender;
import java.util.ArrayList;

public class ActivityGuidanceAndroidImpl implements DefineActivityGuidance {
   public ActivityGuidance defineActivityGuidance(float var1, int var2, Gender var3) {
      byte var4 = 0;
      ActivityGuidance var5 = new ActivityGuidance();
      int[] var6 = new int[31];
      this.native_defineActivityGuidance(var1, var2, var3.ordinal(), var6);
      var5.setGuidanceLight(var6[0]);
      var5.setGuidanceModerate(var6[1]);
      var5.setGuidanceVigorous(var6[2]);
      ArrayList var7 = new ArrayList();

      for(var2 = 0; var2 < 10; ++var2) {
         var7.add(var6[var2 + 3]);
      }

      var5.setGuidanceForActivityListLight(var7);
      var7 = new ArrayList();

      for(var2 = 0; var2 < 9; ++var2) {
         var7.add(var6[var2 + 13]);
      }

      var5.setGuidanceForActivityListModerate(var7);
      var7 = new ArrayList();

      for(var2 = var4; var2 < 8; ++var2) {
         var7.add(var6[var2 + 22]);
      }

      var5.setGuidanceForActivityListVigorous(var7);
      return var5;
   }

   native void native_defineActivityGuidance(float var1, int var2, int var3, int[] var4);
}
