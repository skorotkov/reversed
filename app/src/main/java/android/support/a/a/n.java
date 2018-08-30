package android.support.a.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class n extends p {
   int a = 0;
   float b = 0.0F;
   int c = 0;
   float d = 1.0F;
   int e;
   float f = 1.0F;
   float g = 0.0F;
   float h = 1.0F;
   float i = 0.0F;
   Cap j;
   Join k;
   float l;
   private int[] p;

   public n() {
      this.j = Cap.BUTT;
      this.k = Join.MITER;
      this.l = 4.0F;
   }

   public n(n var1) {
      super(var1);
      this.j = Cap.BUTT;
      this.k = Join.MITER;
      this.l = 4.0F;
      this.p = var1.p;
      this.a = var1.a;
      this.b = var1.b;
      this.d = var1.d;
      this.c = var1.c;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.l = var1.l;
   }

   private Cap a(int var1, Cap var2) {
      switch(var1) {
      case 0:
         var2 = Cap.BUTT;
         break;
      case 1:
         var2 = Cap.ROUND;
         break;
      case 2:
         var2 = Cap.SQUARE;
      }

      return var2;
   }

   private Join a(int var1, Join var2) {
      switch(var1) {
      case 0:
         var2 = Join.MITER;
         break;
      case 1:
         var2 = Join.ROUND;
         break;
      case 2:
         var2 = Join.BEVEL;
      }

      return var2;
   }

   private void a(TypedArray var1, XmlPullParser var2) {
      this.p = null;
      if (android.support.a.a.j.a(var2, "pathData")) {
         String var3 = var1.getString(0);
         if (var3 != null) {
            this.n = var3;
         }

         var3 = var1.getString(2);
         if (var3 != null) {
            this.m = android.support.a.a.g.a(var3);
         }

         this.c = android.support.a.a.j.b(var1, var2, "fillColor", 1, this.c);
         this.f = android.support.a.a.j.a(var1, var2, "fillAlpha", 12, this.f);
         this.j = this.a(android.support.a.a.j.a(var1, var2, "strokeLineCap", 8, -1), this.j);
         this.k = this.a(android.support.a.a.j.a(var1, var2, "strokeLineJoin", 9, -1), this.k);
         this.l = android.support.a.a.j.a(var1, var2, "strokeMiterLimit", 10, this.l);
         this.a = android.support.a.a.j.b(var1, var2, "strokeColor", 3, this.a);
         this.d = android.support.a.a.j.a(var1, var2, "strokeAlpha", 11, this.d);
         this.b = android.support.a.a.j.a(var1, var2, "strokeWidth", 4, this.b);
         this.h = android.support.a.a.j.a(var1, var2, "trimPathEnd", 6, this.h);
         this.i = android.support.a.a.j.a(var1, var2, "trimPathOffset", 7, this.i);
         this.g = android.support.a.a.j.a(var1, var2, "trimPathStart", 5, this.g);
      }

   }

   public void a(Resources var1, AttributeSet var2, Theme var3, XmlPullParser var4) {
      TypedArray var5 = android.support.a.a.k.a(var1, var3, var2, android.support.a.a.a.c);
      this.a(var5, var4);
      var5.recycle();
   }

   float getFillAlpha() {
      return this.f;
   }

   int getFillColor() {
      return this.c;
   }

   float getStrokeAlpha() {
      return this.d;
   }

   int getStrokeColor() {
      return this.a;
   }

   float getStrokeWidth() {
      return this.b;
   }

   float getTrimPathEnd() {
      return this.h;
   }

   float getTrimPathOffset() {
      return this.i;
   }

   float getTrimPathStart() {
      return this.g;
   }

   void setFillAlpha(float var1) {
      this.f = var1;
   }

   void setFillColor(int var1) {
      this.c = var1;
   }

   void setStrokeAlpha(float var1) {
      this.d = var1;
   }

   void setStrokeColor(int var1) {
      this.a = var1;
   }

   void setStrokeWidth(float var1) {
      this.b = var1;
   }

   void setTrimPathEnd(float var1) {
      this.h = var1;
   }

   void setTrimPathOffset(float var1) {
      this.i = var1;
   }

   void setTrimPathStart(float var1) {
      this.g = var1;
   }
}
