package fi.polar.polarflow.ui.exewait.a;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.ui.custom.PolarDropDownList;
import fi.polar.polarflow.ui.custom.RadioButtonWearableListView;
import fi.polar.polarflow.ui.custom.t;
import fi.polar.polarflow.ui.custom.w;
import fi.polar.polarflow.util.u;
import java.util.ArrayList;
import java.util.List;

public class a extends Fragment {
   private static final SparseArray a = new b();
   private RadioButtonWearableListView b;
   private l c;
   private t d;
   private PolarDropDownList e;
   private w f = new c(this);
   private w g = new d(this);

   // $FF: synthetic method
   static int a(int var0) {
      return b(var0);
   }

   // $FF: synthetic method
   static SparseArray a() {
      return a;
   }

   // $FF: synthetic method
   static RadioButtonWearableListView a(a var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static String a(a var0, int var1) {
      return var0.c(var1);
   }

   private int b() {
      int var1 = u.a().k();
      return (Integer)((Pair)a.get(var1)).first;
   }

   private static int b(int var0) {
      if (var0 == 1) {
         var0 = 2131230942;
      } else {
         var0 = 2131230941;
      }

      return var0;
   }

   // $FF: synthetic method
   static int b(a var0) {
      return var0.b();
   }

   // $FF: synthetic method
   static l c(a var0) {
      return var0.c;
   }

   private String c(int var1) {
      String var2;
      if (var1 == 1) {
         var2 = this.getString(2131230945);
      } else {
         var2 = this.getString(2131230939);
      }

      return var2;
   }

   // $FF: synthetic method
   static PolarDropDownList d(a var0) {
      return var0.e;
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var6 = var1.inflate(2130968755, var2, false);
      int var4 = u.a().k();
      this.c = new l(this.getContext(), (Pair)a.get(var4), b(var4));
      this.b = (RadioButtonWearableListView)var6.findViewById(2131755482);
      this.b.setAdapter(this.c);
      this.c.a(this.f);
      this.d = new t(this.getContext());
      ArrayList var5 = new ArrayList();
      var5.add(this.getResources().getString(2131230931));
      var5.add(this.getResources().getString(2131230932));
      this.d.a((List)var5);
      this.e = (PolarDropDownList)var6.findViewById(2131755483);
      this.e.setAdapter(this.d);
      this.e.setTitle(this.c(var4));
      this.d.a(this.g);
      this.d.a(var4, false);
      this.c.a(u.a().j() - this.b(), false);
      return var6;
   }
}
