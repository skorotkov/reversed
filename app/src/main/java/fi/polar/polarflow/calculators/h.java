package fi.polar.polarflow.calculators;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import fi.polar.polarflow.data.Lap;
import fi.polar.polarflow.data.Lap$LapBuilder;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingLapStatistics;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class h extends aj implements ae, ah {
   private static final ArrayList d = new ArrayList(3);
   int a;
   protected fi.polar.polarflow.util.v b;
   private float e;
   private float f;
   private float g;
   private float h;
   private float i;
   private float j;
   private float k;
   private long l;
   private final as m;
   private final bd n;
   private final aw o;
   private final fi.polar.polarflow.calculators.a_package.c p;
   private final at q;
   private long r;
   private long s;
   private long t;

   static {
      d.add(fi.polar.polarflow.c_package.n.b);
      d.add(fi.polar.polarflow.c_package.n.d);
      d.add(fi.polar.polarflow.c_package.n.e);
   }

   public h(Context var1, long var2) {
      this(var1, var2, (fi.polar.polarflow.util.v)null, new as());
   }

   public h(Context var1, long var2, fi.polar.polarflow.util.v var4) {
      this(var1, var2, var4, new as());
   }

   public h(Context var1, long var2, fi.polar.polarflow.util.v var4, as var5) {
      super(d);
      this.a = 1;
      this.e = -1.0F;
      this.f = -1.0F;
      this.g = 0.0F;
      this.h = -1.0F;
      this.i = 0.0F;
      this.j = -1.0F;
      this.k = 0.0F;
      this.l = 0L;
      this.p = new fi.polar.polarflow.calculators.a_package.c();
      this.q = new at(0.0F, 250.0F);
      this.r = 0L;
      this.s = 0L;
      this.t = 0L;
      this.a((ai)(new i(this, 0, 0L)));
      this.r = var2;
      if (var4 == null) {
         if (var1 != null) {
            var4 = fi.polar.polarflow.util.v.a(var1);
         } else {
            var4 = null;
         }
      }

      this.b = var4;
      this.m = var5;
      this.n = new bd();
      this.o = new aw();
   }

   private void a(float var1, float var2, double var3, float var5, float var6, boolean var7) {
      this.h = var5;
      this.j = var6;
      if (var7) {
         this.e = var1;
      }

      if (Float.isNaN(var2)) {
         this.m.b();
      } else {
         this.m.a(3.6F * var2);
      }

      if (!this.c) {
         this.f();
      }

   }

   private void a(int var1) {
      this.p.a(var1);
      if (!this.c) {
         this.g();
      }

   }

   private void a(int var1, boolean var2) {
      if (var2) {
         int var3;
         if (var1 < 0) {
            var3 = 0;
         } else {
            var3 = var1;
            if (var1 > 250) {
               var3 = 250;
            }
         }

         this.q.a((float)var3);
      } else {
         this.q.b();
      }

      if (!this.c) {
         this.e();
      }

   }

   private void b(Lap var1) {
      Intent var2 = new Intent();
      if (var1.getAutoLapType() == -1) {
         var2.setAction("ExerciseLapCalc.ACTION_MANUAL_LAP");
      } else {
         var2.setAction("ExerciseLapCalc.ACTION_AUTO_LAP");
      }

      var2.putExtra("ExerciseLapCalc.KEY_LAP_NUMBER", var1.getLapNumber());
      var2.putExtra("ExerciseLapCalc.KEY_LAP", var1);
      this.b.b(var2);
   }

   private void d() {
      Iterator var1 = this.b.b("fi.polar.polarflow.ACTION_HR_DATA", "fi.polar.polarflow.ACTION_LOCATION_DATA", "fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA").iterator();

      while(var1.hasNext()) {
         Intent var2 = (Intent)var1.next();
         boolean var3;
         if (fi.polar.polarflow.c_package.m.d == var2.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE")) {
            var3 = true;
         } else {
            var3 = false;
         }

         if ("fi.polar.polarflow.ACTION_HR_DATA".equals(var2.getAction())) {
            this.a(var2.getIntExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", 0), var3);
         } else if ("fi.polar.polarflow.ACTION_LOCATION_DATA".equals(var2.getAction())) {
            this.a(var2.getFloatExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE", -1.0F), var2.getFloatExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_CURRENT_SPEED_VALUE", Float.NaN), var2.getDoubleExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ALTITUDE_VALUE", -1.0D), var2.getFloatExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ASCENT_VALUE", -1.0F), var2.getFloatExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DESCENT_VALUE", -1.0F), var3);
         } else if ("fi.polar.polarflow.ACTION_RUNNING_CADENCE_DATA".equals(var2.getAction())) {
            this.a(var2.getIntExtra("fi.polar.polarflow.KEY_SENSOR_RUNNING_CADENCE_VALUE", 0));
         }
      }

   }

   private void e() {
      if (this.q.g()) {
         String var1;
         if (this instanceof ab) {
            var1 = "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_HR";
         } else {
            var1 = "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR";
         }

         Intent var2 = new Intent(var1);
         var2.putExtra("ExerciseLapCalc.KEY_LAP_NUMBER", this.a);
         var2.putExtra("ExerciseLapCalc.KEY_AVG_HR", Math.round(this.q.c()));
         var2.putExtra("ExerciseLapCalc.KEY_MAX_HR", Math.round(this.q.e()));
         var2.putExtra("ExerciseLapCalc.KEY_MIN_HR", Math.round(this.q.d()));
         this.b.b(var2);
      }

   }

   private void f() {
      float var1 = this.k();
      if (var1 != -1.0F) {
         String var2;
         if (this instanceof ab) {
            var2 = "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS";
         } else {
            var2 = "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_GPS";
         }

         Intent var4 = new Intent(var2);
         var4.putExtra("ExerciseLapCalc.KEY_LAP_NUMBER", this.a);
         var4.putExtra("ExerciseLapCalc.KEY_DISTANCE", var1);
         var4.putExtra("ExerciseLapCalc.KEY_ASCENT", this.l());
         var4.putExtra("ExerciseLapCalc.KEY_DESCENT", this.m());
         if (this.m.g()) {
            var1 = this.m.a(this.i(), (double)var1);
            float var3 = Math.max(this.m.e(), var1);
            var4.putExtra("ExerciseLapCalc.KEY_AVG_SPEED", var1);
            var4.putExtra("ExerciseLapCalc.KEY_MAX_SPEED", var3);
         }

         this.b.b(var4);
      }

   }

   private void g() {
      if (this.p.b()) {
         String var1;
         if (this instanceof ab) {
            var1 = "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_RUNNING_CADENCE";
         } else {
            var1 = "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_RUNNING_CADENCE";
         }

         Intent var2 = new Intent(var1);
         var2.putExtra("ExerciseLapCalc.KEY_LAP_NUMBER", this.a);
         var2.putExtra("ExerciseLapCalc.KEY_AVG_RUNNING_CADENCE", this.p.d());
         var2.putExtra("ExerciseLapCalc.KEY_MAX_RUNNING_CADENCE", this.p.e());
         this.b.b(var2);
      }

   }

   public void a() {
      ai var1 = this.o();
      if (var1 instanceof z) {
         this.a(((z)var1).a(), var1.n());
      } else if (var1 instanceof aa) {
         this.a(((aa)var1).b(), ((aa)var1).a(), (double)((aa)var1).c(), ((aa)var1).d(), ((aa)var1).e(), var1.n());
      } else if (var1 instanceof b) {
         this.a(((b)var1).a());
      } else if (var1 instanceof ag) {
         this.n.a((ag)var1);
         this.o.a((ag)var1);
      }

   }

   void a(fi.polar.polarflow.util.v var1) {
      this.b = var1;
   }

   protected boolean a(int var1, long var2, float var4) {
      return this.a(this.c(var1, var2, var4));
   }

   protected boolean a(int var1, long var2, SwimmingLapStatistics var4) {
      return this.a(this.c(var1, var2, var4));
   }

   protected boolean a(Lap var1) {
      boolean var2;
      if (!this.c && this.a <= this.n()) {
         fi.polar.polarflow.util.d.c("ExerciseLapCalc", "addLap, number:" + this.a);
         this.b(var1);
         ++this.a;
         this.d();
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void b() {
      this.t = SystemClock.elapsedRealtime();
   }

   void b(int var1, long var2, float var4) {
      fi.polar.polarflow.util.d.c("ExerciseLapCalc", "addLastLap, number:" + this.a);
      this.b(this.c(var1, var2, var4));
   }

   void b(int var1, long var2, SwimmingLapStatistics var4) {
      fi.polar.polarflow.util.d.c("ExerciseLapCalc", "addLastLap, number:" + this.a);
      this.b(this.c(var1, var2, var4));
   }

   protected Lap c(int var1, long var2, float var4) {
      float var5 = this.l();
      float var6 = this.m();
      Lap$LapBuilder var7 = new Lap$LapBuilder();
      var7.setAutoLapType(var1);
      var7.setDurationMillis(var2);
      var7.setDistance(var4);
      var7.setAscent(var5);
      var7.setDescent(var6);
      this.l += var2;
      var7.setSplitTimeMillis(this.l);
      if (var4 != -1.0F) {
         this.g += var4;
      }

      if (var5 != -1.0F) {
         this.i += var5;
      }

      if (var6 != -1.0F) {
         this.k += var6;
      }

      if (this.q.g()) {
         var7.setAvgHR(Math.round(this.q.c()));
         var7.setMaxHR(Math.round(this.q.e()));
         var7.setMinHR(Math.round(this.q.d()));
         this.q.a();
      }

      if (this.m.g()) {
         var7.setAvgSpeed(this.m.b(var2, (double)var4));
         var7.setMaxSpeed(this.m.c(var2, (double)var4));
         this.m.a();
      }

      if (this.p.b()) {
         var7.setAvgCadence(this.p.d());
         var7.setMaxCadence(this.p.e());
         this.p.c();
      }

      var7.setLapNumber(this.a);
      return var7.build();
   }

   protected Lap c(int var1, long var2, SwimmingLapStatistics var4) {
      Lap$LapBuilder var5 = new Lap$LapBuilder();
      var5.setAutoLapType(var1);
      var5.setDurationMillis(var2);
      this.l += var2;
      var5.setSplitTimeMillis(this.l);
      if (this.q.g()) {
         var5.setAvgHR(Math.round(this.q.c()));
         var5.setMaxHR(Math.round(this.q.e()));
         var5.setMinHR(Math.round(this.q.d()));
         this.q.a();
      }

      if (var4 != null) {
         var5.setLapStrokes(fi.polar.polarflow.a.a.a(13, var4.getLapStrokes()));
         var5.setPoolCount(fi.polar.polarflow.a.a.a(12, var4.getPoolCount()));
         float var6 = var4.getAvgDurationOfPool();
         if (!Float.isInfinite(var6) && !Float.isNaN(var6)) {
            var5.setAvgDurationOfPool(fi.polar.polarflow.a.a.a(11, var6));
         }
      }

      if (this.n.h()) {
         if (var1 == -1) {
            var5.setAvgSpeed(this.n.d());
            var5.setMaxSpeed(this.n.e());
         } else {
            var5.setAvgSpeed(this.n.b());
            var5.setMaxSpeed(this.n.c());
         }
      }

      if (this.o.c()) {
         if (var1 == -1) {
            var5.setDistance(this.o.b());
         } else {
            var5.setDistance(this.o.a());
         }
      }

      var5.setLapNumber(this.a);
      return var5.build();
   }

   public void c() {
      this.s += SystemClock.elapsedRealtime() - this.t;
      this.t = 0L;
   }

   final long i() {
      return this.j() - this.l;
   }

   protected long j() {
      long var1 = 0L;
      long var3 = SystemClock.elapsedRealtime();
      long var5 = this.s;
      if (this.t > 0L) {
         var1 = var3 - this.t;
      }

      return var3 - this.r - (var1 + var5);
   }

   final float k() {
      float var1 = this.e - this.g;
      float var2 = var1;
      if (var1 < 0.0F) {
         var2 = -1.0F;
      }

      return var2;
   }

   final float l() {
      float var1 = this.h - this.i;
      float var2 = var1;
      if (var1 < 0.0F) {
         var2 = -1.0F;
      }

      return var2;
   }

   final float m() {
      float var1 = this.j - this.k;
      float var2 = var1;
      if (var1 < 0.0F) {
         var2 = -1.0F;
      }

      return var2;
   }

   int n() {
      return 999;
   }
}
