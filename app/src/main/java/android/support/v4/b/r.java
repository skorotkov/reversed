package android.support.v4.b;

import android.view.View;

class r extends ab {
   // $FF: synthetic field
   final p a;

   r(p var1) {
      this.a = var1;
   }

   public View a(int var1) {
      if (this.a.P == null) {
         throw new IllegalStateException("Fragment does not have a view");
      } else {
         return this.a.P.findViewById(var1);
      }
   }

   public boolean a() {
      boolean var1;
      if (this.a.P != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
