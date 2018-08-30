package fi.polar.polarmathsmart.weightmanagement;

public interface WeightProgramDurationCalculator {
   short calculateMinimumProgramDurationAfterTwoWeeks(int var1, int var2);

   WeightProgramDurationMinMax calculateProgramDurationMinMax(int var1, int var2);
}
