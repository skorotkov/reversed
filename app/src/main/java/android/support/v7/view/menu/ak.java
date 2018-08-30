package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class ak extends m implements SubMenu {
   private m d;
   private p e;

   public ak(Context var1, m var2, p var3) {
      super(var1);
      this.d = var2;
      this.e = var3;
   }

   public void a(n var1) {
      this.d.a(var1);
   }

   public boolean a() {
      return this.d.a();
   }

   boolean a(m var1, MenuItem var2) {
      boolean var3;
      if (!super.a(var1, var2) && !this.d.a(var1, var2)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public boolean b() {
      return this.d.b();
   }

   public boolean c(p var1) {
      return this.d.c(var1);
   }

   public boolean d(p var1) {
      return this.d.d(var1);
   }

   public MenuItem getItem() {
      return this.e;
   }

   public m m() {
      return this.d.m();
   }

   public Menu p() {
      return this.d;
   }

   public SubMenu setHeaderIcon(int var1) {
      return (SubMenu)super.d(var1);
   }

   public SubMenu setHeaderIcon(Drawable var1) {
      return (SubMenu)super.a(var1);
   }

   public SubMenu setHeaderTitle(int var1) {
      return (SubMenu)super.c(var1);
   }

   public SubMenu setHeaderTitle(CharSequence var1) {
      return (SubMenu)super.a(var1);
   }

   public SubMenu setHeaderView(View var1) {
      return (SubMenu)super.a(var1);
   }

   public SubMenu setIcon(int var1) {
      this.e.setIcon(var1);
      return this;
   }

   public SubMenu setIcon(Drawable var1) {
      this.e.setIcon(var1);
      return this;
   }

   public void setQwertyMode(boolean var1) {
      this.d.setQwertyMode(var1);
   }
}
