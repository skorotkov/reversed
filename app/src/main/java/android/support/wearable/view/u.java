package android.support.wearable.view;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

@Deprecated
@TargetApi(20)
public abstract class u extends aa {
   private static final z h = new v();
   private final FragmentManager d;
   private final Map e;
   private final Map f;
   private FragmentTransaction g;

   public u(FragmentManager var1) {
      this.d = var1;
      this.e = new HashMap();
      this.f = new HashMap();
   }

   private static String a(int var0, long var1) {
      return (new StringBuilder(49)).append("android:switcher:").append(var0).append(":").append(var1).toString();
   }

   public abstract Fragment a(int var1, int var2);

   public Fragment a(ViewGroup var1, int var2, int var3) {
      if (this.g == null) {
         this.g = this.d.beginTransaction();
      }

      long var4 = this.b(var2, var3);
      String var6 = a(var1.getId(), var4);
      Fragment var7 = this.d.findFragmentByTag(var6);
      Fragment var8;
      if (var7 == null) {
         var7 = this.a(var2, var3);
         this.g.add(var1.getId(), var7, var6);
         var8 = var7;
      } else {
         this.a(var7, this.g);
         var8 = var7;
      }

      Point var9 = new Point(var3, var2);
      this.f.put(var9, var6);
      this.e.put(var6, var9);
      if (var8 instanceof y) {
         ((y)var8).a(new w(this, var6, (v)null));
      }

      return var8;
   }

   protected void a(Fragment var1, FragmentTransaction var2) {
   }

   public void a(ViewGroup var1) {
      if (this.d.isDestroyed()) {
         this.g = null;
      } else if (this.g != null) {
         this.g.commitAllowingStateLoss();
         this.g = null;
         this.d.executePendingTransactions();
      }

   }

   public void a(ViewGroup var1, int var2, int var3, Object var4) {
      if (this.g == null) {
         this.g = this.d.beginTransaction();
      }

      Fragment var5 = (Fragment)var4;
      if (var5 instanceof y) {
         ((y)var5).a(h);
      }

      this.b(var5, this.g);
   }

   protected void a(Object var1, Point var2) {
      if (var2 != aa.c) {
         Fragment var3 = (Fragment)var1;
         if (var3.getTag().equals(this.f.get(var2))) {
            this.f.remove(var2);
         }

         if (var2 == aa.b) {
            this.e.remove(var3.getTag());
         } else {
            this.e.put(var3.getTag(), var2);
            this.f.put(var2, var3.getTag());
         }
      }

   }

   public boolean a(View var1, Object var2) {
      boolean var3;
      if (var1 == ((Fragment)var2).getView()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public long b(int var1, int var2) {
      return (long)('\uffff' * var2 + var1);
   }

   // $FF: synthetic method
   public Object b(ViewGroup var1, int var2, int var3) {
      return this.a(var1, var2, var3);
   }

   protected void b(Fragment var1, FragmentTransaction var2) {
      var2.remove(var1);
   }

   public final Drawable c(int var1, int var2) {
      String var3 = (String)this.f.get(new Point(var2, var1));
      Fragment var4 = this.d.findFragmentByTag(var3);
      Drawable var5 = a;
      if (var4 instanceof y) {
         var5 = ((y)var4).a();
      }

      return var5;
   }

   public Drawable d(int var1, int var2) {
      return this.c(var1, var2);
   }
}
