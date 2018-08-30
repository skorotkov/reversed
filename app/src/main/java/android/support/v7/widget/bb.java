package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

@TargetApi(17)
class bb extends ba {
   private gf b;
   private gf c;

   bb(TextView var1) {
      super(var1);
   }

   void a() {
      super.a();
      if (this.b != null || this.c != null) {
         Drawable[] var1 = this.a.getCompoundDrawablesRelative();
         this.a(var1[0], this.b);
         this.a(var1[2], this.c);
      }

   }

   void a(AttributeSet var1, int var2) {
      super.a(var1, var2);
      Context var3 = this.a.getContext();
      aj var4 = aj.a();
      TypedArray var5 = var3.obtainStyledAttributes(var1, android.support.v7.a.k.AppCompatTextHelper, var2, 0);
      if (var5.hasValue(android.support.v7.a.k.AppCompatTextHelper_android_drawableStart)) {
         this.b = a(var3, var4, var5.getResourceId(android.support.v7.a.k.AppCompatTextHelper_android_drawableStart, 0));
      }

      if (var5.hasValue(android.support.v7.a.k.AppCompatTextHelper_android_drawableEnd)) {
         this.c = a(var3, var4, var5.getResourceId(android.support.v7.a.k.AppCompatTextHelper_android_drawableEnd, 0));
      }

      var5.recycle();
   }
}
