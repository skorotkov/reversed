package android.support.wearable.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.dl;
import android.support.v7.widget.ec;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

@TargetApi(23)
public class WearableRecyclerView extends dl {
   private static final String H = WearableRecyclerView.class.getSimpleName();
   private final ar I;
   private bl J;
   private boolean K;
   private boolean L;
   private boolean M;
   private int N;
   private int O;
   private final OnPreDrawListener P;

   public WearableRecyclerView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public WearableRecyclerView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public WearableRecyclerView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.I = new ar();
      this.N = Integer.MIN_VALUE;
      this.O = Integer.MIN_VALUE;
      this.P = new bk(this);
      this.setHasFixedSize(true);
      this.setClipToPadding(false);
      if (var2 != null) {
         TypedArray var4 = var1.obtainStyledAttributes(var2, android.support.wearable.h.RecyclerView, var3, 0);
         this.setCircularScrollingGestureEnabled(var4.getBoolean(android.support.wearable.h.WearableRecyclerView_circular_scrolling_gesture_enabled, this.K));
         this.setBezelWidth(var4.getFloat(android.support.wearable.h.WearableRecyclerView_bezel_width, this.I.c()));
         this.setScrollDegreesPerScreen(var4.getFloat(android.support.wearable.h.WearableRecyclerView_scroll_degrees_per_screen, this.I.b()));
         var4.recycle();
      }

      this.setLayoutManager(new bm(this, this.getContext()));
   }

   private void A() {
      int var1 = 0;
      if (this.L && this.getChildCount() >= 1) {
         int var2 = this.getChildAt(0).getHeight();
         var2 = (int)((float)this.getHeight() * 0.5F - (float)var2 * 0.5F);
         if (this.getPaddingTop() != var2) {
            this.N = this.getPaddingTop();
            this.O = this.getPaddingBottom();
            this.setPadding(this.getPaddingLeft(), var2, this.getPaddingRight(), var2);
            View var3 = this.getFocusedChild();
            if (var3 != null) {
               var1 = this.getLayoutManager().d(var3);
            }

            this.getLayoutManager().e(var1);
         }
      } else {
         Log.w(H, "No children available");
      }

   }

   private void B() {
      if (this.N != Integer.MIN_VALUE) {
         this.setPadding(this.getPaddingLeft(), this.N, this.getPaddingRight(), this.O);
      }

   }

   // $FF: synthetic method
   static boolean a(WearableRecyclerView var0) {
      return var0.M;
   }

   // $FF: synthetic method
   static boolean a(WearableRecyclerView var0, boolean var1) {
      var0.M = var1;
      return var1;
   }

   // $FF: synthetic method
   static void b(WearableRecyclerView var0) {
      var0.A();
   }

   // $FF: synthetic method
   static bl c(WearableRecyclerView var0) {
      return var0.J;
   }

   public float getBezelWidth() {
      return this.I.c();
   }

   public boolean getCenterEdgeItems() {
      return this.L;
   }

   @Deprecated
   public bl getOffsettingHelper() {
      return this.J;
   }

   public float getScrollDegreesPerScreen() {
      return this.I.b();
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.I.a((dl)this);
      this.getViewTreeObserver().addOnPreDrawListener(this.P);
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.I.a();
      this.getViewTreeObserver().removeOnPreDrawListener(this.P);
   }

   public boolean onGenericMotionEvent(MotionEvent var1) {
      boolean var2 = false;
      ec var3 = this.getLayoutManager();
      if (var3 != null && !this.e()) {
         if (var1.getAction() == 8 && android.support.wearable.a.a.a(var1)) {
            int var4 = Math.round(-android.support.wearable.a.a.b(var1) * android.support.wearable.a.a.a(this.getContext()));
            if (var3.e()) {
               this.scrollBy(0, var4);
               var2 = true;
               return var2;
            }

            if (var3.d()) {
               this.scrollBy(var4, 0);
               var2 = true;
               return var2;
            }
         }

         var2 = super.onGenericMotionEvent(var1);
      }

      return var2;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.K && this.I.a(var1)) {
         var2 = true;
      } else {
         var2 = super.onTouchEvent(var1);
      }

      return var2;
   }

   public void setBezelWidth(float var1) {
      this.I.b(var1);
   }

   public void setCenterEdgeItems(boolean var1) {
      this.L = var1;
      if (this.L) {
         if (this.getChildCount() > 0) {
            this.A();
         } else {
            this.M = true;
         }
      } else {
         this.B();
         this.M = false;
      }

   }

   public void setCircularScrollingGestureEnabled(boolean var1) {
      this.K = var1;
   }

   @Deprecated
   public void setOffsettingHelper(bl var1) {
      this.J = var1;
   }

   public void setScrollDegreesPerScreen(float var1) {
      this.I.a(var1);
   }
}
