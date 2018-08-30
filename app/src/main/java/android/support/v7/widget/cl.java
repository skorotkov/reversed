package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class cl extends ViewGroup {
   private boolean a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private float g;
   private boolean h;
   private int[] i;
   private int[] j;
   private Drawable k;
   private int l;
   private int m;
   private int n;
   private int o;

   public cl(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public cl(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public cl(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a = true;
      this.b = -1;
      this.c = 0;
      this.e = 8388659;
      gh var5 = gh.a(var1, var2, android.support.v7.a.k.LinearLayoutCompat, var3, 0);
      var3 = var5.a(android.support.v7.a.k.LinearLayoutCompat_android_orientation, -1);
      if (var3 >= 0) {
         this.setOrientation(var3);
      }

      var3 = var5.a(android.support.v7.a.k.LinearLayoutCompat_android_gravity, -1);
      if (var3 >= 0) {
         this.setGravity(var3);
      }

      boolean var4 = var5.a(android.support.v7.a.k.LinearLayoutCompat_android_baselineAligned, true);
      if (!var4) {
         this.setBaselineAligned(var4);
      }

      this.g = var5.a(android.support.v7.a.k.LinearLayoutCompat_android_weightSum, -1.0F);
      this.b = var5.a(android.support.v7.a.k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
      this.h = var5.a(android.support.v7.a.k.LinearLayoutCompat_measureWithLargestChild, false);
      this.setDividerDrawable(var5.a(android.support.v7.a.k.LinearLayoutCompat_divider));
      this.n = var5.a(android.support.v7.a.k.LinearLayoutCompat_showDividers, 0);
      this.o = var5.e(android.support.v7.a.k.LinearLayoutCompat_dividerPadding, 0);
      var5.a();
   }

   private void a(View var1, int var2, int var3, int var4, int var5) {
      var1.layout(var2, var3, var2 + var4, var3 + var5);
   }

   private void c(int var1, int var2) {
      int var3 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);

      for(int var4 = 0; var4 < var1; ++var4) {
         View var5 = this.b(var4);
         if (var5.getVisibility() != 8) {
            cm var6 = (cm)var5.getLayoutParams();
            if (var6.width == -1) {
               int var7 = var6.height;
               var6.height = var5.getMeasuredHeight();
               this.measureChildWithMargins(var5, var3, 0, var2, 0);
               var6.height = var7;
            }
         }
      }

   }

   private void d(int var1, int var2) {
      int var3 = MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);

      for(int var4 = 0; var4 < var1; ++var4) {
         View var5 = this.b(var4);
         if (var5.getVisibility() != 8) {
            cm var6 = (cm)var5.getLayoutParams();
            if (var6.height == -1) {
               int var7 = var6.width;
               var6.width = var5.getMeasuredWidth();
               this.measureChildWithMargins(var5, var2, 0, var3, 0);
               var6.width = var7;
            }
         }
      }

   }

   int a(View var1) {
      return 0;
   }

   int a(View var1, int var2) {
      return 0;
   }

   void a(int var1, int var2) {
      this.f = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      boolean var7 = true;
      float var8 = 0.0F;
      int var9 = this.getVirtualChildCount();
      int var10 = MeasureSpec.getMode(var1);
      int var11 = MeasureSpec.getMode(var2);
      boolean var12 = false;
      boolean var13 = false;
      int var14 = this.b;
      boolean var15 = this.h;
      int var16 = Integer.MIN_VALUE;

      int var17;
      int var19;
      int var20;
      int var21;
      int var29;
      int var30;
      boolean var31;
      boolean var34;
      for(var17 = 0; var17 < var9; var7 = var34) {
         View var18 = this.b(var17);
         boolean var27;
         if (var18 == null) {
            this.f += this.d(var17);
            var19 = var16;
            var34 = var13;
            var13 = var7;
            var29 = var3;
            var16 = var4;
            var27 = var34;
            var3 = var19;
         } else if (var18.getVisibility() == 8) {
            var20 = var17 + this.a(var18, var17);
            var17 = var16;
            var16 = var4;
            var19 = var3;
            var3 = var17;
            var27 = var13;
            var17 = var20;
            var13 = var7;
            var29 = var19;
         } else {
            if (this.c(var17)) {
               this.f += this.m;
            }

            cm var22 = (cm)var18.getLayoutParams();
            var8 += var22.g;
            if (var11 == 1073741824 && var22.height == 0 && var22.g > 0.0F) {
               var30 = this.f;
               this.f = Math.max(var30, var22.topMargin + var30 + var22.bottomMargin);
               var34 = true;
               var19 = var16;
            } else {
               var20 = Integer.MIN_VALUE;
               var19 = var20;
               if (var22.height == 0) {
                  var19 = var20;
                  if (var22.g > 0.0F) {
                     var19 = 0;
                     var22.height = -2;
                  }
               }

               if (var8 == 0.0F) {
                  var20 = this.f;
               } else {
                  var20 = 0;
               }

               this.a(var18, var17, var1, 0, var2, var20);
               if (var19 != Integer.MIN_VALUE) {
                  var22.height = var19;
               }

               var21 = var18.getMeasuredHeight();
               var19 = this.f;
               this.f = Math.max(var19, var19 + var21 + var22.topMargin + var22.bottomMargin + this.b(var18));
               var19 = var16;
               var34 = var13;
               if (var15) {
                  var19 = Math.max(var21, var16);
                  var34 = var13;
               }
            }

            if (var14 >= 0 && var14 == var17 + 1) {
               this.c = this.f;
            }

            if (var17 < var14 && var22.g > 0.0F) {
               throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
            }

            var13 = false;
            if (var10 != 1073741824 && var22.width == -1) {
               var31 = true;
               var12 = true;
            } else {
               var31 = var12;
               var12 = var13;
            }

            var30 = var22.leftMargin;
            int var23 = var22.rightMargin + var30;
            var21 = var18.getMeasuredWidth() + var23;
            int var24 = Math.max(var3, var21);
            int var25 = gx.a(var4, android.support.v4.view.bz.j(var18));
            if (var7 && var22.width == -1) {
               var13 = true;
            } else {
               var13 = false;
            }

            if (var22.g > 0.0F) {
               if (var12) {
                  var21 = var23;
               }

               var3 = Math.max(var6, var21);
               var4 = var5;
            } else {
               if (!var12) {
                  var23 = var21;
               }

               var4 = Math.max(var5, var23);
               var3 = var6;
            }

            var17 += this.a(var18, var17);
            var6 = var3;
            var5 = var4;
            var29 = var24;
            var3 = var19;
            var12 = var31;
            var27 = var34;
            var16 = var25;
         }

         ++var17;
         var21 = var3;
         var34 = var13;
         var4 = var16;
         var3 = var29;
         var16 = var21;
         var13 = var27;
      }

      if (this.f > 0 && this.c(var9)) {
         this.f += this.m;
      }

      cm var32;
      View var35;
      if (var15 && (var11 == Integer.MIN_VALUE || var11 == 0)) {
         this.f = 0;

         for(var17 = 0; var17 < var9; ++var17) {
            var35 = this.b(var17);
            if (var35 == null) {
               this.f += this.d(var17);
            } else if (var35.getVisibility() == 8) {
               var17 += this.a(var35, var17);
            } else {
               var32 = (cm)var35.getLayoutParams();
               var19 = this.f;
               var20 = var32.topMargin;
               this.f = Math.max(var19, var32.bottomMargin + var19 + var16 + var20 + this.b(var35));
            }
         }
      }

      this.f += this.getPaddingTop() + this.getPaddingBottom();
      var20 = android.support.v4.view.bz.a(Math.max(this.f, this.getSuggestedMinimumHeight()), var2, 0);
      var17 = (16777215 & var20) - this.f;
      if (!var13 && (var17 == 0 || var8 <= 0.0F)) {
         var5 = Math.max(var5, var6);
         if (var15 && var11 != 1073741824) {
            for(var30 = 0; var30 < var9; ++var30) {
               var35 = this.b(var30);
               if (var35 != null && var35.getVisibility() != 8 && ((cm)var35.getLayoutParams()).g > 0.0F) {
                  var35.measure(MeasureSpec.makeMeasureSpec(var35.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var16, 1073741824));
               }
            }
         }

         var16 = var5;
         var13 = var7;
      } else {
         if (this.g > 0.0F) {
            var8 = this.g;
         }

         this.f = 0;
         byte var33 = 0;
         var29 = var5;
         var5 = var17;
         var17 = var33;
         var16 = var3;
         boolean var28 = var7;

         for(var30 = var5; var17 < var9; var29 = var5) {
            var35 = this.b(var17);
            if (var35.getVisibility() == 8) {
               var5 = var29;
               var29 = var16;
               var16 = var5;
            } else {
               var32 = (cm)var35.getLayoutParams();
               float var26 = var32.g;
               if (var26 > 0.0F) {
                  var6 = (int)((float)var30 * var26 / var8);
                  var21 = getChildMeasureSpec(var1, this.getPaddingLeft() + this.getPaddingRight() + var32.leftMargin + var32.rightMargin, var32.width);
                  if (var32.height == 0 && var11 == 1073741824) {
                     if (var6 > 0) {
                        var5 = var6;
                     } else {
                        var5 = 0;
                     }

                     var35.measure(var21, MeasureSpec.makeMeasureSpec(var5, 1073741824));
                  } else {
                     var19 = var6 + var35.getMeasuredHeight();
                     var5 = var19;
                     if (var19 < 0) {
                        var5 = 0;
                     }

                     var35.measure(var21, MeasureSpec.makeMeasureSpec(var5, 1073741824));
                  }

                  var4 = gx.a(var4, android.support.v4.view.bz.j(var35) & -256);
                  var5 = var30 - var6;
                  var30 = var4;
                  var8 -= var26;
                  var4 = var5;
               } else {
                  var5 = var30;
                  var30 = var4;
                  var4 = var5;
               }

               var19 = var32.leftMargin + var32.rightMargin;
               var6 = var35.getMeasuredWidth() + var19;
               var5 = Math.max(var16, var6);
               if (var10 != 1073741824 && var32.width == -1) {
                  var31 = true;
               } else {
                  var31 = false;
               }

               if (var31) {
                  var16 = var19;
               } else {
                  var16 = var6;
               }

               var16 = Math.max(var29, var16);
               if (var28 && var32.width == -1) {
                  var28 = true;
               } else {
                  var28 = false;
               }

               var29 = this.f;
               var19 = var35.getMeasuredHeight();
               var6 = var32.topMargin;
               this.f = Math.max(var29, var32.bottomMargin + var19 + var29 + var6 + this.b(var35));
               var29 = var5;
               var5 = var4;
               var4 = var30;
               var30 = var5;
            }

            ++var17;
            var5 = var16;
            var16 = var29;
         }

         this.f += this.getPaddingTop() + this.getPaddingBottom();
         var13 = var28;
         var3 = var16;
         var16 = var29;
      }

      if (!var13 && var10 != 1073741824) {
         var3 = var16;
      }

      this.setMeasuredDimension(android.support.v4.view.bz.a(Math.max(var3 + this.getPaddingLeft() + this.getPaddingRight(), this.getSuggestedMinimumWidth()), var1, var4), var20);
      if (var12) {
         this.c(var9, var2);
      }

   }

   void a(int var1, int var2, int var3, int var4) {
      int var5 = this.getPaddingLeft();
      int var6 = var3 - var1;
      int var7 = this.getPaddingRight();
      int var8 = this.getPaddingRight();
      int var9 = this.getVirtualChildCount();
      var1 = this.e;
      int var10 = this.e;
      switch(var1 & 112) {
      case 16:
         var1 = this.getPaddingTop() + (var4 - var2 - this.f) / 2;
         break;
      case 80:
         var1 = this.getPaddingTop() + var4 - var2 - this.f;
         break;
      default:
         var1 = this.getPaddingTop();
      }

      byte var15 = 0;
      var2 = var1;

      for(var1 = var15; var1 < var9; ++var1) {
         View var11 = this.b(var1);
         if (var11 == null) {
            var2 += this.d(var1);
         } else if (var11.getVisibility() != 8) {
            int var12 = var11.getMeasuredWidth();
            int var13 = var11.getMeasuredHeight();
            cm var14 = (cm)var11.getLayoutParams();
            var4 = var14.h;
            var3 = var4;
            if (var4 < 0) {
               var3 = var10 & 8388615;
            }

            switch(android.support.v4.view.y.a(var3, android.support.v4.view.bz.g(this)) & 7) {
            case 1:
               var3 = (var6 - var5 - var8 - var12) / 2 + var5 + var14.leftMargin - var14.rightMargin;
               break;
            case 5:
               var3 = var6 - var7 - var12 - var14.rightMargin;
               break;
            default:
               var3 = var5 + var14.leftMargin;
            }

            if (this.c(var1)) {
               var2 += this.m;
            }

            var2 += var14.topMargin;
            this.a(var11, var3, var2 + this.a(var11), var12, var13);
            var2 += var14.bottomMargin + var13 + this.b(var11);
            var1 += this.a(var11, var1);
         }
      }

   }

   void a(Canvas var1) {
      int var2 = this.getVirtualChildCount();

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         View var4 = this.b(var3);
         if (var4 != null && var4.getVisibility() != 8 && this.c(var3)) {
            cm var5 = (cm)var4.getLayoutParams();
            this.a(var1, var4.getTop() - var5.topMargin - this.m);
         }
      }

      if (this.c(var2)) {
         View var7 = this.b(var2 - 1);
         if (var7 == null) {
            var3 = this.getHeight() - this.getPaddingBottom() - this.m;
         } else {
            cm var6 = (cm)var7.getLayoutParams();
            var3 = var7.getBottom();
            var3 += var6.bottomMargin;
         }

         this.a(var1, var3);
      }

   }

   void a(Canvas var1, int var2) {
      this.k.setBounds(this.getPaddingLeft() + this.o, var2, this.getWidth() - this.getPaddingRight() - this.o, this.m + var2);
      this.k.draw(var1);
   }

   void a(View var1, int var2, int var3, int var4, int var5, int var6) {
      this.measureChildWithMargins(var1, var3, var4, var5, var6);
   }

   int b(View var1) {
      return 0;
   }

   public cm b(AttributeSet var1) {
      return new cm(this.getContext(), var1);
   }

   protected cm b(LayoutParams var1) {
      return new cm(var1);
   }

   View b(int var1) {
      return this.getChildAt(var1);
   }

   void b(int var1, int var2) {
      this.f = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      boolean var7 = true;
      float var8 = 0.0F;
      int var9 = this.getVirtualChildCount();
      int var10 = MeasureSpec.getMode(var1);
      int var11 = MeasureSpec.getMode(var2);
      boolean var12 = false;
      boolean var13 = false;
      if (this.i == null || this.j == null) {
         this.i = new int[4];
         this.j = new int[4];
      }

      int[] var14 = this.i;
      int[] var15 = this.j;
      var14[3] = -1;
      var14[2] = -1;
      var14[1] = -1;
      var14[0] = -1;
      var15[3] = -1;
      var15[2] = -1;
      var15[1] = -1;
      var15[0] = -1;
      boolean var16 = this.a;
      boolean var17 = this.h;
      boolean var18;
      if (var10 == 1073741824) {
         var18 = true;
      } else {
         var18 = false;
      }

      int var19 = Integer.MIN_VALUE;

      int var20;
      View var21;
      int var22;
      int var23;
      cm var24;
      int var25;
      boolean var30;
      int var31;
      int var34;
      for(var20 = 0; var20 < var9; var13 = var30) {
         var21 = this.b(var20);
         boolean var36;
         if (var21 == null) {
            this.f += this.d(var20);
            var34 = var4;
            var36 = var7;
            var30 = var13;
            var31 = var19;
         } else if (var21.getVisibility() == 8) {
            var23 = var20 + this.a(var21, var20);
            var36 = var7;
            var34 = var4;
            var31 = var19;
            var30 = var13;
            var20 = var23;
         } else {
            if (this.c(var20)) {
               this.f += this.l;
            }

            var24 = (cm)var21.getLayoutParams();
            var8 += var24.g;
            boolean var41;
            if (var10 == 1073741824 && var24.width == 0 && var24.g > 0.0F) {
               if (var18) {
                  this.f += var24.leftMargin + var24.rightMargin;
               } else {
                  var22 = this.f;
                  this.f = Math.max(var22, var24.leftMargin + var22 + var24.rightMargin);
               }

               if (var16) {
                  var22 = MeasureSpec.makeMeasureSpec(0, 0);
                  var21.measure(var22, var22);
                  var41 = var13;
                  var22 = var19;
               } else {
                  var41 = true;
                  var22 = var19;
               }
            } else {
               var23 = Integer.MIN_VALUE;
               var22 = var23;
               if (var24.width == 0) {
                  var22 = var23;
                  if (var24.g > 0.0F) {
                     var22 = 0;
                     var24.width = -2;
                  }
               }

               if (var8 == 0.0F) {
                  var23 = this.f;
               } else {
                  var23 = 0;
               }

               this.a(var21, var20, var1, var23, var2, 0);
               if (var22 != Integer.MIN_VALUE) {
                  var24.width = var22;
               }

               var25 = var21.getMeasuredWidth();
               if (var18) {
                  this.f += var24.leftMargin + var25 + var24.rightMargin + this.b(var21);
               } else {
                  var22 = this.f;
                  this.f = Math.max(var22, var22 + var25 + var24.leftMargin + var24.rightMargin + this.b(var21));
               }

               var22 = var19;
               var41 = var13;
               if (var17) {
                  var22 = Math.max(var25, var19);
                  var41 = var13;
               }
            }

            var13 = false;
            if (var11 != 1073741824 && var24.height == -1) {
               var36 = true;
               var13 = true;
            } else {
               var36 = var12;
            }

            int var33 = var24.topMargin;
            var25 = var24.bottomMargin + var33;
            var33 = var21.getMeasuredHeight() + var25;
            int var26 = gx.a(var4, android.support.v4.view.bz.j(var21));
            int var27;
            if (var16) {
               var27 = var21.getBaseline();
               if (var27 != -1) {
                  if (var24.h < 0) {
                     var4 = this.e;
                  } else {
                     var4 = var24.h;
                  }

                  var4 = ((var4 & 112) >> 4 & -2) >> 1;
                  var14[var4] = Math.max(var14[var4], var27);
                  var15[var4] = Math.max(var15[var4], var33 - var27);
               }
            }

            var27 = Math.max(var3, var33);
            boolean var29;
            if (var7 && var24.height == -1) {
               var29 = true;
            } else {
               var29 = false;
            }

            if (var24.g > 0.0F) {
               if (var13) {
                  var33 = var25;
               }

               var4 = Math.max(var6, var33);
               var31 = var5;
            } else {
               if (var13) {
                  var33 = var25;
               }

               var31 = Math.max(var5, var33);
               var4 = var6;
            }

            var20 += this.a(var21, var20);
            var6 = var4;
            var5 = var31;
            var31 = var22;
            var34 = var26;
            boolean var42 = var36;
            var30 = var41;
            var36 = var29;
            var3 = var27;
            var12 = var42;
         }

         ++var20;
         var7 = var36;
         var4 = var34;
         var19 = var31;
      }

      if (this.f > 0 && this.c(var9)) {
         this.f += this.l;
      }

      if (var14[1] == -1 && var14[0] == -1 && var14[2] == -1 && var14[3] == -1) {
         var20 = var3;
      } else {
         var20 = Math.max(var3, Math.max(var14[3], Math.max(var14[0], Math.max(var14[1], var14[2]))) + Math.max(var15[3], Math.max(var15[0], Math.max(var15[1], var15[2]))));
      }

      if (var17 && (var10 == Integer.MIN_VALUE || var10 == 0)) {
         this.f = 0;

         for(var3 = 0; var3 < var9; ++var3) {
            View var40 = this.b(var3);
            if (var40 == null) {
               this.f += this.d(var3);
            } else if (var40.getVisibility() == 8) {
               var3 += this.a(var40, var3);
            } else {
               cm var38 = (cm)var40.getLayoutParams();
               if (var18) {
                  var23 = this.f;
                  var22 = var38.leftMargin;
                  this.f = var38.rightMargin + var22 + var19 + this.b(var40) + var23;
               } else {
                  var22 = this.f;
                  var23 = var38.leftMargin;
                  this.f = Math.max(var22, var38.rightMargin + var22 + var19 + var23 + this.b(var40));
               }
            }
         }
      }

      this.f += this.getPaddingLeft() + this.getPaddingRight();
      var25 = android.support.v4.view.bz.a(Math.max(this.f, this.getSuggestedMinimumWidth()), var1, 0);
      var3 = (16777215 & var25) - this.f;
      if (!var13 && (var3 == 0 || var8 <= 0.0F)) {
         var34 = Math.max(var5, var6);
         if (var17 && var10 != 1073741824) {
            for(var3 = 0; var3 < var9; ++var3) {
               View var35 = this.b(var3);
               if (var35 != null && var35.getVisibility() != 8 && ((cm)var35.getLayoutParams()).g > 0.0F) {
                  var35.measure(MeasureSpec.makeMeasureSpec(var19, 1073741824), MeasureSpec.makeMeasureSpec(var35.getMeasuredHeight(), 1073741824));
               }
            }
         }

         var3 = var34;
         var19 = var20;
      } else {
         if (this.g > 0.0F) {
            var8 = this.g;
         }

         var14[3] = -1;
         var14[2] = -1;
         var14[1] = -1;
         var14[0] = -1;
         var15[3] = -1;
         var15[2] = -1;
         var15[1] = -1;
         var15[0] = -1;
         this.f = 0;
         byte var39 = 0;
         var6 = var5;
         var34 = var4;
         var19 = var3;
         var3 = -1;
         var5 = var39;

         for(var4 = var6; var5 < var9; var5 = var6) {
            var21 = this.b(var5);
            if (var21 != null) {
               if (var21.getVisibility() == 8) {
                  var6 = var19;
                  var19 = var3;
                  var3 = var4;
                  var30 = var7;
                  var31 = var6;
               } else {
                  var24 = (cm)var21.getLayoutParams();
                  float var28 = var24.g;
                  if (var28 > 0.0F) {
                     var20 = (int)((float)var19 * var28 / var8);
                     var6 = var19 - var20;
                     var22 = getChildMeasureSpec(var2, this.getPaddingTop() + this.getPaddingBottom() + var24.topMargin + var24.bottomMargin, var24.height);
                     if (var24.width == 0 && var10 == 1073741824) {
                        if (var20 > 0) {
                           var19 = var20;
                        } else {
                           var19 = 0;
                        }

                        var21.measure(MeasureSpec.makeMeasureSpec(var19, 1073741824), var22);
                     } else {
                        var20 += var21.getMeasuredWidth();
                        var19 = var20;
                        if (var20 < 0) {
                           var19 = 0;
                        }

                        var21.measure(MeasureSpec.makeMeasureSpec(var19, 1073741824), var22);
                     }

                     var34 = gx.a(var34, android.support.v4.view.bz.j(var21) & -16777216);
                     var8 -= var28;
                     var19 = var6;
                  }

                  if (var18) {
                     this.f += var21.getMeasuredWidth() + var24.leftMargin + var24.rightMargin + this.b(var21);
                  } else {
                     var6 = this.f;
                     this.f = Math.max(var6, var21.getMeasuredWidth() + var6 + var24.leftMargin + var24.rightMargin + this.b(var21));
                  }

                  boolean var32;
                  if (var11 != 1073741824 && var24.height == -1) {
                     var32 = true;
                  } else {
                     var32 = false;
                  }

                  var23 = var24.topMargin + var24.bottomMargin;
                  var22 = var21.getMeasuredHeight() + var23;
                  var20 = Math.max(var3, var22);
                  if (var32) {
                     var3 = var23;
                  } else {
                     var3 = var22;
                  }

                  var3 = Math.max(var4, var3);
                  if (var7 && var24.height == -1) {
                     var7 = true;
                  } else {
                     var7 = false;
                  }

                  if (var16) {
                     var6 = var21.getBaseline();
                     if (var6 != -1) {
                        if (var24.h < 0) {
                           var4 = this.e;
                        } else {
                           var4 = var24.h;
                        }

                        var4 = ((var4 & 112) >> 4 & -2) >> 1;
                        var14[var4] = Math.max(var14[var4], var6);
                        var15[var4] = Math.max(var15[var4], var22 - var6);
                     }
                  }

                  var30 = var7;
                  var31 = var19;
                  var19 = var20;
               }
            } else {
               var6 = var19;
               var19 = var3;
               var3 = var4;
               var30 = var7;
               var31 = var6;
            }

            var6 = var5 + 1;
            var5 = var3;
            var3 = var19;
            var19 = var31;
            var7 = var30;
            var4 = var5;
         }

         label225: {
            this.f += this.getPaddingLeft() + this.getPaddingRight();
            if (var14[1] == -1 && var14[0] == -1 && var14[2] == -1) {
               var19 = var3;
               if (var14[3] == -1) {
                  break label225;
               }
            }

            var19 = Math.max(var3, Math.max(var14[3], Math.max(var14[0], Math.max(var14[1], var14[2]))) + Math.max(var15[3], Math.max(var15[0], Math.max(var15[1], var15[2]))));
         }

         var3 = var4;
         var4 = var34;
      }

      if (var7 || var11 == 1073741824) {
         var3 = var19;
      }

      this.setMeasuredDimension(-16777216 & var4 | var25, android.support.v4.view.bz.a(Math.max(var3 + this.getPaddingTop() + this.getPaddingBottom(), this.getSuggestedMinimumHeight()), var2, var4 << 16));
      if (var12) {
         this.d(var9, var1);
      }

   }

   void b(int var1, int var2, int var3, int var4) {
      boolean var5 = gx.a(this);
      int var6 = this.getPaddingTop();
      int var7 = var4 - var2;
      int var8 = this.getPaddingBottom();
      int var9 = this.getPaddingBottom();
      int var10 = this.getVirtualChildCount();
      var2 = this.e;
      int var11 = this.e;
      boolean var12 = this.a;
      int[] var13 = this.i;
      int[] var14 = this.j;
      switch(android.support.v4.view.y.a(var2 & 8388615, android.support.v4.view.bz.g(this))) {
      case 1:
         var1 = this.getPaddingLeft() + (var3 - var1 - this.f) / 2;
         break;
      case 5:
         var1 = this.getPaddingLeft() + var3 - var1 - this.f;
         break;
      default:
         var1 = this.getPaddingLeft();
      }

      byte var15;
      if (var5) {
         var15 = -1;
         var4 = var10 - 1;
      } else {
         var15 = 1;
         var4 = 0;
      }

      var2 = 0;

      for(var3 = var1; var2 < var10; var2 = var1 + 1) {
         int var16 = var4 + var15 * var2;
         View var17 = this.b(var16);
         if (var17 == null) {
            var3 += this.d(var16);
            var1 = var2;
         } else if (var17.getVisibility() == 8) {
            var1 = var2;
         } else {
            int var18 = var17.getMeasuredWidth();
            int var19 = var17.getMeasuredHeight();
            cm var20 = (cm)var17.getLayoutParams();
            int var21;
            if (var12 && var20.height != -1) {
               var21 = var17.getBaseline();
            } else {
               var21 = -1;
            }

            int var22 = var20.h;
            var1 = var22;
            if (var22 < 0) {
               var1 = var11 & 112;
            }

            switch(var1 & 112) {
            case 16:
               var1 = (var7 - var6 - var9 - var19) / 2 + var6 + var20.topMargin - var20.bottomMargin;
               break;
            case 48:
               var22 = var6 + var20.topMargin;
               var1 = var22;
               if (var21 != -1) {
                  var1 = var22 + (var13[1] - var21);
               }
               break;
            case 80:
               var22 = var7 - var8 - var19 - var20.bottomMargin;
               var1 = var22;
               if (var21 != -1) {
                  var1 = var17.getMeasuredHeight();
                  var1 = var22 - (var14[2] - (var1 - var21));
               }
               break;
            default:
               var1 = var6;
            }

            if (this.c(var16)) {
               var3 += this.l;
            }

            var3 += var20.leftMargin;
            this.a(var17, var3 + this.a(var17), var1, var18, var19);
            var3 += var20.rightMargin + var18 + this.b(var17);
            var1 = this.a(var17, var16) + var2;
         }
      }

   }

   void b(Canvas var1) {
      int var2 = this.getVirtualChildCount();
      boolean var3 = gx.a(this);

      int var4;
      View var5;
      cm var6;
      for(var4 = 0; var4 < var2; ++var4) {
         var5 = this.b(var4);
         if (var5 != null && var5.getVisibility() != 8 && this.c(var4)) {
            var6 = (cm)var5.getLayoutParams();
            int var7;
            if (var3) {
               var7 = var5.getRight();
               var7 += var6.rightMargin;
            } else {
               var7 = var5.getLeft() - var6.leftMargin - this.l;
            }

            this.b(var1, var7);
         }
      }

      if (this.c(var2)) {
         var5 = this.b(var2 - 1);
         if (var5 == null) {
            if (var3) {
               var4 = this.getPaddingLeft();
            } else {
               var4 = this.getWidth() - this.getPaddingRight() - this.l;
            }
         } else {
            var6 = (cm)var5.getLayoutParams();
            if (var3) {
               var4 = var5.getLeft() - var6.leftMargin - this.l;
            } else {
               var4 = var5.getRight();
               var4 += var6.rightMargin;
            }
         }

         this.b(var1, var4);
      }

   }

   void b(Canvas var1, int var2) {
      this.k.setBounds(var2, this.getPaddingTop() + this.o, this.l + var2, this.getHeight() - this.getPaddingBottom() - this.o);
      this.k.draw(var1);
   }

   protected boolean c(int var1) {
      boolean var2 = true;
      boolean var3;
      if (var1 == 0) {
         if ((this.n & 1) != 0) {
            var3 = var2;
         } else {
            var3 = false;
         }
      } else if (var1 == this.getChildCount()) {
         var3 = var2;
         if ((this.n & 4) == 0) {
            var3 = false;
         }
      } else if ((this.n & 2) != 0) {
         --var1;

         while(true) {
            if (var1 < 0) {
               var3 = false;
               break;
            }

            var3 = var2;
            if (this.getChildAt(var1).getVisibility() != 8) {
               break;
            }

            --var1;
         }
      } else {
         var3 = false;
      }

      return var3;
   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof cm;
   }

   int d(int var1) {
      return 0;
   }

   protected cm g() {
      cm var1;
      if (this.d == 0) {
         var1 = new cm(-2, -2);
      } else if (this.d == 1) {
         var1 = new cm(-1, -2);
      } else {
         var1 = null;
      }

      return var1;
   }

   // $FF: synthetic method
   protected LayoutParams generateDefaultLayoutParams() {
      return this.g();
   }

   // $FF: synthetic method
   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return this.b(var1);
   }

   // $FF: synthetic method
   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return this.b(var1);
   }

   public int getBaseline() {
      int var1 = -1;
      if (this.b < 0) {
         var1 = super.getBaseline();
      } else {
         if (this.getChildCount() <= this.b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
         }

         View var2 = this.getChildAt(this.b);
         int var3 = var2.getBaseline();
         if (var3 == -1) {
            if (this.b != 0) {
               throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
         } else {
            var1 = this.c;
            if (this.d == 1) {
               int var4 = this.e & 112;
               if (var4 != 48) {
                  switch(var4) {
                  case 16:
                     var1 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.f) / 2;
                     break;
                  case 80:
                     var1 = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.f;
                  }
               }
            }

            var1 = ((cm)var2.getLayoutParams()).topMargin + var1 + var3;
         }
      }

      return var1;
   }

   public int getBaselineAlignedChildIndex() {
      return this.b;
   }

   public Drawable getDividerDrawable() {
      return this.k;
   }

   public int getDividerPadding() {
      return this.o;
   }

   public int getDividerWidth() {
      return this.l;
   }

   public int getGravity() {
      return this.e;
   }

   public int getOrientation() {
      return this.d;
   }

   public int getShowDividers() {
      return this.n;
   }

   int getVirtualChildCount() {
      return this.getChildCount();
   }

   public float getWeightSum() {
      return this.g;
   }

   protected void onDraw(Canvas var1) {
      if (this.k != null) {
         if (this.d == 1) {
            this.a(var1);
         } else {
            this.b(var1);
         }
      }

   }

   public void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      if (VERSION.SDK_INT >= 14) {
         super.onInitializeAccessibilityEvent(var1);
         var1.setClassName(cl.class.getName());
      }

   }

   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      if (VERSION.SDK_INT >= 14) {
         super.onInitializeAccessibilityNodeInfo(var1);
         var1.setClassName(cl.class.getName());
      }

   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if (this.d == 1) {
         this.a(var2, var3, var4, var5);
      } else {
         this.b(var2, var3, var4, var5);
      }

   }

   protected void onMeasure(int var1, int var2) {
      if (this.d == 1) {
         this.a(var1, var2);
      } else {
         this.b(var1, var2);
      }

   }

   public void setBaselineAligned(boolean var1) {
      this.a = var1;
   }

   public void setBaselineAlignedChildIndex(int var1) {
      if (var1 >= 0 && var1 < this.getChildCount()) {
         this.b = var1;
      } else {
         throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
      }
   }

   public void setDividerDrawable(Drawable var1) {
      boolean var2 = false;
      if (var1 != this.k) {
         this.k = var1;
         if (var1 != null) {
            this.l = var1.getIntrinsicWidth();
            this.m = var1.getIntrinsicHeight();
         } else {
            this.l = 0;
            this.m = 0;
         }

         if (var1 == null) {
            var2 = true;
         }

         this.setWillNotDraw(var2);
         this.requestLayout();
      }

   }

   public void setDividerPadding(int var1) {
      this.o = var1;
   }

   public void setGravity(int var1) {
      if (this.e != var1) {
         if ((8388615 & var1) == 0) {
            var1 |= 8388611;
         }

         int var2 = var1;
         if ((var1 & 112) == 0) {
            var2 = var1 | 48;
         }

         this.e = var2;
         this.requestLayout();
      }

   }

   public void setHorizontalGravity(int var1) {
      var1 &= 8388615;
      if ((this.e & 8388615) != var1) {
         this.e = var1 | this.e & -8388616;
         this.requestLayout();
      }

   }

   public void setMeasureWithLargestChildEnabled(boolean var1) {
      this.h = var1;
   }

   public void setOrientation(int var1) {
      if (this.d != var1) {
         this.d = var1;
         this.requestLayout();
      }

   }

   public void setShowDividers(int var1) {
      if (var1 != this.n) {
         this.requestLayout();
      }

      this.n = var1;
   }

   public void setVerticalGravity(int var1) {
      var1 &= 112;
      if ((this.e & 112) != var1) {
         this.e = var1 | this.e & -113;
         this.requestLayout();
      }

   }

   public void setWeightSum(float var1) {
      this.g = Math.max(0.0F, var1);
   }

   public boolean shouldDelayChildPressedState() {
      return false;
   }
}
