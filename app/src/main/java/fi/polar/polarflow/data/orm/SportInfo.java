package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbSportInfo;
import fi.polar.remote.representation.protobuf.ActivitySamples$PbSportInfo$Builder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;

public class SportInfo extends ProtoEncodableEntity implements ActivitySamplesInfoChild {
   public static final float FACTOR_NONE = 1.0F;
   private long activitySamples;
   private float factor;
   private long sportId;
   private Date timestamp;
   private int timestampOffset;

   public SportInfo() {
      this.activitySamples = 0L;
      this.factor = -1.0F;
      this.sportId = -2L;
   }

   public SportInfo(SportInfo var1) {
      this.activitySamples = 0L;
      this.activitySamples = var1.activitySamples;
      this.factor = var1.factor;
      Date var2;
      if (var1.timestamp != null) {
         var2 = new Date(var1.timestamp.getTime());
      } else {
         var2 = null;
      }

      this.timestamp = var2;
      this.timestampOffset = var1.timestampOffset;
      this.sportId = var1.sportId;
   }

   public SportInfo(ActivitySamples$PbSportInfo var1) {
      this();
      if (var1.hasFactor()) {
         this.factor = var1.getFactor();
      }

      if (var1.hasTimeStamp()) {
         DateTime var2 = q.c(var1.getTimeStamp());
         this.timestamp = new Date(var2.getMillis());
         this.timestampOffset = ab.d(var2);
      }

      if (var1.hasSportProfileId()) {
         this.sportId = var1.getSportProfileId();
      }

   }

   public SportInfo(InputStream var1) {
      this(ActivitySamples$PbSportInfo.parseFrom(var1));
   }

   public static void deleteAllWithParent(ActivitySamples var0) {
      if (var0 != null && var0.getId() != null) {
         deleteAll(SportInfo.class, "ACTIVITY_SAMPLES = ?", new String[]{String.valueOf(var0.getId())});
      }

   }

   public static List findAllWithParent(ActivitySamples var0) {
      Object var1;
      if (var0 != null && var0.getId() != null) {
         var1 = find(SportInfo.class, "ACTIVITY_SAMPLES = ?", new String[]{String.valueOf(var0.getId())}, (String)null, "TIMESTAMP", (String)null);
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

   public long getSportId() {
      return this.sportId;
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

   public void setFactor(float var1) {
      this.factor = var1;
   }

   public void setSportId(long var1) {
      this.sportId = var1;
   }

   public void setTimestamp(DateTime var1) {
      var1 = ab.a(var1);
      this.timestamp = new Date(var1.getMillis());
      this.timestampOffset = ab.d(var1);
   }

   public ActivitySamples$PbSportInfo toPbObject() {
      ActivitySamples$PbSportInfo$Builder var1 = ActivitySamples$PbSportInfo.newBuilder();
      if (this.factor != -1.0F) {
         var1.setFactor(this.factor);
      }

      if (this.timestamp != null) {
         var1.setTimeStamp(q.a(this.timestamp, this.timestampOffset));
      }

      if (this.sportId != -2L) {
         var1.setSportProfileId(this.sportId);
      }

      return var1.build();
   }
}
