package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

class s_GpsDerivativesCalc extends aj_CalcBase implements ak, y {
   private static final ArrayList a_sensorTypes = new ArrayList(1);
   private int b = -1;
   private int d = -1;

   static {
      a_sensorTypes.add(n_SENSOR_TYPE.b_IN_DEVICE_GPS);
   }

   s_GpsDerivativesCalc() {
      super(a_sensorTypes);
      this.a_setCurrentSample(new aa_GpsDerivativesSample());
   }

   public void a_handleCurrentSample() {
      byte var1 = 0;
      boolean var2 = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).n_isTrusted();
      int var3_sampleIndex = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).l_getSampleIndex();
      float var4_altitude = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).c_getAltitude();
      float var5_speed = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).a_getSpeed();
      Training.getInstance().setTotalDistance(((aa_GpsDerivativesSample)this.o_getCurrentSample()).b_getDistance(), var2);
      Training.getInstance().setTotalAscent(((aa_GpsDerivativesSample)this.o_getCurrentSample()).d_getAscent());
      Training.getInstance().setTotalDescent(((aa_GpsDerivativesSample)this.o_getCurrentSample()).e_getDescent());
      int var6;
      if (Float.isNaN(var5_speed)) {
         Training.getInstance().setCurrentSpeedInMetersPerSecond(-1.0F, false);
         if (this.d == -1) {
            this.d = var3_sampleIndex;
         }
      } else {
         Training.getInstance().setCurrentSpeedInMetersPerSecond(((aa_GpsDerivativesSample)this.o_getCurrentSample()).a_getSpeed(), true);
         if (this.d != -1) {
            if (var3_sampleIndex > 0) {
               var6 = var3_sampleIndex - 1;
            } else {
               var6 = 0;
            }

            Training.getInstance().getSamples().addSpeedOfflineRange(this.d, var6);
            this.d = -1;
         }
      }

      if (var2 && !Float.isNaN(var4_altitude)) {
         Training.getInstance().setCurrentAltitude(var4_altitude, true);
         if (this.b != -1) {
            var6 = var1;
            if (var3_sampleIndex > 0) {
               var6 = var3_sampleIndex - 1;
            }

            Training.getInstance().getSamples().addAltitudeOfflineRange(this.b, var6);
            this.b = -1;
         }
      } else {
         Training.getInstance().setCurrentAltitude(var4_altitude, false);
         if (this.b == -1) {
            this.b = var3_sampleIndex;
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
         int var2 = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).l_getSampleIndex();
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
         Training.getInstance().getSamples().addAltitudeOfflineRange(this.b, ((aa_GpsDerivativesSample)this.o_getCurrentSample()).l_getSampleIndex());
         this.b = -1;
      }

   }
}
