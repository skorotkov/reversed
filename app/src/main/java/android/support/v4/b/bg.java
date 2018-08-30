package android.support.v4.b;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

final class bg implements Runnable {
   // $FF: synthetic field
   final ArrayList a;
   // $FF: synthetic field
   final Map b;

   bg(ArrayList var1, Map var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      int var1 = this.a.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         View var3 = (View)this.a.get(var2);
         String var4 = var3.getTransitionName();
         if (var4 != null) {
            var3.setTransitionName(bc.a(this.b, var4));
         }
      }

   }
}
