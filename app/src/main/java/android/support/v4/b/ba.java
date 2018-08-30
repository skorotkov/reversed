package android.support.v4.b;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

final class ba implements Runnable {
   // $FF: synthetic field
   final android.support.v4.g.a a;
   // $FF: synthetic field
   final Object b;
   // $FF: synthetic field
   final bb c;
   // $FF: synthetic field
   final ArrayList d;
   // $FF: synthetic field
   final View e;
   // $FF: synthetic field
   final p f;
   // $FF: synthetic field
   final p g;
   // $FF: synthetic field
   final boolean h;
   // $FF: synthetic field
   final ArrayList i;
   // $FF: synthetic field
   final Object j;
   // $FF: synthetic field
   final Rect k;

   ba(android.support.v4.g.a var1, Object var2, bb var3, ArrayList var4, View var5, p var6, p var7, boolean var8, ArrayList var9, Object var10, Rect var11) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
      this.j = var10;
      this.k = var11;
   }

   public void run() {
      android.support.v4.g.a var1 = aw.a(this.a, this.b, this.c);
      if (var1 != null) {
         this.d.addAll(var1.values());
         this.d.add(this.e);
      }

      aw.a(this.f, this.g, this.h, var1, false);
      if (this.b != null) {
         bc.a(this.b, this.i, this.d);
         View var2 = aw.a(var1, this.c, this.j, this.h);
         if (var2 != null) {
            bc.a(var2, this.k);
         }
      }

   }
}
