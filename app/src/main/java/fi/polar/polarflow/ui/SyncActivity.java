package fi.polar.polarflow.ui;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.Wearable;
import fi.polar.polarflow.ui.custom.RotateImageView;
import fi.polar.polarflow.ui.custom.ah;

public class SyncActivity extends Activity implements u {
   private static final String b = SyncActivity.class.getSimpleName();
   protected final BroadcastReceiver a;
   private final Handler c = new Handler();
   private int d = -1;
   private IntentFilter e;
   private IntentFilter f;
   private RotateImageView g;
   private ah h;
   private TextView i;
   private ImageView j;
   private fi.polar.polarflow.service.bluetooth.i k;
   private boolean l;
   private android.support.v4.c.g m;
   private GoogleApiClient n;
   private NodeApi o;
   private int p;
   private final Runnable q;
   private final Runnable r;

   public SyncActivity() {
      this.o = Wearable.NodeApi;
      this.p = 20000;
      this.a = new k(this);
      this.q = new l(this);
      this.r = new n(this);
   }

   // $FF: synthetic method
   static TextView a(SyncActivity var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static String a() {
      return b;
   }

   private void a(int var1) {
      if (this.d != var1) {
         this.d = var1;
         this.f();
         long var3;
         Drawable var7;
         switch(var1) {
         case -1:
         case 0:
            this.i.setText(this.getString(2131230995));
            this.a(this.j, 2131624036);
            this.h.a(0);
            this.h.a(false);
            this.g.a();
            this.g.setVisibility(0);
            var7 = this.getResources().getDrawable(2130837682, (Theme)null);
            this.g();
            fi.polar.polarflow.util.y.a(this);
            var3 = -1L;
            break;
         case 1:
            this.i.setText(this.getString(2131230999));
            this.a(this.j, 2131624036);
            this.h.a(1);
            this.h.a(true);
            this.g.a();
            this.g.setVisibility(0);
            this.g.invalidate();
            var7 = this.getResources().getDrawable(2130837682, (Theme)null);
            var3 = -1L;
            break;
         case 2:
            this.i.setText(this.getString(2131230997));
            this.a(this.j, 2131623951);
            this.g.setVisibility(4);
            this.g.b();
            var7 = this.getResources().getDrawable(2130837651, (Theme)null);
            var3 = 1666L;
            break;
         case 3:
            this.i.setText(this.getString(2131230996));
            this.a(this.j, 2131624034);
            this.g.setVisibility(4);
            this.g.b();
            var7 = this.getResources().getDrawable(2130837685, (Theme)null);
            var3 = 3000L;
            fi.polar.polarflow.util.y.b(this);
            fi.polar.polarflow.ui.o.a((Context)this, (long[])fi.polar.polarflow.util.b.b);
            break;
         case 4:
         case 5:
            TextView var2 = this.i;
            if (var1 == 5) {
               var1 = 2131230994;
            } else {
               var1 = 2131230993;
            }

            var2.setText(this.getString(var1));
            this.a(this.j, 2131624034);
            this.g.setVisibility(4);
            this.g.b();
            var7 = this.getResources().getDrawable(2130837685, (Theme)null);
            var3 = 3000L;
            fi.polar.polarflow.util.y.b(this);
            fi.polar.polarflow.ui.o.a((Context)this, (long[])fi.polar.polarflow.util.b.b);
            break;
         default:
            fi.polar.polarflow.util.d.f(b, "Unknown state(state=" + var1 + ")");
            return;
         }

         this.j.setImageDrawable(var7);
         long var5 = this.i.animate().getDuration();
         if (var7 instanceof Animatable) {
            ((Animatable)var7).start();
         }

         if (var3 != -1L) {
            var5 = Math.max(0L, var3 - 2L * (var5 + 50L));
            this.i.setAlpha(0.0F);
            this.i.animate().alpha(1.0F).setStartDelay(50L).withEndAction(new i(this, var5));
            this.c.postDelayed(new j(this), var3);
         }
      }

   }

   private void a(ImageView var1, int var2) {
      Drawable var3 = var1.getBackground();
      if (var3 instanceof ShapeDrawable) {
         ((ShapeDrawable)var3).getPaint().setColor(android.support.v4.c.a.c(this, var2));
      } else if (var3 instanceof GradientDrawable) {
         ((GradientDrawable)var3).setColor(android.support.v4.c.a.c(this, var2));
      }

   }

   // $FF: synthetic method
   static void a(SyncActivity var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static int b(SyncActivity var0) {
      return var0.d;
   }

   private void b() {
      String var1 = this.getString(2131230992);
      q var2 = (new t()).b(var1).a(true).a();
      var2.a((u)this);
      var2.show(this.getFragmentManager(), "enable_bluetooth_dialog");
   }

   // $FF: synthetic method
   static void c(SyncActivity var0) {
      var0.e();
   }

   private boolean c() {
      boolean var1;
      if (this.k != null && this.k.a()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   // $FF: synthetic method
   static Runnable d(SyncActivity var0) {
      return var0.r;
   }

   private void d() {
      switch(this.d) {
      case 0:
         if (fi.polar.polarflow.util.r.a.a()) {
            this.a(1);
         } else {
            this.g();
            fi.polar.polarflow.util.y.a(this);
         }
         break;
      case 1:
         if (!fi.polar.polarflow.util.r.a.a()) {
            this.e();
         }
      }

   }

   // $FF: synthetic method
   static Handler e(SyncActivity var0) {
      return var0.c;
   }

   private void e() {
      this.finishAfterTransition();
      this.overridePendingTransition(0, 2131034140);
   }

   private void f() {
      this.c.removeCallbacks(this.r);
   }

   // $FF: synthetic method
   static void f(SyncActivity var0) {
      var0.h();
   }

   private void g() {
      this.f();
      this.c.postDelayed(this.r, (long)this.p);
   }

   // $FF: synthetic method
   static void g(SyncActivity var0) {
      var0.g();
   }

   private void h() {
      fi.polar.polarflow.util.d.c(b, "checkAndSetSearchFailedStatus()");
      if (this.n.isConnected()) {
         this.o.getConnectedNodes(this.n).setResultCallback(new m(this));
      } else {
         fi.polar.polarflow.util.d.e(b, "GoogleApiClient is not connected");
         this.a(4);
      }

   }

   protected DialogFragment a(String var1) {
      Fragment var2 = this.getFragmentManager().findFragmentByTag(var1);
      DialogFragment var3;
      if (var2 instanceof DialogFragment) {
         var3 = (DialogFragment)var2;
      } else {
         var3 = null;
      }

      return var3;
   }

   public void a(q var1) {
      if ("enable_bluetooth_dialog".equals(var1.getTag())) {
         this.k.b();
         this.c.postDelayed(this.q, 5000L);
      }

   }

   public void b(q var1) {
      if ("enable_bluetooth_dialog".equals(var1.getTag())) {
         this.e();
      }

   }

   public void c(q var1) {
      if ("enable_bluetooth_dialog".equals(var1.getTag())) {
         this.e();
      }

   }

   public void d(q var1) {
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968794);
      this.j = (ImageView)this.findViewById(2131755529);
      this.g = (RotateImageView)this.findViewById(2131755532);
      this.i = (TextView)this.findViewById(2131755531);
      this.h = new ah(this.getResources().getDimensionPixelSize(2131362294), 0, android.support.v4.c.a.c(this, 2131624035), 0);
      this.g.setImageDrawable(this.h);
      this.e = new IntentFilter();
      this.e.addAction("fi.polar.polarflow.action.SYNC_STARTED");
      this.e.addAction("fi.polar.polarflow.action.SYNC_STOPPED");
      this.f = new IntentFilter();
      this.f.addAction("fi.polar.polarflow.service.bluetooth.action.HOST_CONNECT_FAILED");
      this.a(0);
      this.k = (new fi.polar.polarflow.service.bluetooth.l(this)).a();
      if (this.m == null) {
         this.m = android.support.v4.c.g.a(this);
      }

      if (this.n == null) {
         this.n = (new Builder(this)).addApi(Wearable.API).build();
      }

      this.l = false;
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      if (var1 == 265) {
         fi.polar.polarflow.ui.o.a((Context)this.getApplicationContext(), 30);
         this.setResult(-1, (new b()).a(true).a());
         this.e();
      } else {
         var3 = super.onKeyDown(var1, var2);
      }

      return var3;
   }

   protected void onPause() {
      if (this.l) {
         this.l = false;
         this.unregisterReceiver(this.a);
         this.m.a(this.a);
      }

      this.f();
      super.onPause();
   }

   protected void onRestart() {
      super.onRestart();
      DialogFragment var1 = this.a("enable_bluetooth_dialog");
      if (var1 != null) {
         var1.dismiss();
      }

   }

   protected void onResume() {
      super.onResume();
      if (!this.l) {
         this.l = true;
         this.registerReceiver(this.a, this.e);
         this.m.a(this.a, this.f);
      }

      if (this.c()) {
         this.d();
      } else {
         this.a(0);
         this.f();
         if (this.a("enable_bluetooth_dialog") == null) {
            this.b();
         }
      }

   }

   protected void onStart() {
      super.onStart();
      fi.polar.polarflow.util.d.c(b, "onStart()");
      this.n.connect();
   }

   protected void onStop() {
      fi.polar.polarflow.util.d.c(b, "onStop()");
      this.n.disconnect();
      super.onStop();
   }
}
