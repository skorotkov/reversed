package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class s extends android.support.v4.view.q {
   final ActionProvider a;
   // $FF: synthetic field
   final r b;

   public s(r var1, Context var2, ActionProvider var3) {
      super(var2);
      this.b = var1;
      this.a = var3;
   }

   public View a() {
      return this.a.onCreateActionView();
   }

   public void a(SubMenu var1) {
      this.a.onPrepareSubMenu(this.b.a(var1));
   }

   public boolean d() {
      return this.a.onPerformDefaultAction();
   }

   public boolean e() {
      return this.a.hasSubMenu();
   }
}
