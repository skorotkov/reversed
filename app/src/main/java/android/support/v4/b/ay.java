package android.support.v4.b;

import android.view.View;
import java.util.ArrayList;

final class ay implements Runnable {
   // $FF: synthetic field
   final Object a;
   // $FF: synthetic field
   final View b;
   // $FF: synthetic field
   final p c;
   // $FF: synthetic field
   final ArrayList d;
   // $FF: synthetic field
   final ArrayList e;
   // $FF: synthetic field
   final ArrayList f;
   // $FF: synthetic field
   final Object g;

   ay(Object var1, View var2, p var3, ArrayList var4, ArrayList var5, ArrayList var6, Object var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }

   public void run() {
      ArrayList var1;
      if (this.a != null) {
         bc.c(this.a, this.b);
         var1 = aw.a(this.a, this.c, this.d, this.b);
         this.e.addAll(var1);
      }

      if (this.f != null) {
         if (this.g != null) {
            var1 = new ArrayList();
            var1.add(this.b);
            bc.b(this.g, this.f, var1);
         }

         this.f.clear();
         this.f.add(this.b);
      }

   }
}
