package fi.polar.polarflow.ui.exewait;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.ExerciseTarget;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.custom.PolarGlyphView;

public class w extends fi.polar.polarflow.ui.g {
   private TrainingSessionTarget a;

   public static w a(String var0) {
      w var1 = new w();
      Bundle var2 = new Bundle();
      var2.putBoolean("polar_button_enabled", true);
      var2.putString("target", var0);
      var1.setArguments(var2);
      return var1;
   }

   private fi.polar.polarflow.ui.myday.item.e d() {
      ExerciseTarget var1 = this.a.getExerciseTarget();
      fi.polar.polarflow.ui.myday.item.e var2 = new fi.polar.polarflow.ui.myday.item.e(this.a.getStartTime());
      var2.d(this.a.getName());
      var2.a(-2L);
      if (Sport.isSwimmingSport(var1.getSportId())) {
         var2.d(fi.polar.polarflow.util.u.a().k());
      }

      var2.b(this.a.getExerciseTarget().getTargetType());
      if (this.a.getExerciseTarget().getTargetType() == 1) {
         var2.c(var1.getVolumeTargetType());
         switch(var1.getVolumeTargetType()) {
         case 0:
            var2.b(var1.getVolumeTargetDuration());
            break;
         case 1:
            var2.a(var1.getVolumeTargetDistance());
            break;
         case 2:
            var2.a(var1.getVolumeTargetCalories());
         }
      }

      return var2;
   }

   protected boolean c() {
      fi.polar.polarflow.ui.o.a((Context)this.getActivity(), 30);
      this.dismiss();
      return true;
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      this.a = TrainingSessionTarget.getTrainingTargetForPath(this.getArguments().getString("target"));
      View var4;
      if (this.a != null && this.a.getExerciseTarget() != null) {
         var4 = var1.inflate(2130968753, var2);
         fi.polar.polarflow.ui.myday.item.e var5 = this.d();
         var5.a(var4);
         var5.d();
         ((TextView)var4.findViewById(2131755480)).setText(this.a.getDescription());
         PolarGlyphView var6 = (PolarGlyphView)var4.findViewById(2131755199);
         if (var6.getText().length() == 0) {
            var6.setGlyph(this.getResources().getString(2131231136));
         }

         if (this.getDialog() != null && this.getDialog().getWindow() != null) {
            this.getDialog().getWindow().addFlags(128);
         }
      } else {
         var4 = null;
      }

      return var4;
   }
}
