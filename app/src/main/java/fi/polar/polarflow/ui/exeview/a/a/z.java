package fi.polar.polarflow.ui.exeview.a.a;

public class z extends fi.polar.polarflow.ui.a.i {
   public z() {
      super(1000);
   }

   public int a() {
      int var1;
      switch(aa.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968662;
         break;
      case 2:
         var1 = 2130968661;
         break;
      case 3:
         var1 = 2130968660;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void e() {
      if (this.P != null) {
         this.b(this.P.getLong(q, -1L));
      } else {
         this.b(this.Q.getDurationMs());
      }

   }

   protected int i() {
      return 1000 - (int)this.Q.getDurationMs() % 1000;
   }
}
