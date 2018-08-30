package fi.polar.polarmathsmart.swimming.poolswimming;

import fi.polar.polarmathsmart.types.SwimmingType;

public class PoolInformation {
   float duration;
   float startOffSet;
   int strokes;
   int style;

   public float getDuration() {
      return this.duration;
   }

   public float getStartOffSet() {
      return this.startOffSet;
   }

   public int getStrokes() {
      return this.strokes;
   }

   public SwimmingType getStyle() {
      return SwimmingType.convertFromInt(this.style);
   }

   public void setDuration(float var1) {
      this.duration = var1;
   }

   public void setStartOffSet(float var1) {
      this.startOffSet = var1;
   }

   public void setStrokes(int var1) {
      this.strokes = var1;
   }

   public void setStyle(SwimmingType var1) {
      this.style = var1.getValue();
   }
}
