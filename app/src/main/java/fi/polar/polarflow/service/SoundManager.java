package fi.polar.polarflow.service;

import android.content.Context;
import android.media.SoundPool;
import android.media.SoundPool.Builder;
import android.util.Log;
import java.util.HashMap;

public class SoundManager {
   private SoundPool mPool = (new Builder()).build();
   private HashMap mSounds = new HashMap();

   public SoundManager(Context var1) {
      this.mSounds.put("beep", this.mPool.load(var1, 2131951618, 1));
      this.mSounds.put("ExercisePhaseCalc.ACTION_ABOVE_TARGET_ZONE", this.mPool.load(var1, 2131951618, 1));
      this.mSounds.put("ExerciseLapCalc.ACTION_AUTO_LAP", this.mPool.load(var1, 2131951617, 1));
      this.mSounds.put("ExercisePhaseCalc.ACTION_BELOW_TARGET_ZONE", this.mPool.load(var1, 2131951619, 1));
      this.mSounds.put("ExerciseLapCalc.ACTION_MANUAL_LAP", this.mPool.load(var1, 2131951620, 1));
      this.mSounds.put("ExercisePhaseCalc.ACTION_PHASE_FINISHED", this.mPool.load(var1, 2131951622, 1));
      this.mSounds.put("ExercisePhaseCalc.ACTION_TARGET_ZONE_REACHED", this.mPool.load(var1, 2131951623, 1));
      this.mSounds.put("ExercisePhaseCalc.ACTION_PHASE_END_COUNTDOWN", this.mPool.load(var1, 2131951621, 1));
   }

   public void play(String var1) {
      Log.w("SKOR:SoundManager", "play: " + var1);
      if (var1.equals("ExercisePhaseCalc.ACTION_ABOVE_TARGET_ZONE")) {
         this.mPool.play((Integer)this.mSounds.get(var1), 1.0F, 1.0F, 0, 5, 1.0F);
      } else {
         this.mPool.play((Integer)this.mSounds.get(var1), 1.0F, 1.0F, 0, 0, 1.0F);
      }

   }
}
