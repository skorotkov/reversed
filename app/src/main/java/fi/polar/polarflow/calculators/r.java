package fi.polar.polarflow.calculators;

import android.util.SparseIntArray;
import fi.polar.polarmathsmart.trainingbenefit.TrainingFeedback;

final class r extends SparseIntArray {
   r(int var1) {
      super(var1);
      this.append(TrainingFeedback.NONE.ordinal(), 1);
      this.append(TrainingFeedback.MAXIMUM_TRAINING_PLUS.ordinal(), 2);
      this.append(TrainingFeedback.MAXIMUM_TRAINING.ordinal(), 3);
      this.append(TrainingFeedback.MAXIMUM_AND_TEMPO_TRAINING.ordinal(), 4);
      this.append(TrainingFeedback.TEMPO_AND_MAXIMUM_TRAINING.ordinal(), 5);
      this.append(TrainingFeedback.TEMPO_TRAINING_PLUS.ordinal(), 6);
      this.append(TrainingFeedback.TEMPO_TRAINING.ordinal(), 7);
      this.append(TrainingFeedback.TEMPO_AND_STEADY_STATE_TRAINING.ordinal(), 8);
      this.append(TrainingFeedback.STEADY_STATE_AND_TEMPO_TRAINING.ordinal(), 9);
      this.append(TrainingFeedback.STEADY_STATE_TRAINING_PLUS.ordinal(), 10);
      this.append(TrainingFeedback.STEADY_STATE_TRAINING.ordinal(), 11);
      this.append(TrainingFeedback.STEADY_STATE_AND_BASIC_TRAINING_LONG.ordinal(), 12);
      this.append(TrainingFeedback.STEADY_STATE_AND_BASIC_TRAINING.ordinal(), 13);
      this.append(TrainingFeedback.BASIC_AND_STEADY_STATE_TRAINING_LONG.ordinal(), 14);
      this.append(TrainingFeedback.BASIC_AND_STEADY_STATE_TRAINING.ordinal(), 15);
      this.append(TrainingFeedback.BASIC_TRAINING_LONG.ordinal(), 16);
      this.append(TrainingFeedback.BASIC_TRAINING.ordinal(), 17);
      this.append(TrainingFeedback.RECOVERY_TRAINING.ordinal(), 18);
   }
}
