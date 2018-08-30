package fi.polar.polarflow.ui.myday;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class j extends AsyncTask {
   // $FF: synthetic field
   final h a;

   private j(h var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   j(h var1, i var2) {
      this(var1);
   }

   protected List a(fi.polar.polarflow.ui.myday.item.c... var1) {
      ArrayList var3;
      if (this.isCancelled()) {
         var3 = null;
      } else {
         var3 = new ArrayList(Arrays.asList(var1));
         h.a(var3, h.a(this.a));
         var3.addAll(u.a());
         var3.addAll(u.b());
         var3.addAll(u.c());
         fi.polar.polarflow.ui.myday.item.a var2 = u.d();
         if (var2.e() > 0) {
            var3.add(var2);
         }

         Collections.sort(var3);
      }

      return var3;
   }

   protected void a(List var1) {
      h.a(this.a, var1, h.a(this.a, var1));
      h.b(this.a).setCanScrollVertically(true);
      h.a((h)this.a, -1);
   }

   // $FF: synthetic method
   protected Object doInBackground(Object[] var1) {
      return this.a((fi.polar.polarflow.ui.myday.item.c[])var1);
   }

   // $FF: synthetic method
   protected void onPostExecute(Object var1) {
      this.a((List)var1);
   }
}
