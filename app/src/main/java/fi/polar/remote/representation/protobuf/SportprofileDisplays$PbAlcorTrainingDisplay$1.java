package fi.polar.remote.representation.protobuf;

import com.google.protobuf.Internal.ListAdapter.Converter;

final class SportprofileDisplays$PbAlcorTrainingDisplay$1 implements Converter {
   public SportprofileDisplays$PbTrainingDisplayItem convert(Integer var1) {
      SportprofileDisplays$PbTrainingDisplayItem var2 = SportprofileDisplays$PbTrainingDisplayItem.valueOf(var1);
      SportprofileDisplays$PbTrainingDisplayItem var3 = var2;
      if (var2 == null) {
         var3 = SportprofileDisplays$PbTrainingDisplayItem.TIME_OF_DAY;
      }

      return var3;
   }
}
