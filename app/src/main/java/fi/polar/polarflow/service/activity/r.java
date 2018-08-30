package fi.polar.polarflow.service.activity;

import org.joda.time.DateTime;

class r implements ak {
   // $FF: synthetic field
   final DailyActivityService a;

   r(DailyActivityService var1) {
      this.a = var1;
   }

   public void a() {
      fi.polar.polarflow.util.d.c("DailyActivityService", "User activated after inactivity notification");
      DailyActivityService.a(this.a, w.c);
   }

   public void a(DateTime var1) {
      fi.polar.polarflow.util.d.c("DailyActivityService", "Send inactivity notification " + var1);
      DailyActivityService.a(this.a, w.a);
   }

   public void b() {
      this.a.b.a(DailyActivityService.f(this.a));
   }

   public void b(DateTime var1) {
      fi.polar.polarflow.util.d.c("DailyActivityService", "Add inactivity stamp " + var1);
      DailyActivityService.b(this.a).a(var1);
      DailyActivityService.a(this.a, w.b);
   }
}
