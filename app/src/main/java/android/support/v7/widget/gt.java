package android.support.v7.widget;

class gt {
   final android.support.v4.g.a a = new android.support.v4.g.a();
   final android.support.v4.g.h b = new android.support.v4.g.h();

   private dz a(ey var1, int var2) {
      Object var3 = null;
      int var4 = this.a.a(var1);
      dz var5;
      if (var4 < 0) {
         var5 = (dz)var3;
      } else {
         gu var6 = (gu)this.a.c(var4);
         var5 = (dz)var3;
         if (var6 != null) {
            var5 = (dz)var3;
            if ((var6.a & var2) != 0) {
               var6.a &= ~var2;
               dz var7;
               if (var2 == 4) {
                  var7 = var6.b;
               } else {
                  if (var2 != 8) {
                     throw new IllegalArgumentException("Must provide flag PRE or POST");
                  }

                  var7 = var6.c;
               }

               var5 = var7;
               if ((var6.a & 12) == 0) {
                  this.a.d(var4);
                  gu.a(var6);
                  var5 = var7;
               }
            }
         }
      }

      return var5;
   }

   ey a(long var1) {
      return (ey)this.b.a(var1);
   }

   void a() {
      this.a.clear();
      this.b.c();
   }

   void a(long var1, ey var3) {
      this.b.b(var1, var3);
   }

   void a(ey var1, dz var2) {
      gu var3 = (gu)this.a.get(var1);
      gu var4 = var3;
      if (var3 == null) {
         var4 = gu.a();
         this.a.put(var1, var4);
      }

      var4.b = var2;
      var4.a |= 4;
   }

   void a(gv var1) {
      for(int var2 = this.a.size() - 1; var2 >= 0; --var2) {
         ey var3 = (ey)this.a.b(var2);
         gu var4 = (gu)this.a.d(var2);
         if ((var4.a & 3) == 3) {
            var1.a(var3);
         } else if ((var4.a & 1) != 0) {
            if (var4.b == null) {
               var1.a(var3);
            } else {
               var1.a(var3, var4.b, var4.c);
            }
         } else if ((var4.a & 14) == 14) {
            var1.b(var3, var4.b, var4.c);
         } else if ((var4.a & 12) == 12) {
            var1.c(var3, var4.b, var4.c);
         } else if ((var4.a & 4) != 0) {
            var1.a(var3, var4.b, (dz)null);
         } else if ((var4.a & 8) != 0) {
            var1.b(var3, var4.b, var4.c);
         } else if ((var4.a & 2) != 0) {
         }

         gu.a(var4);
      }

   }

   boolean a(ey var1) {
      gu var3 = (gu)this.a.get(var1);
      boolean var2;
      if (var3 != null && (var3.a & 1) != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   dz b(ey var1) {
      return this.a(var1, 4);
   }

   void b() {
      gu.b();
   }

   void b(ey var1, dz var2) {
      gu var3 = (gu)this.a.get(var1);
      gu var4 = var3;
      if (var3 == null) {
         var4 = gu.a();
         this.a.put(var1, var4);
      }

      var4.a |= 2;
      var4.b = var2;
   }

   dz c(ey var1) {
      return this.a(var1, 8);
   }

   void c(ey var1, dz var2) {
      gu var3 = (gu)this.a.get(var1);
      gu var4 = var3;
      if (var3 == null) {
         var4 = gu.a();
         this.a.put(var1, var4);
      }

      var4.c = var2;
      var4.a |= 8;
   }

   boolean d(ey var1) {
      gu var3 = (gu)this.a.get(var1);
      boolean var2;
      if (var3 != null && (var3.a & 4) != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   void e(ey var1) {
      gu var2 = (gu)this.a.get(var1);
      gu var3 = var2;
      if (var2 == null) {
         var3 = gu.a();
         this.a.put(var1, var3);
      }

      var3.a |= 1;
   }

   void f(ey var1) {
      gu var2 = (gu)this.a.get(var1);
      if (var2 != null) {
         var2.a &= -2;
      }

   }

   void g(ey var1) {
      for(int var2 = this.b.b() - 1; var2 >= 0; --var2) {
         if (var1 == this.b.c(var2)) {
            this.b.a(var2);
            break;
         }
      }

      gu var3 = (gu)this.a.remove(var1);
      if (var3 != null) {
         gu.a(var3);
      }

   }

   public void h(ey var1) {
      this.f(var1);
   }
}
