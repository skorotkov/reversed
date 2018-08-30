package fi.polar.polarflow.service.activity;

import android.content.Context;

class n implements fi.polar.polarflow.service.activity.a.f {
   // $FF: synthetic field
   final DailyActivityService a;

   n(DailyActivityService var1) {
      this.a = var1;
   }

   public void a() {
      if (DailyActivityService.a(this.a) == y.b) {
         DailyActivityService.b(this.a).a();
         DailyActivityService.d(this.a).a((Context)this.a, (ak)DailyActivityService.c(this.a));
         DailyActivityService.e(this.a).a();
         this.a.a.a(this.a.b, 30000000);
         this.a.b.a(DailyActivityService.f(this.a));
         DailyActivityService.a(this.a, DailyActivityService.g(this.a).h());
         DailyActivityService.g(this.a).a();
         this.a.c.a(this.a.e, DailyActivityService.h(this.a));
         DailyActivityService.a(this.a, y.c);
      }

   }
}
