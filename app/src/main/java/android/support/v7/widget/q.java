package android.support.v7.widget;

class q implements android.support.v7.view.menu.ac {
   // $FF: synthetic field
   final j a;

   q(j var1) {
      this.a = var1;
   }

   public void a(android.support.v7.view.menu.m var1, boolean var2) {
      if (var1 instanceof android.support.v7.view.menu.ak) {
         var1.m().a(false);
      }

      android.support.v7.view.menu.ac var3 = this.a.a();
      if (var3 != null) {
         var3.a(var1, var2);
      }

   }

   public boolean a(android.support.v7.view.menu.m var1) {
      boolean var2 = false;
      if (var1 != null) {
         this.a.l = ((android.support.v7.view.menu.ak)var1).getItem().getItemId();
         android.support.v7.view.menu.ac var3 = this.a.a();
         if (var3 != null) {
            var2 = var3.a(var1);
         } else {
            var2 = false;
         }
      }

      return var2;
   }
}
