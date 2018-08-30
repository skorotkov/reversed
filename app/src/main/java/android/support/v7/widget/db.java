package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class db extends ListView {
   private static final int[] g = new int[]{0};
   final Rect a = new Rect();
   int b = 0;
   int c = 0;
   int d = 0;
   int e = 0;
   protected int f;
   private Field h;
   private dc i;

   public db(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);

      try {
         this.h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
         this.h.setAccessible(true);
      } catch (NoSuchFieldException var4) {
         var4.printStackTrace();
      }

   }

   public int a(int var1, int var2, int var3, int var4, int var5) {
      var3 = this.getListPaddingTop();
      var2 = this.getListPaddingBottom();
      this.getListPaddingLeft();
      this.getListPaddingRight();
      int var6 = this.getDividerHeight();
      Drawable var7 = this.getDivider();
      ListAdapter var8 = this.getAdapter();
      if (var8 == null) {
         var1 = var3 + var2;
      } else {
         var2 += var3;
         if (var6 <= 0 || var7 == null) {
            var6 = 0;
         }

         var3 = 0;
         View var15 = null;
         int var9 = 0;
         int var10 = var8.getCount();

         View var13;
         for(int var11 = 0; var11 < var10; var15 = var13) {
            int var12 = var8.getItemViewType(var11);
            if (var12 != var9) {
               var15 = null;
               var9 = var12;
            }

            var13 = var8.getView(var11, var15, this);
            LayoutParams var14 = var13.getLayoutParams();
            LayoutParams var16 = var14;
            if (var14 == null) {
               var16 = this.generateDefaultLayoutParams();
               var13.setLayoutParams(var16);
            }

            if (var16.height > 0) {
               var12 = MeasureSpec.makeMeasureSpec(var16.height, 1073741824);
            } else {
               var12 = MeasureSpec.makeMeasureSpec(0, 0);
            }

            var13.measure(var1, var12);
            var13.forceLayout();
            if (var11 > 0) {
               var2 += var6;
            }

            var2 += var13.getMeasuredHeight();
            if (var2 >= var4) {
               var1 = var4;
               if (var5 >= 0) {
                  var1 = var4;
                  if (var11 > var5) {
                     var1 = var4;
                     if (var3 > 0) {
                        var1 = var4;
                        if (var2 != var4) {
                           var1 = var3;
                           return var1;
                        }
                     }

                     return var1;
                  }
               }

               return var1;
            }

            var12 = var3;
            if (var5 >= 0) {
               var12 = var3;
               if (var11 >= var5) {
                  var12 = var2;
               }
            }

            ++var11;
            var3 = var12;
         }

         var1 = var2;
      }

      return var1;
   }

   protected void a(int var1, View var2) {
      boolean var3 = true;
      Drawable var4 = this.getSelector();
      boolean var5;
      if (var4 != null && var1 != -1) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5) {
         var4.setVisible(false, false);
      }

      this.b(var1, var2);
      if (var5) {
         Rect var8 = this.a;
         float var6 = var8.exactCenterX();
         float var7 = var8.exactCenterY();
         if (this.getVisibility() != 0) {
            var3 = false;
         }

         var4.setVisible(var3, false);
         android.support.v4.d.a.a.a(var4, var6, var7);
      }

   }

   protected void a(int var1, View var2, float var3, float var4) {
      this.a(var1, var2);
      Drawable var5 = this.getSelector();
      if (var5 != null && var1 != -1) {
         android.support.v4.d.a.a.a(var5, var3, var4);
      }

   }

   protected void a(Canvas var1) {
      if (!this.a.isEmpty()) {
         Drawable var2 = this.getSelector();
         if (var2 != null) {
            var2.setBounds(this.a);
            var2.draw(var1);
         }
      }

   }

   protected boolean a() {
      return false;
   }

   protected void b() {
      Drawable var1 = this.getSelector();
      if (var1 != null && this.c()) {
         var1.setState(this.getDrawableState());
      }

   }

   protected void b(int param1, View param2) {
      // $FF: Couldn't be decompiled
   }

   protected boolean c() {
      boolean var1;
      if (this.a() && this.isPressed()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected void dispatchDraw(Canvas var1) {
      this.a(var1);
      super.dispatchDraw(var1);
   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      this.setSelectorEnabled(true);
      this.b();
   }

   public boolean onTouchEvent(MotionEvent var1) {
      switch(var1.getAction()) {
      case 0:
         this.f = this.pointToPosition((int)var1.getX(), (int)var1.getY());
      default:
         return super.onTouchEvent(var1);
      }
   }

   public void setSelector(Drawable var1) {
      dc var2;
      if (var1 != null) {
         var2 = new dc(var1);
      } else {
         var2 = null;
      }

      this.i = var2;
      super.setSelector(this.i);
      Rect var3 = new Rect();
      if (var1 != null) {
         var1.getPadding(var3);
      }

      this.b = var3.left;
      this.c = var3.top;
      this.d = var3.right;
      this.e = var3.bottom;
   }

   protected void setSelectorEnabled(boolean var1) {
      if (this.i != null) {
         this.i.a(var1);
      }

   }
}
