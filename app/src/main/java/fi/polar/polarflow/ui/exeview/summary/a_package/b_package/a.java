package fi.polar.polarflow.ui.exeview.summary.a_package.b_package;

import android.content.Intent;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.Collection;

public class a extends ah {
   private static final SparseIntArray a = new b(5);

   private int a(long var1) {
      int var3 = a.get(fi.polar.polarflow.ui.exeview.summary.a_package.b_package.c.a(var1), 0);
      if (var3 == 0) {
         var3 = 2131230919;
      }

      return var3;
   }

   public int a() {
      return 2130968701;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      super.a(var1);
      if (this.P != null) {
         long var2 = this.P.getLong(H, -1L);
         if (var2 != -1L) {
            ((TextView)var1.findViewById(2131755385)).setText(this.a(var2));
         }
      }

   }

   public void a(Collection var1) {
   }

   public void d() {
   }
}
