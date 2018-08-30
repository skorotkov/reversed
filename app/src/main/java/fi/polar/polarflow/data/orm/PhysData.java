package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.PhysData$PbSleepGoal;
import fi.polar.remote.representation.protobuf.PhysData$PbSleepGoal$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserBirthday;
import fi.polar.remote.representation.protobuf.PhysData$PbUserBirthday$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserGender;
import fi.polar.remote.representation.protobuf.PhysData$PbUserGender$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserGender$Gender;
import fi.polar.remote.representation.protobuf.PhysData$PbUserHeight;
import fi.polar.remote.representation.protobuf.PhysData$PbUserHeight$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserHrAttribute;
import fi.polar.remote.representation.protobuf.PhysData$PbUserHrAttribute$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserHrAttribute$HrSettingSource;
import fi.polar.remote.representation.protobuf.PhysData$PbUserPhysData;
import fi.polar.remote.representation.protobuf.PhysData$PbUserPhysData$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserTrainingBackground;
import fi.polar.remote.representation.protobuf.PhysData$PbUserTrainingBackground$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserTrainingBackground$TrainingBackground;
import fi.polar.remote.representation.protobuf.PhysData$PbUserTypicalDay;
import fi.polar.remote.representation.protobuf.PhysData$PbUserTypicalDay$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserTypicalDay$TypicalDay;
import fi.polar.remote.representation.protobuf.PhysData$PbUserVo2Max;
import fi.polar.remote.representation.protobuf.PhysData$PbUserVo2Max$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserVo2Max$Vo2MaxSettingSource;
import fi.polar.remote.representation.protobuf.PhysData$PbUserWeight;
import fi.polar.remote.representation.protobuf.PhysData$PbUserWeight$Builder;
import fi.polar.remote.representation.protobuf.PhysData$PbUserWeight$WeightSettingSource;
import fi.polar.remote.representation.protobuf.PhysData$PbWeeklyRecoveryTimeSum;
import fi.polar.remote.representation.protobuf.PhysData$PbWeeklyRecoveryTimeSum$Builder;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.Years;
import org.joda.time.format.ISODateTimeFormat;

public class PhysData extends ProtoPublishableEntity implements Mergeable {
   public static final int AGE_UNDEFINED = 0;
   private static final String DEFAULT_DEVICE_PATH = "/U/0/S/";
   public static final int GENDER_FEMALE = 2;
   public static final int GENDER_MALE = 1;
   public static final int GENDER_UNDEFINED = Integer.MAX_VALUE;
   public static final float HEIGHT_VALUE_UNDEFINED = 0.0F;
   public static final int HR_SOURCE_AGE_BASED = 1;
   public static final int HR_SOURCE_DEFAULT = 0;
   public static final int HR_SOURCE_KEEP = 4;
   public static final int HR_SOURCE_MEASURED = 3;
   public static final int HR_SOURCE_UNDEFINED = Integer.MAX_VALUE;
   public static final int HR_SOURCE_USER = 2;
   public static final int HR_VALUE_UNDEFINED = 0;
   private static final String TAG = PhysData.class.getSimpleName();
   public static final int TRAINING_BACKGROUND_FREQUENT = 30;
   public static final int TRAINING_BACKGROUND_HEAVY = 40;
   public static final int TRAINING_BACKGROUND_OCCASIONAL = 10;
   public static final int TRAINING_BACKGROUND_PRO = 60;
   public static final int TRAINING_BACKGROUND_REGULAR = 20;
   public static final int TRAINING_BACKGROUND_SEMI_PRO = 50;
   public static final int TRAINING_BACKGROUND_UNDEFINED = Integer.MAX_VALUE;
   public static final int TYPICAL_DAY_MOSTLY_MOVING = 3;
   public static final int TYPICAL_DAY_MOSTLY_SITTING = 1;
   public static final int TYPICAL_DAY_MOSTLY_STANDING = 2;
   public static final int TYPICAL_DAY_UNDEFINED = Integer.MAX_VALUE;
   public static final int USER_SLEEP_GOAL_UNDEFINED = 0;
   public static final int VO2MAX_SOURCE_DEFAULT = 0;
   public static final int VO2MAX_SOURCE_ESTIMATE = 1;
   public static final int VO2MAX_SOURCE_FITNESSTEST = 3;
   public static final int VO2MAX_SOURCE_UNDEFINED = Integer.MAX_VALUE;
   public static final int VO2MAX_SOURCE_USER = 2;
   public static final int VO2MAX_VALUE_UNDEFINED = 0;
   public static final int WEIGHT_SOURCE_DEFAULT = 0;
   public static final int WEIGHT_SOURCE_MEASURED = 3;
   public static final int WEIGHT_SOURCE_UNDEFINED = Integer.MAX_VALUE;
   public static final int WEIGHT_SOURCE_USER = 2;
   public static final float WEIGHT_VALUE_UNDEFINED = 0.0F;
   private int aerobicThreshold;
   private Date aerobicThresholdLastModified;
   private boolean aerobicThresholdLastModifiedTrusted;
   private int aerobicThresholdSettingSource;
   private int anaerobicThreshold;
   private Date anaerobicThresholdLastModified;
   private boolean anaerobicThresholdLastModifiedTrusted;
   private int anaerobicThresholdSettingSource;
   private String birthday;
   private Date birthdayLastModified;
   private boolean birthdayLastModifiedTrusted;
   private int gender;
   private Date genderLastModified;
   private boolean genderLastModifiedTrusted;
   private float height;
   private Date heightLastModified;
   private boolean heightLastModifiedTrusted;
   private Date lastModified;
   private boolean lastModifiedTrusted;
   private int maximumHeartrate;
   private Date maximumHeartrateLastModified;
   private boolean maximumHeartrateLastModifiedTrusted;
   private int maximumHeartrateSettingSource;
   private int restingHeartrate;
   private Date restingHeartrateLastModified;
   private boolean restingHeartrateLastModifiedTrusted;
   private int restingHeartrateSettingSource;
   private Date snapshotStartTime;
   private int trainingBackground;
   private Date trainingBackgroundLastModified;
   private boolean trainingBackgroundLastModifiedTrusted;
   private int typicalDay;
   private Date typicalDayLastModified;
   private boolean typicalDayLastModifiedTrusted;
   private int userSleepGoalMinutes;
   private int vo2max;
   private Date vo2maxLastModified;
   private boolean vo2maxLastModifiedTrusted;
   private int vo2maxSettingSource;
   private float weeklyRecoveryTimeSum;
   private Date weeklyRecoveryTimeSumLastModified;
   private boolean weeklyRecoveryTimeSumLastModifiedTrusted;
   private float weight;
   private Date weightLastModified;
   private boolean weightLastModifiedTrusted;
   private int weightSettingSource;

   public PhysData() {
      this.birthdayLastModified = null;
      this.birthdayLastModifiedTrusted = false;
      this.gender = Integer.MAX_VALUE;
      this.genderLastModified = null;
      this.genderLastModifiedTrusted = false;
      this.weight = 0.0F;
      this.weightLastModified = null;
      this.weightLastModifiedTrusted = false;
      this.weightSettingSource = Integer.MAX_VALUE;
      this.height = 0.0F;
      this.heightLastModified = null;
      this.heightLastModifiedTrusted = false;
      this.maximumHeartrate = 0;
      this.maximumHeartrateLastModified = null;
      this.maximumHeartrateLastModifiedTrusted = false;
      this.maximumHeartrateSettingSource = Integer.MAX_VALUE;
      this.restingHeartrate = 0;
      this.restingHeartrateLastModified = null;
      this.restingHeartrateLastModifiedTrusted = false;
      this.restingHeartrateSettingSource = Integer.MAX_VALUE;
      this.aerobicThreshold = 0;
      this.aerobicThresholdLastModified = null;
      this.aerobicThresholdLastModifiedTrusted = false;
      this.aerobicThresholdSettingSource = Integer.MAX_VALUE;
      this.anaerobicThreshold = 0;
      this.anaerobicThresholdLastModified = null;
      this.anaerobicThresholdLastModifiedTrusted = false;
      this.anaerobicThresholdSettingSource = Integer.MAX_VALUE;
      this.vo2max = 0;
      this.vo2maxLastModified = null;
      this.vo2maxLastModifiedTrusted = false;
      this.vo2maxSettingSource = Integer.MAX_VALUE;
      this.trainingBackground = Integer.MAX_VALUE;
      this.trainingBackgroundLastModified = null;
      this.trainingBackgroundLastModifiedTrusted = false;
      this.typicalDay = Integer.MAX_VALUE;
      this.typicalDayLastModified = null;
      this.typicalDayLastModifiedTrusted = false;
      this.weeklyRecoveryTimeSum = -1.0F;
      this.weeklyRecoveryTimeSumLastModified = null;
      this.weeklyRecoveryTimeSumLastModifiedTrusted = false;
      this.userSleepGoalMinutes = 0;
      this.setPath("/U/0/S/");
   }

   public PhysData(PhysData$PbUserPhysData var1) {
      this();
      if (var1.hasBirthday()) {
         PhysData$PbUserBirthday var2 = var1.getBirthday();
         if (var2.hasValue()) {
            this.birthday = q.a(var2.getValue());
         }

         if (var2.hasLastModified()) {
            this.birthdayLastModified = q.a(var2.getLastModified());
            this.birthdayLastModifiedTrusted = var2.getLastModified().getTrusted();
         }
      }

      if (var1.hasGender()) {
         PhysData$PbUserGender var3 = var1.getGender();
         if (var3.hasValue()) {
            this.gender = var3.getValue().getNumber();
         }

         if (var3.hasLastModified()) {
            this.genderLastModified = q.a(var3.getLastModified());
            this.genderLastModifiedTrusted = var3.getLastModified().getTrusted();
         }
      }

      if (var1.hasWeight()) {
         PhysData$PbUserWeight var4 = var1.getWeight();
         if (var4.hasValue()) {
            this.weight = var4.getValue();
         }

         if (var4.hasLastModified()) {
            this.weightLastModified = q.a(var4.getLastModified());
            this.weightLastModifiedTrusted = var4.getLastModified().getTrusted();
         }

         if (var4.hasSettingSource()) {
            this.weightSettingSource = var4.getSettingSource().getNumber();
         }
      }

      if (var1.hasHeight()) {
         PhysData$PbUserHeight var5 = var1.getHeight();
         if (var5.hasValue()) {
            this.height = var5.getValue();
         }

         if (var5.hasLastModified()) {
            this.heightLastModified = q.a(var5.getLastModified());
            this.heightLastModifiedTrusted = var5.getLastModified().getTrusted();
         }
      }

      PhysData$PbUserHrAttribute var6;
      if (var1.hasMaximumHeartrate()) {
         var6 = var1.getMaximumHeartrate();
         if (var6.hasValue()) {
            this.maximumHeartrate = var6.getValue();
         }

         if (var6.hasLastModified()) {
            this.maximumHeartrateLastModified = q.a(var6.getLastModified());
            this.maximumHeartrateLastModifiedTrusted = var6.getLastModified().getTrusted();
         }

         if (var6.hasSettingSource()) {
            this.maximumHeartrateSettingSource = var6.getSettingSource().getNumber();
         }
      }

      if (var1.hasRestingHeartrate()) {
         var6 = var1.getRestingHeartrate();
         if (var6.hasValue()) {
            this.restingHeartrate = var6.getValue();
         }

         if (var6.hasLastModified()) {
            this.restingHeartrateLastModified = q.a(var6.getLastModified());
            this.restingHeartrateLastModifiedTrusted = var6.getLastModified().getTrusted();
         }

         if (var6.hasSettingSource()) {
            this.restingHeartrateSettingSource = var6.getSettingSource().getNumber();
         }
      }

      if (var1.hasAerobicThreshold()) {
         var6 = var1.getAerobicThreshold();
         if (var6.hasValue()) {
            this.aerobicThreshold = var6.getValue();
         }

         if (var6.hasLastModified()) {
            this.aerobicThresholdLastModified = q.a(var6.getLastModified());
            this.aerobicThresholdLastModifiedTrusted = var6.getLastModified().getTrusted();
         }

         if (var6.hasSettingSource()) {
            this.aerobicThresholdSettingSource = var6.getSettingSource().getNumber();
         }
      }

      if (var1.hasAnaerobicThreshold()) {
         var6 = var1.getAnaerobicThreshold();
         if (var6.hasValue()) {
            this.anaerobicThreshold = var6.getValue();
         }

         if (var6.hasLastModified()) {
            this.anaerobicThresholdLastModified = q.a(var6.getLastModified());
            this.anaerobicThresholdLastModifiedTrusted = var6.getLastModified().getTrusted();
         }

         if (var6.hasSettingSource()) {
            this.anaerobicThresholdSettingSource = var6.getSettingSource().getNumber();
         }
      }

      if (var1.hasVo2Max()) {
         PhysData$PbUserVo2Max var7 = var1.getVo2Max();
         if (var7.hasValue()) {
            this.vo2max = var7.getValue();
         }

         if (var7.hasLastModified()) {
            this.vo2maxLastModified = q.a(var7.getLastModified());
            this.vo2maxLastModifiedTrusted = var7.getLastModified().getTrusted();
         }

         if (var7.hasSettingSource()) {
            this.vo2maxSettingSource = var7.getSettingSource().getNumber();
         }
      }

      if (var1.hasTrainingBackground()) {
         PhysData$PbUserTrainingBackground var8 = var1.getTrainingBackground();
         if (var8.hasValue()) {
            this.trainingBackground = var8.getValue().getNumber();
         }

         if (var8.hasLastModified()) {
            this.trainingBackgroundLastModified = q.a(var8.getLastModified());
            this.trainingBackgroundLastModifiedTrusted = var8.getLastModified().getTrusted();
         }
      }

      if (var1.hasTypicalDay()) {
         PhysData$PbUserTypicalDay var9 = var1.getTypicalDay();
         if (var9.hasValue()) {
            this.typicalDay = var9.getValue().getNumber();
         }

         if (var9.hasLastModified()) {
            this.typicalDayLastModified = q.a(var9.getLastModified());
            this.typicalDayLastModifiedTrusted = var9.getLastModified().getTrusted();
         }
      }

      if (var1.hasWeeklyRecoveryTimeSum()) {
         PhysData$PbWeeklyRecoveryTimeSum var10 = var1.getWeeklyRecoveryTimeSum();
         if (var10.hasValue()) {
            this.weeklyRecoveryTimeSum = var10.getValue();
         }

         if (var10.hasLastModified()) {
            this.weeklyRecoveryTimeSumLastModified = q.a(var10.getLastModified());
            this.weeklyRecoveryTimeSumLastModifiedTrusted = var10.getLastModified().getTrusted();
         }
      }

      if (var1.hasLastModified()) {
         this.lastModified = q.a(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

      if (var1.hasSnapshotStartTime()) {
         this.snapshotStartTime = q.a(var1.getSnapshotStartTime());
      }

      if (var1.hasSleepGoal()) {
         this.userSleepGoalMinutes = var1.getSleepGoal().getSleepGoalMinutes();
      }

   }

   public PhysData(InputStream var1) {
      this(PhysData$PbUserPhysData.parseFrom(var1));
   }

   private PhysData$PbSleepGoal buildPbSleepGoal() {
      PhysData$PbSleepGoal$Builder var1 = PhysData$PbSleepGoal.newBuilder();
      var1.setSleepGoalMinutes(this.userSleepGoalMinutes);
      return var1.build();
   }

   private PhysData$PbUserBirthday buildPbUserBirthday() {
      PhysData$PbUserBirthday$Builder var1 = PhysData$PbUserBirthday.newBuilder();
      if (!TextUtils.isEmpty(this.birthday)) {
         var1.setValue(q.a(this.birthday));
      }

      if (this.birthdayLastModified != null) {
         var1.setLastModified(q.a(this.birthdayLastModified, this.birthdayLastModifiedTrusted));
      }

      return var1.build();
   }

   private PhysData$PbUserGender buildPbUserGender() {
      PhysData$PbUserGender$Builder var1 = PhysData$PbUserGender.newBuilder();
      if (this.gender != Integer.MAX_VALUE) {
         var1.setValue(PhysData$PbUserGender$Gender.forNumber(this.gender));
      }

      if (this.genderLastModified != null) {
         var1.setLastModified(q.a(this.genderLastModified, this.genderLastModifiedTrusted));
      }

      return var1.build();
   }

   private PhysData$PbUserHeight buildPbUserHeight() {
      PhysData$PbUserHeight$Builder var1 = PhysData$PbUserHeight.newBuilder();
      if (this.height != 0.0F) {
         var1.setValue(this.height);
      }

      if (this.heightLastModified != null) {
         var1.setLastModified(q.a(this.heightLastModified, this.heightLastModifiedTrusted));
      }

      return var1.build();
   }

   private static PhysData$PbUserHrAttribute buildPbUserHr(int var0, Date var1, boolean var2, int var3) {
      PhysData$PbUserHrAttribute$Builder var4 = PhysData$PbUserHrAttribute.newBuilder();
      if (var0 != 0) {
         var4.setValue(var0);
      }

      if (var1 != null) {
         var4.setLastModified(q.a(var1, var2));
      }

      if (var3 != Integer.MAX_VALUE) {
         var4.setSettingSource(PhysData$PbUserHrAttribute$HrSettingSource.forNumber(var3));
      }

      return var4.build();
   }

   private PhysData$PbUserTrainingBackground buildPbUserTrainingBackground() {
      PhysData$PbUserTrainingBackground$Builder var1 = PhysData$PbUserTrainingBackground.newBuilder();
      if (this.trainingBackground != Integer.MAX_VALUE) {
         var1.setValue(PhysData$PbUserTrainingBackground$TrainingBackground.forNumber(this.trainingBackground));
      }

      if (this.trainingBackgroundLastModified != null) {
         var1.setLastModified(q.a(this.trainingBackgroundLastModified, this.trainingBackgroundLastModifiedTrusted));
      }

      return var1.build();
   }

   private PhysData$PbUserTypicalDay buildPbUserTypicalDay() {
      PhysData$PbUserTypicalDay$Builder var1 = PhysData$PbUserTypicalDay.newBuilder();
      if (this.typicalDay != Integer.MAX_VALUE) {
         var1.setValue(PhysData$PbUserTypicalDay$TypicalDay.forNumber(this.typicalDay));
      }

      if (this.typicalDayLastModified != null) {
         var1.setLastModified(q.a(this.typicalDayLastModified, this.typicalDayLastModifiedTrusted));
      }

      return var1.build();
   }

   private PhysData$PbUserVo2Max buildPbUserVo2Max() {
      PhysData$PbUserVo2Max$Builder var1 = PhysData$PbUserVo2Max.newBuilder();
      if (this.vo2max != 0) {
         var1.setValue(this.vo2max);
      }

      if (this.vo2maxLastModified != null) {
         var1.setLastModified(q.a(this.vo2maxLastModified, this.vo2maxLastModifiedTrusted));
      }

      if (this.vo2maxSettingSource != Integer.MAX_VALUE) {
         var1.setSettingSource(PhysData$PbUserVo2Max$Vo2MaxSettingSource.forNumber(this.vo2maxSettingSource));
      }

      return var1.build();
   }

   private PhysData$PbUserWeight buildPbUserWeight() {
      PhysData$PbUserWeight$Builder var1 = PhysData$PbUserWeight.newBuilder();
      if (this.weight != 0.0F) {
         var1.setValue(this.weight);
      }

      if (this.weightLastModified != null) {
         var1.setLastModified(q.a(this.weightLastModified, this.weightLastModifiedTrusted));
      }

      if (this.weightSettingSource != Integer.MAX_VALUE) {
         var1.setSettingSource(PhysData$PbUserWeight$WeightSettingSource.forNumber(this.weightSettingSource));
      }

      return var1.build();
   }

   private PhysData$PbWeeklyRecoveryTimeSum buildPbWeeklyRecoveryTimeSum() {
      PhysData$PbWeeklyRecoveryTimeSum$Builder var1 = PhysData$PbWeeklyRecoveryTimeSum.newBuilder();
      if (this.weeklyRecoveryTimeSum != -1.0F) {
         var1.setValue(this.weeklyRecoveryTimeSum);
      }

      if (this.weeklyRecoveryTimeSumLastModified != null) {
         var1.setLastModified(q.a(this.weeklyRecoveryTimeSumLastModified, this.weeklyRecoveryTimeSumLastModifiedTrusted));
      }

      return var1.build();
   }

   public static int getAge(LocalDate var0) {
      int var1 = 0;
      if (var0 != null) {
         var1 = Years.yearsBetween((ReadablePartial)var0, (ReadablePartial)(new LocalDate())).getYears();
      }

      return var1;
   }

   public static PhysData getUserPhysData() {
      List var0 = find(PhysData.class, "PATH=?", new String[]{"/U/0/S/"});
      PhysData var1;
      switch(var0.size()) {
      case 0:
         var1 = null;
         break;
      case 1:
         var1 = (PhysData)var0.get(0);
         break;
      default:
         d.c(TAG, "", new IllegalStateException("More than one PhysData for user!"));
         var1 = (PhysData)var0.get(0);
      }

      return var1;
   }

   private static boolean isRemoteNewer(Date var0, Date var1, Date var2, Date var3) {
      boolean var4;
      if (var1 != null && var3 != null) {
         var4 = q.a(var1, var3);
      } else {
         var4 = q.a(var0, var2);
      }

      return var4;
   }

   public int getAerobicThreshold() {
      return this.aerobicThreshold;
   }

   public Date getAerobicThresholdLastModified() {
      return this.aerobicThresholdLastModified;
   }

   public int getAerobicThresholdSettingSource() {
      return this.aerobicThresholdSettingSource;
   }

   public int getAge() {
      return getAge(this.getBirthday());
   }

   public int getAnaerobicThreshold() {
      return this.anaerobicThreshold;
   }

   public Date getAnaerobicThresholdLastModified() {
      return this.anaerobicThresholdLastModified;
   }

   public int getAnaerobicThresholdSettingSource() {
      return this.anaerobicThresholdSettingSource;
   }

   public String getBasename() {
      return "PHYSDATA";
   }

   public LocalDate getBirthday() {
      LocalDate var1;
      if (!TextUtils.isEmpty(this.birthday)) {
         var1 = LocalDate.parse(this.birthday, ISODateTimeFormat.basicDate());
      } else {
         var1 = null;
      }

      return var1;
   }

   public Date getBirthdayLastModified() {
      return this.birthdayLastModified;
   }

   public int getGender() {
      return this.gender;
   }

   public Date getGenderLastModified() {
      return this.genderLastModified;
   }

   public float getHeight() {
      return this.height;
   }

   public Date getHeightLastModified() {
      return this.heightLastModified;
   }

   public Date getLastModified() {
      return this.lastModified;
   }

   public int getMaximumHeartrate() {
      return this.maximumHeartrate;
   }

   public Date getMaximumHeartrateLastModified() {
      return this.maximumHeartrateLastModified;
   }

   public int getMaximumHeartrateSettingSource() {
      return this.maximumHeartrateSettingSource;
   }

   public int getRestingHeartrate() {
      return this.restingHeartrate;
   }

   public Date getRestingHeartrateLastModified() {
      return this.restingHeartrateLastModified;
   }

   public int getRestingHeartrateSettingSource() {
      return this.restingHeartrateSettingSource;
   }

   public Date getSnapshotStartTime() {
      return this.snapshotStartTime;
   }

   public int getTrainingBackground() {
      return this.trainingBackground;
   }

   public Date getTrainingBackgroundLastModified() {
      return this.trainingBackgroundLastModified;
   }

   public int getTypicalDay() {
      return this.typicalDay;
   }

   public Date getTypicalDayLastModified() {
      return this.typicalDayLastModified;
   }

   public int getUserSleepGoalMinutes() {
      return this.userSleepGoalMinutes;
   }

   public int getVo2max() {
      return this.vo2max;
   }

   public Date getVo2maxLastModified() {
      return this.vo2maxLastModified;
   }

   public int getVo2maxSettingSource() {
      return this.vo2maxSettingSource;
   }

   public float getWeeklyRecoveryTimeSum() {
      return this.weeklyRecoveryTimeSum;
   }

   public Date getWeeklyRecoveryTimeSumLastModified() {
      return this.weeklyRecoveryTimeSumLastModified;
   }

   public float getWeight() {
      return this.weight;
   }

   public Date getWeightLastModified() {
      return this.weightLastModified;
   }

   public int getWeightSettingSource() {
      return this.weightSettingSource;
   }

   public boolean isAerobicThresholdLastModifiedTrusted() {
      return this.aerobicThresholdLastModifiedTrusted;
   }

   public boolean isAnaerobicThresholdLastModifiedTrusted() {
      return this.anaerobicThresholdLastModifiedTrusted;
   }

   public boolean isBirthdayLastModifiedTrusted() {
      return this.birthdayLastModifiedTrusted;
   }

   public boolean isGenderLastModifiedTrusted() {
      return this.genderLastModifiedTrusted;
   }

   public boolean isHeightLastModifiedTrusted() {
      return this.heightLastModifiedTrusted;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public boolean isMaximumHeartrateLastModifiedTrusted() {
      return this.maximumHeartrateLastModifiedTrusted;
   }

   public boolean isRestingHeartrateLastModifiedTrusted() {
      return this.restingHeartrateLastModifiedTrusted;
   }

   public boolean isTrainingBackgroundLastModifiedTrusted() {
      return this.trainingBackgroundLastModifiedTrusted;
   }

   public boolean isTypicalDayLastModifiedTrusted() {
      return this.typicalDayLastModifiedTrusted;
   }

   public boolean isVo2maxLastModifiedTrusted() {
      return this.vo2maxLastModifiedTrusted;
   }

   public boolean isWeeklyRecoveryTimeSumLastModifiedTrusted() {
      return this.weeklyRecoveryTimeSumLastModifiedTrusted;
   }

   public boolean isWeightLastModifiedTrusted() {
      return this.weightLastModifiedTrusted;
   }

   public void merge(PhysData var1) {
      if (isRemoteNewer(this.lastModified, this.birthdayLastModified, var1.lastModified, var1.birthdayLastModified)) {
         this.birthday = var1.birthday;
         this.birthdayLastModified = var1.birthdayLastModified;
         this.birthdayLastModifiedTrusted = var1.birthdayLastModifiedTrusted;
      }

      if (isRemoteNewer(this.lastModified, this.genderLastModified, var1.lastModified, var1.genderLastModified)) {
         this.gender = var1.gender;
         this.genderLastModified = var1.genderLastModified;
         this.genderLastModifiedTrusted = var1.genderLastModifiedTrusted;
      }

      if (isRemoteNewer(this.lastModified, this.weightLastModified, var1.lastModified, var1.weightLastModified)) {
         this.weight = var1.weight;
         this.weightLastModified = var1.weightLastModified;
         this.weightLastModifiedTrusted = var1.weightLastModifiedTrusted;
         this.weightSettingSource = var1.weightSettingSource;
      }

      if (isRemoteNewer(this.lastModified, this.heightLastModified, var1.lastModified, var1.heightLastModified)) {
         this.height = var1.height;
         this.heightLastModified = var1.heightLastModified;
         this.heightLastModifiedTrusted = var1.heightLastModifiedTrusted;
      }

      if (isRemoteNewer(this.lastModified, this.maximumHeartrateLastModified, var1.lastModified, var1.maximumHeartrateLastModified)) {
         this.maximumHeartrate = var1.maximumHeartrate;
         this.maximumHeartrateLastModified = var1.maximumHeartrateLastModified;
         this.maximumHeartrateLastModifiedTrusted = var1.maximumHeartrateLastModifiedTrusted;
         this.maximumHeartrateSettingSource = var1.maximumHeartrateSettingSource;
      }

      if (isRemoteNewer(this.lastModified, this.restingHeartrateLastModified, var1.lastModified, var1.restingHeartrateLastModified)) {
         this.restingHeartrate = var1.restingHeartrate;
         this.restingHeartrateLastModified = var1.restingHeartrateLastModified;
         this.restingHeartrateLastModifiedTrusted = var1.restingHeartrateLastModifiedTrusted;
         this.restingHeartrateSettingSource = var1.restingHeartrateSettingSource;
      }

      if (isRemoteNewer(this.lastModified, this.aerobicThresholdLastModified, var1.lastModified, var1.aerobicThresholdLastModified)) {
         this.aerobicThreshold = var1.aerobicThreshold;
         this.aerobicThresholdLastModified = var1.aerobicThresholdLastModified;
         this.aerobicThresholdLastModifiedTrusted = var1.aerobicThresholdLastModifiedTrusted;
         this.aerobicThresholdSettingSource = var1.aerobicThresholdSettingSource;
      }

      if (isRemoteNewer(this.lastModified, this.anaerobicThresholdLastModified, var1.lastModified, var1.anaerobicThresholdLastModified)) {
         this.anaerobicThreshold = var1.anaerobicThreshold;
         this.anaerobicThresholdLastModified = var1.anaerobicThresholdLastModified;
         this.anaerobicThresholdLastModifiedTrusted = var1.anaerobicThresholdLastModifiedTrusted;
         this.anaerobicThresholdSettingSource = var1.anaerobicThresholdSettingSource;
      }

      if (isRemoteNewer(this.lastModified, this.vo2maxLastModified, var1.lastModified, var1.vo2maxLastModified)) {
         this.vo2max = var1.vo2max;
         this.vo2maxLastModified = var1.vo2maxLastModified;
         this.vo2maxLastModifiedTrusted = var1.vo2maxLastModifiedTrusted;
         this.vo2maxSettingSource = var1.vo2maxSettingSource;
      }

      if (isRemoteNewer(this.lastModified, this.trainingBackgroundLastModified, var1.lastModified, var1.trainingBackgroundLastModified)) {
         this.trainingBackground = var1.trainingBackground;
         this.trainingBackgroundLastModified = var1.trainingBackgroundLastModified;
         this.trainingBackgroundLastModifiedTrusted = var1.trainingBackgroundLastModifiedTrusted;
      }

      if (isRemoteNewer(this.lastModified, this.typicalDayLastModified, var1.lastModified, var1.typicalDayLastModified)) {
         this.typicalDay = var1.typicalDay;
         this.typicalDayLastModified = var1.typicalDayLastModified;
         this.typicalDayLastModifiedTrusted = var1.typicalDayLastModifiedTrusted;
      }

      if (isRemoteNewer(this.lastModified, this.weeklyRecoveryTimeSumLastModified, var1.lastModified, var1.weeklyRecoveryTimeSumLastModified)) {
         this.weeklyRecoveryTimeSum = var1.weeklyRecoveryTimeSum;
         this.weeklyRecoveryTimeSumLastModified = var1.weeklyRecoveryTimeSumLastModified;
         this.weeklyRecoveryTimeSumLastModifiedTrusted = var1.weeklyRecoveryTimeSumLastModifiedTrusted;
      }

      if (q.a(this.lastModified, var1.lastModified)) {
         this.lastModified = var1.lastModified;
         this.lastModifiedTrusted = var1.lastModifiedTrusted;
         this.userSleepGoalMinutes = var1.userSleepGoalMinutes;
      }

   }

   public void setAerobicThreshold(int var1) {
      this.aerobicThreshold = var1;
   }

   public void setAerobicThresholdLastModified(Date var1, boolean var2) {
      this.aerobicThresholdLastModified = var1;
      this.aerobicThresholdLastModifiedTrusted = var2;
   }

   public void setAerobicThresholdSettingSource(int var1) {
      this.aerobicThresholdSettingSource = var1;
   }

   public void setAnaerobicThreshold(int var1) {
      this.anaerobicThreshold = var1;
   }

   public void setAnaerobicThresholdLastModified(Date var1, boolean var2) {
      this.anaerobicThresholdLastModified = var1;
      this.anaerobicThresholdLastModifiedTrusted = var2;
   }

   public void setAnaerobicThresholdSettingSource(int var1) {
      this.anaerobicThresholdSettingSource = var1;
   }

   public void setBirthday(LocalDate var1) {
      String var2;
      if (var1 != null) {
         var2 = var1.toString(ISODateTimeFormat.basicDate());
      } else {
         var2 = null;
      }

      this.birthday = var2;
   }

   public void setBirthdayLastModified(Date var1, boolean var2) {
      this.birthdayLastModified = var1;
      this.birthdayLastModifiedTrusted = var2;
   }

   public void setGender(int var1) {
      this.gender = var1;
   }

   public void setGenderLastModified(Date var1, boolean var2) {
      this.genderLastModified = var1;
      this.genderLastModifiedTrusted = var2;
   }

   public void setHeight(float var1) {
      this.height = var1;
   }

   public void setHeightLastModified(Date var1, boolean var2) {
      this.heightLastModified = var1;
      this.heightLastModifiedTrusted = var2;
   }

   public void setLastModified(Date var1, boolean var2) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var2;
   }

   public void setMaximumHeartrate(int var1) {
      this.maximumHeartrate = var1;
   }

   public void setMaximumHeartrateLastModified(Date var1, boolean var2) {
      this.maximumHeartrateLastModified = var1;
      this.maximumHeartrateLastModifiedTrusted = var2;
   }

   public void setMaximumHeartrateSettingSource(int var1) {
      this.maximumHeartrateSettingSource = var1;
   }

   public void setRestingHeartrate(int var1) {
      this.restingHeartrate = var1;
   }

   public void setRestingHeartrateLastModified(Date var1, boolean var2) {
      this.restingHeartrateLastModified = var1;
      this.restingHeartrateLastModifiedTrusted = var2;
   }

   public void setRestingHeartrateSettingSource(int var1) {
      this.restingHeartrateSettingSource = var1;
   }

   public void setSnapshotStartTime(Date var1) {
      this.snapshotStartTime = var1;
   }

   public void setTrainingBackground(int var1) {
      this.trainingBackground = var1;
   }

   public void setTrainingBackgroundLastModified(Date var1, boolean var2) {
      this.trainingBackgroundLastModified = var1;
      this.trainingBackgroundLastModifiedTrusted = var2;
   }

   public void setTypicalDay(int var1) {
      this.typicalDay = var1;
   }

   public void setTypicalDayLastModified(Date var1, boolean var2) {
      this.typicalDayLastModified = var1;
      this.typicalDayLastModifiedTrusted = var2;
   }

   public void setUserSleepGoalMinutes(int var1) {
      this.userSleepGoalMinutes = var1;
   }

   public void setVo2max(int var1) {
      this.vo2max = var1;
   }

   public void setVo2maxLastModified(Date var1, boolean var2) {
      this.vo2maxLastModified = var1;
      this.vo2maxLastModifiedTrusted = var2;
   }

   public void setVo2maxSettingSource(int var1) {
      this.vo2maxSettingSource = var1;
   }

   public void setWeeklyRecoveryTimeSum(float var1) {
      this.weeklyRecoveryTimeSum = var1;
   }

   public void setWeeklyRecoveryTimeSumLastModified(Date var1, boolean var2) {
      this.weeklyRecoveryTimeSumLastModified = var1;
      this.weeklyRecoveryTimeSumLastModifiedTrusted = var2;
   }

   public void setWeight(float var1) {
      this.weight = var1;
   }

   public void setWeightLastModified(Date var1, boolean var2) {
      this.weightLastModified = var1;
      this.weightLastModifiedTrusted = var2;
   }

   public void setWeightSettingSource(int var1) {
      this.weightSettingSource = var1;
   }

   public PhysData$PbUserPhysData toPbObject() {
      PhysData$PbUserPhysData$Builder var1 = PhysData$PbUserPhysData.newBuilder();
      if (!TextUtils.isEmpty(this.birthday)) {
         var1.setBirthday(this.buildPbUserBirthday());
      }

      if (this.gender != Integer.MAX_VALUE) {
         var1.setGender(this.buildPbUserGender());
      }

      if (this.weight != 0.0F) {
         var1.setWeight(this.buildPbUserWeight());
      }

      if (this.height != 0.0F) {
         var1.setHeight(this.buildPbUserHeight());
      }

      if (this.maximumHeartrate != 0) {
         var1.setMaximumHeartrate(buildPbUserHr(this.maximumHeartrate, this.maximumHeartrateLastModified, this.maximumHeartrateLastModifiedTrusted, this.maximumHeartrateSettingSource));
      }

      if (this.restingHeartrate != 0) {
         var1.setRestingHeartrate(buildPbUserHr(this.restingHeartrate, this.restingHeartrateLastModified, this.restingHeartrateLastModifiedTrusted, this.restingHeartrateSettingSource));
      }

      if (this.aerobicThreshold != 0) {
         var1.setAerobicThreshold(buildPbUserHr(this.aerobicThreshold, this.aerobicThresholdLastModified, this.aerobicThresholdLastModifiedTrusted, this.aerobicThresholdSettingSource));
      }

      if (this.anaerobicThreshold != 0) {
         var1.setAnaerobicThreshold(buildPbUserHr(this.anaerobicThreshold, this.anaerobicThresholdLastModified, this.anaerobicThresholdLastModifiedTrusted, this.anaerobicThresholdSettingSource));
      }

      if (this.vo2max != 0) {
         var1.setVo2Max(this.buildPbUserVo2Max());
      }

      if (this.trainingBackground != Integer.MAX_VALUE) {
         var1.setTrainingBackground(this.buildPbUserTrainingBackground());
      }

      if (this.typicalDay != Integer.MAX_VALUE) {
         var1.setTypicalDay(this.buildPbUserTypicalDay());
      }

      if (this.weeklyRecoveryTimeSum != -1.0F) {
         var1.setWeeklyRecoveryTimeSum(this.buildPbWeeklyRecoveryTimeSum());
      }

      if (this.lastModified != null) {
         var1.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      if (this.snapshotStartTime != null) {
         var1.setSnapshotStartTime(q.a(this.snapshotStartTime));
      }

      if (this.userSleepGoalMinutes != 0) {
         var1.setSleepGoal(this.buildPbSleepGoal());
      }

      return var1.build();
   }
}
