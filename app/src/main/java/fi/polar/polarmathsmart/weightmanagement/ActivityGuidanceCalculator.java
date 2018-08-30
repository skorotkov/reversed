package fi.polar.polarmathsmart.weightmanagement;

import fi.polar.polarmathsmart.types.Gender;

public interface ActivityGuidanceCalculator {
   ActivityGuidance calculateActivityGuidance(int var1, int var2, int var3, double var4, double var6, int var8, double var9, double var11, Gender var13);

   ActivityGuidance calculateAdditionalActivityGuidance(int var1, double var2, int var4, double var5, double var7, Gender var9);
}
