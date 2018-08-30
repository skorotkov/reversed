package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

abstract class y implements ab, ah, OnItemClickListener {
   private Rect a;

   protected static int a(ListAdapter var0, ViewGroup var1, Context var2, int var3) {
      int var4 = MeasureSpec.makeMeasureSpec(0, 0);
      int var5 = MeasureSpec.makeMeasureSpec(0, 0);
      int var6 = var0.getCount();
      int var7 = 0;
      int var8 = 0;
      View var9 = null;
      int var10 = 0;

      while(true) {
         if (var7 >= var6) {
            var3 = var10;
            break;
         }

         int var11 = var0.getItemViewType(var7);
         int var12 = var8;
         if (var11 != var8) {
            var12 = var11;
            var9 = null;
         }

         if (var1 == null) {
            var1 = new FrameLayout(var2);
         }

         var9 = var0.getView(var7, var9, (ViewGroup)var1);
         var9.measure(var4, var5);
         var8 = var9.getMeasuredWidth();
         if (var8 >= var3) {
            break;
         }

         if (var8 > var10) {
            var10 = var8;
         }

         ++var7;
         var8 = var12;
      }

      return var3;
   }

   protected static l a(ListAdapter var0) {
      l var1;
      if (var0 instanceof HeaderViewListAdapter) {
         var1 = (l)((HeaderViewListAdapter)var0).getWrappedAdapter();
      } else {
         var1 = (l)var0;
      }

      return var1;
   }

   protected static boolean b(m var0) {
      boolean var1 = false;
      int var2 = var0.size();
      int var3 = 0;

      boolean var4;
      while(true) {
         var4 = var1;
         if (var3 >= var2) {
            break;
         }

         MenuItem var5 = var0.getItem(var3);
         if (var5.isVisible() && var5.getIcon() != null) {
            var4 = true;
            break;
         }

         ++var3;
      }

      return var4;
   }

   public abstract void a(int var1);

   public void a(Context var1, m var2) {
   }

   public void a(Rect var1) {
      this.a = var1;
   }

   public abstract void a(m var1);

   public abstract void a(View var1);

   public abstract void a(OnDismissListener var1);

   public abstract void a(boolean var1);

   public boolean a(m var1, p var2) {
      return false;
   }

   public abstract void b(int var1);

   public boolean b(m var1, p var2) {
      return false;
   }

   public abstract void c(int var1);

   public abstract void c(boolean var1);

   protected boolean f() {
      return true;
   }

   public Rect g() {
      return this.a;
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      ListAdapter var7 = (ListAdapter)var1.getAdapter();
      m var6 = a(var7).b;
      MenuItem var8 = (MenuItem)var7.getItem(var3);
      byte var9;
      if (this.f()) {
         var9 = 0;
      } else {
         var9 = 4;
      }

      var6.a(var8, this, var9);
   }
}
