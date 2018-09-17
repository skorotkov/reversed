package fi.polar.polarflow.ui.exeview.target.a_package;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;

import fi.polar.polarflow.calculators.j_ExercisePhaseCalc;
import fi.polar.polarflow.data.orm.ExercisePhase;
import fi.polar.polarflow.data.orm.ExercisePhaseData;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.Collection;

public class h extends ah {
   private static final String U = h.class.getSimpleName();
   protected int R = -1;
   protected int S = -1;
   protected int T = 0;
   protected Context a;
   protected final ExercisePhase c;
   protected ExercisePhaseData d;
   protected final int e;
   protected final int f;
   protected LinearLayout g;
   protected TextView h;
   protected TextView i;
   protected TextView j;
   protected TextView k;
   protected PolarGlyphView l;
   protected View m;
   protected int[] n = null;

   public h(ExercisePhase var1, int var2, int var3) {
      this.c = var1;
      this.e = var2;
      this.f = var3;
   }

   private int a(int var1) {
      if (var1 - 1 >= 0 && var1 - 1 <= 4) {
         --var1;
      } else {
         var1 = -1;
      }

      return var1;
   }

   private void a(int var1, boolean var2) {
      if (this.c.getIntensityType() == 1 && this.R != -1) {
         if (this.R == this.S) {
            this.k.setText(this.a.getResources().getString(2131230830, new Object[]{this.R + 1}));
            if (!var2) {
               var1 = this.c(this.R);
            }
         } else {
            String var3 = this.a.getResources().getString(2131230828, new Object[]{this.R + 1, this.S + 1});
            if (!var2) {
               int var4 = var3.indexOf(String.valueOf(this.R + 1));
               int var5 = var3.indexOf(String.valueOf(this.S + 1));
               SpannableString var6 = new SpannableString(var3);
               var6.setSpan(new ForegroundColorSpan(this.c(this.R)), var4, var4 + 1, 0);
               var6.setSpan(new ForegroundColorSpan(this.c(this.S)), var5, var5 + 1, 0);
               this.k.setText(var6, BufferType.SPANNABLE);
            } else {
               this.k.setText(var3);
            }
         }
      } else {
         this.k.setText(this.a.getResources().getString(2131230829));
      }

      this.k.setTextColor(var1);
   }

   // $FF: synthetic method
   static void a(Context var0, int var1) {
      b(var0, var1);
   }

   private void b(int var1) {
      String var2 = null;
      switch(this.c.getGoalType()) {
      case 1:
         long var3;
         if (this.d != null) {
            var3 = this.d.getDuration();
         } else {
            var3 = this.c.getGoalDuration();
         }

         var2 = fi.polar.polarflow.ui.o.a(var3);
         break;
      case 2:
         float var5;
         if (this.d != null) {
            var5 = this.d.getDistance();
         } else {
            var5 = this.c.getGoalDistance();
         }

         var2 = fi.polar.polarflow.ui.o.a(this.p(), var5) + " " + this.a.getString(fi.polar.polarflow.ui.o.c(this.p()));
         break;
      default:
         fi.polar.polarflow.util.d.b(U, "Unsupported goal type");
      }

      this.j.setText(var2);
      this.j.setTextColor(var1);
   }

   private static void b(Context var0, int var1) {
      fi.polar.polarflow.util.d.c(U, "Skip phase, sequence number: " + var1);
      Intent var2 = new Intent(var0, j_ExercisePhaseCalc.class);
      var2.setAction("ExercisePhaseCalc.ACTION_SKIP_TO_NEXT_PHASE");
      var2.putExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", var1);
      android.support.v4.c.g.a(var0).a(var2);
   }

   private int c(int var1) {
      if (this.n != null && var1 < this.n.length) {
         var1 = this.n[var1];
      } else {
         var1 = -1;
      }

      return var1;
   }

   private void e() {
      if (this.c != null) {
         boolean var1;
         if (this.Q.getTrainingPhase().getNumber() > this.e) {
            var1 = true;
         } else {
            var1 = false;
         }

         int var2 = this.a.getResources().getColor(2131624133, this.a.getTheme());
         if (var1) {
            if (this.d == null) {
               this.d = this.Q.getCurrentExercisePhaseStats().clonePhaseDataListItem(this.e - 1);
            }

            if (this.d.getPhaseFinished() == 1) {
               this.l.setGlyph(this.a.getResources().getString(2131231127));
               this.l.setGlyphColor(this.a.getColor(2131624135));
            } else {
               this.l.setGlyph(this.a.getResources().getString(2131231128));
               this.l.setGlyphColor(this.a.getColor(2131624137));
            }

            this.l.setVisibility(0);
            var2 = this.a.getResources().getColor(2131624131, this.a.getTheme());
         } else {
            this.l.setVisibility(4);
         }

         View var3 = this.m;
         byte var4;
         if (this.e == this.Q.getTrainingPhase().getNumber()) {
            var4 = 0;
         } else {
            var4 = 4;
         }

         var3.setVisibility(var4);
         if (this.e <= this.Q.getTrainingPhase().getNumber()) {
            this.g.setBackgroundColor(-16777216);
         } else {
            this.g.setBackgroundColor(this.a.getResources().getColor(2131624132, this.a.getTheme()));
         }

         String var6 = this.c.getName();
         if (this.c.getTotalExecutionCount() > 1) {
            var6 = var6 + " ";
            String var5 = this.f + "/" + this.c.getTotalExecutionCount();
            this.i.setText(var5);
            this.i.setTextColor(var2);
            this.i.setVisibility(0);
            this.i.measure(0, 0);
            this.h.setMaxWidth(this.i.getRootView().getWidth() - this.i.getMeasuredWidth() - this.T);
         } else {
            this.i.setVisibility(4);
         }

         this.h.setText(var6);
         this.h.setTextColor(var2);
         this.b(var2);
         this.a(var2, var1);
      }

   }

   public int a() {
      return 2130968694;
   }

   public void a(Intent var1) {
      if ("ExercisePhaseCalc.ACTION_PHASE_FINISHED".equals(var1.getAction())) {
         int var2 = var1.getIntExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", -1);
         if (var2 != -1 && (this.e == var2 || this.e == var2 + 1)) {
            this.e();
         }
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a = var1.getContext();
      this.g = (LinearLayout)var1.findViewById(2131755359);
      this.h = (TextView)var1.findViewById(2131755360);
      this.i = (TextView)var1.findViewById(2131755361);
      this.j = (TextView)var1.findViewById(2131755366);
      this.k = (TextView)var1.findViewById(2131755367);
      this.l = (PolarGlyphView)var1.findViewById(2131755363);
      this.m = var1.findViewById(2131755364);
      this.m.setOnClickListener(new i(this));
      this.n = fi.polar.polarflow.ui.o.a(var1.getContext().getTheme());
      this.R = this.a(this.c.getIntensityZoneLower());
      this.S = this.a(this.c.getIntensityZoneUpper());
      this.T = (int)var1.getResources().getDimension(2131362155);
   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }
}
