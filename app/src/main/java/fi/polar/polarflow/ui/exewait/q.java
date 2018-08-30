package fi.polar.polarflow.ui.exewait;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Build.VERSION;
import android.view.View.OnClickListener;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.ui.custom.GpsSensorView;
import fi.polar.polarflow.ui.custom.HrSensorView;

class q implements fi.polar.polarflow.ui.u {
   private static final String a = q.class.getSimpleName();
   private final OnClickListener b = new r(this);
   private Activity c = null;
   private u d;
   private long e;
   private boolean f;
   private boolean g;
   private Handler h;
   private Runnable i;

   public q(Activity var1) {
      this.d = u.a;
      this.e = 0L;
      this.f = false;
      this.g = false;
      this.h = null;
      this.i = null;
      this.c = var1;
      this.f = fi.polar.polarflow.ui.o.b(this.c);
      if (!this.f) {
         fi.polar.polarflow.util.d.c(a, "Location setting is DISABLED");
      }

   }

   // $FF: synthetic method
   static void a(q var0) {
      var0.f();
   }

   private void a(String[] var1) {
      if (1 == fi.polar.polarflow.ui.o.a(this.c, var1, 2, true)) {
         this.e = SystemClock.elapsedRealtime();
      }

   }

   private void b(String var1) {
      fi.polar.polarflow.ui.q var2 = this.c(var1);
      if (var2 != null) {
         var2.dismiss();
      }

   }

   // $FF: synthetic method
   static boolean b(q var0) {
      return var0.e();
   }

   private fi.polar.polarflow.ui.q c(String var1) {
      Fragment var2 = this.c.getFragmentManager().findFragmentByTag(var1);
      fi.polar.polarflow.ui.q var3;
      if (var2 instanceof fi.polar.polarflow.ui.q) {
         var3 = (fi.polar.polarflow.ui.q)var2;
      } else {
         var3 = null;
      }

      return var3;
   }

   private boolean e() {
      boolean var1 = true;
      if (!fi.polar.polarflow.ui.o.d(this.c, "android.permission.ACCESS_FINE_LOCATION")) {
         fi.polar.polarflow.util.d.c(a, "gpsOnClick() - requesting location permission");
         this.a(new String[]{"android.permission.ACCESS_FINE_LOCATION"});
      } else if (!this.f) {
         fi.polar.polarflow.util.d.c(a, "gpsOnClick() - enable location services");
         this.b();
      } else {
         var1 = false;
      }

      return var1;
   }

   private void f() {
      fi.polar.polarflow.util.d.c(a, "hrOnClick() - requesting body sensor permission");
      this.a(new String[]{"android.permission.BODY_SENSORS"});
   }

   private boolean g() {
      boolean var1 = false;
      boolean var2 = false;
      if (!this.f) {
         boolean var3 = fi.polar.polarflow.ui.o.b(this.c);
         var1 = var2;
         if (var3) {
            var1 = var2;
            if (this.d == u.c) {
               var1 = var2;
               if (!fi.polar.polarflow.ui.o.d(this.c, "android.permission.ACCESS_FINE_LOCATION")) {
                  var1 = true;
               }
            }
         }

         this.f = var3;
      }

      return var1;
   }

   public void a() {
      this.d();
      this.b("enable_location_setting_dialog");
      this.b("enable_permission_dialog");
      this.g = false;
   }

   public void a(int var1, String[] var2, int[] var3) {
      fi.polar.polarflow.util.d.c(a, "onRequestPermissionsResult() - request: " + var1);
      if ((var1 == 1 || var1 == 2) && var3.length > 0) {
         if (var1 == 2 && var3[0] != 0 && SystemClock.elapsedRealtime() - this.e < 300L) {
            if (var2[0] != null) {
               this.a(var2[0]);
            }
         } else {
            for(var1 = 0; var1 < var2.length; ++var1) {
               boolean var4;
               if (var3[var1] == 0) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               fi.polar.polarflow.util.d.c(a, "Permission " + var2[var1] + ": " + var4);
            }
         }

         this.d = u.c;
      }

   }

   public void a(SportProfile var1) {
      boolean var2;
      if (this.c("enable_location_setting_dialog") != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      fi.polar.polarflow.util.d.c(a, "prepareLocationEnableDialog - dialogExists=" + var2 + ", setting=" + this.f + ", answered=" + this.g);
      if (!var2 && !this.f && !this.g && var1 != null && var1.getSettings().isSensorEnabled(4)) {
         if (this.h == null) {
            this.h = new Handler();
            this.i = new t(this);
         }

         this.h.removeCallbacks(this.i);
         this.h.postDelayed(this.i, 1000L);
      }

   }

   public void a(HrSensorView var1, GpsSensorView var2) {
      fi.polar.polarflow.util.d.c(a, "setOnClickListeners()");
      this.f = fi.polar.polarflow.ui.o.b(this.c);
      if (var2 != null && (!fi.polar.polarflow.ui.o.d(this.c, "android.permission.ACCESS_FINE_LOCATION") || !this.f)) {
         var2.setOnClickListener(new s(this));
      }

      if (var1 != null && !fi.polar.polarflow.ui.o.d(this.c, "android.permission.BODY_SENSORS")) {
         var1.setOnClickListener(this.b);
      }

   }

   public void a(fi.polar.polarflow.ui.q var1) {
      if ("enable_location_setting_dialog".equals(var1.getTag())) {
         this.g = true;
         this.c.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
      } else if ("enable_permission_dialog".equals(var1.getTag())) {
         Intent var2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
         var2.setData(Uri.fromParts("package", this.c.getPackageName(), (String)null));
         this.c.startActivity(var2);
      }

   }

   protected void a(String var1) {
      int var2 = 0;
      if (var1.equals("android.permission.ACCESS_FINE_LOCATION")) {
         var2 = 2131230934;
      } else if (var1.equals("android.permission.BODY_SENSORS")) {
         var2 = 2131230933;
      }

      if (var2 != 0) {
         var1 = this.c.getString(var2);
         fi.polar.polarflow.ui.v var3 = (new fi.polar.polarflow.ui.t()).b(var1).a(true).c();
         var3.a(this);
         var3.show(this.c.getFragmentManager(), "enable_permission_dialog");
      }

   }

   protected void b() {
      String var1 = this.c.getString(2131230935);
      fi.polar.polarflow.ui.q var2 = (new fi.polar.polarflow.ui.t()).b(var1).a(true).a();
      var2.a((fi.polar.polarflow.ui.u)this);
      var2.show(this.c.getFragmentManager(), "enable_location_setting_dialog");
   }

   public void b(fi.polar.polarflow.ui.q var1) {
      if ("enable_location_setting_dialog".equals(var1.getTag())) {
         this.g = true;
      }

   }

   public void c(fi.polar.polarflow.ui.q var1) {
      if ("enable_location_setting_dialog".equals(var1.getTag())) {
         this.g = true;
      }

   }

   public boolean c() {
      boolean var1 = true;
      fi.polar.polarflow.util.d.c(a, "checkSensorUpdateStart()");
      boolean var2;
      if (VERSION.SDK_INT < 23) {
         var2 = var1;
      } else {
         boolean var3 = this.g();
         if (!var3) {
            this.f = fi.polar.polarflow.ui.o.b(this.c);
         }

         if (this.d == u.c) {
            var2 = var1;
            if (!var3) {
               return var2;
            }
         }

         if (this.d == u.a) {
            this.d = u.b;
            switch(fi.polar.polarflow.ui.o.a(this.c, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, 1, false)) {
            case 0:
               fi.polar.polarflow.util.d.c(a, "checkSensorUpdateStart() - needed permissions already granted");
               this.d = u.c;
               var2 = var1;
               return var2;
            case 1:
               this.e = SystemClock.elapsedRealtime();
               var2 = false;
               return var2;
            default:
               fi.polar.polarflow.util.d.b(a, "checkSensorUpdateStart() - invalid request");
            }
         } else {
            if (var3) {
               fi.polar.polarflow.ui.o.a(this.c, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1, false);
               var2 = false;
               return var2;
            }

            fi.polar.polarflow.util.d.c(a, "checkSensorUpdateStart() - already requested permissions");
         }

         var2 = false;
      }

      return var2;
   }

   public void d() {
      if (this.h != null && this.i != null) {
         this.h.removeCallbacks(this.i);
      }

   }

   public void d(fi.polar.polarflow.ui.q var1) {
   }
}
