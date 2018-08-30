package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class l extends BaseAdapter {
   static final int a;
   m b;
   private int c = -1;
   private boolean d;
   private final boolean e;
   private final LayoutInflater f;

   static {
      a = android.support.v7.a.h.abc_popup_menu_item_layout;
   }

   public l(m var1, LayoutInflater var2, boolean var3) {
      this.e = var3;
      this.f = var2;
      this.b = var1;
      this.b();
   }

   public m a() {
      return this.b;
   }

   public p a(int var1) {
      ArrayList var2;
      if (this.e) {
         var2 = this.b.k();
      } else {
         var2 = this.b.h();
      }

      int var3 = var1;
      if (this.c >= 0) {
         var3 = var1;
         if (var1 >= this.c) {
            var3 = var1 + 1;
         }
      }

      return (p)var2.get(var3);
   }

   public void a(boolean var1) {
      this.d = var1;
   }

   void b() {
      p var1 = this.b.o();
      if (var1 != null) {
         ArrayList var2 = this.b.k();
         int var3 = var2.size();

         for(int var4 = 0; var4 < var3; ++var4) {
            if ((p)var2.get(var4) == var1) {
               this.c = var4;
               return;
            }
         }
      }

      this.c = -1;
   }

   public int getCount() {
      ArrayList var1;
      if (this.e) {
         var1 = this.b.k();
      } else {
         var1 = this.b.h();
      }

      int var2;
      if (this.c < 0) {
         var2 = var1.size();
      } else {
         var2 = var1.size() - 1;
      }

      return var2;
   }

   // $FF: synthetic method
   public Object getItem(int var1) {
      return this.a(var1);
   }

   public long getItemId(int var1) {
      return (long)var1;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      if (var2 == null) {
         var2 = this.f.inflate(a, var3, false);
      }

      ae var4 = (ae)var2;
      if (this.d) {
         ((ListMenuItemView)var2).setForceShowIcon(true);
      }

      var4.a(this.a(var1), 0);
      return var2;
   }

   public void notifyDataSetChanged() {
      this.b();
      super.notifyDataSetChanged();
   }
}
