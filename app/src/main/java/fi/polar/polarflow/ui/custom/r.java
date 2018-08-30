package fi.polar.polarflow.ui.custom;

class r implements Runnable {
   // $FF: synthetic field
   final PolarDropDownList a;

   r(PolarDropDownList var1) {
      this.a = var1;
   }

   public void run() {
      PolarDropDownList.a(this.a).setVisibility(8);
   }
}
