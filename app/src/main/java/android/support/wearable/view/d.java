package android.support.wearable.view;

import android.graphics.drawable.Drawable;

class d extends android.support.v4.g.i {
   // $FF: synthetic field
   final b a;

   d(b var1, int var2) {
      super(var2);
      this.a = var1;
   }

   protected Drawable a(Integer var1) {
      int var2 = b.b(var1);
      int var3 = b.c(var1);
      return b.a(this.a).d(var3, var2).mutate();
   }

   // $FF: synthetic method
   protected Object create(Object var1) {
      return this.a((Integer)var1);
   }
}
