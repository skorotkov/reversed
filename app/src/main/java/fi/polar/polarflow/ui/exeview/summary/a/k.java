package fi.polar.polarflow.ui.exeview.summary.a;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.data.orm.SwimmingStyleStatistics;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import java.util.ArrayList;
import java.util.List;

public class k extends fi.polar.polarflow.ui.g {
   public static k a(SwimmingStyleStatistics var0, int var1) {
      k var2 = new k();
      Bundle var3 = new Bundle();
      var3.putParcelable("KEY_SWIMMING_STYLE_STATISTICS", var0);
      var3.putInt("KEY_POOL_UNIT", var1);
      var3.putBoolean("polar_button_enabled", false);
      var3.putBoolean("swipeToDismiss", true);
      var2.setArguments(var3);
      return var2;
   }

   private List a(Context var1) {
      ArrayList var2 = new ArrayList();
      var2.add(fi.polar.polarflow.ui.exeview.summary.g.w);
      var2.add(fi.polar.polarflow.ui.exeview.summary.g.c);
      var2.add(fi.polar.polarflow.ui.exeview.summary.g.d);
      var2.add(fi.polar.polarflow.ui.exeview.summary.g.i);
      var2.add(fi.polar.polarflow.ui.exeview.summary.g.B);
      SwimmingStyleStatistics var3 = (SwimmingStyleStatistics)this.getArguments().getParcelable("KEY_SWIMMING_STYLE_STATISTICS");
      Bundle var4 = new Bundle();
      var4.putLong(ah.B, 23L);
      var4.putInt(ah.O, this.getArguments().getInt("KEY_POOL_UNIT"));
      var4.putLong(ah.q, var3.getSwimmingTimeTotal());
      var4.putFloat(ah.r, var3.getDistance());
      var4.putFloat(ah.M, var3.getAverageSwolf());
      var4.putFloat(ah.y, fi.polar.polarflow.a.a.a(var3.getDistance(), (float)var3.getSwimmingTimeTotal()));
      var4.putInt(ah.N, var3.getSwimmingStyle());
      return fi.polar.polarflow.ui.exeview.summary.h.a((List)var2, var1, var4);
   }

   public boolean c() {
      return false;
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(2130968793, var2);
      ContextThemeWrapper var5 = new ContextThemeWrapper(var4.getContext(), 2131427637);
      fi.polar.polarflow.ui.exeview.summary.b var6 = new fi.polar.polarflow.ui.exeview.summary.b(var5, this.a(var5));
      ((BetterWearableListView)var4.findViewById(2131755173)).setAdapter(var6);
      return var4;
   }
}
