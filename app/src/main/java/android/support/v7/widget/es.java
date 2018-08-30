package android.support.v7.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

public abstract class es {
   private int a = -1;
   private dl b;
   private ec c;
   private boolean d;
   private boolean e;
   private View f;
   private final et g = new et(0, 0);

   private void a(int var1, int var2) {
      dl var3 = this.b;
      if (!this.e || this.a == -1 || var3 == null) {
         this.f();
      }

      this.d = false;
      if (this.f != null) {
         if (this.a(this.f) == this.a) {
            this.a(this.f, var3.A, this.g);
            this.g.a(var3);
            this.f();
         } else {
            Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
            this.f = null;
         }
      }

      if (this.e) {
         this.a(var1, var2, var3.A, this.g);
         boolean var4 = this.g.a();
         this.g.a(var3);
         if (var4) {
            if (this.e) {
               this.d = true;
               var3.x.a();
            } else {
               this.f();
            }
         }
      }

   }

   // $FF: synthetic method
   static void a(es var0, int var1, int var2) {
      var0.a(var1, var2);
   }

   public int a(View var1) {
      return this.b.h(var1);
   }

   protected abstract void a();

   protected abstract void a(int var1, int var2, ev var3, et var4);

   protected void a(PointF var1) {
      double var2 = Math.sqrt((double)(var1.x * var1.x + var1.y * var1.y));
      var1.x = (float)((double)var1.x / var2);
      var1.y = (float)((double)var1.y / var2);
   }

   void a(dl var1, ec var2) {
      this.b = var1;
      this.c = var2;
      if (this.a == -1) {
         throw new IllegalArgumentException("Invalid target position");
      } else {
         ev.a(this.b.A, this.a);
         this.e = true;
         this.d = true;
         this.f = this.e(this.i());
         this.a();
         this.b.x.a();
      }
   }

   protected abstract void a(View var1, ev var2, et var3);

   protected abstract void b();

   protected void b(View var1) {
      if (this.a(var1) == this.i()) {
         this.f = var1;
      }

   }

   public void d(int var1) {
      this.a = var1;
   }

   public ec e() {
      return this.c;
   }

   public View e(int var1) {
      return this.b.m.c(var1);
   }

   protected final void f() {
      if (this.e) {
         this.b();
         ev.a(this.b.A, -1);
         this.f = null;
         this.a = -1;
         this.d = false;
         this.e = false;
         ec.a(this.c, this);
         this.c = null;
         this.b = null;
      }

   }

   public boolean g() {
      return this.d;
   }

   public boolean h() {
      return this.e;
   }

   public int i() {
      return this.a;
   }

   public int j() {
      return this.b.m.y();
   }
}
