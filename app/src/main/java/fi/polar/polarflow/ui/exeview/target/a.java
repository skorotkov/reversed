package fi.polar.polarflow.ui.exeview.target;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;

import fi.polar.polarflow.calculators.j_ExercisePhaseCalc;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.ExercisePhase;
import fi.polar.polarflow.ui.exeview.x;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import fi.polar.polarflow.ui.exeview.a_package.a_package.z;
import java.util.Collection;

public class a extends x implements fi.polar.polarflow.ui.exeview.h {
   private static final String c = a.class.getSimpleName();
   protected final Handler a = new Handler();
   protected final Runnable b = new b(this);
   private ExercisePhase d;
   private Training e;
   private boolean f = false;
   private ObjectAnimator g = null;
   private View h;

   private static int a(int var0) {
      if (var0 - 1 >= 0 && var0 - 1 <= 4) {
         --var0;
      } else {
         var0 = -1;
      }

      return var0;
   }

   private static int a(int[] var0, int var1) {
      if (var0 != null && var1 < var0.length) {
         var1 = var0[var1];
      } else {
         var1 = -1;
      }

      return var1;
   }

   // $FF: synthetic method
   static ObjectAnimator a(a var0) {
      return var0.g;
   }

   public static a a(int var0, boolean var1) {
      return a(var0, var1, (Training)null);
   }

   public static a a(int var0, boolean var1, Training var2) {
      a var3 = new a();
      Bundle var4 = new Bundle();
      var4.putInt("ended_phase", var0);
      var4.putBoolean("previous_phase_finished", var1);
      var4.putBoolean("polar_button_enabled", true);
      var3.setArguments(var4);
      if (var2 != null) {
         var3.e = var2;
      } else {
         var3.e = Training.getInstance();
      }

      return var3;
   }

   private static void a(View var0, float var1) {
      var0.setVisibility(0);
      fi.polar.polarflow.ui.exeview.target.a_package.b var2 = new fi.polar.polarflow.ui.exeview.target.a_package.b();
      Bundle var3 = new Bundle();
      var3.putFloat(ah.r, var1);
      var2.b(var3);
      var2.a(var0);
      var2.d();
   }

   private static void a(View var0, int var1, int var2, int var3) {
      Context var4 = var0.getContext();
      var2 = a(var2);
      var3 = a(var3);
      int[] var5 = fi.polar.polarflow.ui.o.a(var4.getTheme());
      TextView var6 = (TextView)var0.findViewById(2131755451);
      TextView var7 = (TextView)var0.findViewById(2131755452);
      if (var1 == 1 && var2 != -1) {
         String var8;
         if (var2 == var3) {
            var8 = var4.getResources().getString(2131230830, new Object[]{1});
            var6.setText(var8.substring(0, var8.length() - 2));
            var6.setTextColor(a(var5, var2));
            var7.setText(String.valueOf(var2 + 1));
            var7.setVisibility(0);
            var7.setTextColor(a(var5, var2));
         } else {
            var8 = var4.getResources().getString(2131230828, new Object[]{1, 1});
            var6.setText(var8.substring(0, var8.length() - 3));
            SpannableString var9 = new SpannableString(var2 + 1 + "-" + (var3 + 1));
            var9.setSpan(new ForegroundColorSpan(a(var5, var2)), 0, 1, 0);
            var9.setSpan(new ForegroundColorSpan(a(var5, var3)), 2, 3, 0);
            var7.setText(var9, BufferType.SPANNABLE);
            var7.setVisibility(0);
         }
      } else {
         var6.setText(var4.getResources().getString(2131230829));
      }

   }

   private static void a(View var0, long var1) {
      var0.setVisibility(0);
      z var3 = new z();
      Bundle var4 = new Bundle();
      var4.putLong(ah.q, var1);
      var3.b(var4);
      var3.a(var0);
      var3.d();
   }

   // $FF: synthetic method
   static boolean b(a var0) {
      return var0.d();
   }

   // $FF: synthetic method
   static void c(a var0) {
      var0.e();
   }

   private void e() {
      if (this.d != null && this.d.getChangeType() == 0) {
         Intent var1 = new Intent(this.getContext(), j_ExercisePhaseCalc.class);
         var1.setAction("ExercisePhaseCalc.ACTION_START_PHASE");
         android.support.v4.c.g.a(this.getContext()).a(var1);
      }

   }

   public void a(Collection var1) {
   }

   public void a_(Bundle var1) {
      if (this.h != null) {
         this.h.setBackgroundColor(-16777216);
      }

   }

   protected boolean c() {
      fi.polar.polarflow.ui.o.a((Context)this.getActivity(), 30);
      if (this.g == null || !this.g.isRunning()) {
         this.a.removeCallbacks(this.b);
         this.e();
         this.dismiss();
      }

      return false;
   }

   public void d_() {
      if (this.h != null && this.getContext() != null) {
         this.h.setBackgroundColor(this.getContext().getColor(2131624058));
      }

   }

   public void onCancel(DialogInterface var1) {
      this.e();
      this.a.removeCallbacks(this.b);
      super.onCancel(var1);
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setStyle(0, 2131427610);
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      if (this.e == null) {
         this.e = Training.getInstance();
      }

      int var4 = this.getArguments().getInt("ended_phase") - 1;
      ExercisePhase var8;
      if (var4 >= 0) {
         var8 = this.e.getExercisePhase(var4);
      } else {
         var8 = null;
      }

      this.d = var8;
      var8 = this.e.getExercisePhase(this.getArguments().getInt("ended_phase"));
      View var6 = var1.inflate(2130968735, var2);
      if (var8 != null) {
         this.h = var6.findViewById(2131755444);
         if (this.getActivity() instanceof android.support.wearable.activity.a && ((android.support.wearable.activity.a)this.getActivity()).b()) {
            this.h.setBackgroundColor(-16777216);
         }

         TextView var7 = (TextView)var6.findViewById(2131755446);
         var7.setText(var8.getName());
         if (var8.getTotalExecutionCount() > 1) {
            var7 = (TextView)var6.findViewById(2131755447);
            int var5 = k.b(this.e, var8);
            var4 = var5;
            if (!this.getArguments().getBoolean("previous_phase_finished", true)) {
               var4 = var5;
               if (this.d != null) {
                  var4 = var5;
                  if (this.d.getGoalType() != 2) {
                     var4 = var5 + 1;
                  }
               }
            }

            var7.setText(var4 + "/" + var8.getTotalExecutionCount());
            var7.setVisibility(0);
         } else {
            var7.setMaxLines(2);
         }

         switch(var8.getGoalType()) {
         case 1:
            a(var6.findViewById(2131755448), var8.getGoalDuration());
            break;
         case 2:
            a(var6.findViewById(2131755449), var8.getGoalDistance());
         }

         a(var6.findViewById(2131755450), var8.getIntensityType(), var8.getIntensityZoneLower(), var8.getIntensityZoneUpper());
         if (this.d != null && this.d.getChangeType() == 0) {
            var6.findViewById(2131755445).setVisibility(0);
         } else {
            this.a.postDelayed(this.b, fi.polar.polarflow.util.b.m_5secsInMs);
         }

         var6.setOnClickListener(new c(this));
      }

      return var6;
   }

   public void onDismiss(DialogInterface var1) {
      this.a.removeCallbacks(this.b);
      super.onDismiss(var1);
   }

   public void onStart() {
      super.onStart();
      if (this.d != null && !this.f) {
         View var1 = this.getDialog().getWindow().getDecorView();
         View var2 = var1.findViewById(2131755444);
         ObjectAnimator var3 = ObjectAnimator.ofPropertyValuesHolder(var1.findViewById(2131755443), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{0.0F, 1.0F})});
         var3.setDuration(600L);
         var3.start();
         this.g = ObjectAnimator.ofPropertyValuesHolder(var2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{0.0F, 1.0F}), PropertyValuesHolder.ofFloat("scaleY", new float[]{0.0F, 1.0F})});
         this.g.setDuration(700L);
         this.g.start();
         this.f = true;
      }

   }
}
