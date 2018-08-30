package fi.polar.polarflow.ui.exeview;

import android.view.View;
import android.view.View.OnClickListener;

class ac implements OnClickListener {
   // $FF: synthetic field
   final ab a;

   ac(ab var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      fi.polar.polarflow.util.d.c("ExeViewPauseFragment", "pauseButton onClick!");
      fi.polar.polarflow.ui.o.c(this.a.getActivity(), "TrainingService.action.PAUSE_SESSION");
      ab.a(this.a);
      ab.b(this.a).setClickable(false);
   }
}
