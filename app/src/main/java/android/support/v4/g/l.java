package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

final class l implements Set {
   // $FF: synthetic field
   final j a;

   l(j var1) {
      this.a = var1;
   }

   public boolean a(Entry var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: synthetic method
   public boolean add(Object var1) {
      return this.a((Entry)var1);
   }

   public boolean addAll(Collection var1) {
      int var2 = this.a.a();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Entry var5 = (Entry)var3.next();
         this.a.a(var5.getKey(), var5.getValue());
      }

      boolean var4;
      if (var2 != this.a.a()) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   public void clear() {
      this.a.c();
   }

   public boolean contains(Object var1) {
      boolean var2 = false;
      if (var1 instanceof Entry) {
         Entry var4 = (Entry)var1;
         int var3 = this.a.a(var4.getKey());
         if (var3 >= 0) {
            var2 = e.a(this.a.a(var3, 1), var4.getValue());
         }
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
      return j.a((Set)this, (Object)var1);
   }

   public int hashCode() {
      int var1 = this.a.a() - 1;

      int var2;
      int var5;
      int var6;
      for(var2 = 0; var1 >= 0; var2 += var6 ^ var5) {
         Object var3 = this.a.a(var1, 0);
         Object var4 = this.a.a(var1, 1);
         if (var3 == null) {
            var5 = 0;
         } else {
            var5 = var3.hashCode();
         }

         if (var4 == null) {
            var6 = 0;
         } else {
            var6 = var4.hashCode();
         }

         --var1;
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
      return new n(this.a);
   }

   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   public boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public int size() {
      return this.a.a();
   }

   public Object[] toArray() {
      throw new UnsupportedOperationException();
   }

   public Object[] toArray(Object[] var1) {
      throw new UnsupportedOperationException();
   }
}
