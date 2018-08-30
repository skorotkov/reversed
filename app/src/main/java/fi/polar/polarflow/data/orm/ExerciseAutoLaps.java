package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbAutoLaps;
import fi.polar.remote.representation.protobuf.ExerciseLap$PbLap;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class ExerciseAutoLaps extends ExerciseLaps {
   private static final String QUERY_AUTO_LAP = "EXERCISE = ? and AUTO_LAP_TYPE != " + String.valueOf(-1);

   public ExerciseAutoLaps() {
   }

   private ExerciseAutoLaps(ExerciseLap$PbAutoLaps var1) {
      Iterator var2 = var1.getAutoLapsList().iterator();

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

   ExerciseAutoLaps(InputStream var1) {
      this(ExerciseLap$PbAutoLaps.parseFrom(var1));
   }

   public static int deleteAll(Class var0, String var1, String... var2) {
      List var7 = find(ExerciseAutoLaps.class, var1, var2);

      ExerciseAutoLaps var6;
      for(Iterator var5 = var7.iterator(); var5.hasNext(); var6.delete()) {
         var6 = (ExerciseAutoLaps)var5.next();
         long var3 = var6.getExerciseId();
         if (var3 > 0L) {
            LapData.deleteAll(LapData.class, QUERY_AUTO_LAP, new String[]{String.valueOf(var3)});
         }
      }

      return var7.size();
   }

   public String getBasename() {
      return "ALAPS";
   }

   String getWhereClause() {
      return QUERY_AUTO_LAP;
   }

   public ExerciseLap$PbAutoLaps toPbObject() {
      // $FF: Couldn't be decompiled
   }
}
