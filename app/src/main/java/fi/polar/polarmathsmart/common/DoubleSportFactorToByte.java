package fi.polar.polarmathsmart.common;

public class DoubleSportFactorToByte {
   public byte DoubleSportFactorToByte(double var1) {
      byte var3 = (byte)((byte)((int)var1) << 4);
      var1 += 0.05D;
      return (byte)(var3 | (byte)((int)((var1 - (double)((byte)((int)var1))) / 0.1D)));
   }
}
