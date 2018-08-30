package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.bd;
import android.util.Log;
import android.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class p implements android.support.v4.e.a.b {
   private static String w;
   private static String x;
   private static String y;
   private static String z;
   m a;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private CharSequence f;
   private CharSequence g;
   private Intent h;
   private char i;
   private char j;
   private Drawable k;
   private int l = 0;
   private ak m;
   private Runnable n;
   private OnMenuItemClickListener o;
   private int p = 16;
   private int q = 0;
   private View r;
   private android.support.v4.view.q s;
   private bd t;
   private boolean u = false;
   private ContextMenuInfo v;

   p(m var1, int var2, int var3, int var4, int var5, CharSequence var6, int var7) {
      this.a = var1;
      this.b = var3;
      this.c = var2;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.q = var7;
   }

   public android.support.v4.e.a.b a(int var1) {
      Context var2 = this.a.d();
      this.a(LayoutInflater.from(var2).inflate(var1, new LinearLayout(var2), false));
      return this;
   }

   public android.support.v4.e.a.b a(bd var1) {
      this.t = var1;
      return this;
   }

   public android.support.v4.e.a.b a(android.support.v4.view.q var1) {
      if (this.s != null) {
         this.s.f();
      }

      this.r = null;
      this.s = var1;
      this.a.b(true);
      if (this.s != null) {
         this.s.a((android.support.v4.view.s)(new q(this)));
      }

      return this;
   }

   public android.support.v4.e.a.b a(View var1) {
      this.r = var1;
      this.s = null;
      if (var1 != null && var1.getId() == -1 && this.b > 0) {
         var1.setId(this.b);
      }

      this.a.b(this);
      return this;
   }

   public android.support.v4.view.q a() {
      return this.s;
   }

   CharSequence a(ae var1) {
      CharSequence var2;
      if (var1 != null && var1.a()) {
         var2 = this.getTitleCondensed();
      } else {
         var2 = this.getTitle();
      }

      return var2;
   }

   public void a(ak var1) {
      this.m = var1;
      var1.setHeaderTitle(this.getTitle());
   }

   void a(ContextMenuInfo var1) {
      this.v = var1;
   }

   public void a(boolean var1) {
      int var2 = this.p;
      byte var3;
      if (var1) {
         var3 = 4;
      } else {
         var3 = 0;
      }

      this.p = var3 | var2 & -5;
   }

   public android.support.v4.e.a.b b(int var1) {
      this.setShowAsAction(var1);
      return this;
   }

   void b(boolean var1) {
      int var2 = this.p;
      int var3 = this.p;
      byte var4;
      if (var1) {
         var4 = 2;
      } else {
         var4 = 0;
      }

      this.p = var4 | var3 & -3;
      if (var2 != this.p) {
         this.a.b(false);
      }

   }

   public boolean b() {
      boolean var1 = true;
      boolean var2;
      if (this.o != null && this.o.onMenuItemClick(this)) {
         var2 = var1;
      } else {
         var2 = var1;
         if (!this.a.a((m)this.a.m(), (MenuItem)this)) {
            if (this.n != null) {
               this.n.run();
               var2 = var1;
            } else {
               if (this.h != null) {
                  label44: {
                     try {
                        this.a.d().startActivity(this.h);
                     } catch (ActivityNotFoundException var4) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", var4);
                        break label44;
                     }

                     var2 = var1;
                     return var2;
                  }
               }

               if (this.s != null) {
                  var2 = var1;
                  if (this.s.d()) {
                     return var2;
                  }
               }

               var2 = false;
            }
         }
      }

      return var2;
   }

   public int c() {
      return this.e;
   }

   boolean c(boolean var1) {
      boolean var2 = false;
      int var3 = this.p;
      int var4 = this.p;
      byte var5;
      if (var1) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      this.p = var5 | var4 & -9;
      var1 = var2;
      if (var3 != this.p) {
         var1 = true;
      }

      return var1;
   }

   public boolean collapseActionView() {
      boolean var1 = false;
      if ((this.q & 8) != 0) {
         if (this.r == null) {
            var1 = true;
         } else if (this.t == null || this.t.b(this)) {
            var1 = this.a.d(this);
         }
      }

      return var1;
   }

   char d() {
      char var1;
      char var2;
      if (this.a.a()) {
         var1 = this.j;
         var2 = var1;
      } else {
         var1 = this.i;
         var2 = var1;
      }

      return var2;
   }

   public void d(boolean var1) {
      if (var1) {
         this.p |= 32;
      } else {
         this.p &= -33;
      }

   }

   String e() {
      char var1 = this.d();
      String var2;
      if (var1 == 0) {
         var2 = "";
      } else {
         StringBuilder var3 = new StringBuilder(w);
         switch(var1) {
         case '\b':
            var3.append(y);
            break;
         case '\n':
            var3.append(x);
            break;
         case ' ':
            var3.append(z);
            break;
         default:
            var3.append(var1);
         }

         var2 = var3.toString();
      }

      return var2;
   }

   public void e(boolean var1) {
      this.u = var1;
      this.a.b(false);
   }

   public boolean expandActionView() {
      boolean var1 = false;
      if (this.n() && (this.t == null || this.t.a(this))) {
         var1 = this.a.c(this);
      }

      return var1;
   }

   boolean f() {
      boolean var1;
      if (this.a.b() && this.d() != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean g() {
      boolean var1;
      if ((this.p & 4) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public ActionProvider getActionProvider() {
      throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
   }

   public View getActionView() {
      View var1;
      if (this.r != null) {
         var1 = this.r;
      } else if (this.s != null) {
         this.r = this.s.a((MenuItem)this);
         var1 = this.r;
      } else {
         var1 = null;
      }

      return var1;
   }

   public char getAlphabeticShortcut() {
      return this.j;
   }

   public int getGroupId() {
      return this.c;
   }

   public Drawable getIcon() {
      Drawable var1;
      if (this.k != null) {
         var1 = this.k;
      } else if (this.l != 0) {
         var1 = android.support.v7.b.a.b.b(this.a.d(), this.l);
         this.l = 0;
         this.k = var1;
      } else {
         var1 = null;
      }

      return var1;
   }

   public Intent getIntent() {
      return this.h;
   }

   @CapturedViewProperty
   public int getItemId() {
      return this.b;
   }

   public ContextMenuInfo getMenuInfo() {
      return this.v;
   }

   public char getNumericShortcut() {
      return this.i;
   }

   public int getOrder() {
      return this.d;
   }

   public SubMenu getSubMenu() {
      return this.m;
   }

   @CapturedViewProperty
   public CharSequence getTitle() {
      return this.f;
   }

   public CharSequence getTitleCondensed() {
      CharSequence var1;
      if (this.g != null) {
         var1 = this.g;
      } else {
         var1 = this.f;
      }

      Object var2 = var1;
      if (VERSION.SDK_INT < 18) {
         var2 = var1;
         if (var1 != null) {
            var2 = var1;
            if (!(var1 instanceof String)) {
               var2 = var1.toString();
            }
         }
      }

      return (CharSequence)var2;
   }

   public void h() {
      this.a.b(this);
   }

   public boolean hasSubMenu() {
      boolean var1;
      if (this.m != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean i() {
      return this.a.n();
   }

   public boolean isActionViewExpanded() {
      return this.u;
   }

   public boolean isCheckable() {
      boolean var1 = true;
      if ((this.p & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean isChecked() {
      boolean var1;
      if ((this.p & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean isEnabled() {
      boolean var1;
      if ((this.p & 16) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean isVisible() {
      boolean var1 = true;
      if (this.s != null && this.s.b()) {
         if ((this.p & 8) != 0 || !this.s.c()) {
            var1 = false;
         }
      } else if ((this.p & 8) != 0) {
         var1 = false;
      }

      return var1;
   }

   public boolean j() {
      boolean var1;
      if ((this.p & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean k() {
      boolean var1 = true;
      if ((this.q & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean l() {
      boolean var1;
      if ((this.q & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean m() {
      boolean var1;
      if ((this.q & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean n() {
      boolean var1 = false;
      boolean var2 = var1;
      if ((this.q & 8) != 0) {
         if (this.r == null && this.s != null) {
            this.r = this.s.a((MenuItem)this);
         }

         var2 = var1;
         if (this.r != null) {
            var2 = true;
         }
      }

      return var2;
   }

   public MenuItem setActionProvider(ActionProvider var1) {
      throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
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
      if (this.j != var1) {
         this.j = Character.toLowerCase(var1);
         this.a.b(false);
      }

      return this;
   }

   public MenuItem setCheckable(boolean var1) {
      int var2 = this.p;
      int var3 = this.p;
      byte var4;
      if (var1) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      this.p = var4 | var3 & -2;
      if (var2 != this.p) {
         this.a.b(false);
      }

      return this;
   }

   public MenuItem setChecked(boolean var1) {
      if ((this.p & 4) != 0) {
         this.a.a((MenuItem)this);
      } else {
         this.b(var1);
      }

      return this;
   }

   public MenuItem setEnabled(boolean var1) {
      if (var1) {
         this.p |= 16;
      } else {
         this.p &= -17;
      }

      this.a.b(false);
      return this;
   }

   public MenuItem setIcon(int var1) {
      this.k = null;
      this.l = var1;
      this.a.b(false);
      return this;
   }

   public MenuItem setIcon(Drawable var1) {
      this.l = 0;
      this.k = var1;
      this.a.b(false);
      return this;
   }

   public MenuItem setIntent(Intent var1) {
      this.h = var1;
      return this;
   }

   public MenuItem setNumericShortcut(char var1) {
      if (this.i != var1) {
         this.i = (char)var1;
         this.a.b(false);
      }

      return this;
   }

   public MenuItem setOnActionExpandListener(OnActionExpandListener var1) {
      throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
   }

   public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener var1) {
      this.o = var1;
      return this;
   }

   public MenuItem setShortcut(char var1, char var2) {
      this.i = (char)var1;
      this.j = Character.toLowerCase(var2);
      this.a.b(false);
      return this;
   }

   public void setShowAsAction(int var1) {
      switch(var1 & 3) {
      case 0:
      case 1:
      case 2:
         this.q = var1;
         this.a.b(this);
         return;
      default:
         throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
      }
   }

   // $FF: synthetic method
   public MenuItem setShowAsActionFlags(int var1) {
      return this.b(var1);
   }

   public MenuItem setTitle(int var1) {
      return this.setTitle(this.a.d().getString(var1));
   }

   public MenuItem setTitle(CharSequence var1) {
      this.f = var1;
      this.a.b(false);
      if (this.m != null) {
         this.m.setHeaderTitle(var1);
      }

      return this;
   }

   public MenuItem setTitleCondensed(CharSequence var1) {
      this.g = var1;
      if (var1 == null) {
         var1 = this.f;
      }

      this.a.b(false);
      return this;
   }

   public MenuItem setVisible(boolean var1) {
      if (this.c(var1)) {
         this.a.a(this);
      }

      return this;
   }

   public String toString() {
      String var1;
      if (this.f != null) {
         var1 = this.f.toString();
      } else {
         var1 = null;
      }

      return var1;
   }
}
