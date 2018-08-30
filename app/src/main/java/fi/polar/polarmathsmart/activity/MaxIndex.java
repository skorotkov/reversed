package fi.polar.polarmathsmart.activity;

public enum MaxIndex {
   MAX_HR_INDEX(86400),
   MAX_MET_INDEX(2880);

   private int value;

   private MaxIndex(int var3) {
      this.value = var3;
   }

   public int getValue() {
      return this.value;
   }
}
