package android.support.v7.widget;

import android.util.SparseArray;
import java.util.ArrayList;

public class ek {
   SparseArray a = new SparseArray();
   private int b = 0;

   private el b(int var1) {
      el var2 = (el)this.a.get(var1);
      el var3 = var2;
      if (var2 == null) {
         var3 = new el();
         this.a.put(var1, var3);
      }

      return var3;
   }

   long a(long var1, long var3) {
      if (var1 != 0L) {
         var3 = var1 / 4L * 3L + var3 / 4L;
      }

      return var3;
   }

   public ey a(int var1) {
      el var2 = (el)this.a.get(var1);
      ey var3;
      if (var2 != null && !var2.a.isEmpty()) {
         ArrayList var4 = var2.a;
         var3 = (ey)var4.remove(var4.size() - 1);
      } else {
         var3 = null;
      }

      return var3;
   }

   public void a() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         ((el)this.a.valueAt(var1)).a.clear();
      }

   }

   void a(int var1, long var2) {
      el var4 = this.b(var1);
      var4.c = this.a(var4.c, var2);
   }

   void a(ds var1) {
      ++this.b;
   }

   void a(ds var1, ds var2, boolean var3) {
      if (var1 != null) {
         this.b();
      }

      if (!var3 && this.b == 0) {
         this.a();
      }

      if (var2 != null) {
         this.a(var2);
      }

   }

   public void a(ey var1) {
      int var2 = var1.i();
      ArrayList var3 = this.b(var2).a;
      if (((el)this.a.get(var2)).b > var3.size()) {
         var1.w();
         var3.add(var1);
      }

   }

   boolean a(int var1, long var2, long var4) {
      long var6 = this.b(var1).c;
      boolean var8;
      if (var6 != 0L && var6 + var2 >= var4) {
         var8 = false;
      } else {
         var8 = true;
      }

      return var8;
   }

   void b() {
      --this.b;
   }

   void b(int var1, long var2) {
      el var4 = this.b(var1);
      var4.d = this.a(var4.d, var2);
   }

   boolean b(int var1, long var2, long var4) {
      long var6 = this.b(var1).d;
      boolean var8;
      if (var6 != 0L && var6 + var2 >= var4) {
         var8 = false;
      } else {
         var8 = true;
      }

      return var8;
   }
}
