package android.support.wearable.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout.Alignment;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.Objects;

@TargetApi(21)
public class a extends View {
   private final TextPaint a;
   private float b;
   private float c;
   private Layout d;
   private int e;
   private ColorStateList f;
   private int g;
   private CharSequence h;
   private float i;
   private float j;
   private float k;
   private float l;
   private float m;
   private int n;
   private int o;

   public a(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public a(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public a(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public a(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.e = 8388659;
      this.i = 1.0F;
      this.j = 0.0F;
      this.n = Integer.MAX_VALUE;
      DisplayMetrics var5 = this.getResources().getDisplayMetrics();
      float var6 = var5.density;
      var6 = var5.scaledDensity;
      this.k = 10.0F * var6;
      this.l = var6 * 60.0F;
      this.a = new TextPaint(1);
      TypedArray var7 = var1.getTheme().obtainStyledAttributes(var2, android.support.wearable.h.ActionLabel, var3, var4);
      this.h = var7.getText(android.support.wearable.h.ActionLabel_android_text);
      this.k = var7.getDimension(android.support.wearable.h.ActionLabel_minTextSize, this.k);
      this.l = var7.getDimension(android.support.wearable.h.ActionLabel_maxTextSize, this.l);
      this.f = var7.getColorStateList(android.support.wearable.h.ActionLabel_android_textColor);
      this.n = var7.getInt(android.support.wearable.h.ActionLabel_android_maxLines, 2);
      if (this.f != null) {
         this.a();
      }

      this.a.setTextSize(this.l);
      this.a(var7.getString(android.support.wearable.h.ActionLabel_android_fontFamily), var7.getInt(android.support.wearable.h.ActionLabel_android_typeface, -1), var7.getInt(android.support.wearable.h.ActionLabel_android_textStyle, -1));
      this.e = var7.getInt(android.support.wearable.h.ActionLabel_android_gravity, this.e);
      this.c = (float)var7.getDimensionPixelSize(android.support.wearable.h.ActionLabel_android_lineSpacingExtra, (int)this.c);
      this.b = var7.getFloat(android.support.wearable.h.ActionLabel_android_lineSpacingMultiplier, this.b);
      var7.recycle();
      if (this.h == null) {
         this.h = "";
      }

   }

   private Layout a(int var1, int var2, Alignment var3) {
      StaticLayout var4;
      if (var2 > 0 && var1 > 0) {
         int var5 = var2 - (this.getPaddingTop() + this.getPaddingBottom());
         int var6 = var1 - (this.getPaddingLeft() + this.getPaddingRight());
         this.m = this.l;
         this.a.setTextSize(this.l);
         StaticLayout var7 = new StaticLayout(this.h, this.a, var6, var3, this.i, this.j, true);
         boolean var11;
         if (var7.getLineCount() > this.n) {
            var11 = true;
         } else {
            var11 = false;
         }

         boolean var12;
         if (var7.getLineTop(var7.getLineCount()) > var5) {
            var12 = true;
         } else {
            var12 = false;
         }

         boolean var8;
         if (this.a.getTextSize() > this.k) {
            var8 = true;
         } else {
            var8 = false;
         }

         label64: {
            if (!var11) {
               var4 = var7;
               if (!var12) {
                  break label64;
               }
            }

            int var9 = 1;
            boolean var10 = var12;
            var12 = var11;

            while(true) {
               if (!var12) {
                  var4 = var7;
                  if (!var10) {
                     break;
                  }
               }

               var4 = var7;
               if (!var8) {
                  break;
               }

               --this.m;
               this.a.setTextSize(this.m);
               var7 = new StaticLayout(this.h, this.a, var6, var3, this.i, this.j, true);
               if (var7.getLineTop(var7.getLineCount()) > var5) {
                  var12 = true;
               } else {
                  var12 = false;
               }

               if (var7.getLineCount() > this.n) {
                  var8 = true;
               } else {
                  var8 = false;
               }

               if (this.a.getTextSize() > this.k) {
                  var11 = true;
               } else {
                  var11 = false;
               }

               ++var9;
               var10 = var12;
               var12 = var8;
               var8 = var11;
            }
         }

         this.o = Math.min(this.n, var4.getLineCount());
      } else {
         var4 = null;
      }

      return var4;
   }

   private void a() {
      int var1 = this.f.getColorForState(this.getDrawableState(), 0);
      if (var1 != this.g) {
         this.g = var1;
         this.invalidate();
      }

   }

   private int getAvailableHeight() {
      return this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom());
   }

   @SuppressLint({"RtlHardcoded"})
   private Alignment getLayoutAlignment() {
      Alignment var1;
      switch(this.getTextAlignment()) {
      case 1:
         switch(this.e & 8388615) {
         case 1:
            var1 = Alignment.ALIGN_CENTER;
            return var1;
         case 3:
            var1 = Alignment.ALIGN_NORMAL;
            return var1;
         case 5:
            var1 = Alignment.ALIGN_OPPOSITE;
            return var1;
         case 8388611:
            var1 = Alignment.ALIGN_NORMAL;
            return var1;
         case 8388613:
            var1 = Alignment.ALIGN_OPPOSITE;
            return var1;
         default:
            var1 = Alignment.ALIGN_NORMAL;
            return var1;
         }
      case 2:
         var1 = Alignment.ALIGN_NORMAL;
         break;
      case 3:
         var1 = Alignment.ALIGN_OPPOSITE;
         break;
      case 4:
         var1 = Alignment.ALIGN_CENTER;
         break;
      default:
         var1 = Alignment.ALIGN_NORMAL;
      }

      return var1;
   }

   public void a(float var1, float var2) {
      if (this.j != var1 || this.i != var2) {
         this.j = var1;
         this.i = var2;
         if (this.d != null) {
            this.d = null;
            this.requestLayout();
            this.invalidate();
         }
      }

   }

   public void a(int var1, float var2) {
      var2 = TypedValue.applyDimension(var1, var2, this.getContext().getResources().getDisplayMetrics());
      if (var2 != this.k) {
         this.d = null;
         this.k = var2;
         this.requestLayout();
         this.invalidate();
      }

   }

   public void a(Typeface var1, int var2) {
      boolean var3 = false;
      if (var2 > 0) {
         if (var1 == null) {
            var1 = Typeface.defaultFromStyle(var2);
         } else {
            var1 = Typeface.create(var1, var2);
         }

         this.setTypeface(var1);
         int var4;
         if (var1 != null) {
            var4 = var1.getStyle();
         } else {
            var4 = 0;
         }

         var2 &= ~var4;
         TextPaint var6 = this.a;
         if ((var2 & 1) != 0) {
            var3 = true;
         }

         var6.setFakeBoldText(var3);
         var6 = this.a;
         float var5;
         if ((var2 & 2) != 0) {
            var5 = -0.25F;
         } else {
            var5 = 0.0F;
         }

         var6.setTextSkewX(var5);
      } else {
         this.a.setFakeBoldText(false);
         this.a.setTextSkewX(0.0F);
         this.setTypeface(var1);
      }

   }

   void a(String var1, int var2, int var3) {
      Typeface var4 = null;
      Typeface var5;
      if (var1 != null) {
         var5 = Typeface.create(var1, var3);
         var4 = var5;
         if (var5 != null) {
            this.setTypeface(var5);
            return;
         }
      }

      switch(var2) {
      case 1:
         var5 = Typeface.SANS_SERIF;
         break;
      case 2:
         var5 = Typeface.SERIF;
         break;
      case 3:
         var5 = Typeface.MONOSPACE;
         break;
      default:
         var5 = var4;
      }

      this.a(var5, var3);
   }

   public void b(int var1, float var2) {
      var2 = TypedValue.applyDimension(var1, var2, this.getContext().getResources().getDisplayMetrics());
      if (var2 != this.l) {
         this.d = null;
         this.l = var2;
         this.requestLayout();
         this.invalidate();
      }

   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      if (this.f != null && this.f.isStateful()) {
         this.a();
      }

   }

   public final int getCurrentTextColor() {
      return this.g;
   }

   public int getGravity() {
      return this.e;
   }

   public float getLineSpacingExtra() {
      return this.j;
   }

   public float getLineSpacingMultiplier() {
      return this.i;
   }

   public int getMaxLines() {
      return this.n;
   }

   public final ColorStateList getTextColors() {
      return this.f;
   }

   public Typeface getTypeface() {
      return this.a.getTypeface();
   }

   int getVerticalOffset() {
      byte var1 = 0;
      int var2 = this.getAvailableHeight();
      int var3 = this.d.getLineTop(this.o);
      int var4 = var1;
      switch(this.e & 112) {
      case 16:
         var4 = (var2 - var3) / 2;
      case 48:
         break;
      case 80:
         var4 = var2 - var3;
         break;
      default:
         var4 = var1;
      }

      return var4;
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.d != null) {
         var1.save();
         this.a.setColor(this.g);
         this.a.drawableState = this.getDrawableState();
         var1.translate((float)this.getPaddingLeft(), (float)(this.getPaddingTop() + this.getVerticalOffset()));
         var1.clipRect(0, 0, this.getWidth() - this.getPaddingRight(), this.d.getLineTop(this.o));
         this.d.draw(var1);
         var1.restore();
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var3 = MeasureSpec.getMode(var1);
      int var4 = MeasureSpec.getMode(var2);
      int var5 = MeasureSpec.getSize(var1);
      int var6 = MeasureSpec.getSize(var2);
      var1 = -1;
      var2 = -1;
      if (var3 == 1073741824) {
         var1 = var5;
      }

      if (var4 == 1073741824) {
         var2 = var6;
      }

      int var7 = var1;
      if (var1 == -1) {
         this.a.setTextSize(this.l);
         var7 = (int)Math.ceil((double)Layout.getDesiredWidth(this.h, this.a));
         this.a.setTextSize(this.m);
      }

      int var8 = var7;
      if (var3 == Integer.MIN_VALUE) {
         var8 = Math.min(var7, var5);
      }

      Alignment var9 = this.getLayoutAlignment();
      var1 = var2;
      if (var2 == -1) {
         if (var4 == Integer.MIN_VALUE) {
            var1 = var6;
         } else {
            var1 = Integer.MAX_VALUE;
         }
      }

      if (this.d == null) {
         this.d = this.a(var8, var1, var9);
      } else {
         boolean var10;
         if (this.d.getWidth() != var8) {
            var10 = true;
         } else {
            var10 = false;
         }

         boolean var11;
         if (this.d.getHeight() != var1) {
            var11 = true;
         } else {
            var11 = false;
         }

         if (var10 || var11) {
            this.d = this.a(var8, var1, var9);
         }
      }

      if (this.d == null) {
         this.setMeasuredDimension(0, 0);
      } else {
         if (var4 != 1073741824) {
            var1 = this.d.getLineTop(this.d.getLineCount());
         }

         var2 = var1;
         if (var4 == Integer.MIN_VALUE) {
            var2 = Math.min(var1, var6);
         }

         this.setMeasuredDimension(var8, var2);
      }

   }

   public void onRtlPropertiesChanged(int var1) {
      super.onRtlPropertiesChanged(var1);
      this.d = null;
      this.requestLayout();
      this.invalidate();
   }

   public void setGravity(int var1) {
      if (this.e != var1) {
         this.e = var1;
         this.invalidate();
      }

   }

   public void setMaxLines(int var1) {
      if (this.n != var1) {
         this.n = var1;
         this.d = null;
         this.requestLayout();
         this.invalidate();
      }

   }

   public void setMaxTextSize(float var1) {
      this.b(2, var1);
   }

   public void setMinTextSize(float var1) {
      this.a(2, var1);
   }

   public void setText(CharSequence var1) {
      if (var1 == null) {
         throw new RuntimeException("Can not set ActionLabel text to null");
      } else {
         if (!Objects.equals(this.h, var1)) {
            this.d = null;
            this.h = var1;
            this.requestLayout();
            this.invalidate();
         }

      }
   }

   public void setTextColor(int var1) {
      this.f = ColorStateList.valueOf(var1);
      this.a();
   }

   public void setTextColor(ColorStateList var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.f = var1;
         this.a();
      }
   }

   public void setTypeface(Typeface var1) {
      if (!Objects.equals(this.a.getTypeface(), var1)) {
         this.a.setTypeface(var1);
         if (this.d != null) {
            this.requestLayout();
            this.invalidate();
         }
      }

   }
}
