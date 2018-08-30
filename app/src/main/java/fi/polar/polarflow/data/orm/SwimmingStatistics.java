package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.a.a;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingPoolInformation;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbSwimmingStatistics;
import fi.polar.remote.representation.protobuf.ExerciseStatistics$PbSwimmingStatistics$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbSwimmingPoolInfo;
import fi.polar.remote.representation.protobuf.Structures$PbSwimmingPoolInfo$Builder;
import fi.polar.remote.representation.protobuf.Types$PbSwimmingPoolUnits;
import java.util.List;

public class SwimmingStatistics extends ProtoEncodableEntity {
   private static final String TAG = "SwimmingStatistics";
   private SwimmingStyleStatistics backstrokeStatistics = null;
   private SwimmingStyleStatistics breaststrokeStatistics = null;
   private SwimmingStyleStatistics butterflyStatistics = null;
   private SwimmingStyleStatistics freestyleStatistics = null;
   private int numberOfPoolsSwimmed = -1;
   private String path;
   private float poolLength = -1.0F;
   private float swimmingDistance = -1.0F;
   private int swimmingPoolType = -1;
   private int totalStrokeCount = -1;

   public SwimmingStatistics() {
   }

   public SwimmingStatistics(fi.polar.polarmathsmart.swimming.poolswimming.SwimmingStatistics var1) {
      this.setSwimmingDistance(var1.getSwimmingDistance());
      this.setTotalStrokeCount(var1.getTotalStrokeCount());
      this.setNumberOfPoolsSwimmed(var1.getNbrOfPoolsSwimmed());
      SwimmingPoolInformation var2 = var1.getSwimmingPool();
      if (var2 != null) {
         this.poolLength = var2.getSwimmingPoolLength();
         if (var2.getSwimmingPoolType() == 0) {
            this.swimmingPoolType = Types$PbSwimmingPoolUnits.SWIMMING_POOL_METERS.getNumber();
         } else {
            this.swimmingPoolType = Types$PbSwimmingPoolUnits.SWIMMING_POOL_YARDS.getNumber();
         }
      }

      if (var1.getFreestyleStatistics() != null) {
         this.setFreestyleStatistics(new SwimmingStyleStatistics(var1.getFreestyleStatistics(), 0));
      }

      if (var1.getBackstrokeStatistics() != null) {
         this.setBackstrokeStatistics(new SwimmingStyleStatistics(var1.getBackstrokeStatistics(), 1));
      }

      if (var1.getBreaststrokeStatistics() != null) {
         this.setBreaststrokeStatistics(new SwimmingStyleStatistics(var1.getBreaststrokeStatistics(), 2));
      }

      if (var1.getButterflyStatistics() != null) {
         this.setButterflyStatistics(new SwimmingStyleStatistics(var1.getButterflyStatistics(), 3));
      }

   }

   public SwimmingStatistics(ExerciseStatistics$PbSwimmingStatistics var1) {
      if (var1.hasSwimmingDistance()) {
         this.setSwimmingDistance(var1.getSwimmingDistance());
      }

      if (var1.hasTotalStrokeCount()) {
         this.setTotalStrokeCount(var1.getTotalStrokeCount());
      }

      if (var1.hasNumberOfPoolsSwimmed()) {
         this.setNumberOfPoolsSwimmed(var1.getNumberOfPoolsSwimmed());
      }

      if (var1.hasSwimmingPool()) {
         Structures$PbSwimmingPoolInfo var2 = var1.getSwimmingPool();
         if (var2.hasPoolLength()) {
            this.setPoolLength(var2.getPoolLength());
         }

         if (var2.hasSwimmingPoolType()) {
            this.setSwimmingPoolType(var2.getSwimmingPoolType().getNumber());
         }
      }

      if (var1.hasFreestyleStatistics()) {
         this.setFreestyleStatistics(new SwimmingStyleStatistics(var1.getFreestyleStatistics(), 0));
      }

      if (var1.hasBackstrokeStatistics()) {
         this.setBackstrokeStatistics(new SwimmingStyleStatistics(var1.getBackstrokeStatistics(), 1));
      }

      if (var1.hasBreaststrokeStatistics()) {
         this.setBreaststrokeStatistics(new SwimmingStyleStatistics(var1.getBreaststrokeStatistics(), 2));
      }

      if (var1.hasButterflyStatistics()) {
         this.setButterflyStatistics(new SwimmingStyleStatistics(var1.getButterflyStatistics(), 3));
      }

   }

   public static SwimmingStatistics findByPath(String var0) {
      List var1 = find(SwimmingStatistics.class, "PATH = ?", new String[]{var0});
      SwimmingStatistics var2;
      if (var1.isEmpty()) {
         var2 = null;
      } else {
         var2 = (SwimmingStatistics)var1.get(0);
      }

      return var2;
   }

   public SwimmingStyleStatistics getBackstrokeStatistics() {
      return this.backstrokeStatistics;
   }

   public SwimmingStyleStatistics getBreaststrokeStatistics() {
      return this.breaststrokeStatistics;
   }

   public SwimmingStyleStatistics getButterflyStatistics() {
      return this.butterflyStatistics;
   }

   public SwimmingStyleStatistics getFreestyleStatistics() {
      return this.freestyleStatistics;
   }

   public int getNumberOfPoolsSwimmed() {
      return this.numberOfPoolsSwimmed;
   }

   public String getPath() {
      return this.path;
   }

   public float getPoolLength() {
      return this.poolLength;
   }

   public float getSwimmingDistance() {
      return this.swimmingDistance;
   }

   public Types$PbSwimmingPoolUnits getSwimmingPoolType() {
      return Types$PbSwimmingPoolUnits.forNumber(this.swimmingPoolType);
   }

   public int getSwimmingPoolUnit() {
      byte var1;
      if (this.swimmingPoolType == 0) {
         var1 = 0;
      } else {
         var1 = 1;
      }

      return var1;
   }

   public int getTotalStrokeCount() {
      return this.totalStrokeCount;
   }

   public long save() {
      if (this.freestyleStatistics != null && this.freestyleStatistics.containsData()) {
         this.freestyleStatistics.save();
      }

      if (this.backstrokeStatistics != null && this.backstrokeStatistics.containsData()) {
         this.backstrokeStatistics.save();
      }

      if (this.breaststrokeStatistics != null && this.breaststrokeStatistics.containsData()) {
         this.breaststrokeStatistics.save();
      }

      if (this.butterflyStatistics != null && this.butterflyStatistics.containsData()) {
         this.butterflyStatistics.save();
      }

      return super.save();
   }

   public void setBackstrokeStatistics(SwimmingStyleStatistics var1) {
      this.backstrokeStatistics = var1;
   }

   public void setBreaststrokeStatistics(SwimmingStyleStatistics var1) {
      this.breaststrokeStatistics = var1;
   }

   public void setButterflyStatistics(SwimmingStyleStatistics var1) {
      this.butterflyStatistics = var1;
   }

   public void setFreestyleStatistics(SwimmingStyleStatistics var1) {
      this.freestyleStatistics = var1;
   }

   public void setNumberOfPoolsSwimmed(int var1) {
      this.numberOfPoolsSwimmed = a.a(12, var1);
   }

   public void setPath(String var1) {
      this.path = var1;
      if (this.freestyleStatistics != null) {
         this.freestyleStatistics.setPath(var1);
      }

      if (this.backstrokeStatistics != null) {
         this.backstrokeStatistics.setPath(var1);
      }

      if (this.breaststrokeStatistics != null) {
         this.breaststrokeStatistics.setPath(var1);
      }

      if (this.butterflyStatistics != null) {
         this.butterflyStatistics.setPath(var1);
      }

   }

   public void setPoolLength(float var1) {
      this.poolLength = a.a(14, var1);
   }

   public void setSwimmingDistance(float var1) {
      this.swimmingDistance = a.a(1, var1);
   }

   public void setSwimmingPoolType(int var1) {
      this.swimmingPoolType = var1;
   }

   public void setSwimmingPoolType(Types$PbSwimmingPoolUnits var1) {
      this.swimmingPoolType = var1.getNumber();
   }

   public void setTotalStrokeCount(int var1) {
      this.totalStrokeCount = a.a(13, var1);
   }

   public ExerciseStatistics$PbSwimmingStatistics toPbObject() {
      ExerciseStatistics$PbSwimmingStatistics$Builder var1 = ExerciseStatistics$PbSwimmingStatistics.newBuilder();
      var1.setSwimmingDistance(this.getSwimmingDistance());
      if (this.getTotalStrokeCount() != -1) {
         var1.setTotalStrokeCount(this.getTotalStrokeCount());
      }

      if (this.getNumberOfPoolsSwimmed() != -1) {
         var1.setNumberOfPoolsSwimmed(this.getNumberOfPoolsSwimmed());
      }

      if (this.getSwimmingPoolType() != null) {
         Structures$PbSwimmingPoolInfo$Builder var2 = Structures$PbSwimmingPoolInfo.newBuilder();
         if (this.getPoolLength() != -1.0F) {
            var2.setPoolLength(this.getPoolLength());
         }

         var2.setSwimmingPoolType(this.getSwimmingPoolType());
         var1.setSwimmingPool(var2.build());
      }

      if (this.freestyleStatistics != null && this.freestyleStatistics.containsData()) {
         var1.setFreestyleStatistics(this.freestyleStatistics.toPbObject());
      }

      if (this.backstrokeStatistics != null && this.backstrokeStatistics.containsData()) {
         var1.setBackstrokeStatistics(this.backstrokeStatistics.toPbObject());
      }

      if (this.breaststrokeStatistics != null && this.breaststrokeStatistics.containsData()) {
         var1.setBreaststrokeStatistics(this.breaststrokeStatistics.toPbObject());
      }

      if (this.butterflyStatistics != null && this.butterflyStatistics.containsData()) {
         var1.setButterflyStatistics(this.butterflyStatistics.toPbObject());
      }

      return var1.build();
   }
}
