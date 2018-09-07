package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.content.Context;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.c_sensor_package.a_Sensor;
import fi.polar.polarflow.c_sensor_package.f_PolarSensorEvent;
import fi.polar.polarflow.c_sensor_package.i_PolarSensorListenerSupport;
import fi.polar.polarflow.c_sensor_package.n_SENSOR_TYPE;

public abstract class a_GpsLocationProviderBase extends a_Sensor implements i_PolarSensorListenerSupport {
   protected double g_latitudeInDecimalDegrees = 0.0D;
   protected double h_longitudeInDecimalDegrees = 0.0D;
   protected double i_altitudeInMetersChecked = Double.NaN;
   protected double j_altitudeInMeters = Double.NaN;
   protected int k_numberOfSatellites = 0;
   protected float l = 0.0F;
   protected float m = 0.0F;
   protected float n = 0.0F;
   protected float o_speedInMetersPerSecond = Float.NaN;
   protected float p = 0.0F;
   protected float q = 0.0F;
   protected float r = 0.0F;
   protected float s = 0.0F;
   protected long t = 0L;
   protected boolean u_fix = false;
   protected final Object v = new Object();

   protected a_GpsLocationProviderBase(Context var1, n_SENSOR_TYPE var2) {
      super(var1, var2);
   }

   protected void a() {
      this.i_altitudeInMetersChecked = Double.NaN;
      this.h_longitudeInDecimalDegrees = 0.0D;
      this.j_altitudeInMeters = Double.NaN;
      this.k_numberOfSatellites = 0;
      this.l = 0.0F;
      this.m = 0.0F;
      this.o_speedInMetersPerSecond = Float.NaN;
      this.r = 0.0F;
      this.s = 0.0F;
      this.p = 0.0F;
      this.q = 0.0F;
      this.t = 0L;
      this.u_fix = false;
   }

   public f_PolarSensorEvent k() {
      // $FF: Couldn't be decompiled

      // decompiled after remove of try ... catch
      Object var1 = this.v;
      return new f_PolarSensorEvent(this.t, this.u_fix, this.o_getTotalDistance(), this.p_getSpeedInMetersPerSecond(), this.g_latitudeInDecimalDegrees, this.h_longitudeInDecimalDegrees, this.n_getNumberOfSatellites(), this.l_getAltitudeInMetersChecked(), this.m_getAltitudeInMeters(), this.q_getAscentDelta(), this.r_getDescentDelta());
   }

   public double l_getAltitudeInMetersChecked() {
      return this.i_altitudeInMetersChecked;
   }

   public double m_getAltitudeInMeters() {
      return this.j_altitudeInMeters;
   }

   public int n_getNumberOfSatellites() {
      return this.k_numberOfSatellites;
   }

   public float o_getTotalDistance() {
      return a_DataTypes.a_adjust(1, this.l - (this.n + this.m));
   }

   public float p_getSpeedInMetersPerSecond() {
      return this.o_speedInMetersPerSecond;
   }

   public float q_getAscentDelta() {
      float var1;
      if (this.r > this.p) {
         var1 = this.r - this.p;
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   public float r_getDescentDelta() {
      float var1;
      if (this.s > this.q) {
         var1 = this.s - this.q;
      } else {
         var1 = 0.0F;
      }

      return var1;
   }
}
