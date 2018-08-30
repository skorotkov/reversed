package fi.polar.polarflow.ui.custom;

import android.app.Fragment;

public abstract class al extends Fragment {
   private final Enum a;

   protected al(Enum var1) {
      this.a = var1;
   }

   public Enum a() {
      return this.a;
   }
}
