package fi.polar.polarflow.ui.custom;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.wearable.view.bc;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class RoundButtonListItemLayout extends FrameLayout implements bc, f {
   final int a;
   int b;
   int c;
   int d;
   int e;
   int f;
   final ValueAnimator g;
   private final int[] h;
   private View i;
   private boolean j;

   public RoundButtonListItemLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public RoundButtonListItemLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public RoundButtonListItemLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.h = new int[2];
      this.g = new ValueAnimator();
      this.g.addListener(new z(this));
      this.g.addUpdateListener(new aa(this));
      this.g.setDuration(200L);
      Resources var4 = var1.getResources();
      TypedArray var5 = var1.getTheme().obtainStyledAttributes(var2, fi.polar.polarflow.i.RoundButtonListItemLayout, 0, 0);
      this.d = var5.getDimensionPixelSize(0, var4.getDimensionPixelSize(2131362202));
      this.b = var5.getDimensionPixelOffset(1, var4.getDimensionPixelSize(2131362207));
      this.c = var5.getDimensionPixelOffset(2, var4.getDimensionPixelSize(2131362207));
      this.e = var5.getDimensionPixelOffset(3, var4.getDimensionPixelOffset(2131362201));
      this.f = this.e + this.d;
      var5.recycle();
      this.a = 0;
   }

   // $FF: synthetic method
   static View a(RoundButtonListItemLayout var0) {
      return var0.i;
   }

   public void a(int var1) {
      this.getLocationOnScreen(this.h);
      float var2;
      if (this.h[1] > this.e) {
         var2 = -((float)this.c / (float)this.d) * (float)Math.abs(this.h[1] - this.f) + (float)this.c;
      } else {
         var2 = -((float)this.b / (float)this.d) * (float)Math.abs(this.h[1] - (this.e - this.d)) + (float)this.b;
      }

      this.i.setY(var2);
      var2 = (float)Math.abs(this.e - this.h[1]);
      float var3 = -0.5F / (float)this.d;
      this.i.setAlpha(var2 * var3 + 1.0F);
   }

   public void a(boolean var1) {
      if (!var1) {
         this.i.setY((float)this.a);
         this.i.setAlpha(1.0F);
      }

      this.j = true;
   }

   public void b(int var1) {
      if (var1 == 0) {
         if (this.j) {
            this.g.cancel();
            this.g.setFloatValues(new float[]{this.i.getY(), (float)this.a});
            this.g.start();
         } else {
            this.getLocationOnScreen(this.h);
            if (this.h[1] > this.e) {
               this.i.setY((float)this.c);
            } else {
               this.i.setY((float)this.b);
            }

            this.i.setAlpha(0.5F);
         }
      }

   }

   public void b(boolean var1) {
      if (!var1) {
         this.getLocationOnScreen(this.h);
         if (this.h[1] > this.a) {
            this.i.setY((float)this.c);
         } else {
            this.i.setY((float)this.b);
         }

         this.i.setAlpha(0.5F);
      }

      this.j = false;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.i = this.findViewById(2131755200);
   }

   void setButtonNonCentralYLower(int var1) {
      this.c = var1;
   }

   void setButtonNonCentralYUpper(int var1) {
      this.b = var1;
   }

   void setButtonView(View var1) {
      this.i = var1;
   }

   void setContainerHeight(int var1) {
      this.d = var1;
   }

   void setIsCentered(boolean var1) {
      this.j = var1;
   }
}
