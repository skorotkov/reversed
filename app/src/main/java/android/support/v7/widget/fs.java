package android.support.v7.widget;

import java.util.Arrays;

class fs {
   int a;
   int b;
   boolean c;
   boolean d;
   boolean e;
   int[] f;
   // $FF: synthetic field
   final StaggeredGridLayoutManager g;

   public fs(StaggeredGridLayoutManager var1) {
      this.g = var1;
      this.a();
   }

   void a() {
      this.a = -1;
      this.b = Integer.MIN_VALUE;
      this.c = false;
      this.d = false;
      this.e = false;
      if (this.f != null) {
         Arrays.fill(this.f, -1);
      }

   }

   void a(int var1) {
      if (this.c) {
         this.b = this.g.b.d() - var1;
      } else {
         this.b = this.g.b.c() + var1;
      }

   }

   void a(fz[] var1) {
      int var2 = var1.length;
      if (this.f == null || this.f.length < var2) {
         this.f = new int[this.g.a.length];
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         this.f[var3] = var1[var3].a(Integer.MIN_VALUE);
      }

   }

   void b() {
      int var1;
      if (this.c) {
         var1 = this.g.b.d();
      } else {
         var1 = this.g.b.c();
      }

      this.b = var1;
   }
}
