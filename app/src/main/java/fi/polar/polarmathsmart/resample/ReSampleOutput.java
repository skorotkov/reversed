package fi.polar.polarmathsmart.resample;

import java.util.ArrayList;
import java.util.List;

public class ReSampleOutput {
   List reSampledTimestamps = new ArrayList();
   List reSampledX = new ArrayList();
   List reSampledY = new ArrayList();
   List reSampledZ = new ArrayList();

   public ReSampleOutput() {
   }

   public ReSampleOutput(float var1, float var2, float var3, long var4) {
      this.reSampledX.add(new Float(var1));
      this.reSampledY.add(new Float(var2));
      this.reSampledZ.add(new Float(var3));
      this.reSampledTimestamps.add(new Long(var4));
   }

   public void add(float var1, float var2, float var3, long var4) {
      this.reSampledX.add(new Float(var1));
      this.reSampledY.add(new Float(var2));
      this.reSampledZ.add(new Float(var3));
      this.reSampledTimestamps.add(new Long(var4));
   }

   public List getReSampledTimestamps() {
      return this.reSampledTimestamps;
   }

   public List getReSampledX() {
      return this.reSampledX;
   }

   public List getReSampledY() {
      return this.reSampledY;
   }

   public List getReSampledZ() {
      return this.reSampledZ;
   }

   public void setReSampledTimestamps(List var1) {
      this.reSampledTimestamps = var1;
   }

   public void setReSampledX(List var1) {
      this.reSampledX = var1;
   }

   public void setReSampledY(List var1) {
      this.reSampledY = var1;
   }

   public void setReSampledZ(List var1) {
      this.reSampledZ = var1;
   }
}
