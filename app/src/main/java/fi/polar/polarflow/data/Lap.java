package fi.polar.polarflow.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class Lap implements Parcelable {
   public static final Creator CREATOR = new Lap$1();
   private final float ascent;
   private final int autoLapType;
   private final int avgCadence;
   private final float avgDurationOfPool;
   private final int avgHR;
   private final float avgSpeed;
   private final float descent;
   private final float distance;
   private final long durationMillis;
   private final int lapNumber;
   private final int lapStrokes;
   private final int maxCadence;
   private final int maxHR;
   private final float maxSpeed;
   private final int minHR;
   private final int poolCount;
   private final long splitTimeMillis;

   protected Lap(Parcel var1) {
      this.autoLapType = var1.readInt();
      this.durationMillis = var1.readLong();
      this.distance = var1.readFloat();
      this.splitTimeMillis = var1.readLong();
      this.avgHR = var1.readInt();
      this.maxHR = var1.readInt();
      this.minHR = var1.readInt();
      this.avgSpeed = var1.readFloat();
      this.maxSpeed = var1.readFloat();
      this.ascent = var1.readFloat();
      this.descent = var1.readFloat();
      this.lapNumber = var1.readInt();
      this.avgCadence = var1.readInt();
      this.maxCadence = var1.readInt();
      this.lapStrokes = var1.readInt();
      this.poolCount = var1.readInt();
      this.avgDurationOfPool = var1.readFloat();
   }

   private Lap(Lap$LapBuilder var1) {
      this.autoLapType = Lap$LapBuilder.access$000(var1);
      this.durationMillis = Lap$LapBuilder.access$100(var1);
      this.distance = Lap$LapBuilder.access$200(var1);
      this.splitTimeMillis = Lap$LapBuilder.access$300(var1);
      this.avgHR = Lap$LapBuilder.access$400(var1);
      this.maxHR = Lap$LapBuilder.access$500(var1);
      this.minHR = Lap$LapBuilder.access$600(var1);
      this.avgSpeed = Lap$LapBuilder.access$700(var1);
      this.maxSpeed = Lap$LapBuilder.access$800(var1);
      this.ascent = Lap$LapBuilder.access$900(var1);
      this.descent = Lap$LapBuilder.access$1000(var1);
      this.avgCadence = Lap$LapBuilder.access$1100(var1);
      this.maxCadence = Lap$LapBuilder.access$1200(var1);
      this.lapStrokes = Lap$LapBuilder.access$1300(var1);
      this.poolCount = Lap$LapBuilder.access$1400(var1);
      this.avgDurationOfPool = Lap$LapBuilder.access$1500(var1);
      this.lapNumber = Lap$LapBuilder.access$1600(var1);
   }

   // $FF: synthetic method
   Lap(Lap$LapBuilder var1, Lap$1 var2) {
      this(var1);
   }

   public int describeContents() {
      return 0;
   }

   public float getAscent() {
      return this.ascent;
   }

   public int getAutoLapType() {
      return this.autoLapType;
   }

   public int getAvgCadence() {
      return this.avgCadence;
   }

   public float getAvgDurationOfPool() {
      return this.avgDurationOfPool;
   }

   public int getAvgHR() {
      return this.avgHR;
   }

   public float getAvgSpeed() {
      return this.avgSpeed;
   }

   public float getDescent() {
      return this.descent;
   }

   public float getDistance() {
      return this.distance;
   }

   public long getDurationMillis() {
      return this.durationMillis;
   }

   public int getLapNumber() {
      return this.lapNumber;
   }

   public int getLapStrokes() {
      return this.lapStrokes;
   }

   public int getMaxCadence() {
      return this.maxCadence;
   }

   public int getMaxHR() {
      return this.maxHR;
   }

   public float getMaxSpeed() {
      return this.maxSpeed;
   }

   public int getMinHR() {
      return this.minHR;
   }

   public int getPoolCount() {
      return this.poolCount;
   }

   public long getSplitTimeMillis() {
      return this.splitTimeMillis;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.autoLapType);
      var1.writeLong(this.durationMillis);
      var1.writeFloat(this.distance);
      var1.writeLong(this.splitTimeMillis);
      var1.writeInt(this.avgHR);
      var1.writeInt(this.maxHR);
      var1.writeInt(this.minHR);
      var1.writeFloat(this.avgSpeed);
      var1.writeFloat(this.maxSpeed);
      var1.writeFloat(this.ascent);
      var1.writeFloat(this.descent);
      var1.writeInt(this.lapNumber);
      var1.writeInt(this.avgCadence);
      var1.writeInt(this.maxCadence);
      var1.writeInt(this.lapStrokes);
      var1.writeInt(this.poolCount);
      var1.writeFloat(this.avgDurationOfPool);
   }
}
