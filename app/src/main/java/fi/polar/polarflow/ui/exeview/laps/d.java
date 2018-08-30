package fi.polar.polarflow.ui.exeview.laps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class d extends fi.polar.polarflow.ui.exeview.j {
   private static final int[] a = new int[]{2131755162, 2131755163, 2131755164};
   private final List c;

   d(List var1) {
      this.c = new ArrayList(var1);
   }

   public int a() {
      return 2130968621;
   }

   public View a(LayoutInflater var1, ViewGroup var2) {
      return this.a(var1, var2, false);
   }

   public View a(LayoutInflater var1, ViewGroup var2, boolean var3) {
      View var4 = var1.inflate(this.a(), var2, var3);
      Iterator var6 = this.e().iterator();

      while(var6.hasNext()) {
         ah var5 = (ah)var6.next();
         var1.inflate(var5.a(), (ViewGroup)this.a(var4, var5), true);
      }

      return var4;
   }

   protected View a(View var1, ah var2) {
      return var1.findViewById(a[var2.j()]);
   }

   public List e() {
      return this.c;
   }
}
