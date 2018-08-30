package android.support.a.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class o {
   final ArrayList a = new ArrayList();
   float b = 0.0F;
   int c;
   private final Matrix d = new Matrix();
   private float e = 0.0F;
   private float f = 0.0F;
   private float g = 1.0F;
   private float h = 1.0F;
   private float i = 0.0F;
   private float j = 0.0F;
   private final Matrix k = new Matrix();
   private int[] l;
   private String m = null;

   public o() {
   }

   public o(o var1, android.support.v4.g.a var2) {
      this.b = var1.b;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.l = var1.l;
      this.m = var1.m;
      this.c = var1.c;
      if (this.m != null) {
         var2.put(this.m, this);
      }

      this.k.set(var1.k);
      ArrayList var3 = var1.a;

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         Object var5 = var3.get(var4);
         if (var5 instanceof o) {
            var1 = (o)var5;
            this.a.add(new o(var1, var2));
         } else {
            if (var5 instanceof n) {
               var5 = new n((n)var5);
            } else {
               if (!(var5 instanceof m)) {
                  throw new IllegalStateException("Unknown object in the tree!");
               }

               var5 = new m((m)var5);
            }

            this.a.add(var5);
            if (((p)var5).n != null) {
               var2.put(((p)var5).n, var5);
            }
         }
      }

   }

   // $FF: synthetic method
   static Matrix a(o var0) {
      return var0.d;
   }

   private void a() {
      this.k.reset();
      this.k.postTranslate(-this.e, -this.f);
      this.k.postScale(this.g, this.h);
      this.k.postRotate(this.b, 0.0F, 0.0F);
      this.k.postTranslate(this.i + this.e, this.j + this.f);
   }

   private void a(TypedArray var1, XmlPullParser var2) {
      this.l = null;
      this.b = android.support.a.a.j.a(var1, var2, "rotation", 5, this.b);
      this.e = var1.getFloat(1, this.e);
      this.f = var1.getFloat(2, this.f);
      this.g = android.support.a.a.j.a(var1, var2, "scaleX", 3, this.g);
      this.h = android.support.a.a.j.a(var1, var2, "scaleY", 4, this.h);
      this.i = android.support.a.a.j.a(var1, var2, "translateX", 6, this.i);
      this.j = android.support.a.a.j.a(var1, var2, "translateY", 7, this.j);
      String var3 = var1.getString(0);
      if (var3 != null) {
         this.m = var3;
      }

      this.a();
   }

   // $FF: synthetic method
   static Matrix b(o var0) {
      return var0.k;
   }

   public void a(Resources var1, AttributeSet var2, Theme var3, XmlPullParser var4) {
      TypedArray var5 = android.support.a.a.k.a(var1, var3, var2, android.support.a.a.a.b);
      this.a(var5, var4);
      var5.recycle();
   }

   public String getGroupName() {
      return this.m;
   }

   public Matrix getLocalMatrix() {
      return this.k;
   }

   public float getPivotX() {
      return this.e;
   }

   public float getPivotY() {
      return this.f;
   }

   public float getRotation() {
      return this.b;
   }

   public float getScaleX() {
      return this.g;
   }

   public float getScaleY() {
      return this.h;
   }

   public float getTranslateX() {
      return this.i;
   }

   public float getTranslateY() {
      return this.j;
   }

   public void setPivotX(float var1) {
      if (var1 != this.e) {
         this.e = var1;
         this.a();
      }

   }

   public void setPivotY(float var1) {
      if (var1 != this.f) {
         this.f = var1;
         this.a();
      }

   }

   public void setRotation(float var1) {
      if (var1 != this.b) {
         this.b = var1;
         this.a();
      }

   }

   public void setScaleX(float var1) {
      if (var1 != this.g) {
         this.g = var1;
         this.a();
      }

   }

   public void setScaleY(float var1) {
      if (var1 != this.h) {
         this.h = var1;
         this.a();
      }

   }

   public void setTranslateX(float var1) {
      if (var1 != this.i) {
         this.i = var1;
         this.a();
      }

   }

   public void setTranslateY(float var1) {
      if (var1 != this.j) {
         this.j = var1;
         this.a();
      }

   }
}
