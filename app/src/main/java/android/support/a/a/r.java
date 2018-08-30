package android.support.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Bitmap.Config;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class r extends ConstantState {
   int a;
   q b;
   ColorStateList c = null;
   Mode d;
   boolean e;
   Bitmap f;
   ColorStateList g;
   Mode h;
   int i;
   boolean j;
   boolean k;
   Paint l;

   public r() {
      this.d = android.support.a.a.l.a;
      this.b = new q();
   }

   public r(r var1) {
      this.d = android.support.a.a.l.a;
      if (var1 != null) {
         this.a = var1.a;
         this.b = new q(var1.b);
         if (q.a(var1.b) != null) {
            q.a(this.b, new Paint(q.a(var1.b)));
         }

         if (q.b(var1.b) != null) {
            q.b(this.b, new Paint(q.b(var1.b)));
         }

         this.c = var1.c;
         this.d = var1.d;
         this.e = var1.e;
      }

   }

   public Paint a(ColorFilter var1) {
      Paint var2;
      if (!this.a() && var1 == null) {
         var2 = null;
      } else {
         if (this.l == null) {
            this.l = new Paint();
            this.l.setFilterBitmap(true);
         }

         this.l.setAlpha(this.b.getRootAlpha());
         this.l.setColorFilter(var1);
         var2 = this.l;
      }

      return var2;
   }

   public void a(int var1, int var2) {
      this.f.eraseColor(0);
      Canvas var3 = new Canvas(this.f);
      this.b.a(var3, var1, var2, (ColorFilter)null);
   }

   public void a(Canvas var1, ColorFilter var2, Rect var3) {
      Paint var4 = this.a(var2);
      var1.drawBitmap(this.f, (Rect)null, var3, var4);
   }

   public boolean a() {
      boolean var1;
      if (this.b.getRootAlpha() < 255) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void b(int var1, int var2) {
      if (this.f == null || !this.c(var1, var2)) {
         this.f = Bitmap.createBitmap(var1, var2, Config.ARGB_8888);
         this.k = true;
      }

   }

   public boolean b() {
      boolean var1;
      if (!this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void c() {
      this.g = this.c;
      this.h = this.d;
      this.i = this.b.getRootAlpha();
      this.j = this.e;
      this.k = false;
   }

   public boolean c(int var1, int var2) {
      boolean var3;
      if (var1 == this.f.getWidth() && var2 == this.f.getHeight()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public int getChangingConfigurations() {
      return this.a;
   }

   public Drawable newDrawable() {
      return new l(this);
   }

   public Drawable newDrawable(Resources var1) {
      return new l(this);
   }
}
