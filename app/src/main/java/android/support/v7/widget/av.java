package android.support.v7.widget;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

class av implements ListAdapter, SpinnerAdapter {
   private SpinnerAdapter a;
   private ListAdapter b;

   public av(SpinnerAdapter var1, Theme var2) {
      this.a = var1;
      if (var1 instanceof ListAdapter) {
         this.b = (ListAdapter)var1;
      }

      if (var2 != null) {
         if (VERSION.SDK_INT >= 23 && var1 instanceof ThemedSpinnerAdapter) {
            ThemedSpinnerAdapter var4 = (ThemedSpinnerAdapter)var1;
            if (var4.getDropDownViewTheme() != var2) {
               var4.setDropDownViewTheme(var2);
            }
         } else if (var1 instanceof gd) {
            gd var3 = (gd)var1;
            if (var3.a() == null) {
               var3.a(var2);
            }
         }
      }

   }

   public boolean areAllItemsEnabled() {
      ListAdapter var1 = this.b;
      boolean var2;
      if (var1 != null) {
         var2 = var1.areAllItemsEnabled();
      } else {
         var2 = true;
      }

      return var2;
   }

   public int getCount() {
      int var1;
      if (this.a == null) {
         var1 = 0;
      } else {
         var1 = this.a.getCount();
      }

      return var1;
   }

   public View getDropDownView(int var1, View var2, ViewGroup var3) {
      if (this.a == null) {
         var2 = null;
      } else {
         var2 = this.a.getDropDownView(var1, var2, var3);
      }

      return var2;
   }

   public Object getItem(int var1) {
      Object var2;
      if (this.a == null) {
         var2 = null;
      } else {
         var2 = this.a.getItem(var1);
      }

      return var2;
   }

   public long getItemId(int var1) {
      long var2;
      if (this.a == null) {
         var2 = -1L;
      } else {
         var2 = this.a.getItemId(var1);
      }

      return var2;
   }

   public int getItemViewType(int var1) {
      return 0;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      return this.getDropDownView(var1, var2, var3);
   }

   public int getViewTypeCount() {
      return 1;
   }

   public boolean hasStableIds() {
      boolean var1;
      if (this.a != null && this.a.hasStableIds()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean isEmpty() {
      boolean var1;
      if (this.getCount() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean isEnabled(int var1) {
      ListAdapter var2 = this.b;
      boolean var3;
      if (var2 != null) {
         var3 = var2.isEnabled(var1);
      } else {
         var3 = true;
      }

      return var3;
   }

   public void registerDataSetObserver(DataSetObserver var1) {
      if (this.a != null) {
         this.a.registerDataSetObserver(var1);
      }

   }

   public void unregisterDataSetObserver(DataSetObserver var1) {
      if (this.a != null) {
         this.a.unregisterDataSetObserver(var1);
      }

   }
}
