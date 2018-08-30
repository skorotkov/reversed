package fi.polar.polarflow.data.orm;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhase;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhases;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhases$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbSportIdentifier;
import fi.polar.remote.representation.protobuf.Structures$PbVolumeTarget;
import fi.polar.remote.representation.protobuf.Structures$PbVolumeTarget$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbVolumeTarget$PbVolymeTargetType;
import fi.polar.remote.representation.protobuf.TrainingSessionTarget$PbExerciseTarget;
import fi.polar.remote.representation.protobuf.TrainingSessionTarget$PbExerciseTarget$Builder;
import fi.polar.remote.representation.protobuf.Types$PbExerciseTargetType;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciseTarget extends ProtoEncodableEntity {
   public static final int EXERCISE_TARGET_FREE = 0;
   public static final int EXERCISE_TARGET_PHASED = 2;
   public static final int EXERCISE_TARGET_ROUTE = 3;
   public static final int EXERCISE_TARGET_ROUTE_RACE_PACE = 5;
   public static final int EXERCISE_TARGET_STEADY_RACE_PACE = 4;
   public static final int EXERCISE_TARGET_UNDEFINED = Integer.MAX_VALUE;
   public static final int EXERCISE_TARGET_VOLUME = 1;
   public static final int VOLUME_TARGET_CALORIES = 2;
   public static final int VOLUME_TARGET_DISTANCE = 1;
   public static final int VOLUME_TARGET_DURATION = 0;
   public static final int VOLUME_TARGET_UNDEFINED = Integer.MAX_VALUE;
   @Ignore
   private final List mExercisePhaseList;
   @Ignore
   private boolean mExercisePhasesLoaded;
   private long sportId;
   private int targetType;
   private long trainingSessionTarget;
   private int volumeTargetCalories;
   private float volumeTargetDistance;
   private long volumeTargetDuration;
   private int volumeTargetType;

   public ExerciseTarget() {
      this.trainingSessionTarget = 0L;
      this.targetType = Integer.MAX_VALUE;
      this.sportId = -2L;
      this.volumeTargetType = Integer.MAX_VALUE;
      this.volumeTargetCalories = -1;
      this.volumeTargetDistance = -1.0F;
      this.volumeTargetDuration = -1L;
      this.mExercisePhasesLoaded = false;
      this.mExercisePhaseList = new ArrayList();
   }

   public ExerciseTarget(TrainingSessionTarget$PbExerciseTarget var1) {
      this();
      if (var1.hasSportId()) {
         this.sportId = var1.getSportId().getValue();
      }

      if (var1.hasTargetType()) {
         this.targetType = var1.getTargetType().getNumber();
      }

      if (var1.hasVolumeTarget()) {
         Structures$PbVolumeTarget var2 = var1.getVolumeTarget();
         if (var2.hasTargetType()) {
            this.volumeTargetType = var2.getTargetType().getNumber();
         }

         if (var2.hasDuration()) {
            this.volumeTargetDuration = q.a(var2.getDuration());
         }

         if (var2.hasDistance()) {
            this.volumeTargetDistance = var2.getDistance();
         }

         if (var2.hasCalories()) {
            this.volumeTargetCalories = var2.getCalories();
         }
      }

      if (var1.hasPhases()) {
         ExercisePhase$PbPhases var3 = var1.getPhases();
         if (var3.getPhaseCount() > 0) {
            Iterator var4 = var3.getPhaseList().iterator();

            while(var4.hasNext()) {
               this.addExercisePhase(new ExercisePhase((ExercisePhase$PbPhase)var4.next()));
            }
         }
      }

   }

   public ExerciseTarget(InputStream var1) {
      this(TrainingSessionTarget$PbExerciseTarget.parseFrom(var1));
   }

   public static int deleteAll(Class var0) {
      ExercisePhase.deleteAll(ExercisePhase.class);
      return SugarRecord.deleteAll(var0);
   }

   private void deleteExercisePhases() {
      this.deleteWithParentId(ExercisePhase.class, "EXERCISE_TARGET");
      this.mExercisePhaseList.clear();
   }

   private void loadExercisePhasesFromDb() {
      if (!this.mExercisePhasesLoaded && this.getId() != null) {
         this.mExercisePhaseList.addAll(this.findWithParentId(ExercisePhase.class, "EXERCISE_TARGET"));
         this.mExercisePhasesLoaded = true;
      }

   }

   public void addExercisePhase(ExercisePhase var1) {
      this.getExercisePhaseList().add(var1);
   }

   public boolean delete() {
      this.deleteExercisePhases();
      return super.delete();
   }

   public List getExercisePhaseList() {
      this.loadExercisePhasesFromDb();
      return this.mExercisePhaseList;
   }

   public long getSportId() {
      return this.sportId;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public long getTrainingSessionTargetId() {
      return this.trainingSessionTarget;
   }

   public int getVolumeTargetCalories() {
      return this.volumeTargetCalories;
   }

   public float getVolumeTargetDistance() {
      return this.volumeTargetDistance;
   }

   public long getVolumeTargetDuration() {
      return this.volumeTargetDuration;
   }

   public int getVolumeTargetType() {
      return this.volumeTargetType;
   }

   public long save() {
      long var1 = super.save();
      Iterator var3 = this.getExercisePhaseList().iterator();

      while(var3.hasNext()) {
         ExercisePhase var4 = (ExercisePhase)var3.next();
         if (var4.getId() == null) {
            var4.setExerciseTargetId(var1);
            var4.save();
         }
      }

      return var1;
   }

   public void setSportId(long var1) {
      this.sportId = var1;
   }

   public void setTargetType(int var1) {
      this.targetType = var1;
   }

   public void setTrainingSessionTargetId(long var1) {
      this.trainingSessionTarget = var1;
   }

   public void setVolumeTargetCalories(int var1) {
      this.volumeTargetCalories = var1;
   }

   public void setVolumeTargetDistance(float var1) {
      this.volumeTargetDistance = var1;
   }

   public void setVolumeTargetDuration(long var1) {
      this.volumeTargetDuration = var1;
   }

   public void setVolumeTargetType(int var1) {
      this.volumeTargetType = var1;
   }

   public TrainingSessionTarget$PbExerciseTarget toPbObject() {
      TrainingSessionTarget$PbExerciseTarget$Builder var1 = TrainingSessionTarget$PbExerciseTarget.newBuilder();
      if (this.sportId != -2L) {
         var1.setSportId(Structures$PbSportIdentifier.newBuilder().setValue(this.sportId));
      }

      if (this.targetType != Integer.MAX_VALUE) {
         var1.setTargetType(Types$PbExerciseTargetType.forNumber(this.targetType));
      }

      if (this.volumeTargetType != Integer.MAX_VALUE) {
         Structures$PbVolumeTarget$Builder var2 = Structures$PbVolumeTarget.newBuilder();
         var2.setTargetType(Structures$PbVolumeTarget$PbVolymeTargetType.forNumber(this.volumeTargetType));
         if (this.volumeTargetType == 1) {
            if (this.volumeTargetDistance != -1.0F) {
               var2.setDistance(this.volumeTargetDistance);
            }
         } else if (this.volumeTargetType == 0) {
            if (this.volumeTargetDuration != -1L) {
               var2.setDuration(q.b(this.volumeTargetDuration));
            }
         } else if (this.volumeTargetType == 2 && this.volumeTargetCalories != -1) {
            var2.setCalories(this.volumeTargetCalories);
         }

         var1.setVolumeTarget(var2.build());
      }

      List var3 = this.getExercisePhaseList();
      if (!var3.isEmpty()) {
         ExercisePhase$PbPhases$Builder var4 = ExercisePhase$PbPhases.newBuilder();
         Iterator var5 = var3.iterator();

         while(var5.hasNext()) {
            var4.addPhase(((ExercisePhase)var5.next()).toPbObject());
         }

         var1.setPhases(var4);
      }

      return var1.build();
   }
}
