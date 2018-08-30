package fi.polar.polarflow.ui.exeview.target;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.ExerciseTarget;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.exeview.x;
import java.util.Collection;

public class d extends x implements fi.polar.polarflow.ui.exeview.h {
   protected final Handler a = new Handler();
   protected final Runnable b = new e(this);
   private TextView c;

   public static d a(String var0, int var1, boolean var2) {
      d var3 = new d();
      Bundle var4 = new Bundle();
      var4.putString("target", var0);
      var4.putBoolean("polar_button_enabled", true);
      var4.putInt("unitSystem", var1);
      var4.putBoolean("targetDoubled", var2);
      var3.setArguments(var4);
      return var3;
   }

   // $FF: synthetic method
   static boolean a(d var0) {
      return var0.d();
   }

   public void a(Collection var1) {
   }

   public void a_(Bundle var1) {
      if (this.c != null) {
         this.c.setBackgroundColor(-16777216);
      }

   }

   protected boolean c() {
      fi.polar.polarflow.ui.o.a((Context)this.getActivity(), 30);
      this.dismiss();
      return false;
   }

   public void d_() {
      if (this.c != null && this.getContext() != null) {
         this.c.setBackgroundColor(this.getContext().getColor(2131624058));
      }

   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setStyle(0, 2131427607);
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      TrainingSessionTarget var7 = TrainingSessionTarget.getTrainingTargetForPath(this.getArguments().getString("target"));
      int var4 = this.getArguments().getInt("unitSystem");
      View var6;
      if (var7 != null && var7.getExerciseTarget() != null) {
         ExerciseTarget var5 = var7.getExerciseTarget();
         var6 = var1.inflate(2130968796, var2);
         this.c = (TextView)var6.findViewById(2131755533);
         if (this.getActivity() instanceof android.support.wearable.activity.a && ((android.support.wearable.activity.a)this.getActivity()).b()) {
            this.c.setBackgroundColor(-16777216);
         }

         if (this.getArguments().getBoolean("targetDoubled")) {
            this.c.setText(this.getContext().getString(2131230826));
         } else {
            switch(var7.getExerciseTarget().getVolumeTargetType()) {
            case 0:
               this.c.setText(this.getContext().getString(2131230827, new Object[]{fi.polar.polarflow.ui.o.a(var5.getVolumeTargetDuration())}));
               break;
            case 1:
               if (var4 == 2) {
                  this.c.setText(this.getContext().getString(2131230825, new Object[]{fi.polar.polarflow.ui.o.b(var5.getVolumeTargetDistance())}));
               } else {
                  this.c.setText(this.getContext().getString(2131230824, new Object[]{fi.polar.polarflow.ui.o.a(var5.getVolumeTargetDistance())}));
               }
               break;
            case 2:
               if (var4 == 2) {
                  this.c.setText(this.getContext().getString(2131230822, new Object[]{fi.polar.polarflow.ui.o.d(this.getContext(), var5.getVolumeTargetCalories())}));
               } else {
                  this.c.setText(this.getContext().getString(2131230823, new Object[]{fi.polar.polarflow.ui.o.d(this.getContext(), var5.getVolumeTargetCalories())}));
               }
            }
         }

         var6.setOnClickListener(new f(this));
         this.a.postDelayed(this.b, fi.polar.polarflow.util.b.m);
      } else {
         var6 = null;
      }

      return var6;
   }

   public void onDismiss(DialogInterface var1) {
      this.a.removeCallbacks(this.b);
      super.onDismiss(var1);
   }
}
