package fi.polar.polarflow.c_package;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

public abstract class c implements SensorEventListener {
   private final Handler a;

   public c(Handler var1) {
      this.a = var1;
   }

   protected void a() {
      Runnable var1 = this.b();
      this.a.removeCallbacks(var1);
      this.a.postDelayed(var1, 500L);
   }

   protected abstract Runnable b();

   public void onSensorChanged(SensorEvent var1) {
      this.a();
   }
}
