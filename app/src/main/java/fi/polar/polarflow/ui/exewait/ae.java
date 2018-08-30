package fi.polar.polarflow.ui.exewait;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import fi.polar.polarflow.data.orm.ExerciseTarget;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

class ae implements fi.polar.polarflow.ui.u {
   private static final String a = ae.class.getSimpleName();
   private int b = 0;
   private List c;
   private View d;
   private final Activity e;
   private Context f;
   private FragmentManager g;
   private DialogFragment h;
   private ag i;
   private boolean j = false;
   private TrainingSessionTarget k = null;
   private final OnClickListener l = new af(this);

   public ae(Activity var1) {
      this.e = var1;
   }

   private void a(TrainingSessionTarget var1) {
      this.k = var1;
      this.b(this.d);
      this.a(this.d);
      if (this.i != null) {
         this.i.a();
      }

   }

   private void a(PolarGlyphView var1, int var2) {
      var1.setGlyph(var1.getResources().getString(var2));
   }

   // $FF: synthetic method
   static void a(ae var0) {
      var0.e();
   }

   private static List b(List var0) {
      DateTime var1 = DateTime.now().withTimeAtStartOfDay();
      ArrayList var2 = new ArrayList();
      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         TrainingSessionTarget var4 = (TrainingSessionTarget)var3.next();
         if (var4.getStartTime() >= var1.getMillis() && var4.getStartTime() < var1.plusDays(1).getMillis()) {
            var2.add(var4);
         }
      }

      return var2;
   }

   private void c(View var1) {
      if (var1 != null) {
         PolarGlyphView var3 = (PolarGlyphView)var1.findViewById(2131755212);
         if (this.k != null) {
            ExerciseTarget var2 = this.k.getExerciseTarget();
            if (var2 != null) {
               if (var2.getTargetType() == 1) {
                  switch(var2.getVolumeTargetType()) {
                  case 0:
                     this.a(var3, 2131231132);
                     break;
                  case 1:
                     this.a(var3, 2131231130);
                     break;
                  case 2:
                     this.a(var3, 2131231126);
                     break;
                  default:
                     this.a(var3, 2131231136);
                     fi.polar.polarflow.util.d.b(a, "Invalid volume target type!");
                  }
               } else if (var2.getTargetType() == 2) {
                  this.a(var3, 2131231143);
               } else {
                  this.a(var3, 2131231136);
               }
            }
         }
      }

   }

   private void c(String var1) {
      DialogFragment var2 = this.b(var1);
      if (var2 != null) {
         var2.dismiss();
      }

   }

   private fi.polar.polarflow.ui.q d(String var1) {
      Object var2;
      if (this.h != null) {
         var2 = (fi.polar.polarflow.ui.q)this.h;
      } else {
         var2 = (new fi.polar.polarflow.ui.t()).b(var1).b(true).a(true).c();
      }

      return (fi.polar.polarflow.ui.q)var2;
   }

   private w e(String var1) {
      w var2;
      if (this.h != null) {
         var2 = (w)this.h;
      } else {
         var2 = w.a(var1);
      }

      return var2;
   }

   private void e() {
      fi.polar.polarflow.util.d.c(a, "targetViewOnClick()");
      this.g();
   }

   private void f() {
      if (this.c != null && this.b < this.c.size() && (this.b("enable_target_mode_dialog") == null || this.b > 0)) {
         TrainingSessionTarget var1 = (TrainingSessionTarget)this.c.get(this.b);
         fi.polar.polarflow.ui.q var2 = this.d(this.h().getString(2131230927, new Object[]{var1.getName(), fi.polar.polarflow.ui.o.a(this.h(), var1.getStartTime(), "HH:mm", "h:mm a")}));
         var2.a((fi.polar.polarflow.ui.u)this);
         var2.show(this.i(), "enable_target_mode_dialog");
      }

   }

   private void g() {
      if (this.k != null && TrainingSessionTarget.getTrainingTargetForPath(this.k.getPath()) != null) {
         DialogFragment var1 = this.b("show_target_details_dialog");
         if (var1 != null) {
            var1.dismiss();
         }

         this.e(this.k.getPath()).show(this.i(), "show_target_details_dialog");
      }

   }

   private Context h() {
      Object var1;
      if (this.f != null) {
         var1 = this.f;
      } else {
         var1 = this.e;
      }

      return (Context)var1;
   }

   private FragmentManager i() {
      FragmentManager var1 = null;
      if (this.g != null) {
         var1 = this.g;
      } else if (this.e != null) {
         var1 = this.e.getFragmentManager();
      }

      return var1;
   }

   public void a(Intent var1) {
      if (var1 != null && this.k != null) {
         var1.putExtra("TrainingService.extra.TRAINING_TARGET_PATH", this.k.getPath());
      }

   }

   public void a(View var1) {
      fi.polar.polarflow.util.d.c(a, "setOnClickListener()");
      if (var1 != null) {
         if (this.k != null) {
            var1.setOnClickListener(this.l);
         } else {
            var1.setOnClickListener((OnClickListener)null);
         }
      }

   }

   public void a(ag var1) {
      this.i = var1;
   }

   public void a(fi.polar.polarflow.ui.q var1) {
      if ("enable_target_mode_dialog".equals(var1.a())) {
         this.j = true;
         if (this.c != null) {
            this.a((TrainingSessionTarget)this.c.get(this.b));
         }
      }

   }

   public void a(String var1) {
      this.k = TrainingSessionTarget.getTrainingTargetForPath(var1);
   }

   public void a(List var1) {
      if (!this.j && !this.a()) {
         if (this.c == null) {
            if (var1 != null) {
               this.c = b(var1);
            } else {
               fi.polar.polarflow.util.d.e(a, "showActivateTargetModeDialog() - currentDayTrainingTargets is NULL");
               this.c = TrainingSessionTarget.getCurrentDayTrainingTargets(false);
            }

            this.b = 0;
         }

         this.f();
      }

   }

   public boolean a() {
      boolean var1;
      if (this.k != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   DialogFragment b(String var1) {
      return (DialogFragment)this.i().findFragmentByTag(var1);
   }

   public void b() {
      this.c("enable_target_mode_dialog");
      this.c("show_target_details_dialog");
      this.j = false;
   }

   public void b(View var1) {
      this.d = var1;
      if (var1 != null) {
         byte var2;
         if (this.a()) {
            var2 = 0;
         } else {
            var2 = 4;
         }

         var1.setVisibility(var2);
         this.c(var1);
      }

   }

   public void b(fi.polar.polarflow.ui.q var1) {
      if ("enable_target_mode_dialog".equals(var1.a())) {
         ++this.b;
         if (this.c != null && this.b < this.c.size()) {
            this.f();
         } else {
            this.j = true;
            this.c = null;
         }
      }

   }

   public long c() {
      long var1 = -2L;
      long var3 = var1;
      if (this.k != null) {
         var3 = var1;
         if (this.k.getExerciseTarget() != null) {
            var3 = this.k.getExerciseTarget().getSportId();
         }
      }

      return var3;
   }

   public void c(fi.polar.polarflow.ui.q var1) {
   }

   TrainingSessionTarget d() {
      return this.k;
   }

   public void d(fi.polar.polarflow.ui.q var1) {
      fi.polar.polarflow.ui.o.a((Context)this.h(), 30);
      this.a(var1);
      var1.dismiss();
   }

   void e(fi.polar.polarflow.ui.q var1) {
      if (this.c != null && this.c.size() != 0) {
         String var2 = ((TrainingSessionTarget)this.c.get(this.b)).getPath();
         List var3 = v.d();
         var3.addAll(m.d());
         Iterator var5 = var3.iterator();

         boolean var4;
         while(true) {
            if (!var5.hasNext()) {
               var4 = true;
               break;
            }

            if (var2.equals(((TrainingSessionTarget)var5.next()).getPath())) {
               var4 = false;
               break;
            }
         }

         if (var4 && var1 != null) {
            this.b(var1);
            var1.dismiss();
         }
      }

   }
}
