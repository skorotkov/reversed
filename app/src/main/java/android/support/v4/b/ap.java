package android.support.v4.b;

class ap implements u {
   private final boolean a;
   private final h b;
   private int c;

   ap(h var1, boolean var2) {
      this.a = var2;
      this.b = var1;
   }

   // $FF: synthetic method
   static boolean a(ap var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static h b(ap var0) {
      return var0.b;
   }

   public void a() {
      --this.c;
      if (this.c == 0) {
         ah.a(this.b.b);
      }

   }

   public void b() {
      ++this.c;
   }

   public boolean c() {
      boolean var1;
      if (this.c == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void d() {
      boolean var1 = false;
      boolean var2;
      if (this.c > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      ah var3 = this.b.b;
      int var4 = var3.f.size();

      for(int var5 = 0; var5 < var4; ++var5) {
         p var6 = (p)var3.f.get(var5);
         var6.a((u)null);
         if (var2 && var6.t()) {
            var6.startPostponedEnterTransition();
         }
      }

      ah var9 = this.b.b;
      h var8 = this.b;
      boolean var7 = this.a;
      if (!var2) {
         var1 = true;
      }

      ah.a(var9, var8, var7, var1, true);
   }

   public void e() {
      ah.a(this.b.b, this.b, this.a, false, false);
   }
}
