package android.support.v4.b;

import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class bn implements android.support.v4.c.e, android.support.v4.c.f {
   final int a;
   final Bundle b;
   bl c;
   android.support.v4.c.d d;
   boolean e;
   boolean f;
   Object g;
   boolean h;
   boolean i;
   boolean j;
   boolean k;
   boolean l;
   boolean m;
   bn n;
   // $FF: synthetic field
   final bm o;

   void a() {
      if (this.i && this.j) {
         this.h = true;
      } else if (!this.h) {
         this.h = true;
         if (bm.a) {
            Log.v("LoaderManager", "  Starting: " + this);
         }

         if (this.d == null && this.c != null) {
            this.d = this.c.a(this.a, this.b);
         }

         if (this.d != null) {
            if (this.d.getClass().isMemberClass() && !Modifier.isStatic(this.d.getClass().getModifiers())) {
               throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
            }

            if (!this.m) {
               this.d.a(this.a, this);
               this.d.a((android.support.v4.c.e)this);
               this.m = true;
            }

            this.d.a();
         }
      }

   }

   void a(android.support.v4.c.d var1, Object var2) {
      if (this.c != null) {
         String var3;
         if (this.o.g != null) {
            var3 = this.o.g.d.u;
            this.o.g.d.u = "onLoadFinished";
         } else {
            var3 = null;
         }

         try {
            if (bm.a) {
               StringBuilder var4 = new StringBuilder();
               Log.v("LoaderManager", var4.append("  onLoadFinished in ").append(var1).append(": ").append(var1.a(var2)).toString());
            }

            this.c.a(var1, var2);
         } finally {
            if (this.o.g != null) {
               this.o.g.d.u = var3;
            }

         }

         this.f = true;
      }

   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mId=");
      var3.print(this.a);
      var3.print(" mArgs=");
      var3.println(this.b);
      var3.print(var1);
      var3.print("mCallbacks=");
      var3.println(this.c);
      var3.print(var1);
      var3.print("mLoader=");
      var3.println(this.d);
      if (this.d != null) {
         this.d.a(var1 + "  ", var2, var3, var4);
      }

      if (this.e || this.f) {
         var3.print(var1);
         var3.print("mHaveData=");
         var3.print(this.e);
         var3.print("  mDeliveredData=");
         var3.println(this.f);
         var3.print(var1);
         var3.print("mData=");
         var3.println(this.g);
      }

      var3.print(var1);
      var3.print("mStarted=");
      var3.print(this.h);
      var3.print(" mReportNextStart=");
      var3.print(this.k);
      var3.print(" mDestroyed=");
      var3.println(this.l);
      var3.print(var1);
      var3.print("mRetaining=");
      var3.print(this.i);
      var3.print(" mRetainingStarted=");
      var3.print(this.j);
      var3.print(" mListenerRegistered=");
      var3.println(this.m);
      if (this.n != null) {
         var3.print(var1);
         var3.println("Pending Loader ");
         var3.print(this.n);
         var3.println(":");
         this.n.a(var1 + "  ", var2, var3, var4);
      }

   }

   void b() {
      if (bm.a) {
         Log.v("LoaderManager", "  Retaining: " + this);
      }

      this.i = true;
      this.j = this.h;
      this.h = false;
      this.c = null;
   }

   void c() {
      if (this.i) {
         if (bm.a) {
            Log.v("LoaderManager", "  Finished Retaining: " + this);
         }

         this.i = false;
         if (this.h != this.j && !this.h) {
            this.e();
         }
      }

      if (this.h && this.e && !this.k) {
         this.a(this.d, this.g);
      }

   }

   void d() {
      if (this.h && this.k) {
         this.k = false;
         if (this.e && !this.i) {
            this.a(this.d, this.g);
         }
      }

   }

   void e() {
      if (bm.a) {
         Log.v("LoaderManager", "  Stopping: " + this);
      }

      this.h = false;
      if (!this.i && this.d != null && this.m) {
         this.m = false;
         this.d.a((android.support.v4.c.f)this);
         this.d.b(this);
         this.d.c();
      }

   }

   void f() {
      if (bm.a) {
         Log.v("LoaderManager", "  Destroying: " + this);
      }

      this.l = true;
      boolean var1 = this.f;
      this.f = false;
      if (this.c != null && this.d != null && this.e && var1) {
         if (bm.a) {
            Log.v("LoaderManager", "  Resetting: " + this);
         }

         String var2;
         if (this.o.g != null) {
            var2 = this.o.g.d.u;
            this.o.g.d.u = "onLoaderReset";
         } else {
            var2 = null;
         }

         try {
            this.c.a(this.d);
         } finally {
            if (this.o.g != null) {
               this.o.g.d.u = var2;
            }

         }
      }

      this.c = null;
      this.g = null;
      this.e = false;
      if (this.d != null) {
         if (this.m) {
            this.m = false;
            this.d.a((android.support.v4.c.f)this);
            this.d.b(this);
         }

         this.d.e();
      }

      if (this.n != null) {
         this.n.f();
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append("LoaderInfo{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" #");
      var1.append(this.a);
      var1.append(" : ");
      android.support.v4.g.f.a(this.d, var1);
      var1.append("}}");
      return var1.toString();
   }
}
