package android.support.v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.cw;
import android.support.v7.a.k;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

public class a {
   private Context a;

   private a(Context var1) {
      this.a = var1;
   }

   public static a a(Context var0) {
      return new a(var0);
   }

   public int a() {
      Resources var1 = this.a.getResources();
      int var2 = android.support.v4.c.a.a.b(var1);
      int var3 = android.support.v4.c.a.a.a(var1);
      byte var4;
      if (android.support.v4.c.a.a.c(var1) > 600 || var2 > 600 || var2 > 960 && var3 > 720 || var2 > 720 && var3 > 960) {
         var4 = 5;
      } else if (var2 >= 500 || var2 > 640 && var3 > 480 || var2 > 480 && var3 > 640) {
         var4 = 4;
      } else if (var2 >= 360) {
         var4 = 3;
      } else {
         var4 = 2;
      }

      return var4;
   }

   public boolean b() {
      boolean var1 = true;
      if (VERSION.SDK_INT < 19 && cw.b(ViewConfiguration.get(this.a))) {
         var1 = false;
      }

      return var1;
   }

   public int c() {
      return this.a.getResources().getDisplayMetrics().widthPixels / 2;
   }

   public boolean d() {
      return this.a.getResources().getBoolean(android.support.v7.a.c.abc_action_bar_embed_tabs);
   }

   public int e() {
      TypedArray var1 = this.a.obtainStyledAttributes((AttributeSet)null, k.ActionBar, android.support.v7.a.b.actionBarStyle, 0);
      int var2 = var1.getLayoutDimension(k.ActionBar_height, 0);
      Resources var3 = this.a.getResources();
      int var4 = var2;
      if (!this.d()) {
         var4 = Math.min(var2, var3.getDimensionPixelSize(android.support.v7.a.e.abc_action_bar_stacked_max_height));
      }

      var1.recycle();
      return var4;
   }

   public int f() {
      return this.a.getResources().getDimensionPixelSize(android.support.v7.a.e.abc_action_bar_stacked_tab_max_width);
   }
}
