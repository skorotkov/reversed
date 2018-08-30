package android.support.v4.c;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class d {
   int a;
   f b;
   e c;
   boolean d;
   boolean e;
   boolean f;
   boolean g;
   boolean h;

   public String a(Object var1) {
      StringBuilder var2 = new StringBuilder(64);
      android.support.v4.g.f.a(var1, var2);
      var2.append("}");
      return var2.toString();
   }

   public final void a() {
      this.d = true;
      this.f = false;
      this.e = false;
      this.b();
   }

   public void a(int var1, f var2) {
      if (this.b != null) {
         throw new IllegalStateException("There is already a listener registered");
      } else {
         this.b = var2;
         this.a = var1;
      }
   }

   public void a(e var1) {
      if (this.c != null) {
         throw new IllegalStateException("There is already a listener registered");
      } else {
         this.c = var1;
      }
   }

   public void a(f var1) {
      if (this.b == null) {
         throw new IllegalStateException("No listener register");
      } else if (this.b != var1) {
         throw new IllegalArgumentException("Attempting to unregister the wrong listener");
      } else {
         this.b = null;
      }
   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mId=");
      var3.print(this.a);
      var3.print(" mListener=");
      var3.println(this.b);
      if (this.d || this.g || this.h) {
         var3.print(var1);
         var3.print("mStarted=");
         var3.print(this.d);
         var3.print(" mContentChanged=");
         var3.print(this.g);
         var3.print(" mProcessingChange=");
         var3.println(this.h);
      }

      if (this.e || this.f) {
         var3.print(var1);
         var3.print("mAbandoned=");
         var3.print(this.e);
         var3.print(" mReset=");
         var3.println(this.f);
      }

   }

   protected void b() {
   }

   public void b(e var1) {
      if (this.c == null) {
         throw new IllegalStateException("No listener register");
      } else if (this.c != var1) {
         throw new IllegalArgumentException("Attempting to unregister the wrong listener");
      } else {
         this.c = null;
      }
   }

   public void c() {
      this.d = false;
      this.d();
   }

   protected void d() {
   }

   public void e() {
      this.f();
      this.f = true;
      this.d = false;
      this.e = false;
      this.g = false;
      this.h = false;
   }

   protected void f() {
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      android.support.v4.g.f.a(this, var1);
      var1.append(" id=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }
}
