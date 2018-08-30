package fi.polar.polarflow.ui.myday;

import android.animation.AnimatorInflater;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import fi.polar.polarflow.ui.custom.ballswirl.BallSwirlView;

public class DailyGoalReachedActivity extends Activity {
   private static final long[] a = new long[]{1200L, 40L, 30L, 40L, 30L, 40L, 1430L, 40L, 30L, 40L, 30L, 40L};
   private final Handler b = new Handler();
   private View c;
   private BallSwirlView d;
   private View e;
   private View f;
   private int g;
   private final Runnable h = new b(this);
   private final AnimationListener i = new c(this);
   private final OnClickListener j = new d(this);

   // $FF: synthetic method
   static AnimationListener a(DailyGoalReachedActivity var0) {
      return var0.i;
   }

   private void a(int var1) {
      this.g = var1;
      this.setResult(var1);
   }

   // $FF: synthetic method
   static void a(DailyGoalReachedActivity var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static long[] a() {
      return a;
   }

   private int b() {
      return this.g;
   }

   // $FF: synthetic method
   static View b(DailyGoalReachedActivity var0) {
      return var0.e;
   }

   private int c() {
      return (int)this.getIntent().getFloatExtra("DailyGoalReachedActivity.achieved_percentage", 100.0F);
   }

   // $FF: synthetic method
   static View c(DailyGoalReachedActivity var0) {
      return var0.f;
   }

   public void finish() {
      this.b.removeCallbacks(this.h);
      fi.polar.polarflow.ui.o.a((Context)this);
      Parcelable var1 = this.getIntent().getParcelableExtra("DailyGoalReachedActivity.result_receiver");
      if (var1 instanceof ResultReceiver) {
         ((ResultReceiver)var1).send(this.b(), (Bundle)null);
      }

      super.finish();
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.getWindow().addFlags(128);
      this.setContentView(2130968613);
      this.c = this.findViewById(2131755155);
      this.c.setOnClickListener(this.j);
      this.d = (BallSwirlView)this.findViewById(2131755156);
      this.e = this.findViewById(2131755157);
      this.f = this.findViewById(2131755159);
      ((TextView)this.findViewById(2131755158)).setText(String.valueOf(this.c()));
      this.g = 0;
   }

   public void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      if (var1) {
         ObjectAnimator var2 = (ObjectAnimator)AnimatorInflater.loadAnimator(this, 2131099649);
         var2.setEvaluator(new ArgbEvaluator());
         var2.setTarget(this.c);
         var2.start();
         this.d.a();
         this.b.postDelayed(this.h, 3700L);
      }

   }
}
