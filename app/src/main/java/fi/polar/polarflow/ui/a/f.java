package fi.polar.polarflow.ui.a;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.view.View;
import java.util.List;

public abstract class f implements ah {
   private boolean a;
   protected fi.polar.polarflow.util.v b;

   private fi.polar.polarflow.util.v e() {
      if (this.b == null) {
         this.b = fi.polar.polarflow.util.v.a();
      }

      return this.b;
   }

   public Intent a(String var1) {
      return this.e().a((BroadcastReceiver)null, (String)var1);
   }

   protected List a(String... var1) {
      return this.e().b(var1);
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      this.a = true;
   }

   public void b() {
      this.a = false;
   }

   protected boolean c() {
      return this.a;
   }

   public void d() {
   }
}
