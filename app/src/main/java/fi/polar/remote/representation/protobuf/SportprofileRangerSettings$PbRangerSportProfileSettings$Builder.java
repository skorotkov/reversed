package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileRangerSettings$PbRangerSportProfileSettings$Builder extends Builder implements SportprofileRangerSettings$PbRangerSportProfileSettingsOrBuilder {
   private int bitField0_;
   private int gpsSetting_;

   private SportprofileRangerSettings$PbRangerSportProfileSettings$Builder() {
      this.gpsSetting_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileRangerSettings$PbRangerSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.gpsSetting_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileRangerSettings$PbRangerSportProfileSettings$Builder(BuilderParent var1, SportprofileRangerSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileRangerSettings$PbRangerSportProfileSettings$Builder(SportprofileRangerSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return SportprofileRangerSettings.a();
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileRangerSettings$PbRangerSportProfileSettings.b()) {
      }

   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings build() {
      SportprofileRangerSettings$PbRangerSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings buildPartial() {
      byte var1 = 1;
      SportprofileRangerSettings$PbRangerSportProfileSettings var2 = new SportprofileRangerSettings$PbRangerSportProfileSettings(this, (SportprofileRangerSettings$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      SportprofileRangerSettings$PbRangerSportProfileSettings.a(var2, this.gpsSetting_);
      SportprofileRangerSettings$PbRangerSportProfileSettings.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder clear() {
      super.clear();
      this.gpsSetting_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder clearGpsSetting() {
      this.bitField0_ &= -2;
      this.gpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder clone() {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)super.clone();
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings getDefaultInstanceForType() {
      return SportprofileRangerSettings$PbRangerSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileRangerSettings.a();
   }

   public Types$PbGPSSetting getGpsSetting() {
      Types$PbGPSSetting var1 = Types$PbGPSSetting.valueOf(this.gpsSetting_);
      Types$PbGPSSetting var2 = var1;
      if (var1 == null) {
         var2 = Types$PbGPSSetting.GPS_OFF;
      }

      return var2;
   }

   public boolean hasGpsSetting() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileRangerSettings.b().ensureFieldAccessorsInitialized(SportprofileRangerSettings$PbRangerSportProfileSettings.class, SportprofileRangerSettings$PbRangerSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileRangerSettings$PbRangerSportProfileSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportprofileRangerSettings$PbRangerSportProfileSettings var14;
         try {
            var13 = (SportprofileRangerSettings$PbRangerSportProfileSettings)SportprofileRangerSettings$PbRangerSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportprofileRangerSettings$PbRangerSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileRangerSettings$PbRangerSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileRangerSettings$PbRangerSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileRangerSettings$PbRangerSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder mergeFrom(SportprofileRangerSettings$PbRangerSportProfileSettings var1) {
      if (var1 != SportprofileRangerSettings$PbRangerSportProfileSettings.getDefaultInstance()) {
         if (var1.hasGpsSetting()) {
            this.setGpsSetting(var1.getGpsSetting());
         }

         this.mergeUnknownFields(SportprofileRangerSettings$PbRangerSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileRangerSettings$PbRangerSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder setGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.gpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileRangerSettings$PbRangerSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileRangerSettings$PbRangerSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileRangerSettings$PbRangerSportProfileSettings$Builder)super.setUnknownFields(var1);
   }
}
