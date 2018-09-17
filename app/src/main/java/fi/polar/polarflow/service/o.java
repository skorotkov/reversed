package fi.polar.polarflow.service;

import android.content.Context;
import fi.polar.polarflow.data.ExerciseSensors;
import fi.polar.polarflow.data.TrainingDataRefs;
import fi.polar.polarflow.data.TrainingLaps;
import fi.polar.polarflow.data.TrainingSamples;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExercisePhaseStats;
import fi.polar.polarflow.data.orm.ExerciseTargetInfo;
import fi.polar.polarflow.data.orm.Identifier;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.SwimmingSamples;
import fi.polar.polarflow.data.orm.TrainingSession;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.service.datalayer.at;
import java.util.ArrayList;
import java.util.Date;

public class o {
   private final TrainingSession a;
   private final Exercise b;
   private final TrainingSamples c;
   private final SwimmingSamples d;
   private final TrainingLaps e;
   private final PhysData f;
   private final TrainingSessionTarget g;
   private final ExerciseTargetInfo h;
   private final ExercisePhaseStats i;
   private final SportProfile j;
   private ExerciseSensors k = null;

   o(TrainingDataRefs var1) {
      this.a = var1.mTrainingSession;
      this.b = var1.mExercise;
      this.c = var1.mSamples;
      this.d = var1.mSwimmingSamples;
      this.e = var1.mTrainingLaps;
      this.g = var1.mTrainingSessionTarget;
      this.h = var1.mExerciseTargetInfo;
      this.i = var1.mExercisePhaseStats;
      this.f = var1.mPhysDataSnapshot;
      this.j = var1.mSportProfile;
   }

   public long a() {
      return this.a.getStartTime();
   }

   public void a(Context var1, at var2) {
      ArrayList var3 = new ArrayList();
      var3.add(this.a.createDataLayerRequest());
      String var4 = this.a.getPath();
      var3.addAll(this.c.createDataLayerRequests());
      if (this.d != null) {
         var3.add(this.d.createDataLayerRequest());
      }

      if (this.e != null) {
         var3.addAll(this.e.createDataLayerRequests());
      }

      var3.add(this.b.createDataLayerRequest());
      String var5 = this.b.getPath();
      var3.add(this.k.createDataLayerRequest(var5 + "SENSORS.BPB"));
      Sport var6 = Sport.getSport(this.b.getSport());
      if (var6 != null) {
         var3.add(var6.createDataLayerRequest(var5 + var6.getFilename()));
      }

      if (this.f != null) {
         var3.add(this.f.createDataLayerRequest(var4 + this.f.getFilename()));
      }

      SportProfile var8 = this.j;
      if (var8 != null) {
         var3.add(var8.createDataLayerRequest(var5 + var8.getFilename()));
      }

      if (this.g != null) {
         var3.add(this.g.createDataLayerRequest());
         var3.add(this.g.createDataLayerRequest(var4 + this.g.getFilename()));
         var3.add(this.h.createDataLayerRequest());
         if (this.i != null) {
            var3.add(this.i.createDataLayerRequest());
         }

         Identifier var7 = this.g.getIdentifier();
         if (var7 != null) {
            var3.add(var7.createDataLayerRequest());
         }
      }

      var3.add(fi.polar.polarflow.util.w.a(var4));
      (new fi.polar.polarflow.service.datalayer.t(var1, var2)).execute((fi.polar.polarflow.service.datalayer.s[])var3.toArray(new fi.polar.polarflow.service.datalayer.s[var3.size()]));
   }

   public void a(ExerciseSensors var1) {
      this.k = var1;
   }

   public void b_save() {
      fi.polar.polarflow.calculators.at var1 = this.c.getStatistics().getHeartrateStatistics();
      this.a.setTimeInHrZones(this.c.getZones().getTimeInZones());
      this.a.setAverageHr((int)var1.c());
      this.a.setMaximumHr((int)var1.e());
      this.a.save();
      this.b.save();
      this.c.save();
      if (this.d != null) {
         this.d.save();
      }

      if (this.e != null) {
         this.e.save();
      }

      if (this.g != null) {
         this.g.save();
         this.h.save();
         if (this.i != null) {
            this.i.save();
         }

         Identifier var2 = this.g.getIdentifier();
         if (var2 != null) {
            var2.setLastModified(new Date(System.currentTimeMillis()), true);
            var2.save();
         }
      }

      fi.polar.polarflow.util.d.c(n_TrainingSaveAndPublishRunnable.a_getTAG(), "Training saved");
   }
}
