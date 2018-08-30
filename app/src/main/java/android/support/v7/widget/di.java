package android.support.v7.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class di {
   protected final ec a;
   final Rect b;
   private int c;

   private di(ec var1) {
      this.c = Integer.MIN_VALUE;
      this.b = new Rect();
      this.a = var1;
   }

   // $FF: synthetic method
   di(ec var1, dj var2) {
      this(var1);
   }

   public static di a(ec var0) {
      return new dj(var0);
   }

   public static di a(ec var0, int var1) {
      di var2;
      switch(var1) {
      case 0:
         var2 = a(var0);
         break;
      case 1:
         var2 = b(var0);
         break;
      default:
         throw new IllegalArgumentException("invalid orientation");
      }

      return var2;
   }

   public static di b(ec var0) {
      return new dk(var0);
   }

   public abstract int a(View var1);

   public void a() {
      this.c = this.f();
   }

   public abstract void a(int var1);

   public int b() {
      int var1;
      if (Integer.MIN_VALUE == this.c) {
         var1 = 0;
      } else {
         var1 = this.f() - this.c;
      }

      return var1;
   }

   public abstract int b(View var1);

   public abstract int c();

   public abstract int c(View var1);

   public abstract int d();

   public abstract int d(View var1);

   public abstract int e();

   public abstract int e(View var1);

   public abstract int f();

   public abstract int f(View var1);

   public abstract int g();

   public abstract int h();

   public abstract int i();
}
