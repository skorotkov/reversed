package fi.polar.polarflow.ui.myday.sleep.a_package;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;

public class g extends i {
   private static final SparseIntArray a = new h(8);
   private final int c;

   public g(int var1) {
      this.c = var1;
   }

   private int a(int var1) {
      var1 = this.b(var1);
      return a.get(var1, 2131231033);
   }

   private int b(int var1) {
      StringBuilder var2 = new StringBuilder(Integer.toString(var1));

      while(var2.length() < 5) {
         var2.insert(0, '0');
      }

      return Integer.parseInt(var2.substring(0, 3), 2);
   }

   public int a() {
      return 2130968776;
   }

   public void a(View var1) {
      super.a(var1);
      ((TextView)var1.findViewById(2131755509)).setText(this.a(this.c));
   }
}
