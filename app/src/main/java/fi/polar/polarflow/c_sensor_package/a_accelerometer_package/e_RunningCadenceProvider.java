package fi.polar.polarflow.c_sensor_package.a_accelerometer_package;

import android.content.Context;
import android.content.Intent;

import fi.polar.polarflow.c_sensor_package.b_PolarSensorEventBase;
import fi.polar.polarflow.c_sensor_package.i_PolarSensorListenerSupport;
import fi.polar.polarflow.c_sensor_package.l_PolarSensorListener;
import fi.polar.polarflow.c_sensor_package.n_SENSOR_TYPE;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.util.k;
import fi.polar.polarflow.util.v;
import fi.polar.polarmathsmart.wristmetrics.SpeedCadenceAndDistanceFromWristMeterAccelerationCalculatorAndroidImpl;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class e_RunningCadenceProvider extends a_AccelerometerSensor implements i_PolarSensorListenerSupport {
   private static final long g;
   private SpeedCadenceAndDistanceFromWristMeterAccelerationCalculatorAndroidImpl h;
   private v i;
   private int j = -1;
   private long k = 0L;
   private l_PolarSensorListener l;

   static {
      g = TimeUnit.SECONDS.toNanos(1L);
   }

   public e_RunningCadenceProvider(Context var1) {
      super(var1, n_SENSOR_TYPE.e_RUNNING_CADENCE, 50, 500);
      this.i = v.a(var1);
   }

   private static short a(float var0) {
      short var1;
      short var2;
      if (var0 < -32768.0F) {
         var1 = -32768;
         var2 = var1;
      } else if (var0 > 32767.0F) {
         short var3 = 32767;
         var2 = var3;
      } else {
         var1 = (short)Math.round(var0);
         var2 = var1;
      }

      return var2;
   }

   private void a(int var1) {
      if (this.e) {
         fi.polar.polarflow.util.d.c("RunningCadenceProvider", "onMeasurementChanged " + var1);
         if (this.l != null) {
            this.l.a(var1);
         }

         Intent var2 = new Intent("fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA");
         var2.putExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE", "fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR");
         var2.putExtra("fi.polar.polarflow.KEY_SENSOR_RUNNING_CADENCE_VALUE", var1);
         var2.putExtra("fi.polar.polarflow.SENSOR_STATE", this.b_sensorState);
         this.i.b(var2);
      }

   }

   private SpeedCadenceAndDistanceFromWristMeterAccelerationCalculatorAndroidImpl m() {
      if (this.h == null) {
         this.h = new SpeedCadenceAndDistanceFromWristMeterAccelerationCalculatorAndroidImpl(50.0F, (double)(new k(PhysData.getUserPhysData())).t(), 0.0F);
      }

      return this.h;
   }

   protected void a() {
      this.k = 0L;
   }

   void a(int var1, long var2) {
      if (this.j != var1 || this.k + g < var2) {
         this.j = var1;
         if (this.e) {
            this.a(var1);
            this.k = var2;
         }
      }

   }

   public void a_setPolarSensorListener(l_PolarSensorListener var1) {
      this.l = var1;
   }

   protected void a(List var1) {
      int var2 = var1.size();
      if (var2 == 0) {
         fi.polar.polarflow.util.d.b("RunningCadenceProvider", "onBatchCompleted with empty list");
      } else {
         short[] var3 = new short[var2];
         short[] var4 = new short[var2];
         short[] var5 = new short[var2];

         for(int var6 = 0; var6 < var2; ++var6) {
            b_PolarSensorEventBase var7 = (b_PolarSensorEventBase)var1.get(var6);
            var3[var6] = a(var7.a[0] * 101.97162F);
            var4[var6] = a(var7.a[1] * 101.97162F);
            var5[var6] = a(var7.a[2] * 101.97162F);
         }

         this.m().update(var3, var4, var5);
         this.a(this.l(), ((b_PolarSensorEventBase)var1.get(var2 - 1)).b);
      }

   }

   public void c_stop() {
      this.i.a("fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA");
      super.c_stop();
   }

   public int l() {
      return this.m().getCadence(false);
   }
}
