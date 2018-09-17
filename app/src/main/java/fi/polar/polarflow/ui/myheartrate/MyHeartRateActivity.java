package fi.polar.polarflow.ui.myheartrate;

import android.animation.AnimatorInflater;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.AlarmManager;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fi.polar.polarflow.c.b_PolarSensorEventBase;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.c.c_heartrate_package.s;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.ui.p;
import fi.polar.polarflow.ui.q;
import fi.polar.polarflow.ui.t;
import fi.polar.polarflow.ui.u;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.custom.RotateImageView;
import fi.polar.polarflow.ui.custom.ab;
import fi.polar.polarflow.util.aa_TimeUtils;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyHeartRateActivity extends android.support.wearable.activity.a implements e_PolarSensorListenerEx, u {
   private static final long a;
   private AlarmManager A;
   private PendingIntent B;
   private long C;
   private int D;
   private boolean E;
   private boolean F;
   private boolean G;
   private int H;
   private final BroadcastReceiver I = new e(this);
   private final Runnable J = new f(this);
   private s b;
   private m_SENSOR_STATE c;
   private Handler d;
   private boolean e;
   private TextView f;
   private boolean g;
   private RotateImageView h;
   private RotateImageView i;
   private ImageView j;
   private ImageView k;
   private PolarGlyphView l;
   private ObjectAnimator m;
   private ObjectAnimator n;
   private boolean o;
   private boolean p;
   private long q;
   private boolean r;
   private boolean s;
   private boolean t;
   private boolean u;
   private Training v;
   private boolean w;
   private v_StickyLocalBroadcastManager x;
   private p y;
   private aa_TimeUtils z;

   static {
      a = TimeUnit.SECONDS.toMillis(10L);
   }

   // $FF: synthetic method
   static RotateImageView a(MyHeartRateActivity var0) {
      return var0.h;
   }

   private void a(Intent var1) {
      m_SENSOR_STATE var2 = (m_SENSOR_STATE)var1.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE");
      if (this.c != var2) {
         this.a(var2);
      }

      if (this.c == m_SENSOR_STATE.d_READY) {
         this.c(true);
         this.b(var1.getIntExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", -1));
      } else {
         this.c(false);
      }

   }

   private void a(View var1, long var2) {
      var1.animate().alpha(0.0F).setDuration(var2).withEndAction(new c(this, var1)).start();
   }

   private static void a(s var0) {
      if (var0 != null) {
         var0.a_setPolarSensorListener((l_PolarSensorListener)null);
         var0.c_stop();
      }

   }

   private static void a(s var0, l_PolarSensorListener var1) {
      if (var0 != null) {
         var0.a_setPolarSensorListener(var1);
         var0.b_start();
      }

   }

   // $FF: synthetic method
   static void a(MyHeartRateActivity var0, Intent var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(MyHeartRateActivity var0, View var1, long var2) {
      var0.a(var1, var2);
   }

   private void a(String var1) {
      q var2 = this.b(var1);
      if (var2 != null) {
         var2.dismiss();
      }

   }

   private void a(boolean var1) {
      if (this.u != var1) {
         if (var1) {
            this.a(this.j, 200L);
            this.b(this.i, 200L);
         } else {
            this.a(this.i, 200L);
            this.b(this.j, 200L);
         }

         this.u = var1;
      }

   }

   // $FF: synthetic method
   static RotateImageView b(MyHeartRateActivity var0) {
      return var0.i;
   }

   private q b(String var1) {
      Fragment var2 = this.getFragmentManager().findFragmentByTag(var1);
      q var3;
      if (var2 instanceof q) {
         var3 = (q)var2;
      } else {
         var3 = null;
      }

      return var3;
   }

   private void b(int var1) {
      this.H = var1;
      if (this.H != -1) {
         if (!this.s) {
            this.s = true;
            if (this.E) {
               this.j.setOnClickListener(new d(this));
            }

            this.getWindow().clearFlags(128);
         }

         if (!this.b()) {
            this.f.setText(String.valueOf(this.H));
         }
      } else {
         fi.polar.polarflow.util.d.b("MyHeartRateActivity", "Undefined HR data received");
      }

   }

   private void b(View var1, long var2) {
      if (var1 instanceof RotateImageView) {
         ((RotateImageView)var1).a();
      }

      var1.animate().alpha(1.0F).setDuration(var2).start();
   }

   private void b(boolean var1) {
      if (var1 != this.t) {
         if (var1) {
            this.f.setVisibility(0);
            this.l.setVisibility(8);
         } else {
            this.f.setVisibility(8);
            this.l.setVisibility(0);
         }

         this.t = var1;
      }

   }

   // $FF: synthetic method
   static ImageView c(MyHeartRateActivity var0) {
      return var0.j;
   }

   private void c(boolean var1) {
      if (!this.b()) {
         if (var1) {
            this.b(true);
            this.a(false);
         } else {
            this.b(false);
            this.a(true);
         }
      }

   }

   // $FF: synthetic method
   static TextView d(MyHeartRateActivity var0) {
      return var0.f;
   }

   private void e() {
      if (!this.isFinishing()) {
         if (this.g) {
            this.o();
         } else if (!this.o) {
            this.i();
         }
      }

   }

   // $FF: synthetic method
   static void e(MyHeartRateActivity var0) {
      var0.e();
   }

   private void f() {
      this.n.start();
   }

   // $FF: synthetic method
   static void f(MyHeartRateActivity var0) {
      var0.f();
   }

   // $FF: synthetic method
   static int g(MyHeartRateActivity var0) {
      return var0.D;
   }

   private void g() {
      this.h();
      this.d.postDelayed(this.J, (long)this.D);
   }

   private void h() {
      this.d.removeCallbacks(this.J);
   }

   // $FF: synthetic method
   static void h(MyHeartRateActivity var0) {
      var0.p();
   }

   private void i() {
      switch(this.y.a(this, new String[]{"android.permission.BODY_SENSORS"}, 1000, false)) {
      case -1:
         this.f();
         this.o = false;
         break;
      case 0:
         this.o = false;
         break;
      case 1:
         this.o = true;
         this.q = this.z.b_elapsedRealtime();
         break;
      default:
         this.f();
         this.o = false;
      }

   }

   private void j() {
      String var1 = this.getString(2131230933);
      fi.polar.polarflow.ui.v var2 = (new t()).b(var1).a(true).c();
      var2.a(this);
      var2.show(this.getFragmentManager(), "enable_permission_dialog");
   }

   private void k() {
      if (this.G) {
         if (this.b()) {
            this.C = this.z.b_elapsedRealtime() + a;
            this.A.setExact(2, this.C, this.B);
         } else {
            this.l();
         }
      }

   }

   private void l() {
      if (this.G) {
         this.C = 0L;
         this.A.cancel(this.B);
      }

   }

   private void m() {
      this.h.b();
      this.i.b();
      this.m.cancel();
      this.n.cancel();
      this.j.clearAnimation();
      this.f.clearAnimation();
      this.l.clearAnimation();
   }

   private void n() {
      this.getWindow().addFlags(128);
      this.s = false;
      this.h.a();
      this.a(this.h, 900L);
      this.b(this.i, 900L);
      this.u = true;
   }

   private void o() {
      if (!this.e) {
         if (this.v.isRunning()) {
            this.n();
            Intent var1 = this.x.a_registerReceiver(this.I, "fi.polar.polarflow.ACTION_HR_DATA");
            this.w = true;
            if (var1 != null) {
               this.a(var1);
            }
         } else {
            this.n();
            if (this.b == null) {
               this.b = new s(this);
            }

            a((s)this.b, (l_PolarSensorListener)this);
            if (this.D != -1) {
               this.g();
            }
         }

         this.e = true;
      }

   }

   private void p() {
      if (this.D != -1) {
         this.h();
      }

      if (this.e) {
         if (this.w) {
            this.w = false;
            this.x.a_unregisterReceiver(this.I);
         }

         if (this.b != null) {
            a(this.b);
            this.b = null;
         }

         this.e = false;
      }

   }

   public void a(int var1) {
   }

   public void a(Bundle var1) {
      super.a(var1);
      this.j.setVisibility(8);
      this.k.setVisibility(0);
      this.i.b();
      this.i.setVisibility(8);
      this.l.getPaint().setAntiAlias(false);
      this.f.getPaint().setAntiAlias(false);
      this.k();
   }

   public void a(m_SENSOR_STATE var1) {
      this.c = var1;
   }

   public void a(q var1) {
      if ("enable_permission_dialog".equals(var1.getTag())) {
         this.r = true;
         Intent var2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
         var2.setData(Uri.fromParts("package", this.getPackageName(), (String)null));
         this.startActivity(var2);
      }

   }

   public void a_onPolarSensorEvents(List var1) {
      if (var1 != null && this.c == m_SENSOR_STATE.d_READY) {
         this.c(true);
         b_PolarSensorEventBase var2 = (b_PolarSensorEventBase)var1.get(var1.size() - 1);
         if (var2.a_values != null && var2.a_values.length > 0) {
            this.b(Math.round(var2.a_values[0]));
         } else {
            fi.polar.polarflow.util.d.b("MyHeartRateActivity", "No value!");
         }
      } else {
         this.c(false);
      }

   }

   public void b(q var1) {
      if ("enable_permission_dialog".equals(var1.getTag())) {
         this.finish();
      }

   }

   public void c(q var1) {
      if ("enable_permission_dialog".equals(var1.getTag())) {
         this.finish();
      }

   }

   public void d() {
      boolean var1 = true;
      super.d();
      this.l.getPaint().setAntiAlias(true);
      this.f.getPaint().setAntiAlias(true);
      this.k.setVisibility(8);
      this.j.setVisibility(0);
      this.i.setVisibility(0);
      if (this.c != m_SENSOR_STATE.d_READY) {
         var1 = false;
      }

      if (var1) {
         if (this.H != -1) {
            this.f.setText(String.valueOf(this.H));
         }
      } else {
         this.i.a();
      }

      this.c(var1);
      this.l();
   }

   public void d(q var1) {
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968607);
      Intent var7 = this.getIntent();
      if (var7 != null) {
         this.G = var7.getBooleanExtra("is_ambient_enabled", false);
         this.D = var7.getIntExtra("measurement_timeout", -1);
         this.E = var7.getBooleanExtra("tap_to_exit", false);
         this.F = var7.getBooleanExtra("polar_button_to_exit", false);
      } else {
         this.G = false;
         this.D = -1;
         this.E = false;
         this.F = false;
      }

      if (this.G) {
         this.f_();
      }

      Resources var8 = this.getResources();
      int var2 = var8.getDimensionPixelSize(2131361992);
      int var3 = var8.getDimensionPixelOffset(2131361993);
      int var4 = this.getColor(2131623967);
      int var5 = this.getColor(2131623969);
      View var9 = this.findViewById(2131755141);
      this.f = (TextView)this.findViewById(2131755147);
      this.h = (RotateImageView)this.findViewById(2131755142);
      this.h.setImageDrawable(new ab(var4, var2, 6, (float)var3));
      this.i = (RotateImageView)this.findViewById(2131755144);
      ab var6 = new ab(var4, var2, 1, 360.0F);
      var6.a(this.getColor(2131623968), var4);
      this.i.setImageDrawable(var6);
      this.j = (ImageView)this.findViewById(2131755145);
      this.j.setImageDrawable(new ab(var4, var2, 1, 360.0F));
      this.k = (ImageView)this.findViewById(2131755143);
      this.k.setImageDrawable(new ab(var5, var2, 1, 360.0F));
      this.l = (PolarGlyphView)this.findViewById(2131755146);
      this.d = new Handler();
      this.m = (ObjectAnimator)AnimatorInflater.loadAnimator(this, 2131099650);
      this.m.setEvaluator(new ArgbEvaluator());
      this.m.setTarget(var9);
      this.n = (ObjectAnimator)AnimatorInflater.loadAnimator(this, 2131099648);
      this.n.setEvaluator(new ArgbEvaluator());
      this.n.setTarget(var9);
      this.n.addListener(new a(this));
      this.o = false;
      this.q = 0L;
      this.p = false;
      this.t = false;
      this.r = false;
      this.u = false;
      this.v = Training.getInstance();
      this.x = v_StickyLocalBroadcastManager.a_getInstance();
      this.y = new p();
      this.z = new aa_TimeUtils();
      this.H = -1;
      if (this.G) {
         this.A = (AlarmManager)this.getSystemService("alarm");
         var7 = new Intent(this.getApplicationContext(), MyHeartRateActivity.class);
         var7.setAction("MyHeartRateActivity.action.AMBIENT_UPDATE");
         var7.putExtra("tap_to_exit", this.E);
         var7.putExtra("polar_button_to_exit", this.F);
         var7.putExtra("measurement_timeout", this.D);
         var7.putExtra("is_ambient_enabled", this.G);
         this.B = PendingIntent.getActivity(this.getApplicationContext(), 0, var7, 134217728);
      }

   }

   protected void onDestroy() {
      super.onDestroy();
      this.p();
      this.l();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      if (var1 == 265 && this.F) {
         fi.polar.polarflow.ui.o.a((Context)this.getApplicationContext(), 30);
         this.setResult(-1, (new fi.polar.polarflow.ui.b()).a(true).a());
         this.finishAfterTransition();
         this.overridePendingTransition(0, 2131034140);
      } else {
         var3 = super.onKeyDown(var1, var2);
      }

      return var3;
   }

   public void onNewIntent(Intent var1) {
      super.onNewIntent(var1);
      this.setIntent(var1);
      if ("MyHeartRateActivity.action.AMBIENT_UPDATE".equals(var1.getAction())) {
         boolean var2;
         if (this.c == m_SENSOR_STATE.d_READY) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var2 && this.H != -1) {
            this.f.setText(String.valueOf(this.H));
         }

         this.b(var2);
         this.k();
      }

   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      this.o = false;
      if (var1 == 1000) {
         if (var3.length > 0) {
            if (var3[0] == 0) {
               this.o();
            } else if (this.z.b_elapsedRealtime() - this.q < 300L) {
               if (!this.r) {
                  this.o = true;
                  this.j();
               }
            } else {
               this.finish();
            }
         } else {
            fi.polar.polarflow.util.d.b("MyHeartRateActivity", "grantResults is empty");
            this.finish();
         }
      }

   }

   protected void onRestart() {
      super.onRestart();
      this.p = true;
      this.a("enable_permission_dialog");
      this.o = false;
   }

   protected void onStart() {
      super.onStart();
      this.g = this.y.a(this, "android.permission.BODY_SENSORS");
      if (!this.g && this.r) {
         this.finish();
      }

   }

   protected void onStop() {
      super.onStop();
      this.p();
      this.l();
      this.m();
   }

   public void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      if (var1) {
         if (!this.p && !this.o) {
            this.m.start();
            this.l.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setStartDelay(300L).setDuration(400L);
            this.h.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setStartDelay(300L).setDuration(400L).withEndAction(new b(this));
         } else {
            this.e();
         }
      }

      this.p = false;
   }
}
