package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class dj extends d {
   // $FF: synthetic field
   final ViewPager b;

   dj(ViewPager var1) {
      this.b = var1;
   }

   private boolean b() {
      boolean var1 = true;
      if (this.b.b == null || this.b.b.a() <= 1) {
         var1 = false;
      }

      return var1;
   }

   public void a(View var1, android.support.v4.view.a_package.h var2) {
      super.a(var1, var2);
      var2.a((CharSequence)ViewPager.class.getName());
      var2.a(this.b());
      if (this.b.canScrollHorizontally(1)) {
         var2.a(4096);
      }

      if (this.b.canScrollHorizontally(-1)) {
         var2.a(8192);
      }

   }

   public boolean a(View var1, int var2, Bundle var3) {
      boolean var4 = true;
      if (!super.a(var1, var2, var3)) {
         switch(var2) {
         case 4096:
            if (this.b.canScrollHorizontally(1)) {
               this.b.setCurrentItem(this.b.c + 1);
            } else {
               var4 = false;
            }
            break;
         case 8192:
            if (this.b.canScrollHorizontally(-1)) {
               this.b.setCurrentItem(this.b.c - 1);
            } else {
               var4 = false;
            }
            break;
         default:
            var4 = false;
         }
      }

      return var4;
   }

   public void d(View var1, AccessibilityEvent var2) {
      super.d(var1, var2);
      var2.setClassName(ViewPager.class.getName());
      android.support.v4.view.a_package.am var3 = android.support.v4.view.a.a.a(var2);
      var3.a(this.b());
      if (var2.getEventType() == 4096 && this.b.b != null) {
         var3.a(this.b.b.a());
         var3.b(this.b.c);
         var3.c(this.b.c);
      }

   }
}
