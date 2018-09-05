package fi.polar.polarflow.ui.myday.sleep.a_package;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.ui.custom.PolarGlyphView;

public class f extends i {
   private final double a;
   private final int c;

   public f(double var1, int var3) {
      this.a = var1;
      this.c = var3;
   }

   public int a() {
      return 2130968775;
   }

   public void a(View var1) {
      super.a(var1);
      Context var2 = var1.getContext();
      ((PolarGlyphView)var1.findViewById(2131755146)).setGlyph(var2.getText(2131231120));
      ((TextView)var1.findViewById(2131755429)).setText(a_DataTypes.a_roundAndToString(20, this.a));
      ((TextView)var1.findViewById(2131755502)).setText(o.b(var2, this.c));
   }
}
