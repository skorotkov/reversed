package fi.polar.polarflow.ui.myday.sleep.a;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.custom.PolarGlyphView;

public class c extends i {
   private static final SparseIntArray a = new d(5);
   private static final SparseIntArray c = new e(5);
   private final double d;
   private final int e;

   public c(double var1, int var3) {
      this.d = var1;
      this.e = var3;
   }

   private static int a(int var0) {
      return a.get(var0, 2131231016);
   }

   private static int b(int var0) {
      return c.get(var0, 2131231150);
   }

   public int a() {
      return 2130968774;
   }

   public void a(View var1) {
      super.a(var1);
      Context var2 = var1.getContext();
      ((PolarGlyphView)var1.findViewById(2131755146)).setGlyph(var2.getText(b(this.e)));
      ((TextView)var1.findViewById(2131755421)).setText(fi.polar.polarflow.a.a.a(21, this.d));
      ((TextView)var1.findViewById(2131755507)).setText(var1.getContext().getText(a(this.e)));
   }
}
