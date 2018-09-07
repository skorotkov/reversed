package fi.polar.polarflow.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.Vibrator;
import android.os.PowerManager.WakeLock;
import fi.polar.polarflow.util.aa_TimeUtils;
import lanchon.dexpatcher.annotation.DexIgnore;

public class w {
   private android.support.v4.c.g a;
   private Vibrator b;
   private WakeLock c;
   private final android.support.v4.g.t d;
   private long e;
   private aa_TimeUtils f;
   private final BroadcastReceiver g;
   private SoundManager mSoundManager;

   public w(Context var1) {
      this(var1, (Void)null);
      this.mSoundManager = new SoundManager(var1);
   }

   private w(Context var1, @DexIgnore Void var2) {
      this.d = new x(this);
      this.e = 0L;
      this.g = new y(this);
      this.a = android.support.v4.c.g.a(var1);
      this.b = (Vibrator)var1.getApplicationContext().getSystemService("vibrator");
      if (this.b != null && !this.b.hasVibrator()) {
         this.b = null;
      }

      this.c = ((PowerManager)var1.getSystemService("power")).newWakeLock(1, "AutoLapVibraWakelockTag");
      this.f = new aa_TimeUtils();
   }

   // $FF: synthetic method
   static aa_TimeUtils a(w var0) {
      return var0.f;
   }

   private void a(long var1) {
      this.c.acquire(500L + var1);
   }

   // $FF: synthetic method
   static void a(w var0, long var1) {
      var0.b(var1);
   }

   // $FF: synthetic method
   static void a(w var0, String var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(w var0, long[] var1) {
      var0.b(var1);
   }

   private void a(String var1) {
      if (this.f.b_elapsedRealtime() - this.e > 2000L) {
         long[] var2 = (long[])this.d.get(var1);
         if (var2 == null) {
            fi.polar.polarflow.util.d.f("VibratorManager", "No pattern found for action: " + var1);
         } else {
            this.b(var2);
         }
      }

   }

   private void a(long[] var1) {
      long var2 = 0L;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 += var1[var5];
      }

      this.a(var2);
   }

   // $FF: synthetic method
   static long b(w var0, long var1) {
      var0.e = var1;
      return var1;
   }

   private void b(long var1) {
      if (this.b != null) {
         this.a(var1);
         this.b.vibrate(var1);
      }

   }

   private void b(long[] var1) {
      if (this.b != null) {
         this.a(var1);
         this.b.vibrate(var1, -1);
      }

   }

   public void a() {
      IntentFilter var1 = new IntentFilter();
      var1.addAction("ExerciseLapCalc.ACTION_MANUAL_LAP");
      var1.addAction("ExerciseLapCalc.ACTION_AUTO_LAP");
      var1.addAction("ExercisePhaseCalc.ACTION_ABOVE_TARGET_ZONE");
      var1.addAction("ExercisePhaseCalc.ACTION_BELOW_TARGET_ZONE");
      var1.addAction("ExercisePhaseCalc.ACTION_TARGET_ZONE_REACHED");
      var1.addAction("ExercisePhaseCalc.ACTION_PHASE_FINISHED");
      var1.addAction("ExercisePhaseCalc.ACTION_PHASE_END_COUNTDOWN");
      var1.addAction("ExerciseVolumeTargetCalc.action.TARGET_REACHED");
      this.a.a(this.g, var1);
   }

   public void b() {
      this.a.a(this.g);
   }

   public void playSound(String var1) {
      this.mSoundManager.play(var1);
   }
}
