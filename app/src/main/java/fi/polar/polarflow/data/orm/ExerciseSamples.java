package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import android.util.LongSparseArray;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExerciseSamples$PbExerciseSamples;
import fi.polar.remote.representation.protobuf.Structures$PbPauseTime;
import fi.polar.remote.representation.protobuf.Structures$PbPauseTime$Builder;
import fi.polar.remote.representation.protobuf.Types$PbSensorOffline;
import fi.polar.remote.representation.protobuf.Types$PbSensorOffline$Builder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExerciseSamples extends ProtoPublishableEntity {
   private static final String TAG = ExerciseSamples.class.getSimpleName();
   private String altitudeOffline;
   private String altitudeSamples;
   private String cadenceOffline;
   private String cadenceSamples;
   private String distanceOffline;
   private String distanceSamples;
   private Exercise exercise;
   private String heartrateOffline;
   private String heartrateSamples;
   @Ignore
   private final List mAltitudeOfflineList;
   @Ignore
   private boolean mAltitudeOfflineListLoadedFromJson;
   @Ignore
   private final List mAltitudeSampleList;
   @Ignore
   private boolean mAltitudeSampleListLoadedFromJson;
   @Ignore
   private final List mCadenceOfflineList;
   @Ignore
   private boolean mCadenceOfflineListLoadedFromJson;
   @Ignore
   private final List mCadenceSampleList;
   @Ignore
   private boolean mCadenceSampleListLoadedFromJson;
   @Ignore
   private final List mDistanceOfflineList;
   @Ignore
   private boolean mDistanceOfflineListLoadedFromJson;
   @Ignore
   private final List mDistanceSampleList;
   @Ignore
   private boolean mDistanceSampleListLoadedFromJson;
   @Ignore
   private final List mHrOfflineList;
   @Ignore
   private boolean mHrOfflineListLoadedFromJson;
   @Ignore
   private final List mHrSampleList;
   @Ignore
   private boolean mHrSampleListLoadedFromJson;
   @Ignore
   private final LongSparseArray mPauseTimesArray;
   @Ignore
   private boolean mPauseTimesListLoadedFromJson;
   @Ignore
   private final List mSpeedOfflineList;
   @Ignore
   private boolean mSpeedOfflineListLoadedFromJson;
   @Ignore
   private final List mSpeedSampleList;
   @Ignore
   private boolean mSpeedSampleListLoadedFromJson;
   private String pauseTimes;
   private int recordingIntervalSeconds;
   private String speedOffline;
   private String speedSamples;

   public ExerciseSamples() {
      this.recordingIntervalSeconds = 1;
      this.altitudeSamples = "";
      this.mAltitudeSampleListLoadedFromJson = false;
      this.altitudeOffline = "";
      this.mAltitudeOfflineListLoadedFromJson = false;
      this.cadenceSamples = "";
      this.mCadenceSampleListLoadedFromJson = false;
      this.cadenceOffline = "";
      this.mCadenceOfflineListLoadedFromJson = false;
      this.distanceSamples = "";
      this.mDistanceSampleListLoadedFromJson = false;
      this.distanceOffline = "";
      this.mDistanceOfflineListLoadedFromJson = false;
      this.speedSamples = "";
      this.mSpeedSampleListLoadedFromJson = false;
      this.speedOffline = "";
      this.mSpeedOfflineListLoadedFromJson = false;
      this.heartrateSamples = "";
      this.mHrSampleListLoadedFromJson = false;
      this.heartrateOffline = "";
      this.mHrOfflineListLoadedFromJson = false;
      this.pauseTimes = "{}";
      this.mPauseTimesListLoadedFromJson = false;
      this.path = "";
      this.mAltitudeSampleList = Collections.synchronizedList(new ArrayList());
      this.mAltitudeOfflineList = Collections.synchronizedList(new ArrayList());
      this.mCadenceSampleList = Collections.synchronizedList(new ArrayList());
      this.mCadenceOfflineList = Collections.synchronizedList(new ArrayList());
      this.mDistanceSampleList = Collections.synchronizedList(new ArrayList());
      this.mDistanceOfflineList = Collections.synchronizedList(new ArrayList());
      this.mSpeedSampleList = Collections.synchronizedList(new ArrayList());
      this.mSpeedOfflineList = Collections.synchronizedList(new ArrayList());
      this.mHrSampleList = Collections.synchronizedList(new ArrayList());
      this.mHrOfflineList = Collections.synchronizedList(new ArrayList());
      this.mPauseTimesArray = new LongSparseArray();
   }

   public ExerciseSamples(ExerciseSamples$PbExerciseSamples var1) {
      this();
      if (var1.hasRecordingInterval()) {
         this.recordingIntervalSeconds = var1.getRecordingInterval().getSeconds();
      }

      this.mAltitudeSampleListLoadedFromJson = true;
      if (var1.getAltitudeSamplesCount() > 0) {
         this.mAltitudeSampleList.addAll(var1.getAltitudeSamplesList());
      }

      this.mDistanceSampleListLoadedFromJson = true;
      if (var1.getDistanceSamplesCount() > 0) {
         this.mDistanceSampleList.addAll(var1.getDistanceSamplesList());
      }

      this.mSpeedSampleListLoadedFromJson = true;
      if (var1.getSpeedSamplesCount() > 0) {
         this.mSpeedSampleList.addAll(var1.getSpeedSamplesList());
      }

      this.mHrSampleListLoadedFromJson = true;
      if (var1.getHeartRateSamplesCount() > 0) {
         this.mHrSampleList.addAll(var1.getHeartRateSamplesList());
      }

      this.mAltitudeOfflineListLoadedFromJson = true;
      if (var1.getAltitudeOfflineCount() > 0) {
         this.mAltitudeOfflineList.addAll(toIntegerArrayList(var1.getAltitudeOfflineList()));
      }

      this.mCadenceSampleListLoadedFromJson = true;
      if (var1.getCadenceSamplesCount() > 0) {
         this.mCadenceSampleList.addAll(var1.getCadenceSamplesList());
      }

      this.mCadenceOfflineListLoadedFromJson = true;
      if (var1.getCadenceOfflineCount() > 0) {
         this.mCadenceOfflineList.addAll(toIntegerArrayList(var1.getCadenceOfflineList()));
      }

      this.mDistanceOfflineListLoadedFromJson = true;
      if (var1.getDistanceOfflineCount() > 0) {
         this.mDistanceOfflineList.addAll(toIntegerArrayList(var1.getDistanceOfflineList()));
      }

      this.mSpeedOfflineListLoadedFromJson = true;
      if (var1.getSpeedOfflineCount() > 0) {
         this.mSpeedOfflineList.addAll(toIntegerArrayList(var1.getSpeedOfflineList()));
      }

      this.mHrOfflineListLoadedFromJson = true;
      if (var1.getHeartRateOfflineCount() > 0) {
         this.mHrOfflineList.addAll(toIntegerArrayList(var1.getHeartRateOfflineList()));
      }

      this.mPauseTimesListLoadedFromJson = true;
      if (var1.getPauseTimesCount() > 0) {
         Iterator var3 = var1.getPauseTimesList().iterator();

         while(var3.hasNext()) {
            Structures$PbPauseTime var2 = (Structures$PbPauseTime)var3.next();
            this.mPauseTimesArray.append(q.a(var2.getStartTime()), q.a(var2.getDuration()));
         }
      }

   }

   public ExerciseSamples(InputStream var1) {
      this(ExerciseSamples$PbExerciseSamples.parseFrom(var1));
   }

   private void clearSamplesFromJson() {
      this.altitudeSamples = "";
      this.altitudeOffline = "";
      this.cadenceSamples = "";
      this.cadenceOffline = "";
      this.distanceSamples = "";
      this.distanceOffline = "";
      this.speedSamples = "";
      this.speedOffline = "";
      this.heartrateSamples = "";
      this.heartrateOffline = "";
      this.pauseTimes = "{}";
   }

   private void ensurePauseTimesListLoadedFromJson() {
      // $FF: Couldn't be decompiled
   }

   private void loadSamplesFromJson() {
      this.getAltitudeSamplesList();
      this.getAltitudeOfflineIndexList();
      this.getCadenceSamplesList();
      this.getCadenceOfflineIndexList();
      this.getDistanceSamplesList();
      this.getDistanceOfflineIndexList();
      this.getSpeedSamplesList();
      this.getSpeedOfflineIndexList();
      this.getHeartrateSamplesList();
      this.getHeartrateOfflineIndexList();
      this.ensurePauseTimesListLoadedFromJson();
   }

   private void saveSamplesToJson() {
      // $FF: Couldn't be decompiled
   }

   private static List toIntegerArrayList(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         Types$PbSensorOffline var2 = (Types$PbSensorOffline)var3.next();
         var1.add(new int[]{var2.getStartIndex(), var2.getStopIndex()});
      }

      return var1;
   }

   private static List toPbPauseTimeList(LongSparseArray var0) {
      ArrayList var1 = new ArrayList();
      int var2 = var0.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         long var4 = var0.keyAt(var3);
         Structures$PbPauseTime$Builder var6 = Structures$PbPauseTime.newBuilder();
         var6.setStartTime(q.b(var4));
         var6.setDuration(q.b((Long)var0.get(var4)));
         var1.add(var6.build());
      }

      return var1;
   }

   private static List toPbSensorOfflineList(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         int[] var3 = (int[])var2.next();
         Types$PbSensorOffline$Builder var4 = Types$PbSensorOffline.newBuilder();
         var4.setStartIndex(var3[0]);
         var4.setStopIndex(var3[1]);
         var1.add(var4.build());
      }

      return var1;
   }

   private void updatePath() {
      if (this.getExercise() == null) {
         d.c(TAG, "", new IllegalStateException("No Exercise entity associated or loaded, cannot create path."));
      } else {
         this.path = this.getExercise().getPath();
      }

   }

   public void addAltitudeOfflineRange(int[] var1) {
      this.getAltitudeOfflineIndexList().add(var1);
   }

   public void addAltitudeSample(Float var1) {
      this.getAltitudeSamplesList().add(var1);
   }

   public void addCadenceSample(int var1) {
      this.getCadenceSamplesList().add(var1);
   }

   public void addDistanceOfflineRange(int[] var1) {
      this.getDistanceOfflineIndexList().add(var1);
   }

   public void addDistanceSample(Float var1) {
      this.getDistanceSamplesList().add(var1);
   }

   public void addHeartrateOfflineRange(int[] var1) {
      this.getHeartrateOfflineIndexList().add(var1);
   }

   public void addHeartrateSample(Integer var1) {
      this.getHeartrateSamplesList().add(var1);
   }

   public void addPauseTime(long param1, long param3) {
      // $FF: Couldn't be decompiled
   }

   public void addSpeedOfflineRange(int[] var1) {
      this.getSpeedOfflineIndexList().add(var1);
   }

   public void addSpeedSample(Float var1) {
      this.getSpeedSamplesList().add(var1);
   }

   public List cloneAltitudeOfflineIndexList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneAltitudeSamplesList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneCadenceOfflineIndexList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneCadenceSamplesList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneDistanceOfflineIndexList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneDistanceSamplesList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneHeartRateSamplesList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneHeartRateSamplesListShort() {
      // $FF: Couldn't be decompiled
   }

   public List cloneHeartrateOfflineIndexList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneSpeedOfflineIndexList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneSpeedSamplesList() {
      // $FF: Couldn't be decompiled
   }

   protected List getAltitudeOfflineIndexList() {
      if (!this.mAltitudeOfflineListLoadedFromJson) {
         this.mAltitudeOfflineList.addAll(q.e(this.altitudeOffline));
         this.mAltitudeOfflineListLoadedFromJson = true;
      }

      return this.mAltitudeOfflineList;
   }

   public int getAltitudeSamplesCount() {
      return this.getAltitudeSamplesList().size();
   }

   protected List getAltitudeSamplesList() {
      if (!this.mAltitudeSampleListLoadedFromJson) {
         this.mAltitudeSampleList.addAll(q.c(this.altitudeSamples));
         this.mAltitudeSampleListLoadedFromJson = true;
      }

      return this.mAltitudeSampleList;
   }

   public String getBasename() {
      return "SAMPLES";
   }

   protected List getCadenceOfflineIndexList() {
      if (!this.mCadenceOfflineListLoadedFromJson) {
         this.mCadenceOfflineList.addAll(q.e(this.cadenceOffline));
         this.mCadenceOfflineListLoadedFromJson = true;
      }

      return this.mCadenceOfflineList;
   }

   public int getCadenceSamplesCount() {
      return this.getCadenceSamplesList().size();
   }

   protected List getCadenceSamplesList() {
      if (!this.mCadenceSampleListLoadedFromJson) {
         this.mCadenceSampleList.addAll(q.b(this.cadenceSamples));
         this.mCadenceSampleListLoadedFromJson = true;
      }

      return this.mCadenceSampleList;
   }

   protected List getDistanceOfflineIndexList() {
      if (!this.mDistanceOfflineListLoadedFromJson) {
         this.mDistanceOfflineList.addAll(q.e(this.distanceOffline));
         this.mDistanceOfflineListLoadedFromJson = true;
      }

      return this.mDistanceOfflineList;
   }

   protected List getDistanceSamplesList() {
      if (!this.mDistanceSampleListLoadedFromJson) {
         this.mDistanceSampleList.addAll(q.c(this.distanceSamples));
         this.mDistanceSampleListLoadedFromJson = true;
      }

      return this.mDistanceSampleList;
   }

   public Exercise getExercise() {
      return this.exercise;
   }

   public int getHeartRateSamplesCount() {
      return this.getHeartrateSamplesList().size();
   }

   protected List getHeartrateOfflineIndexList() {
      if (!this.mHrOfflineListLoadedFromJson) {
         this.mHrOfflineList.addAll(q.e(this.heartrateOffline));
         this.mHrOfflineListLoadedFromJson = true;
      }

      return this.mHrOfflineList;
   }

   protected List getHeartrateSamplesList() {
      if (!this.mHrSampleListLoadedFromJson) {
         this.mHrSampleList.addAll(q.b(this.heartrateSamples));
         this.mHrSampleListLoadedFromJson = true;
      }

      return this.mHrSampleList;
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   LongSparseArray getPauseTimesArray() {
      this.ensurePauseTimesListLoadedFromJson();
      return this.mPauseTimesArray;
   }

   public int getRecordingIntervalSeconds() {
      return this.recordingIntervalSeconds;
   }

   protected List getSpeedOfflineIndexList() {
      if (!this.mSpeedOfflineListLoadedFromJson) {
         this.mSpeedOfflineList.addAll(q.e(this.speedOffline));
         this.mSpeedOfflineListLoadedFromJson = true;
      }

      return this.mSpeedOfflineList;
   }

   public int getSpeedSamplesCount() {
      return this.getSpeedSamplesList().size();
   }

   protected List getSpeedSamplesList() {
      if (!this.mSpeedSampleListLoadedFromJson) {
         this.mSpeedSampleList.addAll(q.c(this.speedSamples));
         this.mSpeedSampleListLoadedFromJson = true;
      }

      return this.mSpeedSampleList;
   }

   public long save() {
      this.saveSamplesToJson();
      long var1 = super.save();
      this.clearSamplesFromJson();
      return var1;
   }

   public void setExercise(Exercise var1) {
      this.exercise = var1;
      this.updatePath();
   }

   public ExerciseSamples$PbExerciseSamples toPbObject() {
      // $FF: Couldn't be decompiled
   }
}
