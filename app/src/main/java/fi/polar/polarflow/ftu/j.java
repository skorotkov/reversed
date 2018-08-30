package fi.polar.polarflow.ftu;

import android.view.View;
import android.view.View.OnClickListener;

class j implements OnClickListener {
   // $FF: synthetic field
   final SignInActivity a;

   j(SignInActivity var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if (SignInActivity.a(this.a) == n.c) {
         SignInActivity.a(this.a, this.a.getApplicationContext());
         SignInActivity.b(this.a);
      } else {
         SignInActivity.c(this.a);
         SignInActivity.d(this.a);
      }

      this.a.finish();
   }
}
