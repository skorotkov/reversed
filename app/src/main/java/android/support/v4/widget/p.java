package android.support.v4.widget;

import android.widget.ListView;

public class p extends a {
   private final ListView f;

   public p(ListView var1) {
      super(var1);
      this.f = var1;
   }

   public void a(int var1, int var2) {
      android.support.v4.widget.q.a(this.f, var2);
   }

   public boolean e(int var1) {
      return false;
   }

   public boolean f(int var1) {
      boolean var2 = false;
      ListView var3 = this.f;
      int var4 = var3.getCount();
      boolean var5;
      if (var4 == 0) {
         var5 = var2;
      } else {
         int var6 = var3.getChildCount();
         int var7 = var3.getFirstVisiblePosition();
         if (var1 > 0) {
            if (var7 + var6 >= var4) {
               var5 = var2;
               if (var3.getChildAt(var6 - 1).getBottom() <= var3.getHeight()) {
                  return var5;
               }
            }
         } else {
            var5 = var2;
            if (var1 >= 0) {
               return var5;
            }

            if (var7 <= 0 && var3.getChildAt(0).getTop() >= 0) {
               var5 = var2;
               return var5;
            }
         }

         var5 = true;
      }

      return var5;
   }
}
