package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
   private TypedValue a;
   private TypedValue b;
   private TypedValue c;
   private TypedValue d;
   private TypedValue e;
   private TypedValue f;
   private final Rect g;
   private bg h;

   public ContentFrameLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ContentFrameLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ContentFrameLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.g = new Rect();
   }

   public void a(Rect var1) {
      this.fitSystemWindows(var1);
   }

   public TypedValue getFixedHeightMajor() {
      if (this.e == null) {
         this.e = new TypedValue();
      }

      return this.e;
   }

   public TypedValue getFixedHeightMinor() {
      if (this.f == null) {
         this.f = new TypedValue();
      }

      return this.f;
   }

   public TypedValue getFixedWidthMajor() {
      if (this.c == null) {
         this.c = new TypedValue();
      }

      return this.c;
   }

   public TypedValue getFixedWidthMinor() {
      if (this.d == null) {
         this.d = new TypedValue();
      }

      return this.d;
   }

   public TypedValue getMinWidthMajor() {
      if (this.a == null) {
         this.a = new TypedValue();
      }

      return this.a;
   }

   public TypedValue getMinWidthMinor() {
      if (this.b == null) {
         this.b = new TypedValue();
      }

      return this.b;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (this.h != null) {
         this.h.b();
      }

   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      if (this.h != null) {
         this.h.a();
      }

   }

   protected void onMeasure(int var1, int var2) {
      boolean var3 = false;
      DisplayMetrics var4 = this.getContext().getResources().getDisplayMetrics();
      boolean var5;
      if (var4.widthPixels < var4.heightPixels) {
         var5 = true;
      } else {
         var5 = false;
      }

      int var6;
      int var7;
      TypedValue var8;
      int var9;
      int var10;
      boolean var11;
      label92: {
         var6 = MeasureSpec.getMode(var1);
         var7 = MeasureSpec.getMode(var2);
         if (var6 == Integer.MIN_VALUE) {
            if (var5) {
               var8 = this.d;
            } else {
               var8 = this.c;
            }

            if (var8 != null && var8.type != 0) {
               if (var8.type == 5) {
                  var9 = (int)var8.getDimension(var4);
               } else if (var8.type == 6) {
                  var9 = (int)var8.getFraction((float)var4.widthPixels, (float)var4.widthPixels);
               } else {
                  var9 = 0;
               }

               if (var9 > 0) {
                  var10 = MeasureSpec.makeMeasureSpec(Math.min(var9 - (this.g.left + this.g.right), MeasureSpec.getSize(var1)), 1073741824);
                  var11 = true;
                  break label92;
               }
            }
         }

         var11 = false;
         var10 = var1;
      }

      var9 = var2;
      if (var7 == Integer.MIN_VALUE) {
         if (var5) {
            var8 = this.e;
         } else {
            var8 = this.f;
         }

         var9 = var2;
         if (var8 != null) {
            var9 = var2;
            if (var8.type != 0) {
               if (var8.type == 5) {
                  var1 = (int)var8.getDimension(var4);
               } else if (var8.type == 6) {
                  var1 = (int)var8.getFraction((float)var4.heightPixels, (float)var4.heightPixels);
               } else {
                  var1 = 0;
               }

               var9 = var2;
               if (var1 > 0) {
                  var9 = MeasureSpec.makeMeasureSpec(Math.min(var1 - (this.g.top + this.g.bottom), MeasureSpec.getSize(var2)), 1073741824);
               }
            }
         }
      }

      boolean var12;
      label82: {
         super.onMeasure(var10, var9);
         var7 = this.getMeasuredWidth();
         var10 = MeasureSpec.makeMeasureSpec(var7, 1073741824);
         if (!var11 && var6 == Integer.MIN_VALUE) {
            if (var5) {
               var8 = this.b;
            } else {
               var8 = this.a;
            }

            if (var8 != null && var8.type != 0) {
               if (var8.type == 5) {
                  var1 = (int)var8.getDimension(var4);
               } else if (var8.type == 6) {
                  var1 = (int)var8.getFraction((float)var4.widthPixels, (float)var4.widthPixels);
               } else {
                  var1 = 0;
               }

               var2 = var1;
               if (var1 > 0) {
                  var2 = var1 - (this.g.left + this.g.right);
               }

               if (var7 < var2) {
                  var2 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
                  var12 = true;
                  break label82;
               }
            }
         }

         var2 = var10;
         var12 = var3;
      }

      if (var12) {
         super.onMeasure(var2, var9);
      }

   }

   public void setAttachListener(bg var1) {
      this.h = var1;
   }
}
