package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.types.Gender;
import java.util.List;

public interface CaloriesCalculator {
   List calculateCaloriesBarometer(List var1, List var2, Gender var3, int var4, double var5, double var7, int var9, int var10, int var11);

   List calculateCaloriesBasic(List var1, Gender var2, int var3, double var4, double var6, int var8, int var9, int var10);

   List calculateCaloriesExtended(List var1, Gender var2, int var3, double var4, double var6, int var8, int var9, int var10);
}
