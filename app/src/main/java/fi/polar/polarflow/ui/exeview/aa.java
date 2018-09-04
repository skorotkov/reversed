package fi.polar.polarflow.ui.exeview;

import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.Point;
import android.util.SparseArray;
import android.view.ViewGroup;
import fi.polar.polarflow.data.orm.SportProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aa extends android.support.wearable.view.u {
   private static final String d = aa.class.getSimpleName();
   private static final Map i;
   private int e = -1;
   private final SparseArray f = new SparseArray();
   private final SparseArray g = new SparseArray();
   private final SportProfile h;
   private List j;

   static {
      HashMap var0 = new HashMap();
      var0.put(ak.a, ab.class);
      var0.put(ak.b, fi.polar.polarflow.ui.exeview.a_package.b.class);
      var0.put(ak.c, fi.polar.polarflow.ui.exeview.target.g.class);
      var0.put(ak.d, fi.polar.polarflow.ui.exeview.laps.b_package.b.class);
      var0.put(ak.e, fi.polar.polarflow.ui.exeview.laps.a_package.a.class);
      var0.put(ak.f, fi.polar.polarflow.ui.exeview.summary.d.class);
      i = Collections.unmodifiableMap(var0);
   }

   public aa(FragmentManager var1, List var2, SportProfile var3) {
      super(var1);
      this.j = var2;
      this.h = var3;
   }

   private static a c(ak var0) {
      Class var3 = (Class)i.get(var0);
      a var5;
      if (var3 != null) {
         Object var4;
         try {
            var5 = (a)var3.newInstance();
            return var5;
         } catch (InstantiationException var1) {
            var4 = var1;
         } catch (IllegalAccessException var2) {
            var4 = var2;
         }

         fi.polar.polarflow.util.d.c(d, "", (Throwable)var4);
      }

      var5 = null;
      return var5;
   }

   public int a() {
      return 1;
   }

   public int a(int var1) {
      return this.j.size();
   }

   public Fragment a(int var1, int var2) {
      a var3 = (a)this.g.get(var2);
      if (var3 != null) {
         this.g.delete(var2);
      } else {
         var3 = c((ak)this.j.get(var2));
         var3.a(this.h);
      }

      return var3;
   }

   public Fragment a(ViewGroup var1, int var2, int var3) {
      Fragment var4 = super.a(var1, var2, var3);
      this.f.put(var3, (a)var4);
      return var4;
   }

   public Fragment a(ak var1) {
      Class var4 = (Class)i.get(var1);
      Fragment var5;
      if (var4 != null) {
         int var2 = this.f.size();

         for(int var3 = 0; var3 < var2; ++var3) {
            if (((a)this.f.valueAt(var3)).getClass().isAssignableFrom(var4)) {
               var5 = (Fragment)this.f.valueAt(var3);
               return var5;
            }
         }
      }

      var5 = null;
      return var5;
   }

   public Point a(Object var1) {
      a var4 = (a)var1;
      int var2 = this.j.indexOf(var4.e());
      int var3 = this.f.indexOfValue(var4);
      Point var5;
      if (var3 != -1 && var2 != -1) {
         if (var2 == this.f.keyAt(var3)) {
            var5 = android.support.wearable.view.aa.c;
         } else {
            var5 = new Point(var2, 0);
         }
      } else {
         var5 = android.support.wearable.view.aa.b;
      }

      return var5;
   }

   public void a(ViewGroup var1, int var2, int var3, Object var4) {
      this.g.put(var3, (a)var4);
      if (var4.equals(this.f.get(var3))) {
         this.f.delete(var3);
      }

      super.a(var1, var2, var3, var4);
   }

   protected void a(Object var1, Point var2) {
      super.a(var1, var2);
      if (var2 != android.support.wearable.view.aa.c) {
         a var4 = (a)var1;
         int var3 = this.f.indexOfValue(var4);
         if (var3 != -1) {
            if (this.f.keyAt(var3) != var2.x) {
               this.f.removeAt(var3);
            }

            if (var2 != android.support.wearable.view.aa.b) {
               this.f.put(var2.x, var4);
            }
         }
      }

   }

   void a(List var1) {
      this.j = var1;
      this.b();
   }

   int b(ak var1) {
      return this.j.indexOf(var1);
   }

   public long b(int var1, int var2) {
      long var3;
      if (this.j != null && !this.j.isEmpty()) {
         var3 = (long)((ak)this.j.get(var2)).ordinal();
      } else {
         var3 = -1L;
      }

      return var3;
   }

   // $FF: synthetic method
   public Object b(ViewGroup var1, int var2, int var3) {
      return this.a(var1, var2, var3);
   }

   Fragment c(int var1) {
      return (Fragment)this.f.get(var1);
   }

   List c() {
      int var1 = this.f.size();
      ArrayList var2 = new ArrayList(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         var2.add(this.f.valueAt(var3));
      }

      return var2;
   }

   a d() {
      return (a)this.f.get(this.e);
   }

   public ak e() {
      a var1 = this.d();
      ak var2;
      if (var1 != null) {
         var2 = var1.e();
      } else {
         var2 = null;
      }

      return var2;
   }

   public void f(int var1, int var2) {
      super.f(var1, var2);
      this.e = var2;
   }
}
