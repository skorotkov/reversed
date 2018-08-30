package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.service.datalayer.v;
import fi.polar.polarflow.util.aa;
import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.SleepanalysisResult$PbSleepAnalysisResult;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class SleepAnalysisResult extends ProtoPublishableEntity {
   public static final int END_OFFSET_UNDEFINED = Integer.MAX_VALUE;
   private static final LocalTime SLEEP_RECORDING_START_OF_DAY = new LocalTime(18, 0, 0);
   public static final int START_OFFSET_UNDEFINED = Integer.MAX_VALUE;
   private static final String TAG = "SleepAnalysisResult";
   public static final int USER_RATING_NEITHER_POORLY_NOR_WELL = 2;
   public static final int USER_RATING_POORLY = 0;
   public static final int USER_RATING_SOMEWHAT_POORLY = 1;
   public static final int USER_RATING_SOMEWHAT_WELL = 3;
   public static final int USER_RATING_UNDEFINED = Integer.MAX_VALUE;
   public static final int USER_RATING_WELL = 4;
   private int batteryRanOut;
   private int endTimeOffsetMinutes;
   private long endTimestamp;
   private long lastModified;
   private boolean lastModifiedTrusted;
   @Ignore
   private final List mSleepWakePhaseList;
   @Ignore
   private boolean mSleepWakePhaseLoaded;
   private String recordingDevice;
   private int sleepEndOffsetSeconds;
   private int sleepGoalMinutes;
   private int sleepStartOffsetSeconds;
   private int startTimeOffsetMinutes;
   private long startTimestamp;
   private int userSleepRating;

   public SleepAnalysisResult() {
      this.sleepStartOffsetSeconds = Integer.MAX_VALUE;
      this.sleepEndOffsetSeconds = Integer.MAX_VALUE;
      this.sleepGoalMinutes = 0;
      this.userSleepRating = Integer.MAX_VALUE;
      this.mSleepWakePhaseList = Collections.synchronizedList(new ArrayList());
      this.lastModifiedTrusted = false;
      this.batteryRanOut = -1;
   }

   public SleepAnalysisResult(SleepAnalysisResult var1) {
      this.startTimestamp = var1.startTimestamp;
      this.endTimestamp = var1.endTimestamp;
      this.lastModified = var1.lastModified;
      this.lastModifiedTrusted = var1.lastModifiedTrusted;
      this.sleepGoalMinutes = var1.sleepGoalMinutes;
      this.mSleepWakePhaseList = var1.cloneSleepWakePhaseList();
      this.sleepStartOffsetSeconds = var1.sleepStartOffsetSeconds;
      this.sleepEndOffsetSeconds = var1.sleepEndOffsetSeconds;
      this.userSleepRating = var1.userSleepRating;
      this.recordingDevice = var1.recordingDevice;
      this.batteryRanOut = var1.batteryRanOut;
   }

   public SleepAnalysisResult(SleepanalysisResult$PbSleepAnalysisResult var1) {
      byte var2 = 0;
      this();
      if (var1.hasSleepStartTime()) {
         this.setStartTime(q.c(var1.getSleepStartTime()));
      }

      if (var1.hasSleepEndTime()) {
         this.setEndTime(q.c(var1.getSleepEndTime()));
      }

      if (var1.hasLastModified()) {
         this.lastModified = q.b(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

      if (var1.hasSleepGoalMinutes()) {
         this.sleepGoalMinutes = var1.getSleepGoalMinutes();
      }

      if (var1.getSleepwakePhasesCount() > 0) {
         for(int var3 = 0; var3 < var1.getSleepwakePhasesCount(); ++var3) {
            this.addSleepWakePhase(new SleepWakePhase(var1.getSleepwakePhases(var3)));
         }
      }

      if (var1.hasSleepStartOffsetSeconds()) {
         this.sleepStartOffsetSeconds = var1.getSleepStartOffsetSeconds();
      }

      if (var1.hasSleepEndOffsetSeconds()) {
         this.sleepEndOffsetSeconds = var1.getSleepEndOffsetSeconds();
      }

      if (var1.hasUserSleepRating()) {
         this.userSleepRating = var1.getUserSleepRating().getNumber();
      }

      if (var1.hasRecordingDevice()) {
         this.recordingDevice = var1.getRecordingDevice().getDeviceId();
      }

      if (var1.hasBatteryRanOut()) {
         byte var4 = var2;
         if (var1.getBatteryRanOut()) {
            var4 = 1;
         }

         this.batteryRanOut = var4;
      }

   }

   public SleepAnalysisResult(InputStream var1) {
      this(SleepanalysisResult$PbSleepAnalysisResult.parseFrom(var1));
   }

   public static int deleteAll(Class var0) {
      SleepWakePhase.deleteAll(SleepWakePhase.class);
      return SugarRecord.deleteAll(var0);
   }

   public static int deleteAll(Class var0, String var1, String... var2) {
      List var4 = find(SleepAnalysisResult.class, var1, var2);
      Iterator var3 = var4.iterator();

      while(var3.hasNext()) {
         ((SleepAnalysisResult)var3.next()).delete();
      }

      return var4.size();
   }

   private void deleteSleepWakePhaseList() {
      SleepWakePhase.deleteAllWithParent(this);
      this.mSleepWakePhaseList.clear();
   }

   public static SleepAnalysisResult findByPath(String var0) {
      List var1 = find(SleepAnalysisResult.class, "PATH = ?", new String[]{var0});
      SleepAnalysisResult var2;
      if (var1.isEmpty()) {
         var2 = null;
      } else {
         var2 = (SleepAnalysisResult)var1.get(0);
      }

      return var2;
   }

   public static List findCurrentDayResults() {
      LocalDate var0 = (new aa()).f();
      return find(SleepAnalysisResult.class, "PATH = ? OR PATH = ?", new String[]{generatePath(var0), generatePath(var0.plusDays(1))}, (String)null, "END_TIMESTAMP", (String)null);
   }

   public static String generatePath(DateTime var0) {
      return generatePath(getRecordingDate(var0));
   }

   private static String generatePath(LocalDate var0) {
      return v.a(var0) + '/' + "SLEEP" + '/';
   }

   private void generatePathIfEmpty() {
      if (TextUtils.isEmpty(this.path)) {
         if (this.endTimestamp > 0L) {
            this.path = generatePath(this.getEndTime());
         } else {
            d.f("SleepAnalysisResult", "end time not set, failed to generate path");
         }
      }

   }

   public static LocalDate getRecordingDate(DateTime var0) {
      LocalDate var1;
      if (var0.toLocalTime().isBefore(SLEEP_RECORDING_START_OF_DAY)) {
         var1 = var0.toLocalDate();
      } else {
         var1 = var0.toLocalDate().plusDays(1);
      }

      return var1;
   }

   private void loadSleepWakePhasesFromDb() {
      if (!this.mSleepWakePhaseLoaded && this.getId() != null) {
         this.mSleepWakePhaseList.addAll(SleepWakePhase.findAllWithParent(this));
         this.mSleepWakePhaseLoaded = true;
      }

   }

   public void addSleepWakePhase(SleepWakePhase var1) {
      if (this.getId() != null) {
         var1.setSleepAnalysisResultId(this.getId());
      }

      this.getSleepWakePhaseList().add(var1);
   }

   public List cloneSleepWakePhaseList() {
      // $FF: Couldn't be decompiled
   }

   public boolean delete() {
      this.deleteSleepWakePhaseList();
      return super.delete();
   }

   public String getBasename() {
      return "SLEEPRES";
   }

   public int getBatteryRanOut() {
      return this.batteryRanOut;
   }

   public DateTime getEndTime() {
      DateTimeZone var1 = DateTimeZone.forOffsetMillis((int)TimeUnit.MINUTES.toMillis((long)this.endTimeOffsetMinutes));
      return new DateTime(this.endTimestamp, var1);
   }

   public DateTime getEndTimeTrimmed() {
      DateTime var1;
      if (this.sleepEndOffsetSeconds != Integer.MAX_VALUE) {
         var1 = this.getEndTime().plusSeconds(this.sleepEndOffsetSeconds);
      } else {
         var1 = this.getEndTime();
      }

      return var1;
   }

   public long getLastModified() {
      return this.lastModified;
   }

   public String getPath() {
      this.generatePathIfEmpty();
      return this.path;
   }

   public String getRecordingDevice() {
      return this.recordingDevice;
   }

   public int getSleepEndOffsetSeconds() {
      return this.sleepEndOffsetSeconds;
   }

   public int getSleepEndOffsetSeconds(int var1) {
      if (this.sleepEndOffsetSeconds != Integer.MAX_VALUE) {
         var1 = this.sleepEndOffsetSeconds;
      }

      return var1;
   }

   public int getSleepGoalMinutes() {
      return this.sleepGoalMinutes;
   }

   public long getSleepLength() {
      long var1 = this.getStartTimeTrimmed().getMillis();
      long var3 = this.getEndTimeTrimmed().getMillis();
      if (var3 > var1) {
         var1 = var3 - var1;
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public int getSleepStartOffsetSeconds() {
      return this.sleepStartOffsetSeconds;
   }

   public int getSleepStartOffsetSeconds(int var1) {
      if (this.sleepStartOffsetSeconds != Integer.MAX_VALUE) {
         var1 = this.sleepStartOffsetSeconds;
      }

      return var1;
   }

   public List getSleepWakeOffsetsAsDoubleList() {
      // $FF: Couldn't be decompiled
   }

   List getSleepWakePhaseList() {
      this.loadSleepWakePhasesFromDb();
      return this.mSleepWakePhaseList;
   }

   public List getSleepWakeStatesAsDoubleList() {
      // $FF: Couldn't be decompiled
   }

   public DateTime getStartTime() {
      DateTimeZone var1 = DateTimeZone.forOffsetMillis((int)TimeUnit.MINUTES.toMillis((long)this.startTimeOffsetMinutes));
      return new DateTime(this.startTimestamp, var1);
   }

   public DateTime getStartTimeTrimmed() {
      DateTime var1;
      if (this.sleepStartOffsetSeconds != Integer.MAX_VALUE) {
         var1 = this.getStartTime().plusSeconds(this.sleepStartOffsetSeconds);
      } else {
         var1 = this.getStartTime();
      }

      return var1;
   }

   public int getUserSleepRating() {
      return this.userSleepRating;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public long save() {
      // $FF: Couldn't be decompiled
   }

   public void setBatteryRanOut(int var1) {
      this.batteryRanOut = var1;
   }

   public void setEndTime(DateTime var1) {
      this.endTimestamp = var1.getMillis();
      this.endTimeOffsetMinutes = ab.d(var1);
      this.path = null;
   }

   public void setLastModified(long var1, boolean var3) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var3;
   }

   public void setRecordingDevice(String var1) {
      this.recordingDevice = var1;
   }

   public void setSleepEndOffsetSeconds(int var1) {
      this.sleepEndOffsetSeconds = var1;
   }

   public void setSleepGoalMinutes(int var1) {
      this.sleepGoalMinutes = var1;
   }

   public void setSleepStartOffsetSeconds(int var1) {
      this.sleepStartOffsetSeconds = var1;
   }

   public void setStartTime(DateTime var1) {
      this.startTimestamp = var1.getMillis();
      this.startTimeOffsetMinutes = ab.d(var1);
   }

   public void setUserSleepRating(int var1) {
      this.userSleepRating = var1;
   }

   public SleepanalysisResult$PbSleepAnalysisResult toPbObject() {
      // $FF: Couldn't be decompiled
   }
}
