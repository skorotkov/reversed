package fi.polar.polarmathsmart.fitnesstest;

import fi.polar.polarmathsmart.types.Gender;

public interface FitnessTestCalculator {
   int calculateFitnessTest(int var1, Gender var2, double var3, double var5, int var7, int var8);

   FitnessTestResult convertIntResultToResult(int var1, Gender var2, int var3);
}
