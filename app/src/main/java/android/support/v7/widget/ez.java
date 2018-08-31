package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class ez extends android.support.v4.view.d {
   final dl b;
   final android.support.v4.view.d c = new fa(this);

   public ez(dl var1) {
      this.b = var1;
   }

   public void a(View var1, android.support.v4.view.a_package.h var2) {
      super.a(var1, var2);
      var2.a((CharSequence)dl.class.getName());
      if (!this.b() && this.b.getLayoutManager() != null) {
         this.b.getLayoutManager().a(var2);
      }

   }

   public boolean a(View var1, int var2, Bundle var3) {
      boolean var4;
      if (super.a(var1, var2, var3)) {
         var4 = true;
      } else if (!this.b() && this.b.getLayoutManager() != null) {
         var4 = this.b.getLayoutManager().a(var2, var3);
      } else {
         var4 = false;
      }

      return var4;
   }

   boolean b() {
      return this.b.w();
   }

   public android.support.v4.view.d c() {
      return this.c;
   }

   public void d(View var1, AccessibilityEvent var2) {
      super.d(var1, var2);
      var2.setClassName(dl.class.getName());
      if (var1 instanceof dl && !this.b()) {
         dl var3 = (dl)var1;
         if (var3.getLayoutManager() != null) {
            var3.getLayoutManager().a(var2);
         }
      }

   }
}
