package fi.polar.polarmathsmart.trainingprogram.running.model;

public class IntensityGuidance {
   private short lowerZone;
   private IntensityGuidance$IntensityGuidanceType type;
   private short upperZone;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            IntensityGuidance var3 = (IntensityGuidance)var1;
            if (this.lowerZone != var3.lowerZone) {
               var2 = false;
            } else if (this.upperZone != var3.upperZone) {
               var2 = false;
            } else if (this.type != var3.type) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public short getLowerZone() {
      return this.lowerZone;
   }

   public IntensityGuidance$IntensityGuidanceType getType() {
      return this.type;
   }

   public short getUpperZone() {
      return this.upperZone;
   }

   public int hashCode() {
      int var1;
      if (this.type != null) {
         var1 = this.type.hashCode();
      } else {
         var1 = 0;
      }

      return (var1 * 31 + this.lowerZone) * 31 + this.upperZone;
   }

   public void setLowerZone(short var1) {
      this.lowerZone = (short)var1;
   }

   public void setType(IntensityGuidance$IntensityGuidanceType var1) {
      this.type = var1;
   }

   public void setUpperZone(short var1) {
      this.upperZone = (short)var1;
   }

   public String toString() {
      return "IntensityGuidance{type=" + this.type + ", lowerZone=" + this.lowerZone + ", upperZone=" + this.upperZone + '}';
   }
}
