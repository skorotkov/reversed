package fi.polar.polarflow.ftu;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.TextView;
import fi.polar.polarflow.ui.MainMenuActivity;
import fi.polar.polarflow.ui.NotificationReceiver;
import fi.polar.polarflow.util.r;
import fi.polar.polarflow.util.u;

public class GridAnimationActivity extends Activity {
   public static final String a;
   private static final String b = GridAnimationActivity.class.getSimpleName();
   private GridAnimationLayout c = null;
   private Handler d = null;
   private Runnable e = null;
   private TextView f = null;
   private g g;
   private int h;
   private String i;
   private IntentFilter j;
   private boolean k;
   private final BroadcastReceiver l;

   static {
      a = b + "mode_key";
   }

   public GridAnimationActivity() {
      this.g = fi.polar.polarflow.ftu.g.a;
      this.h = 0;
      this.i = null;
      this.j = null;
      this.k = false;
      this.l = new f(this);
   }

   // $FF: synthetic method
   static int a(GridAnimationActivity var0, int var1) {
      var0.h = var1;
      return var1;
   }

   // $FF: synthetic method
   static String a() {
      return b;
   }

   // $FF: synthetic method
   static String a(GridAnimationActivity var0) {
      return var0.i;
   }

   private void a(String var1) {
      if (this.f != null) {
         this.i = var1;
         this.f.setText(this.i);
      }

   }

   // $FF: synthetic method
   static TextView b(GridAnimationActivity var0) {
      return var0.f;
   }

   private void b() {
      this.a(this.getString(2131230977));
      this.d = new Handler();
      this.e = new d(this);
      this.d.postDelayed(this.e, 5000L);
   }

   // $FF: synthetic method
   static int c(GridAnimationActivity var0) {
      return var0.h;
   }

   private void c() {
      if (u.a().e()) {
         this.f();
      } else {
         this.a(this.getString(2131230985));
         this.d();
      }

   }

   // $FF: synthetic method
   static Runnable d(GridAnimationActivity var0) {
      return var0.e;
   }

   private void d() {
      if (this.f != null && !TextUtils.isEmpty(this.i) && this.i.length() >= 3) {
         this.d = new Handler();
         this.e = new e(this);
      }

   }

   // $FF: synthetic method
   static Handler e(GridAnimationActivity var0) {
      return var0.d;
   }

   private void e() {
      if (this.d != null) {
         if (this.g == fi.polar.polarflow.ftu.g.c) {
            this.d.post(this.e);
         } else if (this.g == fi.polar.polarflow.ftu.g.b) {
            this.d.postDelayed(this.e, 5000L);
         } else {
            fi.polar.polarflow.util.d.f(b, "Unknown mode " + this.g);
         }
      }

   }

   // $FF: synthetic method
   static g f(GridAnimationActivity var0) {
      return var0.g;
   }

   private void f() {
      this.startActivity(new Intent(this, MainMenuActivity.class));
      NotificationReceiver.a(this, 3);
      this.finish();
   }

   private void g() {
      this.startActivity(new Intent(this, SignInActivity.class));
      this.finish();
   }

   // $FF: synthetic method
   static void g(GridAnimationActivity var0) {
      var0.f();
   }

   protected void onCreate(Bundle var1) {
      fi.polar.polarflow.util.d.c(b, "onCreate()");
      super.onCreate(var1);
      this.setContentView(2130968640);
      var1 = this.getIntent().getExtras();
      if (var1 != null && var1.getSerializable(a) != null) {
         this.g = (g)var1.getSerializable(a);
      }

      this.f = (TextView)this.findViewById(2131755215);
      if (this.g == fi.polar.polarflow.ftu.g.c) {
         this.c();
      } else if (this.g == fi.polar.polarflow.ftu.g.b) {
         this.b();
      } else {
         fi.polar.polarflow.util.d.b(b, "Invalid mode");
         this.finish();
      }

      this.c = (GridAnimationLayout)this.findViewById(2131755214);
      this.j = new IntentFilter();
      this.j.addAction("fi.polar.polarflow.ACTION_FTU_SUCCEEDED");
      this.j.addAction("fi.polar.polarflow.ACTION_FTU_FAILED");
      this.k = false;
   }

   protected void onPause() {
      fi.polar.polarflow.util.d.c(b, "onPause()");
      super.onPause();
      if (this.d != null) {
         this.d.removeCallbacks(this.e);
      }

      this.c.a(false);
   }

   protected void onResume() {
      fi.polar.polarflow.util.d.c(b, "onResume()");
      super.onResume();
      this.c.a(true);
      this.e();
   }

   protected void onStart() {
      super.onStart();
      fi.polar.polarflow.util.d.c(b, "onStart()");
      if (this.g == fi.polar.polarflow.ftu.g.c) {
         if (u.a().e()) {
            fi.polar.polarflow.util.d.c(b, "Provisioned in background, go to main menu");
            this.f();
         } else if (!r.a.c()) {
            fi.polar.polarflow.util.d.c(b, "Ftu stopped without provisioning in background, go to sign in");
            this.g();
         } else {
            this.k = true;
            this.registerReceiver(this.l, this.j);
         }
      }

   }

   protected void onStop() {
      fi.polar.polarflow.util.d.c(b, "onStop()");
      if (this.k) {
         this.k = false;
         this.unregisterReceiver(this.l);
      }

      super.onStop();
   }
}
