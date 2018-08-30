package fi.polar.remote.representation.protobuf;

import com.google.protobuf.Internal.ListAdapter.Converter;

final class SportProfile$PbSportProfileSettings$1 implements Converter {
   public SportProfile$PbSportProfileSettings$PbRemoteButtonAction convert(Integer var1) {
      SportProfile$PbSportProfileSettings$PbRemoteButtonAction var2 = SportProfile$PbSportProfileSettings$PbRemoteButtonAction.valueOf(var1);
      SportProfile$PbSportProfileSettings$PbRemoteButtonAction var3 = var2;
      if (var2 == null) {
         var3 = SportProfile$PbSportProfileSettings$PbRemoteButtonAction.REMOTE_BUTTON_RING_BELL;
      }

      return var3;
   }
}
