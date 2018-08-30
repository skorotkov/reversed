package fi.polar.polarflow.ui.custom;

import android.app.Fragment;
import android.app.FragmentManager;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public abstract class p extends android.support.wearable.view.u {
   private final SparseArray d = new SparseArray();
   private final List e;
   private int f;

   protected p(FragmentManager var1, List var2) {
      super(var1);
      this.e = new ArrayList(var2);
      this.f = -1;
   }

   private al a(Class var1) {
      al var5;
      if (var1 != null) {
         Object var4;
         try {
            var5 = (al)var1.newInstance();
            return var5;
         } catch (InstantiationException var2) {
            var4 = var2;
         } catch (IllegalAccessException var3) {
            var4 = var3;
         }

         fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "", (Throwable)var4);
      }

      var5 = null;
      return var5;
   }

   public int a() {
      return 1;
   }

   public int a(int var1) {
      return this.e.size();
   }

   public final Fragment a(int var1, int var2) {
      return this.a(this.a((Enum)this.e.get(var2)));
   }

   public Fragment a(ViewGroup var1, int var2, int var3) {
      Fragment var4 = super.a(var1, var2, var3);
      this.d.put(var3, (al)var4);
      return var4;
   }

   protected abstract Class a(Enum var1);

   public void a(ViewGroup var1, int var2, int var3, Object var4) {
      this.d.delete(var3);
      super.a(var1, var2, var3, var4);
   }

   public void a(List var1) {
      this.e.clear();
      this.e.addAll(var1);
      this.b();
   }

   public al b(Enum var1) {
      int var2 = 0;

      al var3;
      while(true) {
         if (var2 >= this.d.size()) {
            var3 = null;
            break;
         }

         if (var1.equals(((al)this.d.valueAt(var2)).a())) {
            var3 = (al)this.d.valueAt(var2);
            break;
         }

         ++var2;
      }

      return var3;
   }

   // $FF: synthetic method
   public Object b(ViewGroup var1, int var2, int var3) {
      return this.a(var1, var2, var3);
   }

   public int c(Enum var1) {
      return this.e.indexOf(var1);
   }

   public al c(int var1) {
      return (al)this.d.get(var1);
   }

   public List c() {
      int var1 = this.d.size();
      ArrayList var2 = new ArrayList(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         var2.add(this.d.valueAt(var3));
      }

      return var2;
   }

   public al d() {
      return (al)this.d.get(this.f);
   }

   public Enum e() {
      al var1 = this.d();
      Enum var2;
      if (var1 != null) {
         var2 = var1.a();
      } else {
         var2 = null;
      }

      return var2;
   }

   public List f() {
      return new ArrayList(this.e);
   }

   public void f(int var1, int var2) {
      super.f(var1, var2);
      this.f = var2;
   }
}
