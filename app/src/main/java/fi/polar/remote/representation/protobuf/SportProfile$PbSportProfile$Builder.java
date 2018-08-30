package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportProfile$PbSportProfile$Builder extends Builder implements SportProfile$PbSportProfileOrBuilder {
   private SingleFieldBuilderV3 aceSettingsBuilder_;
   private SportprofileAceSettings$PbAceSportProfileSettings aceSettings_;
   private int aerobicThreshold_;
   private int anaerobicThreshold_;
   private SingleFieldBuilderV3 archerSettingsBuilder_;
   private SportprofileArcherSettings$PbArcherSportProfileSettings archerSettings_;
   private SingleFieldBuilderV3 astraSettingsBuilder_;
   private SportprofileAstraSettings$PbAstraSportProfileSettings astraSettings_;
   private SingleFieldBuilderV3 austinSettingsBuilder_;
   private SportprofileAustinSettings$PbAustinSportProfileSettings austinSettings_;
   private SingleFieldBuilderV3 avalonSettingsBuilder_;
   private SportprofileAvalonSettings$PbAvalonSportProfileSettings avalonSettings_;
   private int bitField0_;
   private SingleFieldBuilderV3 guitarSettingsBuilder_;
   private SportprofileGuitarSettings$PbGuitarSportProfileSettings guitarSettings_;
   private long identifier_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 maseratiSettingsBuilder_;
   private SportprofileMaseratiSettings$PbMaseratiSportProfileSettings maseratiSettings_;
   private SingleFieldBuilderV3 mclarenSettingsBuilder_;
   private SportprofileMclarenSettings$PbMcLarenSportProfileSettings mclarenSettings_;
   private SingleFieldBuilderV3 metroSettingsBuilder_;
   private SportprofileMetroSettings$PbMetroSportProfileSettings metroSettings_;
   private SingleFieldBuilderV3 oBSOLETEAlcorDisplaySettingsBuilder_;
   private SportprofileDisplays$PbAlcorDisplaySettings oBSOLETEAlcorDisplaySettings_;
   private SingleFieldBuilderV3 oBSOLETEAutoPauseBuilder_;
   private Types$PbAutoPause oBSOLETEAutoPause_;
   private SingleFieldBuilderV3 oBSOLETESirius2DisplaySettingsBuilder_;
   private SportprofileDisplays$PbSirius2DisplaySettings oBSOLETESirius2DisplaySettings_;
   private float oBSOLETESprintThreshold_;
   private SingleFieldBuilderV3 rangerSettingsBuilder_;
   private SportprofileRangerSettings$PbRangerSportProfileSettings rangerSettings_;
   private SingleFieldBuilderV3 settingsBuilder_;
   private SportProfile$PbSportProfileSettings settings_;
   private SingleFieldBuilderV3 sniperSettingsBuilder_;
   private SportprofileSniperSettings$PbSniperSportProfileSettings sniperSettings_;
   private float sportFactor_;
   private SingleFieldBuilderV3 sportIdentifierBuilder_;
   private Structures$PbSportIdentifier sportIdentifier_;
   private SingleFieldBuilderV3 sprintDetectionSettingsBuilder_;
   private SportProfile$PbSprintDetection sprintDetectionSettings_;
   private SingleFieldBuilderV3 vectraSettingsBuilder_;
   private SportprofileVectraSettings$PbVectraSportProfileSettings vectraSettings_;

   private SportProfile$PbSportProfile$Builder() {
      this.sportIdentifier_ = null;
      this.settings_ = null;
      this.oBSOLETESirius2DisplaySettings_ = null;
      this.lastModified_ = null;
      this.oBSOLETEAutoPause_ = null;
      this.oBSOLETEAlcorDisplaySettings_ = null;
      this.sprintDetectionSettings_ = null;
      this.guitarSettings_ = null;
      this.mclarenSettings_ = null;
      this.aceSettings_ = null;
      this.avalonSettings_ = null;
      this.archerSettings_ = null;
      this.astraSettings_ = null;
      this.maseratiSettings_ = null;
      this.austinSettings_ = null;
      this.rangerSettings_ = null;
      this.sniperSettings_ = null;
      this.vectraSettings_ = null;
      this.metroSettings_ = null;
      this.maybeForceBuilderInitialization();
   }

   private SportProfile$PbSportProfile$Builder(BuilderParent var1) {
      super(var1);
      this.sportIdentifier_ = null;
      this.settings_ = null;
      this.oBSOLETESirius2DisplaySettings_ = null;
      this.lastModified_ = null;
      this.oBSOLETEAutoPause_ = null;
      this.oBSOLETEAlcorDisplaySettings_ = null;
      this.sprintDetectionSettings_ = null;
      this.guitarSettings_ = null;
      this.mclarenSettings_ = null;
      this.aceSettings_ = null;
      this.avalonSettings_ = null;
      this.archerSettings_ = null;
      this.astraSettings_ = null;
      this.maseratiSettings_ = null;
      this.austinSettings_ = null;
      this.rangerSettings_ = null;
      this.sniperSettings_ = null;
      this.vectraSettings_ = null;
      this.metroSettings_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportProfile$PbSportProfile$Builder(BuilderParent var1, SportProfile$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportProfile$PbSportProfile$Builder(SportProfile$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getAceSettingsFieldBuilder() {
      if (this.aceSettingsBuilder_ == null) {
         this.aceSettingsBuilder_ = new SingleFieldBuilderV3(this.getAceSettings(), this.getParentForChildren(), this.isClean());
         this.aceSettings_ = null;
      }

      return this.aceSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getArcherSettingsFieldBuilder() {
      if (this.archerSettingsBuilder_ == null) {
         this.archerSettingsBuilder_ = new SingleFieldBuilderV3(this.getArcherSettings(), this.getParentForChildren(), this.isClean());
         this.archerSettings_ = null;
      }

      return this.archerSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getAstraSettingsFieldBuilder() {
      if (this.astraSettingsBuilder_ == null) {
         this.astraSettingsBuilder_ = new SingleFieldBuilderV3(this.getAstraSettings(), this.getParentForChildren(), this.isClean());
         this.astraSettings_ = null;
      }

      return this.astraSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getAustinSettingsFieldBuilder() {
      if (this.austinSettingsBuilder_ == null) {
         this.austinSettingsBuilder_ = new SingleFieldBuilderV3(this.getAustinSettings(), this.getParentForChildren(), this.isClean());
         this.austinSettings_ = null;
      }

      return this.austinSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getAvalonSettingsFieldBuilder() {
      if (this.avalonSettingsBuilder_ == null) {
         this.avalonSettingsBuilder_ = new SingleFieldBuilderV3(this.getAvalonSettings(), this.getParentForChildren(), this.isClean());
         this.avalonSettings_ = null;
      }

      return this.avalonSettingsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return SportProfile.g();
   }

   private SingleFieldBuilderV3 getGuitarSettingsFieldBuilder() {
      if (this.guitarSettingsBuilder_ == null) {
         this.guitarSettingsBuilder_ = new SingleFieldBuilderV3(this.getGuitarSettings(), this.getParentForChildren(), this.isClean());
         this.guitarSettings_ = null;
      }

      return this.guitarSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getMaseratiSettingsFieldBuilder() {
      if (this.maseratiSettingsBuilder_ == null) {
         this.maseratiSettingsBuilder_ = new SingleFieldBuilderV3(this.getMaseratiSettings(), this.getParentForChildren(), this.isClean());
         this.maseratiSettings_ = null;
      }

      return this.maseratiSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getMclarenSettingsFieldBuilder() {
      if (this.mclarenSettingsBuilder_ == null) {
         this.mclarenSettingsBuilder_ = new SingleFieldBuilderV3(this.getMclarenSettings(), this.getParentForChildren(), this.isClean());
         this.mclarenSettings_ = null;
      }

      return this.mclarenSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getMetroSettingsFieldBuilder() {
      if (this.metroSettingsBuilder_ == null) {
         this.metroSettingsBuilder_ = new SingleFieldBuilderV3(this.getMetroSettings(), this.getParentForChildren(), this.isClean());
         this.metroSettings_ = null;
      }

      return this.metroSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getOBSOLETEAlcorDisplaySettingsFieldBuilder() {
      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ == null) {
         this.oBSOLETEAlcorDisplaySettingsBuilder_ = new SingleFieldBuilderV3(this.getOBSOLETEAlcorDisplaySettings(), this.getParentForChildren(), this.isClean());
         this.oBSOLETEAlcorDisplaySettings_ = null;
      }

      return this.oBSOLETEAlcorDisplaySettingsBuilder_;
   }

   private SingleFieldBuilderV3 getOBSOLETEAutoPauseFieldBuilder() {
      if (this.oBSOLETEAutoPauseBuilder_ == null) {
         this.oBSOLETEAutoPauseBuilder_ = new SingleFieldBuilderV3(this.getOBSOLETEAutoPause(), this.getParentForChildren(), this.isClean());
         this.oBSOLETEAutoPause_ = null;
      }

      return this.oBSOLETEAutoPauseBuilder_;
   }

   private SingleFieldBuilderV3 getOBSOLETESirius2DisplaySettingsFieldBuilder() {
      if (this.oBSOLETESirius2DisplaySettingsBuilder_ == null) {
         this.oBSOLETESirius2DisplaySettingsBuilder_ = new SingleFieldBuilderV3(this.getOBSOLETESirius2DisplaySettings(), this.getParentForChildren(), this.isClean());
         this.oBSOLETESirius2DisplaySettings_ = null;
      }

      return this.oBSOLETESirius2DisplaySettingsBuilder_;
   }

   private SingleFieldBuilderV3 getRangerSettingsFieldBuilder() {
      if (this.rangerSettingsBuilder_ == null) {
         this.rangerSettingsBuilder_ = new SingleFieldBuilderV3(this.getRangerSettings(), this.getParentForChildren(), this.isClean());
         this.rangerSettings_ = null;
      }

      return this.rangerSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getSettingsFieldBuilder() {
      if (this.settingsBuilder_ == null) {
         this.settingsBuilder_ = new SingleFieldBuilderV3(this.getSettings(), this.getParentForChildren(), this.isClean());
         this.settings_ = null;
      }

      return this.settingsBuilder_;
   }

   private SingleFieldBuilderV3 getSniperSettingsFieldBuilder() {
      if (this.sniperSettingsBuilder_ == null) {
         this.sniperSettingsBuilder_ = new SingleFieldBuilderV3(this.getSniperSettings(), this.getParentForChildren(), this.isClean());
         this.sniperSettings_ = null;
      }

      return this.sniperSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getSportIdentifierFieldBuilder() {
      if (this.sportIdentifierBuilder_ == null) {
         this.sportIdentifierBuilder_ = new SingleFieldBuilderV3(this.getSportIdentifier(), this.getParentForChildren(), this.isClean());
         this.sportIdentifier_ = null;
      }

      return this.sportIdentifierBuilder_;
   }

   private SingleFieldBuilderV3 getSprintDetectionSettingsFieldBuilder() {
      if (this.sprintDetectionSettingsBuilder_ == null) {
         this.sprintDetectionSettingsBuilder_ = new SingleFieldBuilderV3(this.getSprintDetectionSettings(), this.getParentForChildren(), this.isClean());
         this.sprintDetectionSettings_ = null;
      }

      return this.sprintDetectionSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getVectraSettingsFieldBuilder() {
      if (this.vectraSettingsBuilder_ == null) {
         this.vectraSettingsBuilder_ = new SingleFieldBuilderV3(this.getVectraSettings(), this.getParentForChildren(), this.isClean());
         this.vectraSettings_ = null;
      }

      return this.vectraSettingsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SportProfile$PbSportProfile.b()) {
         this.getSportIdentifierFieldBuilder();
         this.getSettingsFieldBuilder();
         this.getOBSOLETESirius2DisplaySettingsFieldBuilder();
         this.getLastModifiedFieldBuilder();
         this.getOBSOLETEAutoPauseFieldBuilder();
         this.getOBSOLETEAlcorDisplaySettingsFieldBuilder();
         this.getSprintDetectionSettingsFieldBuilder();
         this.getGuitarSettingsFieldBuilder();
         this.getMclarenSettingsFieldBuilder();
         this.getAceSettingsFieldBuilder();
         this.getAvalonSettingsFieldBuilder();
         this.getArcherSettingsFieldBuilder();
         this.getAstraSettingsFieldBuilder();
         this.getMaseratiSettingsFieldBuilder();
         this.getAustinSettingsFieldBuilder();
         this.getRangerSettingsFieldBuilder();
         this.getSniperSettingsFieldBuilder();
         this.getVectraSettingsFieldBuilder();
         this.getMetroSettingsFieldBuilder();
      }

   }

   public SportProfile$PbSportProfile$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportProfile$PbSportProfile$Builder)super.addRepeatedField(var1, var2);
   }

   public SportProfile$PbSportProfile build() {
      SportProfile$PbSportProfile var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportProfile$PbSportProfile buildPartial() {
      SportProfile$PbSportProfile var1 = new SportProfile$PbSportProfile(this, (SportProfile$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      SportProfile$PbSportProfile.a(var1, this.identifier_);
      int var4;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      } else {
         var4 = var3;
      }

      if (this.sportIdentifierBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.sportIdentifier_);
      } else {
         SportProfile$PbSportProfile.a(var1, (Structures$PbSportIdentifier)this.sportIdentifierBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.settingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.settings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportProfile$PbSportProfileSettings)this.settingsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 8) == 8) {
         var4 = var6 | 8;
      }

      if (this.oBSOLETESirius2DisplaySettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.oBSOLETESirius2DisplaySettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileDisplays$PbSirius2DisplaySettings)this.oBSOLETESirius2DisplaySettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 16) == 16) {
         var6 = var4 | 16;
      }

      SportProfile$PbSportProfile.a(var1, this.sportFactor_);
      var4 = var6;
      if ((var2 & 32) == 32) {
         var4 = var6 | 32;
      }

      SportProfile$PbSportProfile.a(var1, this.aerobicThreshold_);
      var6 = var4;
      if ((var2 & 64) == 64) {
         var6 = var4 | 64;
      }

      SportProfile$PbSportProfile.b(var1, this.anaerobicThreshold_);
      var4 = var6;
      if ((var2 & 128) == 128) {
         var4 = var6 | 128;
      }

      if (this.lastModifiedBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.lastModified_);
      } else {
         SportProfile$PbSportProfile.a(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 256) == 256) {
         var5 = var4 | 256;
      }

      SportProfile$PbSportProfile.b(var1, this.oBSOLETESprintThreshold_);
      var6 = var5;
      if ((var2 & 512) == 512) {
         var6 = var5 | 512;
      }

      if (this.oBSOLETEAutoPauseBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.oBSOLETEAutoPause_);
      } else {
         SportProfile$PbSportProfile.a(var1, (Types$PbAutoPause)this.oBSOLETEAutoPauseBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 1024) == 1024) {
         var4 = var6 | 1024;
      }

      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.oBSOLETEAlcorDisplaySettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileDisplays$PbAlcorDisplaySettings)this.oBSOLETEAlcorDisplaySettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 2048) == 2048) {
         var6 = var4 | 2048;
      }

      if (this.sprintDetectionSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.sprintDetectionSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportProfile$PbSprintDetection)this.sprintDetectionSettingsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 4096) == 4096) {
         var4 = var6 | 4096;
      }

      if (this.guitarSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.guitarSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileGuitarSettings$PbGuitarSportProfileSettings)this.guitarSettingsBuilder_.build());
      }

      var5 = var4;
      if ((var2 & 8192) == 8192) {
         var5 = var4 | 8192;
      }

      if (this.mclarenSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.mclarenSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileMclarenSettings$PbMcLarenSportProfileSettings)this.mclarenSettingsBuilder_.build());
      }

      var6 = var5;
      if ((var2 & 16384) == 16384) {
         var6 = var5 | 16384;
      }

      if (this.aceSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.aceSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileAceSettings$PbAceSportProfileSettings)this.aceSettingsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & '耀') == 32768) {
         var4 = var6 | '耀';
      }

      if (this.avalonSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.avalonSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileAvalonSettings$PbAvalonSportProfileSettings)this.avalonSettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 65536) == 65536) {
         var6 = var4 | 65536;
      }

      if (this.archerSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.archerSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileArcherSettings$PbArcherSportProfileSettings)this.archerSettingsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 131072) == 131072) {
         var4 = var6 | 131072;
      }

      if (this.astraSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.astraSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileAstraSettings$PbAstraSportProfileSettings)this.astraSettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 262144) == 262144) {
         var6 = var4 | 262144;
      }

      if (this.maseratiSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.maseratiSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)this.maseratiSettingsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 524288) == 524288) {
         var4 = var6 | 524288;
      }

      if (this.austinSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.austinSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileAustinSettings$PbAustinSportProfileSettings)this.austinSettingsBuilder_.build());
      }

      var6 = var4;
      if ((1048576 & var2) == 1048576) {
         var6 = var4 | 1048576;
      }

      if (this.rangerSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.rangerSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileRangerSettings$PbRangerSportProfileSettings)this.rangerSettingsBuilder_.build());
      }

      var4 = var6;
      if ((2097152 & var2) == 2097152) {
         var4 = var6 | 2097152;
      }

      if (this.sniperSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.sniperSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileSniperSettings$PbSniperSportProfileSettings)this.sniperSettingsBuilder_.build());
      }

      var6 = var4;
      if ((4194304 & var2) == 4194304) {
         var6 = var4 | 4194304;
      }

      if (this.vectraSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.vectraSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileVectraSettings$PbVectraSportProfileSettings)this.vectraSettingsBuilder_.build());
      }

      var4 = var6;
      if ((8388608 & var2) == 8388608) {
         var4 = var6 | 8388608;
      }

      if (this.metroSettingsBuilder_ == null) {
         SportProfile$PbSportProfile.a(var1, this.metroSettings_);
      } else {
         SportProfile$PbSportProfile.a(var1, (SportprofileMetroSettings$PbMetroSportProfileSettings)this.metroSettingsBuilder_.build());
      }

      SportProfile$PbSportProfile.c(var1, var4);
      this.onBuilt();
      return var1;
   }

   public SportProfile$PbSportProfile$Builder clear() {
      super.clear();
      this.identifier_ = 0L;
      this.bitField0_ &= -2;
      if (this.sportIdentifierBuilder_ == null) {
         this.sportIdentifier_ = null;
      } else {
         this.sportIdentifierBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.settingsBuilder_ == null) {
         this.settings_ = null;
      } else {
         this.settingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.oBSOLETESirius2DisplaySettingsBuilder_ == null) {
         this.oBSOLETESirius2DisplaySettings_ = null;
      } else {
         this.oBSOLETESirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      this.sportFactor_ = 0.0F;
      this.bitField0_ &= -17;
      this.aerobicThreshold_ = 0;
      this.bitField0_ &= -33;
      this.anaerobicThreshold_ = 0;
      this.bitField0_ &= -65;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -129;
      this.oBSOLETESprintThreshold_ = 0.0F;
      this.bitField0_ &= -257;
      if (this.oBSOLETEAutoPauseBuilder_ == null) {
         this.oBSOLETEAutoPause_ = null;
      } else {
         this.oBSOLETEAutoPauseBuilder_.clear();
      }

      this.bitField0_ &= -513;
      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ == null) {
         this.oBSOLETEAlcorDisplaySettings_ = null;
      } else {
         this.oBSOLETEAlcorDisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      if (this.sprintDetectionSettingsBuilder_ == null) {
         this.sprintDetectionSettings_ = null;
      } else {
         this.sprintDetectionSettingsBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      if (this.guitarSettingsBuilder_ == null) {
         this.guitarSettings_ = null;
      } else {
         this.guitarSettingsBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      if (this.mclarenSettingsBuilder_ == null) {
         this.mclarenSettings_ = null;
      } else {
         this.mclarenSettingsBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      if (this.aceSettingsBuilder_ == null) {
         this.aceSettings_ = null;
      } else {
         this.aceSettingsBuilder_.clear();
      }

      this.bitField0_ &= -16385;
      if (this.avalonSettingsBuilder_ == null) {
         this.avalonSettings_ = null;
      } else {
         this.avalonSettingsBuilder_.clear();
      }

      this.bitField0_ &= -32769;
      if (this.archerSettingsBuilder_ == null) {
         this.archerSettings_ = null;
      } else {
         this.archerSettingsBuilder_.clear();
      }

      this.bitField0_ &= -65537;
      if (this.astraSettingsBuilder_ == null) {
         this.astraSettings_ = null;
      } else {
         this.astraSettingsBuilder_.clear();
      }

      this.bitField0_ &= -131073;
      if (this.maseratiSettingsBuilder_ == null) {
         this.maseratiSettings_ = null;
      } else {
         this.maseratiSettingsBuilder_.clear();
      }

      this.bitField0_ &= -262145;
      if (this.austinSettingsBuilder_ == null) {
         this.austinSettings_ = null;
      } else {
         this.austinSettingsBuilder_.clear();
      }

      this.bitField0_ &= -524289;
      if (this.rangerSettingsBuilder_ == null) {
         this.rangerSettings_ = null;
      } else {
         this.rangerSettingsBuilder_.clear();
      }

      this.bitField0_ &= -1048577;
      if (this.sniperSettingsBuilder_ == null) {
         this.sniperSettings_ = null;
      } else {
         this.sniperSettingsBuilder_.clear();
      }

      this.bitField0_ &= -2097153;
      if (this.vectraSettingsBuilder_ == null) {
         this.vectraSettings_ = null;
      } else {
         this.vectraSettingsBuilder_.clear();
      }

      this.bitField0_ &= -4194305;
      if (this.metroSettingsBuilder_ == null) {
         this.metroSettings_ = null;
      } else {
         this.metroSettingsBuilder_.clear();
      }

      this.bitField0_ &= -8388609;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearAceSettings() {
      if (this.aceSettingsBuilder_ == null) {
         this.aceSettings_ = null;
         this.onChanged();
      } else {
         this.aceSettingsBuilder_.clear();
      }

      this.bitField0_ &= -16385;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearAerobicThreshold() {
      this.bitField0_ &= -33;
      this.aerobicThreshold_ = 0;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearAnaerobicThreshold() {
      this.bitField0_ &= -65;
      this.anaerobicThreshold_ = 0;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearArcherSettings() {
      if (this.archerSettingsBuilder_ == null) {
         this.archerSettings_ = null;
         this.onChanged();
      } else {
         this.archerSettingsBuilder_.clear();
      }

      this.bitField0_ &= -65537;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearAstraSettings() {
      if (this.astraSettingsBuilder_ == null) {
         this.astraSettings_ = null;
         this.onChanged();
      } else {
         this.astraSettingsBuilder_.clear();
      }

      this.bitField0_ &= -131073;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearAustinSettings() {
      if (this.austinSettingsBuilder_ == null) {
         this.austinSettings_ = null;
         this.onChanged();
      } else {
         this.austinSettingsBuilder_.clear();
      }

      this.bitField0_ &= -524289;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearAvalonSettings() {
      if (this.avalonSettingsBuilder_ == null) {
         this.avalonSettings_ = null;
         this.onChanged();
      } else {
         this.avalonSettingsBuilder_.clear();
      }

      this.bitField0_ &= -32769;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearField(FieldDescriptor var1) {
      return (SportProfile$PbSportProfile$Builder)super.clearField(var1);
   }

   public SportProfile$PbSportProfile$Builder clearGuitarSettings() {
      if (this.guitarSettingsBuilder_ == null) {
         this.guitarSettings_ = null;
         this.onChanged();
      } else {
         this.guitarSettingsBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearIdentifier() {
      this.bitField0_ &= -2;
      this.identifier_ = 0L;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearMaseratiSettings() {
      if (this.maseratiSettingsBuilder_ == null) {
         this.maseratiSettings_ = null;
         this.onChanged();
      } else {
         this.maseratiSettingsBuilder_.clear();
      }

      this.bitField0_ &= -262145;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearMclarenSettings() {
      if (this.mclarenSettingsBuilder_ == null) {
         this.mclarenSettings_ = null;
         this.onChanged();
      } else {
         this.mclarenSettingsBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearMetroSettings() {
      if (this.metroSettingsBuilder_ == null) {
         this.metroSettings_ = null;
         this.onChanged();
      } else {
         this.metroSettingsBuilder_.clear();
      }

      this.bitField0_ &= -8388609;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearOBSOLETEAlcorDisplaySettings() {
      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ == null) {
         this.oBSOLETEAlcorDisplaySettings_ = null;
         this.onChanged();
      } else {
         this.oBSOLETEAlcorDisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearOBSOLETEAutoPause() {
      if (this.oBSOLETEAutoPauseBuilder_ == null) {
         this.oBSOLETEAutoPause_ = null;
         this.onChanged();
      } else {
         this.oBSOLETEAutoPauseBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearOBSOLETESirius2DisplaySettings() {
      if (this.oBSOLETESirius2DisplaySettingsBuilder_ == null) {
         this.oBSOLETESirius2DisplaySettings_ = null;
         this.onChanged();
      } else {
         this.oBSOLETESirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearOBSOLETESprintThreshold() {
      this.bitField0_ &= -257;
      this.oBSOLETESprintThreshold_ = 0.0F;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearOneof(OneofDescriptor var1) {
      return (SportProfile$PbSportProfile$Builder)super.clearOneof(var1);
   }

   public SportProfile$PbSportProfile$Builder clearRangerSettings() {
      if (this.rangerSettingsBuilder_ == null) {
         this.rangerSettings_ = null;
         this.onChanged();
      } else {
         this.rangerSettingsBuilder_.clear();
      }

      this.bitField0_ &= -1048577;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearSettings() {
      if (this.settingsBuilder_ == null) {
         this.settings_ = null;
         this.onChanged();
      } else {
         this.settingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearSniperSettings() {
      if (this.sniperSettingsBuilder_ == null) {
         this.sniperSettings_ = null;
         this.onChanged();
      } else {
         this.sniperSettingsBuilder_.clear();
      }

      this.bitField0_ &= -2097153;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearSportFactor() {
      this.bitField0_ &= -17;
      this.sportFactor_ = 0.0F;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearSportIdentifier() {
      if (this.sportIdentifierBuilder_ == null) {
         this.sportIdentifier_ = null;
         this.onChanged();
      } else {
         this.sportIdentifierBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearSprintDetectionSettings() {
      if (this.sprintDetectionSettingsBuilder_ == null) {
         this.sprintDetectionSettings_ = null;
         this.onChanged();
      } else {
         this.sprintDetectionSettingsBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clearVectraSettings() {
      if (this.vectraSettingsBuilder_ == null) {
         this.vectraSettings_ = null;
         this.onChanged();
      } else {
         this.vectraSettingsBuilder_.clear();
      }

      this.bitField0_ &= -4194305;
      return this;
   }

   public SportProfile$PbSportProfile$Builder clone() {
      return (SportProfile$PbSportProfile$Builder)super.clone();
   }

   public SportprofileAceSettings$PbAceSportProfileSettings getAceSettings() {
      SportprofileAceSettings$PbAceSportProfileSettings var1;
      if (this.aceSettingsBuilder_ == null) {
         if (this.aceSettings_ == null) {
            var1 = SportprofileAceSettings$PbAceSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.aceSettings_;
         }
      } else {
         var1 = (SportprofileAceSettings$PbAceSportProfileSettings)this.aceSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder getAceSettingsBuilder() {
      this.bitField0_ |= 16384;
      this.onChanged();
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)this.getAceSettingsFieldBuilder().getBuilder();
   }

   public SportprofileAceSettings$PbAceSportProfileSettingsOrBuilder getAceSettingsOrBuilder() {
      Object var1;
      if (this.aceSettingsBuilder_ != null) {
         var1 = (SportprofileAceSettings$PbAceSportProfileSettingsOrBuilder)this.aceSettingsBuilder_.getMessageOrBuilder();
      } else if (this.aceSettings_ == null) {
         var1 = SportprofileAceSettings$PbAceSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.aceSettings_;
      }

      return (SportprofileAceSettings$PbAceSportProfileSettingsOrBuilder)var1;
   }

   public int getAerobicThreshold() {
      return this.aerobicThreshold_;
   }

   public int getAnaerobicThreshold() {
      return this.anaerobicThreshold_;
   }

   public SportprofileArcherSettings$PbArcherSportProfileSettings getArcherSettings() {
      SportprofileArcherSettings$PbArcherSportProfileSettings var1;
      if (this.archerSettingsBuilder_ == null) {
         if (this.archerSettings_ == null) {
            var1 = SportprofileArcherSettings$PbArcherSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.archerSettings_;
         }
      } else {
         var1 = (SportprofileArcherSettings$PbArcherSportProfileSettings)this.archerSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileArcherSettings$PbArcherSportProfileSettings$Builder getArcherSettingsBuilder() {
      this.bitField0_ |= 65536;
      this.onChanged();
      return (SportprofileArcherSettings$PbArcherSportProfileSettings$Builder)this.getArcherSettingsFieldBuilder().getBuilder();
   }

   public SportprofileArcherSettings$PbArcherSportProfileSettingsOrBuilder getArcherSettingsOrBuilder() {
      Object var1;
      if (this.archerSettingsBuilder_ != null) {
         var1 = (SportprofileArcherSettings$PbArcherSportProfileSettingsOrBuilder)this.archerSettingsBuilder_.getMessageOrBuilder();
      } else if (this.archerSettings_ == null) {
         var1 = SportprofileArcherSettings$PbArcherSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.archerSettings_;
      }

      return (SportprofileArcherSettings$PbArcherSportProfileSettingsOrBuilder)var1;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings getAstraSettings() {
      SportprofileAstraSettings$PbAstraSportProfileSettings var1;
      if (this.astraSettingsBuilder_ == null) {
         if (this.astraSettings_ == null) {
            var1 = SportprofileAstraSettings$PbAstraSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.astraSettings_;
         }
      } else {
         var1 = (SportprofileAstraSettings$PbAstraSportProfileSettings)this.astraSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder getAstraSettingsBuilder() {
      this.bitField0_ |= 131072;
      this.onChanged();
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)this.getAstraSettingsFieldBuilder().getBuilder();
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettingsOrBuilder getAstraSettingsOrBuilder() {
      Object var1;
      if (this.astraSettingsBuilder_ != null) {
         var1 = (SportprofileAstraSettings$PbAstraSportProfileSettingsOrBuilder)this.astraSettingsBuilder_.getMessageOrBuilder();
      } else if (this.astraSettings_ == null) {
         var1 = SportprofileAstraSettings$PbAstraSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.astraSettings_;
      }

      return (SportprofileAstraSettings$PbAstraSportProfileSettingsOrBuilder)var1;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings getAustinSettings() {
      SportprofileAustinSettings$PbAustinSportProfileSettings var1;
      if (this.austinSettingsBuilder_ == null) {
         if (this.austinSettings_ == null) {
            var1 = SportprofileAustinSettings$PbAustinSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.austinSettings_;
         }
      } else {
         var1 = (SportprofileAustinSettings$PbAustinSportProfileSettings)this.austinSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder getAustinSettingsBuilder() {
      this.bitField0_ |= 524288;
      this.onChanged();
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)this.getAustinSettingsFieldBuilder().getBuilder();
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettingsOrBuilder getAustinSettingsOrBuilder() {
      Object var1;
      if (this.austinSettingsBuilder_ != null) {
         var1 = (SportprofileAustinSettings$PbAustinSportProfileSettingsOrBuilder)this.austinSettingsBuilder_.getMessageOrBuilder();
      } else if (this.austinSettings_ == null) {
         var1 = SportprofileAustinSettings$PbAustinSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.austinSettings_;
      }

      return (SportprofileAustinSettings$PbAustinSportProfileSettingsOrBuilder)var1;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings getAvalonSettings() {
      SportprofileAvalonSettings$PbAvalonSportProfileSettings var1;
      if (this.avalonSettingsBuilder_ == null) {
         if (this.avalonSettings_ == null) {
            var1 = SportprofileAvalonSettings$PbAvalonSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.avalonSettings_;
         }
      } else {
         var1 = (SportprofileAvalonSettings$PbAvalonSportProfileSettings)this.avalonSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder getAvalonSettingsBuilder() {
      this.bitField0_ |= 32768;
      this.onChanged();
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)this.getAvalonSettingsFieldBuilder().getBuilder();
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettingsOrBuilder getAvalonSettingsOrBuilder() {
      Object var1;
      if (this.avalonSettingsBuilder_ != null) {
         var1 = (SportprofileAvalonSettings$PbAvalonSportProfileSettingsOrBuilder)this.avalonSettingsBuilder_.getMessageOrBuilder();
      } else if (this.avalonSettings_ == null) {
         var1 = SportprofileAvalonSettings$PbAvalonSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.avalonSettings_;
      }

      return (SportprofileAvalonSettings$PbAvalonSportProfileSettingsOrBuilder)var1;
   }

   public SportProfile$PbSportProfile getDefaultInstanceForType() {
      return SportProfile$PbSportProfile.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportProfile.g();
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings getGuitarSettings() {
      SportprofileGuitarSettings$PbGuitarSportProfileSettings var1;
      if (this.guitarSettingsBuilder_ == null) {
         if (this.guitarSettings_ == null) {
            var1 = SportprofileGuitarSettings$PbGuitarSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.guitarSettings_;
         }
      } else {
         var1 = (SportprofileGuitarSettings$PbGuitarSportProfileSettings)this.guitarSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder getGuitarSettingsBuilder() {
      this.bitField0_ |= 4096;
      this.onChanged();
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)this.getGuitarSettingsFieldBuilder().getBuilder();
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettingsOrBuilder getGuitarSettingsOrBuilder() {
      Object var1;
      if (this.guitarSettingsBuilder_ != null) {
         var1 = (SportprofileGuitarSettings$PbGuitarSportProfileSettingsOrBuilder)this.guitarSettingsBuilder_.getMessageOrBuilder();
      } else if (this.guitarSettings_ == null) {
         var1 = SportprofileGuitarSettings$PbGuitarSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.guitarSettings_;
      }

      return (SportprofileGuitarSettings$PbGuitarSportProfileSettingsOrBuilder)var1;
   }

   public long getIdentifier() {
      return this.identifier_;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModifiedBuilder_ == null) {
         if (this.lastModified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.lastModified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.lastModifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getLastModifiedBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getLastModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Object var1;
      if (this.lastModifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.lastModifiedBuilder_.getMessageOrBuilder();
      } else if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings getMaseratiSettings() {
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var1;
      if (this.maseratiSettingsBuilder_ == null) {
         if (this.maseratiSettings_ == null) {
            var1 = SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.maseratiSettings_;
         }
      } else {
         var1 = (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)this.maseratiSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder getMaseratiSettingsBuilder() {
      this.bitField0_ |= 262144;
      this.onChanged();
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)this.getMaseratiSettingsFieldBuilder().getBuilder();
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettingsOrBuilder getMaseratiSettingsOrBuilder() {
      Object var1;
      if (this.maseratiSettingsBuilder_ != null) {
         var1 = (SportprofileMaseratiSettings$PbMaseratiSportProfileSettingsOrBuilder)this.maseratiSettingsBuilder_.getMessageOrBuilder();
      } else if (this.maseratiSettings_ == null) {
         var1 = SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.maseratiSettings_;
      }

      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettingsOrBuilder)var1;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings getMclarenSettings() {
      SportprofileMclarenSettings$PbMcLarenSportProfileSettings var1;
      if (this.mclarenSettingsBuilder_ == null) {
         if (this.mclarenSettings_ == null) {
            var1 = SportprofileMclarenSettings$PbMcLarenSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.mclarenSettings_;
         }
      } else {
         var1 = (SportprofileMclarenSettings$PbMcLarenSportProfileSettings)this.mclarenSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder getMclarenSettingsBuilder() {
      this.bitField0_ |= 8192;
      this.onChanged();
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)this.getMclarenSettingsFieldBuilder().getBuilder();
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettingsOrBuilder getMclarenSettingsOrBuilder() {
      Object var1;
      if (this.mclarenSettingsBuilder_ != null) {
         var1 = (SportprofileMclarenSettings$PbMcLarenSportProfileSettingsOrBuilder)this.mclarenSettingsBuilder_.getMessageOrBuilder();
      } else if (this.mclarenSettings_ == null) {
         var1 = SportprofileMclarenSettings$PbMcLarenSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.mclarenSettings_;
      }

      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettingsOrBuilder)var1;
   }

   public SportprofileMetroSettings$PbMetroSportProfileSettings getMetroSettings() {
      SportprofileMetroSettings$PbMetroSportProfileSettings var1;
      if (this.metroSettingsBuilder_ == null) {
         if (this.metroSettings_ == null) {
            var1 = SportprofileMetroSettings$PbMetroSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.metroSettings_;
         }
      } else {
         var1 = (SportprofileMetroSettings$PbMetroSportProfileSettings)this.metroSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileMetroSettings$PbMetroSportProfileSettings$Builder getMetroSettingsBuilder() {
      this.bitField0_ |= 8388608;
      this.onChanged();
      return (SportprofileMetroSettings$PbMetroSportProfileSettings$Builder)this.getMetroSettingsFieldBuilder().getBuilder();
   }

   public SportprofileMetroSettings$PbMetroSportProfileSettingsOrBuilder getMetroSettingsOrBuilder() {
      Object var1;
      if (this.metroSettingsBuilder_ != null) {
         var1 = (SportprofileMetroSettings$PbMetroSportProfileSettingsOrBuilder)this.metroSettingsBuilder_.getMessageOrBuilder();
      } else if (this.metroSettings_ == null) {
         var1 = SportprofileMetroSettings$PbMetroSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.metroSettings_;
      }

      return (SportprofileMetroSettings$PbMetroSportProfileSettingsOrBuilder)var1;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings getOBSOLETEAlcorDisplaySettings() {
      SportprofileDisplays$PbAlcorDisplaySettings var1;
      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ == null) {
         if (this.oBSOLETEAlcorDisplaySettings_ == null) {
            var1 = SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
         } else {
            var1 = this.oBSOLETEAlcorDisplaySettings_;
         }
      } else {
         var1 = (SportprofileDisplays$PbAlcorDisplaySettings)this.oBSOLETEAlcorDisplaySettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder getOBSOLETEAlcorDisplaySettingsBuilder() {
      this.bitField0_ |= 1024;
      this.onChanged();
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)this.getOBSOLETEAlcorDisplaySettingsFieldBuilder().getBuilder();
   }

   public SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder getOBSOLETEAlcorDisplaySettingsOrBuilder() {
      Object var1;
      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ != null) {
         var1 = (SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder)this.oBSOLETEAlcorDisplaySettingsBuilder_.getMessageOrBuilder();
      } else if (this.oBSOLETEAlcorDisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAlcorDisplaySettings_;
      }

      return (SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder)var1;
   }

   public Types$PbAutoPause getOBSOLETEAutoPause() {
      Types$PbAutoPause var1;
      if (this.oBSOLETEAutoPauseBuilder_ == null) {
         if (this.oBSOLETEAutoPause_ == null) {
            var1 = Types$PbAutoPause.getDefaultInstance();
         } else {
            var1 = this.oBSOLETEAutoPause_;
         }
      } else {
         var1 = (Types$PbAutoPause)this.oBSOLETEAutoPauseBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbAutoPause$Builder getOBSOLETEAutoPauseBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (Types$PbAutoPause$Builder)this.getOBSOLETEAutoPauseFieldBuilder().getBuilder();
   }

   public Types$PbAutoPauseOrBuilder getOBSOLETEAutoPauseOrBuilder() {
      Object var1;
      if (this.oBSOLETEAutoPauseBuilder_ != null) {
         var1 = (Types$PbAutoPauseOrBuilder)this.oBSOLETEAutoPauseBuilder_.getMessageOrBuilder();
      } else if (this.oBSOLETEAutoPause_ == null) {
         var1 = Types$PbAutoPause.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAutoPause_;
      }

      return (Types$PbAutoPauseOrBuilder)var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings getOBSOLETESirius2DisplaySettings() {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (this.oBSOLETESirius2DisplaySettingsBuilder_ == null) {
         if (this.oBSOLETESirius2DisplaySettings_ == null) {
            var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
         } else {
            var1 = this.oBSOLETESirius2DisplaySettings_;
         }
      } else {
         var1 = (SportprofileDisplays$PbSirius2DisplaySettings)this.oBSOLETESirius2DisplaySettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder getOBSOLETESirius2DisplaySettingsBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)this.getOBSOLETESirius2DisplaySettingsFieldBuilder().getBuilder();
   }

   public SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getOBSOLETESirius2DisplaySettingsOrBuilder() {
      Object var1;
      if (this.oBSOLETESirius2DisplaySettingsBuilder_ != null) {
         var1 = (SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder)this.oBSOLETESirius2DisplaySettingsBuilder_.getMessageOrBuilder();
      } else if (this.oBSOLETESirius2DisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESirius2DisplaySettings_;
      }

      return (SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder)var1;
   }

   public float getOBSOLETESprintThreshold() {
      return this.oBSOLETESprintThreshold_;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings getRangerSettings() {
      SportprofileRangerSettings$PbRangerSportProfileSettings var1;
      if (this.rangerSettingsBuilder_ == null) {
         if (this.rangerSettings_ == null) {
            var1 = SportprofileRangerSettings$PbRangerSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.rangerSettings_;
         }
      } else {
         var1 = (SportprofileRangerSettings$PbRangerSportProfileSettings)this.rangerSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder getRangerSettingsBuilder() {
      this.bitField0_ |= 1048576;
      this.onChanged();
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)this.getRangerSettingsFieldBuilder().getBuilder();
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettingsOrBuilder getRangerSettingsOrBuilder() {
      Object var1;
      if (this.rangerSettingsBuilder_ != null) {
         var1 = (SportprofileRangerSettings$PbRangerSportProfileSettingsOrBuilder)this.rangerSettingsBuilder_.getMessageOrBuilder();
      } else if (this.rangerSettings_ == null) {
         var1 = SportprofileRangerSettings$PbRangerSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.rangerSettings_;
      }

      return (SportprofileRangerSettings$PbRangerSportProfileSettingsOrBuilder)var1;
   }

   public SportProfile$PbSportProfileSettings getSettings() {
      SportProfile$PbSportProfileSettings var1;
      if (this.settingsBuilder_ == null) {
         if (this.settings_ == null) {
            var1 = SportProfile$PbSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.settings_;
         }
      } else {
         var1 = (SportProfile$PbSportProfileSettings)this.settingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportProfile$PbSportProfileSettings$Builder getSettingsBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (SportProfile$PbSportProfileSettings$Builder)this.getSettingsFieldBuilder().getBuilder();
   }

   public SportProfile$PbSportProfileSettingsOrBuilder getSettingsOrBuilder() {
      Object var1;
      if (this.settingsBuilder_ != null) {
         var1 = (SportProfile$PbSportProfileSettingsOrBuilder)this.settingsBuilder_.getMessageOrBuilder();
      } else if (this.settings_ == null) {
         var1 = SportProfile$PbSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.settings_;
      }

      return (SportProfile$PbSportProfileSettingsOrBuilder)var1;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings getSniperSettings() {
      SportprofileSniperSettings$PbSniperSportProfileSettings var1;
      if (this.sniperSettingsBuilder_ == null) {
         if (this.sniperSettings_ == null) {
            var1 = SportprofileSniperSettings$PbSniperSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.sniperSettings_;
         }
      } else {
         var1 = (SportprofileSniperSettings$PbSniperSportProfileSettings)this.sniperSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder getSniperSettingsBuilder() {
      this.bitField0_ |= 2097152;
      this.onChanged();
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)this.getSniperSettingsFieldBuilder().getBuilder();
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettingsOrBuilder getSniperSettingsOrBuilder() {
      Object var1;
      if (this.sniperSettingsBuilder_ != null) {
         var1 = (SportprofileSniperSettings$PbSniperSportProfileSettingsOrBuilder)this.sniperSettingsBuilder_.getMessageOrBuilder();
      } else if (this.sniperSettings_ == null) {
         var1 = SportprofileSniperSettings$PbSniperSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.sniperSettings_;
      }

      return (SportprofileSniperSettings$PbSniperSportProfileSettingsOrBuilder)var1;
   }

   public float getSportFactor() {
      return this.sportFactor_;
   }

   public Structures$PbSportIdentifier getSportIdentifier() {
      Structures$PbSportIdentifier var1;
      if (this.sportIdentifierBuilder_ == null) {
         if (this.sportIdentifier_ == null) {
            var1 = Structures$PbSportIdentifier.getDefaultInstance();
         } else {
            var1 = this.sportIdentifier_;
         }
      } else {
         var1 = (Structures$PbSportIdentifier)this.sportIdentifierBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSportIdentifier$Builder getSportIdentifierBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbSportIdentifier$Builder)this.getSportIdentifierFieldBuilder().getBuilder();
   }

   public Structures$PbSportIdentifierOrBuilder getSportIdentifierOrBuilder() {
      Object var1;
      if (this.sportIdentifierBuilder_ != null) {
         var1 = (Structures$PbSportIdentifierOrBuilder)this.sportIdentifierBuilder_.getMessageOrBuilder();
      } else if (this.sportIdentifier_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sportIdentifier_;
      }

      return (Structures$PbSportIdentifierOrBuilder)var1;
   }

   public SportProfile$PbSprintDetection getSprintDetectionSettings() {
      SportProfile$PbSprintDetection var1;
      if (this.sprintDetectionSettingsBuilder_ == null) {
         if (this.sprintDetectionSettings_ == null) {
            var1 = SportProfile$PbSprintDetection.getDefaultInstance();
         } else {
            var1 = this.sprintDetectionSettings_;
         }
      } else {
         var1 = (SportProfile$PbSprintDetection)this.sprintDetectionSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportProfile$PbSprintDetection$Builder getSprintDetectionSettingsBuilder() {
      this.bitField0_ |= 2048;
      this.onChanged();
      return (SportProfile$PbSprintDetection$Builder)this.getSprintDetectionSettingsFieldBuilder().getBuilder();
   }

   public SportProfile$PbSprintDetectionOrBuilder getSprintDetectionSettingsOrBuilder() {
      Object var1;
      if (this.sprintDetectionSettingsBuilder_ != null) {
         var1 = (SportProfile$PbSprintDetectionOrBuilder)this.sprintDetectionSettingsBuilder_.getMessageOrBuilder();
      } else if (this.sprintDetectionSettings_ == null) {
         var1 = SportProfile$PbSprintDetection.getDefaultInstance();
      } else {
         var1 = this.sprintDetectionSettings_;
      }

      return (SportProfile$PbSprintDetectionOrBuilder)var1;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings getVectraSettings() {
      SportprofileVectraSettings$PbVectraSportProfileSettings var1;
      if (this.vectraSettingsBuilder_ == null) {
         if (this.vectraSettings_ == null) {
            var1 = SportprofileVectraSettings$PbVectraSportProfileSettings.getDefaultInstance();
         } else {
            var1 = this.vectraSettings_;
         }
      } else {
         var1 = (SportprofileVectraSettings$PbVectraSportProfileSettings)this.vectraSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder getVectraSettingsBuilder() {
      this.bitField0_ |= 4194304;
      this.onChanged();
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)this.getVectraSettingsFieldBuilder().getBuilder();
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettingsOrBuilder getVectraSettingsOrBuilder() {
      Object var1;
      if (this.vectraSettingsBuilder_ != null) {
         var1 = (SportprofileVectraSettings$PbVectraSportProfileSettingsOrBuilder)this.vectraSettingsBuilder_.getMessageOrBuilder();
      } else if (this.vectraSettings_ == null) {
         var1 = SportprofileVectraSettings$PbVectraSportProfileSettings.getDefaultInstance();
      } else {
         var1 = this.vectraSettings_;
      }

      return (SportprofileVectraSettings$PbVectraSportProfileSettingsOrBuilder)var1;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportProfile.h().ensureFieldAccessorsInitialized(SportProfile$PbSportProfile.class, SportProfile$PbSportProfile$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasSportIdentifier()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasLastModified()) {
            var2 = var1;
            if (this.getSportIdentifier().isInitialized()) {
               if (this.hasSettings()) {
                  var2 = var1;
                  if (!this.getSettings().isInitialized()) {
                     return var2;
                  }
               }

               var2 = var1;
               if (this.getLastModified().isInitialized()) {
                  if (this.hasOBSOLETEAutoPause()) {
                     var2 = var1;
                     if (!this.getOBSOLETEAutoPause().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasSprintDetectionSettings()) {
                     var2 = var1;
                     if (!this.getSprintDetectionSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasGuitarSettings()) {
                     var2 = var1;
                     if (!this.getGuitarSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasMclarenSettings()) {
                     var2 = var1;
                     if (!this.getMclarenSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasAceSettings()) {
                     var2 = var1;
                     if (!this.getAceSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasAvalonSettings()) {
                     var2 = var1;
                     if (!this.getAvalonSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasArcherSettings()) {
                     var2 = var1;
                     if (!this.getArcherSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasMaseratiSettings()) {
                     var2 = var1;
                     if (!this.getMaseratiSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasAustinSettings()) {
                     var2 = var1;
                     if (!this.getAustinSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasSniperSettings()) {
                     var2 = var1;
                     if (!this.getSniperSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasMetroSettings()) {
                     var2 = var1;
                     if (!this.getMetroSettings().isInitialized()) {
                        return var2;
                     }
                  }

                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public SportProfile$PbSportProfile$Builder mergeAceSettings(SportprofileAceSettings$PbAceSportProfileSettings var1) {
      if (this.aceSettingsBuilder_ == null) {
         if ((this.bitField0_ & 16384) == 16384 && this.aceSettings_ != null && this.aceSettings_ != SportprofileAceSettings$PbAceSportProfileSettings.getDefaultInstance()) {
            this.aceSettings_ = SportprofileAceSettings$PbAceSportProfileSettings.newBuilder(this.aceSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.aceSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.aceSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeArcherSettings(SportprofileArcherSettings$PbArcherSportProfileSettings var1) {
      if (this.archerSettingsBuilder_ == null) {
         if ((this.bitField0_ & 65536) == 65536 && this.archerSettings_ != null && this.archerSettings_ != SportprofileArcherSettings$PbArcherSportProfileSettings.getDefaultInstance()) {
            this.archerSettings_ = SportprofileArcherSettings$PbArcherSportProfileSettings.newBuilder(this.archerSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.archerSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.archerSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeAstraSettings(SportprofileAstraSettings$PbAstraSportProfileSettings var1) {
      if (this.astraSettingsBuilder_ == null) {
         if ((this.bitField0_ & 131072) == 131072 && this.astraSettings_ != null && this.astraSettings_ != SportprofileAstraSettings$PbAstraSportProfileSettings.getDefaultInstance()) {
            this.astraSettings_ = SportprofileAstraSettings$PbAstraSportProfileSettings.newBuilder(this.astraSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.astraSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.astraSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 131072;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeAustinSettings(SportprofileAustinSettings$PbAustinSportProfileSettings var1) {
      if (this.austinSettingsBuilder_ == null) {
         if ((this.bitField0_ & 524288) == 524288 && this.austinSettings_ != null && this.austinSettings_ != SportprofileAustinSettings$PbAustinSportProfileSettings.getDefaultInstance()) {
            this.austinSettings_ = SportprofileAustinSettings$PbAustinSportProfileSettings.newBuilder(this.austinSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.austinSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.austinSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 524288;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeAvalonSettings(SportprofileAvalonSettings$PbAvalonSportProfileSettings var1) {
      if (this.avalonSettingsBuilder_ == null) {
         if ((this.bitField0_ & '耀') == 32768 && this.avalonSettings_ != null && this.avalonSettings_ != SportprofileAvalonSettings$PbAvalonSportProfileSettings.getDefaultInstance()) {
            this.avalonSettings_ = SportprofileAvalonSettings$PbAvalonSportProfileSettings.newBuilder(this.avalonSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.avalonSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.avalonSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32768;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportProfile$PbSportProfile var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportProfile$PbSportProfile var14;
         try {
            var13 = (SportProfile$PbSportProfile)SportProfile$PbSportProfile.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportProfile$PbSportProfile)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeFrom(Message var1) {
      SportProfile$PbSportProfile$Builder var2;
      if (var1 instanceof SportProfile$PbSportProfile) {
         var2 = this.mergeFrom((SportProfile$PbSportProfile)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportProfile$PbSportProfile$Builder mergeFrom(SportProfile$PbSportProfile var1) {
      if (var1 != SportProfile$PbSportProfile.getDefaultInstance()) {
         if (var1.hasIdentifier()) {
            this.setIdentifier(var1.getIdentifier());
         }

         if (var1.hasSportIdentifier()) {
            this.mergeSportIdentifier(var1.getSportIdentifier());
         }

         if (var1.hasSettings()) {
            this.mergeSettings(var1.getSettings());
         }

         if (var1.hasOBSOLETESirius2DisplaySettings()) {
            this.mergeOBSOLETESirius2DisplaySettings(var1.getOBSOLETESirius2DisplaySettings());
         }

         if (var1.hasSportFactor()) {
            this.setSportFactor(var1.getSportFactor());
         }

         if (var1.hasAerobicThreshold()) {
            this.setAerobicThreshold(var1.getAerobicThreshold());
         }

         if (var1.hasAnaerobicThreshold()) {
            this.setAnaerobicThreshold(var1.getAnaerobicThreshold());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         if (var1.hasOBSOLETESprintThreshold()) {
            this.setOBSOLETESprintThreshold(var1.getOBSOLETESprintThreshold());
         }

         if (var1.hasOBSOLETEAutoPause()) {
            this.mergeOBSOLETEAutoPause(var1.getOBSOLETEAutoPause());
         }

         if (var1.hasOBSOLETEAlcorDisplaySettings()) {
            this.mergeOBSOLETEAlcorDisplaySettings(var1.getOBSOLETEAlcorDisplaySettings());
         }

         if (var1.hasSprintDetectionSettings()) {
            this.mergeSprintDetectionSettings(var1.getSprintDetectionSettings());
         }

         if (var1.hasGuitarSettings()) {
            this.mergeGuitarSettings(var1.getGuitarSettings());
         }

         if (var1.hasMclarenSettings()) {
            this.mergeMclarenSettings(var1.getMclarenSettings());
         }

         if (var1.hasAceSettings()) {
            this.mergeAceSettings(var1.getAceSettings());
         }

         if (var1.hasAvalonSettings()) {
            this.mergeAvalonSettings(var1.getAvalonSettings());
         }

         if (var1.hasArcherSettings()) {
            this.mergeArcherSettings(var1.getArcherSettings());
         }

         if (var1.hasAstraSettings()) {
            this.mergeAstraSettings(var1.getAstraSettings());
         }

         if (var1.hasMaseratiSettings()) {
            this.mergeMaseratiSettings(var1.getMaseratiSettings());
         }

         if (var1.hasAustinSettings()) {
            this.mergeAustinSettings(var1.getAustinSettings());
         }

         if (var1.hasRangerSettings()) {
            this.mergeRangerSettings(var1.getRangerSettings());
         }

         if (var1.hasSniperSettings()) {
            this.mergeSniperSettings(var1.getSniperSettings());
         }

         if (var1.hasVectraSettings()) {
            this.mergeVectraSettings(var1.getVectraSettings());
         }

         if (var1.hasMetroSettings()) {
            this.mergeMetroSettings(var1.getMetroSettings());
         }

         this.mergeUnknownFields(SportProfile$PbSportProfile.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeGuitarSettings(SportprofileGuitarSettings$PbGuitarSportProfileSettings var1) {
      if (this.guitarSettingsBuilder_ == null) {
         if ((this.bitField0_ & 4096) == 4096 && this.guitarSettings_ != null && this.guitarSettings_ != SportprofileGuitarSettings$PbGuitarSportProfileSettings.getDefaultInstance()) {
            this.guitarSettings_ = SportprofileGuitarSettings$PbGuitarSportProfileSettings.newBuilder(this.guitarSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.guitarSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.guitarSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeMaseratiSettings(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var1) {
      if (this.maseratiSettingsBuilder_ == null) {
         if ((this.bitField0_ & 262144) == 262144 && this.maseratiSettings_ != null && this.maseratiSettings_ != SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.getDefaultInstance()) {
            this.maseratiSettings_ = SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.newBuilder(this.maseratiSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.maseratiSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.maseratiSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeMclarenSettings(SportprofileMclarenSettings$PbMcLarenSportProfileSettings var1) {
      if (this.mclarenSettingsBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192 && this.mclarenSettings_ != null && this.mclarenSettings_ != SportprofileMclarenSettings$PbMcLarenSportProfileSettings.getDefaultInstance()) {
            this.mclarenSettings_ = SportprofileMclarenSettings$PbMcLarenSportProfileSettings.newBuilder(this.mclarenSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.mclarenSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.mclarenSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeMetroSettings(SportprofileMetroSettings$PbMetroSportProfileSettings var1) {
      if (this.metroSettingsBuilder_ == null) {
         if ((this.bitField0_ & 8388608) == 8388608 && this.metroSettings_ != null && this.metroSettings_ != SportprofileMetroSettings$PbMetroSportProfileSettings.getDefaultInstance()) {
            this.metroSettings_ = SportprofileMetroSettings$PbMetroSportProfileSettings.newBuilder(this.metroSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.metroSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.metroSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8388608;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeOBSOLETEAlcorDisplaySettings(SportprofileDisplays$PbAlcorDisplaySettings var1) {
      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.oBSOLETEAlcorDisplaySettings_ != null && this.oBSOLETEAlcorDisplaySettings_ != SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance()) {
            this.oBSOLETEAlcorDisplaySettings_ = SportprofileDisplays$PbAlcorDisplaySettings.newBuilder(this.oBSOLETEAlcorDisplaySettings_).mergeFrom(var1).buildPartial();
         } else {
            this.oBSOLETEAlcorDisplaySettings_ = var1;
         }

         this.onChanged();
      } else {
         this.oBSOLETEAlcorDisplaySettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeOBSOLETEAutoPause(Types$PbAutoPause var1) {
      if (this.oBSOLETEAutoPauseBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.oBSOLETEAutoPause_ != null && this.oBSOLETEAutoPause_ != Types$PbAutoPause.getDefaultInstance()) {
            this.oBSOLETEAutoPause_ = Types$PbAutoPause.newBuilder(this.oBSOLETEAutoPause_).mergeFrom(var1).buildPartial();
         } else {
            this.oBSOLETEAutoPause_ = var1;
         }

         this.onChanged();
      } else {
         this.oBSOLETEAutoPauseBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeOBSOLETESirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.oBSOLETESirius2DisplaySettingsBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.oBSOLETESirius2DisplaySettings_ != null && this.oBSOLETESirius2DisplaySettings_ != SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance()) {
            this.oBSOLETESirius2DisplaySettings_ = SportprofileDisplays$PbSirius2DisplaySettings.newBuilder(this.oBSOLETESirius2DisplaySettings_).mergeFrom(var1).buildPartial();
         } else {
            this.oBSOLETESirius2DisplaySettings_ = var1;
         }

         this.onChanged();
      } else {
         this.oBSOLETESirius2DisplaySettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeRangerSettings(SportprofileRangerSettings$PbRangerSportProfileSettings var1) {
      if (this.rangerSettingsBuilder_ == null) {
         if ((this.bitField0_ & 1048576) == 1048576 && this.rangerSettings_ != null && this.rangerSettings_ != SportprofileRangerSettings$PbRangerSportProfileSettings.getDefaultInstance()) {
            this.rangerSettings_ = SportprofileRangerSettings$PbRangerSportProfileSettings.newBuilder(this.rangerSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.rangerSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.rangerSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1048576;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeSettings(SportProfile$PbSportProfileSettings var1) {
      if (this.settingsBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.settings_ != null && this.settings_ != SportProfile$PbSportProfileSettings.getDefaultInstance()) {
            this.settings_ = SportProfile$PbSportProfileSettings.newBuilder(this.settings_).mergeFrom(var1).buildPartial();
         } else {
            this.settings_ = var1;
         }

         this.onChanged();
      } else {
         this.settingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeSniperSettings(SportprofileSniperSettings$PbSniperSportProfileSettings var1) {
      if (this.sniperSettingsBuilder_ == null) {
         if ((this.bitField0_ & 2097152) == 2097152 && this.sniperSettings_ != null && this.sniperSettings_ != SportprofileSniperSettings$PbSniperSportProfileSettings.getDefaultInstance()) {
            this.sniperSettings_ = SportprofileSniperSettings$PbSniperSportProfileSettings.newBuilder(this.sniperSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.sniperSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.sniperSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2097152;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeSportIdentifier(Structures$PbSportIdentifier var1) {
      if (this.sportIdentifierBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.sportIdentifier_ != null && this.sportIdentifier_ != Structures$PbSportIdentifier.getDefaultInstance()) {
            this.sportIdentifier_ = Structures$PbSportIdentifier.newBuilder(this.sportIdentifier_).mergeFrom(var1).buildPartial();
         } else {
            this.sportIdentifier_ = var1;
         }

         this.onChanged();
      } else {
         this.sportIdentifierBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportProfile$PbSportProfile$Builder mergeSprintDetectionSettings(SportProfile$PbSprintDetection var1) {
      if (this.sprintDetectionSettingsBuilder_ == null) {
         if ((this.bitField0_ & 2048) == 2048 && this.sprintDetectionSettings_ != null && this.sprintDetectionSettings_ != SportProfile$PbSprintDetection.getDefaultInstance()) {
            this.sprintDetectionSettings_ = SportProfile$PbSprintDetection.newBuilder(this.sprintDetectionSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.sprintDetectionSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.sprintDetectionSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public final SportProfile$PbSportProfile$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportProfile$PbSportProfile$Builder)super.mergeUnknownFields(var1);
   }

   public SportProfile$PbSportProfile$Builder mergeVectraSettings(SportprofileVectraSettings$PbVectraSportProfileSettings var1) {
      if (this.vectraSettingsBuilder_ == null) {
         if ((this.bitField0_ & 4194304) == 4194304 && this.vectraSettings_ != null && this.vectraSettings_ != SportprofileVectraSettings$PbVectraSportProfileSettings.getDefaultInstance()) {
            this.vectraSettings_ = SportprofileVectraSettings$PbVectraSportProfileSettings.newBuilder(this.vectraSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.vectraSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.vectraSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4194304;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAceSettings(SportprofileAceSettings$PbAceSportProfileSettings$Builder var1) {
      if (this.aceSettingsBuilder_ == null) {
         this.aceSettings_ = var1.build();
         this.onChanged();
      } else {
         this.aceSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAceSettings(SportprofileAceSettings$PbAceSportProfileSettings var1) {
      if (this.aceSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.aceSettings_ = var1;
         this.onChanged();
      } else {
         this.aceSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAerobicThreshold(int var1) {
      this.bitField0_ |= 32;
      this.aerobicThreshold_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAnaerobicThreshold(int var1) {
      this.bitField0_ |= 64;
      this.anaerobicThreshold_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder setArcherSettings(SportprofileArcherSettings$PbArcherSportProfileSettings$Builder var1) {
      if (this.archerSettingsBuilder_ == null) {
         this.archerSettings_ = var1.build();
         this.onChanged();
      } else {
         this.archerSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setArcherSettings(SportprofileArcherSettings$PbArcherSportProfileSettings var1) {
      if (this.archerSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.archerSettings_ = var1;
         this.onChanged();
      } else {
         this.archerSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAstraSettings(SportprofileAstraSettings$PbAstraSportProfileSettings$Builder var1) {
      if (this.astraSettingsBuilder_ == null) {
         this.astraSettings_ = var1.build();
         this.onChanged();
      } else {
         this.astraSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 131072;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAstraSettings(SportprofileAstraSettings$PbAstraSportProfileSettings var1) {
      if (this.astraSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.astraSettings_ = var1;
         this.onChanged();
      } else {
         this.astraSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 131072;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAustinSettings(SportprofileAustinSettings$PbAustinSportProfileSettings$Builder var1) {
      if (this.austinSettingsBuilder_ == null) {
         this.austinSettings_ = var1.build();
         this.onChanged();
      } else {
         this.austinSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 524288;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAustinSettings(SportprofileAustinSettings$PbAustinSportProfileSettings var1) {
      if (this.austinSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.austinSettings_ = var1;
         this.onChanged();
      } else {
         this.austinSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 524288;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAvalonSettings(SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder var1) {
      if (this.avalonSettingsBuilder_ == null) {
         this.avalonSettings_ = var1.build();
         this.onChanged();
      } else {
         this.avalonSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32768;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setAvalonSettings(SportprofileAvalonSettings$PbAvalonSportProfileSettings var1) {
      if (this.avalonSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.avalonSettings_ = var1;
         this.onChanged();
      } else {
         this.avalonSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32768;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportProfile$PbSportProfile$Builder)super.setField(var1, var2);
   }

   public SportProfile$PbSportProfile$Builder setGuitarSettings(SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder var1) {
      if (this.guitarSettingsBuilder_ == null) {
         this.guitarSettings_ = var1.build();
         this.onChanged();
      } else {
         this.guitarSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setGuitarSettings(SportprofileGuitarSettings$PbGuitarSportProfileSettings var1) {
      if (this.guitarSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.guitarSettings_ = var1;
         this.onChanged();
      } else {
         this.guitarSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setIdentifier(long var1) {
      this.bitField0_ |= 1;
      this.identifier_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setMaseratiSettings(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder var1) {
      if (this.maseratiSettingsBuilder_ == null) {
         this.maseratiSettings_ = var1.build();
         this.onChanged();
      } else {
         this.maseratiSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setMaseratiSettings(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var1) {
      if (this.maseratiSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.maseratiSettings_ = var1;
         this.onChanged();
      } else {
         this.maseratiSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setMclarenSettings(SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder var1) {
      if (this.mclarenSettingsBuilder_ == null) {
         this.mclarenSettings_ = var1.build();
         this.onChanged();
      } else {
         this.mclarenSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setMclarenSettings(SportprofileMclarenSettings$PbMcLarenSportProfileSettings var1) {
      if (this.mclarenSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mclarenSettings_ = var1;
         this.onChanged();
      } else {
         this.mclarenSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setMetroSettings(SportprofileMetroSettings$PbMetroSportProfileSettings$Builder var1) {
      if (this.metroSettingsBuilder_ == null) {
         this.metroSettings_ = var1.build();
         this.onChanged();
      } else {
         this.metroSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8388608;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setMetroSettings(SportprofileMetroSettings$PbMetroSportProfileSettings var1) {
      if (this.metroSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.metroSettings_ = var1;
         this.onChanged();
      } else {
         this.metroSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8388608;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setOBSOLETEAlcorDisplaySettings(SportprofileDisplays$PbAlcorDisplaySettings$Builder var1) {
      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ == null) {
         this.oBSOLETEAlcorDisplaySettings_ = var1.build();
         this.onChanged();
      } else {
         this.oBSOLETEAlcorDisplaySettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setOBSOLETEAlcorDisplaySettings(SportprofileDisplays$PbAlcorDisplaySettings var1) {
      if (this.oBSOLETEAlcorDisplaySettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.oBSOLETEAlcorDisplaySettings_ = var1;
         this.onChanged();
      } else {
         this.oBSOLETEAlcorDisplaySettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setOBSOLETEAutoPause(Types$PbAutoPause$Builder var1) {
      if (this.oBSOLETEAutoPauseBuilder_ == null) {
         this.oBSOLETEAutoPause_ = var1.build();
         this.onChanged();
      } else {
         this.oBSOLETEAutoPauseBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setOBSOLETEAutoPause(Types$PbAutoPause var1) {
      if (this.oBSOLETEAutoPauseBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.oBSOLETEAutoPause_ = var1;
         this.onChanged();
      } else {
         this.oBSOLETEAutoPauseBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setOBSOLETESirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings$Builder var1) {
      if (this.oBSOLETESirius2DisplaySettingsBuilder_ == null) {
         this.oBSOLETESirius2DisplaySettings_ = var1.build();
         this.onChanged();
      } else {
         this.oBSOLETESirius2DisplaySettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setOBSOLETESirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.oBSOLETESirius2DisplaySettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.oBSOLETESirius2DisplaySettings_ = var1;
         this.onChanged();
      } else {
         this.oBSOLETESirius2DisplaySettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setOBSOLETESprintThreshold(float var1) {
      this.bitField0_ |= 256;
      this.oBSOLETESprintThreshold_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder setRangerSettings(SportprofileRangerSettings$PbRangerSportProfileSettings$Builder var1) {
      if (this.rangerSettingsBuilder_ == null) {
         this.rangerSettings_ = var1.build();
         this.onChanged();
      } else {
         this.rangerSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1048576;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setRangerSettings(SportprofileRangerSettings$PbRangerSportProfileSettings var1) {
      if (this.rangerSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rangerSettings_ = var1;
         this.onChanged();
      } else {
         this.rangerSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1048576;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportProfile$PbSportProfile$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportProfile$PbSportProfile$Builder setSettings(SportProfile$PbSportProfileSettings$Builder var1) {
      if (this.settingsBuilder_ == null) {
         this.settings_ = var1.build();
         this.onChanged();
      } else {
         this.settingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setSettings(SportProfile$PbSportProfileSettings var1) {
      if (this.settingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.settings_ = var1;
         this.onChanged();
      } else {
         this.settingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setSniperSettings(SportprofileSniperSettings$PbSniperSportProfileSettings$Builder var1) {
      if (this.sniperSettingsBuilder_ == null) {
         this.sniperSettings_ = var1.build();
         this.onChanged();
      } else {
         this.sniperSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2097152;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setSniperSettings(SportprofileSniperSettings$PbSniperSportProfileSettings var1) {
      if (this.sniperSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sniperSettings_ = var1;
         this.onChanged();
      } else {
         this.sniperSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2097152;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setSportFactor(float var1) {
      this.bitField0_ |= 16;
      this.sportFactor_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfile$Builder setSportIdentifier(Structures$PbSportIdentifier$Builder var1) {
      if (this.sportIdentifierBuilder_ == null) {
         this.sportIdentifier_ = var1.build();
         this.onChanged();
      } else {
         this.sportIdentifierBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setSportIdentifier(Structures$PbSportIdentifier var1) {
      if (this.sportIdentifierBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sportIdentifier_ = var1;
         this.onChanged();
      } else {
         this.sportIdentifierBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setSprintDetectionSettings(SportProfile$PbSprintDetection$Builder var1) {
      if (this.sprintDetectionSettingsBuilder_ == null) {
         this.sprintDetectionSettings_ = var1.build();
         this.onChanged();
      } else {
         this.sprintDetectionSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setSprintDetectionSettings(SportProfile$PbSprintDetection var1) {
      if (this.sprintDetectionSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sprintDetectionSettings_ = var1;
         this.onChanged();
      } else {
         this.sprintDetectionSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public final SportProfile$PbSportProfile$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportProfile$PbSportProfile$Builder)super.setUnknownFields(var1);
   }

   public SportProfile$PbSportProfile$Builder setVectraSettings(SportprofileVectraSettings$PbVectraSportProfileSettings$Builder var1) {
      if (this.vectraSettingsBuilder_ == null) {
         this.vectraSettings_ = var1.build();
         this.onChanged();
      } else {
         this.vectraSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4194304;
      return this;
   }

   public SportProfile$PbSportProfile$Builder setVectraSettings(SportprofileVectraSettings$PbVectraSportProfileSettings var1) {
      if (this.vectraSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.vectraSettings_ = var1;
         this.onChanged();
      } else {
         this.vectraSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4194304;
      return this;
   }
}
