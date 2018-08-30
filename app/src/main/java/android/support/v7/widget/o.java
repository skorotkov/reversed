package android.support.v7.widget;

import android.view.View;

class o extends by {
   // $FF: synthetic field
   final j a;
   // $FF: synthetic field
   final n b;

   o(n var1, View var2, j var3) {
      super(var2);
      this.b = var1;
      this.a = var3;
   }

   public android.support.v7.view.menu.ah a() {
      android.support.v7.view.menu.y var1;
      if (this.b.a.h == null) {
         var1 = null;
      } else {
         var1 = this.b.a.h.b();
      }

      return var1;
   }

   public boolean b() {
      this.b.a.d();
      return true;
   }

   public boolean c() {
      boolean var1;
      if (this.b.a.j != null) {
         var1 = false;
      } else {
         this.b.a.e();
         var1 = true;
      }

      return var1;
   }
}
