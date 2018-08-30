package android.support.v4.b;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class bm extends bk {
   static boolean a = false;
   final android.support.v4.g.u b = new android.support.v4.g.u();
   final android.support.v4.g.u c = new android.support.v4.g.u();
   final String d;
   boolean e;
   boolean f;
   ad g;

   bm(String var1, ad var2, boolean var3) {
      this.d = var1;
      this.g = var2;
      this.e = var3;
   }

   void a(ad var1) {
      this.g = var1;
   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      byte var5 = 0;
      String var6;
      int var7;
      bn var8;
      if (this.b.b() > 0) {
         var3.print(var1);
         var3.println("Active Loaders:");
         var6 = var1 + "    ";

         for(var7 = 0; var7 < this.b.b(); ++var7) {
            var8 = (bn)this.b.e(var7);
            var3.print(var1);
            var3.print("  #");
            var3.print(this.b.d(var7));
            var3.print(": ");
            var3.println(var8.toString());
            var8.a(var6, var2, var3, var4);
         }
      }

      if (this.c.b() > 0) {
         var3.print(var1);
         var3.println("Inactive Loaders:");
         var6 = var1 + "    ";

         for(var7 = var5; var7 < this.c.b(); ++var7) {
            var8 = (bn)this.c.e(var7);
            var3.print(var1);
            var3.print("  #");
            var3.print(this.c.d(var7));
            var3.print(": ");
            var3.println(var8.toString());
            var8.a(var6, var2, var3, var4);
         }
      }

   }

   public boolean a() {
      int var1 = this.b.b();
      int var2 = 0;

      boolean var3;
      for(var3 = false; var2 < var1; ++var2) {
         bn var4 = (bn)this.b.e(var2);
         boolean var5;
         if (var4.h && !var4.f) {
            var5 = true;
         } else {
            var5 = false;
         }

         var3 |= var5;
      }

      return var3;
   }

   void b() {
      if (a) {
         Log.v("LoaderManager", "Starting in " + this);
      }

      if (this.e) {
         RuntimeException var1 = new RuntimeException("here");
         var1.fillInStackTrace();
         Log.w("LoaderManager", "Called doStart when already started: " + this, var1);
      } else {
         this.e = true;

         for(int var2 = this.b.b() - 1; var2 >= 0; --var2) {
            ((bn)this.b.e(var2)).a();
         }
      }

   }

   void c() {
      if (a) {
         Log.v("LoaderManager", "Stopping in " + this);
      }

      if (!this.e) {
         RuntimeException var1 = new RuntimeException("here");
         var1.fillInStackTrace();
         Log.w("LoaderManager", "Called doStop when not started: " + this, var1);
      } else {
         for(int var2 = this.b.b() - 1; var2 >= 0; --var2) {
            ((bn)this.b.e(var2)).e();
         }

         this.e = false;
      }

   }

   void d() {
      if (a) {
         Log.v("LoaderManager", "Retaining in " + this);
      }

      if (!this.e) {
         RuntimeException var1 = new RuntimeException("here");
         var1.fillInStackTrace();
         Log.w("LoaderManager", "Called doRetain when not started: " + this, var1);
      } else {
         this.f = true;
         this.e = false;

         for(int var2 = this.b.b() - 1; var2 >= 0; --var2) {
            ((bn)this.b.e(var2)).b();
         }
      }

   }

   void e() {
      if (this.f) {
         if (a) {
            Log.v("LoaderManager", "Finished Retaining in " + this);
         }

         this.f = false;

         for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
            ((bn)this.b.e(var1)).c();
         }
      }

   }

   void f() {
      for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
         ((bn)this.b.e(var1)).k = true;
      }

   }

   void g() {
      for(int var1 = this.b.b() - 1; var1 >= 0; --var1) {
         ((bn)this.b.e(var1)).d();
      }

   }

   void h() {
      int var1;
      if (!this.f) {
         if (a) {
            Log.v("LoaderManager", "Destroying Active in " + this);
         }

         for(var1 = this.b.b() - 1; var1 >= 0; --var1) {
            ((bn)this.b.e(var1)).f();
         }

         this.b.c();
      }

      if (a) {
         Log.v("LoaderManager", "Destroying Inactive in " + this);
      }

      for(var1 = this.c.b() - 1; var1 >= 0; --var1) {
         ((bn)this.c.e(var1)).f();
      }

      this.c.c();
      this.g = null;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("LoaderManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      android.support.v4.g.f.a(this.g, var1);
      var1.append("}}");
      return var1.toString();
   }
}
