package fi.polar.polarmathsmart.converters;

import java.util.List;

public class NullToZeroConverter {
   public static void convert(List var0, ZeroElementProvider var1) {
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.size(); ++var2) {
            if ((Number)var0.get(var2) == null) {
               var0.set(var2, var1.provideZeroElement());
            }
         }
      }

   }
}
