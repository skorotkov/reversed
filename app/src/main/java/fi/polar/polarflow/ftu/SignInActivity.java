package fi.polar.polarflow.ftu;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.wearable.activity.ConfirmationActivity;
import android.widget.LinearLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.wearable.intent.RemoteIntent;
import fi.polar.polarflow.service.datalayer.ar;
import fi.polar.polarflow.service.datalayer.as;
import fi.polar.polarflow.ui.MainMenuActivity;
import fi.polar.polarflow.ui.NotificationReceiver;
import fi.polar.polarflow.util.u;
import fi.polar.polarflow.util.y;

public class SignInActivity extends Activity implements ConnectionCallbacks, OnConnectionFailedListener, CapabilityListener {
   private static final String b = SignInActivity.class.getSimpleName();
   private static final Uri c = Uri.parse("http://play.google.com/store/apps/details?id=fi.polar.polarflow");
   private static final Uri d = Uri.parse("https://itunes.apple.com/app/polar-flow-activity-sports/id717172678");
   protected GoogleApiClient a;
   private fi.polar.polarflow.service.f e;
   private IntentFilter f;
   private boolean g;
   private CapabilityApi h;
   private n i;
   private final BroadcastReceiver j;

   public SignInActivity() {
      this.h = Wearable.CapabilityApi;
      this.j = new l(this);
   }

   // $FF: synthetic method
   static n a(SignInActivity var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static String a() {
      return b;
   }

   private void a(Context var1) {
      ar var2 = new ar("/MESSAGE/LAUNCH_LOGIN_ACTIVITY", (byte[])null);
      (new as(var1, new m(this, var1))).execute(new ar[]{var2});
   }

   // $FF: synthetic method
   static void a(SignInActivity var0, Context var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(SignInActivity var0, n var1) {
      var0.a(var1);
   }

   private void a(n var1) {
      if (var1 != this.i) {
         this.i = var1;
         LinearLayout var2 = (LinearLayout)this.findViewById(2131755219);
         if (!y.f(this) && this.i == n.c) {
            var2.setVisibility(8);
         } else {
            var2.setVisibility(0);
            var2.setOnClickListener(new j(this));
         }
      }

   }

   private void b() {
      if (this.a.isConnected()) {
         this.h.getCapability(this.a, "mobile_host", 0).setResultCallback(new k(this));
      }

   }

   // $FF: synthetic method
   static void b(SignInActivity var0) {
      var0.e();
   }

   private void c() {
      this.startActivity(new Intent(this, MainMenuActivity.class));
      NotificationReceiver.a(this, 3);
      this.finish();
   }

   // $FF: synthetic method
   static void c(SignInActivity var0) {
      var0.f();
   }

   private void d() {
      Intent var1 = new Intent(this, GridAnimationActivity.class);
      var1.putExtra(GridAnimationActivity.a, fi.polar.polarflow.ftu.g.c);
      this.startActivity(var1);
      this.finish();
   }

   // $FF: synthetic method
   static void d(SignInActivity var0) {
      var0.g();
   }

   private void e() {
      Intent var1 = new Intent(this, GridAnimationActivity.class);
      var1.putExtra(GridAnimationActivity.a, fi.polar.polarflow.ftu.g.b);
      this.startActivity(var1);
   }

   // $FF: synthetic method
   static void e(SignInActivity var0) {
      var0.d();
   }

   private void f() {
      Intent var1 = new Intent("android.intent.action.VIEW");
      Uri var2;
      if (y.f(this)) {
         var2 = c;
      } else {
         var2 = d;
      }

      RemoteIntent.startRemoteActivity(this, var1.setData(var2).addCategory("android.intent.category.BROWSABLE"), (ResultReceiver)null);
   }

   private void g() {
      Intent var1 = new Intent(this, ConfirmationActivity.class);
      var1.putExtra("android.support.wearable.activity.extra.ANIMATION_TYPE", 2);
      this.startActivity(var1);
   }

   public void onCapabilityChanged(CapabilityInfo var1) {
      n var2;
      if (!var1.getNodes().isEmpty()) {
         var2 = n.c;
      } else {
         var2 = n.b;
      }

      this.a(var2);
   }

   public void onConnected(Bundle var1) {
      this.h.addCapabilityListener(this.a, this, "mobile_host");
      this.b();
   }

   public void onConnectionFailed(ConnectionResult var1) {
      fi.polar.polarflow.util.d.e(b, "onConnectionFailed(connectionResult=" + var1 + ")");
   }

   public void onConnectionSuspended(int var1) {
      fi.polar.polarflow.util.d.c(b, "onConnectionSuspended(reason=" + var1 + ")");
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968642);
      this.e = new fi.polar.polarflow.service.f(this);
      this.f = new IntentFilter();
      this.f.addAction("fi.polar.polarflow.ACTION_FTU_STARTED");
      this.f.addAction("fi.polar.polarflow.action.INITIALIZED");
      this.a = (new Builder(this)).addApi(Wearable.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
      this.i = n.a;
      this.g = false;
   }

   protected void onResume() {
      super.onResume();
      if (this.i == n.a || !y.f(this)) {
         n var1;
         if (u.a().d()) {
            var1 = n.c;
         } else {
            var1 = n.b;
         }

         this.a(var1);
      }

      FtuEventReceiver.a(this);
   }

   protected void onStart() {
      super.onStart();
      if (u.a().e()) {
         fi.polar.polarflow.util.d.c(b, "Provisioned in background, go to main menu");
         this.c();
      } else if (o.a()) {
         this.d();
      } else {
         this.g = true;
         this.e.a();
         this.registerReceiver(this.j, this.f);
         if (y.f(this) && this.a != null) {
            this.a.connect();
         }
      }

   }

   protected void onStop() {
      if (this.g) {
         this.g = false;
         this.e.b();
         this.unregisterReceiver(this.j);
         this.h.removeCapabilityListener(this.a, this, "mobile_host");
         this.a.disconnect();
      }

      super.onStop();
   }
}
