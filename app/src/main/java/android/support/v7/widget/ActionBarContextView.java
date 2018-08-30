package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a {
   private CharSequence g;
   private CharSequence h;
   private View i;
   private View j;
   private LinearLayout k;
   private TextView l;
   private TextView m;
   private int n;
   private int o;
   private boolean p;
   private int q;

   public ActionBarContextView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionBarContextView(Context var1, AttributeSet var2) {
      this(var1, var2, android.support.v7.a.b.actionModeStyle);
   }

   public ActionBarContextView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      gh var4 = gh.a(var1, var2, android.support.v7.a.k.ActionMode, var3, 0);
      android.support.v4.view.bz.a(this, (Drawable)var4.a(android.support.v7.a.k.ActionMode_background));
      this.n = var4.g(android.support.v7.a.k.ActionMode_titleTextStyle, 0);
      this.o = var4.g(android.support.v7.a.k.ActionMode_subtitleTextStyle, 0);
      this.e = var4.f(android.support.v7.a.k.ActionMode_height, 0);
      this.q = var4.g(android.support.v7.a.k.ActionMode_closeItemLayout, android.support.v7.a.h.abc_action_mode_close_item_material);
      var4.a();
   }

   private void a() {
      byte var1 = 8;
      boolean var2 = true;
      if (this.k == null) {
         LayoutInflater.from(this.getContext()).inflate(android.support.v7.a.h.abc_action_bar_title_item, this);
         this.k = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
         this.l = (TextView)this.k.findViewById(android.support.v7.a.g.action_bar_title);
         this.m = (TextView)this.k.findViewById(android.support.v7.a.g.action_bar_subtitle);
         if (this.n != 0) {
            this.l.setTextAppearance(this.getContext(), this.n);
         }

         if (this.o != 0) {
            this.m.setTextAppearance(this.getContext(), this.o);
         }
      }

      this.l.setText(this.g);
      this.m.setText(this.h);
      boolean var3;
      if (!TextUtils.isEmpty(this.g)) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (TextUtils.isEmpty(this.h)) {
         var2 = false;
      }

      TextView var4 = this.m;
      byte var5;
      if (var2) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      byte var6;
      LinearLayout var7;
      label33: {
         var4.setVisibility(var5);
         var7 = this.k;
         if (!var3) {
            var6 = var1;
            if (!var2) {
               break label33;
            }
         }

         var6 = 0;
      }

      var7.setVisibility(var6);
      if (this.k.getParent() == null) {
         this.addView(this.k);
      }

   }

   protected LayoutParams generateDefaultLayoutParams() {
      return new MarginLayoutParams(-1, -2);
   }

   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return new MarginLayoutParams(this.getContext(), var1);
   }

   public CharSequence getSubtitle() {
      return this.h;
   }

   public CharSequence getTitle() {
      return this.g;
   }

   public void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      if (this.d != null) {
         this.d.e();
         this.d.g();
      }

   }

   public void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      if (VERSION.SDK_INT >= 14) {
         if (var1.getEventType() == 32) {
            var1.setSource(this);
            var1.setClassName(this.getClass().getName());
            var1.setPackageName(this.getContext().getPackageName());
            var1.setContentDescription(this.g);
         } else {
            super.onInitializeAccessibilityEvent(var1);
         }
      }

   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var1 = gx.a(this);
      int var6;
      if (var1) {
         var6 = var4 - var2 - this.getPaddingRight();
      } else {
         var6 = this.getPaddingLeft();
      }

      int var7 = this.getPaddingTop();
      int var8 = var5 - var3 - this.getPaddingTop() - this.getPaddingBottom();
      if (this.i != null && this.i.getVisibility() != 8) {
         MarginLayoutParams var9 = (MarginLayoutParams)this.i.getLayoutParams();
         if (var1) {
            var3 = var9.rightMargin;
         } else {
            var3 = var9.leftMargin;
         }

         if (var1) {
            var5 = var9.leftMargin;
         } else {
            var5 = var9.rightMargin;
         }

         var3 = a(var6, var3, var1);
         var3 = a(this.a(this.i, var3, var7, var8, var1) + var3, var5, var1);
      } else {
         var3 = var6;
      }

      var5 = var3;
      if (this.k != null) {
         var5 = var3;
         if (this.j == null) {
            var5 = var3;
            if (this.k.getVisibility() != 8) {
               var5 = var3 + this.a(this.k, var3, var7, var8, var1);
            }
         }
      }

      if (this.j != null) {
         this.a(this.j, var5, var7, var8, var1);
      }

      if (var1) {
         var2 = this.getPaddingLeft();
      } else {
         var2 = var4 - var2 - this.getPaddingRight();
      }

      if (this.c != null) {
         ActionMenuView var10 = this.c;
         if (!var1) {
            var1 = true;
         } else {
            var1 = false;
         }

         this.a(var10, var2, var7, var8, var1);
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var3 = 1073741824;
      byte var4 = 0;
      if (MeasureSpec.getMode(var1) != 1073741824) {
         throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
      } else if (MeasureSpec.getMode(var2) == 0) {
         throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
      } else {
         int var5 = MeasureSpec.getSize(var1);
         int var6;
         if (this.e > 0) {
            var6 = this.e;
         } else {
            var6 = MeasureSpec.getSize(var2);
         }

         int var7 = this.getPaddingTop() + this.getPaddingBottom();
         var1 = var5 - this.getPaddingLeft() - this.getPaddingRight();
         int var8 = var6 - var7;
         int var9 = MeasureSpec.makeMeasureSpec(var8, Integer.MIN_VALUE);
         var2 = var1;
         if (this.i != null) {
            var2 = this.a(this.i, var1, var9, 0);
            MarginLayoutParams var10 = (MarginLayoutParams)this.i.getLayoutParams();
            var1 = var10.leftMargin;
            var2 -= var10.rightMargin + var1;
         }

         var1 = var2;
         if (this.c != null) {
            var1 = var2;
            if (this.c.getParent() == this) {
               var1 = this.a(this.c, var2, var9, 0);
            }
         }

         var2 = var1;
         if (this.k != null) {
            var2 = var1;
            if (this.j == null) {
               if (this.p) {
                  var2 = MeasureSpec.makeMeasureSpec(0, 0);
                  this.k.measure(var2, var9);
                  int var11 = this.k.getMeasuredWidth();
                  boolean var13;
                  if (var11 <= var1) {
                     var13 = true;
                  } else {
                     var13 = false;
                  }

                  var2 = var1;
                  if (var13) {
                     var2 = var1 - var11;
                  }

                  LinearLayout var14 = this.k;
                  byte var12;
                  if (var13) {
                     var12 = 0;
                  } else {
                     var12 = 8;
                  }

                  var14.setVisibility(var12);
               } else {
                  var2 = this.a(this.k, var1, var9, 0);
               }
            }
         }

         if (this.j != null) {
            LayoutParams var15 = this.j.getLayoutParams();
            if (var15.width != -2) {
               var1 = 1073741824;
            } else {
               var1 = Integer.MIN_VALUE;
            }

            var9 = var2;
            if (var15.width >= 0) {
               var9 = Math.min(var15.width, var2);
            }

            if (var15.height != -2) {
               var2 = var3;
            } else {
               var2 = Integer.MIN_VALUE;
            }

            if (var15.height >= 0) {
               var3 = Math.min(var15.height, var8);
            } else {
               var3 = var8;
            }

            this.j.measure(MeasureSpec.makeMeasureSpec(var9, var1), MeasureSpec.makeMeasureSpec(var3, var2));
         }

         if (this.e <= 0) {
            var9 = this.getChildCount();
            var1 = 0;

            for(var2 = var4; var2 < var9; ++var2) {
               var6 = this.getChildAt(var2).getMeasuredHeight() + var7;
               if (var6 > var1) {
                  var1 = var6;
               }
            }

            this.setMeasuredDimension(var5, var1);
         } else {
            this.setMeasuredDimension(var5, var6);
         }

      }
   }

   public void setContentHeight(int var1) {
      this.e = var1;
   }

   public void setCustomView(View var1) {
      if (this.j != null) {
         this.removeView(this.j);
      }

      this.j = var1;
      if (var1 != null && this.k != null) {
         this.removeView(this.k);
         this.k = null;
      }

      if (var1 != null) {
         this.addView(var1);
      }

      this.requestLayout();
   }

   public void setSubtitle(CharSequence var1) {
      this.h = var1;
      this.a();
   }

   public void setTitle(CharSequence var1) {
      this.g = var1;
      this.a();
   }

   public void setTitleOptional(boolean var1) {
      if (var1 != this.p) {
         this.requestLayout();
      }

      this.p = var1;
   }

   public boolean shouldDelayChildPressedState() {
      return false;
   }
}
