package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

class ai {
   private final View a;
   private final aj b;
   private int c = -1;
   private gf d;
   private gf e;
   private gf f;

   ai(View var1) {
      this.a = var1;
      this.b = aj.a();
   }

   private boolean b(Drawable var1) {
      boolean var2 = true;
      if (this.f == null) {
         this.f = new gf();
      }

      gf var3 = this.f;
      var3.a();
      ColorStateList var4 = android.support.v4.view.bz.v(this.a);
      if (var4 != null) {
         var3.d = true;
         var3.a = var4;
      }

      Mode var5 = android.support.v4.view.bz.w(this.a);
      if (var5 != null) {
         var3.c = true;
         var3.b = var5;
      }

      if (!var3.d && !var3.c) {
         var2 = false;
      } else {
         aj.a(var1, var3, this.a.getDrawableState());
      }

      return var2;
   }

   private boolean d() {
      boolean var1 = true;
      int var2 = VERSION.SDK_INT;
      boolean var3;
      if (var2 < 21) {
         var3 = false;
      } else {
         var3 = var1;
         if (var2 != 21) {
            var3 = var1;
            if (this.d == null) {
               var3 = false;
            }
         }
      }

      return var3;
   }

   ColorStateList a() {
      ColorStateList var1;
      if (this.e != null) {
         var1 = this.e.a;
      } else {
         var1 = null;
      }

      return var1;
   }

   void a(int var1) {
      this.c = var1;
      ColorStateList var2;
      if (this.b != null) {
         var2 = this.b.b(this.a.getContext(), var1);
      } else {
         var2 = null;
      }

      this.b(var2);
      this.c();
   }

   void a(ColorStateList var1) {
      if (this.e == null) {
         this.e = new gf();
      }

      this.e.a = var1;
      this.e.d = true;
      this.c();
   }

   void a(Mode var1) {
      if (this.e == null) {
         this.e = new gf();
      }

      this.e.b = var1;
      this.e.c = true;
      this.c();
   }

   void a(Drawable var1) {
      this.c = -1;
      this.b((ColorStateList)null);
      this.c();
   }

   void a(AttributeSet param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   Mode b() {
      Mode var1;
      if (this.e != null) {
         var1 = this.e.b;
      } else {
         var1 = null;
      }

      return var1;
   }

   void b(ColorStateList var1) {
      if (var1 != null) {
         if (this.d == null) {
            this.d = new gf();
         }

         this.d.a = var1;
         this.d.d = true;
      } else {
         this.d = null;
      }

      this.c();
   }

   void c() {
      Drawable var1 = this.a.getBackground();
      if (var1 != null && (!this.d() || !this.b(var1))) {
         if (this.e != null) {
            aj.a(var1, this.e, this.a.getDrawableState());
         } else if (this.d != null) {
            aj.a(var1, this.d, this.a.getDrawableState());
         }
      }

   }
}
