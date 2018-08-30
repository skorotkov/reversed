package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class gh {
   private final Context a;
   private final TypedArray b;

   private gh(Context var1, TypedArray var2) {
      this.a = var1;
      this.b = var2;
   }

   public static gh a(Context var0, int var1, int[] var2) {
      return new gh(var0, var0.obtainStyledAttributes(var1, var2));
   }

   public static gh a(Context var0, AttributeSet var1, int[] var2) {
      return new gh(var0, var0.obtainStyledAttributes(var1, var2));
   }

   public static gh a(Context var0, AttributeSet var1, int[] var2, int var3, int var4) {
      return new gh(var0, var0.obtainStyledAttributes(var1, var2, var3, var4));
   }

   public float a(int var1, float var2) {
      return this.b.getFloat(var1, var2);
   }

   public int a(int var1, int var2) {
      return this.b.getInt(var1, var2);
   }

   public Drawable a(int var1) {
      Drawable var3;
      if (this.b.hasValue(var1)) {
         int var2 = this.b.getResourceId(var1, 0);
         if (var2 != 0) {
            var3 = android.support.v7.b.a.b.b(this.a, var2);
            return var3;
         }
      }

      var3 = this.b.getDrawable(var1);
      return var3;
   }

   public void a() {
      this.b.recycle();
   }

   public boolean a(int var1, boolean var2) {
      return this.b.getBoolean(var1, var2);
   }

   public int b(int var1, int var2) {
      return this.b.getColor(var1, var2);
   }

   public CharSequence b(int var1) {
      return this.b.getText(var1);
   }

   public int c(int var1, int var2) {
      return this.b.getInteger(var1, var2);
   }

   public String c(int var1) {
      return this.b.getString(var1);
   }

   public int d(int var1, int var2) {
      return this.b.getDimensionPixelOffset(var1, var2);
   }

   public ColorStateList d(int var1) {
      ColorStateList var3;
      if (this.b.hasValue(var1)) {
         int var2 = this.b.getResourceId(var1, 0);
         if (var2 != 0) {
            var3 = android.support.v7.b.a.b.a(this.a, var2);
            if (var3 != null) {
               return var3;
            }
         }
      }

      var3 = this.b.getColorStateList(var1);
      return var3;
   }

   public int e(int var1, int var2) {
      return this.b.getDimensionPixelSize(var1, var2);
   }

   public CharSequence[] e(int var1) {
      return this.b.getTextArray(var1);
   }

   public int f(int var1, int var2) {
      return this.b.getLayoutDimension(var1, var2);
   }

   public boolean f(int var1) {
      return this.b.hasValue(var1);
   }

   public int g(int var1, int var2) {
      return this.b.getResourceId(var1, var2);
   }
}
