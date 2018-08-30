package android.support.wearable.complications;

import android.os.IBinder;

class f extends q {
   // $FF: synthetic field
   final d a;

   private f(d var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   f(d var1, e var2) {
      this(var1);
   }

   public void a(int var1) {
      d.a(this.a).post(new h(this, var1));
   }

   public void a(int var1, int var2, IBinder var3) {
      c var4 = new c(n.a(var3));
      d.a(this.a).post(new g(this, var1, var2, var4));
   }

   public void b(int var1, int var2, IBinder var3) {
      c var4 = new c(n.a(var3));
      d.a(this.a).post(new i(this, var1, var2, var4));
   }
}
