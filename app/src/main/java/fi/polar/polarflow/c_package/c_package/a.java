package fi.polar.polarflow.c_package.c_package;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract class a extends fi.polar.polarflow.c_package.a implements fi.polar.polarflow.c_package.i {
   private fi.polar.polarflow.util.v g;
   private int h = 0;

   protected a(Context var1) {
      super(var1, fi.polar.polarflow.c_package.n.d);
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
      var1.putSerializable("fi.polar.polarflow.SENSOR_STATE", this.b);
      var1.putSerializable("fi.polar.polarflow.KEY_SENSOR_TYPE", this.c);
      return var1;
   }

   protected void l() {
      Intent var1 = new Intent("fi.polar.polarflow.ACTION_HR_DATA");
      var1.putExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", this.h);
      var1.putExtra("fi.polar.polarflow.SENSOR_STATE", this.b);
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
