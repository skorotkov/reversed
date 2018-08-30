package android.support.v4.b;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

final class be implements TransitionListener {
   // $FF: synthetic field
   final View a;
   // $FF: synthetic field
   final ArrayList b;

   be(View var1, ArrayList var2) {
      this.a = var1;
      this.b = var2;
   }

   public void onTransitionCancel(Transition var1) {
   }

   public void onTransitionEnd(Transition var1) {
      var1.removeListener(this);
      this.a.setVisibility(8);
      int var2 = this.b.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         ((View)this.b.get(var3)).setVisibility(0);
      }

   }

   public void onTransitionPause(Transition var1) {
   }

   public void onTransitionResume(Transition var1) {
   }

   public void onTransitionStart(Transition var1) {
   }
}
