package fi.polar.polarflow.ui.exeview;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import java.util.Collection;
import java.util.HashMap;

public abstract class a extends Fragment implements h {
   protected BetterWearableListView a = null;
   protected fi.polar.polarflow.util.v b;
   protected final ak c;
   protected boolean d;
   private final c e = new c();
   private final HashMap f = new HashMap();
   private SportProfile g = null;
   private final BroadcastReceiver h = new b(this);

   protected a(ak var1) {
      this.c = var1;
      this.b = fi.polar.polarflow.util.v.a();
   }

   // $FF: synthetic method
   static c a(a var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static HashMap b(a var0) {
      return var0.f;
   }

   public void a() {
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "onUpdateAmbient: ");
      this.a((Collection)this.f.values());
      this.f.clear();
   }

   protected abstract void a(Intent var1);

   public void a(SportProfile var1) {
      this.g = var1;
   }

   protected abstract void a(c var1);

   public boolean a(KeyEvent var1) {
      boolean var3;
      if (this.a != null && var1.getAction() == 0) {
         int var2 = var1.getKeyCode();
         if (var2 == 261 || var2 == 260) {
            this.a.onKeyDown(var2, var1);
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   public void a_(Bundle var1) {
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "onEnterAmbient: ");
      this.d = true;
      this.f.clear();
   }

   public void c() {
   }

   public final boolean d() {
      return this.d;
   }

   public void d_() {
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "onExitAmbient: ");
      this.d = false;
      this.f.clear();
   }

   public ak e() {
      return this.c;
   }

   protected SportProfile f() {
      return this.g;
   }

   public boolean g() {
      boolean var1;
      if (this.a != null && this.a.getTopItemPosition() != 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void onCreate(Bundle var1) {
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "onCreate: savedInstanceState " + var1);
      super.onCreate(var1);
      if (var1 != null) {
         this.g = (SportProfile)var1.getParcelable("sportProfile");
      }

      this.a(this.e);
   }

   public void onPause() {
      super.onPause();
      android.support.v4.c.g.a(this.getActivity()).a(this.h);
   }

   public void onResume() {
      super.onResume();
      if (this.e.countActions() > 0) {
         android.support.v4.c.g.a(this.getActivity()).a(this.h, this.e);
      }

   }

   public void onSaveInstanceState(Bundle var1) {
      var1.putParcelable("sportProfile", this.g);
      super.onSaveInstanceState(var1);
   }

   public void onViewStateRestored(Bundle var1) {
      super.onViewStateRestored(var1);
      boolean var2 = ((android.support.wearable.activity.a)this.getActivity()).b();
      if (var2 && !this.d()) {
         this.a_((Bundle)null);
      } else if (this.d() && !var2) {
         this.d_();
      }

   }

   public void setUserVisibleHint(boolean var1) {
      super.setUserVisibleHint(var1);
      fi.polar.polarflow.util.d.c(this.getClass().getSimpleName(), "setUserVisibleHint(" + var1 + ")");
      if (var1) {
         this.c();
      }

   }
}
