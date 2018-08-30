package fi.polar.polarflow.ui.exeview;

import android.view.View;
import android.view.View.OnClickListener;
import fi.polar.polarflow.ui.exeview.laps.LapNotificationView;

class o implements OnClickListener {
   // $FF: synthetic field
   final boolean a;
   // $FF: synthetic field
   final ExeViewActivity b;

   o(ExeViewActivity var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onClick(View var1) {
      ((LapNotificationView)var1).a(0L);
      if (!ExeViewActivity.a(this.b)) {
         ak var2;
         if (this.a) {
            var2 = ak.e;
         } else {
            var2 = ak.d;
         }

         if (ExeViewActivity.b(this.b).b(var2) != -1) {
            if (!var2.equals(ExeViewActivity.b(this.b).e())) {
               ((ExeViewGridPager)this.b.findViewById(2131755166)).setCurrentItem(var2);
            }

            fi.polar.polarflow.ui.exeview.laps.a var3 = (fi.polar.polarflow.ui.exeview.laps.a)ExeViewActivity.b(this.b).a(var2);
            if (var3 != null) {
               var3.h();
            }
         }
      }

   }
}
