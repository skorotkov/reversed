package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

class bv extends db {
   private boolean g;
   private boolean h;
   private boolean i;
   private android.support.v4.view.dy j;
   private android.support.v4.widget.p k;

   public bv(Context var1, boolean var2) {
      super(var1, (AttributeSet)null, android.support.v7.a.b.dropDownListViewStyle);
      this.h = var2;
      this.setCacheColorHint(0);
   }

   private void a(View var1, int var2) {
      this.performItemClick(var1, var2, this.getItemIdAtPosition(var2));
   }

   private void a(View var1, int var2, float var3, float var4) {
      this.i = true;
      if (VERSION.SDK_INT >= 21) {
         this.drawableHotspotChanged(var3, var4);
      }

      if (!this.isPressed()) {
         this.setPressed(true);
      }

      this.layoutChildren();
      if (this.f != -1) {
         View var5 = this.getChildAt(this.f - this.getFirstVisiblePosition());
         if (var5 != null && var5 != var1 && var5.isPressed()) {
            var5.setPressed(false);
         }
      }

      this.f = var2;
      float var6 = (float)var1.getLeft();
      float var7 = (float)var1.getTop();
      if (VERSION.SDK_INT >= 21) {
         var1.drawableHotspotChanged(var3 - var6, var4 - var7);
      }

      if (!var1.isPressed()) {
         var1.setPressed(true);
      }

      this.a(var2, var1, var3, var4);
      this.setSelectorEnabled(false);
      this.refreshDrawableState();
   }

   private void d() {
      this.i = false;
      this.setPressed(false);
      this.drawableStateChanged();
      View var1 = this.getChildAt(this.f - this.getFirstVisiblePosition());
      if (var1 != null) {
         var1.setPressed(false);
      }

      if (this.j != null) {
         this.j.a();
         this.j = null;
      }

   }

   protected boolean a() {
      boolean var1;
      if (!this.i && !super.a()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public boolean a(MotionEvent var1, int var2) {
      boolean var4;
      boolean var8;
      label46: {
         label49: {
            int var3 = android.support.v4.view.bg.a(var1);
            switch(var3) {
            case 1:
               var4 = false;
               break;
            case 2:
               var4 = true;
               break;
            case 3:
               var8 = false;
               var4 = false;
               break label46;
            default:
               break label49;
            }

            int var5 = var1.findPointerIndex(var2);
            if (var5 < 0) {
               var8 = false;
               var4 = false;
               break label46;
            }

            var2 = (int)var1.getX(var5);
            var5 = (int)var1.getY(var5);
            int var6 = this.pointToPosition(var2, var5);
            if (var6 == -1) {
               var8 = true;
               break label46;
            }

            View var7 = this.getChildAt(var6 - this.getFirstVisiblePosition());
            this.a(var7, var6, (float)var2, (float)var5);
            if (var3 == 1) {
               this.a(var7, var6);
            }
         }

         var8 = false;
         var4 = true;
      }

      if (!var4 || var8) {
         this.d();
      }

      if (var4) {
         if (this.k == null) {
            this.k = new android.support.v4.widget.p(this);
         }

         this.k.a(true);
         this.k.onTouch(this, var1);
      } else if (this.k != null) {
         this.k.a(false);
      }

      return var4;
   }

   public boolean hasFocus() {
      boolean var1;
      if (!this.h && !super.hasFocus()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public boolean hasWindowFocus() {
      boolean var1;
      if (!this.h && !super.hasWindowFocus()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public boolean isFocused() {
      boolean var1;
      if (!this.h && !super.isFocused()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public boolean isInTouchMode() {
      boolean var1;
      if ((!this.h || !this.g) && !super.isInTouchMode()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   void setListSelectionHidden(boolean var1) {
      this.g = var1;
   }
}
