package fi.polar.polarflow.service.sensorhubsocket;

import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.util.k;
import fi.polar.polarmathsmart.heartrate.ConvertHeartRateOrMetAndroidImpl;

public class i {
   private c a;
   private b b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;

   private static int a(k var0, float var1) {
      return (int)(new ConvertHeartRateOrMetAndroidImpl(var0.p(), (double)var0.t(), (double)var0.s(), var0.r(), var0.y(), (char)var0.u(), (char)var0.v())).convertMetToHeartRate(var1);
   }

   public g a() {
      return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
   }

   public i a(int var1) {
      if (var1 == 3) {
         this.a = fi.polar.polarflow.service.sensorhubsocket.c.b;
      } else {
         this.a = fi.polar.polarflow.service.sensorhubsocket.c.a;
      }

      return this;
   }

   public i a(PhysData var1) {
      k var2 = new k(var1);
      if (var2.q() == 2) {
         this.b = fi.polar.polarflow.service.sensorhubsocket.b.b;
      } else {
         this.b = fi.polar.polarflow.service.sensorhubsocket.b.a;
      }

      this.c = var2.p();
      this.d = (int)(1000.0F * var2.s());
      this.e = (int)(10.0F * var2.t());
      this.f = var2.u();
      this.g = var2.v();
      this.h = var2.y();
      this.i = a(var2, 4.0F);
      return this;
   }
}
