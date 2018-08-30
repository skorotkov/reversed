package fi.polar.polarflow.ui.exeview.a;

import android.content.Context;
import android.support.v7.widget.ey;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

public final class c extends fi.polar.polarflow.ui.custom.c {
   private final List a;
   private final LayoutInflater b;

   public c(Context var1, List var2) {
      this.b = LayoutInflater.from(var1);
      this.a = var2;
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

   public void a(d var1) {
      super.c(var1);
      d.a(var1).a(var1.a);
      d.a(var1).d();
   }

   public void a(d var1, int var2) {
      d.a(var1, (a)this.a.get(var2));
   }

   public void b(d var1) {
      d.a(var1).b();
      super.d(var1);
   }

   public d c(ViewGroup var1, int var2) {
      return new d(e.a(this.b, var1, (a)this.a.get(var2)));
   }

   // $FF: synthetic method
   public void c(ey var1) {
      this.a((d)var1);
   }

   // $FF: synthetic method
   public void d(ey var1) {
      this.b((d)var1);
   }
}
