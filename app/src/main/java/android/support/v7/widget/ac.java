package android.support.v7.widget;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class ac extends BaseAdapter {
   // $FF: synthetic field
   final ActivityChooserView a;
   private w b;
   private int c;
   private boolean d;
   private boolean e;
   private boolean f;

   public int a() {
      int var1 = 0;
      int var2 = this.c;
      this.c = Integer.MAX_VALUE;
      int var3 = MeasureSpec.makeMeasureSpec(0, 0);
      int var4 = MeasureSpec.makeMeasureSpec(0, 0);
      int var5 = this.getCount();
      View var6 = null;

      int var7;
      for(var7 = 0; var1 < var5; ++var1) {
         var6 = this.getView(var1, var6, (ViewGroup)null);
         var6.measure(var3, var4);
         var7 = Math.max(var7, var6.getMeasuredWidth());
      }

      this.c = var2;
      return var7;
   }

   public void a(int var1) {
      if (this.c != var1) {
         this.c = var1;
         this.notifyDataSetChanged();
      }

   }

   public void a(w var1) {
      w var2 = this.a.a.d();
      if (var2 != null && this.a.isShown()) {
         var2.unregisterObserver(this.a.e);
      }

      this.b = var1;
      if (var1 != null && this.a.isShown()) {
         var1.registerObserver(this.a.e);
      }

      this.notifyDataSetChanged();
   }

   public void a(boolean var1) {
      if (this.f != var1) {
         this.f = var1;
         this.notifyDataSetChanged();
      }

   }

   public void a(boolean var1, boolean var2) {
      if (this.d != var1 || this.e != var2) {
         this.d = var1;
         this.e = var2;
         this.notifyDataSetChanged();
      }

   }

   public ResolveInfo b() {
      return this.b.b();
   }

   public int c() {
      return this.b.a();
   }

   public w d() {
      return this.b;
   }

   public boolean e() {
      return this.d;
   }

   public int getCount() {
      int var1 = this.b.a();
      int var2 = var1;
      if (!this.d) {
         var2 = var1;
         if (this.b.b() != null) {
            var2 = var1 - 1;
         }
      }

      var1 = Math.min(var2, this.c);
      var2 = var1;
      if (this.f) {
         var2 = var1 + 1;
      }

      return var2;
   }

   public Object getItem(int var1) {
      ResolveInfo var2;
      switch(this.getItemViewType(var1)) {
      case 0:
         int var3 = var1;
         if (!this.d) {
            var3 = var1;
            if (this.b.b() != null) {
               var3 = var1 + 1;
            }
         }

         var2 = this.b.a(var3);
         break;
      case 1:
         var2 = null;
         break;
      default:
         throw new IllegalArgumentException();
      }

      return var2;
   }

   public long getItemId(int var1) {
      return (long)var1;
   }

   public int getItemViewType(int var1) {
      byte var2;
      if (this.f && var1 == this.getCount() - 1) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      return var2;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      View var4;
      switch(this.getItemViewType(var1)) {
      case 0:
         label26: {
            if (var2 != null) {
               var4 = var2;
               if (var2.getId() == android.support.v7.a.g.list_item) {
                  break label26;
               }
            }

            var4 = LayoutInflater.from(this.a.getContext()).inflate(android.support.v7.a.h.abc_activity_chooser_view_list_item, var3, false);
         }

         PackageManager var5 = this.a.getContext().getPackageManager();
         ImageView var7 = (ImageView)var4.findViewById(android.support.v7.a.g.icon);
         ResolveInfo var6 = (ResolveInfo)this.getItem(var1);
         var7.setImageDrawable(var6.loadIcon(var5));
         ((TextView)var4.findViewById(android.support.v7.a.g.title)).setText(var6.loadLabel(var5));
         if (this.d && var1 == 0 && this.e) {
            android.support.v4.view.bz.b(var4, true);
         } else {
            android.support.v4.view.bz.b(var4, false);
         }
         break;
      case 1:
         if (var2 != null) {
            var4 = var2;
            if (var2.getId() == 1) {
               break;
            }
         }

         var4 = LayoutInflater.from(this.a.getContext()).inflate(android.support.v7.a.h.abc_activity_chooser_view_list_item, var3, false);
         var4.setId(1);
         ((TextView)var4.findViewById(android.support.v7.a.g.title)).setText(this.a.getContext().getString(android.support.v7.a.i.abc_activity_chooser_view_see_all));
         break;
      default:
         throw new IllegalArgumentException();
      }

      return var4;
   }

   public int getViewTypeCount() {
      return 3;
   }
}
