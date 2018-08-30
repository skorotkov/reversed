package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class i {
   private static final l b;
   private Object a;

   static {
      if (VERSION.SDK_INT >= 21) {
         b = new m();
      } else if (VERSION.SDK_INT >= 14) {
         b = new k();
      } else {
         b = new j();
      }

   }

   public i(Context var1) {
      this.a = b.a(var1);
   }

   public void a(int var1, int var2) {
      b.a(this.a, var1, var2);
   }

   public boolean a() {
      return b.a(this.a);
   }

   @Deprecated
   public boolean a(float var1) {
      return b.a(this.a, var1);
   }

   public boolean a(float var1, float var2) {
      return b.a(this.a, var1, var2);
   }

   public boolean a(int var1) {
      return b.a(this.a, var1);
   }

   public boolean a(Canvas var1) {
      return b.a(this.a, var1);
   }

   public void b() {
      b.b(this.a);
   }

   public boolean c() {
      return b.c(this.a);
   }
}
