package android.support.v4.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class x extends n implements c, e {
   final Handler c = new y(this);
   final ac d = ac.a((ad)(new z(this)));
   boolean e;
   boolean f;
   boolean g = true;
   boolean h = true;
   boolean i;
   boolean j;
   boolean k;
   int l;
   android.support.v4.g.u m;

   private static String a(View param0) {
      // $FF: Couldn't be decompiled
   }

   private void a(String var1, PrintWriter var2, View var3) {
      var2.print(var1);
      if (var3 == null) {
         var2.println("null");
      } else {
         var2.println(a(var3));
         if (var3 instanceof ViewGroup) {
            ViewGroup var6 = (ViewGroup)var3;
            int var4 = var6.getChildCount();
            if (var4 > 0) {
               var1 = var1 + "  ";

               for(int var5 = 0; var5 < var4; ++var5) {
                  this.a(var1, var2, var6.getChildAt(var5));
               }
            }
         }
      }

   }

   private int b(p var1) {
      if (this.m.b() >= 65534) {
         throw new IllegalStateException("Too many pending Fragment activity results.");
      } else {
         while(this.m.f(this.l) >= 0) {
            this.l = (this.l + 1) % '\ufffe';
         }

         int var2 = this.l;
         this.m.b(var2, var1.o);
         this.l = (this.l + 1) % '\ufffe';
         return var2;
      }
   }

   final View a(View var1, String var2, Context var3, AttributeSet var4) {
      return this.d.a(var1, var2, var3, var4);
   }

   protected void a() {
      this.d.h();
   }

   public final void a(int var1) {
      if (!this.k && var1 != -1) {
         b(var1);
      }

   }

   public void a(p var1) {
   }

   public void a(p param1, Intent param2, int param3, Bundle param4) {
      // $FF: Couldn't be decompiled
   }

   public void a(p param1, IntentSender param2, int param3, Intent param4, int param5, int param6, int param7, Bundle param8) {
      // $FF: Couldn't be decompiled
   }

   void a(p var1, String[] var2, int var3) {
      if (var3 == -1) {
         android.support.v4.b.a.a(this, var2, var3);
      } else {
         b(var3);

         try {
            this.k = true;
            android.support.v4.b.a.a(this, var2, (this.b(var1) + 1 << 16) + ('\uffff' & var3));
         } finally {
            this.k = false;
         }
      }

   }

   void a(boolean var1) {
      if (!this.h) {
         this.h = true;
         this.i = var1;
         this.c.removeMessages(1);
         this.d();
      } else if (var1) {
         this.d.o();
         this.d.c(true);
      }

   }

   protected boolean a(View var1, Menu var2) {
      return super.onPreparePanel(0, var1, var2);
   }

   public Object b() {
      return null;
   }

   public void c() {
      if (VERSION.SDK_INT >= 11) {
         android.support.v4.b.f.a(this);
      } else {
         this.j = true;
      }

   }

   void d() {
      this.d.c(this.i);
      this.d.k();
   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      if (VERSION.SDK_INT >= 11) {
      }

      var3.print(var1);
      var3.print("Local FragmentActivity ");
      var3.print(Integer.toHexString(System.identityHashCode(this)));
      var3.println(" State:");
      String var5 = var1 + "  ";
      var3.print(var5);
      var3.print("mCreated=");
      var3.print(this.e);
      var3.print("mResumed=");
      var3.print(this.f);
      var3.print(" mStopped=");
      var3.print(this.g);
      var3.print(" mReallyStopped=");
      var3.println(this.h);
      this.d.a(var5, var2, var3, var4);
      this.d.a().a(var1, var2, var3, var4);
      var3.print(var1);
      var3.println("View Hierarchy:");
      this.a(var1 + "  ", var3, this.getWindow().getDecorView());
   }

   public ae e() {
      return this.d.a();
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      this.d.b();
      int var4 = var1 >> 16;
      if (var4 != 0) {
         --var4;
         String var5 = (String)this.m.a(var4);
         this.m.c(var4);
         if (var5 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
         } else {
            p var6 = this.d.a(var5);
            if (var6 == null) {
               Log.w("FragmentActivity", "Activity result no fragment exists for who: " + var5);
            } else {
               var6.onActivityResult('\uffff' & var1, var2, var3);
            }
         }
      } else {
         super.onActivityResult(var1, var2, var3);
      }

   }

   public void onBackPressed() {
      if (!this.d.a().b()) {
         super.onBackPressed();
      }

   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.d.a(var1);
   }

   protected void onCreate(Bundle var1) {
      this.d.a((p)null);
      super.onCreate(var1);
      aa var2 = (aa)this.getLastNonConfigurationInstance();
      if (var2 != null) {
         this.d.a(var2.c);
      }

      if (var1 != null) {
         Parcelable var3 = var1.getParcelable("android:support:fragments");
         ac var4 = this.d;
         aq var7;
         if (var2 != null) {
            var7 = var2.b;
         } else {
            var7 = null;
         }

         var4.a(var3, var7);
         if (var1.containsKey("android:support:next_request_index")) {
            this.l = var1.getInt("android:support:next_request_index");
            int[] var8 = var1.getIntArray("android:support:request_indicies");
            String[] var6 = var1.getStringArray("android:support:request_fragment_who");
            if (var8 != null && var6 != null && var8.length == var6.length) {
               this.m = new android.support.v4.g.u(var8.length);

               for(int var5 = 0; var5 < var8.length; ++var5) {
                  this.m.b(var8[var5], var6[var5]);
               }
            } else {
               Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
            }
         }
      }

      if (this.m == null) {
         this.m = new android.support.v4.g.u();
         this.l = 0;
      }

      this.d.e();
   }

   public boolean onCreatePanelMenu(int var1, Menu var2) {
      boolean var3;
      if (var1 == 0) {
         var3 = super.onCreatePanelMenu(var1, var2) | this.d.a(var2, this.getMenuInflater());
         if (VERSION.SDK_INT < 11) {
            var3 = true;
         }
      } else {
         var3 = super.onCreatePanelMenu(var1, var2);
      }

      return var3;
   }

   protected void onDestroy() {
      super.onDestroy();
      this.a(false);
      this.d.l();
      this.d.p();
   }

   public void onLowMemory() {
      super.onLowMemory();
      this.d.m();
   }

   public boolean onMenuItemSelected(int var1, MenuItem var2) {
      boolean var3;
      if (super.onMenuItemSelected(var1, var2)) {
         var3 = true;
      } else {
         switch(var1) {
         case 0:
            var3 = this.d.a(var2);
            break;
         case 6:
            var3 = this.d.b(var2);
            break;
         default:
            var3 = false;
         }
      }

      return var3;
   }

   public void onMultiWindowModeChanged(boolean var1) {
      this.d.a(var1);
   }

   protected void onNewIntent(Intent var1) {
      super.onNewIntent(var1);
      this.d.b();
   }

   public void onPanelClosed(int var1, Menu var2) {
      switch(var1) {
      case 0:
         this.d.b(var2);
      default:
         super.onPanelClosed(var1, var2);
      }
   }

   protected void onPause() {
      super.onPause();
      this.f = false;
      if (this.c.hasMessages(2)) {
         this.c.removeMessages(2);
         this.a();
      }

      this.d.i();
   }

   public void onPictureInPictureModeChanged(boolean var1) {
      this.d.b(var1);
   }

   protected void onPostResume() {
      super.onPostResume();
      this.c.removeMessages(2);
      this.a();
      this.d.n();
   }

   public boolean onPreparePanel(int var1, View var2, Menu var3) {
      boolean var4;
      if (var1 == 0 && var3 != null) {
         if (this.j) {
            this.j = false;
            var3.clear();
            this.onCreatePanelMenu(var1, var3);
         }

         var4 = this.a(var2, var3) | this.d.a(var3);
      } else {
         var4 = super.onPreparePanel(var1, var2, var3);
      }

      return var4;
   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      int var4 = var1 >> 16 & '\uffff';
      if (var4 != 0) {
         --var4;
         String var5 = (String)this.m.a(var4);
         this.m.c(var4);
         if (var5 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
         } else {
            p var6 = this.d.a(var5);
            if (var6 == null) {
               Log.w("FragmentActivity", "Activity result no fragment exists for who: " + var5);
            } else {
               var6.onRequestPermissionsResult(var1 & '\uffff', var2, var3);
            }
         }
      }

   }

   protected void onResume() {
      super.onResume();
      this.c.sendEmptyMessage(2);
      this.f = true;
      this.d.n();
   }

   public final Object onRetainNonConfigurationInstance() {
      if (this.g) {
         this.a(true);
      }

      Object var1 = this.b();
      aq var2 = this.d.d();
      android.support.v4.g.t var3 = this.d.r();
      aa var4;
      if (var2 == null && var3 == null && var1 == null) {
         var4 = null;
      } else {
         var4 = new aa();
         var4.a = var1;
         var4.b = var2;
         var4.c = var3;
      }

      return var4;
   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      Parcelable var2 = this.d.c();
      if (var2 != null) {
         var1.putParcelable("android:support:fragments", var2);
      }

      if (this.m.b() > 0) {
         var1.putInt("android:support:next_request_index", this.l);
         int[] var5 = new int[this.m.b()];
         String[] var3 = new String[this.m.b()];

         for(int var4 = 0; var4 < this.m.b(); ++var4) {
            var5[var4] = this.m.d(var4);
            var3[var4] = (String)this.m.e(var4);
         }

         var1.putIntArray("android:support:request_indicies", var5);
         var1.putStringArray("android:support:request_fragment_who", var3);
      }

   }

   protected void onStart() {
      super.onStart();
      this.g = false;
      this.h = false;
      this.c.removeMessages(1);
      if (!this.e) {
         this.e = true;
         this.d.f();
      }

      this.d.b();
      this.d.n();
      this.d.o();
      this.d.g();
      this.d.q();
   }

   public void onStateNotSaved() {
      this.d.b();
   }

   protected void onStop() {
      super.onStop();
      this.g = true;
      this.c.sendEmptyMessage(1);
      this.d.j();
   }

   public void startActivityForResult(Intent var1, int var2) {
      if (!this.b && var2 != -1) {
         b(var2);
      }

      super.startActivityForResult(var1, var2);
   }
}
