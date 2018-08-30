package android.support.v7.view.menu;

import android.support.v7.widget.by;

class b extends by {
   // $FF: synthetic field
   final ActionMenuItemView a;

   public b(ActionMenuItemView var1) {
      super(var1);
      this.a = var1;
   }

   public ah a() {
      ah var1;
      if (this.a.c != null) {
         var1 = this.a.c.a();
      } else {
         var1 = null;
      }

      return var1;
   }

   protected boolean b() {
      boolean var1 = false;
      boolean var2 = var1;
      if (this.a.b != null) {
         var2 = var1;
         if (this.a.b.a(this.a.a)) {
            ah var3 = this.a();
            var2 = var1;
            if (var3 != null) {
               var2 = var1;
               if (var3.d()) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }
}
