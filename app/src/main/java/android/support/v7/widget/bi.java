package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bi extends fq {
   ArrayList a = new ArrayList();
   ArrayList b = new ArrayList();
   ArrayList c = new ArrayList();
   ArrayList d = new ArrayList();
   ArrayList e = new ArrayList();
   ArrayList f = new ArrayList();
   ArrayList g = new ArrayList();
   private ArrayList i = new ArrayList();
   private ArrayList j = new ArrayList();
   private ArrayList k = new ArrayList();
   private ArrayList l = new ArrayList();

   private void a(List var1, ey var2) {
      for(int var3 = var1.size() - 1; var3 >= 0; --var3) {
         br var4 = (br)var1.get(var3);
         if (this.a(var4, var2) && var4.a == null && var4.b == null) {
            var1.remove(var4);
         }
      }

   }

   private boolean a(br var1, ey var2) {
      boolean var3 = false;
      boolean var4 = false;
      if (var1.b == var2) {
         var1.b = null;
      } else {
         var4 = var3;
         if (var1.a != var2) {
            return var4;
         }

         var1.a = null;
         var4 = true;
      }

      android.support.v4.view.bz.c(var2.a, 1.0F);
      android.support.v4.view.bz.a(var2.a, 0.0F);
      android.support.v4.view.bz.b(var2.a, 0.0F);
      this.a(var2, var4);
      var4 = true;
      return var4;
   }

   private void b(br var1) {
      if (var1.a != null) {
         this.a(var1, var1.a);
      }

      if (var1.b != null) {
         this.a(var1, var1.b);
      }

   }

   private void u(ey var1) {
      android.support.v4.view.dy var2 = android.support.v4.view.bz.p(var1.a);
      this.f.add(var1);
      var2.a(this.g()).a(0.0F).a(new bm(this, var1, var2)).b();
   }

   private void v(ey var1) {
      android.support.v4.a.a.a(var1.a);
      this.d(var1);
   }

   public void a() {
      boolean var1;
      if (!this.i.isEmpty()) {
         var1 = true;
      } else {
         var1 = false;
      }

      boolean var2;
      if (!this.k.isEmpty()) {
         var2 = true;
      } else {
         var2 = false;
      }

      boolean var3;
      if (!this.l.isEmpty()) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4;
      if (!this.j.isEmpty()) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var1 || var2 || var4 || var3) {
         Iterator var5 = this.i.iterator();

         while(var5.hasNext()) {
            this.u((ey)var5.next());
         }

         this.i.clear();
         ArrayList var13;
         if (var2) {
            var13 = new ArrayList();
            var13.addAll(this.k);
            this.b.add(var13);
            this.k.clear();
            bj var6 = new bj(this, var13);
            if (var1) {
               android.support.v4.view.bz.a(((bs)var13.get(0)).a.a, var6, this.g());
            } else {
               var6.run();
            }
         }

         if (var3) {
            var13 = new ArrayList();
            var13.addAll(this.l);
            this.c.add(var13);
            this.l.clear();
            bk var15 = new bk(this, var13);
            if (var1) {
               android.support.v4.view.bz.a(((br)var13.get(0)).a.a, var15, this.g());
            } else {
               var15.run();
            }
         }

         if (var4) {
            ArrayList var16 = new ArrayList();
            var16.addAll(this.j);
            this.a.add(var16);
            this.j.clear();
            bl var14 = new bl(this, var16);
            if (!var1 && !var2 && !var3) {
               var14.run();
            } else {
               long var7;
               if (var1) {
                  var7 = this.g();
               } else {
                  var7 = 0L;
               }

               long var9;
               if (var2) {
                  var9 = this.e();
               } else {
                  var9 = 0L;
               }

               long var11;
               if (var3) {
                  var11 = this.h();
               } else {
                  var11 = 0L;
               }

               var9 = Math.max(var9, var11);
               android.support.v4.view.bz.a(((ey)var16.get(0)).a, var14, var7 + var9);
            }
         }
      }

   }

   void a(br var1) {
      View var2 = null;
      ey var3 = var1.a;
      View var5;
      if (var3 == null) {
         var5 = null;
      } else {
         var5 = var3.a;
      }

      ey var4 = var1.b;
      if (var4 != null) {
         var2 = var4.a;
      }

      android.support.v4.view.dy var6;
      if (var5 != null) {
         var6 = android.support.v4.view.bz.p(var5).a(this.h());
         this.g.add(var1.a);
         var6.b((float)(var1.e - var1.c));
         var6.c((float)(var1.f - var1.d));
         var6.a(0.0F).a(new bp(this, var1, var6)).b();
      }

      if (var2 != null) {
         var6 = android.support.v4.view.bz.p(var2);
         this.g.add(var1.b);
         var6.b(0.0F).c(0.0F).a(this.h()).a(1.0F).a(new bq(this, var1, var6, var2)).b();
      }

   }

   void a(List var1) {
      for(int var2 = var1.size() - 1; var2 >= 0; --var2) {
         android.support.v4.view.bz.p(((ey)var1.get(var2)).a).a();
      }

   }

   public boolean a(ey var1) {
      this.v(var1);
      this.i.add(var1);
      return true;
   }

   public boolean a(ey var1, int var2, int var3, int var4, int var5) {
      View var6 = var1.a;
      var2 = (int)((float)var2 + android.support.v4.view.bz.k(var1.a));
      var3 = (int)((float)var3 + android.support.v4.view.bz.l(var1.a));
      this.v(var1);
      int var7 = var4 - var2;
      int var8 = var5 - var3;
      boolean var9;
      if (var7 == 0 && var8 == 0) {
         this.j(var1);
         var9 = false;
      } else {
         if (var7 != 0) {
            android.support.v4.view.bz.a(var6, (float)(-var7));
         }

         if (var8 != 0) {
            android.support.v4.view.bz.b(var6, (float)(-var8));
         }

         this.k.add(new bs(var1, var2, var3, var4, var5));
         var9 = true;
      }

      return var9;
   }

   public boolean a(ey var1, ey var2, int var3, int var4, int var5, int var6) {
      boolean var7;
      if (var1 == var2) {
         var7 = this.a(var1, var3, var4, var5, var6);
      } else {
         float var8 = android.support.v4.view.bz.k(var1.a);
         float var9 = android.support.v4.view.bz.l(var1.a);
         float var10 = android.support.v4.view.bz.e(var1.a);
         this.v(var1);
         int var11 = (int)((float)(var5 - var3) - var8);
         int var12 = (int)((float)(var6 - var4) - var9);
         android.support.v4.view.bz.a(var1.a, var8);
         android.support.v4.view.bz.b(var1.a, var9);
         android.support.v4.view.bz.c(var1.a, var10);
         if (var2 != null) {
            this.v(var2);
            android.support.v4.view.bz.a(var2.a, (float)(-var11));
            android.support.v4.view.bz.b(var2.a, (float)(-var12));
            android.support.v4.view.bz.c(var2.a, 0.0F);
         }

         this.l.add(new br(var1, var2, var3, var4, var5, var6));
         var7 = true;
      }

      return var7;
   }

   public boolean a(ey var1, List var2) {
      boolean var3;
      if (var2.isEmpty() && !super.a(var1, var2)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   void b(ey var1, int var2, int var3, int var4, int var5) {
      View var6 = var1.a;
      var2 = var4 - var2;
      var3 = var5 - var3;
      if (var2 != 0) {
         android.support.v4.view.bz.p(var6).b(0.0F);
      }

      if (var3 != 0) {
         android.support.v4.view.bz.p(var6).c(0.0F);
      }

      android.support.v4.view.dy var7 = android.support.v4.view.bz.p(var6);
      this.e.add(var1);
      var7.a(this.e()).a(new bo(this, var1, var2, var3, var7)).b();
   }

   public boolean b() {
      boolean var1;
      if (this.j.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public boolean b(ey var1) {
      this.v(var1);
      android.support.v4.view.bz.c(var1.a, 0.0F);
      this.j.add(var1);
      return true;
   }

   void c() {
      if (!this.b()) {
         this.i();
      }

   }

   void c(ey var1) {
      android.support.v4.view.dy var2 = android.support.v4.view.bz.p(var1.a);
      this.d.add(var1);
      var2.a(1.0F).a(this.f()).a(new bn(this, var1, var2)).b();
   }

   public void d() {
      int var1;
      bs var2;
      for(var1 = this.k.size() - 1; var1 >= 0; --var1) {
         var2 = (bs)this.k.get(var1);
         View var3 = var2.a.a;
         android.support.v4.view.bz.b(var3, 0.0F);
         android.support.v4.view.bz.a(var3, 0.0F);
         this.j(var2.a);
         this.k.remove(var1);
      }

      for(var1 = this.i.size() - 1; var1 >= 0; --var1) {
         this.i((ey)this.i.get(var1));
         this.i.remove(var1);
      }

      for(var1 = this.j.size() - 1; var1 >= 0; --var1) {
         ey var6 = (ey)this.j.get(var1);
         android.support.v4.view.bz.c(var6.a, 1.0F);
         this.k(var6);
         this.j.remove(var1);
      }

      for(var1 = this.l.size() - 1; var1 >= 0; --var1) {
         this.b((br)this.l.get(var1));
      }

      this.l.clear();
      if (this.b()) {
         int var4;
         for(var1 = this.b.size() - 1; var1 >= 0; --var1) {
            ArrayList var8 = (ArrayList)this.b.get(var1);

            for(var4 = var8.size() - 1; var4 >= 0; --var4) {
               var2 = (bs)var8.get(var4);
               View var5 = var2.a.a;
               android.support.v4.view.bz.b(var5, 0.0F);
               android.support.v4.view.bz.a(var5, 0.0F);
               this.j(var2.a);
               var8.remove(var4);
               if (var8.isEmpty()) {
                  this.b.remove(var8);
               }
            }
         }

         ArrayList var7;
         for(var1 = this.a.size() - 1; var1 >= 0; --var1) {
            var7 = (ArrayList)this.a.get(var1);

            for(var4 = var7.size() - 1; var4 >= 0; --var4) {
               ey var9 = (ey)var7.get(var4);
               android.support.v4.view.bz.c(var9.a, 1.0F);
               this.k(var9);
               var7.remove(var4);
               if (var7.isEmpty()) {
                  this.a.remove(var7);
               }
            }
         }

         for(var1 = this.c.size() - 1; var1 >= 0; --var1) {
            var7 = (ArrayList)this.c.get(var1);

            for(var4 = var7.size() - 1; var4 >= 0; --var4) {
               this.b((br)var7.get(var4));
               if (var7.isEmpty()) {
                  this.c.remove(var7);
               }
            }
         }

         this.a((List)this.f);
         this.a((List)this.e);
         this.a((List)this.d);
         this.a((List)this.g);
         this.i();
      }

   }

   public void d(ey var1) {
      View var2 = var1.a;
      android.support.v4.view.bz.p(var2).a();

      int var3;
      for(var3 = this.k.size() - 1; var3 >= 0; --var3) {
         if (((bs)this.k.get(var3)).a == var1) {
            android.support.v4.view.bz.b(var2, 0.0F);
            android.support.v4.view.bz.a(var2, 0.0F);
            this.j(var1);
            this.k.remove(var3);
         }
      }

      this.a((List)this.l, (ey)var1);
      if (this.i.remove(var1)) {
         android.support.v4.view.bz.c(var2, 1.0F);
         this.i(var1);
      }

      if (this.j.remove(var1)) {
         android.support.v4.view.bz.c(var2, 1.0F);
         this.k(var1);
      }

      ArrayList var4;
      for(var3 = this.c.size() - 1; var3 >= 0; --var3) {
         var4 = (ArrayList)this.c.get(var3);
         this.a((List)var4, (ey)var1);
         if (var4.isEmpty()) {
            this.c.remove(var3);
         }
      }

      for(var3 = this.b.size() - 1; var3 >= 0; --var3) {
         var4 = (ArrayList)this.b.get(var3);

         for(int var5 = var4.size() - 1; var5 >= 0; --var5) {
            if (((bs)var4.get(var5)).a == var1) {
               android.support.v4.view.bz.b(var2, 0.0F);
               android.support.v4.view.bz.a(var2, 0.0F);
               this.j(var1);
               var4.remove(var5);
               if (var4.isEmpty()) {
                  this.b.remove(var3);
               }
               break;
            }
         }
      }

      for(var3 = this.a.size() - 1; var3 >= 0; --var3) {
         var4 = (ArrayList)this.a.get(var3);
         if (var4.remove(var1)) {
            android.support.v4.view.bz.c(var2, 1.0F);
            this.k(var1);
            if (var4.isEmpty()) {
               this.a.remove(var3);
            }
         }
      }

      if (this.f.remove(var1)) {
      }

      if (this.d.remove(var1)) {
      }

      if (this.g.remove(var1)) {
      }

      if (this.e.remove(var1)) {
      }

      this.c();
   }
}
