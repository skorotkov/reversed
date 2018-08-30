package fi.polar.polarflow.ftu;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

class e implements Runnable {
   // $FF: synthetic field
   final GridAnimationActivity a;

   e(GridAnimationActivity var1) {
      this.a = var1;
   }

   public void run() {
      SpannableString var1 = new SpannableString(GridAnimationActivity.a(this.a));
      var1.setSpan(new ForegroundColorSpan(GridAnimationActivity.b(this.a).getCurrentTextColor()), 0, var1.length() - 3, 33);
      var1.setSpan(new ForegroundColorSpan(0), var1.length() - 3 + GridAnimationActivity.c(this.a), var1.length(), 33);
      GridAnimationActivity.b(this.a).setText(var1);
      GridAnimationActivity.a(this.a, (GridAnimationActivity.c(this.a) + 1) % 4);
      GridAnimationActivity.e(this.a).postDelayed(GridAnimationActivity.d(this.a), 500L);
   }
}
