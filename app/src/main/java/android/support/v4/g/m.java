package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class m implements Set {
   // $FF: synthetic field
   final j a;

   m(j var1) {
      this.a = var1;
   }

   public boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   public boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public void clear() {
      this.a.c();
   }

   public boolean contains(Object var1) {
      boolean var2;
      if (this.a.a(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean containsAll(Collection var1) {
      return j.a(this.a.b(), var1);
   }

   public boolean equals(Object var1) {
      return j.a((Set)this, (Object)var1);
   }

   public int hashCode() {
      int var1 = this.a.a() - 1;

      int var2;
      for(var2 = 0; var1 >= 0; --var1) {
         Object var3 = this.a.a(var1, 0);
         int var4;
         if (var3 == null) {
            var4 = 0;
         } else {
            var4 = var3.hashCode();
         }

         var2 += var4;
      }

      return var2;
   }

   public boolean isEmpty() {
      boolean var1;
      if (this.a.a() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public Iterator iterator() {
      return new k(this.a, 0);
   }

   public boolean remove(Object var1) {
      int var2 = this.a.a(var1);
      boolean var3;
      if (var2 >= 0) {
         this.a.a(var2);
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public boolean removeAll(Collection var1) {
      return j.b(this.a.b(), var1);
   }

   public boolean retainAll(Collection var1) {
      return j.c(this.a.b(), var1);
   }

   public int size() {
      return this.a.a();
   }

   public Object[] toArray() {
      return this.a.b(0);
   }

   public Object[] toArray(Object[] var1) {
      return this.a.a(var1, 0);
   }
}
