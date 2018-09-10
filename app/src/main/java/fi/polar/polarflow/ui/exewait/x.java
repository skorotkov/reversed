package fi.polar.polarflow.ui.exewait;

import android.animation.Animator.AnimatorListener;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.wearable.view.au;
import android.support.wearable.view.bd;
import android.support.wearable.view.bg;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.FrameLayout.LayoutParams;

import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.ui.custom.GpsSensorView;
import fi.polar.polarflow.ui.custom.HrSensorView;
import fi.polar.polarflow.ui.custom.SensorToastView;
import fi.polar.polarflow.ui.custom.ai;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

import java.util.Iterator;
import java.util.List;

public class x extends a implements bd, bg, fi.polar.polarflow.ui.exewait.a_package.f {
   private final BroadcastReceiver A = new y(this);
   private final OnClickListener B = new ab(this);
   private View c;
   private View d;
   private GpsSensorView e;
   private HrSensorView f;
   private View g;
   private TextView h;
   private SensorToastView i;
   private AnimatorListener j;
   private au k;
   private List l;
   private TextView m;
   private int n = 2;
   private int o = 2;
   private int p = 0;
   private Handler q;
   private Runnable r;
   private int s;
   private int t;
   private int u;
   private int v;
   private int w;
   private boolean x = true;
   private android.support.v4.c.g y;
   private final IntentFilter z = new IntentFilter();

   public x() {
      super(fi.polar.polarflow.ui.exewait.o.a);
      this.z.addAction("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
      this.z.addAction("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED");
      this.z.addAction("fi.polar.polarflow.SENSOR_BIKE_STATE_CHANGED");
      this.z.addAction("fi.polar.polarflow.ACTION_HR_DATA");
   }

   private static int a(m_SENSOR_STATE var0, boolean var1) {
      byte var2;
      switch(ac.a[var0.ordinal()]) {
      case 1:
         if (var1) {
            var2 = 3;
         } else {
            var2 = 0;
         }
         break;
      case 2:
      case 3:
         var2 = 1;
         break;
      default:
         var2 = 2;
      }

      return var2;
   }

   private android.support.v4.c.g a(Context var1) {
      android.support.v4.c.g var2;
      if (this.y != null) {
         var2 = this.y;
      } else {
         var2 = android.support.v4.c.g.a(var1);
      }

      return var2;
   }

   private void a(long var1) {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "updateSportProfileFocus(" + var1 + ")");
      if (this.k != null && var1 != -2L) {
         this.p = 0;

         for(int var3 = 0; var3 < this.l.size(); ++var3) {
            if (((SportProfile)this.l.get(var3)).getSportId() == var1) {
               this.p = var3;
               break;
            }
         }

         this.k.c(this.p);
      }

   }

   private void a(Intent var1) {
      if ("fi.polar.polarflow.ACTION_HR_DATA".equals(var1.getAction())) {
         if (this.f != null) {
            this.f.a(var1);
         }
      } else {
         this.b(var1);
      }

   }

   private void a(View var1) {
      this.b(var1);
      this.m = (TextView)var1.findViewById(2131755154);
      this.d = var1.findViewById(2131755211);
      this.a.b().b(this.d);
      this.a.b().a(this.d);
      this.g = var1.findViewById(2131755208);
      this.h = (TextView)var1.findViewById(2131755209);
      this.g.setOnClickListener(this.B);
      this.k = (au)var1.findViewById(2131755173);
      this.k.setGreedyTouchMode(true);
      this.k.a((bg)this);
      this.k.setAdapter(new i(this.getContext(), this.l));
      this.k.a_(this.p);
   }

   // $FF: synthetic method
   static void a(x var0) {
      var0.k();
   }

   // $FF: synthetic method
   static void a(x var0, Intent var1) {
      var0.a(var1);
   }

   private void a(boolean var1, boolean var2) {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "updateSportProfilesList(" + var1 + ")");
      this.b(var2);
      if (!var1) {
         long var3;
         if (this.getActivity().getIntent() != null && this.getActivity().getIntent().hasExtra(SportProfile.KEY_SPORT_ID)) {
            var3 = this.getActivity().getIntent().getLongExtra(SportProfile.KEY_SPORT_ID, -2L);
         } else if (this.a.b().a()) {
            var3 = this.a.b().c();
         } else {
            var3 = -2L;
         }

         int var5;
         if (var3 != -2L) {
            for(var5 = 0; var5 < this.l.size(); ++var5) {
               if (((SportProfile)this.l.get(var5)).getSportId() == var3) {
                  this.p = var5;
                  break;
               }
            }
         } else {
            var3 = fi.polar.polarflow.util.u.a().i();
            this.p = 0;
            if (var3 != -1L) {
               for(var5 = 0; var5 < this.l.size(); ++var5) {
                  if (((SportProfile)this.l.get(var5)).getSportId() == var3) {
                     this.p = var5;
                     break;
                  }
               }
            }
         }

         if (this.k != null) {
            this.k.a_(this.p);
         }
      }

   }

   private boolean a(SportProfile var1) {
      boolean var2 = false;
      if (var1.getSport() == null) {
         fi.polar.polarflow.util.d.e("SportProfileFragment", "No Sport with sportId=" + var1.getSportId() + ", profile disabled");
      } else if (var1.getSport().getSportType() != 1 && var1.getSport().getSportType() != -1) {
         fi.polar.polarflow.util.d.e("SportProfileFragment", "Multi sport profile with sportId=" + var1.getSportId() + ", profile disabled");
      } else {
         var2 = true;
      }

      return var2;
   }

   private void b(Intent var1) {
      byte var2 = 0;
      m_SENSOR_STATE var3 = (m_SENSOR_STATE)var1.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE");
      boolean var4;
      if (var1.getStringExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS") != null) {
         var4 = true;
      } else {
         var4 = false;
      }

      String var5 = var1.getAction();
      fi.polar.polarflow.util.d.c("SportProfileFragment", var5 + ", state=" + var3);
      if ("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED".equals(var5) && var3 == m_SENSOR_STATE.d_READY && var4) {
         this.c(var1);
      }

      int var6;
      label40: {
         var6 = a(var3, var4);
         switch(var5.hashCode()) {
         case 444990681:
            if (var5.equals("fi.polar.polarflow.SENSOR_HR_STATE_CHANGED")) {
               var2 = 1;
               break label40;
            }
            break;
         case 690421316:
            if (var5.equals("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED")) {
               break label40;
            }
         }

         var2 = -1;
      }

      switch(var2) {
      case 0:
         this.n = var6;
         if (this.e != null) {
            this.e.setState(this.n);
         }
         break;
      case 1:
         this.o = var6;
         if (this.f != null) {
            this.f.setState(this.o);
         }
      }

   }

   private void b(View var1) {
      this.c = var1.findViewById(2131755202);
      this.e = (GpsSensorView)this.c.findViewById(2131755204);
      this.e.setState(this.n);
      this.f = (HrSensorView)this.c.findViewById(2131755203);
      this.f.setState(this.o);
      this.a.a().a(this.f, this.e);
   }

   // $FF: synthetic method
   static void b(x var0) {
      var0.h();
   }

   private void b(boolean var1) {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "updateSportProfiles(" + var1 + ")");
      if (var1) {
         this.l = SportProfile.listAllInOrder();
         SportProfile.setSport(this.l, Sport.listAll(Sport.class));
      }

      Iterator var2 = this.l.iterator();

      while(var2.hasNext()) {
         if (!this.a((SportProfile)var2.next())) {
            var2.remove();
         }
      }

      if (this.l.size() == 0) {
         fi.polar.polarflow.util.d.b("SportProfileFragment", "There are NO valid SportProfiles in database, reset defaults");
         this.l = fi.polar.polarflow.ftu.a.a(this.getContext());
      }

      fi.polar.polarflow.util.d.c("SportProfileFragment", "mSportProfiles: " + this.l.size());
      if (this.k != null) {
         ((i)this.k.getAdapter()).a(this.l);
      }

   }

   private void c(Intent var1) {
      String var2 = var1.getStringExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_MODEL_NUMBER");
      String var3 = var2;
      if (var2 == null) {
         var3 = var1.getStringExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_NAME");
      }

      if (var3 == null) {
         var3 = var1.getStringExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS");
      }

      if (this.i == null) {
         this.i = (SensorToastView)((ViewStub)this.getActivity().findViewById(2131755206)).inflate();
         this.i.a((AnimatorListener)(new z(this)));
         if (this.j != null) {
            this.i.a(this.j);
         }
      }

      this.f.setVisibility(4);
      this.i.setSensorName(var3);
      this.i.setVisibility(0);
      this.i.a();
   }

   private void f() {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "refreshViews");
      if (this.p >= this.l.size()) {
         this.p = 0;
      }

      this.g();
      this.h();
      if (this.getActivity() != null && this.getActivity().hasWindowFocus()) {
         this.l();
      }

      this.i();
   }

   private void g() {
      this.m.setText(((SportProfile)this.l.get(this.p)).getSport().getName());
      int var1 = this.m.getLineCount();
      LayoutParams var2 = (LayoutParams)this.m.getLayoutParams();
      if (var1 == 2) {
         var2.height = this.s;
         var2.bottomMargin = this.t;
      } else {
         var2.height = this.u;
         var2.bottomMargin = this.v;
      }

      this.m.setLayoutParams(var2);
   }

   private void h() {
      SportProfileSettings var1 = ((SportProfile)this.l.get(this.p)).getSettings();
      if (var1.isSensorEnabled(1) && !this.j()) {
         this.f.setVisibility(0);
      } else {
         this.f.setVisibility(4);
      }

      if (var1.isSensorEnabled(4)) {
         this.e.setVisibility(0);
      } else {
         this.e.setVisibility(4);
      }

   }

   private void i() {
      if (((SportProfile)this.l.get(this.p)).getSport().isSwimmingSport()) {
         this.g.setVisibility(0);
         int var1 = fi.polar.polarflow.util.u.a().j();
         int var2 = fi.polar.polarflow.util.u.a().k();
         this.h.setText(String.valueOf(var1));
         this.h.setTextScaleX(1.0F);
         this.h.setTextSize(0, (float)this.w);
         ai var3 = new ai(this.getContext(), this.h, var1, var2);
         var3.setDuration(2400L);
         this.h.clearAnimation();
         this.h.startAnimation(var3);
      } else {
         this.g.setVisibility(4);
      }

   }

   private boolean j() {
      boolean var1;
      if (this.i != null && this.i.getVisibility() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void k() {
      if (this.j()) {
         this.i.setVisibility(8);
      }

   }

   private void l() {
      this.f.a();
      this.e.a();
   }

   private void m() {
      this.f.b();
      this.e.b();
   }

   private void n() {
      if (!fi.polar.polarflow.util.u.a().h() && this.getActivity() != null && this.getActivity().hasWindowFocus() && this.b.c() > 1) {
         if (this.q == null) {
            this.q = new Handler();
            this.r = new aa(this);
         }

         this.o();
         this.q.postDelayed(this.r, 1000L);
      }

   }

   private void o() {
      if (this.q != null) {
         this.q.removeCallbacks(this.r);
      }

   }

   public void a(int var1) {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "onCentralPositionChanged: " + var1);
      this.p = var1;
      this.f();
   }

   public void a(boolean var1) {
      if (var1) {
         this.l();
         this.n();
      } else {
         this.m();
         this.o();
      }

   }

   protected void b() {
      long var1 = this.c();
      this.b(true);
      this.a(var1);
      this.f();
   }

   public void b(int var1) {
   }

   public long c() {
      return ((SportProfile)this.l.get(this.p)).getSportId();
   }

   public void c(int var1) {
   }

   public void d() {
      this.i();
   }

   public void d(int var1) {
      if (var1 == 0) {
         this.m.animate().setDuration(150L).alpha(1.0F).start();
         this.c.animate().setDuration(150L).alpha(1.0F).start();
         this.g.animate().setDuration(150L).alpha(1.0F).start();
         if (this.a.b().a()) {
            this.d.animate().setDuration(150L).alpha(1.0F).start();
         }

         this.a.a().a((SportProfile)this.l.get(this.p));
         this.n();
      } else {
         this.m.animate().setDuration(100L).alpha(0.0F).start();
         this.c.animate().setDuration(100L).alpha(0.0F).start();
         this.g.animate().setDuration(100L).alpha(0.0F).start();
         if (this.d.getAlpha() > 0.0F) {
            this.d.animate().setDuration(100L).alpha(0.0F).start();
         }

         this.a.a().d();
         this.o();
      }

   }

   void e() {
      if (!fi.polar.polarflow.util.u.a().h()) {
         fi.polar.polarflow.util.d.c("SportProfileFragment", "Column peek triggered");
         this.a(this.getContext()).a(new Intent("ExeWaitActivity.ACTION_COLUMN_PEEK"));
      }

   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.x = true;
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "onCreateView");
      return var1.inflate(2130968636, var2, false);
   }

   public void onDestroyView() {
      super.onDestroyView();
      this.i = null;
   }

   public void onPause() {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "onPause()");
      super.onPause();
      v_StickyLocalBroadcastManager.a_getInstance().a_unregisterReceiver(this.A);
      this.o();
   }

   public void onResume() {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "onResume()");
      super.onResume();
      v_StickyLocalBroadcastManager.a_getInstance().a_registerReceiver(this.A, this.z);
      Iterator var1 = v_StickyLocalBroadcastManager.a_getInstance().b_getFromMap("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED", "fi.polar.polarflow.SENSOR_HR_STATE_CHANGED").iterator();

      while(var1.hasNext()) {
         this.a((Intent)var1.next());
      }

      this.a.a().a((SportProfile)this.l.get(this.p));
   }

   public void onViewCreated(View var1, Bundle var2) {
      fi.polar.polarflow.util.d.c("SportProfileFragment", "onViewCreated()");
      super.onViewCreated(var1, var2);
      Resources var4 = this.getResources();
      this.s = var4.getDimensionPixelSize(2131361972);
      this.t = var4.getDimensionPixelSize(2131361971);
      this.u = var4.getDimensionPixelSize(2131361970);
      this.v = var4.getDimensionPixelSize(2131361969);
      this.w = var4.getDimensionPixelSize(2131361979);
      boolean var3;
      if (!this.x) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.a(var3, true);
      this.x = false;
      this.a(var1);
   }
}
