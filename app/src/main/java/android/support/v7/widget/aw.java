package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

class aw extends ct {
   ListAdapter a;
   // $FF: synthetic field
   final at b;
   private CharSequence h;
   private final Rect i;

   public aw(at var1, Context var2, AttributeSet var3, int var4) {
      super(var2, var3, var4);
      this.b = var1;
      this.i = new Rect();
      this.b(var1);
      this.a(true);
      this.a(0);
      this.a((OnItemClickListener)(new ax(this, var1)));
   }

   // $FF: synthetic method
   static void a(aw var0) {
      var0.a();
   }

   public void a() {
      boolean var1 = this.d();
      this.f();
      this.h(2);
      super.a();
      this.e().setChoiceMode(1);
      this.i(this.b.getSelectedItemPosition());
      if (!var1) {
         ViewTreeObserver var2 = this.b.getViewTreeObserver();
         if (var2 != null) {
            ay var3 = new ay(this);
            var2.addOnGlobalLayoutListener(var3);
            this.a((OnDismissListener)(new az(this, var3)));
         }
      }

   }

   public void a(ListAdapter var1) {
      super.a(var1);
      this.a = var1;
   }

   public void a(CharSequence var1) {
      this.h = var1;
   }

   boolean a(View var1) {
      boolean var2;
      if (android.support.v4.view.bz.y(var1) && var1.getGlobalVisibleRect(this.i)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public CharSequence b() {
      return this.h;
   }

   void f() {
      Drawable var1 = this.h();
      int var2;
      if (var1 != null) {
         var1.getPadding(this.b.c);
         if (gx.a(this.b)) {
            var2 = this.b.c.right;
         } else {
            var2 = -this.b.c.left;
         }
      } else {
         Rect var8 = this.b.c;
         this.b.c.right = 0;
         var8.left = 0;
         var2 = 0;
      }

      int var3 = this.b.getPaddingLeft();
      int var4 = this.b.getPaddingRight();
      int var5 = this.b.getWidth();
      if (this.b.b == -2) {
         int var6 = this.b.a((SpinnerAdapter)this.a, this.h());
         int var7 = this.b.getContext().getResources().getDisplayMetrics().widthPixels - this.b.c.left - this.b.c.right;
         if (var6 > var7) {
            var6 = var7;
         }

         this.g(Math.max(var6, var5 - var3 - var4));
      } else if (this.b.b == -1) {
         this.g(var5 - var3 - var4);
      } else {
         this.g(this.b.b);
      }

      if (gx.a(this.b)) {
         var2 += var5 - var4 - this.l();
      } else {
         var2 += var3;
      }

      this.c(var2);
   }
}
