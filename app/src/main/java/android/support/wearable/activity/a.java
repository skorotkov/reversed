package android.support.wearable.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@TargetApi(21)
public abstract class a extends Activity {
   private boolean a;
   private final e b = new b(this);
   private final c c;

   public a() {
      this.c = new c(this.b);
   }

   // $FF: synthetic method
   static boolean a(a var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static boolean a(a var0, boolean var1) {
      var0.a = var1;
      return var1;
   }

   public void a(Bundle var1) {
      this.a = true;
   }

   public final boolean b() {
      return this.c.f();
   }

   public void c() {
      this.a = true;
   }

   public void d() {
      this.a = true;
   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      this.c.a(var1, var2, var3, var4);
   }

   public final void f_() {
      this.c.e();
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.c.a((Activity)this);
   }

   protected void onDestroy() {
      this.c.d();
      super.onDestroy();
   }

   protected void onPause() {
      this.c.b();
      super.onPause();
   }

   protected void onResume() {
      super.onResume();
      this.c.a();
   }

   protected void onStop() {
      this.c.c();
      super.onStop();
   }
}
