package fi.polar.polarflow.service.activity.a_package;

class m extends k {
   public m() {
      super(v.b);
   }

   public void a(o var1) {
      if (var1 instanceof s) {
         super.a(var1);
      } else {
         fi.polar.polarflow.util.d.c("CumulativeSteps", "", new IllegalArgumentException("Expecting SummarizerInputSteps"));
      }

   }
}
