package fi.polar.polarflow.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.ui.exeview.ExeViewActivity;
import fi.polar.polarflow.ui.exewait.ExeWaitActivity;

public class VoiceCommandsActivity extends Activity {
   private static final String a = VoiceCommandsActivity.class.getSimpleName();

   private long a(String var1) {
      long var2;
      if ("vnd.google.fitness.activity/biking".equals(var1)) {
         var2 = 2L;
      } else if ("vnd.google.fitness.activity/running".equals(var1)) {
         var2 = 1L;
      } else {
         var2 = -1L;
      }

      return var2;
   }

   private void a() {
      fi.polar.polarflow.util.d.c(a, "pauseTraining");
      o.b(this, "TrainingService.action.PAUSE_SESSION");
      this.a(ExeViewActivity.class);
   }

   private void a(long var1) {
      if (o.d(this.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") && o.d(this.getApplicationContext(), "android.permission.BODY_SENSORS")) {
         fi.polar.polarflow.util.d.c(a, "Start training " + var1);
         Intent var3 = new Intent("TrainingService.action.START_SESSION");
         var3.putExtra(SportProfile.KEY_SPORT_ID, var1);
         android.support.v4.c.g.a(this).b(var3);
         this.a(ExeViewActivity.class);
      } else {
         fi.polar.polarflow.util.d.c(a, "Start training. Permissions not granted, start Exe Wait");
         this.a(ExeWaitActivity.class);
      }

   }

   private void a(Class var1) {
      fi.polar.polarflow.util.d.c(a, "Starting activity " + var1.getSimpleName());
      this.startActivity(new Intent(this, var1));
   }

   protected void onCreate(Bundle var1) {
      String var2 = null;
      super.onCreate(var1);
      Intent var3 = this.getIntent();
      String var7;
      if (var3 != null) {
         var7 = var3.getAction();
      } else {
         var7 = null;
      }

      String var4;
      if (var3 != null) {
         var4 = var3.getType();
      } else {
         var4 = null;
      }

      if (var3 != null) {
         var2 = var3.getStringExtra("actionStatus");
      }

      fi.polar.polarflow.util.d.c(a, "Handle these: " + var7 + " " + var4 + " " + var2);
      if ("vnd.google.fitness.TRACK".equals(var7) && "CompletedActionStatus".equals(var2) && Training.getInstance().isRunning()) {
         this.a();
      } else if (fi.polar.polarflow.util.u.a().e() && "vnd.google.fitness.TRACK".equals(var7) && "ActiveActionStatus".equals(var2)) {
         long var5 = this.a(var4);
         if (Training.getInstance().isRunning()) {
            fi.polar.polarflow.util.d.c(a, "Training ongoing already");
         } else if (SportProfile.getSportProfileBySportId(var5, false) != null) {
            this.a(var5);
         } else {
            this.a(ExeWaitActivity.class);
         }
      } else {
         fi.polar.polarflow.util.d.c(a, "Not provisioned (" + fi.polar.polarflow.util.u.a().e() + ") or unsupported action status (" + var2 + ").");
         this.a(StartActivity.class);
      }

      this.finish();
   }
}
