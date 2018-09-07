package fi.polar.polarflow.service.activity;

import android.content.Context;

import fi.polar.polarflow.util.aa_TimeUtils;
import fi.polar.polarmathsmart.types.InActivityAlertType;
import org.joda.time.DateTime;

class aj implements ag {
   private aa_TimeUtils a = new aa_TimeUtils();
   private ae b;
   private ak c;
   private int d;
   private DateTime e;
   private boolean f;

   private void a(DateTime var1) {
      this.e = var1;
      if (this.e != null) {
         this.b(this.e.plusMinutes(55));
      } else {
         this.b.a();
      }

   }

   private void a(DateTime var1, int var2) {
      if (this.d != var2) {
         if (var2 == 2) {
            fi.polar.polarflow.util.d.c("InactivityAlertManager", "Activity class changed to ACTIVITY_CLASS_SEDENTARY");
            this.a(var1.minusMinutes(6));
         } else if (this.b.b()) {
            fi.polar.polarflow.util.d.c("InactivityAlertManager", "Activity class is no longer ACTIVITY_CLASS_SEDENTARY");
            this.a((DateTime)null);
         }

         this.d = var2;
      }

   }

   private boolean a(int var1, int var2) {
      boolean var3 = false;
      boolean var4 = var3;
      if (this.f) {
         if (var1 == 2) {
            var4 = var3;
            if (var2 == 2) {
               return var4;
            }
         }

         var4 = true;
      }

      return var4;
   }

   private boolean a(DateTime var1, InActivityAlertType var2) {
      boolean var3 = true;
      if ((var2 != InActivityAlertType.NOTIFY_USER_TO_GET_MOVING || var1.getHourOfDay() < 7 || var1.getHourOfDay() >= 23) && (var2 != InActivityAlertType.MARK_INACTIVITY_STAMP || var1.minusMinutes(5).getHourOfDay() < 7 || var1.minusMinutes(5).getHourOfDay() >= 23)) {
         var3 = false;
      }

      return var3;
   }

   private void b(DateTime var1) {
      this.b.a();
      if (this.e != null) {
         if (this.a(this.e.plusMinutes(55), InActivityAlertType.NOTIFY_USER_TO_GET_MOVING)) {
            long var2 = var1.getMillis();
            long var4 = this.a.a_currentTimeMillis();
            this.b.a(var2 - var4);
         } else {
            fi.polar.polarflow.util.d.c("InactivityAlertManager", "Notification send not allowed after 55 minutes. Skipping flush alarm.");
         }
      }

   }

   public void a() {
      if (this.c != null && this.b != null) {
         this.c.b();
         this.b.a(30000L);
      }

   }

   void a(Context var1, ak var2) {
      if (this.b == null) {
         this.b = new ae(var1, this);
      }

      this.c = var2;
   }

   void a(DateTime var1, InActivityAlertType var2, int var3, int var4) {
      this.a(var1, var4);
      if (var2 != InActivityAlertType.NO_CHANGE) {
         if (this.a(var1, var2)) {
            if (var2 == InActivityAlertType.NOTIFY_USER_TO_GET_MOVING) {
               this.c.a(var1);
               this.f = true;
            } else if (var2 == InActivityAlertType.MARK_INACTIVITY_STAMP) {
               this.c.b(var1);
               this.f = false;
               this.a(var1);
            }
         }
      } else if (this.a(var3, var4)) {
         this.c.a();
         this.f = false;
         if (var4 != 2) {
            var1 = null;
         }

         this.a(var1);
      }

   }

   void b() {
      this.b.a();
      this.b = null;
      this.c = null;
   }
}
