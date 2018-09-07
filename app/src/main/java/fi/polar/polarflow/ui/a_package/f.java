package fi.polar.polarflow.ui.a_package;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.view.View;
import java.util.List;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

public abstract class f implements ah {
   private boolean a;
   protected v_StickyLocalBroadcastManager b;

   private v_StickyLocalBroadcastManager e() {
      if (this.b == null) {
         this.b = v_StickyLocalBroadcastManager.a_getInstance();
      }

      return this.b;
   }

   public Intent a(String var1) {
      return this.e().a_registerReceiver((BroadcastReceiver)null, (String)var1);
   }

   protected List a(String... var1) {
      return this.e().b_getFromMap(var1);
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
