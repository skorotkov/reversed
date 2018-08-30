package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bd;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;

public class a implements android.support.v4.e.a.b {
   private final int a;
   private final int b;
   private final int c;
   private final int d;
   private CharSequence e;
   private CharSequence f;
   private Intent g;
   private char h;
   private char i;
   private Drawable j;
   private int k = 0;
   private Context l;
   private OnMenuItemClickListener m;
   private int n = 16;

   public a(Context var1, int var2, int var3, int var4, int var5, CharSequence var6) {
      this.l = var1;
      this.a = var3;
      this.b = var2;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   public android.support.v4.e.a.b a(int var1) {
      throw new UnsupportedOperationException();
   }

   public android.support.v4.e.a.b a(bd var1) {
      return this;
   }

   public android.support.v4.e.a.b a(android.support.v4.view.q var1) {
      throw new UnsupportedOperationException();
   }

   public android.support.v4.e.a.b a(View var1) {
      throw new UnsupportedOperationException();
   }

   public android.support.v4.view.q a() {
      return null;
   }

   public android.support.v4.e.a.b b(int var1) {
      this.setShowAsAction(var1);
      return this;
   }

   public boolean collapseActionView() {
      return false;
   }

   public boolean expandActionView() {
      return false;
   }

   public ActionProvider getActionProvider() {
      throw new UnsupportedOperationException();
   }

   public View getActionView() {
      return null;
   }

   public char getAlphabeticShortcut() {
      return this.i;
   }

   public int getGroupId() {
      return this.b;
   }

   public Drawable getIcon() {
      return this.j;
   }

   public Intent getIntent() {
      return this.g;
   }

   public int getItemId() {
      return this.a;
   }

   public ContextMenuInfo getMenuInfo() {
      return null;
   }

   public char getNumericShortcut() {
      return this.h;
   }

   public int getOrder() {
      return this.d;
   }

   public SubMenu getSubMenu() {
      return null;
   }

   public CharSequence getTitle() {
      return this.e;
   }

   public CharSequence getTitleCondensed() {
      CharSequence var1;
      if (this.f != null) {
         var1 = this.f;
      } else {
         var1 = this.e;
      }

      return var1;
   }

   public boolean hasSubMenu() {
      return false;
   }

   public boolean isActionViewExpanded() {
      return false;
   }

   public boolean isCheckable() {
      boolean var1;
      if ((this.n & 1) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean isChecked() {
      boolean var1;
      if ((this.n & 2) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean isEnabled() {
      boolean var1;
      if ((this.n & 16) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean isVisible() {
      boolean var1;
      if ((this.n & 8) == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public MenuItem setActionProvider(ActionProvider var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: synthetic method
   public MenuItem setActionView(int var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   public MenuItem setActionView(View var1) {
      return this.a(var1);
   }

   public MenuItem setAlphabeticShortcut(char var1) {
      this.i = (char)var1;
      return this;
   }

   public MenuItem setCheckable(boolean var1) {
      int var2 = this.n;
      byte var3;
      if (var1) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      this.n = var3 | var2 & -2;
      return this;
   }

   public MenuItem setChecked(boolean var1) {
      int var2 = this.n;
      byte var3;
      if (var1) {
         var3 = 2;
      } else {
         var3 = 0;
      }

      this.n = var3 | var2 & -3;
      return this;
   }

   public MenuItem setEnabled(boolean var1) {
      int var2 = this.n;
      byte var3;
      if (var1) {
         var3 = 16;
      } else {
         var3 = 0;
      }

      this.n = var3 | var2 & -17;
      return this;
   }

   public MenuItem setIcon(int var1) {
      this.k = var1;
      this.j = android.support.v4.c.a.a(this.l, var1);
      return this;
   }

   public MenuItem setIcon(Drawable var1) {
      this.j = var1;
      this.k = 0;
      return this;
   }

   public MenuItem setIntent(Intent var1) {
      this.g = var1;
      return this;
   }

   public MenuItem setNumericShortcut(char var1) {
      this.h = (char)var1;
      return this;
   }

   public MenuItem setOnActionExpandListener(OnActionExpandListener var1) {
      throw new UnsupportedOperationException();
   }

   public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener var1) {
      this.m = var1;
      return this;
   }

   public MenuItem setShortcut(char var1, char var2) {
      this.h = (char)var1;
      this.i = (char)var2;
      return this;
   }

   public void setShowAsAction(int var1) {
   }

   // $FF: synthetic method
   public MenuItem setShowAsActionFlags(int var1) {
      return this.b(var1);
   }

   public MenuItem setTitle(int var1) {
      this.e = this.l.getResources().getString(var1);
      return this;
   }

   public MenuItem setTitle(CharSequence var1) {
      this.e = var1;
      return this;
   }

   public MenuItem setTitleCondensed(CharSequence var1) {
      this.f = var1;
      return this;
   }

   public MenuItem setVisible(boolean var1) {
      int var2 = this.n;
      byte var3;
      if (var1) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      this.n = var3 | var2 & 8;
      return this;
   }
}
