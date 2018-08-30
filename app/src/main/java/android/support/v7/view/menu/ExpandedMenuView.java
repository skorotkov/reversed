package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.gh;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public final class ExpandedMenuView extends ListView implements ad, o, OnItemClickListener {
   private static final int[] a = new int[]{16842964, 16843049};
   private m b;
   private int c;

   public ExpandedMenuView(Context var1, AttributeSet var2) {
      this(var1, var2, 16842868);
   }

   public ExpandedMenuView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2);
      this.setOnItemClickListener(this);
      gh var4 = gh.a(var1, var2, a, var3, 0);
      if (var4.f(0)) {
         this.setBackgroundDrawable(var4.a(0));
      }

      if (var4.f(1)) {
         this.setDivider(var4.a(1));
      }

      var4.a();
   }

   public boolean a(p var1) {
      return this.b.a((MenuItem)var1, 0);
   }

   public int getWindowAnimations() {
      return this.c;
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.setChildrenDrawingCacheEnabled(false);
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      this.a((p)this.getAdapter().getItem(var3));
   }
}
