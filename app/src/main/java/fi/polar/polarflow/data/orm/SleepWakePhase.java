package fi.polar.polarflow.data.orm;

import fi.polar.remote.representation.protobuf.SleepanalysisResult$PbSleepWakePhase;
import fi.polar.remote.representation.protobuf.SleepanalysisResult$PbSleepWakePhase$Builder;
import fi.polar.remote.representation.protobuf.SleepanalysisResult$PbSleepWakeState;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SleepWakePhase extends ProtoEncodableEntity {
   public static final int SLEEP_START_TIME_UNDEFINED = -1;
   public static final int SLEEP_WAKE_STATE_UNDEFINED = Integer.MAX_VALUE;
   private int secondsFromSleepStart;
   private long sleepAnalysisResultId;
   private int sleepWakeState;

   public SleepWakePhase() {
      this(-1, Integer.MAX_VALUE);
   }

   public SleepWakePhase(int var1, int var2) {
      this.secondsFromSleepStart = var1;
      this.sleepWakeState = var2;
   }

   public SleepWakePhase(SleepWakePhase var1) {
      this.sleepAnalysisResultId = var1.getSleepAnalysisResultId();
      this.secondsFromSleepStart = var1.getSecondsFromSleepStart();
      this.sleepWakeState = var1.getSleepWakeState();
   }

   public SleepWakePhase(SleepanalysisResult$PbSleepWakePhase var1) {
      this();
      if (var1.hasSecondsFromSleepStart()) {
         this.secondsFromSleepStart = var1.getSecondsFromSleepStart();
      }

      if (var1.hasSleepwakeState()) {
         this.sleepWakeState = var1.getSleepwakeState().getNumber();
      }

   }

   public SleepWakePhase(InputStream var1) {
      this(SleepanalysisResult$PbSleepWakePhase.parseFrom(var1));
   }

   public static void deleteAllWithParent(SleepAnalysisResult var0) {
      if (var0 != null && var0.getId() != null) {
         deleteAll(SleepWakePhase.class, "SLEEP_ANALYSIS_RESULT_ID = ?", new String[]{String.valueOf(var0.getId())});
      }

   }

   public static List findAllWithParent(SleepAnalysisResult var0) {
      Object var1;
      if (var0 != null && var0.getId() != null) {
         var1 = find(SleepWakePhase.class, "SLEEP_ANALYSIS_RESULT_ID = ?", new String[]{String.valueOf(var0.getId())}, (String)null, "SECONDS_FROM_SLEEP_START", (String)null);
      } else {
         var1 = new ArrayList();
      }

      return (List)var1;
   }

   public int getSecondsFromSleepStart() {
      return this.secondsFromSleepStart;
   }

   public long getSleepAnalysisResultId() {
      return this.sleepAnalysisResultId;
   }

   public int getSleepWakeState() {
      return this.sleepWakeState;
   }

   public void setSecondsFromSleepStart(int var1) {
      this.secondsFromSleepStart = var1;
   }

   public void setSleepAnalysisResultId(long var1) {
      this.sleepAnalysisResultId = var1;
   }

   public void setSleepWakeState(int var1) {
      this.sleepWakeState = var1;
   }

   public SleepanalysisResult$PbSleepWakePhase toPbObject() {
      SleepanalysisResult$PbSleepWakePhase$Builder var1 = SleepanalysisResult$PbSleepWakePhase.newBuilder();
      if (this.secondsFromSleepStart != -1) {
         var1.setSecondsFromSleepStart(this.secondsFromSleepStart);
      }

      if (this.sleepWakeState != Integer.MAX_VALUE) {
         var1.setSleepwakeState(SleepanalysisResult$PbSleepWakeState.forNumber(this.sleepWakeState));
      }

      return var1.build();
   }
}
