package fi.polar.polarflow.ui.exeview.summary.a_package;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.custom.s;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;

public class n extends d {
   public int a() {
      return 2130968789;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      PolarGlyphView var4 = (PolarGlyphView)var1.findViewById(2131755437);
      if (var4 != null) {
         long var2;
         if (this.a != null) {
            var2 = this.a.getLong(ah.B, -1L);
         } else {
            var2 = Training.getInstance().getSportId();
         }

         var4.setGlyph(s.a(var2));
      }

   }

   public void b() {
   }

   public void d() {
   }
}
