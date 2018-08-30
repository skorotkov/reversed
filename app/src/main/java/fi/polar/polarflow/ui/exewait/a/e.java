package fi.polar.polarflow.ui.exewait.a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class e extends fi.polar.polarflow.ui.g {
   private f a;

   public static e d() {
      e var0 = new e();
      Bundle var1 = new Bundle();
      var1.putBoolean("polar_button_enabled", true);
      var1.putBoolean("swipeToDismiss", true);
      var0.setArguments(var1);
      return var0;
   }

   public void a(f var1) {
      this.a = var1;
   }

   public boolean c() {
      return true;
   }

   public void e() {
      a var1 = new a();
      this.getChildFragmentManager().beginTransaction().replace(2131755018, var1).commit();
   }

   public void onActivityCreated(Bundle var1) {
      super.onActivityCreated(var1);
      g var2 = new g();
      this.getChildFragmentManager().beginTransaction().add(2131755018, var2).commit();
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      FrameLayout var4 = new FrameLayout(this.getContext());
      var4.setId(2131755018);
      if (this.getDialog() != null && this.getDialog().getWindow() != null) {
         this.getDialog().getWindow().addFlags(128);
      }

      return var4;
   }

   public void onDismiss(DialogInterface var1) {
      super.onDismiss(var1);
      if (this.a != null) {
         this.a.d();
      }

   }
}
