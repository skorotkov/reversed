package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.util.aa;
import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbInActivityTriggerInfo;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbInActivityTriggerInfo$Builder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;

public class InActivityTriggerInfo extends ProtoEncodableEntity implements ActivitySamplesInfoChild {
   private long activitySamples;
   private Date timestamp;
   private int timestampOffset;

   public InActivityTriggerInfo() {
      this.activitySamples = 0L;
   }

   public InActivityTriggerInfo(InActivityTriggerInfo var1) {
      this.activitySamples = 0L;
      this.activitySamples = var1.activitySamples;
      Date var2;
      if (var1.timestamp != null) {
         var2 = new Date(var1.timestamp.getTime());
      } else {
         var2 = null;
      }

      this.timestamp = var2;
      this.timestampOffset = var1.timestampOffset;
   }

   public InActivityTriggerInfo(ActivitySamples$PbInActivityTriggerInfo var1) {
      this();
      if (var1.hasTimeStamp()) {
         DateTime var2 = q.c(var1.getTimeStamp());
         this.timestamp = new Date(var2.getMillis());
         this.timestampOffset = ab.d(var2);
      }

   }

   public InActivityTriggerInfo(InputStream var1) {
      this(ActivitySamples$PbInActivityTriggerInfo.parseFrom(var1));
   }

   public static void deleteAllWithParent(ActivitySamples var0) {
      if (var0 != null && var0.getId() != null) {
         deleteAll(InActivityTriggerInfo.class, "ACTIVITY_SAMPLES = ?", new String[]{String.valueOf(var0.getId())});
      }

   }

   public static List findAllWithParent(ActivitySamples var0) {
      Object var1;
      if (var0 != null && var0.getId() != null) {
         var1 = find(InActivityTriggerInfo.class, "ACTIVITY_SAMPLES = ?", new String[]{String.valueOf(var0.getId())}, (String)null, "TIMESTAMP", (String)null);
      } else {
         var1 = new ArrayList();
      }

      return (List)var1;
   }

   public static List getCurrentDayInactivityTriggerInfos() {
      return find(InActivityTriggerInfo.class, "TIMESTAMP>?", new String[]{String.valueOf((new aa()).e().withTimeAtStartOfDay().getMillis())});
   }

   public long getActivitySamplesId() {
      return this.activitySamples;
   }

   public DateTime getTimestamp() {
      DateTime var1;
      if (this.timestamp != null) {
         var1 = q.b(this.timestamp, this.timestampOffset);
      } else {
         var1 = null;
      }

      return var1;
   }

   public long save(long var1) {
      this.activitySamples = var1;
      return this.save();
   }

   public void setTimestamp(DateTime var1) {
      var1 = ab.a(var1);
      this.timestamp = new Date(var1.getMillis());
      this.timestampOffset = ab.d(var1);
   }

   public ActivitySamples$PbInActivityTriggerInfo toPbObject() {
      ActivitySamples$PbInActivityTriggerInfo$Builder var1 = ActivitySamples$PbInActivityTriggerInfo.newBuilder();
      if (this.timestamp != null) {
         var1.setTimeStamp(q.a(this.timestamp, this.timestampOffset));
      }

      return var1.build();
   }
}
