package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bd;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

@TargetApi(14)
public class r extends e implements MenuItem {
   private Method c;

   r(Context var1, android.support.v4.e.a.b var2) {
      super(var1, var2);
   }

   s a(ActionProvider var1) {
      return new s(this, this.a, var1);
   }

   public void a(boolean var1) {
      try {
         if (this.c == null) {
            this.c = ((android.support.v4.e.a.b)this.b).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
         }

         this.c.invoke(this.b, var1);
      } catch (Exception var3) {
         Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", var3);
      }

   }

   public boolean collapseActionView() {
      return ((android.support.v4.e.a.b)this.b).collapseActionView();
   }

   public boolean expandActionView() {
      return ((android.support.v4.e.a.b)this.b).expandActionView();
   }

   public ActionProvider getActionProvider() {
      android.support.v4.view.q var1 = ((android.support.v4.e.a.b)this.b).a();
      ActionProvider var2;
      if (var1 instanceof s) {
         var2 = ((s)var1).a;
      } else {
         var2 = null;
      }

      return var2;
   }

   public View getActionView() {
      View var1 = ((android.support.v4.e.a.b)this.b).getActionView();
      View var2 = var1;
      if (var1 instanceof t) {
         var2 = ((t)var1).c();
      }

      return var2;
   }

   public char getAlphabeticShortcut() {
      return ((android.support.v4.e.a.b)this.b).getAlphabeticShortcut();
   }

   public int getGroupId() {
      return ((android.support.v4.e.a.b)this.b).getGroupId();
   }

   public Drawable getIcon() {
      return ((android.support.v4.e.a.b)this.b).getIcon();
   }

   public Intent getIntent() {
      return ((android.support.v4.e.a.b)this.b).getIntent();
   }

   public int getItemId() {
      return ((android.support.v4.e.a.b)this.b).getItemId();
   }

   public ContextMenuInfo getMenuInfo() {
      return ((android.support.v4.e.a.b)this.b).getMenuInfo();
   }

   public char getNumericShortcut() {
      return ((android.support.v4.e.a.b)this.b).getNumericShortcut();
   }

   public int getOrder() {
      return ((android.support.v4.e.a.b)this.b).getOrder();
   }

   public SubMenu getSubMenu() {
      return this.a(((android.support.v4.e.a.b)this.b).getSubMenu());
   }

   public CharSequence getTitle() {
      return ((android.support.v4.e.a.b)this.b).getTitle();
   }

   public CharSequence getTitleCondensed() {
      return ((android.support.v4.e.a.b)this.b).getTitleCondensed();
   }

   public boolean hasSubMenu() {
      return ((android.support.v4.e.a.b)this.b).hasSubMenu();
   }

   public boolean isActionViewExpanded() {
      return ((android.support.v4.e.a.b)this.b).isActionViewExpanded();
   }

   public boolean isCheckable() {
      return ((android.support.v4.e.a.b)this.b).isCheckable();
   }

   public boolean isChecked() {
      return ((android.support.v4.e.a.b)this.b).isChecked();
   }

   public boolean isEnabled() {
      return ((android.support.v4.e.a.b)this.b).isEnabled();
   }

   public boolean isVisible() {
      return ((android.support.v4.e.a.b)this.b).isVisible();
   }

   public MenuItem setActionProvider(ActionProvider var1) {
      android.support.v4.e.a.b var2 = (android.support.v4.e.a.b)this.b;
      s var3;
      if (var1 != null) {
         var3 = this.a(var1);
      } else {
         var3 = null;
      }

      var2.a((android.support.v4.view.q)var3);
      return this;
   }

   public MenuItem setActionView(int var1) {
      ((android.support.v4.e.a.b)this.b).setActionView(var1);
      View var2 = ((android.support.v4.e.a.b)this.b).getActionView();
      if (var2 instanceof CollapsibleActionView) {
         ((android.support.v4.e.a.b)this.b).setActionView(new t(var2));
      }

      return this;
   }

   public MenuItem setActionView(View var1) {
      Object var2 = var1;
      if (var1 instanceof CollapsibleActionView) {
         var2 = new t(var1);
      }

      ((android.support.v4.e.a.b)this.b).setActionView((View)var2);
      return this;
   }

   public MenuItem setAlphabeticShortcut(char var1) {
      ((android.support.v4.e.a.b)this.b).setAlphabeticShortcut(var1);
      return this;
   }

   public MenuItem setCheckable(boolean var1) {
      ((android.support.v4.e.a.b)this.b).setCheckable(var1);
      return this;
   }

   public MenuItem setChecked(boolean var1) {
      ((android.support.v4.e.a.b)this.b).setChecked(var1);
      return this;
   }

   public MenuItem setEnabled(boolean var1) {
      ((android.support.v4.e.a.b)this.b).setEnabled(var1);
      return this;
   }

   public MenuItem setIcon(int var1) {
      ((android.support.v4.e.a.b)this.b).setIcon(var1);
      return this;
   }

   public MenuItem setIcon(Drawable var1) {
      ((android.support.v4.e.a.b)this.b).setIcon(var1);
      return this;
   }

   public MenuItem setIntent(Intent var1) {
      ((android.support.v4.e.a.b)this.b).setIntent(var1);
      return this;
   }

   public MenuItem setNumericShortcut(char var1) {
      ((android.support.v4.e.a.b)this.b).setNumericShortcut(var1);
      return this;
   }

   public MenuItem setOnActionExpandListener(OnActionExpandListener var1) {
      android.support.v4.e.a.b var2 = (android.support.v4.e.a.b)this.b;
      u var3;
      if (var1 != null) {
         var3 = new u(this, var1);
      } else {
         var3 = null;
      }

      var2.a((bd)var3);
      return this;
   }

   public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener var1) {
      android.support.v4.e.a.b var2 = (android.support.v4.e.a.b)this.b;
      v var3;
      if (var1 != null) {
         var3 = new v(this, var1);
      } else {
         var3 = null;
      }

      var2.setOnMenuItemClickListener(var3);
      return this;
   }

   public MenuItem setShortcut(char var1, char var2) {
      ((android.support.v4.e.a.b)this.b).setShortcut(var1, var2);
      return this;
   }

   public void setShowAsAction(int var1) {
      ((android.support.v4.e.a.b)this.b).setShowAsAction(var1);
   }

   public MenuItem setShowAsActionFlags(int var1) {
      ((android.support.v4.e.a.b)this.b).setShowAsActionFlags(var1);
      return this;
   }

   public MenuItem setTitle(int var1) {
      ((android.support.v4.e.a.b)this.b).setTitle(var1);
      return this;
   }

   public MenuItem setTitle(CharSequence var1) {
      ((android.support.v4.e.a.b)this.b).setTitle(var1);
      return this;
   }

   public MenuItem setTitleCondensed(CharSequence var1) {
      ((android.support.v4.e.a.b)this.b).setTitleCondensed(var1);
      return this;
   }

   public MenuItem setVisible(boolean var1) {
      return ((android.support.v4.e.a.b)this.b).setVisible(var1);
   }
}
