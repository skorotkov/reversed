package android.support.a.a;

import android.graphics.Path;

class p {
   protected i[] m = null;
   String n;
   int o;

   public p() {
   }

   public p(p var1) {
      this.n = var1.n;
      this.o = var1.o;
      this.m = g.a(var1.m);
   }

   public void a(Path var1) {
      var1.reset();
      if (this.m != null) {
         i.a(this.m, var1);
      }

   }

   public boolean a() {
      return false;
   }

   public i[] getPathData() {
      return this.m;
   }

   public String getPathName() {
      return this.n;
   }

   public void setPathData(i[] var1) {
      if (!g.a(this.m, var1)) {
         this.m = g.a(var1);
      } else {
         g.b(this.m, var1);
      }

   }
}
