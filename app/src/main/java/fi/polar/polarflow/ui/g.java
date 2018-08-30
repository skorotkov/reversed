package fi.polar.polarflow.ui;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;

public abstract class g extends DialogFragment {
   private final OnKeyListener a = new h(this);

   private void a(OnKeyListener var1) {
      Dialog var2 = this.getDialog();
      if (var2 != null) {
         var2.setOnKeyListener(var1);
      }

   }

   public String a() {
      return this.getTag();
   }

   protected boolean b() {
      boolean var1 = false;
      Bundle var2 = this.getArguments();
      boolean var3 = var1;
      if (var2 != null) {
         var3 = var1;
         if (var2.getBoolean("polar_button_enabled", false)) {
            var3 = true;
         }
      }

      return var3;
   }

   protected abstract boolean c();

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      if (this.getArguments() != null && this.getArguments().getBoolean("swipeToDismiss", true)) {
         this.setStyle(0, 2131427607);
      } else {
         this.setStyle(0, 2131427611);
      }

   }

   public void onPause() {
      this.a((OnKeyListener)null);
      super.onPause();
   }

   public void onResume() {
      super.onResume();
      this.a(this.a);
   }
}
