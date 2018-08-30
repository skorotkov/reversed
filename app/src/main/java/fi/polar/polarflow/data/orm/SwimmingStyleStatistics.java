package fi.polar.polarflow.data.orm;

import android.os.Parcel;
import android.os.Parcelable;

import fi.polar.polarflow.a_package.a;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbSwimmingStyleStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbSwimmingStyleStatistics$Builder;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SwimmingStyleStatistics extends ProtoEncodableEntity implements Parcelable {
   public static final Creator CREATOR = new SwimmingStyleStatistics$1();
   private int averageHeartrate = 0;
   private float averageSwolf = -1.0F;
   private float distance = -1.0F;
   private int maximumHeartrate = 0;
   private String path;
   private long poolTimeMin = -1L;
   private int strokeCount = -1;
   private int swimmingStyle = -1;
   private long swimmingTimeTotal = -1L;

   public SwimmingStyleStatistics() {
   }

   public SwimmingStyleStatistics(Parcel var1) {
      this.distance = var1.readFloat();
      this.strokeCount = var1.readInt();
      this.swimmingTimeTotal = var1.readLong();
      this.averageHeartrate = var1.readInt();
      this.maximumHeartrate = var1.readInt();
      this.averageSwolf = var1.readFloat();
      this.poolTimeMin = var1.readLong();
      this.swimmingStyle = var1.readInt();
      this.path = var1.readString();
   }

   public SwimmingStyleStatistics(fi.polar.polarmathsmart.swimming.poolswimming.SwimmingStyleStatistics var1, int var2) {
      this.setDistance(var1.getDistance());
      this.setStrokeCount(var1.getStrokeCount());
      this.setSwimmingTimeTotal((long)(var1.getDuration() * (float)TimeUnit.SECONDS.toMillis(1L)));
      this.setAverageHeartrate(var1.getAvgHeartrate());
      this.setMaximumHeartrate(var1.getMaxHeartrate());
      this.setAverageSwolf(var1.getAvgSwolf());
      this.setPoolTimeMin((long)(var1.getPoolTimeMin() * (float)TimeUnit.SECONDS.toMillis(1L)));
      this.setSwimmingStyle(var2);
   }

   public SwimmingStyleStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1, int var2) {
      if (var1.hasDistance()) {
         this.setDistance(var1.getDistance());
      }

      if (var1.hasStrokeCount()) {
         this.setStrokeCount(var1.getStrokeCount());
      }

      if (var1.hasSwimmingTimeTotal()) {
         this.setSwimmingTimeTotal(q.a(var1.getSwimmingTimeTotal()));
      }

      if (var1.hasAverageHeartrate()) {
         this.setAverageHeartrate(var1.getAverageHeartrate());
      }

      if (var1.hasMaximumHeartrate()) {
         this.setMaximumHeartrate(var1.getMaximumHeartrate());
      }

      if (var1.hasAverageSwolf()) {
         this.setAverageSwolf(var1.getAverageSwolf());
      }

      if (var1.hasPoolTimeMin()) {
         this.setPoolTimeMin(q.a(var1.getPoolTimeMin()));
      }

      this.setSwimmingStyle(var2);
   }

   public static List findByPath(String var0) {
      return find(SwimmingStyleStatistics.class, "PATH LIKE ?", new String[]{var0 + "%"});
   }

   public boolean containsData() {
      boolean var1;
      if (this.distance > 0.0F) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int describeContents() {
      return 0;
   }

   public int getAverageHeartrate() {
      return this.averageHeartrate;
   }

   public float getAverageSwolf() {
      return this.averageSwolf;
   }

   public float getDistance() {
      return this.distance;
   }

   public int getMaximumHeartrate() {
      return this.maximumHeartrate;
   }

   public long getPoolTimeMin() {
      return this.poolTimeMin;
   }

   public int getStrokeCount() {
      return this.strokeCount;
   }

   public int getSwimmingStyle() {
      return this.swimmingStyle;
   }

   public long getSwimmingTimeTotal() {
      return this.swimmingTimeTotal;
   }

   public void setAverageHeartrate(int var1) {
      this.averageHeartrate = a.a(16, var1);
   }

   public void setAverageSwolf(float var1) {
      this.averageSwolf = a.a(15, var1);
   }

   public void setDistance(float var1) {
      this.distance = a.a(1, var1);
   }

   public void setMaximumHeartrate(int var1) {
      this.maximumHeartrate = a.a(16, var1);
   }

   public void setPath(String var1) {
      this.path = var1;
   }

   public void setPoolTimeMin(long var1) {
      this.poolTimeMin = a.a(10, var1);
   }

   public void setStrokeCount(int var1) {
      this.strokeCount = a.a(13, var1);
   }

   public void setSwimmingStyle(int var1) {
      this.swimmingStyle = var1;
   }

   public void setSwimmingTimeTotal(long var1) {
      this.swimmingTimeTotal = a.a(10, var1);
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics toPbObject() {
      ExerciseStatistics$PbSwimmingStyleStatistics$Builder var1 = ExerciseStatistics$PbSwimmingStyleStatistics.newBuilder();
      if (this.distance != -1.0F) {
         var1.setDistance(this.distance);
      }

      if (this.strokeCount != -1) {
         var1.setStrokeCount(this.strokeCount);
      }

      if (this.swimmingTimeTotal > 0L) {
         var1.setSwimmingTimeTotal(q.b(this.swimmingTimeTotal));
      }

      if (this.averageHeartrate != 0) {
         var1.setAverageHeartrate(this.averageHeartrate);
      }

      if (this.maximumHeartrate != 0) {
         var1.setMaximumHeartrate(this.maximumHeartrate);
      }

      if (this.averageSwolf > 0.0F) {
         var1.setAverageSwolf(this.averageSwolf);
      }

      if (this.poolTimeMin > 0L) {
         var1.setPoolTimeMin(q.b(this.poolTimeMin));
      }

      return var1.build();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeFloat(this.distance);
      var1.writeInt(this.strokeCount);
      var1.writeLong(this.swimmingTimeTotal);
      var1.writeInt(this.averageHeartrate);
      var1.writeInt(this.maximumHeartrate);
      var1.writeFloat(this.averageSwolf);
      var1.writeLong(this.poolTimeMin);
      var1.writeInt(this.swimmingStyle);
      var1.writeString(this.path);
   }
}
