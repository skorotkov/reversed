package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;

public class bz {
   static final cm a;

   static {
      int var0 = VERSION.SDK_INT;
      if (android.support.v4.f.c.a()) {
         a = new ca();
      } else if (var0 >= 23) {
         a = new cl();
      } else if (var0 >= 21) {
         a = new cj();
      } else if (var0 >= 19) {
         a = new ci();
      } else if (var0 >= 18) {
         a = new ch();
      } else if (var0 >= 17) {
         a = new cg();
      } else if (var0 >= 16) {
         a = new cf();
      } else if (var0 >= 15) {
         a = new cd();
      } else if (var0 >= 14) {
         a = new ce();
      } else if (var0 >= 11) {
         a = new cc();
      } else {
         a = new cb();
      }

   }

   public static int a(int var0, int var1) {
      return a.a(var0, var1);
   }

   public static int a(int var0, int var1, int var2) {
      return a.a(var0, var1, var2);
   }

   public static eo a(View var0, eo var1) {
      return a.a(var0, var1);
   }

   public static void a(View var0, float var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, int var1, Paint var2) {
      a.a(var0, var1, var2);
   }

   public static void a(View var0, ColorStateList var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, Mode var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, Drawable var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, bq var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, d var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, Runnable var1) {
      a.a(var0, var1);
   }

   public static void a(View var0, Runnable var1, long var2) {
      a.a(var0, var1, var2);
   }

   public static void a(View var0, boolean var1) {
      a.a(var0, var1);
   }

   public static boolean a(View var0) {
      return a.a(var0);
   }

   public static boolean a(View var0, int var1) {
      return a.a(var0, var1);
   }

   public static eo b(View var0, eo var1) {
      return a.b(var0, var1);
   }

   public static void b(View var0, float var1) {
      a.b(var0, var1);
   }

   public static void b(View var0, boolean var1) {
      a.b(var0, var1);
   }

   public static boolean b(View var0) {
      return a.b(var0);
   }

   public static boolean b(View var0, int var1) {
      return a.b(var0, var1);
   }

   public static void c(View var0) {
      a.c(var0);
   }

   public static void c(View var0, float var1) {
      a.c(var0, var1);
   }

   public static void c(View var0, int var1) {
      a.c(var0, var1);
   }

   public static int d(View var0) {
      return a.d(var0);
   }

   public static float e(View var0) {
      return a.e(var0);
   }

   public static int f(View var0) {
      return a.f(var0);
   }

   public static int g(View var0) {
      return a.g(var0);
   }

   public static int h(View var0) {
      return a.h(var0);
   }

   public static int i(View var0) {
      return a.i(var0);
   }

   public static int j(View var0) {
      return a.j(var0);
   }

   public static float k(View var0) {
      return a.l(var0);
   }

   public static float l(View var0) {
      return a.m(var0);
   }

   public static Matrix m(View var0) {
      return a.n(var0);
   }

   public static int n(View var0) {
      return a.o(var0);
   }

   public static int o(View var0) {
      return a.p(var0);
   }

   public static dy p(View var0) {
      return a.q(var0);
   }

   public static String q(View var0) {
      return a.r(var0);
   }

   public static int r(View var0) {
      return a.s(var0);
   }

   public static void s(View var0) {
      a.t(var0);
   }

   public static void t(View var0) {
      a.u(var0);
   }

   public static boolean u(View var0) {
      return a.k(var0);
   }

   public static ColorStateList v(View var0) {
      return a.v(var0);
   }

   public static Mode w(View var0) {
      return a.w(var0);
   }

   public static void x(View var0) {
      a.x(var0);
   }

   public static boolean y(View var0) {
      return a.y(var0);
   }

   public static Display z(View var0) {
      return a.z(var0);
   }
}
