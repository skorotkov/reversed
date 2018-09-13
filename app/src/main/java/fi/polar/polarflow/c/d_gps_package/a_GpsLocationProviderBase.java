package fi.polar.polarflow.c.d_gps_package;

import android.content.Context;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.c.a_Sensor;
import fi.polar.polarflow.c.f_PolarSensorEvent;
import fi.polar.polarflow.c.i_PolarSensorListenerSupport;
import fi.polar.polarflow.c.n_SENSOR_TYPE;

public abstract class a_GpsLocationProviderBase extends a_Sensor implements i_PolarSensorListenerSupport {
   protected double g_latitudeInDecimalDegrees = 0.0D;
   protected double h_longitudeInDecimalDegrees = 0.0D;
   protected double i_altitudeInMetersChecked = Double.NaN;
   protected double j_altitudeInMeters = Double.NaN;
   protected int k_numberOfSatellites = 0;
   protected float l_totalDirtyDistanceInMeters = 0.0F;
   protected float m_totalDistanceDuringPauseInMeters = 0.0F;
   protected float n_referenceDistanceInMeters = 0.0F;
   protected float o_speedInMetersPerSecond = Float.NaN;
   protected float p_totalAscentDuringPause = 0.0F;
   protected float q_totalDescentDuringPause = 0.0F;
   protected float r_totalDirtyAscent = 0.0F;
   protected float s_totalDirtyDescent = 0.0F;
   protected long t_eventTime = 0L;
   protected boolean u_fix = false;
   protected final Object v = new Object();

   protected a_GpsLocationProviderBase(Context var1, n_SENSOR_TYPE var2) {
      super(var1, var2);
   }

   protected void a_reset() {
      this.i_altitudeInMetersChecked = Double.NaN;
      this.h_longitudeInDecimalDegrees = 0.0D;
      this.j_altitudeInMeters = Double.NaN;
      this.k_numberOfSatellites = 0;
      this.l_totalDirtyDistanceInMeters = 0.0F;
      this.m_totalDistanceDuringPauseInMeters = 0.0F;
      this.o_speedInMetersPerSecond = Float.NaN;
      this.r_totalDirtyAscent = 0.0F;
      this.s_totalDirtyDescent = 0.0F;
      this.p_totalAscentDuringPause = 0.0F;
      this.q_totalDescentDuringPause = 0.0F;
      this.t_eventTime = 0L;
      this.u_fix = false;
   }

   public f_PolarSensorEvent k() {
      // $FF: Couldn't be decompiled

      // decompiled after remove of try ... catch
      Object var1 = this.v;
      return new f_PolarSensorEvent(this.t_eventTime, this.u_fix, this.o_getTotalPureDistance(), this.p_getSpeedInMetersPerSecond(), this.g_latitudeInDecimalDegrees, this.h_longitudeInDecimalDegrees, this.n_getNumberOfSatellites(), this.l_getAltitudeInMetersChecked(), this.m_getAltitudeInMeters(), this.q_getPureAscent(), this.r_getPureDescent());
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

   public float o_getTotalPureDistance() {
      return a_DataTypes.a_adjust(1, this.l_totalDirtyDistanceInMeters - (this.n_referenceDistanceInMeters + this.m_totalDistanceDuringPauseInMeters));
   }

   public float p_getSpeedInMetersPerSecond() {
      return this.o_speedInMetersPerSecond;
   }

   public float q_getPureAscent() {
      float var1;
      if (this.r_totalDirtyAscent > this.p_totalAscentDuringPause) {
         var1 = this.r_totalDirtyAscent - this.p_totalAscentDuringPause;
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   public float r_getPureDescent() {
      float var1;
      if (this.s_totalDirtyDescent > this.q_totalDescentDuringPause) {
         var1 = this.s_totalDirtyDescent - this.q_totalDescentDuringPause;
      } else {
         var1 = 0.0F;
      }

      return var1;
   }
}
