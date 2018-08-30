package android.support.wearable.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

@Deprecated
@TargetApi(21)
public class ActionPage extends ViewGroup {
   private final a a;
   private l b;
   private int c;
   private float d;
   private final Point e;
   private int f;
   private int g;
   private boolean h;
   private int i;
   private boolean j;

   public ActionPage(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionPage(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ActionPage(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, android.support.wearable.g.Widget_ActionPage);
   }

   public ActionPage(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.e = new Point();
      this.b = new l(var1);
      this.a = new a(var1);
      this.a.setGravity(17);
      this.a.setMaxLines(2);
      TypedArray var5 = var1.obtainStyledAttributes(var2, android.support.wearable.h.ActionPage, var3, var4);
      int var6 = 0;
      var4 = 1;
      String var7 = null;
      float var8 = 0.0F;
      float var9 = 1.0F;

      float var11;
      for(var3 = 0; var3 < var5.getIndexCount(); var9 = var11) {
         int var10 = var5.getIndex(var3);
         float var12;
         int var13;
         int var14;
         String var15;
         if (var10 == android.support.wearable.h.ActionPage_android_color) {
            this.b.setColor(var5.getColorStateList(var10));
            var11 = var9;
            var12 = var8;
            var15 = var7;
            var13 = var4;
            var14 = var6;
         } else if (var10 == android.support.wearable.h.ActionPage_android_src) {
            this.b.setImageDrawable(var5.getDrawable(var10));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_imageScaleMode) {
            this.b.setImageScaleMode(var5.getInt(var10, 0));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_buttonRippleColor) {
            this.b.setRippleColor(var5.getColor(var10, -1));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_pressedButtonTranslationZ) {
            this.b.setPressedTranslationZ(var5.getDimension(var10, 0.0F));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_text) {
            this.a.setText(var5.getText(var10));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_minTextSize) {
            this.a.a(0, var5.getDimension(var10, 10.0F));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_maxTextSize) {
            this.a.b(0, var5.getDimension(var10, 60.0F));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_textColor) {
            this.a.setTextColor(var5.getColorStateList(var10));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_maxLines) {
            this.a.setMaxLines(var5.getInt(var10, 2));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_fontFamily) {
            var15 = var5.getString(var10);
            var14 = var6;
            var13 = var4;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_typeface) {
            var13 = var5.getInt(var10, var4);
            var14 = var6;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_textStyle) {
            var14 = var5.getInt(var10, var6);
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_gravity) {
            this.a.setGravity(var5.getInt(var10, 17));
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_lineSpacingExtra) {
            var12 = var5.getDimension(var10, var8);
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var11 = var9;
         } else if (var10 == android.support.wearable.h.ActionPage_android_lineSpacingMultiplier) {
            var11 = var5.getDimension(var10, var9);
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
         } else {
            var14 = var6;
            var13 = var4;
            var15 = var7;
            var12 = var8;
            var11 = var9;
            if (var10 == android.support.wearable.h.ActionPage_android_stateListAnimator) {
               this.b.setStateListAnimator(AnimatorInflater.loadStateListAnimator(var1, var5.getResourceId(var10, 0)));
               var14 = var6;
               var13 = var4;
               var15 = var7;
               var12 = var8;
               var11 = var9;
            }
         }

         ++var3;
         var6 = var14;
         var4 = var13;
         var7 = var15;
         var8 = var12;
      }

      var5.recycle();
      this.a.a(var8, var9);
      this.a.a(var7, var4, var6);
      this.addView(this.a);
      this.addView(this.b);
   }

   public l getButton() {
      return this.b;
   }

   public a getLabel() {
      return this.a;
   }

   public WindowInsets onApplyWindowInsets(WindowInsets var1) {
      this.j = true;
      if (this.h != var1.isRound()) {
         this.h = var1.isRound();
         this.requestLayout();
      }

      int var2 = var1.getSystemWindowInsetBottom();
      if (this.i != var2) {
         this.i = var2;
         this.requestLayout();
      }

      if (this.h) {
         this.i = (int)Math.max((float)this.i, 0.09375F * (float)this.getMeasuredHeight());
      }

      return var1;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (!this.j) {
         this.requestApplyInsets();
      }

   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      this.b.layout((int)((float)this.e.x - this.d), (int)((float)this.e.y - this.d), (int)((float)this.e.x + this.d), (int)((float)this.e.y + this.d));
      var2 = (int)((float)(var4 - var2 - this.f) / 2.0F);
      this.a.layout(var2, this.b.getBottom(), this.f + var2, this.b.getBottom() + this.g);
   }

   protected void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      var2 = this.getMeasuredHeight();
      var1 = this.getMeasuredWidth();
      if (this.b.getImageScaleMode() == 1 && this.b.getImageDrawable() != null) {
         this.b.measure(0, 0);
         this.c = Math.min(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
         this.d = (float)this.c / 2.0F;
      } else {
         this.c = (int)((float)Math.min(var1, var2) * 0.45F);
         this.d = (float)this.c / 2.0F;
         this.b.measure(MeasureSpec.makeMeasureSpec(this.c, 1073741824), MeasureSpec.makeMeasureSpec(this.c, 1073741824));
      }

      if (this.h) {
         this.e.set(var1 / 2, var2 / 2);
         this.f = (int)((float)var1 * 0.625F);
         this.i = (int)((float)var2 * 0.09375F);
      } else {
         this.e.set(var1 / 2, (int)((float)var2 * 0.43F));
         this.f = (int)((float)var1 * 0.892F);
      }

      this.g = (int)((float)var2 - ((float)this.e.y + this.d) - (float)this.i);
      this.a.measure(MeasureSpec.makeMeasureSpec(this.f, 1073741824), MeasureSpec.makeMeasureSpec(this.g, 1073741824));
   }

   public void setColor(int var1) {
      this.b.setColor(var1);
   }

   public void setColor(ColorStateList var1) {
      this.b.setColor(var1);
   }

   public void setEnabled(boolean var1) {
      super.setEnabled(var1);
      if (this.b != null) {
         this.b.setEnabled(var1);
      }

   }

   public void setImageDrawable(Drawable var1) {
      this.b.setImageDrawable(var1);
   }

   public void setImageResource(int var1) {
      this.b.setImageResource(var1);
   }

   public void setImageScaleMode(int var1) {
      this.b.setImageScaleMode(var1);
   }

   public void setOnClickListener(OnClickListener var1) {
      if (this.b != null) {
         this.b.setOnClickListener(var1);
      }

   }

   public void setStateListAnimator(StateListAnimator var1) {
      if (this.b != null) {
         this.b.setStateListAnimator(var1);
      }

   }

   public void setText(CharSequence var1) {
      this.a.setText(var1);
   }
}
