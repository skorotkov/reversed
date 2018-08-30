package fi.polar.polarflow.data;

public class Lap$LapBuilder {
   private float ascent = -1.0F;
   private int autoLapType = -1;
   private int avgCadence = -1;
   private float avgDurationOfPool = -1.0F;
   private int avgHR = -1;
   private float avgSpeed = -1.0F;
   private float descent = -1.0F;
   private float distance = -1.0F;
   private long durationMillis = -1L;
   private int lapNumber = 1;
   private int lapStrokes = -1;
   private int maxCadence = -1;
   private int maxHR = -1;
   private float maxSpeed = -1.0F;
   private int minHR = -1;
   private int poolCount = -1;
   private long splitTimeMillis = -1L;

   // $FF: synthetic method
   static int access$000(Lap$LapBuilder var0) {
      return var0.autoLapType;
   }

   // $FF: synthetic method
   static long access$100(Lap$LapBuilder var0) {
      return var0.durationMillis;
   }

   // $FF: synthetic method
   static float access$1000(Lap$LapBuilder var0) {
      return var0.descent;
   }

   // $FF: synthetic method
   static int access$1100(Lap$LapBuilder var0) {
      return var0.avgCadence;
   }

   // $FF: synthetic method
   static int access$1200(Lap$LapBuilder var0) {
      return var0.maxCadence;
   }

   // $FF: synthetic method
   static int access$1300(Lap$LapBuilder var0) {
      return var0.lapStrokes;
   }

   // $FF: synthetic method
   static int access$1400(Lap$LapBuilder var0) {
      return var0.poolCount;
   }

   // $FF: synthetic method
   static float access$1500(Lap$LapBuilder var0) {
      return var0.avgDurationOfPool;
   }

   // $FF: synthetic method
   static int access$1600(Lap$LapBuilder var0) {
      return var0.lapNumber;
   }

   // $FF: synthetic method
   static float access$200(Lap$LapBuilder var0) {
      return var0.distance;
   }

   // $FF: synthetic method
   static long access$300(Lap$LapBuilder var0) {
      return var0.splitTimeMillis;
   }

   // $FF: synthetic method
   static int access$400(Lap$LapBuilder var0) {
      return var0.avgHR;
   }

   // $FF: synthetic method
   static int access$500(Lap$LapBuilder var0) {
      return var0.maxHR;
   }

   // $FF: synthetic method
   static int access$600(Lap$LapBuilder var0) {
      return var0.minHR;
   }

   // $FF: synthetic method
   static float access$700(Lap$LapBuilder var0) {
      return var0.avgSpeed;
   }

   // $FF: synthetic method
   static float access$800(Lap$LapBuilder var0) {
      return var0.maxSpeed;
   }

   // $FF: synthetic method
   static float access$900(Lap$LapBuilder var0) {
      return var0.ascent;
   }

   public Lap build() {
      return new Lap(this, (Lap$1)null);
   }

   public Lap$LapBuilder setAscent(float var1) {
      this.ascent = var1;
      return this;
   }

   public Lap$LapBuilder setAutoLapType(int var1) {
      this.autoLapType = var1;
      return this;
   }

   public Lap$LapBuilder setAvgCadence(int var1) {
      this.avgCadence = var1;
      return this;
   }

   public Lap$LapBuilder setAvgDurationOfPool(float var1) {
      this.avgDurationOfPool = var1;
      return this;
   }

   public Lap$LapBuilder setAvgHR(int var1) {
      this.avgHR = var1;
      return this;
   }

   public Lap$LapBuilder setAvgSpeed(float var1) {
      this.avgSpeed = var1;
      return this;
   }

   public Lap$LapBuilder setDescent(float var1) {
      this.descent = var1;
      return this;
   }

   public Lap$LapBuilder setDistance(float var1) {
      this.distance = var1;
      return this;
   }

   public Lap$LapBuilder setDurationMillis(long var1) {
      this.durationMillis = var1;
      return this;
   }

   public Lap$LapBuilder setLapNumber(int var1) {
      this.lapNumber = var1;
      return this;
   }

   public Lap$LapBuilder setLapStrokes(int var1) {
      this.lapStrokes = var1;
      return this;
   }

   public Lap$LapBuilder setMaxCadence(int var1) {
      this.maxCadence = var1;
      return this;
   }

   public Lap$LapBuilder setMaxHR(int var1) {
      this.maxHR = var1;
      return this;
   }

   public Lap$LapBuilder setMaxSpeed(float var1) {
      this.maxSpeed = var1;
      return this;
   }

   public Lap$LapBuilder setMinHR(int var1) {
      this.minHR = var1;
      return this;
   }

   public Lap$LapBuilder setPoolCount(int var1) {
      this.poolCount = var1;
      return this;
   }

   public Lap$LapBuilder setSplitTimeMillis(long var1) {
      this.splitTimeMillis = var1;
      return this;
   }
}
