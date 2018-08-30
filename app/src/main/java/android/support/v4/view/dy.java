package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import java.lang.ref.WeakReference;

public final class dy {
   static final eh d;
   Runnable a = null;
   Runnable b = null;
   int c = -1;
   private WeakReference e;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 21) {
         d = new eg();
      } else if (var0 >= 19) {
         d = new ef();
      } else if (var0 >= 18) {
         d = new ed();
      } else if (var0 >= 16) {
         d = new ee();
      } else if (var0 >= 14) {
         d = new eb();
      } else {
         d = new dz();
      }

   }

   dy(View var1) {
      this.e = new WeakReference(var1);
   }

   public dy a(float var1) {
      View var2 = (View)this.e.get();
      if (var2 != null) {
         d.a(this, var2, var1);
      }

      return this;
   }

   public dy a(long var1) {
      View var3 = (View)this.e.get();
      if (var3 != null) {
         d.a(this, var3, var1);
      }

      return this;
   }

   public dy a(em var1) {
      View var2 = (View)this.e.get();
      if (var2 != null) {
         d.a(this, var2, var1);
      }

      return this;
   }

   public void a() {
      View var1 = (View)this.e.get();
      if (var1 != null) {
         d.a(this, var1);
      }

   }

   public dy b(float var1) {
      View var2 = (View)this.e.get();
      if (var2 != null) {
         d.b(this, var2, var1);
      }

      return this;
   }

   public void b() {
      View var1 = (View)this.e.get();
      if (var1 != null) {
         d.b(this, var1);
      }

   }

   public dy c(float var1) {
      View var2 = (View)this.e.get();
      if (var2 != null) {
         d.c(this, var2, var1);
      }

      return this;
   }
}
