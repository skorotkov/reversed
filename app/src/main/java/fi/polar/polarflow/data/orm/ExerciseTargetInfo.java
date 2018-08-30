package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhase;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhases;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhases$Builder;
import fi.polar.remote.representation.protobuf.ExerciseTargetInfo$PbExerciseTargetInfo;
import fi.polar.remote.representation.protobuf.ExerciseTargetInfo$PbExerciseTargetInfo$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbOneLineText;
import fi.polar.remote.representation.protobuf.Structures$PbSportIdentifier;
import fi.polar.remote.representation.protobuf.Structures$PbVolumeTarget;
import fi.polar.remote.representation.protobuf.Structures$PbVolumeTarget$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbVolumeTarget$PbVolymeTargetType;
import fi.polar.remote.representation.protobuf.Types$PbExerciseTargetType;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciseTargetInfo extends ProtoPublishableEntity {
   private static final String TAG = ExerciseTargetInfo.class.getSimpleName();
   private long endTime;
   private Exercise exercise;
   private ExerciseTarget exerciseTarget;
   private int exerciseTargetIndex;
   @Ignore
   private final List mExercisePhaseList;
   @Ignore
   private boolean mExercisePhasesLoaded;
   private String name;
   private long sportId;
   private int targetReached;
   private int targetType;
   private int volumeTargetCalories;
   private float volumeTargetDistance;
   private long volumeTargetDuration;
   private int volumeTargetType;

   public ExerciseTargetInfo() {
      this.targetType = Integer.MAX_VALUE;
      this.exerciseTargetIndex = 0;
      this.targetReached = -1;
      this.endTime = 0L;
      this.sportId = -2L;
      this.volumeTargetType = Integer.MAX_VALUE;
      this.volumeTargetDuration = -1L;
      this.volumeTargetDistance = -1.0F;
      this.volumeTargetCalories = -1;
      this.mExercisePhasesLoaded = false;
      this.mExercisePhaseList = new ArrayList();
   }

   public ExerciseTargetInfo(Exercise var1) {
      this();
      this.setExercise(var1);
   }

   public ExerciseTargetInfo(ExerciseTargetInfo$PbExerciseTargetInfo var1) {
      this();
      if (var1.hasTargetType()) {
         this.targetType = var1.getTargetType().getNumber();
      }

      if (var1.hasIndex()) {
         this.exerciseTargetIndex = var1.getIndex();
      }

      if (var1.hasTargetReached()) {
         byte var2;
         if (var1.getTargetReached()) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         this.targetReached = var2;
      }

      if (var1.hasName()) {
         this.name = var1.getName().getText();
      }

      if (var1.hasEndTime()) {
         this.endTime = q.a(var1.getEndTime());
      }

      if (var1.hasSportId()) {
         Structures$PbSportIdentifier var3 = var1.getSportId();
         if (var3.hasValue()) {
            this.sportId = var3.getValue();
         }
      }

      if (var1.hasVolumeTarget()) {
         Structures$PbVolumeTarget var6 = var1.getVolumeTarget();
         if (var6.hasTargetType()) {
            this.volumeTargetType = var6.getTargetType().getNumber();
         }

         if (var6.hasDuration()) {
            this.volumeTargetDuration = q.a(var6.getDuration());
         }

         if (var6.hasDistance()) {
            this.volumeTargetDistance = var6.getDistance();
         }

         if (var6.hasCalories()) {
            this.volumeTargetCalories = var6.getCalories();
         }
      }

      if (var1.hasPhases()) {
         ExercisePhase$PbPhases var4 = var1.getPhases();
         if (var4.getPhaseCount() > 0) {
            Iterator var5 = var4.getPhaseList().iterator();

            while(var5.hasNext()) {
               this.addExercisePhase(new ExercisePhase((ExercisePhase$PbPhase)var5.next()));
            }
         }
      }

   }

   public ExerciseTargetInfo(InputStream var1) {
      this(ExerciseTargetInfo$PbExerciseTargetInfo.parseFrom(var1));
   }

   public static int deleteAll(Class var0) {
      ExercisePhase.deleteAll(ExercisePhase.class);
      return SugarRecord.deleteAll(var0);
   }

   private void deleteExercisePhases() {
      this.deleteWithParentId(ExercisePhase.class, "EXERCISE_TARGET_INFO");
      this.mExercisePhaseList.clear();
   }

   private void loadExercisePhasesFromDb() {
      if (!this.mExercisePhasesLoaded && this.getId() != null) {
         this.mExercisePhaseList.addAll(ExercisePhase.find(ExercisePhase.class, "EXERCISE_TARGET_INFO = ?", new String[]{String.valueOf(this.getId())}));
         this.mExercisePhasesLoaded = true;
      }

   }

   private void updatePath() {
      if (this.getExercise() == null) {
         d.c(TAG, "", new IllegalStateException("No Exercise entity associated or loaded, cannot create path."));
      } else {
         this.path = this.getExercise().getPath();
      }

   }

   public void addAllExercisePhases(List var1) {
      Iterator var2 = var1.iterator();

      for(int var3 = 1; var2.hasNext(); ++var3) {
         ExercisePhase var4 = new ExercisePhase((ExercisePhase)var2.next());
         var4.setIndex(var3);
         this.addExercisePhase(var4);
      }

   }

   public void addExercisePhase(ExercisePhase var1) {
      this.getExercisePhaseList().add(var1);
   }

   public boolean delete() {
      this.deleteExercisePhases();
      return super.delete();
   }

   public String getBasename() {
      return "TARGET";
   }

   public long getEndTime() {
      return this.endTime;
   }

   public Exercise getExercise() {
      return this.exercise;
   }

   public List getExercisePhaseList() {
      this.loadExercisePhasesFromDb();
      return this.mExercisePhaseList;
   }

   public int getIndex() {
      return this.exerciseTargetIndex;
   }

   public String getName() {
      return this.name;
   }

   public long getSportId() {
      return this.sportId;
   }

   public int getTargetReached() {
      return this.targetReached;
   }

   public int getTargetType() {
      return this.targetType;
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
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      long var1 = super.save();
      Iterator var3 = this.getExercisePhaseList().iterator();

      while(var3.hasNext()) {
         ExercisePhase var4 = (ExercisePhase)var3.next();
         if (var4.getId() == null) {
            var4.setExerciseTargetInfoId(var1);
            var4.save();
         }
      }

      return var1;
   }

   public void setEndTime(long var1) {
      this.endTime = var1;
   }

   public void setExercise(Exercise var1) {
      this.exercise = var1;
   }

   public void setIndex(int var1) {
      this.exerciseTargetIndex = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setSportId(long var1) {
      this.sportId = var1;
   }

   public void setTargetReached(boolean var1) {
      byte var2;
      if (var1) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      this.targetReached = var2;
   }

   public void setTargetType(int var1) {
      this.targetType = var1;
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

   public ExerciseTargetInfo$PbExerciseTargetInfo toPbObject() {
      ExerciseTargetInfo$PbExerciseTargetInfo$Builder var1 = ExerciseTargetInfo$PbExerciseTargetInfo.newBuilder();
      if (this.getTargetType() != Integer.MAX_VALUE) {
         var1.setTargetType(Types$PbExerciseTargetType.forNumber(this.getTargetType()));
      }

      if (this.getIndex() != -1) {
         var1.setIndex(this.getIndex());
      }

      if (this.getName() != null) {
         var1.setName(Structures$PbOneLineText.newBuilder().setText(this.getName()));
      }

      if (this.getTargetReached() != -1) {
         boolean var2;
         if (this.getTargetReached() == 1) {
            var2 = true;
         } else {
            var2 = false;
         }

         var1.setTargetReached(var2);
      }

      if (this.getEndTime() != 0L) {
         var1.setEndTime(q.b(this.getEndTime()));
      }

      if (this.getSportId() != -2L) {
         var1.setSportId(Structures$PbSportIdentifier.newBuilder().setValue(this.getSportId()));
      }

      if (this.getTargetType() == 1) {
         if (this.getVolumeTargetType() != Integer.MAX_VALUE) {
            Structures$PbVolumeTarget$Builder var3 = Structures$PbVolumeTarget.newBuilder();
            var3.setTargetType(Structures$PbVolumeTarget$PbVolymeTargetType.forNumber(this.volumeTargetType));
            if (this.getVolumeTargetType() == 1) {
               if (this.getVolumeTargetDistance() != -1.0F) {
                  var3.setDistance(this.getVolumeTargetDistance());
               }
            } else if (this.getVolumeTargetType() == 0) {
               if (this.getVolumeTargetDuration() != -1L) {
                  var3.setDuration(q.b(this.getVolumeTargetDuration()));
               }
            } else if (this.getVolumeTargetType() == 2 && this.getVolumeTargetCalories() != -1) {
               var3.setCalories(this.getVolumeTargetCalories());
            }

            var1.setVolumeTarget(var3.build());
         }
      } else if (this.getTargetType() == 2) {
         List var4 = this.getExercisePhaseList();
         if (!var4.isEmpty()) {
            ExercisePhase$PbPhases$Builder var5 = ExercisePhase$PbPhases.newBuilder();
            Iterator var6 = var4.iterator();

            while(var6.hasNext()) {
               var5.addPhase(((ExercisePhase)var6.next()).toPbObject());
            }

            var1.setPhases(var5);
         }
      }

      return var1.build();
   }
}
