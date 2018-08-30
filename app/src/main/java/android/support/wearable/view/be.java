package android.support.wearable.view;

import android.support.v7.widget.ds;
import android.support.v7.widget.du;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import java.lang.ref.WeakReference;

class be extends du implements OnLayoutChangeListener {
   private WeakReference a;
   private ds b;
   private boolean c;
   private boolean d;

   private be() {
   }

   // $FF: synthetic method
   be(av var1) {
      this();
   }

   private void b() {
      if (this.b != null) {
         this.b.a((du)this);
         this.c = true;
      }

   }

   private void c() {
      this.e();
      if (this.c) {
         this.b.b((du)this);
         this.c = false;
      }

   }

   private void d() {
      au var1;
      if (this.a == null) {
         var1 = null;
      } else {
         var1 = (au)this.a.get();
      }

      if (!this.d && var1 != null) {
         var1.addOnLayoutChangeListener(this);
         this.d = true;
      }

   }

   private void e() {
      if (this.d) {
         au var1;
         if (this.a == null) {
            var1 = null;
         } else {
            var1 = (au)this.a.get();
         }

         if (var1 != null) {
            var1.removeOnLayoutChangeListener(this);
         }

         this.d = false;
      }

   }

   public void a() {
      this.d();
   }

   public void a(ds var1) {
      this.c();
      this.b = var1;
      this.b();
   }

   public void a(au var1) {
      this.e();
      this.a = new WeakReference(var1);
   }

   public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      au var10 = (au)this.a.get();
      if (var10 != null) {
         this.e();
         if (var10.getChildCount() > 0) {
            var10.A();
         }
      }

   }
}
