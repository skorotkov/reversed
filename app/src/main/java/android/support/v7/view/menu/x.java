package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import android.view.ActionProvider.VisibilityListener;

class x extends s implements VisibilityListener {
   android.support.v4.view.s c;
   // $FF: synthetic field
   final w d;

   public x(w var1, Context var2, ActionProvider var3) {
      super(var1, var2, var3);
      this.d = var1;
   }

   public View a(MenuItem var1) {
      return this.a.onCreateActionView(var1);
   }

   public void a(android.support.v4.view.s var1) {
      this.c = var1;
      ActionProvider var2 = this.a;
      x var3;
      if (var1 != null) {
         var3 = this;
      } else {
         var3 = null;
      }

      var2.setVisibilityListener(var3);
   }

   public boolean b() {
      return this.a.overridesItemVisibility();
   }

   public boolean c() {
      return this.a.isVisible();
   }

   public void onActionProviderVisibilityChanged(boolean var1) {
      if (this.c != null) {
         this.c.a(var1);
      }

   }
}
