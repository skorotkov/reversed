package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Preferences {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbActivityGoalPreferences_descriptor;
   private static final FieldAccessorTable internal_static_data_PbActivityGoalPreferences_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbGeneralPreferences_descriptor;
   private static final FieldAccessorTable internal_static_data_PbGeneralPreferences_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLocalizationPreferences_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLocalizationPreferences_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbTrainingPreferences_descriptor;
   private static final FieldAccessorTable internal_static_data_PbTrainingPreferences_fieldAccessorTable;

   static {
      Preferences$1 var0 = new Preferences$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010user_prefs.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"Ê\u0002\n\u0019PbLocalizationPreferences\u0012&\n\blanguage\u0018\u0001 \u0001(\u000b2\r.PbLanguageIdB\u0005\u0092?\u0002\b\u0003\u0012\"\n\u000bunit_system\u0018\u0002 \u0001(\u000e2\r.PbUnitSystem\u0012\"\n\u000btime_format\u0018\u0003 \u0001(\u000e2\r.PbTimeFormat\u00125\n\u0015time_format_separator\u0018\u0004 \u0001(\u000e2\u0016.PbTimeFormatSeparator\u0012\"\n\u000bdate_format\u0018\u0005 \u0001(\u000e2\r.PbDateFormat\u00125\n\u0015date_format_separator\u0018\u0006 \u0001(\u000e2\u0016.PbDateFormatSeparator\u0012+\n\u0010firstday_of_week\u0018\u0007 \u0001(\u000e2\u0011.PbStartDayOfWe", "ek\"i\n\u0015PbTrainingPreferences\u0012%\n\u001dOBSOLETE_heart_rate_zone_lock\u0018\u0001 \u0001(\r\u0012)\n\u000fheart_rate_view\u0018\u0002 \u0001(\u000e2\u0010.PbHeartRateView\",\n\u0019PbActivityGoalPreferences\u0012\u000f\n\u0007visible\u0018\u0001 \u0002(\b\"\u0082\u0002\n\u0014PbGeneralPreferences\u0012A\n\u0018localization_preferences\u0018\u0001 \u0001(\u000b2\u001f.data.PbLocalizationPreferences\u00129\n\u0014training_preferences\u0018\u0002 \u0001(\u000b2\u001b.data.PbTrainingPreferences\u0012B\n\u0019activity_goal_preferences\u0018\u0003 \u0001(\u000b2\u001f.data.PbActivityGoalPreferences\u0012(\n\rlast_modified\u0018e \u0002(\u000b2\u0011.", "PbSystemDateTimeB6\n'fi.polar.remote.representation.protobufB\u000bPreferences"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbLocalizationPreferences_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbLocalizationPreferences_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLocalizationPreferences_descriptor, new String[]{"Language", "UnitSystem", "TimeFormat", "TimeFormatSeparator", "DateFormat", "DateFormatSeparator", "FirstdayOfWeek"});
      internal_static_data_PbTrainingPreferences_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbTrainingPreferences_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbTrainingPreferences_descriptor, new String[]{"OBSOLETEHeartRateZoneLock", "HeartRateView"});
      internal_static_data_PbActivityGoalPreferences_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbActivityGoalPreferences_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbActivityGoalPreferences_descriptor, new String[]{"Visible"});
      internal_static_data_PbGeneralPreferences_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbGeneralPreferences_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbGeneralPreferences_descriptor, new String[]{"LocalizationPreferences", "TrainingPreferences", "ActivityGoalPreferences", "LastModified"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private Preferences() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbLocalizationPreferences_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbLocalizationPreferences_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbTrainingPreferences_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbTrainingPreferences_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbActivityGoalPreferences_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbActivityGoalPreferences_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbGeneralPreferences_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbGeneralPreferences_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
