package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class j {
   l b;
   m c;
   o d;

   public static boolean a(Map var0, Collection var1) {
      Iterator var3 = var1.iterator();

      boolean var2;
      while(true) {
         if (var3.hasNext()) {
            if (var0.containsKey(var3.next())) {
               continue;
            }

            var2 = false;
            break;
         }

         var2 = true;
         break;
      }

      return var2;
   }

   public static boolean a(Set var0, Object var1) {
      boolean var2 = true;
      boolean var3 = false;
      boolean var4;
      if (var0 == var1) {
         var4 = true;
      } else {
         var4 = var3;
         if (var1 instanceof Set) {
            Set var7 = (Set)var1;

            label26: {
               try {
                  if (var0.size() != var7.size()) {
                     break label26;
                  }

                  var4 = var0.containsAll(var7);
               } catch (NullPointerException var5) {
                  var4 = var3;
                  return var4;
               } catch (ClassCastException var6) {
                  var4 = var3;
                  return var4;
               }

               if (var4) {
                  var4 = var2;
                  return var4;
               }
            }

            var4 = false;
         }
      }

      return var4;
   }

   public static boolean b(Map var0, Collection var1) {
      int var2 = var0.size();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         var0.remove(var4.next());
      }

      boolean var3;
      if (var2 != var0.size()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public static boolean c(Map var0, Collection var1) {
      int var2 = var0.size();
      Iterator var3 = var0.keySet().iterator();

      while(var3.hasNext()) {
         if (!var1.contains(var3.next())) {
            var3.remove();
         }
      }

      boolean var4;
      if (var2 != var0.size()) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   protected abstract int a();

   protected abstract int a(Object var1);

   protected abstract Object a(int var1, int var2);

   protected abstract Object a(int var1, Object var2);

   protected abstract void a(int var1);

   protected abstract void a(Object var1, Object var2);

   public Object[] a(Object[] var1, int var2) {
      int var3 = this.a();
      if (var1.length < var3) {
         var1 = (Object[])Array.newInstance(var1.getClass().getComponentType(), var3);
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4] = this.a(var4, var2);
      }

      if (var1.length > var3) {
         var1[var3] = null;
      }

      return var1;
   }

   protected abstract int b(Object var1);

   protected abstract Map b();

   public Object[] b(int var1) {
      int var2 = this.a();
      Object[] var3 = new Object[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = this.a(var4, var1);
      }

      return var3;
   }

   protected abstract void c();

   public Set d() {
      if (this.b == null) {
         this.b = new l(this);
      }

      return this.b;
   }

   public Set e() {
      if (this.c == null) {
         this.c = new m(this);
      }

      return this.c;
   }

   public Collection f() {
      if (this.d == null) {
         this.d = new o(this);
      }

      return this.d;
   }
}
