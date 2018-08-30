package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public class bn {
   private final View a;
   private ViewParent b;
   private boolean c;
   private int[] d;

   public bn(View var1) {
      this.a = var1;
   }

   public void a(boolean var1) {
      if (this.c) {
         bz.x(this.a);
      }

      this.c = var1;
   }

   public boolean a() {
      return this.c;
   }

   public boolean a(float var1, float var2) {
      boolean var3;
      if (this.a() && this.b != null) {
         var3 = dr.a(this.b, this.a, var1, var2);
      } else {
         var3 = false;
      }

      return var3;
   }

   public boolean a(float var1, float var2, boolean var3) {
      if (this.a() && this.b != null) {
         var3 = dr.a(this.b, this.a, var1, var2, var3);
      } else {
         var3 = false;
      }

      return var3;
   }

   public boolean a(int var1) {
      boolean var2;
      if (this.b()) {
         var2 = true;
      } else {
         if (this.a()) {
            ViewParent var3 = this.a.getParent();

            for(View var4 = this.a; var3 != null; var3 = var3.getParent()) {
               if (dr.a(var3, var4, this.a, var1)) {
                  this.b = var3;
                  dr.b(var3, var4, this.a, var1);
                  var2 = true;
                  return var2;
               }

               if (var3 instanceof View) {
                  var4 = (View)var3;
               }
            }
         }

         var2 = false;
      }

      return var2;
   }

   public boolean a(int var1, int var2, int var3, int var4, int[] var5) {
      boolean var6 = false;
      boolean var7 = var6;
      if (this.a()) {
         var7 = var6;
         if (this.b != null) {
            if (var1 == 0 && var2 == 0 && var3 == 0 && var4 == 0) {
               var7 = var6;
               if (var5 != null) {
                  var5[0] = 0;
                  var5[1] = 0;
                  var7 = var6;
               }
            } else {
               int var8;
               int var9;
               if (var5 != null) {
                  this.a.getLocationInWindow(var5);
                  var8 = var5[0];
                  var9 = var5[1];
               } else {
                  var9 = 0;
                  var8 = 0;
               }

               dr.a(this.b, this.a, var1, var2, var3, var4);
               if (var5 != null) {
                  this.a.getLocationInWindow(var5);
                  var5[0] -= var8;
                  var5[1] -= var9;
               }

               var7 = true;
            }
         }
      }

      return var7;
   }

   public boolean a(int var1, int var2, int[] var3, int[] var4) {
      boolean var5 = false;
      boolean var6 = var5;
      if (this.a()) {
         var6 = var5;
         if (this.b != null) {
            if (var1 == 0 && var2 == 0) {
               var6 = var5;
               if (var4 != null) {
                  var4[0] = 0;
                  var4[1] = 0;
                  var6 = var5;
               }
            } else {
               int var7;
               int var8;
               if (var4 != null) {
                  this.a.getLocationInWindow(var4);
                  var7 = var4[0];
                  var8 = var4[1];
               } else {
                  var8 = 0;
                  var7 = 0;
               }

               int[] var9 = var3;
               if (var3 == null) {
                  if (this.d == null) {
                     this.d = new int[2];
                  }

                  var9 = this.d;
               }

               var9[0] = 0;
               var9[1] = 0;
               dr.a(this.b, this.a, var1, var2, var9);
               if (var4 != null) {
                  this.a.getLocationInWindow(var4);
                  var4[0] -= var7;
                  var4[1] -= var8;
               }

               if (var9[0] == 0) {
                  var6 = var5;
                  if (var9[1] == 0) {
                     return var6;
                  }
               }

               var6 = true;
            }
         }
      }

      return var6;
   }

   public boolean b() {
      boolean var1;
      if (this.b != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void c() {
      if (this.b != null) {
         dr.a(this.b, this.a);
         this.b = null;
      }

   }
}
