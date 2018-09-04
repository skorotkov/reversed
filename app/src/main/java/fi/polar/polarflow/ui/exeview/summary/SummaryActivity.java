package fi.polar.polarflow.ui.exeview.summary;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExerciseStatistics;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.SwimmingStatistics;
import fi.polar.polarflow.data.orm.SwimmingStyleStatistics;
import fi.polar.polarflow.data.orm.TrainingSession;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.MainMenuActivity;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.ui.custom.BetterWearableListView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SummaryActivity extends Activity {
   public static final String a;
   public static final String b;
   public static final String c;
   private static final String d = SummaryActivity.class.getSimpleName();
   private List e;
   private b f;
   private long g = 0L;
   private boolean h;
   private long i;
   private final BroadcastReceiver j = new a(this);

   static {
      a = d + ".start_time";
      b = d + ".launch_after_training";
      c = d + ".summary_bundle";
   }

   private static int a(Exercise var0) {
      SwimmingStatistics var1 = SwimmingStatistics.findByPath(var0.getPath());
      int var2;
      if (var1 == null) {
         fi.polar.polarflow.util.d.f(d, "No swimming statistics match with path: " + var0.getPath());
         var2 = -1;
      } else {
         var2 = var1.getSwimmingPoolUnit();
      }

      return var2;
   }

   // $FF: synthetic method
   static long a(SummaryActivity var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static String a() {
      return d;
   }

   private static String a(SportProfile var0) {
      Sport var1 = var0.getSport();
      String var2;
      if (var1 != null) {
         var2 = var1.getMediumName();
      } else {
         var2 = null;
      }

      return var2;
   }

   private static String a(TrainingSession var0, SportProfile var1, Exercise var2) {
      Object var3 = null;
      String var4 = b(var0);
      String var5 = var4;
      if (TextUtils.isEmpty(var4)) {
         if (var1 != null) {
            var5 = a(var1);
         } else {
            var5 = null;
         }
      }

      String var6 = var5;
      if (TextUtils.isEmpty(var5)) {
         if (var2 != null) {
            var6 = b(var2);
         } else {
            var6 = null;
         }
      }

      if (TextUtils.isEmpty(var6)) {
         var6 = (String)var3;
         if (var0 != null) {
            var6 = var0.getSessionName();
         }
      }

      return var6;
   }

   private void a(Bundle var1) {
      byte var2 = -1;
      SportProfile var3 = SportProfile.getSportProfileBySportId(var1.getLong(ah.B, -1L), false);
      SportProfileSettings var6;
      if (var3 != null) {
         var6 = var3.getSettings();
      } else {
         var6 = null;
      }

      String var4 = ah.x;
      int var5;
      if (var6 != null) {
         var5 = var6.getHeartRateView();
      } else {
         var5 = -1;
      }

      var1.putInt(var4, var5);
      var4 = ah.A;
      var5 = var2;
      if (var6 != null) {
         var5 = var6.getSpeedViewType();
      }

      var1.putInt(var4, var5);
      this.a(var1, var6);
   }

   private void a(Bundle var1, SportProfileSettings var2) {
      this.e = fi.polar.polarflow.ui.exeview.summary.h.a((SportProfileSettings)var2, this, var1);
      if (this.f == null) {
         this.f = new b(this, this.e);
         ((BetterWearableListView)this.findViewById(2131755173)).setAdapter(this.f);
      } else {
         this.f.a(this.e);
      }

   }

   private void a(TrainingSession var1) {
      String var2 = null;
      float var3 = -1.0F;
      byte var4 = -1;
      Bundle var5 = new Bundle();
      Exercise var6 = (Exercise)var1.getTrainingSessionExerciseList().get(0);
      SportProfile var7 = SportProfile.getSportProfileBySportId(var6.getSport(), false);
      SportProfileSettings var8;
      if (var7 != null) {
         var8 = var7.getSettings();
      } else {
         var8 = null;
      }

      ExerciseStatistics var9 = var6.getExerciseStatistics();
      var5.putLong(ah.B, var6.getSport());
      var5.putLong(ah.o, var1.getStartTime());
      var5.putString(ah.p, a(var1, var7, var6));
      var5.putLong(ah.q, var1.getDuration());
      var5.putFloat(ah.r, var1.getDistance());
      var5.putInt(ah.u, var1.getCalories());
      String var12 = ah.v;
      int var10;
      if (var9 != null) {
         var10 = var9.getAverageHeartrate();
      } else {
         var10 = -1;
      }

      var5.putInt(var12, var10);
      var12 = ah.w;
      if (var9 != null) {
         var10 = var9.getMaximumHeartrate();
      } else {
         var10 = -1;
      }

      var5.putInt(var12, var10);
      var12 = ah.y;
      float var11;
      if (var9 != null) {
         var11 = var9.getAverageSpeed();
      } else {
         var11 = -1.0F;
      }

      var5.putFloat(var12, var11);
      var12 = ah.z;
      var11 = var3;
      if (var9 != null) {
         var11 = var9.getMaximumSpeed();
      }

      var5.putFloat(var12, var11);
      var12 = ah.C;
      if (var9 != null) {
         var2 = var9.getPath();
      }

      var5.putString(var12, var2);
      var2 = ah.x;
      if (var8 != null) {
         var10 = var8.getHeartRateView();
      } else {
         var10 = -1;
      }

      var5.putInt(var2, var10);
      var2 = ah.A;
      if (var8 != null) {
         var10 = var8.getSpeedViewType();
      } else {
         var10 = -1;
      }

      var5.putInt(var2, var10);
      var5.putInt(ah.E, var6.getRunningIndex());
      var5.putInt(ah.D, var1.getBenefit());
      var5.putInt(ah.F, var1.getFatConsumption());
      var5.putLongArray(ah.G, var1.getTimeInHrZones());
      var5.putLong(ah.H, var1.getRecoveryTime());
      var2 = ah.I;
      if (var9 != null) {
         var11 = var9.getMaximumAltitude();
      } else {
         var11 = Float.NaN;
      }

      var5.putFloat(var2, var11);
      var5.putFloat(ah.J, var6.getAscent());
      var5.putFloat(ah.K, var6.getDescent());
      var2 = ah.s;
      if (var9 != null) {
         var10 = var9.getAverageCadence();
      } else {
         var10 = -1;
      }

      var5.putInt(var2, var10);
      var2 = ah.t;
      var10 = var4;
      if (var9 != null) {
         var10 = var9.getMaximumCadence();
      }

      var5.putInt(var2, var10);
      if (var6.isSwimmingSport()) {
         var5.putInt(ah.O, a(var6));
         var5.putParcelableArrayList(ah.L, new ArrayList(SwimmingStyleStatistics.findByPath(var1.getPath())));
      }

      this.a(var5, var8);
   }

   // $FF: synthetic method
   static void a(SummaryActivity var0, TrainingSession var1) {
      var0.a(var1);
   }

   private static String b(Exercise var0) {
      Sport var1 = Sport.getSport(var0.getSport());
      String var2;
      if (var1 != null) {
         var2 = var1.getMediumName();
      } else {
         var2 = null;
      }

      return var2;
   }

   private static String b(TrainingSession var0) {
      String var4;
      if (var0 != null) {
         long var1 = var0.getTargetOrFavoriteId();
         if (var1 != -1L) {
            TrainingSessionTarget var3 = TrainingSessionTarget.getTrainingTargetForEcosystemId(var1);
            if (var3 != null) {
               var4 = var3.getName();
               return var4;
            }
         }
      }

      var4 = null;
      return var4;
   }

   private void b() {
      o.a((Context)this.getApplicationContext(), 30);
      this.setResult(-1, (new fi.polar.polarflow.ui.b()).a(true).a());
      this.finishAfterTransition();
      if (this.h) {
         this.startActivity(new Intent(this.getApplicationContext(), MainMenuActivity.class));
         this.overridePendingTransition(2131034134, 2131034128);
      } else {
         this.overridePendingTransition(0, 2131034140);
      }

   }

   public void onCreate(Bundle var1) {
      fi.polar.polarflow.util.d.c(d, "onCreate()");
      super.onCreate(var1);
      this.setContentView(2130968785);
      this.i = this.getIntent().getLongExtra(a, -1L);
      this.h = this.getIntent().getBooleanExtra(b, false);
      var1 = this.getIntent().getBundleExtra(c);
      if (var1 != null) {
         this.a(var1);
         android.support.v4.c.g.a(this.getApplicationContext()).a(this.j, new IntentFilter("TrainingService.action.TRAINING_SAVED_AND_PUBLISHED"));
      } else {
         TrainingSession var2 = TrainingSession.findByStartTime(this.i);
         if (var2 != null) {
            this.a(var2);
         } else {
            this.finish();
         }
      }

   }

   protected void onDestroy() {
      if (this.e != null) {
         Iterator var1 = this.e.iterator();

         while(var1.hasNext()) {
            ((fi.polar.polarflow.ui.exeview.summary.a_package.d)var1.next()).b();
         }
      }

      fi.polar.polarflow.util.d.c(d, "onDestroy");
      super.onDestroy();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      fi.polar.polarflow.util.d.c(d, "onKeyDown " + KeyEvent.keyCodeToString(var1));
      boolean var4;
      if (var1 == 265) {
         if (var2.getRepeatCount() == 0) {
            this.b();
            var4 = var3;
         } else {
            if (this.g == 0L) {
               this.g = var2.getEventTime();
               o.a((Context)this.getApplicationContext(), 30);
            }

            var4 = var3;
            if (var2.getEventTime() - this.g >= 1000L) {
               this.b();
               var4 = var3;
            }
         }
      } else if (var1 == 263) {
         this.finishAfterTransition();
         this.overridePendingTransition(0, 2131034140);
         var4 = var3;
      } else {
         var4 = super.onKeyDown(var1, var2);
      }

      return var4;
   }

   protected void onStop() {
      super.onStop();
      fi.polar.polarflow.util.d.c(d, "onStop()");
      android.support.v4.c.g.a(this.getApplicationContext()).a(this.j);
   }
}
