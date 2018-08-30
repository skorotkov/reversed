package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class SportProfile$PbSportProfile extends GeneratedMessageV3 implements SportProfile$PbSportProfileOrBuilder {
   public static final int ACE_SETTINGS_FIELD_NUMBER = 202;
   public static final int AEROBIC_THRESHOLD_FIELD_NUMBER = 6;
   public static final int ANAEROBIC_THRESHOLD_FIELD_NUMBER = 7;
   public static final int ARCHER_SETTINGS_FIELD_NUMBER = 204;
   public static final int ASTRA_SETTINGS_FIELD_NUMBER = 205;
   public static final int AUSTIN_SETTINGS_FIELD_NUMBER = 207;
   public static final int AVALON_SETTINGS_FIELD_NUMBER = 203;
   private static final SportProfile$PbSportProfile DEFAULT_INSTANCE = new SportProfile$PbSportProfile();
   public static final int GUITAR_SETTINGS_FIELD_NUMBER = 200;
   public static final int IDENTIFIER_FIELD_NUMBER = 1;
   public static final int LAST_MODIFIED_FIELD_NUMBER = 8;
   public static final int MASERATI_SETTINGS_FIELD_NUMBER = 206;
   public static final int MCLAREN_SETTINGS_FIELD_NUMBER = 201;
   public static final int METRO_SETTINGS_FIELD_NUMBER = 211;
   public static final int OBSOLETE_ALCOR_DISPLAY_SETTINGS_FIELD_NUMBER = 11;
   public static final int OBSOLETE_AUTO_PAUSE_FIELD_NUMBER = 10;
   public static final int OBSOLETE_SIRIUS2_DISPLAY_SETTINGS_FIELD_NUMBER = 4;
   public static final int OBSOLETE_SPRINT_THRESHOLD_FIELD_NUMBER = 9;
   @Deprecated
   public static final Parser PARSER = new SportProfile$PbSportProfile$1();
   public static final int RANGER_SETTINGS_FIELD_NUMBER = 208;
   public static final int SETTINGS_FIELD_NUMBER = 3;
   public static final int SNIPER_SETTINGS_FIELD_NUMBER = 209;
   public static final int SPORT_FACTOR_FIELD_NUMBER = 5;
   public static final int SPORT_IDENTIFIER_FIELD_NUMBER = 2;
   public static final int SPRINT_DETECTION_SETTINGS_FIELD_NUMBER = 12;
   public static final int VECTRA_SETTINGS_FIELD_NUMBER = 210;
   private static final long serialVersionUID = 0L;
   private SportprofileAceSettings$PbAceSportProfileSettings aceSettings_;
   private int aerobicThreshold_;
   private int anaerobicThreshold_;
   private SportprofileArcherSettings$PbArcherSportProfileSettings archerSettings_;
   private SportprofileAstraSettings$PbAstraSportProfileSettings astraSettings_;
   private SportprofileAustinSettings$PbAustinSportProfileSettings austinSettings_;
   private SportprofileAvalonSettings$PbAvalonSportProfileSettings avalonSettings_;
   private int bitField0_;
   private SportprofileGuitarSettings$PbGuitarSportProfileSettings guitarSettings_;
   private long identifier_;
   private Types$PbSystemDateTime lastModified_;
   private SportprofileMaseratiSettings$PbMaseratiSportProfileSettings maseratiSettings_;
   private SportprofileMclarenSettings$PbMcLarenSportProfileSettings mclarenSettings_;
   private byte memoizedIsInitialized;
   private SportprofileMetroSettings$PbMetroSportProfileSettings metroSettings_;
   private SportprofileDisplays$PbAlcorDisplaySettings oBSOLETEAlcorDisplaySettings_;
   private Types$PbAutoPause oBSOLETEAutoPause_;
   private SportprofileDisplays$PbSirius2DisplaySettings oBSOLETESirius2DisplaySettings_;
   private float oBSOLETESprintThreshold_;
   private SportprofileRangerSettings$PbRangerSportProfileSettings rangerSettings_;
   private SportProfile$PbSportProfileSettings settings_;
   private SportprofileSniperSettings$PbSniperSportProfileSettings sniperSettings_;
   private float sportFactor_;
   private Structures$PbSportIdentifier sportIdentifier_;
   private SportProfile$PbSprintDetection sprintDetectionSettings_;
   private SportprofileVectraSettings$PbVectraSportProfileSettings vectraSettings_;

   private SportProfile$PbSportProfile() {
      this.memoizedIsInitialized = (byte)-1;
      this.identifier_ = 0L;
      this.sportFactor_ = 0.0F;
      this.aerobicThreshold_ = 0;
      this.anaerobicThreshold_ = 0;
      this.oBSOLETESprintThreshold_ = 0.0F;
   }

   private SportProfile$PbSportProfile(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportProfile$PbSportProfile(CodedInputStream var1, ExtensionRegistryLite var2, SportProfile$1 var3) {
      this(var1, var2);
   }

   private SportProfile$PbSportProfile(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportProfile$PbSportProfile(Builder var1, SportProfile$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(SportProfile$PbSportProfile var0, float var1) {
      var0.sportFactor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(SportProfile$PbSportProfile var0, int var1) {
      var0.aerobicThreshold_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(SportProfile$PbSportProfile var0, long var1) {
      var0.identifier_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportProfile$PbSportProfile var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static SportProfile$PbSportProfileSettings a(SportProfile$PbSportProfile var0, SportProfile$PbSportProfileSettings var1) {
      var0.settings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportProfile$PbSprintDetection a(SportProfile$PbSportProfile var0, SportProfile$PbSprintDetection var1) {
      var0.sprintDetectionSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileAceSettings$PbAceSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileAceSettings$PbAceSportProfileSettings var1) {
      var0.aceSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileArcherSettings$PbArcherSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileArcherSettings$PbArcherSportProfileSettings var1) {
      var0.archerSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileAstraSettings$PbAstraSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileAstraSettings$PbAstraSportProfileSettings var1) {
      var0.astraSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileAustinSettings$PbAustinSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileAustinSettings$PbAustinSportProfileSettings var1) {
      var0.austinSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileAvalonSettings$PbAvalonSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileAvalonSettings$PbAvalonSportProfileSettings var1) {
      var0.avalonSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileDisplays$PbAlcorDisplaySettings a(SportProfile$PbSportProfile var0, SportprofileDisplays$PbAlcorDisplaySettings var1) {
      var0.oBSOLETEAlcorDisplaySettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileDisplays$PbSirius2DisplaySettings a(SportProfile$PbSportProfile var0, SportprofileDisplays$PbSirius2DisplaySettings var1) {
      var0.oBSOLETESirius2DisplaySettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileGuitarSettings$PbGuitarSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileGuitarSettings$PbGuitarSportProfileSettings var1) {
      var0.guitarSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileMaseratiSettings$PbMaseratiSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var1) {
      var0.maseratiSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileMclarenSettings$PbMcLarenSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileMclarenSettings$PbMcLarenSportProfileSettings var1) {
      var0.mclarenSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileMetroSettings$PbMetroSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileMetroSettings$PbMetroSportProfileSettings var1) {
      var0.metroSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileRangerSettings$PbRangerSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileRangerSettings$PbRangerSportProfileSettings var1) {
      var0.rangerSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileSniperSettings$PbSniperSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileSniperSettings$PbSniperSportProfileSettings var1) {
      var0.sniperSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportprofileVectraSettings$PbVectraSportProfileSettings a(SportProfile$PbSportProfile var0, SportprofileVectraSettings$PbVectraSportProfileSettings var1) {
      var0.vectraSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSportIdentifier a(SportProfile$PbSportProfile var0, Structures$PbSportIdentifier var1) {
      var0.sportIdentifier_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoPause a(SportProfile$PbSportProfile var0, Types$PbAutoPause var1) {
      var0.oBSOLETEAutoPause_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(SportProfile$PbSportProfile var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(SportProfile$PbSportProfile var0, float var1) {
      var0.oBSOLETESprintThreshold_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportProfile$PbSportProfile var0, int var1) {
      var0.anaerobicThreshold_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SportProfile$PbSportProfile var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportProfile$PbSportProfile getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportProfile.g();
   }

   public static SportProfile$PbSportProfile$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportProfile$PbSportProfile$Builder newBuilder(SportProfile$PbSportProfile var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportProfile$PbSportProfile parseDelimitedFrom(InputStream var0) {
      return (SportProfile$PbSportProfile)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSportProfile parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfile)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSportProfile parseFrom(ByteString var0) {
      return (SportProfile$PbSportProfile)PARSER.parseFrom(var0);
   }

   public static SportProfile$PbSportProfile parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfile)PARSER.parseFrom(var0, var1);
   }

   public static SportProfile$PbSportProfile parseFrom(CodedInputStream var0) {
      return (SportProfile$PbSportProfile)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSportProfile parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfile)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSportProfile parseFrom(InputStream var0) {
      return (SportProfile$PbSportProfile)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSportProfile parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfile)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSportProfile parseFrom(byte[] var0) {
      return (SportProfile$PbSportProfile)PARSER.parseFrom(var0);
   }

   public static SportProfile$PbSportProfile parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfile)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportProfile$PbSportProfile)) {
            var2 = super.equals(var1);
         } else {
            SportProfile$PbSportProfile var5 = (SportProfile$PbSportProfile)var1;
            boolean var3;
            if (this.hasIdentifier() == var5.hasIdentifier()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasIdentifier()) {
               if (var3 && this.getIdentifier() == var5.getIdentifier()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSportIdentifier() == var5.hasSportIdentifier()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSportIdentifier()) {
               if (var4 && this.getSportIdentifier().equals(var5.getSportIdentifier())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSettings() == var5.hasSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSettings()) {
               if (var4 && this.getSettings().equals(var5.getSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETESirius2DisplaySettings() == var5.hasOBSOLETESirius2DisplaySettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOBSOLETESirius2DisplaySettings()) {
               if (var3 && this.getOBSOLETESirius2DisplaySettings().equals(var5.getOBSOLETESirius2DisplaySettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSportFactor() == var5.hasSportFactor()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSportFactor()) {
               if (var3 && Float.floatToIntBits(this.getSportFactor()) == Float.floatToIntBits(var5.getSportFactor())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAerobicThreshold() == var5.hasAerobicThreshold()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAerobicThreshold()) {
               if (var4 && this.getAerobicThreshold() == var5.getAerobicThreshold()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAnaerobicThreshold() == var5.hasAnaerobicThreshold()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAnaerobicThreshold()) {
               if (var4 && this.getAnaerobicThreshold() == var5.getAnaerobicThreshold()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasOBSOLETESprintThreshold() == var5.hasOBSOLETESprintThreshold()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETESprintThreshold()) {
               if (var4 && Float.floatToIntBits(this.getOBSOLETESprintThreshold()) == Float.floatToIntBits(var5.getOBSOLETESprintThreshold())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETEAutoPause() == var5.hasOBSOLETEAutoPause()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOBSOLETEAutoPause()) {
               if (var3 && this.getOBSOLETEAutoPause().equals(var5.getOBSOLETEAutoPause())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasOBSOLETEAlcorDisplaySettings() == var5.hasOBSOLETEAlcorDisplaySettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETEAlcorDisplaySettings()) {
               if (var4 && this.getOBSOLETEAlcorDisplaySettings().equals(var5.getOBSOLETEAlcorDisplaySettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSprintDetectionSettings() == var5.hasSprintDetectionSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSprintDetectionSettings()) {
               if (var3 && this.getSprintDetectionSettings().equals(var5.getSprintDetectionSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasGuitarSettings() == var5.hasGuitarSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasGuitarSettings()) {
               if (var3 && this.getGuitarSettings().equals(var5.getGuitarSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMclarenSettings() == var5.hasMclarenSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMclarenSettings()) {
               if (var4 && this.getMclarenSettings().equals(var5.getMclarenSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAceSettings() == var5.hasAceSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAceSettings()) {
               if (var4 && this.getAceSettings().equals(var5.getAceSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAvalonSettings() == var5.hasAvalonSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAvalonSettings()) {
               if (var4 && this.getAvalonSettings().equals(var5.getAvalonSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasArcherSettings() == var5.hasArcherSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasArcherSettings()) {
               if (var4 && this.getArcherSettings().equals(var5.getArcherSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAstraSettings() == var5.hasAstraSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAstraSettings()) {
               if (var3 && this.getAstraSettings().equals(var5.getAstraSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMaseratiSettings() == var5.hasMaseratiSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMaseratiSettings()) {
               if (var3 && this.getMaseratiSettings().equals(var5.getMaseratiSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAustinSettings() == var5.hasAustinSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAustinSettings()) {
               if (var3 && this.getAustinSettings().equals(var5.getAustinSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasRangerSettings() == var5.hasRangerSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasRangerSettings()) {
               if (var4 && this.getRangerSettings().equals(var5.getRangerSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSniperSettings() == var5.hasSniperSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSniperSettings()) {
               if (var4 && this.getSniperSettings().equals(var5.getSniperSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasVectraSettings() == var5.hasVectraSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasVectraSettings()) {
               if (var3 && this.getVectraSettings().equals(var5.getVectraSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMetroSettings() == var5.hasMetroSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMetroSettings()) {
               if (var3 && this.getMetroSettings().equals(var5.getMetroSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings getAceSettings() {
      SportprofileAceSettings$PbAceSportProfileSettings var1;
      if (this.aceSettings_ == null) {
         var1 = SportprofileAceSettings$PbAceSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.aceSettings_;
      }

      return var1;
   }

   public SportprofileAceSettings$PbAceSportProfileSettingsOrBuilder getAceSettingsOrBuilder() {
      SportprofileAceSettings$PbAceSportProfileSettings var1;
      if (this.aceSettings_ == null) {
         var1 = SportprofileAceSettings$PbAceSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.aceSettings_;
      }

      return var1;
   }

   public int getAerobicThreshold() {
      return this.aerobicThreshold_;
   }

   public int getAnaerobicThreshold() {
      return this.anaerobicThreshold_;
   }

   public SportprofileArcherSettings$PbArcherSportProfileSettings getArcherSettings() {
      SportprofileArcherSettings$PbArcherSportProfileSettings var1;
      if (this.archerSettings_ == null) {
         var1 = SportprofileArcherSettings$PbArcherSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.archerSettings_;
      }

      return var1;
   }

   public SportprofileArcherSettings$PbArcherSportProfileSettingsOrBuilder getArcherSettingsOrBuilder() {
      SportprofileArcherSettings$PbArcherSportProfileSettings var1;
      if (this.archerSettings_ == null) {
         var1 = SportprofileArcherSettings$PbArcherSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.archerSettings_;
      }

      return var1;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings getAstraSettings() {
      SportprofileAstraSettings$PbAstraSportProfileSettings var1;
      if (this.astraSettings_ == null) {
         var1 = SportprofileAstraSettings$PbAstraSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.astraSettings_;
      }

      return var1;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettingsOrBuilder getAstraSettingsOrBuilder() {
      SportprofileAstraSettings$PbAstraSportProfileSettings var1;
      if (this.astraSettings_ == null) {
         var1 = SportprofileAstraSettings$PbAstraSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.astraSettings_;
      }

      return var1;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings getAustinSettings() {
      SportprofileAustinSettings$PbAustinSportProfileSettings var1;
      if (this.austinSettings_ == null) {
         var1 = SportprofileAustinSettings$PbAustinSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.austinSettings_;
      }

      return var1;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettingsOrBuilder getAustinSettingsOrBuilder() {
      SportprofileAustinSettings$PbAustinSportProfileSettings var1;
      if (this.austinSettings_ == null) {
         var1 = SportprofileAustinSettings$PbAustinSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.austinSettings_;
      }

      return var1;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings getAvalonSettings() {
      SportprofileAvalonSettings$PbAvalonSportProfileSettings var1;
      if (this.avalonSettings_ == null) {
         var1 = SportprofileAvalonSettings$PbAvalonSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.avalonSettings_;
      }

      return var1;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettingsOrBuilder getAvalonSettingsOrBuilder() {
      SportprofileAvalonSettings$PbAvalonSportProfileSettings var1;
      if (this.avalonSettings_ == null) {
         var1 = SportprofileAvalonSettings$PbAvalonSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.avalonSettings_;
      }

      return var1;
   }

   public SportProfile$PbSportProfile getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings getGuitarSettings() {
      SportprofileGuitarSettings$PbGuitarSportProfileSettings var1;
      if (this.guitarSettings_ == null) {
         var1 = SportprofileGuitarSettings$PbGuitarSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.guitarSettings_;
      }

      return var1;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettingsOrBuilder getGuitarSettingsOrBuilder() {
      SportprofileGuitarSettings$PbGuitarSportProfileSettings var1;
      if (this.guitarSettings_ == null) {
         var1 = SportprofileGuitarSettings$PbGuitarSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.guitarSettings_;
      }

      return var1;
   }

   public long getIdentifier() {
      return this.identifier_;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings getMaseratiSettings() {
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var1;
      if (this.maseratiSettings_ == null) {
         var1 = SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.maseratiSettings_;
      }

      return var1;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettingsOrBuilder getMaseratiSettingsOrBuilder() {
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var1;
      if (this.maseratiSettings_ == null) {
         var1 = SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.maseratiSettings_;
      }

      return var1;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings getMclarenSettings() {
      SportprofileMclarenSettings$PbMcLarenSportProfileSettings var1;
      if (this.mclarenSettings_ == null) {
         var1 = SportprofileMclarenSettings$PbMcLarenSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.mclarenSettings_;
      }

      return var1;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettingsOrBuilder getMclarenSettingsOrBuilder() {
      SportprofileMclarenSettings$PbMcLarenSportProfileSettings var1;
      if (this.mclarenSettings_ == null) {
         var1 = SportprofileMclarenSettings$PbMcLarenSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.mclarenSettings_;
      }

      return var1;
   }

   public SportprofileMetroSettings$PbMetroSportProfileSettings getMetroSettings() {
      SportprofileMetroSettings$PbMetroSportProfileSettings var1;
      if (this.metroSettings_ == null) {
         var1 = SportprofileMetroSettings$PbMetroSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.metroSettings_;
      }

      return var1;
   }

   public SportprofileMetroSettings$PbMetroSportProfileSettingsOrBuilder getMetroSettingsOrBuilder() {
      SportprofileMetroSettings$PbMetroSportProfileSettings var1;
      if (this.metroSettings_ == null) {
         var1 = SportprofileMetroSettings$PbMetroSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.metroSettings_;
      }

      return var1;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings getOBSOLETEAlcorDisplaySettings() {
      SportprofileDisplays$PbAlcorDisplaySettings var1;
      if (this.oBSOLETEAlcorDisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAlcorDisplaySettings_;
      }

      return var1;
   }

   public SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder getOBSOLETEAlcorDisplaySettingsOrBuilder() {
      SportprofileDisplays$PbAlcorDisplaySettings var1;
      if (this.oBSOLETEAlcorDisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAlcorDisplaySettings_;
      }

      return var1;
   }

   public Types$PbAutoPause getOBSOLETEAutoPause() {
      Types$PbAutoPause var1;
      if (this.oBSOLETEAutoPause_ == null) {
         var1 = Types$PbAutoPause.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAutoPause_;
      }

      return var1;
   }

   public Types$PbAutoPauseOrBuilder getOBSOLETEAutoPauseOrBuilder() {
      Types$PbAutoPause var1;
      if (this.oBSOLETEAutoPause_ == null) {
         var1 = Types$PbAutoPause.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAutoPause_;
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings getOBSOLETESirius2DisplaySettings() {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (this.oBSOLETESirius2DisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESirius2DisplaySettings_;
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getOBSOLETESirius2DisplaySettingsOrBuilder() {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (this.oBSOLETESirius2DisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESirius2DisplaySettings_;
      }

      return var1;
   }

   public float getOBSOLETESprintThreshold() {
      return this.oBSOLETESprintThreshold_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings getRangerSettings() {
      SportprofileRangerSettings$PbRangerSportProfileSettings var1;
      if (this.rangerSettings_ == null) {
         var1 = SportprofileRangerSettings$PbRangerSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.rangerSettings_;
      }

      return var1;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettingsOrBuilder getRangerSettingsOrBuilder() {
      SportprofileRangerSettings$PbRangerSportProfileSettings var1;
      if (this.rangerSettings_ == null) {
         var1 = SportprofileRangerSettings$PbRangerSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.rangerSettings_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt64Size(1, this.identifier_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getSportIdentifier());
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeMessageSize(4, this.getOBSOLETESirius2DisplaySettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeFloatSize(5, this.sportFactor_);
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(6, this.aerobicThreshold_);
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(7, this.anaerobicThreshold_);
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeMessageSize(8, this.getLastModified());
         }

         var1 = var2;
         if ((this.bitField0_ & 256) == 256) {
            var1 = var2 + CodedOutputStream.computeFloatSize(9, this.oBSOLETESprintThreshold_);
         }

         var2 = var1;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var1 + CodedOutputStream.computeMessageSize(10, this.getOBSOLETEAutoPause());
         }

         var1 = var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var1 = var2 + CodedOutputStream.computeMessageSize(11, this.getOBSOLETEAlcorDisplaySettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var1 + CodedOutputStream.computeMessageSize(12, this.getSprintDetectionSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 4096) == 4096) {
            var1 = var2 + CodedOutputStream.computeMessageSize(200, this.getGuitarSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 8192) == 8192) {
            var2 = var1 + CodedOutputStream.computeMessageSize(201, this.getMclarenSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 16384) == 16384) {
            var1 = var2 + CodedOutputStream.computeMessageSize(202, this.getAceSettings());
         }

         int var3 = var1;
         if ((this.bitField0_ & '耀') == 32768) {
            var3 = var1 + CodedOutputStream.computeMessageSize(203, this.getAvalonSettings());
         }

         var2 = var3;
         if ((this.bitField0_ & 65536) == 65536) {
            var2 = var3 + CodedOutputStream.computeMessageSize(204, this.getArcherSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 131072) == 131072) {
            var1 = var2 + CodedOutputStream.computeMessageSize(205, this.getAstraSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 262144) == 262144) {
            var2 = var1 + CodedOutputStream.computeMessageSize(206, this.getMaseratiSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 524288) == 524288) {
            var1 = var2 + CodedOutputStream.computeMessageSize(207, this.getAustinSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 1048576) == 1048576) {
            var2 = var1 + CodedOutputStream.computeMessageSize(208, this.getRangerSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 2097152) == 2097152) {
            var1 = var2 + CodedOutputStream.computeMessageSize(209, this.getSniperSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 4194304) == 4194304) {
            var2 = var1 + CodedOutputStream.computeMessageSize(210, this.getVectraSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 8388608) == 8388608) {
            var1 = var2 + CodedOutputStream.computeMessageSize(211, this.getMetroSettings());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public SportProfile$PbSportProfileSettings getSettings() {
      SportProfile$PbSportProfileSettings var1;
      if (this.settings_ == null) {
         var1 = SportProfile$PbSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.settings_;
      }

      return var1;
   }

   public SportProfile$PbSportProfileSettingsOrBuilder getSettingsOrBuilder() {
      SportProfile$PbSportProfileSettings var1;
      if (this.settings_ == null) {
         var1 = SportProfile$PbSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.settings_;
      }

      return var1;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings getSniperSettings() {
      SportprofileSniperSettings$PbSniperSportProfileSettings var1;
      if (this.sniperSettings_ == null) {
         var1 = SportprofileSniperSettings$PbSniperSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.sniperSettings_;
      }

      return var1;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettingsOrBuilder getSniperSettingsOrBuilder() {
      SportprofileSniperSettings$PbSniperSportProfileSettings var1;
      if (this.sniperSettings_ == null) {
         var1 = SportprofileSniperSettings$PbSniperSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.sniperSettings_;
      }

      return var1;
   }

   public float getSportFactor() {
      return this.sportFactor_;
   }

   public Structures$PbSportIdentifier getSportIdentifier() {
      Structures$PbSportIdentifier var1;
      if (this.sportIdentifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sportIdentifier_;
      }

      return var1;
   }

   public Structures$PbSportIdentifierOrBuilder getSportIdentifierOrBuilder() {
      Structures$PbSportIdentifier var1;
      if (this.sportIdentifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sportIdentifier_;
      }

      return var1;
   }

   public SportProfile$PbSprintDetection getSprintDetectionSettings() {
      SportProfile$PbSprintDetection var1;
      if (this.sprintDetectionSettings_ == null) {
         var1 = SportProfile$PbSprintDetection.getDefaultInstance();
      } else {
         var1 = this.sprintDetectionSettings_;
      }

      return var1;
   }

   public SportProfile$PbSprintDetectionOrBuilder getSprintDetectionSettingsOrBuilder() {
      SportProfile$PbSprintDetection var1;
      if (this.sprintDetectionSettings_ == null) {
         var1 = SportProfile$PbSprintDetection.getDefaultInstance();
      } else {
         var1 = this.sprintDetectionSettings_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings getVectraSettings() {
      SportprofileVectraSettings$PbVectraSportProfileSettings var1;
      if (this.vectraSettings_ == null) {
         var1 = SportprofileVectraSettings$PbVectraSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.vectraSettings_;
      }

      return var1;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettingsOrBuilder getVectraSettingsOrBuilder() {
      SportprofileVectraSettings$PbVectraSportProfileSettings var1;
      if (this.vectraSettings_ == null) {
         var1 = SportprofileVectraSettings$PbVectraSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.vectraSettings_;
      }

      return var1;
   }

   public boolean hasAceSettings() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAerobicThreshold() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAnaerobicThreshold() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasArcherSettings() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAstraSettings() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAustinSettings() {
      boolean var1;
      if ((this.bitField0_ & 524288) == 524288) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAvalonSettings() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGuitarSettings() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIdentifier() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaseratiSettings() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMclarenSettings() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMetroSettings() {
      boolean var1;
      if ((this.bitField0_ & 8388608) == 8388608) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEAlcorDisplaySettings() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEAutoPause() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETESirius2DisplaySettings() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETESprintThreshold() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRangerSettings() {
      boolean var1;
      if ((this.bitField0_ & 1048576) == 1048576) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSettings() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSniperSettings() {
      boolean var1;
      if ((this.bitField0_ & 2097152) == 2097152) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportFactor() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportIdentifier() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSprintDetectionSettings() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVectraSettings() {
      boolean var1;
      if ((this.bitField0_ & 4194304) == 4194304) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasIdentifier()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashLong(this.getIdentifier());
         }

         var2 = var1;
         if (this.hasSportIdentifier()) {
            var2 = (var1 * 37 + 2) * 53 + this.getSportIdentifier().hashCode();
         }

         var1 = var2;
         if (this.hasSettings()) {
            var1 = (var2 * 37 + 3) * 53 + this.getSettings().hashCode();
         }

         int var3 = var1;
         if (this.hasOBSOLETESirius2DisplaySettings()) {
            var3 = (var1 * 37 + 4) * 53 + this.getOBSOLETESirius2DisplaySettings().hashCode();
         }

         var2 = var3;
         if (this.hasSportFactor()) {
            var2 = (var3 * 37 + 5) * 53 + Float.floatToIntBits(this.getSportFactor());
         }

         var1 = var2;
         if (this.hasAerobicThreshold()) {
            var1 = (var2 * 37 + 6) * 53 + this.getAerobicThreshold();
         }

         var2 = var1;
         if (this.hasAnaerobicThreshold()) {
            var2 = (var1 * 37 + 7) * 53 + this.getAnaerobicThreshold();
         }

         var1 = var2;
         if (this.hasLastModified()) {
            var1 = (var2 * 37 + 8) * 53 + this.getLastModified().hashCode();
         }

         var2 = var1;
         if (this.hasOBSOLETESprintThreshold()) {
            var2 = (var1 * 37 + 9) * 53 + Float.floatToIntBits(this.getOBSOLETESprintThreshold());
         }

         var1 = var2;
         if (this.hasOBSOLETEAutoPause()) {
            var1 = (var2 * 37 + 10) * 53 + this.getOBSOLETEAutoPause().hashCode();
         }

         var2 = var1;
         if (this.hasOBSOLETEAlcorDisplaySettings()) {
            var2 = (var1 * 37 + 11) * 53 + this.getOBSOLETEAlcorDisplaySettings().hashCode();
         }

         var1 = var2;
         if (this.hasSprintDetectionSettings()) {
            var1 = (var2 * 37 + 12) * 53 + this.getSprintDetectionSettings().hashCode();
         }

         var2 = var1;
         if (this.hasGuitarSettings()) {
            var2 = (var1 * 37 + 200) * 53 + this.getGuitarSettings().hashCode();
         }

         var1 = var2;
         if (this.hasMclarenSettings()) {
            var1 = (var2 * 37 + 201) * 53 + this.getMclarenSettings().hashCode();
         }

         var2 = var1;
         if (this.hasAceSettings()) {
            var2 = (var1 * 37 + 202) * 53 + this.getAceSettings().hashCode();
         }

         var1 = var2;
         if (this.hasAvalonSettings()) {
            var1 = (var2 * 37 + 203) * 53 + this.getAvalonSettings().hashCode();
         }

         var2 = var1;
         if (this.hasArcherSettings()) {
            var2 = (var1 * 37 + 204) * 53 + this.getArcherSettings().hashCode();
         }

         var1 = var2;
         if (this.hasAstraSettings()) {
            var1 = (var2 * 37 + 205) * 53 + this.getAstraSettings().hashCode();
         }

         var2 = var1;
         if (this.hasMaseratiSettings()) {
            var2 = (var1 * 37 + 206) * 53 + this.getMaseratiSettings().hashCode();
         }

         var1 = var2;
         if (this.hasAustinSettings()) {
            var1 = (var2 * 37 + 207) * 53 + this.getAustinSettings().hashCode();
         }

         var2 = var1;
         if (this.hasRangerSettings()) {
            var2 = (var1 * 37 + 208) * 53 + this.getRangerSettings().hashCode();
         }

         var3 = var2;
         if (this.hasSniperSettings()) {
            var3 = (var2 * 37 + 209) * 53 + this.getSniperSettings().hashCode();
         }

         var1 = var3;
         if (this.hasVectraSettings()) {
            var1 = (var3 * 37 + 210) * 53 + this.getVectraSettings().hashCode();
         }

         var2 = var1;
         if (this.hasMetroSettings()) {
            var2 = (var1 * 37 + 211) * 53 + this.getMetroSettings().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportProfile.h().ensureFieldAccessorsInitialized(SportProfile$PbSportProfile.class, SportProfile$PbSportProfile$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSportIdentifier()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getSportIdentifier().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSettings() && !this.getSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasOBSOLETEAutoPause() && !this.getOBSOLETEAutoPause().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSprintDetectionSettings() && !this.getSprintDetectionSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasGuitarSettings() && !this.getGuitarSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasMclarenSettings() && !this.getMclarenSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAceSettings() && !this.getAceSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAvalonSettings() && !this.getAvalonSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasArcherSettings() && !this.getArcherSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasMaseratiSettings() && !this.getMaseratiSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAustinSettings() && !this.getAustinSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSniperSettings() && !this.getSniperSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasMetroSettings() && !this.getMetroSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SportProfile$PbSportProfile$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportProfile$PbSportProfile$Builder newBuilderForType(BuilderParent var1) {
      return new SportProfile$PbSportProfile$Builder(var1, (SportProfile$1)null);
   }

   public SportProfile$PbSportProfile$Builder toBuilder() {
      SportProfile$PbSportProfile$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportProfile$PbSportProfile$Builder((SportProfile$1)null);
      } else {
         var1 = (new SportProfile$PbSportProfile$Builder((SportProfile$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt64(1, this.identifier_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getSportIdentifier());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getSettings());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getOBSOLETESirius2DisplaySettings());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeFloat(5, this.sportFactor_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeUInt32(6, this.aerobicThreshold_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeUInt32(7, this.anaerobicThreshold_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getLastModified());
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeFloat(9, this.oBSOLETESprintThreshold_);
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getOBSOLETEAutoPause());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeMessage(11, this.getOBSOLETEAlcorDisplaySettings());
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeMessage(12, this.getSprintDetectionSettings());
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(200, this.getGuitarSettings());
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeMessage(201, this.getMclarenSettings());
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeMessage(202, this.getAceSettings());
      }

      if ((this.bitField0_ & '耀') == 32768) {
         var1.writeMessage(203, this.getAvalonSettings());
      }

      if ((this.bitField0_ & 65536) == 65536) {
         var1.writeMessage(204, this.getArcherSettings());
      }

      if ((this.bitField0_ & 131072) == 131072) {
         var1.writeMessage(205, this.getAstraSettings());
      }

      if ((this.bitField0_ & 262144) == 262144) {
         var1.writeMessage(206, this.getMaseratiSettings());
      }

      if ((this.bitField0_ & 524288) == 524288) {
         var1.writeMessage(207, this.getAustinSettings());
      }

      if ((this.bitField0_ & 1048576) == 1048576) {
         var1.writeMessage(208, this.getRangerSettings());
      }

      if ((this.bitField0_ & 2097152) == 2097152) {
         var1.writeMessage(209, this.getSniperSettings());
      }

      if ((this.bitField0_ & 4194304) == 4194304) {
         var1.writeMessage(210, this.getVectraSettings());
      }

      if ((this.bitField0_ & 8388608) == 8388608) {
         var1.writeMessage(211, this.getMetroSettings());
      }

      this.unknownFields.writeTo(var1);
   }
}
