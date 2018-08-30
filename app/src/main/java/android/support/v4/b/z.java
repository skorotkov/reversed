package android.support.v4.b;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class z extends ad {
   // $FF: synthetic field
   final x a;

   public z(x var1) {
      super(var1);
      this.a = var1;
   }

   public View a(int var1) {
      return this.a.findViewById(var1);
   }

   public void a(p var1, Intent var2, int var3, Bundle var4) {
      this.a.a(var1, var2, var3, var4);
   }

   public void a(p var1, IntentSender var2, int var3, Intent var4, int var5, int var6, int var7, Bundle var8) {
      this.a.a(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void a(p var1, String[] var2, int var3) {
      this.a.a(var1, var2, var3);
   }

   @SuppressLint({"NewApi"})
   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      this.a.dump(var1, var2, var3, var4);
   }

   public boolean a() {
      Window var1 = this.a.getWindow();
      boolean var2;
      if (var1 != null && var1.peekDecorView() != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean a(p var1) {
      boolean var2;
      if (!this.a.isFinishing()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean a(String var1) {
      return android.support.v4.b.a.a(this.a, var1);
   }

   public LayoutInflater b() {
      return this.a.getLayoutInflater().cloneInContext(this.a);
   }

   public void b(p var1) {
      this.a.a(var1);
   }

   public x c() {
      return this.a;
   }

   public void d() {
      this.a.c();
   }

   public boolean e() {
      boolean var1;
      if (this.a.getWindow() != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int f() {
      Window var1 = this.a.getWindow();
      int var2;
      if (var1 == null) {
         var2 = 0;
      } else {
         var2 = var1.getAttributes().windowAnimations;
      }

      return var2;
   }

   // $FF: synthetic method
   public Object g() {
      return this.c();
   }
}
