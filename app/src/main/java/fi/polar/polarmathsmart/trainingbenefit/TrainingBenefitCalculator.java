package fi.polar.polarmathsmart.trainingbenefit;

import fi.polar.polarmathsmart.types.Gender;
import fi.polar.polarmathsmart.types.zones.HeartRateZoneLimits;
import java.util.List;

public interface TrainingBenefitCalculator {
   TrainingFeedback calculateTrainingBenefit(List var1, int var2, Gender var3, int var4, double var5, double var7, int var9, int var10, int var11, HeartRateZoneLimits var12);
}
