package fi.polar.polarflow.ui.exeview.laps;

import android.content.Context;
import android.support.v7.widget.ey;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

final class g extends fi.polar.polarflow.ui.custom.c {
   private final Context a;
   private final LayoutInflater b;
   private final boolean c;
   private List d;

   g(Context var1, List var2, boolean var3) {
      this.a = var1;
      this.b = LayoutInflater.from(this.a);
      this.d = var2;
      this.c = var3;
   }

   private h d(ViewGroup var1, int var2) {
      d var3 = (d)this.d.get(var2);
      View var5;
      if (this.c) {
         var5 = var3.a(this.b, var1);
      } else {
         ContextThemeWrapper var4;
         if (var2 == 0) {
            var4 = new ContextThemeWrapper(this.a, 2131427629);
         } else {
            var4 = new ContextThemeWrapper(this.a, 2131427631);
         }

         var5 = var3.a(this.b.cloneInContext(var4), var1);
      }

      return new h(var5);
   }

   public int a() {
      return this.d.size();
   }

   public int a(int var1) {
      return var1;
   }

   // $FF: synthetic method
   public ey a(ViewGroup var1, int var2) {
      return this.c(var1, var2);
   }

   public void a(d var1) {
      this.d.add(1, var1);
      this.c(1);
      if (this.d.size() > 20) {
         this.d.remove(20);
         this.d(20);
      }

   }

   public void a(h var1) {
      super.c(var1);
      h.a(var1).a(var1.a);
      h.a(var1).d();
   }

   public void a(h var1, int var2) {
      h.a(var1, (d)this.d.get(var2));
   }

   void a(List var1) {
      if (this.d != null) {
         ((d)this.d.get(0)).b();
      }

      this.d = var1;
      this.c();
   }

   public void b(h var1) {
      h.a(var1).b();
      super.d(var1);
   }

   public h c(ViewGroup var1, int var2) {
      return this.d(var1, var2);
   }

   // $FF: synthetic method
   public void c(ey var1) {
      this.a((h)var1);
   }

   // $FF: synthetic method
   public void d(ey var1) {
      this.b((h)var1);
   }
}
