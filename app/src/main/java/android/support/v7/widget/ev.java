package android.support.v7.widget;

import android.util.SparseArray;

public class ev {
   int a = 0;
   int b = 0;
   int c = 1;
   int d = 0;
   boolean e = false;
   boolean f = false;
   boolean g = false;
   boolean h = false;
   boolean i = false;
   boolean j = false;
   int k;
   long l;
   int m;
   private int n = -1;
   private SparseArray o;

   // $FF: synthetic method
   static int a(ev var0, int var1) {
      var0.n = var1;
      return var1;
   }

   void a(int var1) {
      if ((this.c & var1) == 0) {
         throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(var1) + " but it is " + Integer.toBinaryString(this.c));
      }
   }

   void a(ds var1) {
      this.c = 1;
      this.d = var1.a();
      this.e = false;
      this.f = false;
      this.g = false;
      this.h = false;
   }

   public boolean a() {
      return this.f;
   }

   public boolean b() {
      return this.j;
   }

   public int c() {
      return this.n;
   }

   public boolean d() {
      boolean var1;
      if (this.n != -1) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int e() {
      int var1;
      if (this.f) {
         var1 = this.a - this.b;
      } else {
         var1 = this.d;
      }

      return var1;
   }

   public String toString() {
      return "State{mTargetPosition=" + this.n + ", mData=" + this.o + ", mItemCount=" + this.d + ", mPreviousLayoutItemCount=" + this.a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.b + ", mStructureChanged=" + this.e + ", mInPreLayout=" + this.f + ", mRunSimpleAnimations=" + this.i + ", mRunPredictiveAnimations=" + this.j + '}';
   }
}
