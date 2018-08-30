package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.bz;
import android.support.v7.widget.bc;
import android.support.v7.widget.by;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class ActionMenuItemView extends bc implements ae, android.support.v7.widget.r, OnClickListener, OnLongClickListener {
   p a;
   o b;
   c c;
   private CharSequence d;
   private Drawable e;
   private by f;
   private boolean g;
   private boolean h;
   private int i;
   private int j;
   private int k;

   public ActionMenuItemView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionMenuItemView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ActionMenuItemView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      Resources var4 = var1.getResources();
      this.g = this.e();
      TypedArray var5 = var1.obtainStyledAttributes(var2, android.support.v7.a.k.ActionMenuItemView, var3, 0);
      this.i = var5.getDimensionPixelSize(android.support.v7.a.k.ActionMenuItemView_android_minWidth, 0);
      var5.recycle();
      this.k = (int)(var4.getDisplayMetrics().density * 32.0F + 0.5F);
      this.setOnClickListener(this);
      this.setOnLongClickListener(this);
      this.j = -1;
      this.setSaveEnabled(false);
   }

   private boolean e() {
      Configuration var1 = this.getContext().getResources().getConfiguration();
      int var2 = android.support.v4.c.a.a.b(this.getResources());
      int var3 = android.support.v4.c.a.a.a(this.getResources());
      boolean var4;
      if (var2 < 480 && (var2 < 640 || var3 < 480) && var1.orientation != 2) {
         var4 = false;
      } else {
         var4 = true;
      }

      return var4;
   }

   private void f() {
      boolean var1 = false;
      boolean var2;
      if (!TextUtils.isEmpty(this.d)) {
         var2 = true;
      } else {
         var2 = false;
      }

      boolean var3;
      label25: {
         if (this.e != null) {
            var3 = var1;
            if (!this.a.m()) {
               break label25;
            }

            if (!this.g) {
               var3 = var1;
               if (!this.h) {
                  break label25;
               }
            }
         }

         var3 = true;
      }

      CharSequence var4;
      if (var2 & var3) {
         var4 = this.d;
      } else {
         var4 = null;
      }

      this.setText(var4);
   }

   public void a(p var1, int var2) {
      this.a = var1;
      this.setIcon(var1.getIcon());
      this.setTitle(var1.a((ae)this));
      this.setId(var1.getItemId());
      byte var3;
      if (var1.isVisible()) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      this.setVisibility(var3);
      this.setEnabled(var1.isEnabled());
      if (var1.hasSubMenu() && this.f == null) {
         this.f = new b(this);
      }

   }

   public boolean a() {
      return true;
   }

   public boolean b() {
      boolean var1;
      if (!TextUtils.isEmpty(this.getText())) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean c() {
      boolean var1;
      if (this.b() && this.a.getIcon() == null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean d() {
      return this.b();
   }

   public p getItemData() {
      return this.a;
   }

   public void onClick(View var1) {
      if (this.b != null) {
         this.b.a(this.a);
      }

   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.g = this.e();
      this.f();
   }

   public boolean onLongClick(View var1) {
      boolean var2;
      if (this.b()) {
         var2 = false;
      } else {
         int[] var3 = new int[2];
         Rect var4 = new Rect();
         this.getLocationOnScreen(var3);
         this.getWindowVisibleDisplayFrame(var4);
         Context var5 = this.getContext();
         int var6 = this.getWidth();
         int var7 = this.getHeight();
         int var8 = var3[1];
         int var9 = var7 / 2;
         int var10 = var3[0];
         var6 = var6 / 2 + var10;
         var10 = var6;
         if (bz.g(var1) == 0) {
            var10 = var5.getResources().getDisplayMetrics().widthPixels - var6;
         }

         Toast var11 = Toast.makeText(var5, this.a.getTitle(), 0);
         if (var8 + var9 < var4.height()) {
            var11.setGravity(8388661, var10, var3[1] + var7 - var4.top);
         } else {
            var11.setGravity(81, 0, var7);
         }

         var11.show();
         var2 = true;
      }

      return var2;
   }

   protected void onMeasure(int var1, int var2) {
      boolean var3 = this.b();
      if (var3 && this.j >= 0) {
         super.setPadding(this.j, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
      }

      super.onMeasure(var1, var2);
      int var4 = MeasureSpec.getMode(var1);
      var1 = MeasureSpec.getSize(var1);
      int var5 = this.getMeasuredWidth();
      if (var4 == Integer.MIN_VALUE) {
         var1 = Math.min(var1, this.i);
      } else {
         var1 = this.i;
      }

      if (var4 != 1073741824 && this.i > 0 && var5 < var1) {
         super.onMeasure(MeasureSpec.makeMeasureSpec(var1, 1073741824), var2);
      }

      if (!var3 && this.e != null) {
         super.setPadding((this.getMeasuredWidth() - this.e.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
      }

   }

   public void onRestoreInstanceState(Parcelable var1) {
      super.onRestoreInstanceState((Parcelable)null);
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.a.hasSubMenu() && this.f != null && this.f.onTouch(this, var1)) {
         var2 = true;
      } else {
         var2 = super.onTouchEvent(var1);
      }

      return var2;
   }

   public void setCheckable(boolean var1) {
   }

   public void setChecked(boolean var1) {
   }

   public void setExpandedFormat(boolean var1) {
      if (this.h != var1) {
         this.h = var1;
         if (this.a != null) {
            this.a.h();
         }
      }

   }

   public void setIcon(Drawable var1) {
      this.e = var1;
      if (var1 != null) {
         int var2 = var1.getIntrinsicWidth();
         int var3 = var1.getIntrinsicHeight();
         int var4 = var3;
         int var5 = var2;
         float var6;
         if (var2 > this.k) {
            var6 = (float)this.k / (float)var2;
            var5 = this.k;
            var4 = (int)((float)var3 * var6);
         }

         var2 = var4;
         var3 = var5;
         if (var4 > this.k) {
            var6 = (float)this.k / (float)var4;
            var2 = this.k;
            var3 = (int)((float)var5 * var6);
         }

         var1.setBounds(0, 0, var3, var2);
      }

      this.setCompoundDrawables(var1, (Drawable)null, (Drawable)null, (Drawable)null);
      this.f();
   }

   public void setItemInvoker(o var1) {
      this.b = var1;
   }

   public void setPadding(int var1, int var2, int var3, int var4) {
      this.j = var1;
      super.setPadding(var1, var2, var3, var4);
   }

   public void setPopupCallback(c var1) {
      this.c = var1;
   }

   public void setTitle(CharSequence var1) {
      this.d = var1;
      this.setContentDescription(this.d);
      this.f();
   }
}
