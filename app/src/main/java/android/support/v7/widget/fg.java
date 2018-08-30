package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class fg extends BaseAdapter {
   // $FF: synthetic field
   final fe a;

   fg(fe var1) {
      this.a = var1;
   }

   public int getCount() {
      return this.a.b.getChildCount();
   }

   public Object getItem(int var1) {
      return ((fi)this.a.b.getChildAt(var1)).b();
   }

   public long getItemId(int var1) {
      return (long)var1;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      if (var2 == null) {
         var2 = this.a.a((android.support.v7.app.c)this.getItem(var1), true);
      } else {
         ((fi)var2).a((android.support.v7.app.c)this.getItem(var1));
      }

      return (View)var2;
   }
}
