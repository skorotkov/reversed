package fi.polar.polarflow.c;

public class f_PolarSensorEvent extends b_PolarSensorEventBase {
   public final float e_distance;
   public final float f_speed;
   public final int g_numberOfSatellites;
   public final double h_latitude;
   public final double i_longitude;
   public final double j_altitudeInMetersChecked;
   public final double k_altitudeInMeters;
   public final float l_ascent;
   public final float m_descent;
   public final boolean n_fix;

   public f_PolarSensorEvent() {
      super(new float[]{0.0F}, 0L, 0);
      this.n_fix = false;
      this.e_distance = 0.0F;
      this.f_speed = Float.NaN;
      this.h_latitude = 0.0D;
      this.i_longitude = 0.0D;
      this.g_numberOfSatellites = 0;
      this.j_altitudeInMetersChecked = Double.NaN;
      this.k_altitudeInMeters = Double.NaN;
      this.l_ascent = 0.0F;
      this.m_descent = 0.0F;
   }

   public f_PolarSensorEvent(long var1_timestamp, boolean var3_fix, float var4_distance, float var5_speed, double var6_latitude, double var8_longitude, int var10_numberOfSatellites, double var11_altitudeChecked, double var13_altitudeInMeters, float var15_ascent, float var16_descent) {
      super(new float[]{0.0F}, var1_timestamp, 0);
      this.n_fix = var3_fix;
      this.e_distance = var4_distance;
      this.f_speed = var5_speed;
      this.h_latitude = var6_latitude;
      this.i_longitude = var8_longitude;
      this.g_numberOfSatellites = var10_numberOfSatellites;
      this.j_altitudeInMetersChecked = var11_altitudeChecked;
      this.k_altitudeInMeters = var13_altitudeInMeters;
      this.l_ascent = var15_ascent;
      this.m_descent = var16_descent;
   }
}
