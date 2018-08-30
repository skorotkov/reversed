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

public final class Preferences$PbTrainingPreferences$Builder extends Builder implements Preferences$PbTrainingPreferencesOrBuilder {
   private int bitField0_;
   private int heartRateView_;
   private int oBSOLETEHeartRateZoneLock_;

   private Preferences$PbTrainingPreferences$Builder() {
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private Preferences$PbTrainingPreferences$Builder(BuilderParent var1) {
      super(var1);
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Preferences$PbTrainingPreferences$Builder(BuilderParent var1, Preferences$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Preferences$PbTrainingPreferences$Builder(Preferences$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Preferences.c();
   }

   private void maybeForceBuilderInitialization() {
      if (Preferences$PbTrainingPreferences.b()) {
      }

   }

   public Preferences$PbTrainingPreferences$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Preferences$PbTrainingPreferences$Builder)super.addRepeatedField(var1, var2);
   }

   public Preferences$PbTrainingPreferences build() {
      Preferences$PbTrainingPreferences var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Preferences$PbTrainingPreferences buildPartial() {
      byte var1 = 1;
      Preferences$PbTrainingPreferences var2 = new Preferences$PbTrainingPreferences(this, (Preferences$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Preferences$PbTrainingPreferences.a(var2, this.oBSOLETEHeartRateZoneLock_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Preferences$PbTrainingPreferences.b(var2, this.heartRateView_);
      Preferences$PbTrainingPreferences.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Preferences$PbTrainingPreferences$Builder clear() {
      super.clear();
      this.oBSOLETEHeartRateZoneLock_ = 0;
      this.bitField0_ &= -2;
      this.heartRateView_ = 1;
      this.bitField0_ &= -3;
      return this;
   }

   public Preferences$PbTrainingPreferences$Builder clearField(FieldDescriptor var1) {
      return (Preferences$PbTrainingPreferences$Builder)super.clearField(var1);
   }

   public Preferences$PbTrainingPreferences$Builder clearHeartRateView() {
      this.bitField0_ &= -3;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public Preferences$PbTrainingPreferences$Builder clearOBSOLETEHeartRateZoneLock() {
      this.bitField0_ &= -2;
      this.oBSOLETEHeartRateZoneLock_ = 0;
      this.onChanged();
      return this;
   }

   public Preferences$PbTrainingPreferences$Builder clearOneof(OneofDescriptor var1) {
      return (Preferences$PbTrainingPreferences$Builder)super.clearOneof(var1);
   }

   public Preferences$PbTrainingPreferences$Builder clone() {
      return (Preferences$PbTrainingPreferences$Builder)super.clone();
   }

   public Preferences$PbTrainingPreferences getDefaultInstanceForType() {
      return Preferences$PbTrainingPreferences.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Preferences.c();
   }

   public Types$PbHeartRateView getHeartRateView() {
      Types$PbHeartRateView var1 = Types$PbHeartRateView.valueOf(this.heartRateView_);
      Types$PbHeartRateView var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartRateView.HEART_RATE_VIEW_BPM;
      }

      return var2;
   }

   public int getOBSOLETEHeartRateZoneLock() {
      return this.oBSOLETEHeartRateZoneLock_;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEHeartRateZoneLock() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Preferences.d().ensureFieldAccessorsInitialized(Preferences$PbTrainingPreferences.class, Preferences$PbTrainingPreferences$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public Preferences$PbTrainingPreferences$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Preferences$PbTrainingPreferences var13;
      label96: {
         InvalidProtocolBufferException var12;
         Preferences$PbTrainingPreferences var14;
         try {
            var13 = (Preferences$PbTrainingPreferences)Preferences$PbTrainingPreferences.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Preferences$PbTrainingPreferences)var10.getUnfinishedMessage();
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

   public Preferences$PbTrainingPreferences$Builder mergeFrom(Message var1) {
      Preferences$PbTrainingPreferences$Builder var2;
      if (var1 instanceof Preferences$PbTrainingPreferences) {
         var2 = this.mergeFrom((Preferences$PbTrainingPreferences)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Preferences$PbTrainingPreferences$Builder mergeFrom(Preferences$PbTrainingPreferences var1) {
      if (var1 != Preferences$PbTrainingPreferences.getDefaultInstance()) {
         if (var1.hasOBSOLETEHeartRateZoneLock()) {
            this.setOBSOLETEHeartRateZoneLock(var1.getOBSOLETEHeartRateZoneLock());
         }

         if (var1.hasHeartRateView()) {
            this.setHeartRateView(var1.getHeartRateView());
         }

         this.mergeUnknownFields(Preferences$PbTrainingPreferences.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Preferences$PbTrainingPreferences$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Preferences$PbTrainingPreferences$Builder)super.mergeUnknownFields(var1);
   }

   public Preferences$PbTrainingPreferences$Builder setField(FieldDescriptor var1, Object var2) {
      return (Preferences$PbTrainingPreferences$Builder)super.setField(var1, var2);
   }

   public Preferences$PbTrainingPreferences$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Preferences$PbTrainingPreferences$Builder setOBSOLETEHeartRateZoneLock(int var1) {
      this.bitField0_ |= 1;
      this.oBSOLETEHeartRateZoneLock_ = var1;
      this.onChanged();
      return this;
   }

   public Preferences$PbTrainingPreferences$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Preferences$PbTrainingPreferences$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Preferences$PbTrainingPreferences$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Preferences$PbTrainingPreferences$Builder)super.setUnknownFields(var1);
   }
}
