package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbInActivityNonWearTriggerInfo;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbInActivityNonWearTriggerInfo$Builder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;

public class InactivityNonWearTriggerInfo extends ProtoEncodableEntity implements ActivitySamplesChild {
   private static final String TAG = "InactivityNonWearTriggerInfo";
   private long activitySamples;
   private Date endTimestamp;
   private int endTimestampOffset;
   private Date startTimestamp;
   private int startTimestampOffset;

   public InactivityNonWearTriggerInfo() {
      this.activitySamples = 0L;
   }

   public InactivityNonWearTriggerInfo(InactivityNonWearTriggerInfo var1) {
      Object var2 = null;
      super();
      this.activitySamples = 0L;
      this.activitySamples = var1.activitySamples;
      Date var3;
      if (var1.startTimestamp != null) {
         var3 = new Date(var1.startTimestamp.getTime());
      } else {
         var3 = null;
      }

      this.startTimestamp = var3;
      var3 = (Date)var2;
      if (var1.endTimestamp != null) {
         var3 = new Date(var1.endTimestamp.getTime());
      }

      this.endTimestamp = var3;
      this.startTimestampOffset = var1.startTimestampOffset;
      this.endTimestampOffset = var1.endTimestampOffset;
   }

   public InactivityNonWearTriggerInfo(ActivitySamples$PbInActivityNonWearTriggerInfo var1) {
      this();
      if (var1.isInitialized()) {
         DateTime var2 = q.c(var1.getStartTimeStamp());
         this.startTimestamp = new Date(var2.getMillis());
         this.startTimestampOffset = ab.d(var2);
         DateTime var3 = q.c(var1.getEndTimeStamp());
         this.endTimestamp = new Date(var3.getMillis());
         this.endTimestampOffset = ab.d(var3);
      }

   }

   public InactivityNonWearTriggerInfo(InputStream var1) {
      this(ActivitySamples$PbInActivityNonWearTriggerInfo.parseFrom(var1));
   }

   public static void deleteAllWithParent(ActivitySamples var0) {
      if (var0 != null && var0.getId() != null) {
         deleteAll(InactivityNonWearTriggerInfo.class, "ACTIVITY_SAMPLES = ?", new String[]{String.valueOf(var0.getId())});
      }

   }

   public static List findAllWithParent(ActivitySamples var0) {
      Object var1;
      if (var0 != null && var0.getId() != null) {
         var1 = find(InactivityNonWearTriggerInfo.class, "ACTIVITY_SAMPLES = ?", new String[]{String.valueOf(var0.getId())}, (String)null, "START_TIMESTAMP", (String)null);
      } else {
         var1 = new ArrayList();
      }

      return (List)var1;
   }

   private void setEndTimestampOffset(DateTime var1) {
      this.endTimestampOffset = ab.d(var1);
   }

   private void setStartTimestampOffset(DateTime var1) {
      this.startTimestampOffset = ab.d(var1);
   }

   public long getActivitySamplesId() {
      return this.activitySamples;
   }

   public DateTime getEndTimestamp() {
      DateTime var1;
      if (this.endTimestamp != null) {
         var1 = q.b(this.endTimestamp, this.startTimestampOffset);
      } else {
         var1 = null;
      }

      return var1;
   }

   public int getEndTimestampOffset() {
      return this.endTimestampOffset;
   }

   public DateTime getStartTimestamp() {
      DateTime var1;
      if (this.startTimestamp != null) {
         var1 = q.b(this.startTimestamp, this.startTimestampOffset);
      } else {
         var1 = null;
      }

      return var1;
   }

   public int getStartTimestampOffset() {
      return this.startTimestampOffset;
   }

   public long save(long var1) {
      this.activitySamples = var1;
      return this.save();
   }

   public void setEndTimestamp(DateTime var1) {
      var1 = ab.a(var1);
      this.endTimestamp = new Date(var1.getMillis());
      this.setEndTimestampOffset(var1);
   }

   public void setStartTimestamp(DateTime var1) {
      var1 = ab.a(var1);
      this.startTimestamp = new Date(var1.getMillis());
      this.setStartTimestampOffset(var1);
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo toPbObject() {
      ActivitySamples$PbInActivityNonWearTriggerInfo$Builder var1 = ActivitySamples$PbInActivityNonWearTriggerInfo.newBuilder();
      if (this.startTimestamp != null) {
         var1.setStartTimeStamp(q.a(this.startTimestamp, this.startTimestampOffset));
      }

      if (this.endTimestamp != null) {
         var1.setEndTimeStamp(q.a(this.endTimestamp, this.endTimestampOffset));
      }

      return var1.build();
   }
}
