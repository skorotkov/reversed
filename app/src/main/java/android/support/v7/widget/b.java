package android.support.v7.widget;

import android.view.View;

public class b implements android.support.v4.view.em {
   int a;
   // $FF: synthetic field
   final a b;
   private boolean c;

   protected b(a var1) {
      this.b = var1;
      this.c = false;
   }

   public void a(View var1) {
      android.support.v7.widget.a.a(this.b, 0);
      this.c = false;
   }

   public void b(View var1) {
      if (!this.c) {
         this.b.f = null;
         android.support.v7.widget.a.b(this.b, this.a);
      }

   }

   public void c(View var1) {
      this.c = true;
   }
}
