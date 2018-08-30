package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.a.am;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

class t extends android.support.v4.view.d {
   public void a(View var1, android.support.v4.view.a.h var2) {
      super.a(var1, var2);
      NestedScrollView var4 = (NestedScrollView)var1;
      var2.a((CharSequence)ScrollView.class.getName());
      if (var4.isEnabled()) {
         int var3 = var4.getScrollRange();
         if (var3 > 0) {
            var2.a(true);
            if (var4.getScrollY() > 0) {
               var2.a(8192);
            }

            if (var4.getScrollY() < var3) {
               var2.a(4096);
            }
         }
      }

   }

   public boolean a(View var1, int var2, Bundle var3) {
      boolean var4 = true;
      if (!super.a(var1, var2, var3)) {
         NestedScrollView var7 = (NestedScrollView)var1;
         if (!var7.isEnabled()) {
            var4 = false;
         } else {
            switch(var2) {
            case 4096:
               var2 = Math.min(var7.getHeight() - var7.getPaddingBottom() - var7.getPaddingTop() + var7.getScrollY(), var7.getScrollRange());
               if (var2 != var7.getScrollY()) {
                  var7.b(0, var2);
               } else {
                  var4 = false;
               }
               break;
            case 8192:
               int var5 = var7.getHeight();
               var2 = var7.getPaddingBottom();
               int var6 = var7.getPaddingTop();
               var2 = Math.max(var7.getScrollY() - (var5 - var2 - var6), 0);
               if (var2 != var7.getScrollY()) {
                  var7.b(0, var2);
               } else {
                  var4 = false;
               }
               break;
            default:
               var4 = false;
            }
         }
      }

      return var4;
   }

   public void d(View var1, AccessibilityEvent var2) {
      super.d(var1, var2);
      NestedScrollView var4 = (NestedScrollView)var1;
      var2.setClassName(ScrollView.class.getName());
      am var5 = android.support.v4.view.a.a.a(var2);
      boolean var3;
      if (var4.getScrollRange() > 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      var5.a(var3);
      var5.d(var4.getScrollX());
      var5.e(var4.getScrollY());
      var5.f(var4.getScrollX());
      var5.g(var4.getScrollRange());
   }
}
