package fi.polar.polarflow.ui.exeview;

import android.app.Fragment;
import java.util.Iterator;

class z implements android.support.wearable.view.aj {
   // $FF: synthetic field
   final ExeViewGridPager a;

   private z(ExeViewGridPager var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   z(ExeViewGridPager var1, y var2) {
      this(var1);
   }

   public void a(int var1) {
      Iterator var2 = ExeViewGridPager.a(this.a).iterator();

      while(var2.hasNext()) {
         ((android.support.wearable.view.aj)var2.next()).a(var1);
      }

   }

   public void a(int var1, int var2) {
      fi.polar.polarflow.util.d.c("ExeViewGridPager", "onPageSelected: " + var1 + " " + var2);
      Fragment var3 = ExeViewGridPager.b(this.a).c(var2);
      if (var3 != null) {
         var3.setUserVisibleHint(true);
      }

      for(int var4 = 0; var4 < ExeViewGridPager.b(this.a).a(0); ++var4) {
         var3 = ExeViewGridPager.b(this.a).c(var4);
         if (var4 != var2 && var3 != null && var3.getUserVisibleHint()) {
            var3.setUserVisibleHint(false);
         }
      }

      Iterator var5 = ExeViewGridPager.a(this.a).iterator();

      while(var5.hasNext()) {
         ((android.support.wearable.view.aj)var5.next()).a(var1, var2);
      }

   }

   public void a(int var1, int var2, float var3, float var4, int var5, int var6) {
      Iterator var7 = ExeViewGridPager.a(this.a).iterator();

      while(var7.hasNext()) {
         ((android.support.wearable.view.aj)var7.next()).a(var1, var2, var3, var4, var5, var6);
      }

   }
}
