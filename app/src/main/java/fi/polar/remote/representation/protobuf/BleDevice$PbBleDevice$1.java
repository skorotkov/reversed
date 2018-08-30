package fi.polar.remote.representation.protobuf;

import com.google.protobuf.Internal.ListAdapter.Converter;

final class BleDevice$PbBleDevice$1 implements Converter {
   public Types$PbFeatureType convert(Integer var1) {
      Types$PbFeatureType var2 = Types$PbFeatureType.valueOf(var1);
      Types$PbFeatureType var3 = var2;
      if (var2 == null) {
         var3 = Types$PbFeatureType.FEATURE_TYPE_HEART_RATE;
      }

      return var3;
   }
}
