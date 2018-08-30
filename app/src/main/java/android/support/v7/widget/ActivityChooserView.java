package android.support.v7.widget;

import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

public class ActivityChooserView extends ViewGroup {
   final ac a;
   final FrameLayout b;
   final FrameLayout c;
   android.support.v4.view.q d;
   final DataSetObserver e;
   OnDismissListener f;
   boolean g;
   int h;
   private final ad i;
   private final cl j;
   private final ImageView k;
   private final int l;
   private final OnGlobalLayoutListener m;
   private ct n;
   private boolean o;
   private int p;

   void a(int var1) {
      if (this.a.d() == null) {
         throw new IllegalStateException("No data model. Did you call #setDataModel?");
      } else {
         this.getViewTreeObserver().addOnGlobalLayoutListener(this.m);
         boolean var2;
         if (this.c.getVisibility() == 0) {
            var2 = true;
         } else {
            var2 = false;
         }

         int var3 = this.a.c();
         byte var4;
         if (var2) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         if (var1 != Integer.MAX_VALUE && var3 > var4 + var1) {
            this.a.a(true);
            this.a.a(var1 - 1);
         } else {
            this.a.a(false);
            this.a.a(var1);
         }

         ct var5 = this.getListPopupWindow();
         if (!var5.d()) {
            if (!this.g && var2) {
               this.a.a(false, false);
            } else {
               this.a.a(true, var2);
            }

            var5.g(Math.min(this.a.a(), this.l));
            var5.a();
            if (this.d != null) {
               this.d.a(true);
            }

            var5.e().setContentDescription(this.getContext().getString(android.support.v7.a.i.abc_activitychooserview_choose_application));
         }

      }
   }

   public boolean a() {
      boolean var1 = false;
      boolean var2 = var1;
      if (!this.c()) {
         if (!this.o) {
            var2 = var1;
         } else {
            this.g = false;
            this.a(this.h);
            var2 = true;
         }
      }

      return var2;
   }

   public boolean b() {
      if (this.c()) {
         this.getListPopupWindow().c();
         ViewTreeObserver var1 = this.getViewTreeObserver();
         if (var1.isAlive()) {
            var1.removeGlobalOnLayoutListener(this.m);
         }
      }

      return true;
   }

   public boolean c() {
      return this.getListPopupWindow().d();
   }

   public w getDataModel() {
      return this.a.d();
   }

   ct getListPopupWindow() {
      if (this.n == null) {
         this.n = new ct(this.getContext());
         this.n.a((ListAdapter)this.a);
         this.n.b(this);
         this.n.a(true);
         this.n.a((OnItemClickListener)this.i);
         this.n.a((OnDismissListener)this.i);
      }

      return this.n;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      w var1 = this.a.d();
      if (var1 != null) {
         var1.registerObserver(this.e);
      }

      this.o = true;
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      w var1 = this.a.d();
      if (var1 != null) {
         var1.unregisterObserver(this.e);
      }

      ViewTreeObserver var2 = this.getViewTreeObserver();
      if (var2.isAlive()) {
         var2.removeGlobalOnLayoutListener(this.m);
      }

      if (this.c()) {
         this.b();
      }

      this.o = false;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      this.j.layout(0, 0, var4 - var2, var5 - var3);
      if (!this.c()) {
         this.b();
      }

   }

   protected void onMeasure(int var1, int var2) {
      cl var3 = this.j;
      int var4 = var2;
      if (this.c.getVisibility() != 0) {
         var4 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(var2), 1073741824);
      }

      this.measureChild(var3, var1, var4);
      this.setMeasuredDimension(var3.getMeasuredWidth(), var3.getMeasuredHeight());
   }

   public void setActivityChooserModel(w var1) {
      this.a.a(var1);
      if (this.c()) {
         this.b();
         this.a();
      }

   }

   public void setDefaultActionButtonContentDescription(int var1) {
      this.p = var1;
   }

   public void setExpandActivityOverflowButtonContentDescription(int var1) {
      String var2 = this.getContext().getString(var1);
      this.k.setContentDescription(var2);
   }

   public void setExpandActivityOverflowButtonDrawable(Drawable var1) {
      this.k.setImageDrawable(var1);
   }

   public void setInitialActivityCount(int var1) {
      this.h = var1;
   }

   public void setOnDismissListener(OnDismissListener var1) {
      this.f = var1;
   }

   public void setProvider(android.support.v4.view.q var1) {
      this.d = var1;
   }
}
