package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.support.v7.widget.em;
import android.support.v7.widget.ev;
import android.support.wearable.view.bd;
import android.support.wearable.view.bg;
import java.util.Iterator;

class d extends WearableLinearLayoutManager {
   // $FF: synthetic field
   final BetterWearableListView a;
   private int b;
   private final Runnable c;
   private boolean d;

   d(BetterWearableListView var1, Context var2) {
      super(var2);
      this.a = var1;
      this.b = -1;
      this.d = true;
      this.c = new e(this, var1);
   }

   // $FF: synthetic method
   static void a(d var0, boolean var1) {
      var0.f(var1);
   }

   // $FF: synthetic method
   static void b(d var0, boolean var1) {
      var0.g(var1);
   }

   private void f(boolean var1) {
      this.d = var1;
   }

   private void g(boolean var1) {
      int var2 = this.y();
      if (var2 != 0) {
         int var3 = this.S();
         int var4 = this.a.q(this.i(var3)).e();
         if (var4 != this.b) {
            for(int var5 = 0; var5 < var2; ++var5) {
               g var6 = this.a.q(this.i(var5));
               if (var6 != null) {
                  var6 = (g)var6;
                  boolean var7;
                  if (var5 == var3) {
                     var7 = true;
                  } else {
                     var7 = false;
                  }

                  var6.a(var7, var1);
               }
            }

            Iterator var8 = BetterWearableListView.d(this.a).iterator();

            while(var8.hasNext()) {
               ((bg)var8.next()).a(var4);
            }

            var8 = BetterWearableListView.e(this.a).iterator();

            while(var8.hasNext()) {
               ((bd)var8.next()).a(var4);
            }

            this.b = var4;
         }
      }

   }

   public int b(int var1, em var2, ev var3) {
      byte var4 = 0;
      int var5;
      if (var1 <= 0 || this.i(this.y() - 1) == null) {
         var5 = var4;
         if (var1 >= 0) {
            return var5;
         }

         var5 = var4;
         if (this.i(0) == null) {
            return var5;
         }
      }

      var5 = super.b(var1, var2, var3);
      this.g(true);
      return var5;
   }

   public void c(em var1, ev var2) {
      super.c(var1, var2);
      if (BetterWearableListView.b(this.a) == -1) {
         BetterWearableListView.b(this.a, this.R());
      }

      this.a.post(this.c);
   }

   public boolean e() {
      return this.d;
   }
}
