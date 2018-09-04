package fi.polar.polarflow.service.activity;

class bl extends bk {
   // $FF: synthetic field
   final SleepTrackingService b;
   private final boolean c;
   private final boolean d;

   public bl(SleepTrackingService var1, boolean var2, boolean var3) {
      super(var1, (be)null);
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public void run() {
      SleepTrackingService.a(this.b).b();
      this.a();
      fi.polar.polarflow.util.b_package.a var1 = this.a(this.c, this.d);
      if (!SleepTrackingService.b(this.b).isEmpty()) {
         SleepTrackingService.c(this.b).post(new bn(this.b, var1));
      }

   }
}
