package fi.polar.polarflow.ui.exeview;

import android.content.Context;
import android.support.wearable.view.DotsPageIndicator;
import android.support.wearable.view.GridViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import java.util.ArrayList;
import java.util.List;

public class ExeViewGridPager extends GridViewPager implements OnLayoutChangeListener {
   private ak a;
   private aa b;
   private DotsPageIndicator c;
   private final android.support.wearable.view.aj d;
   private final List e;

   public ExeViewGridPager(Context var1) {
      this(var1, (AttributeSet)null, 0);
   }

   public ExeViewGridPager(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public ExeViewGridPager(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.addOnLayoutChangeListener(this);
      this.d = new z(this, (y)null);
      this.e = new ArrayList();
      this.setOnPageChangeListener(this.d);
   }

   // $FF: synthetic method
   static List a(ExeViewGridPager var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static aa b(ExeViewGridPager var0) {
      return var0.b;
   }

   public void a(android.support.wearable.view.aj var1) {
      this.e.add(var1);
   }

   public void a(ak var1, boolean var2) {
      int var3 = this.b.b(var1);
      if (var3 >= 0) {
         this.a = var1;
         super.a(0, var3, var2);
      } else {
         fi.polar.polarflow.util.d.f(this.getClass().getSimpleName(), "type not found from adapter: " + var1);
      }

   }

   public ak getCurrentItemType() {
      return this.a;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2;
      try {
         var2 = super.onInterceptTouchEvent(var1);
      } catch (IllegalArgumentException var3) {
         fi.polar.polarflow.util.d.c("ExeViewGridPager", "onInterceptTouchEvent couldn't handle MotionEvent", var3);
         var2 = true;
      }

      return var2;
   }

   public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (this.a != null) {
         super.a(0, this.b.b(this.a), false);
      }

      this.removeOnLayoutChangeListener(this);
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      try {
         var2 = super.onTouchEvent(var1);
      } catch (IllegalArgumentException var3) {
         fi.polar.polarflow.util.d.a("ExeViewGridPager", "onTouchEvent couldn't handle MotionEvent", var3);
         var2 = true;
      }

      return var2;
   }

   public void setAdapter(android.support.wearable.view.aa var1) {
      super.setAdapter(var1);
      this.b = (aa)var1;
   }

   public void setCurrentItem(ak var1) {
      this.a(var1, true);
   }

   public void setDotsPageIndicator(DotsPageIndicator var1) {
      if (var1 == null && this.c != null) {
         this.c.setOnPageChangeListener((android.support.wearable.view.aj)null);
         this.c.setPager((GridViewPager)null);
      }

      this.c = var1;
      if (this.c != null) {
         this.c.setPager(this);
         this.c.setOnPageChangeListener(this.d);
      }

   }
}
