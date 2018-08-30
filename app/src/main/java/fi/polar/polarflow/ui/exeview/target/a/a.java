package fi.polar.polarflow.ui.exeview.target.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import java.util.Collection;

public class a extends ah {
   protected TextView a;
   protected TextView c;
   protected TextView d;
   private Context e;
   private int f;
   private int g = -1;
   private float h;

   private void a(int var1) {
      String var2 = fi.polar.polarflow.ui.o.d(this.a.getContext(), var1);
      this.a.setText(var2);
      String var3 = " / " + fi.polar.polarflow.ui.o.d(this.c.getContext(), this.g);
      if (!var3.equals(this.c.getText())) {
         this.c.setText(var3);
      }

      this.a(var2, var3, this.c);
   }

   private void a(TextView var1) {
      int var2;
      if (this.p() == 2) {
         var2 = 2131230921;
      } else {
         var2 = 2131230922;
      }

      var1.setText(this.e.getString(var2));
   }

   private void a(String var1, String var2, TextView var3) {
      int var4 = var1.length() + var2.length();
      if (var4 != this.f) {
         int var5 = this.d.getPaddingBottom();
         int var6 = fi.polar.polarflow.ui.exeview.target.k.a((int)(1.3D * (double)var1.length()) + var2.length());
         float var7 = this.e.getResources().getDimension(var6);
         if (var3.getTextSize() != (float)((int)var7) || this.f == -1) {
            var3.setTextSize(0, (float)((int)var7));
            var5 = fi.polar.polarflow.ui.exeview.target.k.a(this.e, var6);
         }

         if (var1.length() < 5) {
            var7 = this.e.getResources().getDimension(2131362171);
         } else {
            var7 = this.e.getResources().getDimension(2131362173);
         }

         if (this.a.getTextSize() != var7) {
            this.a.setTextSize(0, var7);
         }

         this.f = var4;
         this.d.setPadding(this.d.getPaddingLeft(), this.d.getPaddingTop(), this.f(), var5);
      }

   }

   private void b(Intent var1) {
      if (var1 != null && "DailyActivityService.action.TRAINING_LOAD_DATA".equals(var1.getAction())) {
         this.a(var1.getIntExtra("DailyActivityService.extra.TOTAL_CALORIES", -1));
      }

   }

   private void e() {
      if (this.g == -1 && this.Q.getTrainingSessionTarget() != null) {
         this.g = this.Q.getTrainingSessionTarget().getExerciseTarget().getVolumeTargetCalories();
      }

   }

   private int f() {
      int var1 = (int)(this.h - fi.polar.polarflow.ui.exeview.target.k.a(this.a, this.c, this.d)) / 2;
      if (var1 <= 0) {
         var1 = this.d.getPaddingRight();
      }

      return var1;
   }

   public int a() {
      return 2130968690;
   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.e = var1.getContext();
      this.f = -1;
      this.h = (float)this.e.getResources().getDisplayMetrics().widthPixels;
      this.a = (TextView)var1.findViewById(2131755352);
      this.c = (TextView)var1.findViewById(2131755351);
      this.d = (TextView)var1.findViewById(2131755350);
      this.a(this.d);
      this.e();
   }

   public void a(Collection var1) {
      this.b(e(var1, "DailyActivityService.action.TRAINING_LOAD_DATA"));
   }

   public void d() {
      Intent var1 = this.a((String)"DailyActivityService.action.TRAINING_LOAD_DATA");
      if (var1 != null) {
         this.b(var1);
      } else {
         this.a(0);
      }

   }
}
