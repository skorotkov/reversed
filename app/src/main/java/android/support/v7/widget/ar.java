package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

class ar extends PopupWindow {
   private static final boolean a;
   private boolean b;

   static {
      boolean var0;
      if (VERSION.SDK_INT < 21) {
         var0 = true;
      } else {
         var0 = false;
      }

      a = var0;
   }

   public ar(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1, var2, var3, 0);
   }

   @TargetApi(11)
   public ar(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.a(var1, var2, var3, var4);
   }

   private void a(Context var1, AttributeSet var2, int var3, int var4) {
      gh var5 = gh.a(var1, var2, android.support.v7.a.k.PopupWindow, var3, var4);
      if (var5.f(android.support.v7.a.k.PopupWindow_overlapAnchor)) {
         this.a(var5.a(android.support.v7.a.k.PopupWindow_overlapAnchor, false));
      }

      this.setBackgroundDrawable(var5.a(android.support.v7.a.k.PopupWindow_android_popupBackground));
      var3 = VERSION.SDK_INT;
      if (var4 != 0 && var3 < 11 && var5.f(android.support.v7.a.k.PopupWindow_android_popupAnimationStyle)) {
         this.setAnimationStyle(var5.g(android.support.v7.a.k.PopupWindow_android_popupAnimationStyle, -1));
      }

      var5.a();
      if (VERSION.SDK_INT < 14) {
         a(this);
      }

   }

   private static void a(PopupWindow var0) {
      try {
         Field var1 = PopupWindow.class.getDeclaredField("mAnchor");
         var1.setAccessible(true);
         Field var2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
         var2.setAccessible(true);
         OnScrollChangedListener var3 = (OnScrollChangedListener)var2.get(var0);
         as var4 = new as(var1, var0, var3);
         var2.set(var0, var4);
      } catch (Exception var5) {
         Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", var5);
      }

   }

   public void a(boolean var1) {
      if (a) {
         this.b = var1;
      } else {
         android.support.v4.widget.x.a(this, var1);
      }

   }

   public void showAsDropDown(View var1, int var2, int var3) {
      int var4 = var3;
      if (a) {
         var4 = var3;
         if (this.b) {
            var4 = var3 - var1.getHeight();
         }
      }

      super.showAsDropDown(var1, var2, var4);
   }

   @TargetApi(19)
   public void showAsDropDown(View var1, int var2, int var3, int var4) {
      int var5 = var3;
      if (a) {
         var5 = var3;
         if (this.b) {
            var5 = var3 - var1.getHeight();
         }
      }

      super.showAsDropDown(var1, var2, var5, var4);
   }

   public void update(View var1, int var2, int var3, int var4, int var5) {
      if (a && this.b) {
         var3 -= var1.getHeight();
      }

      super.update(var1, var2, var3, var4, var5);
   }
}
