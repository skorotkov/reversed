package fi.polar.polarflow.calculators;

import android.content.Intent;
import android.os.SystemClock;

import fi.polar.polarflow.c.a_accelerometer_package.a_AccelerometerSensor;
import fi.polar.polarflow.c.b_PolarSensorEventBase;
import fi.polar.polarflow.c.c_heartrate_package.a_HeartRateSensor;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;
import fi.polar.polarmathsmart.swimming.poolswimming.PoolSwimmingAlgorithmAndroidImpl;
import fi.polar.polarmathsmart.swimming.poolswimming.PoolSwimmingOutput;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingLapStatistics;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingPoolInformation;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingStatistics;
import fi.polar.polarmathsmart.types.Handedness;
import fi.polar.polarmathsmart.types.SwimmingType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bb implements ae, ah {
   private final a_HeartRateSensor a;
   private final a_AccelerometerSensor b;
   private PoolSwimmingAlgorithmAndroidImpl c;
   private af d;
   private Handedness e;
   private v_StickyLocalBroadcastManager f;
   private long g = 0L;
   private long h = 0L;
   private long i = 0L;
   private long j = 0L;
   private int k;
   private int l;
   private int m;
   private boolean n;
   private int o;
   private int p;
   private final e_PolarSensorListenerEx q;

   public bb(a_HeartRateSensor var1, a_AccelerometerSensor var2, long var3) {
      this.k = SwimmingType.NO_SWIMMING.getValue();
      this.l = SwimmingType.NO_SWIMMING.getValue();
      this.m = SwimmingType.NO_SWIMMING.getValue();
      this.n = false;
      this.o = 1;
      this.p = 1;
      this.q = new bc(this);
      this.a = var1;
      this.b = var2;
      this.f = v_StickyLocalBroadcastManager.a_getInstance();
      this.g = var3;
   }

   private void a(int var1) {
      long var2 = 0L;
      long var4 = this.j;
      if (var1 == 1) {
         var2 = this.g() - 100L;
      } else if (this.j == 0L || this.l < SwimmingType.OTHER_SWIMMING.getValue() || this.k < SwimmingType.OTHER_SWIMMING.getValue()) {
         if (this.j == 0L && this.m <= SwimmingType.TURN.getValue() && this.l <= SwimmingType.TURN.getValue() && this.k <= SwimmingType.TURN.getValue()) {
            var2 = this.g() - 3800L;
         } else {
            var2 = var4;
         }
      }

      if (var2 != this.j) {
         this.a(var2);
      }

      this.j = var2;
      this.m = this.l;
      this.l = this.k;
   }

   private void a(long var1) {
      Intent var3 = new Intent("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_REST_TIME_START");
      var3.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_REST_TIME_START", var1);
      this.f.b_sendStickyBroadcast(var3);
   }

   // $FF: synthetic method
   static void a(bb var0, List var1) {
      var0.a(var1);
   }

   private void a(PoolSwimmingOutput var1) {
      Intent var2 = new Intent("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA");
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_CURRENT_SPEED", var1.getCurrentSpeed());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_AVERAGE_SPEED", var1.getAvgSpeed());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_MAXIMUM_SPEED", var1.getMaxSpeed());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_LAP_AVERAGE_SPEED", var1.getLapAvgSpeed());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_LAP_MAXIMUM_SPEED", var1.getLapMaxSpeed());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_AUTO_LAP_AVERAGE_SPEED", var1.getaLapAvgSpeed());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_AUTO_LAP_MAXIMUM_SPEED", var1.getaLapMaxSpeed());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_DISTANCE", var1.getDistance());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_AUTO_LAP_DISTANCE", var1.getaLapDistance());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_LAP_DISTANCE", var1.getLapDistance());
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_AUTO_LAP_NUMBER", this.p);
      var2.putExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_LAP_NUMBER", this.o);
      this.f.b_sendStickyBroadcast(var2);
   }

   private void a(List var1) {
      int var2 = var1.size();
      if (var2 == 0) {
         fi.polar.polarflow.util.d.b("SwimmingMetricsProvider", "onBatchCompleted with empty list");
      } else {
         int var3;
         if (this.a != null) {
            var3 = this.a.n();
            if (var3 != 0) {
               this.c.feedHrSample(var3);
            }
         }

         float[] var4 = new float[var2];
         float[] var5 = new float[var2];
         float[] var6 = new float[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            b_PolarSensorEventBase var7 = (b_PolarSensorEventBase)var1.get(var3);
            var4[var3] = var7.a[0];
            var5[var3] = var7.a[1];
            var6[var3] = var7.a[2];
         }

         ArrayList var9 = this.c.feedMultipleAccSamples(var4, var5, var6);
         PoolSwimmingOutput var8 = null;

         Integer var11;
         for(Iterator var10 = var9.iterator(); var10.hasNext(); this.k = var11) {
            var11 = (Integer)var10.next();
            if (var11 != SwimmingType.NO_SWIMMING.getValue()) {
               var8 = this.c.feedStyle(var11);
            }
         }

         if (var8 != null) {
            this.a(var8);
            if (!this.n) {
               this.a(var8.getRestTimerShouldStart());
            }

            if (this.d != null) {
               this.d.a(var8);
            }
         }
      }

   }

   private long g() {
      long var1 = 0L;
      long var3 = SystemClock.elapsedRealtime();
      long var5 = this.h;
      if (this.i > 0L) {
         var1 = var3 - this.i;
      }

      return var3 - this.g - (var1 + var5);
   }

   public SwimmingStatistics a() {
      this.b.a_setPolarSensorListener((l_PolarSensorListener)null);
      this.f.a_removeFromMap("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA");
      this.f.a_removeFromMap("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_REST_TIME_START");
      if (this.d != null) {
         this.d.a(this.c.endSwimming());
      }

      return this.c.getSwimmingStatistics();
   }

   public void a(af var1) {
      this.d = var1;
   }

   public void a(SwimmingPoolInformation var1, int var2, float var3) {
      if (var2 == 3) {
         this.e = Handedness.I_WEAR_MY_DEVICE_IN_RIGHT_HAND;
      } else {
         this.e = Handedness.I_WEAR_MY_DEVICE_IN_LEFT_HAND;
      }

      this.c = new PoolSwimmingAlgorithmAndroidImpl(var1, this.e, var3);
      this.b.a_setPolarSensorListener((l_PolarSensorListener)this.q);
      this.j = this.g();
      this.a(this.j);
   }

   public void b() {
      this.i = SystemClock.elapsedRealtime();
      this.j = 0L;
      this.m = SwimmingType.NO_SWIMMING.getValue();
      this.l = SwimmingType.NO_SWIMMING.getValue();
      this.b.a_setPolarSensorListener((l_PolarSensorListener)null);
      this.n = true;
   }

   public void c() {
      this.h += SystemClock.elapsedRealtime() - this.i;
      this.i = 0L;
      this.j = this.g();
      this.a(this.j);
      this.b.a_setPolarSensorListener((l_PolarSensorListener)this.q);
      this.n = false;
   }

   public SwimmingLapStatistics d() {
      ++this.o;
      return this.c.takeManualLap();
   }

   public SwimmingLapStatistics e() {
      ++this.p;
      return this.c.takeDistanceAutomaticLap();
   }

   public SwimmingLapStatistics f() {
      ++this.p;
      return this.c.takeAutomaticLap();
   }
}
