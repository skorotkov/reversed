package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import java.util.ArrayList;

class s_GpsDerivativesCalc extends aj_CalcBase implements ak, y {
   private static final ArrayList a_sensorTypes = new ArrayList(1);
   private int b_altitudeOfflineRangeStartIndex = -1;
   private int d_speedOfflineRangeStartIndex = -1;

   static {
      a_sensorTypes.add(n_SENSOR_TYPE.b_IN_DEVICE_GPS);
   }

   s_GpsDerivativesCalc() {
      super(a_sensorTypes);
      this.a_setCurrentSample(new aa_GpsDerivativesSample());
   }

   public void a_handleCurrentSample() {
      byte var1 = 0;
      boolean var2_isTrusted = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).n_isTrusted();
      int var3_sampleIndex = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).l_getSampleIndex();
      float var4_altitude = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).c_getAltitude();
      float var5_speed = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).a_getSpeed();
      Training.getInstance().setTotalDistance(((aa_GpsDerivativesSample)this.o_getCurrentSample()).b_getDistance(), var2_isTrusted);
      Training.getInstance().setTotalAscent(((aa_GpsDerivativesSample)this.o_getCurrentSample()).d_getAscent());
      Training.getInstance().setTotalDescent(((aa_GpsDerivativesSample)this.o_getCurrentSample()).e_getDescent());
      int var6_offlineRangeStopIndex;
      if (Float.isNaN(var5_speed)) {
         Training.getInstance().setCurrentSpeedInMetersPerSecond(-1.0F, false);
         if (this.d_speedOfflineRangeStartIndex == -1) {
            this.d_speedOfflineRangeStartIndex = var3_sampleIndex;
         }
      } else {
         Training.getInstance().setCurrentSpeedInMetersPerSecond(((aa_GpsDerivativesSample)this.o_getCurrentSample()).a_getSpeed(), true);
         if (this.d_speedOfflineRangeStartIndex != -1) {
            if (var3_sampleIndex > 0) {
               var6_offlineRangeStopIndex = var3_sampleIndex - 1;
            } else {
               var6_offlineRangeStopIndex = 0;
            }

            Training.getInstance().getSamples().addSpeedOfflineRange(this.d_speedOfflineRangeStartIndex, var6_offlineRangeStopIndex);
            this.d_speedOfflineRangeStartIndex = -1;
         }
      }

      if (var2_isTrusted && !Float.isNaN(var4_altitude)) {
         Training.getInstance().setCurrentAltitude(var4_altitude, true);
         if (this.b_altitudeOfflineRangeStartIndex != -1) {
            var6_offlineRangeStopIndex = var1;
            if (var3_sampleIndex > 0) {
               var6_offlineRangeStopIndex = var3_sampleIndex - 1;
            }

            Training.getInstance().getSamples().addAltitudeOfflineRange(this.b_altitudeOfflineRangeStartIndex, var6_offlineRangeStopIndex);
            this.b_altitudeOfflineRangeStartIndex = -1;
         }
      } else {
         Training.getInstance().setCurrentAltitude(var4_altitude, false);
         if (this.b_altitudeOfflineRangeStartIndex == -1) {
            this.b_altitudeOfflineRangeStartIndex = var3_sampleIndex;
         }
      }

   }

   public void a_fillNotTrustedRange(int var1_startIndex, int var2_stopIndex) {
      if (var1_startIndex == 0 && var2_stopIndex > 0) {
         Training.getInstance().getSamples().addDistanceOfflineRange(var1_startIndex, var2_stopIndex);
      }

      if (this.d_speedOfflineRangeStartIndex != -1 && var2_stopIndex > 0) {
         Training.getInstance().getSamples().addSpeedOfflineRange(this.d_speedOfflineRangeStartIndex, var2_stopIndex);
         this.d_speedOfflineRangeStartIndex = -1;
      }

      if (this.b_altitudeOfflineRangeStartIndex == -1 && var2_stopIndex > 0) {
         Training.getInstance().getSamples().addAltitudeOfflineRange(var1_startIndex, var2_stopIndex);
      }

   }

   public void d_closeUntrustedRange() {
      int var1 = this.p_getNotTrustedRangeStartIndex();
      if (var1 != -1) {
         int var2 = ((aa_GpsDerivativesSample)this.o_getCurrentSample()).l_getSampleIndex();
         if (var1 == 0) {
            Training.getInstance().getSamples().addDistanceOfflineRange(var1, var2);
         }

         if (this.d_speedOfflineRangeStartIndex != -1) {
            Training.getInstance().getSamples().addSpeedOfflineRange(this.d_speedOfflineRangeStartIndex, var2);
            this.d_speedOfflineRangeStartIndex = -1;
         }

         if (this.b_altitudeOfflineRangeStartIndex != -1) {
            Training.getInstance().getSamples().addAltitudeOfflineRange(this.b_altitudeOfflineRangeStartIndex, var2);
            this.b_altitudeOfflineRangeStartIndex = -1;
         } else {
            Training.getInstance().getSamples().addAltitudeOfflineRange(var1, var2);
         }
      }

      if (this.b_altitudeOfflineRangeStartIndex != -1) {
         Training.getInstance().getSamples().addAltitudeOfflineRange(this.b_altitudeOfflineRangeStartIndex, ((aa_GpsDerivativesSample)this.o_getCurrentSample()).l_getSampleIndex());
         this.b_altitudeOfflineRangeStartIndex = -1;
      }

   }
}
