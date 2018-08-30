package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Structures {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_PbApplicationId_descriptor;
   private static final FieldAccessorTable internal_static_PbApplicationId_fieldAccessorTable;
   private static final Descriptor internal_static_PbBleCharacteristic_descriptor;
   private static final FieldAccessorTable internal_static_PbBleCharacteristic_fieldAccessorTable;
   private static final Descriptor internal_static_PbBleDeviceName_descriptor;
   private static final FieldAccessorTable internal_static_PbBleDeviceName_fieldAccessorTable;
   private static final Descriptor internal_static_PbBleMac_descriptor;
   private static final FieldAccessorTable internal_static_PbBleMac_fieldAccessorTable;
   private static final Descriptor internal_static_PbBleService_descriptor;
   private static final FieldAccessorTable internal_static_PbBleService_fieldAccessorTable;
   private static final Descriptor internal_static_PbBleUuid_descriptor;
   private static final FieldAccessorTable internal_static_PbBleUuid_fieldAccessorTable;
   private static final Descriptor internal_static_PbDeviceId_descriptor;
   private static final FieldAccessorTable internal_static_PbDeviceId_fieldAccessorTable;
   private static final Descriptor internal_static_PbEventId_descriptor;
   private static final FieldAccessorTable internal_static_PbEventId_fieldAccessorTable;
   private static final Descriptor internal_static_PbHeartRateZone_descriptor;
   private static final FieldAccessorTable internal_static_PbHeartRateZone_fieldAccessorTable;
   private static final Descriptor internal_static_PbLanguageId_descriptor;
   private static final FieldAccessorTable internal_static_PbLanguageId_fieldAccessorTable;
   private static final Descriptor internal_static_PbMultiLineText_descriptor;
   private static final FieldAccessorTable internal_static_PbMultiLineText_fieldAccessorTable;
   private static final Descriptor internal_static_PbOneLineText_descriptor;
   private static final FieldAccessorTable internal_static_PbOneLineText_fieldAccessorTable;
   private static final Descriptor internal_static_PbPauseTime_descriptor;
   private static final FieldAccessorTable internal_static_PbPauseTime_fieldAccessorTable;
   private static final Descriptor internal_static_PbPowerZone_descriptor;
   private static final FieldAccessorTable internal_static_PbPowerZone_fieldAccessorTable;
   private static final Descriptor internal_static_PbRouteId_descriptor;
   private static final FieldAccessorTable internal_static_PbRouteId_fieldAccessorTable;
   private static final Descriptor internal_static_PbRunningIndex_descriptor;
   private static final FieldAccessorTable internal_static_PbRunningIndex_fieldAccessorTable;
   private static final Descriptor internal_static_PbSpeedZone_descriptor;
   private static final FieldAccessorTable internal_static_PbSpeedZone_fieldAccessorTable;
   private static final Descriptor internal_static_PbSportIdentifier_descriptor;
   private static final FieldAccessorTable internal_static_PbSportIdentifier_fieldAccessorTable;
   private static final Descriptor internal_static_PbStravaSegmentTarget_descriptor;
   private static final FieldAccessorTable internal_static_PbStravaSegmentTarget_fieldAccessorTable;
   private static final Descriptor internal_static_PbStravaSegmentTargets_descriptor;
   private static final FieldAccessorTable internal_static_PbStravaSegmentTargets_fieldAccessorTable;
   private static final Descriptor internal_static_PbSubcomponentInfo_descriptor;
   private static final FieldAccessorTable internal_static_PbSubcomponentInfo_fieldAccessorTable;
   private static final Descriptor internal_static_PbSwimmingPoolInfo_descriptor;
   private static final FieldAccessorTable internal_static_PbSwimmingPoolInfo_fieldAccessorTable;
   private static final Descriptor internal_static_PbTrainingLoad_descriptor;
   private static final FieldAccessorTable internal_static_PbTrainingLoad_fieldAccessorTable;
   private static final Descriptor internal_static_PbTrainingProgramId_descriptor;
   private static final FieldAccessorTable internal_static_PbTrainingProgramId_fieldAccessorTable;
   private static final Descriptor internal_static_PbTrainingSessionFavoriteId_descriptor;
   private static final FieldAccessorTable internal_static_PbTrainingSessionFavoriteId_fieldAccessorTable;
   private static final Descriptor internal_static_PbTrainingSessionTargetId_descriptor;
   private static final FieldAccessorTable internal_static_PbTrainingSessionTargetId_fieldAccessorTable;
   private static final Descriptor internal_static_PbVersion_descriptor;
   private static final FieldAccessorTable internal_static_PbVersion_fieldAccessorTable;
   private static final Descriptor internal_static_PbVolumeTarget_descriptor;
   private static final FieldAccessorTable internal_static_PbVolumeTarget_fieldAccessorTable;
   private static final Descriptor internal_static_PbZones_descriptor;
   private static final FieldAccessorTable internal_static_PbZones_fieldAccessorTable;

   static {
      Structures$1 var0 = new Structures$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010structures.proto\u001a\u000btypes.proto\u001a\fnanopb.proto\"\u0091\u0002\n\u000ePbVolumeTarget\u00127\n\u000btarget_type\u0018\u0001 \u0002(\u000e2\".PbVolumeTarget.PbVolymeTargetType\u0012\u001d\n\bduration\u0018\u0002 \u0001(\u000b2\u000b.PbDuration\u0012\u0016\n\bdistance\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u00184\u0012\u0016\n\bcalories\u0018\u0004 \u0001(\rB\u0004\u0080µ\u0018J\"w\n\u0012PbVolymeTargetType\u0012\u001f\n\u001bVOLUME_TARGET_TYPE_DURATION\u0010\u0000\u0012\u001f\n\u001bVOLUME_TARGET_TYPE_DISTANCE\u0010\u0001\u0012\u001f\n\u001bVOLUME_TARGET_TYPE_CALORIES\u0010\u0002\"U\n\u0016PbStravaSegmentTargets\u0012\u001d\n\bown_best\u0018\u0001 \u0001(\u000b2\u000b.PbDuration\u0012\u001c\n\u0007kom_qom\u0018\u0002 \u0001(\u000b2\u000b.Pb", "Duration\"ë\u0001\n\u0015PbStravaSegmentTarget\u0012G\n\u0013strava_segment_type\u0018\u0001 \u0002(\u000e2*.PbStravaSegmentTarget.PbStravaSegmentType\u00127\n\u0016strava_segment_targets\u0018\u0002 \u0001(\u000b2\u0017.PbStravaSegmentTargets\"P\n\u0013PbStravaSegmentType\u0012\u001c\n\u0018STRAVA_SEGMENT_TYPE_RIDE\u0010\u0001\u0012\u001b\n\u0017STRAVA_SEGMENT_TYPE_RUN\u0010\u0002\"¹\u0001\n\u000ePbTrainingLoad\u0012\u0019\n\u0011training_load_val\u0018\u0001 \u0001(\r\u0012\"\n\rrecovery_time\u0018\u0002 \u0001(\u000b2\u000b.PbDuration\u0012&\n\u0018carbohydrate_consumption\u0018\u0003 \u0001(\rB\u0004\u0080µ\u0018<\u0012!\n\u0013protein_consumption\u0018\u0004 \u0001(\rB\u0004\u0080", "µ\u0018<\u0012\u001d\n\u000ffat_consumption\u0018\u0005 \u0001(\rB\u0004\u0080µ\u0018<\"H\n\u000fPbHeartRateZone\u0012\u0019\n\u000blower_limit\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018\u0014\u0012\u001a\n\fhigher_limit\u0018\u0002 \u0002(\rB\u0004\u0080µ\u0018\u0014\"D\n\u000bPbSpeedZone\u0012\u0019\n\u000blower_limit\u0018\u0001 \u0002(\u0002B\u0004\u0080µ\u0018\u0017\u0012\u001a\n\fhigher_limit\u0018\u0002 \u0002(\u0002B\u0004\u0080µ\u0018\u0017\"D\n\u000bPbPowerZone\u0012\u0019\n\u000blower_limit\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018\u001a\u0012\u001a\n\fhigher_limit\u0018\u0002 \u0002(\rB\u0004\u0080µ\u0018\u001a\"Á\u0002\n\u0007PbZones\u00120\n\u000fheart_rate_zone\u0018\u0001 \u0003(\u000b2\u0010.PbHeartRateZoneB\u0005\u0092?\u0002\u0010\u0007\u0012'\n\nspeed_zone\u0018\u0002 \u0003(\u000b2\f.PbSpeedZoneB\u0005\u0092?\u0002\u0010\u0007\u0012'\n\npower_zone\u0018\u0003 \u0003(\u000b2\f.PbPowerZoneB\u0005\u0092?\u0002\u0010\u0007\u0012@\n\u0019hear", "t_rate_setting_source\u0018\n \u0001(\u000e2\u001d.PbHeartRateZoneSettingSource\u00127\n\u0014power_setting_source\u0018\u000b \u0001(\u000e2\u0019.PbPowerZoneSettingSource\u00127\n\u0014speed_setting_source\u0018\f \u0001(\u000e2\u0019.PbSpeedZoneSettingSource\"8\n\bPbBleMac\u0012\u0012\n\u0003mac\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\b\u0006\u0012\u0018\n\u0004type\u0018\u0002 \u0002(\u000e2\n.PbMacType\"&\n\u000fPbBleDeviceName\u0012\u0013\n\u0004name\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\b\u001f\"\u001f\n\nPbDeviceId\u0012\u0011\n\tdevice_id\u0018\u0001 \u0002(\t\"L\n\u000ePbRunningIndex\u0012\u0013\n\u0005value\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018>\u0012%\n\u0010calculation_time\u0018\u0002 \u0001(\u000b2\u000b.PbDuration\"\"\n\u0011PbSportIdentifi", "er\u0012\r\n\u0005value\u0018\u0001 \u0002(\u0004\"\u001d\n\rPbOneLineText\u0012\f\n\u0004text\u0018\u0001 \u0002(\t\"\u001f\n\u000fPbMultiLineText\u0012\f\n\u0004text\u0018\u0001 \u0002(\t\"'\n\fPbLanguageId\u0012\u0017\n\blanguage\u0018\u0001 \u0002(\tB\u0005\u0092?\u0002\b\u0003\"T\n\u0019PbTrainingSessionTargetId\u0012\r\n\u0005value\u0018\u0001 \u0002(\u0004\u0012(\n\rlast_modified\u0018\u0002 \u0001(\u000b2\u0011.PbSystemDateTime\"V\n\u001bPbTrainingSessionFavoriteId\u0012\r\n\u0005value\u0018\u0001 \u0002(\u0004\u0012(\n\rlast_modified\u0018\u0002 \u0001(\u000b2\u0011.PbSystemDateTime\"\u001a\n\tPbRouteId\u0012\r\n\u0005value\u0018\u0001 \u0002(\u0004\"[\n\u0012PbSwimmingPoolInfo\u0012\u0013\n\u000bpool_length\u0018\u0001 \u0001(\u0002\u00120\n\u0012swimming_pool_type\u0018\u0002 \u0002(\u000e2\u0014.Pb", "SwimmingPoolUnits\"$\n\u0013PbTrainingProgramId\u0012\r\n\u0005value\u0018\u0001 \u0002(\u0004\"\u001a\n\tPbEventId\u0012\r\n\u0005value\u0018\u0001 \u0002(\u0004\"M\n\u000bPbPauseTime\u0012\u001f\n\nstart_time\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\u0012\u001d\n\bduration\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\" \n\u000fPbApplicationId\u0012\r\n\u0005value\u0018\u0001 \u0002(\u0004\"R\n\tPbVersion\u0012\r\n\u0005major\u0018\u0001 \u0002(\r\u0012\r\n\u0005minor\u0018\u0002 \u0002(\r\u0012\r\n\u0005patch\u0018\u0003 \u0002(\r\u0012\u0018\n\tspecifier\u0018\u0004 \u0001(\tB\u0005\u0092?\u0002\b \"n\n\u0012PbSubcomponentInfo\u0012\f\n\u0004name\u0018\u0001 \u0002(\t\u0012-\n\u0019OBSOLETE_required_version\u0018\u0002 \u0001(\u000b2\n.PbVersion\u0012\u001b\n\u0007version\u0018\u0003 \u0001(\u000b2\n.PbVersion\" \n\tPbBl", "eUuid\u0012\u0013\n\u0004uuid\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\b\u0010\"?\n\u0013PbBleCharacteristic\u0012\u000e\n\u0006handle\u0018\u0001 \u0002(\r\u0012\u0018\n\u0004type\u0018\u0002 \u0002(\u000b2\n.PbBleUuid\"e\n\fPbBleService\u0012\u001f\n\u000bserviceUuid\u0018\u0001 \u0002(\u000b2\n.PbBleUuid\u00124\n\u000fcharacteristics\u0018\u0002 \u0003(\u000b2\u0014.PbBleCharacteristicB\u0005\u0092?\u0002\u0010\nB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_PbVolumeTarget_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_PbVolumeTarget_fieldAccessorTable = new FieldAccessorTable(internal_static_PbVolumeTarget_descriptor, new String[]{"TargetType", "Duration", "Distance", "Calories"});
      internal_static_PbStravaSegmentTargets_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_PbStravaSegmentTargets_fieldAccessorTable = new FieldAccessorTable(internal_static_PbStravaSegmentTargets_descriptor, new String[]{"OwnBest", "KomQom"});
      internal_static_PbStravaSegmentTarget_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_PbStravaSegmentTarget_fieldAccessorTable = new FieldAccessorTable(internal_static_PbStravaSegmentTarget_descriptor, new String[]{"StravaSegmentType", "StravaSegmentTargets"});
      internal_static_PbTrainingLoad_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_PbTrainingLoad_fieldAccessorTable = new FieldAccessorTable(internal_static_PbTrainingLoad_descriptor, new String[]{"TrainingLoadVal", "RecoveryTime", "CarbohydrateConsumption", "ProteinConsumption", "FatConsumption"});
      internal_static_PbHeartRateZone_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_PbHeartRateZone_fieldAccessorTable = new FieldAccessorTable(internal_static_PbHeartRateZone_descriptor, new String[]{"LowerLimit", "HigherLimit"});
      internal_static_PbSpeedZone_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_PbSpeedZone_fieldAccessorTable = new FieldAccessorTable(internal_static_PbSpeedZone_descriptor, new String[]{"LowerLimit", "HigherLimit"});
      internal_static_PbPowerZone_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_PbPowerZone_fieldAccessorTable = new FieldAccessorTable(internal_static_PbPowerZone_descriptor, new String[]{"LowerLimit", "HigherLimit"});
      internal_static_PbZones_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_PbZones_fieldAccessorTable = new FieldAccessorTable(internal_static_PbZones_descriptor, new String[]{"HeartRateZone", "SpeedZone", "PowerZone", "HeartRateSettingSource", "PowerSettingSource", "SpeedSettingSource"});
      internal_static_PbBleMac_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_PbBleMac_fieldAccessorTable = new FieldAccessorTable(internal_static_PbBleMac_descriptor, new String[]{"Mac", "Type"});
      internal_static_PbBleDeviceName_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_PbBleDeviceName_fieldAccessorTable = new FieldAccessorTable(internal_static_PbBleDeviceName_descriptor, new String[]{"Name"});
      internal_static_PbDeviceId_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_PbDeviceId_fieldAccessorTable = new FieldAccessorTable(internal_static_PbDeviceId_descriptor, new String[]{"DeviceId"});
      internal_static_PbRunningIndex_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_PbRunningIndex_fieldAccessorTable = new FieldAccessorTable(internal_static_PbRunningIndex_descriptor, new String[]{"Value", "CalculationTime"});
      internal_static_PbSportIdentifier_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_PbSportIdentifier_fieldAccessorTable = new FieldAccessorTable(internal_static_PbSportIdentifier_descriptor, new String[]{"Value"});
      internal_static_PbOneLineText_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_PbOneLineText_fieldAccessorTable = new FieldAccessorTable(internal_static_PbOneLineText_descriptor, new String[]{"Text"});
      internal_static_PbMultiLineText_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_PbMultiLineText_fieldAccessorTable = new FieldAccessorTable(internal_static_PbMultiLineText_descriptor, new String[]{"Text"});
      internal_static_PbLanguageId_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_PbLanguageId_fieldAccessorTable = new FieldAccessorTable(internal_static_PbLanguageId_descriptor, new String[]{"Language"});
      internal_static_PbTrainingSessionTargetId_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_PbTrainingSessionTargetId_fieldAccessorTable = new FieldAccessorTable(internal_static_PbTrainingSessionTargetId_descriptor, new String[]{"Value", "LastModified"});
      internal_static_PbTrainingSessionFavoriteId_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_PbTrainingSessionFavoriteId_fieldAccessorTable = new FieldAccessorTable(internal_static_PbTrainingSessionFavoriteId_descriptor, new String[]{"Value", "LastModified"});
      internal_static_PbRouteId_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_PbRouteId_fieldAccessorTable = new FieldAccessorTable(internal_static_PbRouteId_descriptor, new String[]{"Value"});
      internal_static_PbSwimmingPoolInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_PbSwimmingPoolInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_PbSwimmingPoolInfo_descriptor, new String[]{"PoolLength", "SwimmingPoolType"});
      internal_static_PbTrainingProgramId_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_PbTrainingProgramId_fieldAccessorTable = new FieldAccessorTable(internal_static_PbTrainingProgramId_descriptor, new String[]{"Value"});
      internal_static_PbEventId_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_PbEventId_fieldAccessorTable = new FieldAccessorTable(internal_static_PbEventId_descriptor, new String[]{"Value"});
      internal_static_PbPauseTime_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_PbPauseTime_fieldAccessorTable = new FieldAccessorTable(internal_static_PbPauseTime_descriptor, new String[]{"StartTime", "Duration"});
      internal_static_PbApplicationId_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_PbApplicationId_fieldAccessorTable = new FieldAccessorTable(internal_static_PbApplicationId_descriptor, new String[]{"Value"});
      internal_static_PbVersion_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_PbVersion_fieldAccessorTable = new FieldAccessorTable(internal_static_PbVersion_descriptor, new String[]{"Major", "Minor", "Patch", "Specifier"});
      internal_static_PbSubcomponentInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_PbSubcomponentInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_PbSubcomponentInfo_descriptor, new String[]{"Name", "OBSOLETERequiredVersion", "Version"});
      internal_static_PbBleUuid_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_PbBleUuid_fieldAccessorTable = new FieldAccessorTable(internal_static_PbBleUuid_descriptor, new String[]{"Uuid"});
      internal_static_PbBleCharacteristic_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_PbBleCharacteristic_fieldAccessorTable = new FieldAccessorTable(internal_static_PbBleCharacteristic_descriptor, new String[]{"Handle", "Type"});
      internal_static_PbBleService_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_PbBleService_fieldAccessorTable = new FieldAccessorTable(internal_static_PbBleService_descriptor, new String[]{"ServiceUuid", "Characteristics"});
      ExtensionRegistry var3 = ExtensionRegistry.newInstance();
      var3.add(Nanopb.nanopb);
      var3.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var3);
      Types.getDescriptor();
      Nanopb.getDescriptor();
   }

   private Structures() {
   }

   // $FF: synthetic method
   static Descriptor A() {
      return internal_static_PbOneLineText_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable B() {
      return internal_static_PbOneLineText_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor C() {
      return internal_static_PbMultiLineText_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable D() {
      return internal_static_PbMultiLineText_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor E() {
      return internal_static_PbLanguageId_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable F() {
      return internal_static_PbLanguageId_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor G() {
      return internal_static_PbTrainingSessionTargetId_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable H() {
      return internal_static_PbTrainingSessionTargetId_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor I() {
      return internal_static_PbTrainingSessionFavoriteId_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable J() {
      return internal_static_PbTrainingSessionFavoriteId_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor K() {
      return internal_static_PbRouteId_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable L() {
      return internal_static_PbRouteId_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor M() {
      return internal_static_PbSwimmingPoolInfo_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable N() {
      return internal_static_PbSwimmingPoolInfo_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor O() {
      return internal_static_PbTrainingProgramId_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable P() {
      return internal_static_PbTrainingProgramId_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor Q() {
      return internal_static_PbEventId_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable R() {
      return internal_static_PbEventId_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor S() {
      return internal_static_PbPauseTime_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable T() {
      return internal_static_PbPauseTime_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor U() {
      return internal_static_PbApplicationId_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable V() {
      return internal_static_PbApplicationId_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor W() {
      return internal_static_PbVersion_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable X() {
      return internal_static_PbVersion_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor Y() {
      return internal_static_PbSubcomponentInfo_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable Z() {
      return internal_static_PbSubcomponentInfo_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_PbVolumeTarget_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static Descriptor aa() {
      return internal_static_PbBleUuid_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable ab() {
      return internal_static_PbBleUuid_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor ac() {
      return internal_static_PbBleCharacteristic_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable ad() {
      return internal_static_PbBleCharacteristic_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor ae() {
      return internal_static_PbBleService_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable af() {
      return internal_static_PbBleService_fieldAccessorTable;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_PbVolumeTarget_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_PbStravaSegmentTargets_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_PbStravaSegmentTargets_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_PbStravaSegmentTarget_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_PbStravaSegmentTarget_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_PbTrainingLoad_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_PbTrainingLoad_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_PbHeartRateZone_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_PbHeartRateZone_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_PbSpeedZone_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_PbSpeedZone_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor m() {
      return internal_static_PbPowerZone_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable n() {
      return internal_static_PbPowerZone_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor o() {
      return internal_static_PbZones_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable p() {
      return internal_static_PbZones_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor q() {
      return internal_static_PbBleMac_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable r() {
      return internal_static_PbBleMac_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   // $FF: synthetic method
   static Descriptor s() {
      return internal_static_PbBleDeviceName_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable t() {
      return internal_static_PbBleDeviceName_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor u() {
      return internal_static_PbDeviceId_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable v() {
      return internal_static_PbDeviceId_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor w() {
      return internal_static_PbRunningIndex_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable x() {
      return internal_static_PbRunningIndex_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor y() {
      return internal_static_PbSportIdentifier_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable z() {
      return internal_static_PbSportIdentifier_fieldAccessorTable;
   }
}
