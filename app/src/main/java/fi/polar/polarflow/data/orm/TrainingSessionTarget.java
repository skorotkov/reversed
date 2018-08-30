package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.util.aa;
import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.Structures$PbEventId;
import fi.polar.remote.representation.protobuf.Structures$PbMultiLineText;
import fi.polar.remote.representation.protobuf.Structures$PbOneLineText;
import fi.polar.remote.representation.protobuf.Structures$PbSportIdentifier;
import fi.polar.remote.representation.protobuf.Structures$PbTrainingProgramId;
import fi.polar.remote.representation.protobuf.TrainingSessionTarget$PbTrainingSessionTarget;
import fi.polar.remote.representation.protobuf.TrainingSessionTarget$PbTrainingSessionTarget$Builder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;

public class TrainingSessionTarget extends ProtoPublishableEntity {
   private static final String FAVORITE_TARGET_PATH = "/U/0/FAV/__/";
   private static final String IDENTIFIER_PATH = "/U/0/________/TST/______/";
   private static final String TAG = TrainingSessionTarget.class.getSimpleName();
   private String description;
   private long duration;
   private long eventId;
   @Ignore
   private final List mExerciseTargetList;
   @Ignore
   private boolean mExerciseTargetsLoaded;
   private String name;
   private long sportId;
   private long startTime;
   private int startTimeZoneOffset;
   private int targetDone;
   private long trainingProgramId;

   public TrainingSessionTarget() {
      this.startTime = 0L;
      this.startTimeZoneOffset = 0;
      this.targetDone = -1;
      this.duration = -1L;
      this.name = "";
      this.description = null;
      this.sportId = -2L;
      this.eventId = -1L;
      this.trainingProgramId = -1L;
      this.mExerciseTargetsLoaded = false;
      this.mExerciseTargetList = new ArrayList();
   }

   public TrainingSessionTarget(TrainingSessionTarget$PbTrainingSessionTarget var1) {
      byte var2 = 0;
      this();
      if (var1.hasName()) {
         this.name = var1.getName().getText();
      }

      if (var1.hasSportId()) {
         this.sportId = var1.getSportId().getValue();
      }

      if (var1.hasDuration()) {
         this.duration = q.a(var1.getDuration());
      }

      if (var1.hasStartTime()) {
         DateTime var3 = q.c(var1.getStartTime());
         this.startTime = var3.getMillis();
         this.startTimeZoneOffset = ab.d(var3);
      }

      if (var1.hasDescription()) {
         this.description = var1.getDescription().getText();
      }

      if (var1.hasTargetDone()) {
         byte var4;
         if (var1.getTargetDone()) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         this.targetDone = var4;
      }

      if (var1.hasEventId() && var1.getEventId().hasValue()) {
         this.eventId = var1.getEventId().getValue();
      }

      int var5 = var2;
      if (var1.hasTrainingProgramId()) {
         var5 = var2;
         if (var1.getTrainingProgramId().hasValue()) {
            this.trainingProgramId = var1.getTrainingProgramId().getValue();
            var5 = var2;
         }
      }

      while(var5 < var1.getExerciseTargetCount()) {
         this.addExerciseTarget(new ExerciseTarget(var1.getExerciseTarget(var5)));
         ++var5;
      }

      this.updatePath();
   }

   public TrainingSessionTarget(InputStream var1) {
      this(TrainingSessionTarget$PbTrainingSessionTarget.parseFrom(var1));
   }

   public static int deleteAll(Class var0) {
      ExerciseTarget.deleteAll(ExerciseTarget.class);
      return SugarRecord.deleteAll(var0);
   }

   public static int deleteAll(Class var0, String var1, String... var2) {
      List var3 = find(TrainingSessionTarget.class, var1, var2);
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         ((TrainingSessionTarget)var4.next()).delete();
      }

      return var3.size();
   }

   private void deleteExerciseTargets() {
      if (this.getId() != null) {
         Iterator var1 = this.getExerciseTargetList().iterator();

         while(var1.hasNext()) {
            ((ExerciseTarget)var1.next()).delete();
         }
      }

      this.mExerciseTargetList.clear();
   }

   private static void filterTargetList(List var0, List var1) {
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         Object var3 = null;
         TrainingSessionTarget var4 = (TrainingSessionTarget)var2.next();
         String var6;
         if (getEcosystemId(var4, var1) == -1L) {
            var6 = "No ecosystem ID";
         } else if (var4.getExerciseTarget() == null) {
            var6 = "No exercise target";
         } else {
            int var5 = var4.getExerciseTarget().getTargetType();
            var6 = (String)var3;
            if (var5 != 0) {
               var6 = (String)var3;
               if (var5 != 1) {
                  var6 = (String)var3;
                  if (var5 != 2) {
                     var6 = "Unsupported type: " + var5;
                  }
               }
            }
         }

         if (var6 != null) {
            d.e(TAG, "filterTargetList() - Removing target (" + var4.getName() + ") " + var4.getPath() + " - " + var6);
            var2.remove();
         }
      }

   }

   public static String generatePath(DateTime var0) {
      return "/U/0/" + DateTimeFormat.forPattern("yyyyMMdd").print((ReadableInstant)var0) + '/' + "TST" + '/' + DateTimeFormat.forPattern("HHmmss").print((ReadableInstant)var0) + '/';
   }

   public static List getCurrentDayTrainingTargets(boolean var0) {
      DateTime var1 = (new aa()).e().withTimeAtStartOfDay();
      return getTrainingTargetsForPeriod(var1.getMillis(), var1.plusDays(1).getMillis(), var0);
   }

   public static long getEcosystemId(TrainingSessionTarget var0) {
      long var1 = -1L;
      long var3 = var1;
      if (var0 != null) {
         var3 = var1;
         if (var0.getPath() != null) {
            List var5 = Identifier.find(Identifier.class, "PATH = ?", new String[]{var0.getPath()});
            var3 = var1;
            if (!var5.isEmpty()) {
               var3 = ((Identifier)var5.get(0)).getEcosystemId();
            }
         }
      }

      d.c(TAG, "getEcosystemId() returns " + var3);
      return var3;
   }

   private static long getEcosystemId(TrainingSessionTarget var0, List var1) {
      long var3;
      if (var0 != null && var0.getPath() != null && var1 != null) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            Identifier var5 = (Identifier)var2.next();
            if (var0.getPath().equals(var5.getPath())) {
               var3 = var5.getEcosystemId();
               return var3;
            }
         }
      }

      var3 = -1L;
      return var3;
   }

   private List getExerciseTargetList() {
      this.loadExerciseTargetsFromDb();
      return this.mExerciseTargetList;
   }

   public static List getFavoriteTrainingTargets() {
      List var0 = find(TrainingSessionTarget.class, "PATH LIKE ?", new String[]{"/U/0/FAV/__/"}, (String)null, "PATH ASC", (String)null);
      filterTargetList(var0, Identifier.find(Identifier.class, "PATH LIKE ?", new String[]{"/U/0/FAV/__/"}));
      return var0;
   }

   public static TrainingSessionTarget getTrainingTargetForEcosystemId(long var0) {
      Object var2 = null;
      TrainingSessionTarget var3 = (TrainingSessionTarget)var2;
      if (var0 != -1L) {
         List var4 = Identifier.find(Identifier.class, "ECOSYSTEM_ID = ?", new String[]{String.valueOf(var0)});
         var3 = (TrainingSessionTarget)var2;
         if (!var4.isEmpty()) {
            var3 = getTrainingTargetForPath(((Identifier)var4.get(0)).getPath());
         }
      }

      return var3;
   }

   public static TrainingSessionTarget getTrainingTargetForPath(String var0) {
      Object var1 = null;
      TrainingSessionTarget var2 = (TrainingSessionTarget)var1;
      if (var0 != null) {
         List var3 = find(TrainingSessionTarget.class, "PATH = ?", new String[]{var0});
         var2 = (TrainingSessionTarget)var1;
         if (!var3.isEmpty()) {
            var2 = (TrainingSessionTarget)var3.get(0);
         }
      }

      return var2;
   }

   public static List getTrainingTargetsForPeriod(long var0, long var2, boolean var4) {
      ArrayList var5 = new ArrayList();
      var5.add(String.valueOf(var0));
      var5.add(String.valueOf(var2));
      String var6 = "START_TIME>=? AND START_TIME<?";
      if (!var4) {
         var6 = "START_TIME>=? AND START_TIME<?" + " AND TARGET_DONE != ?";
         var5.add(String.valueOf(1));
      }

      List var7 = find(TrainingSessionTarget.class, var6, (String[])var5.toArray(new String[var5.size()]), (String)null, "START_TIME ASC", (String)null);
      filterTargetList(var7, Identifier.find(Identifier.class, "PATH LIKE ?", new String[]{"/U/0/________/TST/______/"}));
      return var7;
   }

   private void loadExerciseTargetsFromDb() {
      if (!this.mExerciseTargetsLoaded && this.getId() != null) {
         this.mExerciseTargetList.addAll(this.findWithParentId(ExerciseTarget.class, "TRAINING_SESSION_TARGET"));
         this.mExerciseTargetsLoaded = true;
      }

   }

   private void updatePath() {
      if (this.getStartTime() == 0L) {
         d.c(TAG, "TrainingSessionTarget doesn't have valid start time, cannot update path");
      } else {
         this.path = generatePath(q.b(this.startTime, this.startTimeZoneOffset));
      }

   }

   public void addExerciseTarget(ExerciseTarget var1) {
      this.getExerciseTargetList().add(var1);
   }

   public boolean delete() {
      this.deleteExerciseTargets();
      return super.delete();
   }

   public String getBasename() {
      return "TST";
   }

   public String getDescription() {
      return this.description;
   }

   public long getDuration() {
      return this.duration;
   }

   public long getEventId() {
      return this.eventId;
   }

   public ExerciseTarget getExerciseTarget() {
      List var1 = this.getExerciseTargetList();
      ExerciseTarget var2;
      if (!var1.isEmpty()) {
         var2 = (ExerciseTarget)var1.get(0);
      } else {
         var2 = null;
      }

      return var2;
   }

   public int getExerciseTargetCount() {
      return this.getExerciseTargetList().size();
   }

   public Identifier getIdentifier() {
      return Identifier.findIdentifier(this.getPath());
   }

   public String getName() {
      return this.name;
   }

   ExerciseTarget getOrCreateExerciseTarget() {
      List var1 = this.getExerciseTargetList();
      ExerciseTarget var3;
      if (var1.isEmpty()) {
         var3 = new ExerciseTarget();
      } else if (var1.size() == 1) {
         var3 = (ExerciseTarget)var1.get(0);
      } else {
         for(int var2 = 1; var2 < var1.size(); ++var2) {
            ((ExerciseTarget)var1.get(var2)).delete();
         }

         var3 = (ExerciseTarget)var1.get(0);
      }

      return var3;
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   public long getSportId() {
      return this.sportId;
   }

   public long getStartTime() {
      return this.startTime;
   }

   public int getStartTimeZoneOffset() {
      return this.startTimeZoneOffset;
   }

   public int getTargetDone() {
      return this.targetDone;
   }

   public long getTrainingProgramId() {
      return this.trainingProgramId;
   }

   public boolean isFavorite() {
      boolean var1;
      if (this.startTime == 0L && this.path != null && this.path.startsWith("/U/0/FAV")) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public long save() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      long var1 = super.save();
      Iterator var3 = this.getExerciseTargetList().iterator();

      while(var3.hasNext()) {
         ExerciseTarget var4 = (ExerciseTarget)var3.next();
         if (var4.getId() == null) {
            var4.setTrainingSessionTargetId(this.getId());
            var4.save();
         }
      }

      return var1;
   }

   public void setDescription(String var1) {
      this.description = var1;
   }

   public void setDuration(long var1) {
      this.duration = var1;
   }

   public void setEventId(long var1) {
      this.eventId = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setSportId(long var1) {
      this.sportId = var1;
   }

   public void setStartTime(DateTime var1) {
      this.startTime = var1.getMillis();
      this.startTimeZoneOffset = ab.d(var1);
      this.path = null;
      this.updatePath();
   }

   public void setTargetDone(boolean var1) {
      if (!this.isFavorite()) {
         byte var2;
         if (var1) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         this.targetDone = var2;
      }

   }

   public void setTrainingProgramId(long var1) {
      this.trainingProgramId = var1;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget toPbObject() {
      boolean var1 = true;
      TrainingSessionTarget$PbTrainingSessionTarget$Builder var2 = TrainingSessionTarget$PbTrainingSessionTarget.newBuilder();
      if (this.getStartTime() != 0L) {
         var2.setStartTime(q.a(this.getStartTime(), this.startTimeZoneOffset));
      }

      var2.setName(Structures$PbOneLineText.newBuilder().setText(this.getName()));
      if (this.getDescription() != null) {
         var2.setDescription(Structures$PbMultiLineText.newBuilder().setText(this.getDescription()));
      }

      if (this.targetDone != -1) {
         if (this.targetDone != 1) {
            var1 = false;
         }

         var2.setTargetDone(var1);
      }

      if (this.sportId != -2L) {
         var2.setSportId(Structures$PbSportIdentifier.newBuilder().setValue(this.sportId));
      }

      if (this.duration != -1L) {
         var2.setDuration(q.b(this.duration));
      }

      if (this.eventId != -1L) {
         var2.setEventId(Structures$PbEventId.newBuilder().setValue(this.eventId));
      }

      if (this.trainingProgramId != -1L) {
         var2.setTrainingProgramId(Structures$PbTrainingProgramId.newBuilder().setValue(this.trainingProgramId));
      }

      Iterator var3 = this.getExerciseTargetList().iterator();

      while(var3.hasNext()) {
         var2.addExerciseTarget(((ExerciseTarget)var3.next()).toPbObject());
      }

      return var2.build();
   }
}
