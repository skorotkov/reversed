package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLap;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLaps;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class ExerciseManualLaps extends ExerciseLaps {
   private static final String QUERY_MANUAL_LAP = "EXERCISE = ? and AUTO_LAP_TYPE = " + String.valueOf(-1);

   public ExerciseManualLaps() {
   }

   private ExerciseManualLaps(ExerciseLap$PbLaps var1) {
      Iterator var2 = var1.getLapsList().iterator();

      while(var2.hasNext()) {
         this.addLap(new LapData((ExerciseLap$PbLap)var2.next()));
      }

      if (var1.hasSummary()) {
         if (var1.getSummary().hasAverageLapDuration()) {
            this.setSummaryAvgLapDuration(q.a(var1.getSummary().getAverageLapDuration()));
         }

         if (var1.getSummary().hasBestLapDuration()) {
            this.setSummaryBestLapDuration(q.a(var1.getSummary().getBestLapDuration()));
         }
      }

   }

   ExerciseManualLaps(InputStream var1) {
      this(ExerciseLap$PbLaps.parseFrom(var1));
   }

   public static int deleteAll(Class var0, String var1, String... var2) {
      List var6 = find(ExerciseManualLaps.class, var1, var2);

      ExerciseManualLaps var5;
      for(Iterator var7 = var6.iterator(); var7.hasNext(); var5.delete()) {
         var5 = (ExerciseManualLaps)var7.next();
         long var3 = var5.getExerciseId();
         if (var3 > 0L) {
            LapData.deleteAll(LapData.class, QUERY_MANUAL_LAP, new String[]{String.valueOf(var3)});
         }
      }

      return var6.size();
   }

   public String getBasename() {
      return "LAPS";
   }

   String getWhereClause() {
      return QUERY_MANUAL_LAP;
   }

   public ExerciseLap$PbLaps toPbObject() {
      // $FF: Couldn't be decompiled
   }
}
