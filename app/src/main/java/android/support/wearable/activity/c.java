package android.support.wearable.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build.VERSION;
import com.google.android.wearable.compat.WearableActivityController;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@TargetApi(21)
public final class c {
   private static volatile boolean a;
   private WearableActivityController b;
   private final e c;

   public c(e var1) {
      this.c = var1;
   }

   // $FF: synthetic method
   static e a(c var0) {
      return var0.c;
   }

   private void b(Activity var1) {
      if (VERSION.SDK_INT > 21) {
         android.support.wearable.b.a.b();
         d var2 = new d(this);
         String var3 = String.valueOf(this.getClass().getSimpleName());
         if (var3.length() != 0) {
            var3 = "WearActivity[".concat(var3);
         } else {
            var3 = new String("WearActivity[");
         }

         this.b = new WearableActivityController(String.valueOf(var3.substring(0, Math.min(var3.length(), 22))).concat("]"), var1, var2);
         g();
      }

   }

   private static void g() {
      // $FF: Couldn't be decompiled
   }

   public void a() {
      if (this.b != null) {
         this.b.onResume();
      }

   }

   public void a(Activity var1) {
      this.b(var1);
      if (this.b != null) {
         this.b.onCreate();
      }

   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      if (this.b != null) {
         this.b.dump(var1, var2, var3, var4);
      }

   }

   public void b() {
      if (this.b != null) {
         this.b.onPause();
      }

   }

   public void c() {
      if (this.b != null) {
         this.b.onStop();
      }

   }

   public void d() {
      if (this.b != null) {
         this.b.onDestroy();
      }

   }

   public void e() {
      if (this.b != null) {
         this.b.setAmbientEnabled();
      }

   }

   public boolean f() {
      boolean var1;
      if (this.b != null) {
         var1 = this.b.isAmbient();
      } else {
         var1 = false;
      }

      return var1;
   }
}
