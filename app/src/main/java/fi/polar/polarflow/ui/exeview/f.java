package fi.polar.polarflow.ui.exeview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

class f {
   private Context a;
   private boolean b = false;
   private boolean c = false;
   private boolean d = false;
   private final Handler e = new Handler();
   private final Runnable f = new g(this);

   // $FF: synthetic method
   static void a(f var0, boolean var1) {
      var0.b(var1);
   }

   private void b(boolean var1) {
      if (this.b) {
         if (var1) {
            fi.polar.polarflow.ui.o.c(this.a, "fi.polar.polarflow.action.ADD_MANUAL_LAP");
         } else {
            fi.polar.polarflow.ui.o.b(this.a, "fi.polar.polarflow.action.ADD_MANUAL_LAP");
         }
      }

   }

   void a() {
      if (this.c || this.d) {
         this.e.removeCallbacks(this.f);
         this.b(true);
      }

      this.c = false;
   }

   void a(int var1) {
      this.e.removeCallbacks(this.f);
      if (var1 == 0) {
         this.c = true;
      }

   }

   void a(Activity var1, boolean var2) {
      boolean var3 = true;
      Intent var4 = var1.getIntent();
      boolean var5;
      if (var4 != null && var4.getBooleanExtra("fi.polar.polarflow.extra.STARTED_FROM_POLAR_BUTTON", false)) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var4 == null || !"StartActivity".equals(var4.getStringExtra("fi.polar.polarflow.extra.SENDER_CLASS_SIMPLE_NAME"))) {
         var3 = false;
      }

      this.d = var3;
      this.a = var1.getApplicationContext();
      this.b = var2;
      if (var4 != null && this.d && var5) {
         this.e.postDelayed(this.f, 500L);
      }

   }

   void a(Intent var1) {
      boolean var2 = true;
      boolean var3;
      if (var1 != null && var1.getBooleanExtra("fi.polar.polarflow.extra.STARTED_FROM_POLAR_BUTTON", false)) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (var1 == null || !"StartActivity".equals(var1.getStringExtra("fi.polar.polarflow.extra.SENDER_CLASS_SIMPLE_NAME"))) {
         var2 = false;
      }

      this.d = var2;
      if (this.d && var3) {
         this.e.postDelayed(this.f, 500L);
      }

   }

   void a(boolean var1) {
      this.b = var1;
   }
}
