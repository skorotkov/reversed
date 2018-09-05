package fi.polar.polarflow.ui.exeview.target.a_package;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;

import java.util.Collection;

public class c extends ah {
   protected TextView a;
   protected TextView c;
   protected TextView d;
   private Context e;
   private float f = 0.0F;
   private float g = -1.0F;
   private int h;
   private float i;
   private int j;

   private void a(TextView var1) {
      int var2;
      if (this.n()) {
         this.j = fi.polar.polarflow.util.u.a().k();
         if (this.j == 0) {
            var2 = 2131230861;
         } else {
            var2 = 2131230943;
         }
      } else if (this.p() == 2) {
         var2 = 2131231098;
      } else {
         var2 = 2131230860;
      }

      var1.setText(this.e.getString(var2));
   }

   private void a(String var1, String var2, TextView var3) {
      int var4 = var1.length() + var2.length();
      if (var4 != this.h) {
         int var5 = this.d.getPaddingBottom();
         int var6 = fi.polar.polarflow.ui.exeview.target.k.a((int)(1.3D * (double)var1.length()) + var2.length());
         float var7 = this.e.getResources().getDimension(var6);
         if (var3.getTextSize() != (float)((int)var7) || this.h == -1) {
            var3.setTextSize(0, (float)((int)var7));
            var5 = fi.polar.polarflow.ui.exeview.target.k.a(this.e, var6);
         }

         if (var1.length() < 4) {
            var7 = this.e.getResources().getDimension(2131362171);
         } else {
            var7 = this.e.getResources().getDimension(2131362173);
         }

         if (this.a.getTextSize() != var7) {
            this.a.setTextSize(0, var7);
         }

         this.h = var4;
         this.d.setPadding(this.d.getPaddingLeft(), this.d.getPaddingTop(), this.g(), var5);
      }

   }

   private void b(Intent var1) {
      if (var1 != null && var1.getAction().equals("fi.polar.polarflow.ACTION_LOCATION_DATA")) {
         if (var1.getStringExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE").equals("fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR")) {
            this.f = var1.getFloatExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE", 0.0F);
         }

         this.a(this.f);
      } else if (var1 != null && "SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA".equals(var1.getAction())) {
         this.f = var1.getFloatExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_DISTANCE", 0.0F);
         this.a(this.f);
      }

   }

   private void e() {
      if (this.g == -1.0F) {
         this.g = this.Q.getTrainingSessionTarget().getExerciseTarget().getVolumeTargetDistance();
      }

   }

   private void f() {
      if (this.Q.isRunning()) {
         this.f = this.Q.getTotalDistance();
         this.a(this.f);
      }

   }

   private int g() {
      int var1 = (int)(this.i - fi.polar.polarflow.ui.exeview.target.k.a(this.a, this.c, this.d)) / 2;
      if (var1 <= 0) {
         var1 = this.d.getPaddingRight();
      }

      return var1;
   }

   public int a() {
      return 2130968691;
   }

   public void a(float var1) {
      this.f = var1;
      if (this.f < 0.0F) {
         this.f = 0.0F;
      }

      String var2;
      String var3;
      if (this.n()) {
         if (this.j == 0) {
            var2 = a_DataTypes.a_roundAndToString(17, (double)this.f);
            var3 = a_DataTypes.a_roundAndToString(18, (double)this.g);
         } else {
            var2 = a_DataTypes.a_roundAndToString(17, (double)fi.polar.polarflow.ui.o.e(this.f));
            var3 = a_DataTypes.a_roundAndToString(18, (double)fi.polar.polarflow.ui.o.e(this.g));
         }
      } else {
         var2 = fi.polar.polarflow.ui.o.a(this.p(), this.f);
         var3 = fi.polar.polarflow.ui.o.a(this.p(), this.g);
      }

      if (var2 != null && var3 != null) {
         String var4;
         String var5;
         label27: {
            if (var2.length() <= 6) {
               var4 = var3;
               var5 = var2;
               if (var3.length() <= 6) {
                  break label27;
               }
            }

            var5 = var2.substring(0, var2.length() - 3);
            var4 = var3.substring(0, var3.length() - 3);
         }

         var3 = " / " + var4;
         this.a.setText(var5);
         if (!var3.equals(this.c.getText())) {
            this.c.setText(var3);
         }

         this.a(var5, var3, this.c);
      }

   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.e = var1.getContext();
      this.h = -1;
      this.i = (float)this.e.getResources().getDisplayMetrics().widthPixels;
      this.a = (TextView)var1.findViewById(2131755352);
      this.c = (TextView)var1.findViewById(2131755351);
      this.d = (TextView)var1.findViewById(2131755350);
      this.a(this.d);
      this.e();
   }

   public void a(Collection var1) {
      this.b(e(var1, "fi.polar.polarflow.ACTION_LOCATION_DATA"));
   }

   public void d() {
      this.f();
   }
}
