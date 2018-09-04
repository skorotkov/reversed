package fi.polar.polarflow.ui.myday.item.a_package;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.DailySummary;
import fi.polar.polarflow.data.orm.Preferences;
import fi.polar.polarflow.ui.o;

class a extends fi.polar.polarflow.ui.myday.item.b {
   private ProgressBar a;
   private TextView c;
   private TextView d;
   private TextView e;
   private TextView f;
   private TextView g;
   private TextView h;
   private Context i;

   private String a(int var1) {
      var1 = fi.polar.polarflow.a_package.a.a(7, var1);
      return o.d(this.i, var1);
   }

   private String a(int var1, float var2) {
      String var3 = o.a(var1, fi.polar.polarflow.a_package.a.a(1, var2));
      String var4 = var3;
      if (o.a(var3).length() == 4) {
         var4 = var3.substring(0, var3.length() - 1);
      }

      return var4;
   }

   private void a(DailySummary var1) {
      byte var2 = 0;
      int var3 = 0;
      if (this.c()) {
         float var4 = 0.0F;
         float var5 = 0.0F;
         int var6 = Preferences.getUserUnitSystem();
         int var9;
         int var10;
         if (var1 != null) {
            int var11;
            if (var1.getAchievedPercentage() != -1.0F) {
               var11 = (int)var1.getAchievedPercentage();
            } else {
               var11 = 0;
            }

            int var7;
            if (var1.getSteps() != -1) {
               var7 = var1.getSteps();
            } else {
               var7 = 0;
            }

            if (var1.getActivityDistance() != -1.0F) {
               var5 = var1.getActivityDistance();
            }

            if (var1.getActivityCalories() != -1) {
               var3 = 0 + var1.getActivityCalories();
            }

            int var8 = var3;
            if (var1.getTrainingCalories() != -1) {
               var8 = var3 + var1.getTrainingCalories();
            }

            var9 = var11;
            var3 = var8;
            var10 = var7;
            var4 = var5;
            if (var1.getBmrCalories() != -1) {
               var3 = var8 + var1.getBmrCalories();
               var4 = var5;
               var10 = var7;
               var9 = var11;
            }
         } else {
            var10 = 0;
            var9 = 0;
            var3 = var2;
         }

         this.a.setProgress(var9);
         this.c.setText(String.valueOf(var9));
         this.d.setText(String.valueOf(var10));
         this.e.setText(this.a(var6, var4));
         this.f.setText(o.c(var6));
         this.g.setText(this.a(var3));
         this.h.setText(o.d(var6));
      }

   }

   private void b(Intent var1) {
      if (var1 != null && "DailyActivityService.action.DAILY_ACTIVITY_STATUS".equals(var1.getAction())) {
         Parcelable var2 = var1.getParcelableExtra("DailyActivityService.extra.DAILY_SUMMARY");
         if (var2 instanceof DailySummary) {
            this.a((DailySummary)var2);
         }
      }

   }

   public int a() {
      return 2130968712;
   }

   public void a(Intent var1) {
      super.a(var1);
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.i = var1.getContext();
      this.a = (ProgressBar)var1.findViewById(2131755395);
      this.c = (TextView)var1.findViewById(2131755394);
      this.d = (TextView)var1.findViewById(2131755396);
      this.e = (TextView)var1.findViewById(2131755408);
      this.f = (TextView)var1.findViewById(2131755409);
      this.g = (TextView)var1.findViewById(2131755405);
      this.h = (TextView)var1.findViewById(2131755406);
   }

   public void d() {
      super.d();
      this.b(this.a((String)"DailyActivityService.action.DAILY_ACTIVITY_STATUS"));
   }
}
