package fi.polar.polarflow.ui.myday;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.DotsPageIndicator;
import android.support.wearable.view.bd;
import android.view.KeyEvent;
import fi.polar.polarflow.util.y;

public class MyDayGridPagerActivity extends Activity implements bd {
   private MyDayGridPager a;
   private k b;

   private void a(Fragment var1) {
      if (var1 != null) {
         FragmentTransaction var2 = this.getFragmentManager().beginTransaction();
         var2.detach(var1);
         var2.attach(var1);
         var2.commitAllowingStateLoss();
      }

   }

   private void a(String var1) {
      DialogFragment var2 = (DialogFragment)this.getFragmentManager().findFragmentByTag(var1);
      if (var2 != null) {
         var2.dismiss();
      }

   }

   private void b() {
      this.a = (MyDayGridPager)this.findViewById(2131755166);
      this.b = new k(this.getFragmentManager(), y.f(this));
      this.a.setAdapter(this.b);
      ((DotsPageIndicator)this.findViewById(2131755167)).setPager(this.a);
   }

   private boolean c() {
      boolean var1 = true;
      boolean var2 = var1;
      if (e.a.equals(this.b.e())) {
         fi.polar.polarflow.ui.myday.item.c var3 = this.a();
         var2 = var1;
         if (var3 != null) {
            var2 = var1;
            if (!var3.h()) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   private void d() {
      this.a.setTouchEnabled(this.c());
   }

   private h e() {
      return (h)this.b.b(e.a);
   }

   public fi.polar.polarflow.ui.myday.item.c a() {
      h var1 = this.e();
      fi.polar.polarflow.ui.myday.item.c var2;
      if (var1 != null) {
         var2 = var1.b();
      } else {
         var2 = null;
      }

      return var2;
   }

   public void a(int var1) {
      this.d();
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      switch(var1) {
      case 1:
      case 2:
      case 3:
         if (fi.polar.polarflow.ui.a.a(var3)) {
            this.setResult(-1, var3);
            this.finishAfterTransition();
         }
         break;
      default:
         fi.polar.polarflow.util.d.f("MyDayGridPagerActivity", "onActivityResult(): Unknown request code: " + var1);
      }

   }

   public void onAttachFragment(Fragment var1) {
      super.onAttachFragment(var1);
      if (this.b != null && var1 instanceof h) {
         this.d();
      }

   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968709);
      this.b();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      switch(var1) {
      case 262:
         fi.polar.polarflow.util.d.c("MyDayGridPagerActivity", "onKeyDown KEYCODE_NAVIGATE_IN");
         this.a().i();
         break;
      case 263:
         fi.polar.polarflow.util.d.c("MyDayGridPagerActivity", "onKeyDown KEYCODE_NAVIGATE_OUT");
         this.finishAfterTransition();
         this.overridePendingTransition(0, 2131034140);
         break;
      case 264:
      default:
         var3 = super.onKeyDown(var1, var2);
         break;
      case 265:
         fi.polar.polarflow.util.d.c("MyDayGridPagerActivity", "onKeyDown KEYCODE_POLAR_BUTTON");
         fi.polar.polarflow.ui.o.a((Context)this.getApplicationContext(), 30);
         this.setResult(-1, (new fi.polar.polarflow.ui.b()).a(true).a());
         this.finishAfterTransition();
         this.overridePendingTransition(0, 2131034140);
      }

      return var3;
   }

   protected void onRestart() {
      super.onRestart();
      fi.polar.polarflow.util.d.c("MyDayGridPagerActivity", "onRestart");
      this.a((Fragment)this.e());
      this.a("sleep_rating_dialog");
   }

   protected void onRestoreInstanceState(Bundle var1) {
      super.onRestoreInstanceState(var1);
      this.a.setTouchEnabled(var1.getBoolean("MyDayGridPagerActivity.extra.TOUCH_ENABLED_STATE", true));
   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      var1.putBoolean("MyDayGridPagerActivity.extra.TOUCH_ENABLED_STATE", this.a.c());
   }

   public void onStart() {
      super.onStart();
      this.a.scrollTo(0, 0);
   }
}
