package android.support.v4.view;

import android.os.Bundle;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class d {
   private static final g b;
   private static final Object c;
   final Object a;

   static {
      if (VERSION.SDK_INT >= 16) {
         b = new h();
      } else if (VERSION.SDK_INT >= 14) {
         b = new e();
      } else {
         b = new j();
      }

      c = b.a();
   }

   public d() {
      this.a = b.a(this);
   }

   public android.support.v4.view.a_package.z a(View var1) {
      return b.a(c, var1);
   }

   Object a() {
      return this.a;
   }

   public void a(View var1, int var2) {
      b.a(c, var1, var2);
   }

   public void a(View var1, android.support.v4.view.a_package.h var2) {
      b.a(c, var1, var2);
   }

   public void a(View var1, AccessibilityEvent var2) {
      b.d(c, var1, var2);
   }

   public boolean a(View var1, int var2, Bundle var3) {
      return b.a(c, var1, var2, var3);
   }

   public boolean a(ViewGroup var1, View var2, AccessibilityEvent var3) {
      return b.a(c, var1, var2, var3);
   }

   public boolean b(View var1, AccessibilityEvent var2) {
      return b.a(c, var1, var2);
   }

   public void c(View var1, AccessibilityEvent var2) {
      b.c(c, var1, var2);
   }

   public void d(View var1, AccessibilityEvent var2) {
      b.b(c, var1, var2);
   }
}
