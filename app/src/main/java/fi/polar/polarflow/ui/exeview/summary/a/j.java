package fi.polar.polarflow.ui.exeview.summary.a;

import android.app.Activity;
import android.app.FragmentManager;
import android.view.View;
import android.view.View.OnClickListener;

class j implements OnClickListener {
   // $FF: synthetic field
   final i a;

   j(i var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if (i.a(this.a) instanceof Activity) {
         FragmentManager var2 = ((Activity)i.a(this.a)).getFragmentManager();
         k.a(i.b(this.a), i.c(this.a)).show(var2, "swimmingStyle");
      } else {
         fi.polar.polarflow.util.d.f("SwimmingStyleBar", "Context must be an Activity!");
      }

   }
}
