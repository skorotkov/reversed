package fi.polar.polarflow.c.c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.SparseArray;

public class s extends a {
   private static final String g = s.class.getSimpleName();
   private static final SparseArray h = new t();
   private SensorManager i;
   private Sensor j;
   private boolean k;
   private fi.polar.polarflow.c.e l = null;
   private final Handler m = new Handler();
   private final fi.polar.polarflow.c.j n = new u(this);
   private final SensorEventListener o;

   public s(Context var1) {
      super(var1);
      this.o = new v(this, this.n, this.m);
      this.i = (SensorManager)var1.getSystemService("sensor");
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c.e a(s var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static void a(s var0, fi.polar.polarflow.c.m var1) {
      var0.a((fi.polar.polarflow.c.m)var1);
   }

   // $FF: synthetic method
   static void b(s var0, fi.polar.polarflow.c.m var1) {
      var0.a((fi.polar.polarflow.c.m)var1);
   }

   // $FF: synthetic method
   static String p() {
      return g;
   }

   // $FF: synthetic method
   static SparseArray q() {
      return h;
   }

   private void r() {
      if (!this.k) {
         this.j = this.i.getDefaultSensor(21);
         if (this.j != null) {
            this.k = this.i.registerListener(this.o, this.j, 3, this.m);
            if (!this.k) {
               fi.polar.polarflow.util.d.e(g, "SensorManager.registerListener() returned false");
            }
         } else {
            fi.polar.polarflow.util.d.e(g, "SensorManager.getDefaultSensor(Sensor.TYPE_HEART_RATE) returned null");
         }
      }

   }

   private void s() {
      if (this.k) {
         this.i.unregisterListener(this.o, this.j);
         this.k = false;
      }

   }

   public void a(fi.polar.polarflow.c.l var1) {
      this.l = (fi.polar.polarflow.c.e)var1;
   }

   public void b() {
      fi.polar.polarflow.util.d.c(g, "start()");
      if (fi.polar.polarflow.ui.o.d(this.a, "android.permission.BODY_SENSORS")) {
         if (!this.k) {
            this.r();
            if (this.k) {
               this.a(fi.polar.polarflow.c.m.c, true);
            } else {
               this.a(fi.polar.polarflow.c.m.a, true);
            }
         } else {
            this.d();
         }
      } else {
         this.a(fi.polar.polarflow.c.m.a, true);
      }

   }

   public void c() {
      fi.polar.polarflow.util.d.c(g, "stop()");
      this.s();
      this.m.removeCallbacksAndMessages((Object)null);
      this.a(fi.polar.polarflow.c.m.b, true);
   }

   protected void d() {
      if (this.l != null) {
         this.l.a(this.e());
      }

   }

   protected void l() {
   }
}
