package android.support.v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

abstract class e extends f {
   final Context a;
   private Map c;
   private Map d;

   e(Context var1, Object var2) {
      super(var2);
      this.a = var1;
   }

   final MenuItem a(MenuItem var1) {
      if (var1 instanceof android.support.v4.e.a.b) {
         android.support.v4.e.a.b var2 = (android.support.v4.e.a.b)var1;
         if (this.c == null) {
            this.c = new android.support.v4.g.a();
         }

         MenuItem var3 = (MenuItem)this.c.get(var1);
         var1 = var3;
         if (var3 == null) {
            var1 = af.a(this.a, var2);
            this.c.put(var2, var1);
         }
      }

      return var1;
   }

   final SubMenu a(SubMenu var1) {
      if (var1 instanceof android.support.v4.e.a.c) {
         android.support.v4.e.a.c var2 = (android.support.v4.e.a.c)var1;
         if (this.d == null) {
            this.d = new android.support.v4.g.a();
         }

         SubMenu var3 = (SubMenu)this.d.get(var2);
         var1 = var3;
         if (var3 == null) {
            var1 = af.a(this.a, var2);
            this.d.put(var2, var1);
         }
      }

      return var1;
   }

   final void a() {
      if (this.c != null) {
         this.c.clear();
      }

      if (this.d != null) {
         this.d.clear();
      }

   }

   final void a(int var1) {
      if (this.c != null) {
         Iterator var2 = this.c.keySet().iterator();

         while(var2.hasNext()) {
            if (var1 == ((MenuItem)var2.next()).getGroupId()) {
               var2.remove();
            }
         }
      }

   }

   final void b(int var1) {
      if (this.c != null) {
         Iterator var2 = this.c.keySet().iterator();

         while(var2.hasNext()) {
            if (var1 == ((MenuItem)var2.next()).getItemId()) {
               var2.remove();
               break;
            }
         }
      }

   }
}
