package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class i implements p {
   // $FF: synthetic field
   final d a;
   // $FF: synthetic field
   final h b;

   i(h var1, d var2) {
      this.b = var1;
      this.a = var2;
   }

   public Object a(View var1) {
      android.support.v4.view.a_package.z var2 = this.a.a(var1);
      Object var3;
      if (var2 != null) {
         var3 = var2.a();
      } else {
         var3 = null;
      }

      return var3;
   }

   public void a(View var1, int var2) {
      this.a.a(var1, var2);
   }

   public void a(View var1, Object var2) {
      this.a.a(var1, new android.support.v4.view.a_package.h(var2));
   }

   public boolean a(View var1, int var2, Bundle var3) {
      return this.a.a(var1, var2, var3);
   }

   public boolean a(View var1, AccessibilityEvent var2) {
      return this.a.b(var1, var2);
   }

   public boolean a(ViewGroup var1, View var2, AccessibilityEvent var3) {
      return this.a.a(var1, var2, var3);
   }

   public void b(View var1, AccessibilityEvent var2) {
      this.a.d(var1, var2);
   }

   public void c(View var1, AccessibilityEvent var2) {
      this.a.c(var1, var2);
   }

   public void d(View var1, AccessibilityEvent var2) {
      this.a.a(var1, var2);
   }
}
