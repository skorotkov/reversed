package fi.polar.polarflow.ui;

import android.content.Intent;

public class b {
   private final Intent a = new Intent();

   public Intent a() {
      return this.a;
   }

   public b a(boolean var1) {
      this.a.putExtra("ActivityResult.extra.CLOSED_WITH_POLAR_BUTTON", var1);
      return this;
   }
}
