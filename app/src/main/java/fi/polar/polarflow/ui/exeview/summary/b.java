package fi.polar.polarflow.ui.exeview.summary;

import android.content.Context;
import android.support.v7.widget.ds;
import android.support.v7.widget.ey;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b extends ds {
   private final List a;
   private final LayoutInflater b;

   public b(Context var1, List var2) {
      this.b = LayoutInflater.from(var1);
      this.a = new ArrayList(var2);
   }

   private View a(int var1, ViewGroup var2) {
      fi.polar.polarflow.ui.exeview.summary.a_package.d var3 = (fi.polar.polarflow.ui.exeview.summary.a_package.d)this.a.get(var1);
      View var6 = this.b.inflate(var3.a(), var2, false);
      Iterator var4 = var3.f().iterator();

      while(var4.hasNext()) {
         ah var7 = (ah)var4.next();
         View var5 = this.b.inflate(var7.a(), (ViewGroup)var6, false);
         var5.setTag(var7.k());
         ((ViewGroup)var6).addView(var5);
      }

      return var6;
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
      c.b(var1).a((View)var1.a);
      c.b(var1).d();
   }

   public void a(ey var, int var2) {
      c var1 = (c)var;
      c.a(var1, (fi.polar.polarflow.ui.exeview.summary.a_package.d)this.a.get(var2));
      if (c.a(var1) != null) {
         String var3 = ((fi.polar.polarflow.ui.exeview.summary.a_package.d)this.a.get(var2)).g();
         if (TextUtils.isEmpty(var3)) {
            c.a(var1).setVisibility(8);
         } else {
            c.a(var1).setText(var3);
         }
      }

   }

   void a(List var1) {
      if (!this.a.isEmpty()) {
         Iterator var2 = this.a.iterator();

         while(var2.hasNext()) {
            ((fi.polar.polarflow.ui.exeview.summary.a_package.d)var2.next()).b();
         }
      }

      this.a.clear();
      this.a.addAll(var1);
      this.c();
   }

   public void b(c var1) {
      c.b(var1).b();
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
