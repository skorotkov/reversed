package fi.polar.polarflow.ui.exeview.laps;

import java.util.ArrayList;
import java.util.Collection;

public class f extends ArrayList {
   public boolean add(Object var1) {
      if (this.size() >= 19) {
         this.remove(0);
      }

      return super.add(var1);
   }

   public boolean addAll(Collection var1) {
      boolean var2 = super.addAll(var1);
      if (this.size() > 19) {
         this.removeRange(0, this.size() - 19);
      }

      return var2;
   }
}
