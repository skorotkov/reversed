package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.util.d;
import fi.polar.remote.representation.protobuf.ExercisePhaseStats$PbPhaseRepetition;
import fi.polar.remote.representation.protobuf.ExercisePhaseStats$PbPhaseRepetitions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExercisePhaseStats extends ProtoPublishableEntity {
   private static final String TAG = ExercisePhaseStats.class.getSimpleName();
   private Exercise exercise;
   @Ignore
   private boolean mDataListLoadedFromDb;
   @Ignore
   private final List mPhaseDataList;

   public ExercisePhaseStats() {
      this.mPhaseDataList = Collections.synchronizedList(new ArrayList());
   }

   public ExercisePhaseStats(Exercise var1) {
      this();
      this.setExercise(var1);
   }

   public ExercisePhaseStats(ExercisePhaseStats$PbPhaseRepetitions var1) {
      this();
      Iterator var2 = var1.getPhaseList().iterator();

      while(var2.hasNext()) {
         this.addPhaseData(new ExercisePhaseData((ExercisePhaseStats$PbPhaseRepetition)var2.next()));
      }

   }

   public ExercisePhaseStats(InputStream var1) {
      this(ExercisePhaseStats$PbPhaseRepetitions.parseFrom(var1));
   }

   public static int deleteAll(Class var0) {
      ExercisePhaseData.deleteAll(ExercisePhaseData.class);
      return SugarRecord.deleteAll(var0);
   }

   public static int deleteAll(Class var0, String var1, String... var2) {
      List var4 = find(ExercisePhaseStats.class, var1, var2);
      Iterator var3 = var4.iterator();

      while(var3.hasNext()) {
         ((ExercisePhaseStats)var3.next()).delete();
      }

      return var4.size();
   }

   private void deleteExercisePhaseDataList() {
      this.deleteWithParentId(ExercisePhaseData.class, "PHASE_STATS");
      this.mPhaseDataList.clear();
   }

   private void loadPhaseDataList() {
      if (!this.mDataListLoadedFromDb && this.getId() != null) {
         this.mPhaseDataList.addAll(this.findWithParentId(ExercisePhaseData.class, "PHASE_STATS"));
         this.mDataListLoadedFromDb = true;
      }

   }

   private void updatePath() {
      if (this.getExercise() == null) {
         d.c(TAG, "", new IllegalStateException("No Exercise entity associated or loaded, cannot create path."));
      } else {
         this.path = this.getExercise().getPath();
      }

   }

   public void addAllPhaseData(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         this.addPhaseData((ExercisePhaseData)var2.next());
      }

   }

   public void addPhaseData(ExercisePhaseData param1) {
      // $FF: Couldn't be decompiled
   }

   public List clonePhaseDataList() {
      // $FF: Couldn't be decompiled
   }

   public ExercisePhaseData clonePhaseDataListItem(int var1) {
      Object var2 = null;
      ExercisePhaseData var3 = (ExercisePhaseData)var2;
      if (var1 >= 0) {
         var3 = (ExercisePhaseData)var2;
         if (var1 < this.getExercisePhaseDataList().size()) {
            var3 = new ExercisePhaseData((ExercisePhaseData)this.getExercisePhaseDataList().get(var1));
         }
      }

      return var3;
   }

   public boolean delete() {
      this.deleteExercisePhaseDataList();
      return super.delete();
   }

   public String getBasename() {
      return "PHASES";
   }

   public ExercisePhaseData getClonedLastPhaseData() {
      List var1 = this.getExercisePhaseDataList();
      ExercisePhaseData var2;
      if (var1.size() == 0) {
         var2 = null;
      } else {
         var2 = new ExercisePhaseData((ExercisePhaseData)var1.get(var1.size() - 1));
      }

      return var2;
   }

   public Exercise getExercise() {
      return this.exercise;
   }

   protected List getExercisePhaseDataList() {
      this.loadPhaseDataList();
      return this.mPhaseDataList;
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   public int getPhaseDataCount() {
      return this.getExercisePhaseDataList().size();
   }

   public long save() {
      // $FF: Couldn't be decompiled
   }

   public void setExercise(Exercise var1) {
      this.exercise = var1;
      this.path = null;
   }

   public ExercisePhaseStats$PbPhaseRepetitions toPbObject() {
      // $FF: Couldn't be decompiled
   }
}
