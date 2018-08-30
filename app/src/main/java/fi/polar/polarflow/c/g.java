package fi.polar.polarflow.c;

import android.hardware.SensorEvent;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public abstract class g extends c {
   private final j a;
   private final List b = new ArrayList();
   private final Runnable c = new h(this);

   public g(j var1, Handler var2) {
      super(var2);
      this.a = var1;
   }

   // $FF: synthetic method
   static List a(g var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static j b(g var0) {
      return var0.a;
   }

   public void a(b var1) {
      this.b.add(var1);
      super.onSensorChanged((SensorEvent)null);
   }

   protected Runnable b() {
      return this.c;
   }

   public void onSensorChanged(SensorEvent var1) {
      this.b.add(new b(var1));
      super.onSensorChanged(var1);
   }
}
