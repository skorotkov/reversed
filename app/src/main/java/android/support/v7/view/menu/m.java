package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class m implements android.support.v4.e.a.a {
   private static final int[] d = new int[]{1, 4, 5, 3, 2, 0};
   CharSequence a;
   Drawable b;
   View c;
   private final Context e;
   private final Resources f;
   private boolean g;
   private boolean h;
   private n i;
   private ArrayList j;
   private ArrayList k;
   private boolean l;
   private ArrayList m;
   private ArrayList n;
   private boolean o;
   private int p = 0;
   private ContextMenuInfo q;
   private boolean r = false;
   private boolean s = false;
   private boolean t = false;
   private boolean u = false;
   private boolean v = false;
   private ArrayList w = new ArrayList();
   private CopyOnWriteArrayList x = new CopyOnWriteArrayList();
   private p y;
   private boolean z;

   public m(Context var1) {
      this.e = var1;
      this.f = var1.getResources();
      this.j = new ArrayList();
      this.k = new ArrayList();
      this.l = true;
      this.m = new ArrayList();
      this.n = new ArrayList();
      this.o = true;
      this.d(true);
   }

   private static int a(ArrayList var0, int var1) {
      int var2 = var0.size() - 1;

      while(true) {
         if (var2 < 0) {
            var1 = 0;
            break;
         }

         if (((p)var0.get(var2)).c() <= var1) {
            var1 = var2 + 1;
            break;
         }

         --var2;
      }

      return var1;
   }

   private p a(int var1, int var2, int var3, int var4, CharSequence var5, int var6) {
      return new p(this, var1, var2, var3, var4, var5, var6);
   }

   private void a(int var1, CharSequence var2, int var3, Drawable var4, View var5) {
      Resources var6 = this.c();
      if (var5 != null) {
         this.c = var5;
         this.a = null;
         this.b = null;
      } else {
         if (var1 > 0) {
            this.a = var6.getText(var1);
         } else if (var2 != null) {
            this.a = var2;
         }

         if (var3 > 0) {
            this.b = android.support.v4.c.a.a(this.d(), var3);
         } else if (var4 != null) {
            this.b = var4;
         }

         this.c = null;
      }

      this.b(false);
   }

   private void a(int var1, boolean var2) {
      if (var1 >= 0 && var1 < this.j.size()) {
         this.j.remove(var1);
         if (var2) {
            this.b(true);
         }
      }

   }

   private boolean a(ak var1, ab var2) {
      boolean var3 = false;
      boolean var4 = false;
      if (!this.x.isEmpty()) {
         var4 = var3;
         if (var2 != null) {
            var4 = var2.a(var1);
         }

         Iterator var5 = this.x.iterator();

         while(var5.hasNext()) {
            WeakReference var7 = (WeakReference)var5.next();
            ab var6 = (ab)var7.get();
            if (var6 == null) {
               this.x.remove(var7);
            } else if (!var4) {
               var4 = var6.a(var1);
            }
         }
      }

      return var4;
   }

   private void c(boolean var1) {
      if (!this.x.isEmpty()) {
         this.f();
         Iterator var2 = this.x.iterator();

         while(var2.hasNext()) {
            WeakReference var3 = (WeakReference)var2.next();
            ab var4 = (ab)var3.get();
            if (var4 == null) {
               this.x.remove(var3);
            } else {
               var4.b(var1);
            }
         }

         this.g();
      }

   }

   private void d(boolean var1) {
      boolean var2 = true;
      if (var1 && this.f.getConfiguration().keyboard != 1 && this.f.getBoolean(android.support.v7.a.c.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
         var1 = var2;
      } else {
         var1 = false;
      }

      this.h = var1;
   }

   private static int e(int var0) {
      int var1 = (-65536 & var0) >> 16;
      if (var1 >= 0 && var1 < d.length) {
         return d[var1] << 16 | '\uffff' & var0;
      } else {
         throw new IllegalArgumentException("order does not contain a valid category.");
      }
   }

   public int a(int var1) {
      int var2 = this.size();
      int var3 = 0;

      while(true) {
         if (var3 >= var2) {
            var1 = -1;
            break;
         }

         if (((p)this.j.get(var3)).getItemId() == var1) {
            var1 = var3;
            break;
         }

         ++var3;
      }

      return var1;
   }

   public int a(int var1, int var2) {
      int var3 = this.size();
      int var4 = var2;
      if (var2 < 0) {
         var4 = 0;
      }

      var2 = var4;

      while(true) {
         if (var2 >= var3) {
            var2 = -1;
            break;
         }

         if (((p)this.j.get(var2)).getGroupId() == var1) {
            break;
         }

         ++var2;
      }

      return var2;
   }

   protected m a(Drawable var1) {
      this.a(0, (CharSequence)null, 0, var1, (View)null);
      return this;
   }

   protected m a(View var1) {
      this.a(0, (CharSequence)null, 0, (Drawable)null, var1);
      return this;
   }

   protected m a(CharSequence var1) {
      this.a(0, var1, 0, (Drawable)null, (View)null);
      return this;
   }

   p a(int var1, KeyEvent var2) {
      ArrayList var3 = this.w;
      var3.clear();
      this.a(var3, var1, var2);
      p var11;
      if (var3.isEmpty()) {
         var11 = null;
      } else {
         int var4 = var2.getMetaState();
         KeyData var5 = new KeyData();
         var2.getKeyData(var5);
         int var6 = var3.size();
         if (var6 == 1) {
            var11 = (p)var3.get(0);
         } else {
            boolean var7 = this.a();

            for(int var8 = 0; var8 < var6; ++var8) {
               p var9 = (p)var3.get(var8);
               char var10;
               if (var7) {
                  var10 = var9.getAlphabeticShortcut();
               } else {
                  var10 = var9.getNumericShortcut();
               }

               if (var10 == var5.meta[0]) {
                  var11 = var9;
                  if ((var4 & 2) == 0) {
                     return var11;
                  }
               }

               if (var10 == var5.meta[2]) {
                  var11 = var9;
                  if ((var4 & 2) != 0) {
                     return var11;
                  }
               }

               if (var7 && var10 == '\b') {
                  var11 = var9;
                  if (var1 == 67) {
                     return var11;
                  }
               }
            }

            var11 = null;
         }
      }

      return var11;
   }

   protected MenuItem a(int var1, int var2, int var3, CharSequence var4) {
      int var5 = e(var3);
      p var6 = this.a(var1, var2, var3, var5, var4, this.p);
      if (this.q != null) {
         var6.a(this.q);
      }

      this.j.add(a(this.j, var5), var6);
      this.b(true);
      return var6;
   }

   public void a(ab var1) {
      Iterator var2 = this.x.iterator();

      while(true) {
         WeakReference var3;
         ab var4;
         do {
            if (!var2.hasNext()) {
               return;
            }

            var3 = (WeakReference)var2.next();
            var4 = (ab)var3.get();
         } while(var4 != null && var4 != var1);

         this.x.remove(var3);
      }
   }

   public void a(ab var1, Context var2) {
      this.x.add(new WeakReference(var1));
      var1.a(var2, this);
      this.o = true;
   }

   public void a(n var1) {
      this.i = var1;
   }

   void a(p var1) {
      this.l = true;
      this.b(true);
   }

   void a(MenuItem var1) {
      int var2 = var1.getGroupId();
      int var3 = this.j.size();
      this.f();

      for(int var4 = 0; var4 < var3; ++var4) {
         p var5 = (p)this.j.get(var4);
         if (var5.getGroupId() == var2 && var5.g() && var5.isCheckable()) {
            boolean var6;
            if (var5 == var1) {
               var6 = true;
            } else {
               var6 = false;
            }

            var5.b(var6);
         }
      }

      this.g();
   }

   void a(List var1, int var2, KeyEvent var3) {
      boolean var4 = this.a();
      int var5 = var3.getMetaState();
      KeyData var6 = new KeyData();
      if (var3.getKeyData(var6) || var2 == 67) {
         int var7 = this.j.size();

         for(int var8 = 0; var8 < var7; ++var8) {
            p var9 = (p)this.j.get(var8);
            if (var9.hasSubMenu()) {
               ((m)var9.getSubMenu()).a(var1, var2, var3);
            }

            char var10;
            if (var4) {
               var10 = var9.getAlphabeticShortcut();
            } else {
               var10 = var9.getNumericShortcut();
            }

            if ((var5 & 5) == 0 && var10 != 0 && (var10 == var6.meta[0] || var10 == var6.meta[2] || var4 && var10 == '\b' && var2 == 67) && var9.isEnabled()) {
               var1.add(var9);
            }
         }
      }

   }

   public final void a(boolean var1) {
      if (!this.v) {
         this.v = true;
         Iterator var2 = this.x.iterator();

         while(var2.hasNext()) {
            WeakReference var3 = (WeakReference)var2.next();
            ab var4 = (ab)var3.get();
            if (var4 == null) {
               this.x.remove(var3);
            } else {
               var4.a(this, var1);
            }
         }

         this.v = false;
      }

   }

   boolean a() {
      return this.g;
   }

   boolean a(m var1, MenuItem var2) {
      boolean var3;
      if (this.i != null && this.i.a(var1, var2)) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public boolean a(MenuItem var1, int var2) {
      return this.a(var1, (ab)null, var2);
   }

   public boolean a(MenuItem var1, ab var2, int var3) {
      boolean var4 = false;
      p var5 = (p)var1;
      boolean var6 = var4;
      if (var5 != null) {
         if (!var5.isEnabled()) {
            var6 = var4;
         } else {
            var6 = var5.b();
            android.support.v4.view.q var8 = var5.a();
            boolean var7;
            if (var8 != null && var8.e()) {
               var7 = true;
            } else {
               var7 = false;
            }

            if (var5.n()) {
               var4 = var5.expandActionView() | var6;
               var6 = var4;
               if (var4) {
                  this.a(true);
                  var6 = var4;
               }
            } else if (!var5.hasSubMenu() && !var7) {
               if ((var3 & 1) == 0) {
                  this.a(true);
               }
            } else {
               if ((var3 & 4) == 0) {
                  this.a(false);
               }

               if (!var5.hasSubMenu()) {
                  var5.a(new ak(this.d(), this, var5));
               }

               ak var9 = (ak)var5.getSubMenu();
               if (var7) {
                  var8.a((SubMenu)var9);
               }

               var4 = this.a(var9, var2) | var6;
               var6 = var4;
               if (!var4) {
                  this.a(true);
                  var6 = var4;
               }
            }
         }
      }

      return var6;
   }

   public MenuItem add(int var1) {
      return this.a(0, 0, 0, this.f.getString(var1));
   }

   public MenuItem add(int var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, this.f.getString(var4));
   }

   public MenuItem add(int var1, int var2, int var3, CharSequence var4) {
      return this.a(var1, var2, var3, var4);
   }

   public MenuItem add(CharSequence var1) {
      return this.a(0, 0, 0, var1);
   }

   public int addIntentOptions(int var1, int var2, int var3, ComponentName var4, Intent[] var5, Intent var6, int var7, MenuItem[] var8) {
      PackageManager var9 = this.e.getPackageManager();
      List var10 = var9.queryIntentActivityOptions(var4, var5, var6, 0);
      int var11;
      if (var10 != null) {
         var11 = var10.size();
      } else {
         var11 = 0;
      }

      if ((var7 & 1) == 0) {
         this.removeGroup(var1);
      }

      for(var7 = 0; var7 < var11; ++var7) {
         ResolveInfo var12 = (ResolveInfo)var10.get(var7);
         Intent var13;
         if (var12.specificIndex < 0) {
            var13 = var6;
         } else {
            var13 = var5[var12.specificIndex];
         }

         var13 = new Intent(var13);
         var13.setComponent(new ComponentName(var12.activityInfo.applicationInfo.packageName, var12.activityInfo.name));
         MenuItem var14 = this.add(var1, var2, var3, var12.loadLabel(var9)).setIcon(var12.loadIcon(var9)).setIntent(var13);
         if (var8 != null && var12.specificIndex >= 0) {
            var8[var12.specificIndex] = var14;
         }
      }

      return var11;
   }

   public SubMenu addSubMenu(int var1) {
      return this.addSubMenu(0, 0, 0, this.f.getString(var1));
   }

   public SubMenu addSubMenu(int var1, int var2, int var3, int var4) {
      return this.addSubMenu(var1, var2, var3, this.f.getString(var4));
   }

   public SubMenu addSubMenu(int var1, int var2, int var3, CharSequence var4) {
      p var6 = (p)this.a(var1, var2, var3, var4);
      ak var5 = new ak(this.e, this, var6);
      var6.a(var5);
      return var5;
   }

   public SubMenu addSubMenu(CharSequence var1) {
      return this.addSubMenu(0, 0, 0, var1);
   }

   public int b(int var1) {
      return this.a(var1, 0);
   }

   void b(p var1) {
      this.o = true;
      this.b(true);
   }

   public void b(boolean var1) {
      if (!this.r) {
         if (var1) {
            this.l = true;
            this.o = true;
         }

         this.c(var1);
      } else {
         this.s = true;
         if (var1) {
            this.t = true;
         }
      }

   }

   public boolean b() {
      return this.h;
   }

   Resources c() {
      return this.f;
   }

   protected m c(int var1) {
      this.a(var1, (CharSequence)null, 0, (Drawable)null, (View)null);
      return this;
   }

   public boolean c(p var1) {
      boolean var2 = false;
      if (!this.x.isEmpty()) {
         this.f();
         Iterator var3 = this.x.iterator();
         boolean var4 = false;

         while(var3.hasNext()) {
            WeakReference var5 = (WeakReference)var3.next();
            ab var6 = (ab)var5.get();
            if (var6 == null) {
               this.x.remove(var5);
            } else {
               var2 = var6.a(this, var1);
               var4 = var2;
               if (var2) {
                  var4 = var2;
                  break;
               }
            }
         }

         this.g();
         var2 = var4;
         if (var4) {
            this.y = var1;
            var2 = var4;
         }
      }

      return var2;
   }

   public void clear() {
      if (this.y != null) {
         this.d(this.y);
      }

      this.j.clear();
      this.b(true);
   }

   public void clearHeader() {
      this.b = null;
      this.a = null;
      this.c = null;
      this.b(false);
   }

   public void close() {
      this.a(true);
   }

   public Context d() {
      return this.e;
   }

   protected m d(int var1) {
      this.a(0, (CharSequence)null, var1, (Drawable)null, (View)null);
      return this;
   }

   public boolean d(p var1) {
      boolean var2 = false;
      boolean var3 = var2;
      if (!this.x.isEmpty()) {
         if (this.y != var1) {
            var3 = var2;
         } else {
            this.f();
            Iterator var4 = this.x.iterator();
            var2 = false;

            while(var4.hasNext()) {
               WeakReference var5 = (WeakReference)var4.next();
               ab var6 = (ab)var5.get();
               if (var6 == null) {
                  this.x.remove(var5);
               } else {
                  var3 = var6.b(this, var1);
                  var2 = var3;
                  if (var3) {
                     var2 = var3;
                     break;
                  }
               }
            }

            this.g();
            var3 = var2;
            if (var2) {
               this.y = null;
               var3 = var2;
            }
         }
      }

      return var3;
   }

   public void e() {
      if (this.i != null) {
         this.i.a(this);
      }

   }

   public void f() {
      if (!this.r) {
         this.r = true;
         this.s = false;
         this.t = false;
      }

   }

   public MenuItem findItem(int var1) {
      int var2 = this.size();
      int var3 = 0;

      Object var4;
      while(true) {
         if (var3 >= var2) {
            var4 = null;
            break;
         }

         var4 = (p)this.j.get(var3);
         if (((p)var4).getItemId() == var1) {
            break;
         }

         if (((p)var4).hasSubMenu()) {
            MenuItem var5 = ((p)var4).getSubMenu().findItem(var1);
            var4 = var5;
            if (var5 != null) {
               break;
            }
         }

         ++var3;
      }

      return (MenuItem)var4;
   }

   public void g() {
      this.r = false;
      if (this.s) {
         this.s = false;
         this.b(this.t);
      }

   }

   public MenuItem getItem(int var1) {
      return (MenuItem)this.j.get(var1);
   }

   public ArrayList h() {
      ArrayList var1;
      if (!this.l) {
         var1 = this.k;
      } else {
         this.k.clear();
         int var2 = this.j.size();

         for(int var3 = 0; var3 < var2; ++var3) {
            p var4 = (p)this.j.get(var3);
            if (var4.isVisible()) {
               this.k.add(var4);
            }
         }

         this.l = false;
         this.o = true;
         var1 = this.k;
      }

      return var1;
   }

   public boolean hasVisibleItems() {
      boolean var1;
      if (this.z) {
         var1 = true;
      } else {
         int var2 = this.size();
         int var3 = 0;

         while(true) {
            if (var3 >= var2) {
               var1 = false;
               break;
            }

            if (((p)this.j.get(var3)).isVisible()) {
               var1 = true;
               break;
            }

            ++var3;
         }
      }

      return var1;
   }

   public void i() {
      ArrayList var1 = this.h();
      if (this.o) {
         Iterator var2 = this.x.iterator();
         boolean var3 = false;

         while(var2.hasNext()) {
            WeakReference var4 = (WeakReference)var2.next();
            ab var5 = (ab)var4.get();
            if (var5 == null) {
               this.x.remove(var4);
            } else {
               var3 |= var5.b();
            }
         }

         if (var3) {
            this.m.clear();
            this.n.clear();
            int var6 = var1.size();

            for(int var7 = 0; var7 < var6; ++var7) {
               p var8 = (p)var1.get(var7);
               if (var8.j()) {
                  this.m.add(var8);
               } else {
                  this.n.add(var8);
               }
            }
         } else {
            this.m.clear();
            this.n.clear();
            this.n.addAll(this.h());
         }

         this.o = false;
      }

   }

   public boolean isShortcutKey(int var1, KeyEvent var2) {
      boolean var3;
      if (this.a(var1, var2) != null) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public ArrayList j() {
      this.i();
      return this.m;
   }

   public ArrayList k() {
      this.i();
      return this.n;
   }

   public CharSequence l() {
      return this.a;
   }

   public m m() {
      return this;
   }

   boolean n() {
      return this.u;
   }

   public p o() {
      return this.y;
   }

   public boolean performIdentifierAction(int var1, int var2) {
      return this.a(this.findItem(var1), var2);
   }

   public boolean performShortcut(int var1, KeyEvent var2, int var3) {
      p var5 = this.a(var1, var2);
      boolean var4 = false;
      if (var5 != null) {
         var4 = this.a((MenuItem)var5, var3);
      }

      if ((var3 & 2) != 0) {
         this.a(true);
      }

      return var4;
   }

   public void removeGroup(int var1) {
      int var2 = this.b(var1);
      if (var2 >= 0) {
         int var3 = this.j.size();

         for(int var4 = 0; var4 < var3 - var2 && ((p)this.j.get(var2)).getGroupId() == var1; ++var4) {
            this.a(var2, false);
         }

         this.b(true);
      }

   }

   public void removeItem(int var1) {
      this.a(this.a(var1), true);
   }

   public void setGroupCheckable(int var1, boolean var2, boolean var3) {
      int var4 = this.j.size();

      for(int var5 = 0; var5 < var4; ++var5) {
         p var6 = (p)this.j.get(var5);
         if (var6.getGroupId() == var1) {
            var6.a(var3);
            var6.setCheckable(var2);
         }
      }

   }

   public void setGroupEnabled(int var1, boolean var2) {
      int var3 = this.j.size();

      for(int var4 = 0; var4 < var3; ++var4) {
         p var5 = (p)this.j.get(var4);
         if (var5.getGroupId() == var1) {
            var5.setEnabled(var2);
         }
      }

   }

   public void setGroupVisible(int var1, boolean var2) {
      int var3 = this.j.size();
      int var4 = 0;

      boolean var5;
      for(var5 = false; var4 < var3; ++var4) {
         p var6 = (p)this.j.get(var4);
         if (var6.getGroupId() == var1 && var6.c(var2)) {
            var5 = true;
         }
      }

      if (var5) {
         this.b(true);
      }

   }

   public void setQwertyMode(boolean var1) {
      this.g = var1;
      this.b(false);
   }

   public int size() {
      return this.j.size();
   }
}
