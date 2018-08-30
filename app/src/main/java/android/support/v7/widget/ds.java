package android.support.v7.widget;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

public abstract class ds {
   private final dt a = new dt();
   private boolean b = false;

   public abstract int a();

   public int a(int var1) {
      return 0;
   }

   public abstract ey a(ViewGroup var1, int var2);

   public final void a(int var1, int var2) {
      this.a.a(var1, var2);
   }

   public void a(dl var1) {
   }

   public void a(du var1) {
      this.a.registerObserver(var1);
   }

   public void a(ey var1) {
   }

   public abstract void a(ey var1, int var2);

   public void a(ey var1, int var2, List var3) {
      this.a(var1, var2);
   }

   public long b(int var1) {
      return -1L;
   }

   public final ey b(ViewGroup var1, int var2) {
      android.support.v4.f.i.a("RV CreateView");
      ey var3 = this.a(var1, var2);
      var3.f = var2;
      android.support.v4.f.i.a();
      return var3;
   }

   public void b(dl var1) {
   }

   public void b(du var1) {
      this.a.unregisterObserver(var1);
   }

   public final void b(ey var1, int var2) {
      var1.c = var2;
      if (this.b()) {
         var1.e = this.b(var2);
      }

      var1.a(1, 519);
      android.support.v4.f.i.a("RV OnBindView");
      this.a(var1, var2, var1.v());
      var1.u();
      LayoutParams var3 = var1.a.getLayoutParams();
      if (var3 instanceof ef) {
         ((ef)var3).e = true;
      }

      android.support.v4.f.i.a();
   }

   public final boolean b() {
      return this.b;
   }

   public boolean b(ey var1) {
      return false;
   }

   public final void c() {
      this.a.a();
   }

   public final void c(int var1) {
      this.a.b(var1, 1);
   }

   public void c(ey var1) {
   }

   public final void d(int var1) {
      this.a.c(var1, 1);
   }

   public void d(ey var1) {
   }
}
