package fi.polar.polarmathsmart.recoverystatus;

public enum TrainingBackground {
   FREQUENT(30.0D),
   HEAVY(40.0D),
   OCCASIONAL(10.0D),
   PRO(80.0D),
   REGULAR(20.0D),
   SEMI_PRO(60.0D);

   private double typicalWeeklyRecoveryTimeSumAvg = 0.0D;

   private TrainingBackground(double var3) {
      this.typicalWeeklyRecoveryTimeSumAvg = var3;
   }

   public double getTypicalWeeklyRecoveryTimeSumAvg() {
      return this.typicalWeeklyRecoveryTimeSumAvg;
   }
}
