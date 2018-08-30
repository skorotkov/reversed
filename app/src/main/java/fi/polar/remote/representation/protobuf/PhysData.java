package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class PhysData {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbSleepGoal_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSleepGoal_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSpeedCalibrationOffset_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSpeedCalibrationOffset_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserBirthday_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserBirthday_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserFunctionalThresholdPower_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserFunctionalThresholdPower_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserGender_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserGender_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserHeight_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserHeight_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserHrAttribute_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserHrAttribute_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserPhysData_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserPhysData_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserTrainingBackground_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserTrainingBackground_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserTypicalDay_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserTypicalDay_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserVo2Max_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserVo2Max_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserWeight_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserWeight_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbWeeklyRecoveryTimeSum_descriptor;
   private static final FieldAccessorTable internal_static_data_PbWeeklyRecoveryTimeSum_fieldAccessorTable;

   static {
      PhysData$1 var0 = new PhysData$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013user_physdata.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\"R\n\u000ePbUserBirthday\u0012\u0016\n\u0005value\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\"\u0082\u0001\n\fPbUserGender\u0012(\n\u0005value\u0018\u0001 \u0002(\u000e2\u0019.data.PbUserGender.Gender\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\"\u001e\n\u0006Gender\u0012\b\n\u0004MALE\u0010\u0001\u0012\n\n\u0006FEMALE\u0010\u0002\"\u0087\u0002\n\u0011PbUserHrAttribute\u0012\u0013\n\u0005value\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018\u0014\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\u0012?\n\u000esetting_source\u0018\u0003 \u0001(\u000e2'.data.PbUserHr", "Attribute.HrSettingSource\"r\n\u000fHrSettingSource\u0012\u0012\n\u000eSOURCE_DEFAULT\u0010\u0000\u0012\u0014\n\u0010SOURCE_AGE_BASED\u0010\u0001\u0012\u000f\n\u000bSOURCE_USER\u0010\u0002\u0012\u0013\n\u000fSOURCE_MEASURED\u0010\u0003\u0012\u000f\n\u000bSOURCE_KEEP\u0010\u0004\"Þ\u0001\n\fPbUserWeight\u0012\u0013\n\u0005value\u0018\u0001 \u0002(\u0002B\u0004\u0080µ\u0018\u000b\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\u0012>\n\u000esetting_source\u0018\u0003 \u0001(\u000e2&.data.PbUserWeight.WeightSettingSource\"O\n\u0013WeightSettingSource\u0012\u0012\n\u000eSOURCE_DEFAULT\u0010\u0000\u0012\u000f\n\u000bSOURCE_USER\u0010\u0002\u0012\u0013\n\u000fSOURCE_MEASURED\u0010\u0003\"M\n\fPbUserHeight\u0012\u0013\n\u0005value\u0018\u0001 \u0002(\u0002B\u0004\u0080", "µ\u0018\f\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\"ö\u0001\n\fPbUserVo2Max\u0012\u0013\n\u0005value\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018\r\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\u0012>\n\u000esetting_source\u0018\u0003 \u0001(\u000e2&.data.PbUserVo2Max.Vo2MaxSettingSource\"g\n\u0013Vo2MaxSettingSource\u0012\u0012\n\u000eSOURCE_DEFAULT\u0010\u0000\u0012\u0013\n\u000fSOURCE_ESTIMATE\u0010\u0001\u0012\u000f\n\u000bSOURCE_USER\u0010\u0002\u0012\u0016\n\u0012SOURCE_FITNESSTEST\u0010\u0003\"é\u0001\n\u0018PbUserTrainingBackground\u0012@\n\u0005value\u0018\u0001 \u0002(\u000e21.data.PbUserTrainingBackground.TrainingBackground\u0012(\n\rlast_mo", "dified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\"a\n\u0012TrainingBackground\u0012\u000e\n\nOCCASIONAL\u0010\n\u0012\u000b\n\u0007REGULAR\u0010\u0014\u0012\f\n\bFREQUENT\u0010\u001e\u0012\t\n\u0005HEAVY\u0010(\u0012\f\n\bSEMI_PRO\u00102\u0012\u0007\n\u0003PRO\u0010<\"¸\u0001\n\u0010PbUserTypicalDay\u00120\n\u0005value\u0018\u0001 \u0002(\u000e2!.data.PbUserTypicalDay.TypicalDay\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\"H\n\nTypicalDay\u0012\u0012\n\u000eMOSTLY_SITTING\u0010\u0001\u0012\u0013\n\u000fMOSTLY_STANDING\u0010\u0002\u0012\u0011\n\rMOSTLY_MOVING\u0010\u0003\"R\n\u0017PbWeeklyRecoveryTimeSum\u0012\r\n\u0005value\u0018\u0001 \u0002(\u0002\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTim", "e\"Y\n\u0018PbSpeedCalibrationOffset\u0012\u0013\n\u0005value\u0018\u0001 \u0002(\u0002B\u0004\u0080µ\u0018K\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\"ü\u0001\n\u001ePbUserFunctionalThresholdPower\u0012\u0013\n\u0005value\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018I\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\u0012M\n\u000esetting_source\u0018\u0003 \u0001(\u000e25.data.PbUserFunctionalThresholdPower.FTPSettingSource\"L\n\u0010FTPSettingSource\u0012\u0012\n\u000eSOURCE_DEFAULT\u0010\u0000\u0012\u0013\n\u000fSOURCE_ESTIMATE\u0010\u0001\u0012\u000f\n\u000bSOURCE_USER\u0010\u0002\")\n\u000bPbSleepGoal\u0012\u001a\n\u0012sleep_goal_minutes\u0018\u0001 \u0001(\r\"Ö\u0007\n\u000ePbUse", "rPhysData\u0012&\n\bbirthday\u0018\u0001 \u0002(\u000b2\u0014.data.PbUserBirthday\u0012\"\n\u0006gender\u0018\u0002 \u0002(\u000b2\u0012.data.PbUserGender\u0012\"\n\u0006weight\u0018\u0003 \u0001(\u000b2\u0012.data.PbUserWeight\u0012\"\n\u0006height\u0018\u0004 \u0001(\u000b2\u0012.data.PbUserHeight\u00122\n\u0011maximum_heartrate\u0018\u0005 \u0001(\u000b2\u0017.data.PbUserHrAttribute\u00122\n\u0011resting_heartrate\u0018\u0006 \u0001(\u000b2\u0017.data.PbUserHrAttribute\u0012;\n\u001aOBSOLETE_sitting_heartrate\u0018\u0007 \u0001(\u000b2\u0017.data.PbUserHrAttribute\u00122\n\u0011aerobic_threshold\u0018\b \u0001(\u000b2\u0017.data.PbUserHrAttribute\u00124\n\u0013anaerobic_threshold\u0018\t ", "\u0001(\u000b2\u0017.data.PbUserHrAttribute\u0012\"\n\u0006vo2max\u0018\n \u0001(\u000b2\u0012.data.PbUserVo2Max\u0012;\n\u0013training_background\u0018\u000b \u0001(\u000b2\u001e.data.PbUserTrainingBackground\u0012+\n\u000btypical_day\u0018\f \u0001(\u000b2\u0016.data.PbUserTypicalDay\u0012?\n\u0018weekly_recovery_time_sum\u0018\r \u0001(\u000b2\u001d.data.PbWeeklyRecoveryTimeSum\u0012I\n!OBSOLETE_speed_calibration_offset\u0018\u000e \u0001(\u000b2\u001e.data.PbSpeedCalibrationOffset\u0012H\n\u001afunctional_threshold_power\u0018\u000f \u0001(\u000b2$.data.PbUserFunctionalThresholdPower\u0012=\n\u0019sensor_calib", "ration_offset\u0018\u0010 \u0003(\u000b2\u001a.PbSensorCalibrationOffset\u0012%\n\nsleep_goal\u0018\u0011 \u0001(\u000b2\u0011.data.PbSleepGoal\u0012(\n\rlast_modified\u0018d \u0001(\u000b2\u0011.PbSystemDateTime\u0012-\n\u0013snapshot_start_time\u0018e \u0001(\u000b2\u0010.PbLocalDateTimeB3\n'fi.polar.remote.representation.protobufB\bPhysData"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbUserBirthday_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbUserBirthday_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserBirthday_descriptor, new String[]{"Value", "LastModified"});
      internal_static_data_PbUserGender_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbUserGender_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserGender_descriptor, new String[]{"Value", "LastModified"});
      internal_static_data_PbUserHrAttribute_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbUserHrAttribute_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserHrAttribute_descriptor, new String[]{"Value", "LastModified", "SettingSource"});
      internal_static_data_PbUserWeight_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbUserWeight_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserWeight_descriptor, new String[]{"Value", "LastModified", "SettingSource"});
      internal_static_data_PbUserHeight_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_data_PbUserHeight_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserHeight_descriptor, new String[]{"Value", "LastModified"});
      internal_static_data_PbUserVo2Max_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_data_PbUserVo2Max_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserVo2Max_descriptor, new String[]{"Value", "LastModified", "SettingSource"});
      internal_static_data_PbUserTrainingBackground_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_data_PbUserTrainingBackground_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserTrainingBackground_descriptor, new String[]{"Value", "LastModified"});
      internal_static_data_PbUserTypicalDay_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_data_PbUserTypicalDay_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserTypicalDay_descriptor, new String[]{"Value", "LastModified"});
      internal_static_data_PbWeeklyRecoveryTimeSum_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_data_PbWeeklyRecoveryTimeSum_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbWeeklyRecoveryTimeSum_descriptor, new String[]{"Value", "LastModified"});
      internal_static_data_PbSpeedCalibrationOffset_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_data_PbSpeedCalibrationOffset_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSpeedCalibrationOffset_descriptor, new String[]{"Value", "LastModified"});
      internal_static_data_PbUserFunctionalThresholdPower_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_data_PbUserFunctionalThresholdPower_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserFunctionalThresholdPower_descriptor, new String[]{"Value", "LastModified", "SettingSource"});
      internal_static_data_PbSleepGoal_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_data_PbSleepGoal_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSleepGoal_descriptor, new String[]{"SleepGoalMinutes"});
      internal_static_data_PbUserPhysData_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_data_PbUserPhysData_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserPhysData_descriptor, new String[]{"Birthday", "Gender", "Weight", "Height", "MaximumHeartrate", "RestingHeartrate", "OBSOLETESittingHeartrate", "AerobicThreshold", "AnaerobicThreshold", "Vo2Max", "TrainingBackground", "TypicalDay", "WeeklyRecoveryTimeSum", "OBSOLETESpeedCalibrationOffset", "FunctionalThresholdPower", "SensorCalibrationOffset", "SleepGoal", "LastModified", "SnapshotStartTime"});
      ExtensionRegistry var3 = ExtensionRegistry.newInstance();
      var3.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var3);
      Types.getDescriptor();
      Structures.getDescriptor();
   }

   private PhysData() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbUserBirthday_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbUserBirthday_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbUserGender_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbUserGender_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbUserHrAttribute_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbUserHrAttribute_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbUserWeight_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbUserWeight_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_data_PbUserHeight_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_data_PbUserHeight_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_data_PbUserVo2Max_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_data_PbUserVo2Max_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor m() {
      return internal_static_data_PbUserTrainingBackground_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable n() {
      return internal_static_data_PbUserTrainingBackground_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor o() {
      return internal_static_data_PbUserTypicalDay_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable p() {
      return internal_static_data_PbUserTypicalDay_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor q() {
      return internal_static_data_PbWeeklyRecoveryTimeSum_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable r() {
      return internal_static_data_PbWeeklyRecoveryTimeSum_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   // $FF: synthetic method
   static Descriptor s() {
      return internal_static_data_PbSpeedCalibrationOffset_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable t() {
      return internal_static_data_PbSpeedCalibrationOffset_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor u() {
      return internal_static_data_PbUserFunctionalThresholdPower_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable v() {
      return internal_static_data_PbUserFunctionalThresholdPower_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor w() {
      return internal_static_data_PbSleepGoal_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable x() {
      return internal_static_data_PbSleepGoal_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor y() {
      return internal_static_data_PbUserPhysData_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable z() {
      return internal_static_data_PbUserPhysData_fieldAccessorTable;
   }
}
