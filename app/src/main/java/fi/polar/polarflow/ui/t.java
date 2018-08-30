package fi.polar.polarflow.ui;

import android.os.Bundle;
import fi.polar.polarflow.ui.exeview.an;

public class t {
   private String a;
   private String b;
   private boolean c;
   private boolean d;

   public q a() {
      q var1 = new q();
      Bundle var2 = new Bundle();
      var2.putString("title", this.a);
      var2.putString("message", this.b);
      var2.putBoolean("polar_button_enabled", true);
      var2.putBoolean("swipeToDismiss", this.d);
      var2.putBoolean("keepScreenOn", this.c);
      var1.setArguments(var2);
      return var1;
   }

   public t a(String var1) {
      this.a = var1;
      return this;
   }

   public t a(boolean var1) {
      this.c = var1;
      return this;
   }

   public an b() {
      an var1 = new an();
      Bundle var2 = new Bundle();
      var2.putString("title", this.a);
      var2.putString("message", this.b);
      var2.putBoolean("polar_button_enabled", true);
      var2.putBoolean("swipeToDismiss", this.d);
      var2.putBoolean("keepScreenOn", this.c);
      var1.setArguments(var2);
      return var1;
   }

   public t b(String var1) {
      this.b = var1;
      return this;
   }

   public t b(boolean var1) {
      this.d = var1;
      return this;
   }

   public v c() {
      v var1 = new v();
      Bundle var2 = new Bundle();
      var2.putString("title", this.a);
      var2.putString("message", this.b);
      var2.putBoolean("polar_button_enabled", true);
      var2.putBoolean("swipeToDismiss", this.d);
      var2.putBoolean("keepScreenOn", this.c);
      var1.setArguments(var2);
      return var1;
   }
}
