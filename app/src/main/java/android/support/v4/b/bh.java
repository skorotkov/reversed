package android.support.v4.b;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

final class bh implements TransitionListener {
   // $FF: synthetic field
   final Object a;
   // $FF: synthetic field
   final ArrayList b;
   // $FF: synthetic field
   final Object c;
   // $FF: synthetic field
   final ArrayList d;
   // $FF: synthetic field
   final Object e;
   // $FF: synthetic field
   final ArrayList f;

   bh(Object var1, ArrayList var2, Object var3, ArrayList var4, Object var5, ArrayList var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public void onTransitionCancel(Transition var1) {
   }

   public void onTransitionEnd(Transition var1) {
   }

   public void onTransitionPause(Transition var1) {
   }

   public void onTransitionResume(Transition var1) {
   }

   public void onTransitionStart(Transition var1) {
      if (this.a != null) {
         bc.b(this.a, (ArrayList)this.b, (ArrayList)null);
      }

      if (this.c != null) {
         bc.b(this.c, (ArrayList)this.d, (ArrayList)null);
      }

      if (this.e != null) {
         bc.b(this.e, (ArrayList)this.f, (ArrayList)null);
      }

   }
}
