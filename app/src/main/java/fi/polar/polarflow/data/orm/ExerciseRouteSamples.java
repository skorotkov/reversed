package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExerciseRouteSamples$PbExerciseRouteSamples;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseRouteSamples extends ProtoPublishableEntity {
   private static final String TAG = ExerciseRouteSamples.class.getSimpleName();
   private String altitudeSamples;
   private String durationSamples;
   private Exercise exercise;
   private long firstLocationTime;
   private String latitudeSamples;
   private String longitudeSamples;
   @Ignore
   private final List mAltitudeSampleList;
   @Ignore
   private final List mDurationSampleList;
   @Ignore
   private final List mLatitudeSampleList;
   @Ignore
   private final List mLongitudeSampleList;
   @Ignore
   private boolean mSampleListsLoadedFromJson;
   @Ignore
   private final List mSatelliteAmountSampleList;
   private String satelliteAmountSamples;

   public ExerciseRouteSamples() {
      this.firstLocationTime = 0L;
      this.durationSamples = "";
      this.latitudeSamples = "";
      this.longitudeSamples = "";
      this.altitudeSamples = "";
      this.satelliteAmountSamples = "";
      this.mSampleListsLoadedFromJson = false;
      this.path = "";
      this.mDurationSampleList = Collections.synchronizedList(new ArrayList());
      this.mLatitudeSampleList = Collections.synchronizedList(new ArrayList());
      this.mLongitudeSampleList = Collections.synchronizedList(new ArrayList());
      this.mAltitudeSampleList = Collections.synchronizedList(new ArrayList());
      this.mSatelliteAmountSampleList = Collections.synchronizedList(new ArrayList());
   }

   public ExerciseRouteSamples(ExerciseRouteSamples$PbExerciseRouteSamples var1) {
      this();
      this.mSampleListsLoadedFromJson = true;
      if (var1.hasFirstLocationTime()) {
         this.firstLocationTime = q.b(var1.getFirstLocationTime());
      }

      if (var1.getDurationCount() > 0) {
         this.mDurationSampleList.addAll(var1.getDurationList());
      }

      if (var1.getGpsAltitudeCount() > 0) {
         this.mAltitudeSampleList.addAll(var1.getGpsAltitudeList());
      }

      if (var1.getLongitudeCount() > 0) {
         this.mLongitudeSampleList.addAll(var1.getLongitudeList());
      }

      if (var1.getLatitudeCount() > 0) {
         this.mLatitudeSampleList.addAll(var1.getLatitudeList());
      }

      if (var1.getSatelliteAmountCount() > 0) {
         this.mSatelliteAmountSampleList.addAll(var1.getSatelliteAmountList());
      }

   }

   public ExerciseRouteSamples(InputStream var1) {
      this(ExerciseRouteSamples$PbExerciseRouteSamples.parseFrom(var1));
   }

   private void clearSamplesFromJson() {
      this.durationSamples = "";
      this.latitudeSamples = "";
      this.longitudeSamples = "";
      this.altitudeSamples = "";
      this.satelliteAmountSamples = "";
   }

   private void loadSamplesFromJson() {
      if (!this.mSampleListsLoadedFromJson) {
         this.mDurationSampleList.clear();
         this.mAltitudeSampleList.clear();
         this.mLatitudeSampleList.clear();
         this.mLongitudeSampleList.clear();
         this.mSatelliteAmountSampleList.clear();
         this.mDurationSampleList.addAll(q.b(this.durationSamples));
         this.mAltitudeSampleList.addAll(q.b(this.altitudeSamples));
         this.mLatitudeSampleList.addAll(q.d(this.latitudeSamples));
         this.mLongitudeSampleList.addAll(q.d(this.longitudeSamples));
         this.mSatelliteAmountSampleList.addAll(q.b(this.satelliteAmountSamples));
         this.mSampleListsLoadedFromJson = true;
      }

   }

   private void saveSamplesToJson() {
      // $FF: Couldn't be decompiled
   }

   private void updatePath() {
      if (this.getExercise() == null) {
         d.c(TAG, "", new IllegalStateException("No Exercise entity associated or loaded, cannot create path."));
      } else {
         this.path = this.getExercise().getPath();
      }

   }

   public void addAltitudeSample(Double var1) {
      this.getAltitudeSampleList().add((int)Math.round(var1));
   }

   public void addDurationSample(Integer var1) {
      this.getDurationSampleList().add(var1);
   }

   public void addLatitudeSample(Double var1) {
      this.getLatitudeSampleList().add(var1);
   }

   public void addLongitudeSample(Double var1) {
      this.getLongitudeSampleList().add(var1);
   }

   public void addSatelliteAmountSample(Integer var1) {
      this.getSatelliteAmountSampleList().add(var1);
   }

   public List cloneAltitudeSampleList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneDurationSampleList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneLatitudeSampleList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneLongitudeSampleList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneSatelliteAmountSampleList() {
      // $FF: Couldn't be decompiled
   }

   protected List getAltitudeSampleList() {
      this.loadSamplesFromJson();
      return this.mAltitudeSampleList;
   }

   public String getBasename() {
      return "ROUTE";
   }

   protected List getDurationSampleList() {
      this.loadSamplesFromJson();
      return this.mDurationSampleList;
   }

   public Exercise getExercise() {
      return this.exercise;
   }

   public long getFirstLocationTime() {
      return this.firstLocationTime;
   }

   protected List getLatitudeSampleList() {
      this.loadSamplesFromJson();
      return this.mLatitudeSampleList;
   }

   protected List getLongitudeSampleList() {
      this.loadSamplesFromJson();
      return this.mLongitudeSampleList;
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   protected List getSatelliteAmountSampleList() {
      this.loadSamplesFromJson();
      return this.mSatelliteAmountSampleList;
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

   public void setFirstLocationTime(long var1) {
      this.firstLocationTime = var1;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples toPbObject() {
      // $FF: Couldn't be decompiled
   }
}
