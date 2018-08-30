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

public final class UserDeviceSettings$PbUserMapSettings$Builder extends Builder implements UserDeviceSettings$PbUserMapSettingsOrBuilder {
   private boolean altitudeDataEnabled_;
   private boolean bikeRouteDataEnabled_;
   private int bitField0_;
   private int mapTopDirection_;

   private UserDeviceSettings$PbUserMapSettings$Builder() {
      this.mapTopDirection_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserMapSettings$Builder(BuilderParent var1) {
      super(var1);
      this.mapTopDirection_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserMapSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserMapSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.w();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserMapSettings.b()) {
      }

   }

   public UserDeviceSettings$PbUserMapSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserMapSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserMapSettings build() {
      UserDeviceSettings$PbUserMapSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserMapSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserMapSettings var2 = new UserDeviceSettings$PbUserMapSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserMapSettings.a(var2, this.mapTopDirection_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      UserDeviceSettings$PbUserMapSettings.a(var2, this.altitudeDataEnabled_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      UserDeviceSettings$PbUserMapSettings.b(var2, this.bikeRouteDataEnabled_);
      UserDeviceSettings$PbUserMapSettings.b(var2, var5);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder clear() {
      super.clear();
      this.mapTopDirection_ = 1;
      this.bitField0_ &= -2;
      this.altitudeDataEnabled_ = false;
      this.bitField0_ &= -3;
      this.bikeRouteDataEnabled_ = false;
      this.bitField0_ &= -5;
      return this;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder clearAltitudeDataEnabled() {
      this.bitField0_ &= -3;
      this.altitudeDataEnabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder clearBikeRouteDataEnabled() {
      this.bitField0_ &= -5;
      this.bikeRouteDataEnabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserMapSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserMapSettings$Builder clearMapTopDirection() {
      this.bitField0_ &= -2;
      this.mapTopDirection_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserMapSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserMapSettings$Builder clone() {
      return (UserDeviceSettings$PbUserMapSettings$Builder)super.clone();
   }

   public boolean getAltitudeDataEnabled() {
      return this.altitudeDataEnabled_;
   }

   public boolean getBikeRouteDataEnabled() {
      return this.bikeRouteDataEnabled_;
   }

   public UserDeviceSettings$PbUserMapSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserMapSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.w();
   }

   public UserDeviceSettings$PbUserMapSettings$PbMapTopDirection getMapTopDirection() {
      UserDeviceSettings$PbUserMapSettings$PbMapTopDirection var1 = UserDeviceSettings$PbUserMapSettings$PbMapTopDirection.valueOf(this.mapTopDirection_);
      UserDeviceSettings$PbUserMapSettings$PbMapTopDirection var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserMapSettings$PbMapTopDirection.TOP_DIRECTION_NORTH;
      }

      return var2;
   }

   public boolean hasAltitudeDataEnabled() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBikeRouteDataEnabled() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMapTopDirection() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.x().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserMapSettings.class, UserDeviceSettings$PbUserMapSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasMapTopDirection()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserMapSettings var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (UserDeviceSettings$PbUserMapSettings)UserDeviceSettings$PbUserMapSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (UserDeviceSettings$PbUserMapSettings)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserMapSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserMapSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserMapSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder mergeFrom(UserDeviceSettings$PbUserMapSettings var1) {
      if (var1 != UserDeviceSettings$PbUserMapSettings.getDefaultInstance()) {
         if (var1.hasMapTopDirection()) {
            this.setMapTopDirection(var1.getMapTopDirection());
         }

         if (var1.hasAltitudeDataEnabled()) {
            this.setAltitudeDataEnabled(var1.getAltitudeDataEnabled());
         }

         if (var1.hasBikeRouteDataEnabled()) {
            this.setBikeRouteDataEnabled(var1.getBikeRouteDataEnabled());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserMapSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserMapSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserMapSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserMapSettings$Builder setAltitudeDataEnabled(boolean var1) {
      this.bitField0_ |= 2;
      this.altitudeDataEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder setBikeRouteDataEnabled(boolean var1) {
      this.bitField0_ |= 4;
      this.bikeRouteDataEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserMapSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserMapSettings$Builder setMapTopDirection(UserDeviceSettings$PbUserMapSettings$PbMapTopDirection var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.mapTopDirection_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserMapSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserMapSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserMapSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserMapSettings$Builder)super.setUnknownFields(var1);
   }
}
