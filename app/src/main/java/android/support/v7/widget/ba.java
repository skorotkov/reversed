package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

@TargetApi(9)
class ba {
   final TextView a;
   private gf b;
   private gf c;
   private gf d;
   private gf e;

   ba(TextView var1) {
      this.a = var1;
   }

   static ba a(TextView var0) {
      Object var1;
      if (VERSION.SDK_INT >= 17) {
         var1 = new bb(var0);
      } else {
         var1 = new ba(var0);
      }

      return (ba)var1;
   }

   protected static gf a(Context var0, aj var1, int var2) {
      ColorStateList var4 = var1.b(var0, var2);
      gf var3;
      if (var4 != null) {
         var3 = new gf();
         var3.d = true;
         var3.a = var4;
      } else {
         var3 = null;
      }

      return var3;
   }

   void a() {
      if (this.b != null || this.c != null || this.d != null || this.e != null) {
         Drawable[] var1 = this.a.getCompoundDrawables();
         this.a(var1[0], this.b);
         this.a(var1[1], this.c);
         this.a(var1[2], this.d);
         this.a(var1[3], this.e);
      }

   }

   void a(Context var1, int var2) {
      gh var3 = gh.a(var1, var2, android.support.v7.a.k.TextAppearance);
      if (var3.f(android.support.v7.a.k.TextAppearance_textAllCaps)) {
         this.a(var3.a(android.support.v7.a.k.TextAppearance_textAllCaps, false));
      }

      if (VERSION.SDK_INT < 23 && var3.f(android.support.v7.a.k.TextAppearance_android_textColor)) {
         ColorStateList var4 = var3.d(android.support.v7.a.k.TextAppearance_android_textColor);
         if (var4 != null) {
            this.a.setTextColor(var4);
         }
      }

      var3.a();
   }

   final void a(Drawable var1, gf var2) {
      if (var1 != null && var2 != null) {
         aj.a(var1, var2, this.a.getDrawableState());
      }

   }

   void a(AttributeSet var1, int var2) {
      ColorStateList var3 = null;
      ColorStateList var4 = null;
      Context var5 = this.a.getContext();
      aj var6 = aj.a();
      gh var7 = gh.a(var5, var1, android.support.v7.a.k.AppCompatTextHelper, var2, 0);
      int var8 = var7.g(android.support.v7.a.k.AppCompatTextHelper_android_textAppearance, -1);
      if (var7.f(android.support.v7.a.k.AppCompatTextHelper_android_drawableLeft)) {
         this.b = a(var5, var6, var7.g(android.support.v7.a.k.AppCompatTextHelper_android_drawableLeft, 0));
      }

      if (var7.f(android.support.v7.a.k.AppCompatTextHelper_android_drawableTop)) {
         this.c = a(var5, var6, var7.g(android.support.v7.a.k.AppCompatTextHelper_android_drawableTop, 0));
      }

      if (var7.f(android.support.v7.a.k.AppCompatTextHelper_android_drawableRight)) {
         this.d = a(var5, var6, var7.g(android.support.v7.a.k.AppCompatTextHelper_android_drawableRight, 0));
      }

      if (var7.f(android.support.v7.a.k.AppCompatTextHelper_android_drawableBottom)) {
         this.e = a(var5, var6, var7.g(android.support.v7.a.k.AppCompatTextHelper_android_drawableBottom, 0));
      }

      var7.a();
      boolean var9 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
      boolean var10;
      ColorStateList var16;
      boolean var17;
      if (var8 != -1) {
         gh var15 = gh.a(var5, var8, android.support.v7.a.k.TextAppearance);
         if (!var9 && var15.f(android.support.v7.a.k.TextAppearance_textAllCaps)) {
            var10 = var15.a(android.support.v7.a.k.TextAppearance_textAllCaps, false);
            var17 = true;
         } else {
            var17 = false;
            var10 = false;
         }

         if (VERSION.SDK_INT < 23) {
            if (var15.f(android.support.v7.a.k.TextAppearance_android_textColor)) {
               var16 = var15.d(android.support.v7.a.k.TextAppearance_android_textColor);
            } else {
               var16 = null;
            }

            var3 = var16;
            if (var15.f(android.support.v7.a.k.TextAppearance_android_textColorHint)) {
               var4 = var15.d(android.support.v7.a.k.TextAppearance_android_textColorHint);
               var3 = var16;
            }
         } else {
            var3 = null;
         }

         var15.a();
         var16 = var3;
      } else {
         var16 = null;
         var17 = false;
         var10 = false;
         var4 = var3;
      }

      gh var14 = gh.a(var5, var1, android.support.v7.a.k.TextAppearance, var2, 0);
      boolean var13 = var17;
      boolean var11 = var10;
      if (!var9) {
         var13 = var17;
         var11 = var10;
         if (var14.f(android.support.v7.a.k.TextAppearance_textAllCaps)) {
            var11 = var14.a(android.support.v7.a.k.TextAppearance_textAllCaps, false);
            var13 = true;
         }
      }

      ColorStateList var12 = var16;
      var3 = var4;
      if (VERSION.SDK_INT < 23) {
         if (var14.f(android.support.v7.a.k.TextAppearance_android_textColor)) {
            var16 = var14.d(android.support.v7.a.k.TextAppearance_android_textColor);
         }

         var12 = var16;
         var3 = var4;
         if (var14.f(android.support.v7.a.k.TextAppearance_android_textColorHint)) {
            var3 = var14.d(android.support.v7.a.k.TextAppearance_android_textColorHint);
            var12 = var16;
         }
      }

      var14.a();
      if (var12 != null) {
         this.a.setTextColor(var12);
      }

      if (var3 != null) {
         this.a.setHintTextColor(var3);
      }

      if (!var9 && var13) {
         this.a(var11);
      }

   }

   void a(boolean var1) {
      TextView var2 = this.a;
      android.support.v7.e.a var3;
      if (var1) {
         var3 = new android.support.v7.e.a(this.a.getContext());
      } else {
         var3 = null;
      }

      var2.setTransformationMethod(var3);
   }
}
