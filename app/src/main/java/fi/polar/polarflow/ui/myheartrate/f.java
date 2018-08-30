package fi.polar.polarflow.ui.myheartrate;

class f implements Runnable {
   // $FF: synthetic field
   final MyHeartRateActivity a;

   f(MyHeartRateActivity var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.e("MyHeartRateActivity", "timeout(value=" + MyHeartRateActivity.g(this.a) + ")");
      MyHeartRateActivity.h(this.a);
      MyHeartRateActivity.f(this.a);
   }
}
