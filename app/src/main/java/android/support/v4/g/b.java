package android.support.v4.g;

import java.util.Map;

class b extends j {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   protected int a() {
      return this.a.h;
   }

   protected int a(Object var1) {
      return this.a.a(var1);
   }

   protected Object a(int var1, int var2) {
      return this.a.g[(var1 << 1) + var2];
   }

   protected Object a(int var1, Object var2) {
      return this.a.a(var1, var2);
   }

   protected void a(int var1) {
      this.a.d(var1);
   }

   protected void a(Object var1, Object var2) {
      this.a.put(var1, var2);
   }

   protected int b(Object var1) {
      return this.a.b(var1);
   }

   protected Map b() {
      return this.a;
   }

   protected void c() {
      this.a.clear();
   }
}
