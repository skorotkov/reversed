package fi.polar.polarflow.ui.myday.a_package;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.wearable.view.WearableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import java.util.List;

public class a extends fi.polar.polarflow.ui.g {
   private c a;
   private final OnClickListener b = new b(this);

   private static int a(List var0, int var1) {
      int var2 = 0;

      while(true) {
         if (var2 >= var0.size()) {
            var2 = 0;
            break;
         }

         if (((d)var0.get(var2)).a == var1) {
            break;
         }

         ++var2;
      }

      return var2;
   }

   public static a a(int var0) {
      a var1 = new a();
      Bundle var2 = new Bundle();
      var2.putBoolean("polar_button_enabled", false);
      var2.putBoolean("swipeToDismiss", true);
      var2.putInt("selected_rating", var0);
      var1.setArguments(var2);
      return var1;
   }

   // $FF: synthetic method
   static c a(a var0) {
      return var0.a;
   }

   public void a(c var1) {
      this.a = var1;
   }

   protected boolean c() {
      return false;
   }

   public void onCancel(DialogInterface var1) {
      super.onCancel(var1);
      if (this.a != null) {
         this.a.a(this);
      }

   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setStyle(0, 2131427608);
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var6 = var1.inflate(2130968779, var2, false);
      int var4 = this.getArguments().getInt("selected_rating", Integer.MAX_VALUE);
      List var7 = d.a(this.getContext().getResources());
      e var5 = new e(this.getContext(), var7, this.b, var4);
      WearableRecyclerView var8 = (WearableRecyclerView)var6.findViewById(2131755517);
      var8.setAdapter(var5);
      var8.a_(a(var7, var4));
      return var6;
   }
}
