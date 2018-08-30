package fi.polar.polarflow.ui.exeview.target;

import android.content.Context;
import android.support.v7.widget.ey;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import java.util.Iterator;
import java.util.List;

public class i extends fi.polar.polarflow.ui.custom.c {
   private static final String a = i.class.getSimpleName();
   private final List b;
   private final LayoutInflater c;

   public i(Context var1, List var2) {
      this.c = LayoutInflater.from(var1);
      this.b = var2;
   }

   private j d(ViewGroup var1, int var2) {
      fi.polar.polarflow.ui.exeview.target.a.n var3 = this.f(var2);
      View var4 = this.c.inflate(var3.a(), var1, false);
      Iterator var5 = var3.g().iterator();

      while(var5.hasNext()) {
         ah var6 = (ah)var5.next();
         View var7 = this.c.inflate(var6.a(), (ViewGroup)var4, false);
         var7.setTag(var6.k());
         ((ViewGroup)var4).addView(var7);
      }

      j var8 = new j(var4);
      j.a(var8, var3);
      return var8;
   }

   private fi.polar.polarflow.ui.exeview.target.a.n f(int var1) {
      Iterator var2 = this.b.iterator();

      fi.polar.polarflow.ui.exeview.target.a.n var3;
      do {
         if (!var2.hasNext()) {
            var3 = null;
            break;
         }

         var3 = (fi.polar.polarflow.ui.exeview.target.a.n)var2.next();
      } while(var3.f().ordinal() != var1);

      if (var3 == null) {
         fi.polar.polarflow.util.d.f(a, "Item with with type " + var1 + " not found on list!");
      }

      return var3;
   }

   public int a() {
      return this.b.size();
   }

   public int a(int var1) {
      return ((fi.polar.polarflow.ui.exeview.target.a.n)this.b.get(var1)).f().ordinal();
   }

   // $FF: synthetic method
   public ey a(ViewGroup var1, int var2) {
      return this.c(var1, var2);
   }

   public void a(int var1, fi.polar.polarflow.ui.exeview.target.a.n var2) {
      if (var1 < this.b.size()) {
         this.b.set(var1, var2);
         this.c();
      }

   }

   public void a(j var1) {
      super.c(var1);
      if (j.a(var1) != null) {
         j.a(var1).a((View)var1.a);
         j.a(var1).d();
      }

   }

   public void a(j var1, int var2) {
      j.a(var1, (fi.polar.polarflow.ui.exeview.target.a.n)this.b.get(var2));
   }

   public void b(j var1) {
      super.d(var1);
      if (j.a(var1) != null) {
         j.a(var1).b();
      }

   }

   public j c(ViewGroup var1, int var2) {
      return this.d(var1, var2);
   }

   // $FF: synthetic method
   public void c(ey var1) {
      this.a((j)var1);
   }

   // $FF: synthetic method
   public void d(ey var1) {
      this.b((j)var1);
   }

   public void e(int var1) {
      if (var1 < this.b.size()) {
         this.b.remove(var1);
         this.d(var1);
         this.a(var1, this.a());
      }

   }
}
