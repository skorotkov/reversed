package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.DailyActivityGoal$PbActivityMetMinGoal;
import fi.polar.remote.representation.protobuf.DailyActivityGoal$PbActivityMetMinGoal$Builder;
import fi.polar.remote.representation.protobuf.DailyActivityGoal$PbDailyActivityGoal;
import fi.polar.remote.representation.protobuf.DailyActivityGoal$PbDailyActivityGoal$Builder;
import fi.polar.remote.representation.protobuf.DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class DailyActivityGoal extends ProtoPublishableEntity implements Mergeable {
   public static final float ACTIVITY_CUTOFF_THRESHOLD_UNDEFINED = -1.0F;
   public static final int GOAL_TYPE_DAILY_ACTIVITY = 1;
   public static final int GOAL_TYPE_UNDEFINED = Integer.MAX_VALUE;
   public static final int GOAL_TYPE_WEIGHT_LOSS = 2;
   public static final int GOAL_TYPE_WEIGHT_MAINTAIN = 3;
   public static final Object LOCK = new Object();
   private static final String TAG = DailyActivityGoal.class.getSimpleName();
   private float activityCutoffThreshold;
   private float activityMetMinGoal;
   private int goalType;
   private Date lastModified;
   private boolean lastModifiedTrusted;

   public DailyActivityGoal() {
      this.goalType = Integer.MAX_VALUE;
      this.activityMetMinGoal = -1.0F;
      this.activityCutoffThreshold = -1.0F;
      this.lastModified = null;
      this.lastModifiedTrusted = false;
      this.path = "/U/0/DGOAL/";
   }

   public DailyActivityGoal(DailyActivityGoal$PbDailyActivityGoal var1) {
      this();
      if (var1.hasGoalType()) {
         this.goalType = var1.getGoalType().getNumber();
      }

      if (var1.hasActivityMetminGoal()) {
         DailyActivityGoal$PbActivityMetMinGoal var2 = var1.getActivityMetminGoal();
         if (var2.hasGoal()) {
            this.activityMetMinGoal = var2.getGoal();
         }

         if (var2.hasActivityCutoffThreshold()) {
            this.activityCutoffThreshold = var2.getActivityCutoffThreshold();
         }
      }

      if (var1.hasLastModified()) {
         this.lastModified = q.a(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

   }

   public DailyActivityGoal(InputStream var1) {
      this(DailyActivityGoal$PbDailyActivityGoal.parseFrom(var1));
   }

   private static DailyActivityGoal$PbActivityMetMinGoal buildPbActivityMetMinGoal(float var0, float var1) {
      DailyActivityGoal$PbActivityMetMinGoal$Builder var2 = DailyActivityGoal$PbActivityMetMinGoal.newBuilder();
      if (var0 != -1.0F) {
         var2.setGoal(var0);
      }

      if (var1 != -1.0F) {
         var2.setActivityCutoffThreshold(var1);
      }

      return var2.build();
   }

   public static DailyActivityGoal getDailyActivityGoal() {
      List var0 = listAll(DailyActivityGoal.class);
      DailyActivityGoal var1;
      switch(var0.size()) {
      case 0:
         var1 = null;
         break;
      case 1:
         var1 = (DailyActivityGoal)var0.get(0);
         break;
      default:
         d.c(TAG, "", new IllegalStateException("More than one DailyActivityGoal objects"));
         var1 = (DailyActivityGoal)var0.get(0);
      }

      return var1;
   }

   public float getActivityCutoffThreshold() {
      return this.activityCutoffThreshold;
   }

   public float getActivityMetMinGoal() {
      return this.activityMetMinGoal;
   }

   public String getBasename() {
      return "DGOAL";
   }

   public int getGoalType() {
      return this.goalType;
   }

   public Date getLastModified() {
      return this.lastModified;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public void merge(DailyActivityGoal var1) {
      if (q.a(this.lastModified, var1.lastModified)) {
         this.goalType = var1.goalType;
         this.activityMetMinGoal = var1.activityMetMinGoal;
         this.activityCutoffThreshold = var1.activityCutoffThreshold;
         this.lastModified = var1.lastModified;
         this.lastModifiedTrusted = var1.lastModifiedTrusted;
      }

   }

   public void setActivityCutoffThreshold(float var1) {
      this.activityCutoffThreshold = var1;
   }

   public void setActivityMetMinGoal(float var1) {
      this.activityMetMinGoal = var1;
   }

   public void setGoalType(int var1) {
      this.goalType = var1;
   }

   public void setLastModified(Date var1, boolean var2) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var2;
   }

   public DailyActivityGoal$PbDailyActivityGoal toPbObject() {
      DailyActivityGoal$PbDailyActivityGoal$Builder var1 = DailyActivityGoal$PbDailyActivityGoal.newBuilder();
      if (this.goalType != Integer.MAX_VALUE) {
         var1.setGoalType(DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType.forNumber(this.goalType));
      }

      if (this.activityMetMinGoal != -1.0F) {
         var1.setActivityMetminGoal(buildPbActivityMetMinGoal(this.activityMetMinGoal, this.activityCutoffThreshold));
      }

      if (this.lastModified != null) {
         var1.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      return var1.build();
   }
}
