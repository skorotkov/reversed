package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

class s extends aj_CalcBase implements ak, y {
   private static final ArrayList a = new ArrayList(1);
   private int b = -1;
   private int d = -1;

   static {
      a.add(n_SENSOR_TYPE.b_IN_DEVICE_GPS);
   }

   s() {
      super(a);
      this.a(new aa_GpsEvent());
   }

   public void a() {
      byte var1 = 0;
      boolean var2 = ((aa_GpsEvent)this.o()).n();
      int var3 = ((aa_GpsEvent)this.o()).l();
      float var4 = ((aa_GpsEvent)this.o()).c_getAltitude();
      float var5 = ((aa_GpsEvent)this.o()).a_getSpeed();
      Training.getInstance().setTotalDistance(((aa_GpsEvent)this.o()).b_getDistance(), var2);
      Training.getInstance().setTotalAscent(((aa_GpsEvent)this.o()).d_getAscent());
      Training.getInstance().setTotalDescent(((aa_GpsEvent)this.o()).e_getDescent());
      int var6;
      if (Float.isNaN(var5)) {
         Training.getInstance().setCurrentSpeedInMetersPerSecond(-1.0F, false);
         if (this.d == -1) {
            this.d = var3;
         }
      } else {
         Training.getInstance().setCurrentSpeedInMetersPerSecond(((aa_GpsEvent)this.o()).a_getSpeed(), true);
         if (this.d != -1) {
            if (var3 > 0) {
               var6 = var3 - 1;
            } else {
               var6 = 0;
            }

            Training.getInstance().getSamples().addSpeedOfflineRange(this.d, var6);
            this.d = -1;
         }
      }

      if (var2 && !Float.isNaN(var4)) {
         Training.getInstance().setCurrentAltitude(var4, true);
         if (this.b != -1) {
            var6 = var1;
            if (var3 > 0) {
               var6 = var3 - 1;
            }

            Training.getInstance().getSamples().addAltitudeOfflineRange(this.b, var6);
            this.b = -1;
         }
      } else {
         Training.getInstance().setCurrentAltitude(var4, false);
         if (this.b == -1) {
            this.b = var3;
         }
      }

   }

   public void a(int var1, int var2) {
      if (var1 == 0 && var2 > 0) {
         Training.getInstance().getSamples().addDistanceOfflineRange(var1, var2);
      }

      if (this.d != -1 && var2 > 0) {
         Training.getInstance().getSamples().addSpeedOfflineRange(this.d, var2);
         this.d = -1;
      }

      if (this.b == -1 && var2 > 0) {
         Training.getInstance().getSamples().addAltitudeOfflineRange(var1, var2);
      }

   }

   public void d() {
      int var1 = this.p();
      if (var1 != -1) {
         int var2 = ((aa_GpsEvent)this.o()).l();
         if (var1 == 0) {
            Training.getInstance().getSamples().addDistanceOfflineRange(var1, var2);
         }

         if (this.d != -1) {
            Training.getInstance().getSamples().addSpeedOfflineRange(this.d, var2);
            this.d = -1;
         }

         if (this.b != -1) {
            Training.getInstance().getSamples().addAltitudeOfflineRange(this.b, var2);
            this.b = -1;
         } else {
            Training.getInstance().getSamples().addAltitudeOfflineRange(var1, var2);
         }
      }

      if (this.b != -1) {
         Training.getInstance().getSamples().addAltitudeOfflineRange(this.b, ((aa_GpsEvent)this.o()).l());
         this.b = -1;
      }

   }
}
