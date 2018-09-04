package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import fi.polar.polarflow.c_sensor_package.a_Sensor;
import fi.polar.polarflow.c_sensor_package.n_SENSOR_TYPE;

public abstract class a_HeartRateSensor extends a_Sensor implements fi.polar.polarflow.c_sensor_package.i {
   private fi.polar.polarflow.util.v g;
   private int h = 0;

   protected a_HeartRateSensor(Context var1) {
      super(var1, n_SENSOR_TYPE.d_HEART_RATE);
   }

   protected void a() {
      this.h = 0;
   }

   protected void a(int var1) {
      this.h = var1;
   }

   protected void d() {
      Intent var1 = new Intent("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED");
      var1.putExtras(this.k());
      this.o().b(var1);
   }

   protected Bundle k() {
      Bundle var1 = new Bundle();
      var1.putSerializable("fi.polar.polarflow.SENSOR_STATE", this.b_sensorState);
      var1.putSerializable("fi.polar.polarflow.KEY_SENSOR_TYPE", this.c_sensorType);
      return var1;
   }

   protected void l() {
      Intent var1 = new Intent("fi.polar.polarflow.ACTION_HR_DATA");
      var1.putExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", this.h);
      var1.putExtra("fi.polar.polarflow.SENSOR_STATE", this.b_sensorState);
      this.o().b(var1);
   }

   protected void m() {
      this.o().a("fi.polar.polarflow.ACTION_HR_DATA", "fi.polar.polarflow.SENSOR_HR_STATE_CHANGED");
   }

   public int n() {
      return this.h;
   }

   protected fi.polar.polarflow.util.v o() {
      if (this.g == null) {
         this.g = fi.polar.polarflow.util.v.a();
      }

      return this.g;
   }
}
