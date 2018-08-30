package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

final class cd implements Runnable {
   static final ThreadLocal a = new ThreadLocal();
   static Comparator e = new ce();
   ArrayList b = new ArrayList();
   long c;
   long d;
   private ArrayList f = new ArrayList();

   private ey a(dl var1, int var2, long var3) {
      ey var7;
      if (a(var1, var2)) {
         var7 = null;
      } else {
         em var5 = var1.d;
         ey var6 = var5.a(var2, false, var3);
         var7 = var6;
         if (var6 != null) {
            if (var6.q()) {
               var5.a(var6.a);
               var7 = var6;
            } else {
               var5.a(var6, false);
               var7 = var6;
            }
         }
      }

      return var7;
   }

   private void a() {
      int var1 = this.b.size();
      int var2 = 0;

      int var3;
      for(var3 = 0; var2 < var1; ++var2) {
         dl var4 = (dl)this.b.get(var2);
         var4.z.a(var4, false);
         var3 += var4.z.d;
      }

      this.f.ensureCapacity(var3);
      var2 = 0;

      for(var3 = 0; var2 < var1; ++var2) {
         dl var5 = (dl)this.b.get(var2);
         cf var6 = var5.z;
         int var7 = Math.abs(var6.a) + Math.abs(var6.b);

         for(int var8 = 0; var8 < var6.d * 2; var8 += 2) {
            cg var11;
            if (var3 >= this.f.size()) {
               var11 = new cg();
               this.f.add(var11);
            } else {
               var11 = (cg)this.f.get(var3);
            }

            int var9 = var6.c[var8 + 1];
            boolean var10;
            if (var9 <= var7) {
               var10 = true;
            } else {
               var10 = false;
            }

            var11.a = var10;
            var11.b = var7;
            var11.c = var9;
            var11.d = var5;
            var11.e = var6.c[var8];
            ++var3;
         }
      }

      Collections.sort(this.f, e);
   }

   private void a(cg var1, long var2) {
      long var4;
      if (var1.a) {
         var4 = Long.MAX_VALUE;
      } else {
         var4 = var2;
      }

      ey var6 = this.a(var1.d, var1.e, var4);
      if (var6 != null && var6.b != null) {
         this.a((dl)var6.b.get(), var2);
      }

   }

   private void a(dl param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   static boolean a(dl var0, int var1) {
      boolean var2 = false;
      int var3 = var0.f.c();
      int var4 = 0;

      boolean var5;
      while(true) {
         var5 = var2;
         if (var4 >= var3) {
            break;
         }

         ey var6 = dl.e(var0.f.d(var4));
         if (var6.c == var1 && !var6.o()) {
            var5 = true;
            break;
         }

         ++var4;
      }

      return var5;
   }

   private void b(long var1) {
      for(int var3 = 0; var3 < this.f.size(); ++var3) {
         cg var4 = (cg)this.f.get(var3);
         if (var4.d == null) {
            break;
         }

         this.a(var4, var1);
         var4.a();
      }

   }

   void a(long var1) {
      this.a();
      this.b(var1);
   }

   public void a(dl var1) {
      this.b.add(var1);
   }

   void a(dl var1, int var2, int var3) {
      if (var1.isAttachedToWindow() && this.c == 0L) {
         this.c = var1.getNanoTime();
         var1.post(this);
      }

      var1.z.a(var2, var3);
   }

   public void b(dl var1) {
      this.b.remove(var1);
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }
}
