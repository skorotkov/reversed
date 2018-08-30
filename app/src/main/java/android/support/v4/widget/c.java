package android.support.v4.widget;

import android.support.v4.view.bz;

class c implements Runnable {
   // $FF: synthetic field
   final a a;

   c(a var1) {
      this.a = var1;
   }

   public void run() {
      if (this.a.e) {
         if (this.a.c) {
            this.a.c = false;
            this.a.a.a();
         }

         b var1 = this.a.a;
         if (!var1.c() && this.a.a()) {
            if (this.a.d) {
               this.a.d = false;
               this.a.b();
            }

            var1.d();
            int var2 = var1.g();
            int var3 = var1.h();
            this.a.a(var2, var3);
            bz.a(this.a.b, (Runnable)this);
         } else {
            this.a.e = false;
         }
      }

   }
}
