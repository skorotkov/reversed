package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import com.orm.dsl.Unique;
import fi.polar.polarflow.util.a;
import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbActivitySamples;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;

public class ActivitySamples extends ProtoPublishableEntity {
   private static final String ORDER_BY_BASENAME = "cast(substr(BASENAME,7) AS INTEGER)";
   private static final String ORDER_BY_START_TIME = "START_TIME";
   private static final String ORDER_BY_START_TIME_AND_BASENAME = "START_TIME, cast(substr(BASENAME,7) AS INTEGER)";
   private static final String TAG = "ActivitySamples";
   private String basename;
   private boolean isClosed;
   @Ignore
   private final List mActivityInfoList;
   @Ignore
   private boolean mActivityInfosLoaded;
   @Ignore
   private a mBuildConfigWrapper;
   @Ignore
   private final List mInactivityNonWearTriggerList;
   @Ignore
   private boolean mInactivityNonWearTriggersLoaded;
   @Ignore
   private final List mInactivityTriggerList;
   @Ignore
   private boolean mInactivityTriggersLoaded;
   @Ignore
   private final List mMetSampleList;
   @Ignore
   private boolean mMetSamplesLoaded;
   @Ignore
   private final List mSportInfoList;
   @Ignore
   private boolean mSportInfosLoaded;
   @Ignore
   private final List mStepsSampleList;
   @Ignore
   private boolean mStepsSamplesLoaded;
   private long metRecordingInterval;
   private String metSamples;
   @Unique
   private Date startTime;
   private int startTimeZoneOffset;
   private long stepsRecordingInterval;
   private String stepsSamples;

   public ActivitySamples() {
      this.mBuildConfigWrapper = new a();
      this.mMetSampleList = Collections.synchronizedList(new ArrayList());
      this.mStepsSampleList = Collections.synchronizedList(new ArrayList());
      this.mSportInfoList = Collections.synchronizedList(new ArrayList());
      this.mActivityInfoList = Collections.synchronizedList(new ArrayList());
      this.mInactivityTriggerList = Collections.synchronizedList(new ArrayList());
      this.mInactivityNonWearTriggerList = Collections.synchronizedList(new ArrayList());
   }

   public ActivitySamples(ActivitySamples$PbActivitySamples var1) {
      byte var2 = 0;
      this();
      if (var1.hasStartTime()) {
         DateTime var3 = q.c(var1.getStartTime());
         this.startTime = new Date(var3.getMillis());
         this.startTimeZoneOffset = ab.d(var3);
      }

      if (var1.hasMetRecordingInterval()) {
         this.metRecordingInterval = q.a(var1.getMetRecordingInterval());
      }

      if (var1.hasStepsRecordingInterval()) {
         this.stepsRecordingInterval = q.a(var1.getStepsRecordingInterval());
      }

      if (var1.getMetSamplesCount() > 0) {
         this.getMetSampleList().addAll(var1.getMetSamplesList());
      }

      if (var1.getStepsSamplesCount() > 0) {
         this.getStepsSampleList().addAll(var1.getStepsSamplesList());
      }

      int var4;
      for(var4 = 0; var4 < var1.getSportInfoCount(); ++var4) {
         this.addSportInfo(new SportInfo(var1.getSportInfo(var4)));
      }

      for(var4 = 0; var4 < var1.getActivityInfoCount(); ++var4) {
         this.addActivityInfo(new ActivityInfo(var1.getActivityInfo(var4)));
      }

      var4 = 0;

      while(true) {
         int var5 = var2;
         if (var4 >= var1.getInactivityTriggerCount()) {
            while(var5 < var1.getInactivityNonWearTriggerCount()) {
               this.addInactivityNonWearTrigger(new InactivityNonWearTriggerInfo(var1.getInactivityNonWearTrigger(var5)));
               ++var5;
            }

            return;
         }

         this.addInactivityTrigger(new InActivityTriggerInfo(var1.getInactivityTrigger(var4)));
         ++var4;
      }
   }

   public ActivitySamples(InputStream var1) {
      this(ActivitySamples$PbActivitySamples.parseFrom(var1));
   }

   private DateTime calculateTimestampForEndingActivityInfoAndSportInfo() {
      DateTime var1 = null;
      ActivityInfo var2 = this.getLastActivityInfo();
      DateTime var3;
      if (var2 != null) {
         var3 = var2.getTimestamp();
      } else {
         var3 = null;
      }

      SportInfo var4 = this.getLastSportInfo();
      if (var4 != null) {
         var1 = var4.getTimestamp();
      }

      DateTime var5 = this.getEndTime();
      if (var3 == null || !var5.equals(var3) && !var5.isBefore(var3)) {
         var3 = var5;
      } else {
         var3 = var2.getTimestamp().plusMillis((int)this.getMetRecordingInterval());
      }

      var5 = var3;
      if (var1 != null) {
         if (!var3.equals(var1)) {
            var5 = var3;
            if (!var3.isBefore(var1)) {
               return var5;
            }
         }

         var5 = var4.getTimestamp().plusMillis((int)this.getMetRecordingInterval());
      }

      return var5;
   }

   private void deleteActivityInfoList() {
      ActivityInfo.deleteAllWithParent(this);
      this.mActivityInfoList.clear();
   }

   public static int deleteAll(Class var0) {
      SportInfo.deleteAll(SportInfo.class);
      ActivityInfo.deleteAll(ActivityInfo.class);
      InActivityTriggerInfo.deleteAll(InActivityTriggerInfo.class);
      InactivityNonWearTriggerInfo.deleteAll(InactivityNonWearTriggerInfo.class);
      return SugarRecord.deleteAll(var0);
   }

   public static int deleteAll(Class var0, String var1, String... var2) {
      List var4 = find(ActivitySamples.class, var1, var2);
      Iterator var3 = var4.iterator();

      while(var3.hasNext()) {
         ((ActivitySamples)var3.next()).delete();
      }

      return var4.size();
   }

   private void deleteInactivityNonWearTriggerInfoList() {
      InactivityNonWearTriggerInfo.deleteAllWithParent(this);
      this.mInactivityNonWearTriggerList.clear();
   }

   private void deleteInactivityTriggerInfoList() {
      InActivityTriggerInfo.deleteAllWithParent(this);
      this.mInactivityTriggerList.clear();
   }

   private void deleteSportInfoList() {
      SportInfo.deleteAllWithParent(this);
      this.mSportInfoList.clear();
   }

   public static List findByDate(String var0) {
      return findByPath("/U/0/" + var0 + '/' + "ACT" + '/');
   }

   public static List findByDate(LocalDate var0) {
      return findByDate(var0.toString(ISODateTimeFormat.basicDate()));
   }

   public static List findByPath(String var0) {
      return find(ActivitySamples.class, "PATH = ?", new String[]{var0}, (String)null, "cast(substr(BASENAME,7) AS INTEGER)", (String)null);
   }

   public static List findNotClosed() {
      return find(ActivitySamples.class, "IS_CLOSED = ?", new String[]{"0"}, (String)null, "START_TIME, cast(substr(BASENAME,7) AS INTEGER)", (String)null);
   }

   private void generateBasenameIfEmpty() {
      if (TextUtils.isEmpty(this.basename)) {
         this.generatePathIfEmpty();
         List var1 = find(ActivitySamples.class, "PATH = ?", new String[]{this.path});
         int var2 = 0;

         label24:
         for(boolean var3 = false; !var3; ++var2) {
            this.basename = "ASAMPL" + var2;
            Iterator var4 = var1.iterator();

            ActivitySamples var5;
            do {
               if (!var4.hasNext()) {
                  var3 = true;
                  continue label24;
               }

               var5 = (ActivitySamples)var4.next();
            } while(!this.basename.equals(var5.basename));

            var3 = false;
         }
      }

   }

   private void generatePathIfEmpty() {
      if (TextUtils.isEmpty(this.path)) {
         DateTime var1 = q.b(this.startTime, this.startTimeZoneOffset);
         this.path = "/U/0/" + DateTimeFormat.forPattern("yyyyMMdd").print((ReadableInstant)var1) + '/' + "ACT" + '/';
      }

   }

   private void loadActivityInfoFromDb() {
      if (!this.mActivityInfosLoaded && this.getId() != null) {
         this.mActivityInfoList.addAll(ActivityInfo.findAllWithParent(this));
         this.mActivityInfosLoaded = true;
      }

   }

   private void loadInactivityNonWearTriggersFromDb() {
      if (!this.mInactivityNonWearTriggersLoaded && this.getId() != null) {
         this.mInactivityNonWearTriggerList.addAll(InactivityNonWearTriggerInfo.findAllWithParent(this));
         this.mInactivityNonWearTriggersLoaded = true;
      }

   }

   private void loadInactivityTriggersFromDb() {
      if (!this.mInactivityTriggersLoaded && this.getId() != null) {
         this.mInactivityTriggerList.addAll(InActivityTriggerInfo.findAllWithParent(this));
         this.mInactivityTriggersLoaded = true;
      }

   }

   private void loadMetSamplesFromJson() {
      if (!this.mMetSamplesLoaded) {
         this.mMetSampleList.clear();
         this.mMetSampleList.addAll(q.c(this.metSamples));
         this.mMetSamplesLoaded = true;
      }

   }

   private void loadSportInfoFromDb() {
      if (!this.mSportInfosLoaded && this.getId() != null) {
         this.mSportInfoList.addAll(SportInfo.findAllWithParent(this));
         this.mSportInfosLoaded = true;
      }

   }

   private void loadStepsSamplesFromJson() {
      if (!this.mStepsSamplesLoaded) {
         this.mStepsSampleList.clear();
         this.mStepsSampleList.addAll(q.b(this.stepsSamples));
         this.mStepsSamplesLoaded = true;
      }

   }

   private void saveMetSamplesToJson() {
      // $FF: Couldn't be decompiled
   }

   private void saveStepsSamplesToJson() {
      // $FF: Couldn't be decompiled
   }

   private long smartSave() {
      // $FF: Couldn't be decompiled
   }

   public void addActivityInfo(ActivityInfo var1) {
      this.getActivityInfoList().add(var1);
   }

   public boolean addEndingActivityInfoAndSportInfo() {
      boolean var1 = false;
      boolean var2 = false;
      DateTime var3 = this.calculateTimestampForEndingActivityInfoAndSportInfo();
      if (ab.a(this.getStartTime(), var3)) {
         label19: {
            ActivityInfo var4 = this.getLastActivityInfo();
            if (var4 != null) {
               var1 = var2;
               if (var4.getValue() == 8) {
                  break label19;
               }
            }

            var4 = new ActivityInfo();
            var4.setTimestamp(var3);
            var4.setValue(8);
            this.addActivityInfo(var4);
            var1 = true;
         }

         SportInfo var5 = this.getLastSportInfo();
         if (var5 == null || var5.getSportId() != -1L) {
            var5 = new SportInfo();
            var5.setTimestamp(var3);
            var5.setSportId(-1L);
            var5.setFactor(1.0F);
            this.addSportInfo(var5);
            var1 = true;
         }
      }

      return var1;
   }

   public void addInactivityNonWearTrigger(InactivityNonWearTriggerInfo var1) {
      this.getInactivityNonWearTriggerList().add(var1);
   }

   public void addInactivityTrigger(InActivityTriggerInfo var1) {
      this.getInactivityTriggerList().add(var1);
   }

   public void addMetSample(float var1) {
      this.getMetSampleList().add(var1);
   }

   public void addSportInfo(SportInfo var1) {
      this.getSportInfoList().add(var1);
   }

   public void addStepsSample(int var1) {
      this.getStepsSampleList().add(var1);
   }

   public List cloneActivityInfoList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneInActivityTriggerList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneInactivityNonWearTriggerList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneMetSampleList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneSportInfoList() {
      // $FF: Couldn't be decompiled
   }

   public List cloneStepsSampleList() {
      // $FF: Couldn't be decompiled
   }

   public boolean delete() {
      this.deleteSportInfoList();
      this.deleteActivityInfoList();
      this.deleteInactivityTriggerInfoList();
      this.deleteInactivityNonWearTriggerInfoList();
      return super.delete();
   }

   List getActivityInfoList() {
      this.loadActivityInfoFromDb();
      return this.mActivityInfoList;
   }

   public String getBasename() {
      this.generateBasenameIfEmpty();
      return this.basename;
   }

   public DateTime getEndTime() {
      DateTime var1 = this.getStartTime();
      if (var1 != null) {
         var1 = var1.plusMillis((int)(this.metRecordingInterval * (long)this.getMetSampleList().size()));
      } else {
         var1 = null;
      }

      return var1;
   }

   List getInactivityNonWearTriggerList() {
      this.loadInactivityNonWearTriggersFromDb();
      return this.mInactivityNonWearTriggerList;
   }

   List getInactivityTriggerList() {
      this.loadInactivityTriggersFromDb();
      return this.mInactivityTriggerList;
   }

   public ActivityInfo getLastActivityInfo() {
      // $FF: Couldn't be decompiled
   }

   public SportInfo getLastSportInfo() {
      // $FF: Couldn't be decompiled
   }

   public long getMetRecordingInterval() {
      return this.metRecordingInterval;
   }

   public int getMetSampleCount() {
      return this.getMetSampleList().size();
   }

   List getMetSampleList() {
      this.loadMetSamplesFromJson();
      return this.mMetSampleList;
   }

   public String getPath() {
      this.generatePathIfEmpty();
      return this.path;
   }

   List getSportInfoList() {
      this.loadSportInfoFromDb();
      return this.mSportInfoList;
   }

   public DateTime getStartTime() {
      DateTime var1;
      if (this.startTime != null) {
         var1 = q.b(this.startTime, this.startTimeZoneOffset);
      } else {
         var1 = null;
      }

      return var1;
   }

   public long getStepsRecordingInterval() {
      return this.stepsRecordingInterval;
   }

   public int getStepsSampleCount() {
      return this.getStepsSampleList().size();
   }

   List getStepsSampleList() {
      this.loadStepsSamplesFromJson();
      return this.mStepsSampleList;
   }

   public boolean isClosed() {
      return this.isClosed;
   }

   public void replaceActivityInfo(ActivityInfo param1) {
      // $FF: Couldn't be decompiled
   }

   public long save() {
      return this.smartSave();
   }

   void setBuildConfig(a var1) {
      this.mBuildConfigWrapper = var1;
   }

   public void setClosed(boolean var1) {
      this.isClosed = var1;
   }

   public void setMetRecordingInterval(long var1) {
      this.metRecordingInterval = var1;
   }

   public void setStartTime(DateTime var1) {
      var1 = ab.a(var1);
      this.startTime = new Date(var1.getMillis());
      this.startTimeZoneOffset = ab.d(var1);
   }

   public void setStepsRecordingInterval(long var1) {
      this.stepsRecordingInterval = var1;
   }

   public ActivitySamples$PbActivitySamples toPbObject() {
      // $FF: Couldn't be decompiled
   }
}
