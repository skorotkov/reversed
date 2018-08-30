package fi.polar.polarflow.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.ftu.GridAnimationActivity;
import fi.polar.polarflow.ftu.SignInActivity;
import fi.polar.polarflow.ui.exeview.ExeViewActivity;

public class StartActivity extends Activity {
   private void a(Class var1) {
      boolean var2 = false;
      Intent var4 = new Intent(this, var1);
      boolean var3 = var2;
      if (this.getIntent() != null) {
         var3 = var2;
         if (this.getIntent().getBooleanExtra("fi.polar.polarflow.extra.STARTED_FROM_POLAR_BUTTON", false)) {
            var3 = true;
         }
      }

      var4.putExtra("fi.polar.polarflow.extra.STARTED_FROM_POLAR_BUTTON", var3);
      var4.putExtra("fi.polar.polarflow.extra.SENDER_CLASS_SIMPLE_NAME", "StartActivity");
      this.startActivity(var4);
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      fi.polar.polarflow.util.d.c("StartActivity", "versionCode: 2502301, versionName: 2.3.1");
      boolean var2 = false;
      if (fi.polar.polarflow.util.u.a().d()) {
         fi.polar.polarflow.util.d.c("StartActivity", "Initialized");
      } else {
         fi.polar.polarflow.util.d.c("StartActivity", "Not Initialized");
      }

      if (fi.polar.polarflow.util.u.a().e()) {
         var2 = true;
         fi.polar.polarflow.util.d.c("StartActivity", "Provisioned");
      } else {
         fi.polar.polarflow.util.d.c("StartActivity", "Not Provisioned");
      }

      NotificationReceiver.a(this, 3);
      Intent var3;
      if (var2) {
         if (Training.getInstance().isRunning()) {
            this.a(ExeViewActivity.class);
         } else if (this.getIntent() == null || !this.getIntent().hasExtra(fi.polar.polarflow.ui.myday.item.e.c) && !this.getIntent().hasExtra("MyDayFragment.extra.SCROLL_TO_MY_DAY_ITEM")) {
            this.a(MainMenuActivity.class);
         } else {
            var3 = new Intent(this.getIntent());
            var3.setClass(this, MainMenuActivity.class);
            this.startActivity(var3);
         }
      } else if (!fi.polar.polarflow.ftu.o.a()) {
         this.a(SignInActivity.class);
      } else {
         var3 = new Intent(this, GridAnimationActivity.class);
         var3.putExtra(GridAnimationActivity.a, fi.polar.polarflow.ftu.g.c);
         this.startActivity(var3);
      }

      this.finish();
   }
}
