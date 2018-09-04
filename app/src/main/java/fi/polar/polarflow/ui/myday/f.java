package fi.polar.polarflow.ui.myday;

import android.content.Context;
import android.support.v7.widget.ey;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f extends fi.polar.polarflow.ui.custom.c {
   private final List a;
   private final LayoutInflater b;

   public f(Context var1, List var2) {
      this.b = LayoutInflater.from(var1);
      this.a = new ArrayList(var2);
   }

   private View a(int var1, ViewGroup var2) {
      fi.polar.polarflow.ui.myday.item.c var3 = (fi.polar.polarflow.ui.myday.item.c)this.a.get(var1);
      return this.b.inflate(var3.a(), var2, false);
   }

   public int a() {
      return this.a.size();
   }

   public int a(int var1) {
      return var1;
   }

   // $FF: synthetic method
   public ey a(ViewGroup var1, int var2) {
      return this.c(var1, var2);
   }

   fi.polar.polarflow.ui.myday.item.c a(Class var1) {
      return u.b(this.a, var1);
   }

   fi.polar.polarflow.ui.myday.item.c a(String var1) {
      return u.b(this.a, var1);
   }

   public void a(g var1) {
      super.c(var1);
      g.a(var1).a(var1.a);
      g.a(var1).d();
   }

   public void a(ey var, int var2) {
      g var1 = (g)var;
      g.a(var1, (fi.polar.polarflow.ui.myday.item.c)this.a.get(var2));
   }

   public void a(List var1) {
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         ((fi.polar.polarflow.ui.myday.item.c)var2.next()).b();
         var2.remove();
      }

      this.a.addAll(var1);
      this.c();
   }

   List b(String var1) {
      return u.c(this.a, var1);
   }

   public void b(g var1) {
      g.a(var1).b();
      super.d(var1);
   }

   public g c(ViewGroup var1, int var2) {
      return new g(this.a(var2, var1));
   }

   // $FF: synthetic method
   public void c(ey var1) {
      this.a((g)var1);
   }

   List d() {
      return new ArrayList(this.a);
   }

   // $FF: synthetic method
   public void d(ey var1) {
      this.b((g)var1);
   }

   fi.polar.polarflow.ui.myday.item.c e(int var1) {
      fi.polar.polarflow.ui.myday.item.c var2;
      if (var1 < this.a.size() && var1 >= 0) {
         var2 = (fi.polar.polarflow.ui.myday.item.c)this.a.get(var1);
      } else {
         var2 = null;
      }

      return var2;
   }
}
