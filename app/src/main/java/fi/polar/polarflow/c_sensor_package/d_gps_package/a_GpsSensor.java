package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.content.Context;

import fi.polar.polarflow.c_sensor_package.a_Sensor;
import fi.polar.polarflow.c_sensor_package.n_SENSOR_TYPE;

public abstract class a_GpsSensor extends a_Sensor implements fi.polar.polarflow.c_sensor_package.i {
   protected double g = 0.0D;
   protected double h = 0.0D;
   protected double i = Double.NaN;
   protected double j = Double.NaN;
   protected int k = 0;
   protected float l = 0.0F;
   protected float m = 0.0F;
   protected float n = 0.0F;
   protected float o = Float.NaN;
   protected float p = 0.0F;
   protected float q = 0.0F;
   protected float r = 0.0F;
   protected float s = 0.0F;
   protected long t = 0L;
   protected boolean u = false;
   protected final Object v = new Object();

   protected a_GpsSensor(Context var1, n_SENSOR_TYPE var2) {
      super(var1, var2);
   }

   protected void a() {
      this.i = Double.NaN;
      this.h = 0.0D;
      this.j = Double.NaN;
      this.k = 0;
      this.l = 0.0F;
      this.m = 0.0F;
      this.o = Float.NaN;
      this.r = 0.0F;
      this.s = 0.0F;
      this.p = 0.0F;
      this.q = 0.0F;
      this.t = 0L;
      this.u = false;
   }

   public fi.polar.polarflow.c_sensor_package.f k() {
      // $FF: Couldn't be decompiled
      return null;
   }

   public double l() {
      return this.i;
   }

   public double m() {
      return this.j;
   }

   public int n() {
      return this.k;
   }

   public float o() {
      return fi.polar.polarflow.a_package.a.a(1, this.l - (this.n + this.m));
   }

   public float p() {
      return this.o;
   }

   public float q() {
      float var1;
      if (this.r > this.p) {
         var1 = this.r - this.p;
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   public float r() {
      float var1;
      if (this.s > this.q) {
         var1 = this.s - this.q;
      } else {
         var1 = 0.0F;
      }

      return var1;
   }
}
