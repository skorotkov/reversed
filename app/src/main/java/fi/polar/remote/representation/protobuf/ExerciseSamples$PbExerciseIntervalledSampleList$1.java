package fi.polar.remote.representation.protobuf;

import com.google.protobuf.Internal.ListAdapter.Converter;

final class ExerciseSamples$PbExerciseIntervalledSampleList$1 implements Converter {
   public Types$PbMovingType convert(Integer var1) {
      Types$PbMovingType var2 = Types$PbMovingType.valueOf(var1);
      Types$PbMovingType var3 = var2;
      if (var2 == null) {
         var3 = Types$PbMovingType.WALKING;
      }

      return var3;
   }
}
