package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c implements Collection, Set {
   static Object[] a;
   static int b;
   static Object[] c;
   static int d;
   private static final int[] j = new int[0];
   private static final Object[] k = new Object[0];
   final boolean e;
   int[] f;
   Object[] g;
   int h;
   j i;

   public c() {
      this(0, false);
   }

   public c(int var1, boolean var2) {
      this.e = var2;
      if (var1 == 0) {
         this.f = j;
         this.g = k;
      } else {
         this.d(var1);
      }

      this.h = 0;
   }

   private int a() {
      int var1 = this.h;
      int var2;
      if (var1 == 0) {
         var2 = -1;
      } else {
         int var3 = android.support.v4.g.e.a(this.f, var1, 0);
         var2 = var3;
         if (var3 >= 0) {
            var2 = var3;
            if (this.g[var3] != null) {
               int var4;
               for(var4 = var3 + 1; var4 < var1 && this.f[var4] == 0; ++var4) {
                  if (this.g[var4] == null) {
                     var2 = var4;
                     return var2;
                  }
               }

               --var3;

               while(var3 >= 0 && this.f[var3] == 0) {
                  var2 = var3;
                  if (this.g[var3] == null) {
                     return var2;
                  }

                  --var3;
               }

               var2 = ~var4;
            }
         }
      }

      return var2;
   }

   private int a(Object var1, int var2) {
      int var3 = this.h;
      int var4;
      if (var3 == 0) {
         var4 = -1;
      } else {
         int var5 = android.support.v4.g.e.a(this.f, var3, var2);
         var4 = var5;
         if (var5 >= 0) {
            var4 = var5;
            if (!var1.equals(this.g[var5])) {
               int var6;
               for(var6 = var5 + 1; var6 < var3 && this.f[var6] == var2; ++var6) {
                  if (var1.equals(this.g[var6])) {
                     var4 = var6;
                     return var4;
                  }
               }

               --var5;

               while(var5 >= 0 && this.f[var5] == var2) {
                  var4 = var5;
                  if (var1.equals(this.g[var5])) {
                     return var4;
                  }

                  --var5;
               }

               var4 = ~var6;
            }
         }
      }

      return var4;
   }

   private static void a(int[] param0, Object[] param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private j b() {
      if (this.i == null) {
         this.i = new d(this);
      }

      return this.i;
   }

   private void d(int param1) {
      // $FF: Couldn't be decompiled
   }

   public int a(Object var1) {
      int var2;
      if (var1 == null) {
         var2 = this.a();
      } else {
         if (this.e) {
            var2 = System.identityHashCode(var1);
         } else {
            var2 = var1.hashCode();
         }

         var2 = this.a(var1, var2);
      }

      return var2;
   }

   public void a(int var1) {
      if (this.f.length < var1) {
         int[] var2 = this.f;
         Object[] var3 = this.g;
         this.d(var1);
         if (this.h > 0) {
            System.arraycopy(var2, 0, this.f, 0, this.h);
            System.arraycopy(var3, 0, this.g, 0, this.h);
         }

         a(var2, var3, this.h);
      }

   }

   public boolean add(Object var1) {
      int var2;
      int var3;
      int var5;
      if (var1 == null) {
         var2 = this.a();
         var3 = 0;
      } else {
         if (this.e) {
            var5 = System.identityHashCode(var1);
         } else {
            var5 = var1.hashCode();
         }

         var2 = this.a(var1, var5);
         var3 = var5;
      }

      boolean var4;
      if (var2 >= 0) {
         var4 = false;
      } else {
         var2 = ~var2;
         if (this.h >= this.f.length) {
            if (this.h >= 8) {
               var5 = this.h + (this.h >> 1);
            } else if (this.h >= 4) {
               var5 = 8;
            } else {
               var5 = 4;
            }

            int[] var6 = this.f;
            Object[] var7 = this.g;
            this.d(var5);
            if (this.f.length > 0) {
               System.arraycopy(var6, 0, this.f, 0, var6.length);
               System.arraycopy(var7, 0, this.g, 0, var7.length);
            }

            a(var6, var7, this.h);
         }

         if (var2 < this.h) {
            System.arraycopy(this.f, var2, this.f, var2 + 1, this.h - var2);
            System.arraycopy(this.g, var2, this.g, var2 + 1, this.h - var2);
         }

         this.f[var2] = var3;
         this.g[var2] = var1;
         ++this.h;
         var4 = true;
      }

      return var4;
   }

   public boolean addAll(Collection var1) {
      this.a(this.h + var1.size());
      boolean var2 = false;

      for(Iterator var3 = var1.iterator(); var3.hasNext(); var2 |= this.add(var3.next())) {
      }

      return var2;
   }

   public Object b(int var1) {
      return this.g[var1];
   }

   public Object c(int var1) {
      int var2 = 8;
      Object var3 = this.g[var1];
      if (this.h <= 1) {
         a(this.f, this.g, this.h);
         this.f = j;
         this.g = k;
         this.h = 0;
      } else if (this.f.length > 8 && this.h < this.f.length / 3) {
         if (this.h > 8) {
            var2 = this.h + (this.h >> 1);
         }

         int[] var4 = this.f;
         Object[] var5 = this.g;
         this.d(var2);
         --this.h;
         if (var1 > 0) {
            System.arraycopy(var4, 0, this.f, 0, var1);
            System.arraycopy(var5, 0, this.g, 0, var1);
         }

         if (var1 < this.h) {
            System.arraycopy(var4, var1 + 1, this.f, var1, this.h - var1);
            System.arraycopy(var5, var1 + 1, this.g, var1, this.h - var1);
         }
      } else {
         --this.h;
         if (var1 < this.h) {
            System.arraycopy(this.f, var1 + 1, this.f, var1, this.h - var1);
            System.arraycopy(this.g, var1 + 1, this.g, var1, this.h - var1);
         }

         this.g[this.h] = null;
      }

      return var3;
   }

   public void clear() {
      if (this.h != 0) {
         a(this.f, this.g, this.h);
         this.f = j;
         this.g = k;
         this.h = 0;
      }

   }

   public boolean contains(Object var1) {
      boolean var2;
      if (this.a(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean containsAll(Collection var1) {
      Iterator var3 = var1.iterator();

      boolean var2;
      while(true) {
         if (var3.hasNext()) {
            if (this.contains(var3.next())) {
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

   public boolean equals(Object var1) {
      boolean var2 = true;
      boolean var3;
      if (this == var1) {
         var3 = var2;
      } else if (var1 instanceof Set) {
         Set var7 = (Set)var1;
         if (this.size() != var7.size()) {
            var3 = false;
         } else {
            int var4 = 0;

            while(true) {
               var3 = var2;

               try {
                  if (var4 >= this.h) {
                     break;
                  }

                  var3 = var7.contains(this.b(var4));
               } catch (NullPointerException var5) {
                  var3 = false;
                  break;
               } catch (ClassCastException var6) {
                  var3 = false;
                  break;
               }

               if (!var3) {
                  var3 = false;
                  break;
               }

               ++var4;
            }
         }
      } else {
         var3 = false;
      }

      return var3;
   }

   public int hashCode() {
      int var1 = 0;
      int[] var2 = this.f;
      int var3 = this.h;

      int var4;
      for(var4 = 0; var1 < var3; ++var1) {
         var4 += var2[var1];
      }

      return var4;
   }

   public boolean isEmpty() {
      boolean var1;
      if (this.h <= 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public Iterator iterator() {
      return this.b().e().iterator();
   }

   public boolean remove(Object var1) {
      int var2 = this.a(var1);
      boolean var3;
      if (var2 >= 0) {
         this.c(var2);
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public boolean removeAll(Collection var1) {
      boolean var2 = false;

      for(Iterator var3 = var1.iterator(); var3.hasNext(); var2 |= this.remove(var3.next())) {
      }

      return var2;
   }

   public boolean retainAll(Collection var1) {
      int var2 = this.h;
      boolean var3 = false;
      --var2;

      for(; var2 >= 0; --var2) {
         if (!var1.contains(this.g[var2])) {
            this.c(var2);
            var3 = true;
         }
      }

      return var3;
   }

   public int size() {
      return this.h;
   }

   public Object[] toArray() {
      Object[] var1 = new Object[this.h];
      System.arraycopy(this.g, 0, var1, 0, this.h);
      return var1;
   }

   public Object[] toArray(Object[] var1) {
      if (var1.length < this.h) {
         var1 = (Object[])Array.newInstance(var1.getClass().getComponentType(), this.h);
      }

      System.arraycopy(this.g, 0, var1, 0, this.h);
      if (var1.length > this.h) {
         var1[this.h] = null;
      }

      return var1;
   }

   public String toString() {
      String var1;
      if (this.isEmpty()) {
         var1 = "{}";
      } else {
         StringBuilder var4 = new StringBuilder(this.h * 14);
         var4.append('{');

         for(int var2 = 0; var2 < this.h; ++var2) {
            if (var2 > 0) {
               var4.append(", ");
            }

            Object var3 = this.b(var2);
            if (var3 != this) {
               var4.append(var3);
            } else {
               var4.append("(this Set)");
            }
         }

         var4.append('}');
         var1 = var4.toString();
      }

      return var1;
   }
}
