package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

public class et {
   private int a;
   private int b;
   private int c;
   private int d;
   private Interpolator e;
   private boolean f;
   private int g;

   public et(int var1, int var2) {
      this(var1, var2, Integer.MIN_VALUE, (Interpolator)null);
   }

   public et(int var1, int var2, int var3, Interpolator var4) {
      this.d = -1;
      this.f = false;
      this.g = 0;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
   }

   private void b() {
      if (this.e != null && this.c < 1) {
         throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
      } else if (this.c < 1) {
         throw new IllegalStateException("Scroll duration must be a positive number");
      }
   }

   public void a(int var1) {
      this.d = var1;
   }

   public void a(int var1, int var2, int var3, Interpolator var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
      this.f = true;
   }

   void a(dl var1) {
      if (this.d >= 0) {
         int var2 = this.d;
         this.d = -1;
         var1.b(var2);
         this.f = false;
      } else if (this.f) {
         this.b();
         if (this.e == null) {
            if (this.c == Integer.MIN_VALUE) {
               var1.x.b(this.a, this.b);
            } else {
               var1.x.a(this.a, this.b, this.c);
            }
         } else {
            var1.x.a(this.a, this.b, this.c, this.e);
         }

         ++this.g;
         if (this.g > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
         }

         this.f = false;
      } else {
         this.g = 0;
      }

   }

   boolean a() {
      boolean var1;
      if (this.d >= 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
