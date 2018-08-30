package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileDisplays {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbAlcorDisplaySettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbAlcorDisplaySettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbAlcorTrainingDisplay_descriptor;
   private static final FieldAccessorTable internal_static_data_PbAlcorTrainingDisplay_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSirius2DisplaySettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSirius2DisplaySettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSirius2TrainingDisplay_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSirius2TrainingDisplay_fieldAccessorTable;

   static {
      SportprofileDisplays$1 var0 = new SportprofileDisplays$1();
      FileDescriptor var1 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bsportprofile_displays.proto\u0012\u0004data\u001a\fnanopb.proto\"L\n\u0018PbSirius2TrainingDisplay\u00120\n\u0004item\u0018\u0001 \u0003(\u000e2\u001b.data.PbTrainingDisplayItemB\u0005\u0092?\u0002\u0010\u0004\"\u008e\u0001\n\u0018PbSirius2DisplaySettings\u00126\n\u0007display\u0018\u0001 \u0003(\u000b2\u001e.data.PbSirius2TrainingDisplayB\u0005\u0092?\u0002\u0010\u000e\u0012\u001a\n\u0012last_shown_display\u0018\u0002 \u0001(\r\u0012\u001e\n\u0016added_default_displays\u0018\u0003 \u0001(\r\"J\n\u0016PbAlcorTrainingDisplay\u00120\n\u0004item\u0018\u0001 \u0003(\u000e2\u001b.data.PbTrainingDisplayItemB\u0005\u0092?\u0002\u0010\u0002\"\u008a\u0001\n\u0016PbAlcorDisplaySettings\u00124\n\u0007display\u0018\u0001 \u0003(\u000b2\u001c.data.", "PbAlcorTrainingDisplayB\u0005\u0092?\u0002\u0010\u000e\u0012\u001a\n\u0012last_shown_display\u0018\u0002 \u0001(\r\u0012\u001e\n\u0016added_default_displays\u0018\u0003 \u0001(\r*Ý\u0016\n\u0015PbTrainingDisplayItem\u0012\u000f\n\u000bTIME_OF_DAY\u0010\u0002\u0012\r\n\tSTOPWATCH\u0010\u0003\u0012\u0014\n\u0010CURRENT_LAP_TIME\u0010\u0006\u0012\u0011\n\rLAST_LAP_TIME\u0010\u0007\u0012\u001b\n\u0017LAST_AUTOMATIC_LAP_TIME\u0010\b\u0012\f\n\bALTITUDE\u0010\n\u0012\n\n\u0006ASCENT\u0010\u000b\u0012\u000b\n\u0007DESCENT\u0010\f\u0012\u0010\n\fINCLINOMETER\u0010\r\u0012\u000f\n\u000bTEMPERATURE\u0010\u000f\u0012\u0016\n\u0012CURRENT_LAP_ASCENT\u0010\u0010\u0012\u0017\n\u0013CURRENT_LAP_DESCENT\u0010\u0011\u0012\u0013\n\u000fCURRENT_LAP_VAM\u0010\u0012\u0012\u0016\n\u0012CURRENT_HEART_RATE\u0010\u0014\u0012\u0016\n\u0012AVERAGE_HEA", "RT_RATE\u0010\u0015\u0012\u0016\n\u0012MAXIMUM_HEART_RATE\u0010\u0016\u0012\"\n\u001eCURRENT_LAP_AVERAGE_HEART_RATE\u0010\u0018\u0012\u001e\n\u001aCURRENT_LAP_MAX_HEART_RATE\u0010\u0019\u0012#\n\u001fPREVIOUS_LAP_AVERAGE_HEART_RATE\u0010\u001a\u0012\u001f\n\u001bPREVIOUS_LAP_MAX_HEART_RATE\u0010\u001c\u0012\f\n\bCALORIES\u0010\u001b\u0012\u0010\n\fZONE_POINTER\u0010 \u0012\u0010\n\fTIME_IN_ZONE\u0010!\u0012\u0010\n\fRR_VARIATION\u0010#\u0012\f\n\bDISTANCE\u0010%\u0012\u0018\n\u0014CURRENT_LAP_DISTANCE\u0010&\u0012\u0019\n\u0015PREVIOUS_LAP_DISTANCE\u0010'\u0012\u0011\n\rSPEED_OR_PACE\u0010)\u0012\u0019\n\u0015SPEED_OR_PACE_AVERAGE\u0010*\u0012\u0019\n\u0015SPEED_OR_PACE_MAXIMUM\u0010+\u0012\u001d\n\u0019CURRENT_LAP_SPEED", "_OR_PACE\u0010,\u0012\u0016\n\u0012SPEED_ZONE_POINTER\u0010-\u0012\u0016\n\u0012TIME_IN_SPEED_ZONE\u0010.\u0012!\n\u001dCURRENT_LAP_MAX_PACE_OR_SPEED\u0010/\u0012\"\n\u001ePREVIOUS_LAP_MAX_PACE_OR_SPEED\u00100\u0012\u001f\n\u001aPREVIOUS_LAP_SPEED_OR_PACE\u0010Ü\u0001\u0012\"\n\u001dVERTICAL_SPEED_MOVING_AVERAGE\u0010Ý\u0001\u0012\u000b\n\u0007CADENCE\u00101\u0012\u0013\n\u000fAVERAGE_CADENCE\u00102\u0012\u0014\n\u000fMAXIMUM_CADENCE\u0010ð\u0001\u0012\u0017\n\u0013CURRENT_LAP_CADENCE\u00103\u0012\u001b\n\u0017CURRENT_LAP_MAX_CADENCE\u00104\u0012\u0018\n\u0014PREVIOUS_LAP_CADENCE\u00105\u0012\u0011\n\rSTRIDE_LENGTH\u00106\u0012\u0019\n\u0015AVERAGE_STRIDE_LENGTH\u00107\u0012\u0011\n\rCURRENT_POWER\u00108\u0012", "$\n CURRENT_POWER_LEFT_RIGHT_BALANCE\u00109\u0012\u0011\n\rMAXIMUM_FORCE\u0010:\u0012\u0016\n\u0012POWER_ZONE_POINTER\u0010;\u0012\u0011\n\rAVERAGE_POWER\u0010<\u0012\u0011\n\rMAXIMUM_POWER\u0010=\u0012$\n AVERAGE_POWER_LEFT_RIGHT_BALANCE\u0010>\u0012\u001d\n\u0019CURRENT_LAP_AVERAGE_POWER\u0010?\u0012\u001d\n\u0019CURRENT_LAP_MAXIMUM_POWER\u0010@\u0012(\n$CURRENT_LAP_AVERAGE_POWER_LR_BALANCE\u0010A\u0012\u0016\n\u0012TIME_IN_POWER_ZONE\u0010B\u0012\u001e\n\u001aPREVIOUS_LAP_AVERAGE_POWER\u0010C\u0012\u001e\n\u001aPREVIOUS_LAP_MAXIMUM_POWER\u0010D\u0012*\n%PREVIOUS_LAP_AVERAGE_POWER_LR_BALANCE\u0010æ\u0001\u0012\u001d\n\u0018CURR", "ENT_NORMALIZED_POWER\u0010ç\u0001\u0012#\n\u001eCURRENT_POWER_INTENSITY_FACTOR\u0010è\u0001\u0012(\n#CURRENT_POWER_TRAINING_STRESS_SCORE\u0010é\u0001\u0012!\n\u001cCURRENT_LAP_NORMALIZED_POWER\u0010ê\u0001\u0012'\n\"CURRENT_LAP_POWER_INTENSITY_FACTOR\u0010ë\u0001\u0012,\n'CURRENT_LAP_POWER_TRAINING_STRESS_SCORE\u0010ì\u0001\u0012\"\n\u001dPREVIOUS_LAP_NORMALIZED_POWER\u0010í\u0001\u0012(\n#PREVIOUS_LAP_POWER_INTENSITY_FACTOR\u0010î\u0001\u0012-\n(PREVIOUS_LAP_POWER_TRAINING_STRESS_SCORE\u0010ï\u0001\u0012\r\n\tREST_TIME\u0010E\u0012\u0010\n\fPOOL_COUNTER\u0010F\u0012\u0017\n\u0013MULTISPORT_DUR", "ATION\u0010X\u0012\u0017\n\u0013MULTISPORT_DISTANCE\u0010Y\u0012\u0017\n\u0013MULTISPORT_CALORIES\u0010Z\u0012\u0015\n\u0011MULTISPORT_ASCENT\u0010[\u0012\u0016\n\u0012MULTISPORT_DESCENT\u0010\\\u0012\u0014\n\u0010HEART_RATE_ZONES\u0010d\u0012\u001f\n\u001bMULTISPORT_HEART_RATE_ZONES\u0010e\u0012\u0012\n\u000eLOCATION_GUIDE\u0010f\u0012\u000f\n\u000bPOWER_ZONES\u0010g\u0012\u000f\n\u000bFORCE_GRAPH\u0010h\u0012\u001a\n\u0016TIME_BASED_SPEED_ZONES\u0010i\u0012\u001d\n\u0019DIFFERENCE_TO_MARATHON_WR\u0010j\u0012\u001c\n\u0018COOPER_DISTANCE_ESTIMATE\u0010k\u0012$\n\u001fCURRENT_ALAP_AVERAGE_HEART_RATE\u0010È\u0001\u0012\u0016\n\u0011CURRENT_ALAP_TIME\u0010É\u0001\u0012\u001f\n\u001aCURRENT_ALAP_AVERAGE_POWER\u0010Ê\u0001\u0012\u001f\n", "\u001aCURRENT_ALAP_MAXIMUM_POWER\u0010Ë\u0001\u0012\u001f\n\u001aCURRENT_ALAP_SPEED_OR_PACE\u0010Ì\u0001\u0012\u001a\n\u0015CURRENT_ALAP_DISTANCE\u0010Í\u0001\u0012\u0018\n\u0013CURRENT_ALAP_ASCENT\u0010Î\u0001\u0012\u0019\n\u0014CURRENT_ALAP_DESCENT\u0010Ï\u0001\u0012\u0019\n\u0014CURRENT_ALAP_CADENCE\u0010Ð\u0001\u0012*\n%CURRENT_ALAP_AVERAGE_POWER_LR_BALANCE\u0010Ñ\u0001\u0012 \n\u001bCURRENT_ALAP_MAX_HEART_RATE\u0010Ò\u0001\u0012\u001b\n\u0016CURRENT_ALAP_MAX_SPEED\u0010Ó\u0001\u0012\u001d\n\u0018CURRENT_ALAP_MAX_CADENCE\u0010Ô\u0001\u0012\"\n\u001dCURRENT_ALAP_NORMALIZED_POWER\u0010Õ\u0001\u0012(\n#CURRENT_ALAP_POWER_INTENSITY_FACTOR\u0010Ö\u0001\u0012-\n(CURRENT_A", "LAP_POWER_TRAINING_STRESS_SCORE\u0010Þ\u0001\u0012 \n\u001bPREVIOUS_ALAP_SPEED_OR_PACE\u0010×\u0001\u0012\u001c\n\u0017PREVIOUS_ALAP_MAX_SPEED\u0010Ø\u0001\u0012\u001b\n\u0016PREVIOUS_ALAP_DISTANCE\u0010Ù\u0001\u0012%\n PREVIOUS_ALAP_AVERAGE_HEART_RATE\u0010Ú\u0001\u0012!\n\u001cPREVIOUS_ALAP_MAX_HEART_RATE\u0010Û\u0001B)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1}, var0);
      internal_static_data_PbSirius2TrainingDisplay_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSirius2TrainingDisplay_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSirius2TrainingDisplay_descriptor, new String[]{"Item"});
      internal_static_data_PbSirius2DisplaySettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbSirius2DisplaySettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSirius2DisplaySettings_descriptor, new String[]{"Display", "LastShownDisplay", "AddedDefaultDisplays"});
      internal_static_data_PbAlcorTrainingDisplay_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbAlcorTrainingDisplay_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbAlcorTrainingDisplay_descriptor, new String[]{"Item"});
      internal_static_data_PbAlcorDisplaySettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbAlcorDisplaySettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbAlcorDisplaySettings_descriptor, new String[]{"Display", "LastShownDisplay", "AddedDefaultDisplays"});
      ExtensionRegistry var2 = ExtensionRegistry.newInstance();
      var2.add(Nanopb.nanopb);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var2);
      Nanopb.getDescriptor();
   }

   private SportprofileDisplays() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSirius2TrainingDisplay_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSirius2TrainingDisplay_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbSirius2DisplaySettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbSirius2DisplaySettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbAlcorTrainingDisplay_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbAlcorTrainingDisplay_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbAlcorDisplaySettings_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbAlcorDisplaySettings_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
