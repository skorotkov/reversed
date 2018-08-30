package android.support.v7.widget;

import android.view.View;
import android.view.View.OnClickListener;

class fh implements OnClickListener {
   // $FF: synthetic field
   final fe a;

   fh(fe var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      ((fi)var1).b().d();
      int var2 = this.a.b.getChildCount();

      for(int var3 = 0; var3 < var2; ++var3) {
         View var4 = this.a.b.getChildAt(var3);
         boolean var5;
         if (var4 == var1) {
            var5 = true;
         } else {
            var5 = false;
         }

         var4.setSelected(var5);
      }

   }
}
