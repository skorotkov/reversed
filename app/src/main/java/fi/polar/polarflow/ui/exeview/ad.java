package fi.polar.polarflow.ui.exeview;

import android.view.View;
import android.view.View.OnClickListener;

class ad implements OnClickListener {
   // $FF: synthetic field
   final ab a;

   ad(ab var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if (!ab.c(this.a).isStarted()) {
         fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "resumeButton onClick!");
         fi.polar.polarflow.ui.o.c(this.a.getActivity(), "TrainingService.action.RESUME_SESSION");
         ab.d(this.a);
         ab.e(this.a).setClickable(false);
      }

   }
}
