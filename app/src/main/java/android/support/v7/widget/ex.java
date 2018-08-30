package android.support.v7.widget;

import android.view.animation.Interpolator;

class ex implements Runnable {
   Interpolator a;
   // $FF: synthetic field
   final dl b;
   private int c;
   private int d;
   private android.support.v4.widget.ah e;
   private boolean f;
   private boolean g;

   public ex(dl var1) {
      this.b = var1;
      this.a = dl.G;
      this.f = false;
      this.g = false;
      this.e = android.support.v4.widget.ah.a(var1.getContext(), dl.G);
   }

   private float a(float var1) {
      return (float)Math.sin((double)((float)((double)(var1 - 0.5F) * 0.4712389167638204D)));
   }

   private int b(int var1, int var2, int var3, int var4) {
      int var5 = Math.abs(var1);
      int var6 = Math.abs(var2);
      boolean var7;
      if (var5 > var6) {
         var7 = true;
      } else {
         var7 = false;
      }

      var3 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4));
      var2 = (int)Math.sqrt((double)(var1 * var1 + var2 * var2));
      if (var7) {
         var1 = this.b.getWidth();
      } else {
         var1 = this.b.getHeight();
      }

      var4 = var1 / 2;
      float var8 = Math.min(1.0F, (float)var2 * 1.0F / (float)var1);
      float var9 = (float)var4;
      float var10 = (float)var4;
      var8 = this.a(var8);
      if (var3 > 0) {
         var1 = Math.round(1000.0F * Math.abs((var8 * var10 + var9) / (float)var3)) * 4;
      } else {
         if (var7) {
            var2 = var5;
         } else {
            var2 = var6;
         }

         var1 = (int)(((float)var2 / (float)var1 + 1.0F) * 300.0F);
      }

      return Math.min(var1, 2000);
   }

   private void c() {
      this.g = false;
      this.f = true;
   }

   private void d() {
      this.f = false;
      if (this.g) {
         this.a();
      }

   }

   void a() {
      if (this.f) {
         this.g = true;
      } else {
         this.b.removeCallbacks(this);
         android.support.v4.view.bz.a(this.b, (Runnable)this);
      }

   }

   public void a(int var1, int var2) {
      this.b.setScrollState(2);
      this.d = 0;
      this.c = 0;
      this.e.a(0, 0, var1, var2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
      this.a();
   }

   public void a(int var1, int var2, int var3) {
      this.a(var1, var2, var3, dl.G);
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, this.b(var1, var2, var3, var4));
   }

   public void a(int var1, int var2, int var3, Interpolator var4) {
      if (this.a != var4) {
         this.a = var4;
         this.e = android.support.v4.widget.ah.a(this.b.getContext(), var4);
      }

      this.b.setScrollState(2);
      this.d = 0;
      this.c = 0;
      this.e.a(0, 0, var1, var2, var3);
      this.a();
   }

   public void a(int var1, int var2, Interpolator var3) {
      int var4 = this.b(var1, var2, 0, 0);
      Interpolator var5 = var3;
      if (var3 == null) {
         var5 = dl.G;
      }

      this.a(var1, var2, var4, var5);
   }

   public void b() {
      this.b.removeCallbacks(this);
      this.e.h();
   }

   public void b(int var1, int var2) {
      this.a(var1, var2, 0, 0);
   }

   public void run() {
      if (this.b.m == null) {
         this.b();
      } else {
         this.c();
         this.b.c();
         android.support.v4.widget.ah var1 = this.e;
         es var2 = this.b.m.r;
         if (var1.g()) {
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int var8;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            label167: {
               var3 = var1.b();
               var4 = var1.c();
               var5 = var3 - this.c;
               var6 = var4 - this.d;
               var7 = 0;
               var8 = 0;
               int var9 = 0;
               var10 = 0;
               this.c = var3;
               this.d = var4;
               var11 = 0;
               var12 = 0;
               var13 = 0;
               var14 = 0;
               if (this.b.l != null) {
                  this.b.d();
                  this.b.l();
                  android.support.v4.f.i.a("RV Scroll");
                  if (var5 != 0) {
                     var8 = this.b.m.a(var5, this.b.d, this.b.A);
                     var12 = var5 - var8;
                  }

                  if (var6 != 0) {
                     var10 = this.b.m.b(var6, this.b.d, this.b.A);
                     var14 = var6 - var10;
                  }

                  android.support.v4.f.i.a();
                  this.b.x();
                  this.b.m();
                  this.b.a(false);
                  var13 = var14;
                  var9 = var10;
                  var11 = var12;
                  var7 = var8;
                  if (var2 != null) {
                     var13 = var14;
                     var9 = var10;
                     var11 = var12;
                     var7 = var8;
                     if (!var2.g()) {
                        var13 = var14;
                        var9 = var10;
                        var11 = var12;
                        var7 = var8;
                        if (var2.h()) {
                           var13 = this.b.A.e();
                           if (var13 == 0) {
                              var2.f();
                              var13 = var10;
                              var10 = var12;
                              break label167;
                           }

                           if (var2.i() >= var13) {
                              var2.d(var13 - 1);
                              es.a(var2, var5 - var12, var6 - var14);
                              var13 = var10;
                              var10 = var12;
                              break label167;
                           }

                           es.a(var2, var5 - var12, var6 - var14);
                           var7 = var8;
                           var11 = var12;
                           var9 = var10;
                           var13 = var14;
                        }
                     }
                  }
               }

               var10 = var11;
               var14 = var13;
               var13 = var9;
               var8 = var7;
            }

            if (!this.b.o.isEmpty()) {
               this.b.invalidate();
            }

            if (this.b.getOverScrollMode() != 2) {
               this.b.c(var5, var6);
            }

            if (var10 != 0 || var14 != 0) {
               var7 = (int)var1.f();
               if (var10 != var3) {
                  if (var10 < 0) {
                     var12 = -var7;
                  } else if (var10 > 0) {
                     var12 = var7;
                  } else {
                     var12 = 0;
                  }

                  var11 = var12;
               } else {
                  var11 = 0;
               }

               if (var14 != var4) {
                  if (var14 < 0) {
                     var12 = -var7;
                  } else {
                     var12 = var7;
                     if (var14 <= 0) {
                        var12 = 0;
                     }
                  }
               } else {
                  var12 = 0;
               }

               if (this.b.getOverScrollMode() != 2) {
                  this.b.d(var11, var12);
               }

               if ((var11 != 0 || var10 == var3 || var1.d() == 0) && (var12 != 0 || var14 == var4 || var1.e() == 0)) {
                  var1.h();
               }
            }

            if (var8 != 0 || var13 != 0) {
               this.b.i(var8, var13);
            }

            if (!dl.a(this.b)) {
               this.b.invalidate();
            }

            boolean var16;
            if (var6 != 0 && this.b.m.e() && var13 == var6) {
               var16 = true;
            } else {
               var16 = false;
            }

            boolean var15;
            if (var5 != 0 && this.b.m.d() && var8 == var5) {
               var15 = true;
            } else {
               var15 = false;
            }

            if ((var5 != 0 || var6 != 0) && !var15 && !var16) {
               var16 = false;
            } else {
               var16 = true;
            }

            if (!var1.a() && var16) {
               this.a();
               if (this.b.y != null) {
                  this.b.y.a(this.b, var5, var6);
               }
            } else {
               this.b.setScrollState(0);
               if (dl.z()) {
                  this.b.z.a();
               }
            }
         }

         if (var2 != null) {
            if (var2.g()) {
               es.a(var2, 0, 0);
            }

            if (!this.g) {
               var2.f();
            }
         }

         this.d();
      }

   }
}
