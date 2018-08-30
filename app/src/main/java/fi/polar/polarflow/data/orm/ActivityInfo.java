package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbActivityInfo;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbActivityInfo$ActivityClass;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbActivityInfo$Builder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;

public class ActivityInfo extends ProtoEncodableEntity implements ActivitySamplesInfoChild {
   public static final int[] ACTIVITY_CLASSES = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
   public static final int ACTIVITY_CLASS_CONTINUOUS_MODERATE = 4;
   public static final int ACTIVITY_CLASS_CONTINUOUS_VIGOROUS = 6;
   public static final int ACTIVITY_CLASS_INTERMITTENT_MODERATE = 5;
   public static final int ACTIVITY_CLASS_INTERMITTENT_VIGOROUS = 7;
   public static final int ACTIVITY_CLASS_LIGHT = 3;
   public static final int ACTIVITY_CLASS_NON_WEAR = 8;
   public static final int ACTIVITY_CLASS_SEDENTARY = 2;
   public static final int ACTIVITY_CLASS_SLEEP = 1;
   public static final int ACTIVITY_CLASS_UNDEFINED = Integer.MAX_VALUE;
   private long activitySamples;
   private float factor;
   private Date timestamp;
   private int timestampOffset;
   private int value;

   public ActivityInfo() {
      this.activitySamples = 0L;
      this.value = Integer.MAX_VALUE;
      this.factor = -1.0F;
   }

   public ActivityInfo(ActivityInfo var1) {
      this.activitySamples = 0L;
      this.activitySamples = var1.activitySamples;
      this.value = var1.value;
      Date var2;
      if (var1.timestamp != null) {
         var2 = new Date(var1.timestamp.getTime());
      } else {
         var2 = null;
      }

      this.timestamp = var2;
      this.timestampOffset = var1.timestampOffset;
      this.factor = var1.factor;
   }

   public ActivityInfo(ActivitySamples$PbActivityInfo var1) {
      this();
      if (var1.hasValue()) {
         this.value = var1.getValue().getNumber();
      }

      if (var1.hasTimeStamp()) {
         DateTime var2 = q.c(var1.getTimeStamp());
         this.timestamp = new Date(var2.getMillis());
         this.timestampOffset = ab.d(var2);
      }

      if (var1.hasFactor()) {
         this.factor = var1.getFactor();
      }

   }

   public ActivityInfo(InputStream var1) {
      this(ActivitySamples$PbActivityInfo.parseFrom(var1));
   }

   public static void deleteAllWithParent(ActivitySamples var0) {
      if (var0 != null && var0.getId() != null) {
         deleteAll(ActivityInfo.class, "ACTIVITY_SAMPLES = ?", new String[]{String.valueOf(var0.getId())});
      }

   }

   public static List findAllWithParent(ActivitySamples var0) {
      Object var1;
      if (var0 != null && var0.getId() != null) {
         var1 = find(ActivityInfo.class, "ACTIVITY_SAMPLES = ?", new String[]{String.valueOf(var0.getId())}, (String)null, "TIMESTAMP", (String)null);
      } else {
         var1 = new ArrayList();
      }

      return (List)var1;
   }

   public long getActivitySamplesId() {
      return this.activitySamples;
   }

   public float getFactor() {
      return this.factor;
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

   public int getValue() {
      return this.value;
   }

   public long save(long var1) {
      this.activitySamples = var1;
      return this.save();
   }

   public void setFactor(float var1) {
      this.factor = var1;
   }

   public void setTimestamp(DateTime var1) {
      var1 = ab.a(var1);
      this.timestamp = new Date(var1.getMillis());
      this.timestampOffset = ab.d(var1);
   }

   public void setValue(int var1) {
      this.value = var1;
   }

   public ActivitySamples$PbActivityInfo toPbObject() {
      ActivitySamples$PbActivityInfo$Builder var1 = ActivitySamples$PbActivityInfo.newBuilder();
      if (this.value != Integer.MAX_VALUE) {
         var1.setValue(ActivitySamples$PbActivityInfo$ActivityClass.forNumber(this.value));
      }

      if (this.timestamp != null) {
         var1.setTimeStamp(q.a(this.timestamp, this.timestampOffset));
      }

      if (this.factor != -1.0F) {
         var1.setFactor(this.factor);
      }

      return var1.build();
   }
}
