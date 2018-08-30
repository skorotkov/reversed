package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

public class SleepIntervalState extends SleepPhaseInterval {
   private final SleepStates state;

   public SleepIntervalState(double var1, double var3, int var5) {
      super(new Double(var1), new Double(var3));
      if (var5 == -2) {
         this.state = SleepStates.WAKE;
      } else if (var5 == -3) {
         this.state = SleepStates.REM;
      } else if (var5 == -4) {
         this.state = SleepStates.NONREM1;
      } else if (var5 == -5) {
         this.state = SleepStates.NONREM2;
      } else if (var5 == -6) {
         this.state = SleepStates.NONREM3;
      } else {
         this.state = SleepStates.WAKE;
      }

   }

   public SleepIntervalState(Double var1, Double var2, SleepStates var3) {
      super(var1, var2);
      this.state = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (!(var1 instanceof SleepIntervalState)) {
            var2 = false;
         } else if (!super.equals(var1)) {
            var2 = false;
         } else {
            SleepIntervalState var3 = (SleepIntervalState)var1;
            if (this.state != var3.state) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public SleepStates getState() {
      return this.state;
   }

   public int hashCode() {
      int var1 = super.hashCode();
      int var2;
      if (this.state != null) {
         var2 = this.state.hashCode();
      } else {
         var2 = 0;
      }

      return var2 + var1 * 31;
   }
}
