package fi.polar.polarflow.ui.a_package;

public abstract class c extends a {
   protected void a(float var1) {
      String var2;
      if (this.p() == 2) {
         var2 = fi.polar.polarflow.ui.o.d(var1);
      } else {
         var2 = fi.polar.polarflow.ui.o.c(var1);
      }

      this.a.setTextSize(0, this.a(this.l(), var2.length()));
      this.a.setText(var2);
   }
}
