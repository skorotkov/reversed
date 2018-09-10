package fi.polar.polarflow.c.d_gps_package;

import fi.polar.polarmathsmart.gps.LocationDataCalculator;

public class j_NmeaFilter {
   private final int a = 1;
   private final int b = 3;
   private final int c = 7;
   private final int d = 14;
   private boolean e = false;
   private boolean f = true;
   private boolean g = false;
   private double h = Double.NaN;
   private double i_fixTimeFromGGA = Double.NaN;
   private double j_fixTimeFromRMC = Double.NaN;
   private String k_ggaMessage = "";
   private String l_rmcMessage = "";
   private int m = -1;
   private int n = -1;
   private int o = -1;
   private LocationDataCalculator p_locationDataCalculator = null;

   private void b_passToLocationDataCalculator() {
      if (this.p_locationDataCalculator != null) {
         this.p_locationDataCalculator.handleNMEAMessage(this.k_ggaMessage);
         this.p_locationDataCalculator.handleNMEAMessage(this.l_rmcMessage);
      }

      this.k_ggaMessage = "";
      this.l_rmcMessage = "";
   }

   public void a_reset() {
      fi.polar.polarflow.util.d.c("NmeaFilter", "reset()");
      this.e = false;
      this.f = true;
      this.g = false;
      this.h = Double.NaN;
      this.i_fixTimeFromGGA = Double.NaN;
      this.j_fixTimeFromRMC = Double.NaN;
      this.k_ggaMessage = "";
      this.l_rmcMessage = "";
      this.m = -1;
      this.n = -1;
      this.o = -1;
   }

   public void a_setLocationDataCalculator(LocationDataCalculator var1) {
      this.p_locationDataCalculator = var1;
   }

   public boolean a(String var1) {
      boolean var2 = true;
      int var3;
      if (var1.startsWith("GGA", 3)) {
         this.k_ggaMessage = var1;
         if (this.f) {
            var3 = var1.indexOf(44, 14); // search for ','

            try {
               this.i_fixTimeFromGGA = Double.parseDouble(var1.substring(7, var3));
            } catch (NumberFormatException var11) {
               fi.polar.polarflow.util.d.e("NmeaFilter", "Exception in parsing time (" + var1.substring(7, var3) + ") from NMEA: " + this.k_ggaMessage + "");
            }
         }
      } else if (var1.startsWith("RMC", 3)) {
         this.l_rmcMessage = var1;
         if (this.f) {
            var3 = var1.indexOf(44, 14); // search for ','

            try {
               this.j_fixTimeFromRMC = Double.parseDouble(var1.substring(7, var3));
            } catch (NumberFormatException var10) {
               fi.polar.polarflow.util.d.e("NmeaFilter", "Exception in parsing time (" + var1.substring(7, var3) + ") from NMEA: " + this.l_rmcMessage + "");
            }
         }
      }

      boolean var4;
      if (!this.e) {
         if (!Double.isNaN(this.i_fixTimeFromGGA) && !Double.isNaN(this.j_fixTimeFromRMC) && Double.compare(this.i_fixTimeFromGGA, this.j_fixTimeFromRMC) == 0) {
            this.e = true;
            this.h = this.i_fixTimeFromGGA;
            this.b_passToLocationDataCalculator();
            var4 = var2;
            return var4; //true
         }
      } else if (!this.k_ggaMessage.isEmpty() && !this.l_rmcMessage.isEmpty()) {
         if (this.f) {
            double var6 = (this.i_fixTimeFromGGA - this.h) % 40.0D;
            double var8 = var6;
            if (var6 < 0.0D) {
               var8 = var6 + 40.0D;
            }

            if (var8 > 0.0D) {
               this.o = (int)Math.round(1.0D / var8);
               if (this.o < 1) {
                  this.o = 1;
               }

               if (this.o == 1) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               this.g = var4;
               if (this.o == 1) {
                  var3 = 0;
               } else {
                  var3 = this.o - 1;
               }

               this.m = var3;
               this.n = 0;
               fi.polar.polarflow.util.d.c("NmeaFilter", "Previous GGA time:" + this.h);
               fi.polar.polarflow.util.d.c("NmeaFilter", "Current  GGA time:" + this.i_fixTimeFromGGA);
               fi.polar.polarflow.util.d.c("NmeaFilter", "Sample rate: " + this.o + " Hz.");
               this.h = Double.NaN;
               this.f = false;
            }
         }

         if (this.g) {
            this.b_passToLocationDataCalculator();
            var4 = var2;
            return var4;
         }

         if (this.m - this.n <= 0) {
            this.b_passToLocationDataCalculator();
            this.n = 0;
            var4 = var2;
            return var4;
         }

         ++this.n;
         this.k_ggaMessage = "";
         this.l_rmcMessage = "";
      }

      var4 = false;
      return var4;
   }
}
