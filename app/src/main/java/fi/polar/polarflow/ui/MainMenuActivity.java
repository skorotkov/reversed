package fi.polar.polarflow.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.view.au;
import android.support.wearable.view.bg;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.service.datalayer.SyncJournalingService;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.exewait.ExeWaitActivity;
import fi.polar.polarflow.ui.myday.MyDayGridPagerActivity;
import fi.polar.polarflow.ui.myheartrate.MyHeartRateActivity;

public class MainMenuActivity extends Activity implements bg {
   private static final String a = MainMenuActivity.class.getSimpleName();
   private boolean b = true;
   private int c;
   private int d;
   private int e;
   private TextView f;
   private Menu g;
   private final Handler h = new Handler();
   private final Runnable i = new d(this);

   private Menu a(Context var1) {
      Menu var3;
      try {
         var3 = (Menu)Class.forName("com.android.internal.view.menu.MenuBuilder").getDeclaredConstructor(Context.class).newInstance(var1);
      } catch (Exception var2) {
         fi.polar.polarflow.util.d.c(a, "", var2);
         var3 = null;
      }

      return var3;
   }

   private void a() {
      this.startService(new Intent(this, SyncJournalingService.class));
   }

   private void a(Intent var1) {
      if (var1 != null) {
         if (var1.hasExtra(fi.polar.polarflow.ui.myday.item.e.c)) {
            var1 = new Intent(var1);
            var1.putExtra("fi.polar.polarflow.extra.SENDER_CLASS_SIMPLE_NAME", a);
            this.a(ExeWaitActivity.class, var1);
         } else if (var1.hasExtra("MyDayFragment.extra.SCROLL_TO_MY_DAY_ITEM")) {
            this.a(MyDayGridPagerActivity.class, new Intent(var1));
         }
      }

   }

   // $FF: synthetic method
   static void a(MainMenuActivity var0) {
      var0.c();
   }

   private void a(Class var1) {
      this.startActivity(new Intent(this, var1));
   }

   private void a(Class var1, int var2) {
      this.a(var1, (Bundle)null, var2);
   }

   private void a(Class var1, Intent var2) {
      var2.setClass(this, var1);
      this.startActivity(var2);
   }

   private void a(Class var1, Bundle var2, int var3) {
      Intent var4 = new Intent(this, var1);
      if (var2 != null) {
         var4.putExtras(var2);
      }

      var4.setFlags(131072);
      this.startActivityForResult(var4, var3);
   }

   private void b() {
      this.g = this.a((Context)this);
      this.getMenuInflater().inflate(2131886080, this.g);
      if (this.g != null && fi.polar.polarflow.util.y.f(this)) {
         this.g.removeItem(2131755551);
      }

      au var1 = (au)this.findViewById(2131755173);
      var1.setAdapter(new e(this, this.g));
      var1.a(this);
      this.f = (TextView)this.findViewById(2131755154);
   }

   private void c() {
      this.c__$appendSource();
      this.c__$appendPatch();
   }

   private void c__$appendPatch() {
      this.f.setText(this.getString(2131231004, new Object[]{"2.3.1-beep"}));
   }

   private void c__$appendSource() {
      this.c |= 4;
      this.f.setText(this.getString(2131231004, new Object[]{"2.3.1"}));
      this.f.setAlpha(1.0F);
   }

   private void e(int var1) {
      if (var1 == 2131755548) {
         this.a(ExeWaitActivity.class);
      } else if (var1 == 2131755549) {
         this.a(MyDayGridPagerActivity.class, 1);
      } else if (var1 == 2131755551) {
         this.a(SyncActivity.class, 2);
      } else if (var1 == 2131755550) {
         Bundle var2 = new Bundle();
         var2.putBoolean("tap_to_exit", false);
         var2.putBoolean("polar_button_to_exit", true);
         var2.putBoolean("is_ambient_enabled", true);
         var2.putInt("measurement_timeout", -1);
         this.a(MyHeartRateActivity.class, var2, 3);
      }

   }

   public void a(int var1) {
      this.f.setText(this.g.getItem(var1).getTitle());
      byte var2;
      if (var1 == this.g.size() - 1) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      this.c = var2;
      this.e = var1;
   }

   protected void a(boolean var1) {
      BetterWearableListView var2 = (BetterWearableListView)this.findViewById(2131755173);
      if (var2 != null) {
         if (var1) {
            var2.c(0);
         } else {
            var2.a_(0);
         }
      }

   }

   public void b(int var1) {
      if (this.c > 2) {
         this.d += var1;
         if (this.d > 25) {
            if ((this.c & 4) != 4 && !this.h.hasMessages(0)) {
               this.h.removeCallbacks(this.i);
               this.h.postDelayed(this.i, 2000L);
            }
         } else if (this.h.hasMessages(0)) {
            this.h.removeCallbacks(this.i);
         }
      }

   }

   public void c(int var1) {
   }

   public void d(int var1) {
      if (var1 != 0) {
         if (var1 == 1 && this.c > 0) {
            this.c |= 2;
            this.d = 0;
         }

         this.f.animate().setDuration(100L).alpha(0.0F).start();
      } else {
         this.c &= -3;
         this.h.removeCallbacks(this.i);
         if (this.c > 4) {
            this.a(this.g.size() - 1);
         }

         this.f.animate().setDuration(150L).alpha(1.0F).start();
      }

   }

   public void mainMenuOnClick(View var1) {
      int var2 = (Integer)var1.getTag();
      if (fi.polar.polarflow.util.r.a.f()) {
         fi.polar.polarflow.util.d.e(a, "onClick not reacted to (journaling ongoing)");
      } else {
         this.e(var2);
      }

   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      fi.polar.polarflow.util.d.c(a, "onActivityResult requestCode:" + var1 + ", resultCode:" + var2);
      switch(var1) {
      case 1:
      case 2:
      case 3:
         if (fi.polar.polarflow.ui.a.a(var3)) {
            this.a(false);
         }
         break;
      default:
         fi.polar.polarflow.util.d.f(a, "onActivityResult(): Unknown request code: " + var1);
      }

   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968702);
      this.b();
      this.a(this.getIntent());
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      fi.polar.polarflow.util.d.c(a, "onKeyDown " + KeyEvent.keyCodeToString(var1));
      boolean var4;
      switch(var1) {
      case 262:
         this.e(this.g.getItem(this.e).getItemId());
         var4 = var3;
         break;
      case 263:
         this.finish();
         var4 = var3;
         break;
      case 264:
      default:
         var4 = super.onKeyDown(var1, var2);
         break;
      case 265:
         var4 = var3;
         if (this.b) {
            this.b = false;
            o.a((Context)this.getApplicationContext(), 30);
            this.a(true);
            this.a(ExeWaitActivity.class);
            var4 = var3;
         }
      }

      return var4;
   }

   public boolean onKeyLongPress(int var1, KeyEvent var2) {
      fi.polar.polarflow.util.d.c(a, "onKeyLongPress " + KeyEvent.keyCodeToString(var1));
      return super.onKeyLongPress(var1, var2);
   }

   public boolean onKeyUp(int var1, KeyEvent var2) {
      boolean var3 = true;
      fi.polar.polarflow.util.d.c(a, "onKeyUp keyCode: " + KeyEvent.keyCodeToString(var1) + " event:" + var2.getAction());
      if (var1 == 265) {
         this.b = true;
      } else {
         var3 = super.onKeyUp(var1, var2);
      }

      return var3;
   }

   public void onNewIntent(Intent var1) {
      super.onNewIntent(var1);
      this.a(var1);
   }

   protected void onRestart() {
      super.onRestart();
      fi.polar.polarflow.util.d.c(a, "onRestart");
      this.a(false);
   }

   protected void onStart() {
      super.onStart();
      if (fi.polar.polarflow.util.r.a.g()) {
         this.a();
      }

   }
}
