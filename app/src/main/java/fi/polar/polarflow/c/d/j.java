package fi.polar.polarflow.c.d;

import fi.polar.polarmathsmart.gps.LocationDataCalculator;

public class j {
   private final int a = 1;
   private final int b = 3;
   private final int c = 7;
   private final int d = 14;
   private boolean e = false;
   private boolean f = true;
   private boolean g = false;
   private double h = Double.NaN;
   private double i = Double.NaN;
   private double j = Double.NaN;
   private String k = "";
   private String l = "";
   private int m = -1;
   private int n = -1;
   private int o = -1;
   private LocationDataCalculator p = null;

   private void b() {
      if (this.p != null) {
         this.p.handleNMEAMessage(this.k);
         this.p.handleNMEAMessage(this.l);
      }

      this.k = "";
      this.l = "";
   }

   public void a() {
      fi.polar.polarflow.util.d.c("NmeaFilter", "reset()");
      this.e = false;
      this.f = true;
      this.g = false;
      this.h = Double.NaN;
      this.i = Double.NaN;
      this.j = Double.NaN;
      this.k = "";
      this.l = "";
      this.m = -1;
      this.n = -1;
      this.o = -1;
   }

   public void a(LocationDataCalculator var1) {
      this.p = var1;
   }

   public boolean a(String var1) {
      boolean var2 = true;
      int var3;
      if (var1.startsWith("GGA", 3)) {
         this.k = var1;
         if (this.f) {
            var3 = var1.indexOf(44, 14);

            try {
               this.i = Double.parseDouble(var1.substring(7, var3));
            } catch (NumberFormatException var11) {
               fi.polar.polarflow.util.d.e("NmeaFilter", "Exception in parsing time (" + var1.substring(7, var3) + ") from NMEA: " + this.k + "");
            }
         }
      } else if (var1.startsWith("RMC", 3)) {
         this.l = var1;
         if (this.f) {
            var3 = var1.indexOf(44, 14);

            try {
               this.j = Double.parseDouble(var1.substring(7, var3));
            } catch (NumberFormatException var10) {
               fi.polar.polarflow.util.d.e("NmeaFilter", "Exception in parsing time (" + var1.substring(7, var3) + ") from NMEA: " + this.l + "");
            }
         }
      }

      boolean var4;
      if (!this.e) {
         if (!Double.isNaN(this.i) && !Double.isNaN(this.j) && Double.compare(this.i, this.j) == 0) {
            this.e = true;
            this.h = this.i;
            this.b();
            var4 = var2;
            return var4;
         }
      } else if (!this.k.isEmpty() && !this.l.isEmpty()) {
         if (this.f) {
            double var6 = (this.i - this.h) % 40.0D;
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
               fi.polar.polarflow.util.d.c("NmeaFilter", "Current  GGA time:" + this.i);
               fi.polar.polarflow.util.d.c("NmeaFilter", "Sample rate: " + this.o + " Hz.");
               this.h = Double.NaN;
               this.f = false;
            }
         }

         if (this.g) {
            this.b();
            var4 = var2;
            return var4;
         }

         if (this.m - this.n <= 0) {
            this.b();
            this.n = 0;
            var4 = var2;
            return var4;
         }

         ++this.n;
         this.k = "";
         this.l = "";
      }

      var4 = false;
      return var4;
   }
}
