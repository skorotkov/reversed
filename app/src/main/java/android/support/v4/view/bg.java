package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class bg {
   static final bk a;

   static {
      if (VERSION.SDK_INT >= 14) {
         a = new bj();
      } else if (VERSION.SDK_INT >= 12) {
         a = new bi();
      } else {
         a = new bh();
      }

   }

   public static int a(MotionEvent var0) {
      return var0.getAction() & 255;
   }

   @Deprecated
   public static int a(MotionEvent var0, int var1) {
      return var0.getPointerId(var1);
   }

   @Deprecated
   public static float b(MotionEvent var0, int var1) {
      return var0.getX(var1);
   }

   public static int b(MotionEvent var0) {
      return (var0.getAction() & '\uff00') >> 8;
   }

   @Deprecated
   public static float c(MotionEvent var0, int var1) {
      return var0.getY(var1);
   }

   public static float d(MotionEvent var0, int var1) {
      return a.a(var0, var1);
   }
}
