package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
   private int a;
   private int b;
   private WeakReference c;
   private LayoutInflater d;
   private gw e;

   public ViewStubCompat(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ViewStubCompat(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a = 0;
      TypedArray var4 = var1.obtainStyledAttributes(var2, android.support.v7.a.k.ViewStubCompat, var3, 0);
      this.b = var4.getResourceId(android.support.v7.a.k.ViewStubCompat_android_inflatedId, -1);
      this.a = var4.getResourceId(android.support.v7.a.k.ViewStubCompat_android_layout, 0);
      this.setId(var4.getResourceId(android.support.v7.a.k.ViewStubCompat_android_id, -1));
      var4.recycle();
      this.setVisibility(8);
      this.setWillNotDraw(true);
   }

   public View a() {
      ViewParent var1 = this.getParent();
      if (var1 != null && var1 instanceof ViewGroup) {
         if (this.a != 0) {
            ViewGroup var2 = (ViewGroup)var1;
            LayoutInflater var5;
            if (this.d != null) {
               var5 = this.d;
            } else {
               var5 = LayoutInflater.from(this.getContext());
            }

            View var3 = var5.inflate(this.a, var2, false);
            if (this.b != -1) {
               var3.setId(this.b);
            }

            int var4 = var2.indexOfChild(this);
            var2.removeViewInLayout(this);
            LayoutParams var6 = this.getLayoutParams();
            if (var6 != null) {
               var2.addView(var3, var4, var6);
            } else {
               var2.addView(var3, var4);
            }

            this.c = new WeakReference(var3);
            if (this.e != null) {
               this.e.a(this, var3);
            }

            return var3;
         } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
         }
      } else {
         throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
      }
   }

   protected void dispatchDraw(Canvas var1) {
   }

   public void draw(Canvas var1) {
   }

   public int getInflatedId() {
      return this.b;
   }

   public LayoutInflater getLayoutInflater() {
      return this.d;
   }

   public int getLayoutResource() {
      return this.a;
   }

   protected void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(0, 0);
   }

   public void setInflatedId(int var1) {
      this.b = var1;
   }

   public void setLayoutInflater(LayoutInflater var1) {
      this.d = var1;
   }

   public void setLayoutResource(int var1) {
      this.a = var1;
   }

   public void setOnInflateListener(gw var1) {
      this.e = var1;
   }

   public void setVisibility(int var1) {
      if (this.c != null) {
         View var2 = (View)this.c.get();
         if (var2 == null) {
            throw new IllegalStateException("setVisibility called on un-referenced view");
         }

         var2.setVisibility(var1);
      } else {
         super.setVisibility(var1);
         if (var1 == 0 || var1 == 4) {
            this.a();
         }
      }

   }
}
