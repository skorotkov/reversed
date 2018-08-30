package fi.polar.polarmathsmart.ascentdescent;

public class AscentDescentOutput {
   float ascent;
   float descent;

   public AscentDescentOutput() {
   }

   public AscentDescentOutput(float var1, float var2) {
      this.ascent = var1;
      this.descent = var2;
   }

   public float getAscent() {
      return this.ascent;
   }

   public float getDescent() {
      return this.descent;
   }

   public void setAscent(float var1) {
      this.ascent = var1;
   }

   public void setDescent(float var1) {
      this.descent = var1;
   }
}
