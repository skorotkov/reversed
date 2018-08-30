package fi.polar.polarmathsmart.heartrate;

import fi.polar.polarmathsmart.types.Gender;
import java.util.List;

public interface MetabolicEquivalentHeartRateCalculator {
   List calculateHeartRateToMetabolicEquivalentList(Gender var1, int var2, double var3, double var5, int var7, int var8, int var9);

   List calculateHeartRatesFromMetabolicEquivalents(List var1, Gender var2, int var3, double var4, double var6, int var8, int var9, int var10);

   List calculateMetabolicEquivalentsFromHeartrates(List var1, Gender var2, int var3, double var4, double var6, int var8, int var9, int var10);
}
