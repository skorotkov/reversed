package fi.polar.polarflow.ui.myday.sleep;

import android.content.Context;
import android.support.v7.widget.ey;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.ui.myday.sleep.a_package.i;
import java.util.ArrayList;
import java.util.List;

class b extends fi.polar.polarflow.ui.custom.c {
   private final List a;
   private final LayoutInflater b;

   public b(Context var1, List var2) {
      this.b = LayoutInflater.from(var1);
      this.a = new ArrayList(var2);
   }

   private View a(int var1, ViewGroup var2) {
      i var3 = (i)this.a.get(var1);
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

   public void a(c var1) {
      super.c(var1);
      c.a(var1).a(var1.a);
      c.a(var1).d();
   }

   public void a(ey var, int var2) {
      c var1 = (c)var;
      c.a(var1, (i)this.a.get(var2));
   }

   public void b(c var1) {
      c.a(var1).b();
      super.d(var1);
   }

   public c c(ViewGroup var1, int var2) {
      return new c(this.a(var2, var1));
   }

   // $FF: synthetic method
   public void c(ey var1) {
      this.a((c)var1);
   }

   // $FF: synthetic method
   public void d(ey var1) {
      this.b((c)var1);
   }
}
