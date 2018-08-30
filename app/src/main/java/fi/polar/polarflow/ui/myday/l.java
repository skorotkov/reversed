package fi.polar.polarflow.ui.myday;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.activity.ConfirmationActivity;
import android.support.wearable.view.ActionPage;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import fi.polar.polarflow.service.datalayer.ar;
import fi.polar.polarflow.service.datalayer.as;

public class l extends a {
   private static final String a = l.class.getName();
   private fi.polar.polarflow.service.datalayer.u b;
   private final Handler c = new Handler();

   public l() {
      super(e.b);
   }

   private void a(ar var1) {
      as var2 = this.b.b(this.getActivity().getApplicationContext());
      var2.a(new n(this));
      var2.execute(new ar[]{var1});
   }

   // $FF: synthetic method
   static void a(l var0) {
      var0.c();
   }

   // $FF: synthetic method
   static void a(l var0, byte[] var1) {
      var0.a(var1);
   }

   private void a(byte[] var1) {
      this.a(new ar("/MESSAGE/LAUNCH_TRAINING_SUMMARY_ACTIVITY", var1));
   }

   // $FF: synthetic method
   static String b() {
      return a;
   }

   // $FF: synthetic method
   static void b(l var0, byte[] var1) {
      var0.b(var1);
   }

   private void b(byte[] var1) {
      this.a(new ar("/MESSAGE/LAUNCH_SLEEP_RESULT_ACTIVITY", var1));
   }

   private void c() {
      Intent var1 = new Intent(this.getActivity(), ConfirmationActivity.class);
      var1.putExtra("android.support.wearable.activity.extra.ANIMATION_TYPE", 2);
      this.startActivity(var1);
      MyDayGridPager var2 = this.d();
      if (var2 != null) {
         this.c.postDelayed(new o(this, var2), 500L);
      }

   }

   private MyDayGridPager d() {
      boolean var1 = false;
      MyDayGridPager var2 = null;
      ViewParent var3 = this.getView().getParent();

      while(!var1 && var3 != null) {
         if (var3 instanceof MyDayGridPager) {
            var2 = (MyDayGridPager)var3;
            var1 = true;
         } else {
            var3 = var3.getParent();
         }
      }

      return var2;
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.b = new fi.polar.polarflow.service.datalayer.u();
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130968732, var2, false);
   }

   public void onStop() {
      super.onStop();
      this.c.removeCallbacksAndMessages((Object)null);
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      ((ActionPage)var1.findViewById(2131755439)).setOnClickListener(new m(this));
   }
}
