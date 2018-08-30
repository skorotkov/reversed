package fi.polar.polarmathsmart.nonwear;

public class LongTermNonWearOutput {
   private int nonWear3h;
   private int nonWear5h;

   public LongTermNonWearOutput() {
   }

   public LongTermNonWearOutput(int var1, int var2) {
      this.nonWear3h = var1;
      this.nonWear5h = var1;
   }

   public int getNonWear3h() {
      return this.nonWear3h;
   }

   public int getNonWear5h() {
      return this.nonWear5h;
   }

   public void setNonWear3h(int var1) {
      this.nonWear3h = var1;
   }

   public void setNonWear5h(int var1) {
      this.nonWear5h = var1;
   }
}
