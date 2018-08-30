package android.support.v7.view;

import android.content.res.TypedArray;
import android.support.v4.view.ay;
import android.support.v4.view.q;
import android.support.v7.a.k;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.r;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

class f {
   q a;
   // $FF: synthetic field
   final d b;
   private Menu c;
   private int d;
   private int e;
   private int f;
   private int g;
   private boolean h;
   private boolean i;
   private boolean j;
   private int k;
   private int l;
   private CharSequence m;
   private CharSequence n;
   private int o;
   private char p;
   private char q;
   private int r;
   private boolean s;
   private boolean t;
   private boolean u;
   private int v;
   private int w;
   private String x;
   private String y;
   private String z;

   public f(d var1, Menu var2) {
      this.b = var1;
      this.c = var2;
      this.a();
   }

   private char a(String var1) {
      byte var2 = 0;
      char var3;
      if (var1 == null) {
         var3 = (char)var2;
      } else {
         char var4 = var1.charAt(0);
         var3 = var4;
      }

      return var3;
   }

   private Object a(String var1, Class[] var2, Object[] var3) {
      Object var5;
      Object var7;
      try {
         Constructor var6 = this.b.e.getClassLoader().loadClass(var1).getConstructor(var2);
         var6.setAccessible(true);
         var7 = var6.newInstance(var3);
      } catch (Exception var4) {
         Log.w("SupportMenuInflater", "Cannot instantiate class: " + var1, var4);
         var5 = null;
         return var5;
      }

      var5 = var7;
      return var5;
   }

   private void a(MenuItem var1) {
      boolean var2 = true;
      MenuItem var3 = var1.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
      boolean var4;
      if (this.r >= 1) {
         var4 = true;
      } else {
         var4 = false;
      }

      var3.setCheckable(var4).setTitleCondensed(this.n).setIcon(this.o).setAlphabeticShortcut(this.p).setNumericShortcut(this.q);
      if (this.v >= 0) {
         ay.a(var1, this.v);
      }

      if (this.z != null) {
         if (this.b.e.isRestricted()) {
            throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
         }

         var1.setOnMenuItemClickListener(new e(this.b.a(), this.z));
      }

      if (var1 instanceof p) {
         p var5 = (p)var1;
      }

      if (this.r >= 2) {
         if (var1 instanceof p) {
            ((p)var1).a(true);
         } else if (var1 instanceof r) {
            ((r)var1).a(true);
         }
      }

      if (this.x != null) {
         ay.a(var1, (View)this.a(this.x, android.support.v7.view.d.a, this.b.c));
      } else {
         var2 = false;
      }

      if (this.w > 0) {
         if (!var2) {
            ay.b(var1, this.w);
         } else {
            Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
         }
      }

      if (this.a != null) {
         ay.a(var1, this.a);
      }

   }

   public void a() {
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.h = true;
      this.i = true;
   }

   public void a(AttributeSet var1) {
      TypedArray var2 = this.b.e.obtainStyledAttributes(var1, android.support.v7.a.k.MenuGroup);
      this.d = var2.getResourceId(android.support.v7.a.k.MenuGroup_android_id, 0);
      this.e = var2.getInt(android.support.v7.a.k.MenuGroup_android_menuCategory, 0);
      this.f = var2.getInt(android.support.v7.a.k.MenuGroup_android_orderInCategory, 0);
      this.g = var2.getInt(android.support.v7.a.k.MenuGroup_android_checkableBehavior, 0);
      this.h = var2.getBoolean(android.support.v7.a.k.MenuGroup_android_visible, true);
      this.i = var2.getBoolean(android.support.v7.a.k.MenuGroup_android_enabled, true);
      var2.recycle();
   }

   public void b() {
      this.j = true;
      this.a(this.c.add(this.d, this.k, this.l, this.m));
   }

   public void b(AttributeSet var1) {
      boolean var2 = true;
      TypedArray var4 = this.b.e.obtainStyledAttributes(var1, android.support.v7.a.k.MenuItem);
      this.k = var4.getResourceId(android.support.v7.a.k.MenuItem_android_id, 0);
      this.l = var4.getInt(android.support.v7.a.k.MenuItem_android_menuCategory, this.e) & -65536 | var4.getInt(android.support.v7.a.k.MenuItem_android_orderInCategory, this.f) & '\uffff';
      this.m = var4.getText(android.support.v7.a.k.MenuItem_android_title);
      this.n = var4.getText(android.support.v7.a.k.MenuItem_android_titleCondensed);
      this.o = var4.getResourceId(android.support.v7.a.k.MenuItem_android_icon, 0);
      this.p = this.a(var4.getString(android.support.v7.a.k.MenuItem_android_alphabeticShortcut));
      this.q = this.a(var4.getString(android.support.v7.a.k.MenuItem_android_numericShortcut));
      if (var4.hasValue(android.support.v7.a.k.MenuItem_android_checkable)) {
         byte var3;
         if (var4.getBoolean(android.support.v7.a.k.MenuItem_android_checkable, false)) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.r = var3;
      } else {
         this.r = this.g;
      }

      this.s = var4.getBoolean(android.support.v7.a.k.MenuItem_android_checked, false);
      this.t = var4.getBoolean(android.support.v7.a.k.MenuItem_android_visible, this.h);
      this.u = var4.getBoolean(android.support.v7.a.k.MenuItem_android_enabled, this.i);
      this.v = var4.getInt(android.support.v7.a.k.MenuItem_showAsAction, -1);
      this.z = var4.getString(android.support.v7.a.k.MenuItem_android_onClick);
      this.w = var4.getResourceId(android.support.v7.a.k.MenuItem_actionLayout, 0);
      this.x = var4.getString(android.support.v7.a.k.MenuItem_actionViewClass);
      this.y = var4.getString(android.support.v7.a.k.MenuItem_actionProviderClass);
      boolean var5;
      if (this.y != null) {
         var5 = var2;
      } else {
         var5 = false;
      }

      if (var5 && this.w == 0 && this.x == null) {
         this.a = (q)this.a(this.y, android.support.v7.view.d.b, this.b.d);
      } else {
         if (var5) {
            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
         }

         this.a = null;
      }

      var4.recycle();
      this.j = false;
   }

   public SubMenu c() {
      this.j = true;
      SubMenu var1 = this.c.addSubMenu(this.d, this.k, this.l, this.m);
      this.a(var1.getItem());
      return var1;
   }

   public boolean d() {
      return this.j;
   }
}
