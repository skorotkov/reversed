package android.support.v4.b;

import android.graphics.Rect;
import android.view.View;

final class az implements Runnable {
   // $FF: synthetic field
   final p a;
   // $FF: synthetic field
   final p b;
   // $FF: synthetic field
   final boolean c;
   // $FF: synthetic field
   final android.support.v4.g.a d;
   // $FF: synthetic field
   final View e;
   // $FF: synthetic field
   final Rect f;

   az(p var1, p var2, boolean var3, android.support.v4.g.a var4, View var5, Rect var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public void run() {
      aw.a(this.a, this.b, this.c, this.d, false);
      if (this.e != null) {
         bc.a(this.e, this.f);
      }

   }
}
