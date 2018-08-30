package android.support.v4.g;

import java.util.Map;

class d extends j {
   // $FF: synthetic field
   final c a;

   d(c var1) {
      this.a = var1;
   }

   protected int a() {
      return this.a.h;
   }

   protected int a(Object var1) {
      return this.a.a(var1);
   }

   protected Object a(int var1, int var2) {
      return this.a.g[var1];
   }

   protected Object a(int var1, Object var2) {
      throw new UnsupportedOperationException("not a map");
   }

   protected void a(int var1) {
      this.a.c(var1);
   }

   protected void a(Object var1, Object var2) {
      this.a.add(var1);
   }

   protected int b(Object var1) {
      return this.a.a(var1);
   }

   protected Map b() {
      throw new UnsupportedOperationException("not a map");
   }

   protected void c() {
      this.a.clear();
   }
}
