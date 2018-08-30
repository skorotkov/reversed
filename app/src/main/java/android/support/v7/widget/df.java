package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

public class df extends bv {
   final int g;
   final int h;
   private dd i;
   private MenuItem j;

   public df(Context var1, boolean var2) {
      super(var1, var2);
      Configuration var3 = var1.getResources().getConfiguration();
      if (VERSION.SDK_INT >= 17 && 1 == var3.getLayoutDirection()) {
         this.g = 21;
         this.h = 22;
      } else {
         this.g = 22;
         this.h = 21;
      }

   }

   public boolean onHoverEvent(MotionEvent var1) {
      if (this.i != null) {
         ListAdapter var2 = this.getAdapter();
         int var3;
         android.support.v7.view.menu.l var8;
         if (var2 instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter var7 = (HeaderViewListAdapter)var2;
            var3 = var7.getHeadersCount();
            var8 = (android.support.v7.view.menu.l)var7.getWrappedAdapter();
         } else {
            var3 = 0;
            var8 = (android.support.v7.view.menu.l)var2;
         }

         android.support.v7.view.menu.p var5;
         label30: {
            if (var1.getAction() != 10) {
               int var4 = this.pointToPosition((int)var1.getX(), (int)var1.getY());
               if (var4 != -1) {
                  var3 = var4 - var3;
                  if (var3 >= 0 && var3 < var8.getCount()) {
                     var5 = var8.a(var3);
                     break label30;
                  }
               }
            }

            var5 = null;
         }

         MenuItem var6 = this.j;
         if (var6 != var5) {
            android.support.v7.view.menu.m var9 = var8.a();
            if (var6 != null) {
               this.i.a(var9, var6);
            }

            this.j = var5;
            if (var5 != null) {
               this.i.b(var9, var5);
            }
         }
      }

      return super.onHoverEvent(var1);
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      ListMenuItemView var3 = (ListMenuItemView)this.getSelectedView();
      boolean var4;
      if (var3 != null && var1 == this.g) {
         if (var3.isEnabled() && var3.getItemData().hasSubMenu()) {
            this.performItemClick(var3, this.getSelectedItemPosition(), this.getSelectedItemId());
         }

         var4 = true;
      } else if (var3 != null && var1 == this.h) {
         this.setSelection(-1);
         ((android.support.v7.view.menu.l)this.getAdapter()).a().a(false);
         var4 = true;
      } else {
         var4 = super.onKeyDown(var1, var2);
      }

      return var4;
   }

   public void setHoverListener(dd var1) {
      this.i = var1;
   }
}
