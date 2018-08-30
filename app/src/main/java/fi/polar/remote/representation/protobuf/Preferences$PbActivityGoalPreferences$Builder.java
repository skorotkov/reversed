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

public final class Preferences$PbActivityGoalPreferences$Builder extends Builder implements Preferences$PbActivityGoalPreferencesOrBuilder {
   private int bitField0_;
   private boolean visible_;

   private Preferences$PbActivityGoalPreferences$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Preferences$PbActivityGoalPreferences$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Preferences$PbActivityGoalPreferences$Builder(BuilderParent var1, Preferences$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Preferences$PbActivityGoalPreferences$Builder(Preferences$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Preferences.e();
   }

   private void maybeForceBuilderInitialization() {
      if (Preferences$PbActivityGoalPreferences.b()) {
      }

   }

   public Preferences$PbActivityGoalPreferences$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Preferences$PbActivityGoalPreferences$Builder)super.addRepeatedField(var1, var2);
   }

   public Preferences$PbActivityGoalPreferences build() {
      Preferences$PbActivityGoalPreferences var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Preferences$PbActivityGoalPreferences buildPartial() {
      byte var1 = 1;
      Preferences$PbActivityGoalPreferences var2 = new Preferences$PbActivityGoalPreferences(this, (Preferences$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Preferences$PbActivityGoalPreferences.a(var2, this.visible_);
      Preferences$PbActivityGoalPreferences.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Preferences$PbActivityGoalPreferences$Builder clear() {
      super.clear();
      this.visible_ = false;
      this.bitField0_ &= -2;
      return this;
   }

   public Preferences$PbActivityGoalPreferences$Builder clearField(FieldDescriptor var1) {
      return (Preferences$PbActivityGoalPreferences$Builder)super.clearField(var1);
   }

   public Preferences$PbActivityGoalPreferences$Builder clearOneof(OneofDescriptor var1) {
      return (Preferences$PbActivityGoalPreferences$Builder)super.clearOneof(var1);
   }

   public Preferences$PbActivityGoalPreferences$Builder clearVisible() {
      this.bitField0_ &= -2;
      this.visible_ = false;
      this.onChanged();
      return this;
   }

   public Preferences$PbActivityGoalPreferences$Builder clone() {
      return (Preferences$PbActivityGoalPreferences$Builder)super.clone();
   }

   public Preferences$PbActivityGoalPreferences getDefaultInstanceForType() {
      return Preferences$PbActivityGoalPreferences.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Preferences.e();
   }

   public boolean getVisible() {
      return this.visible_;
   }

   public boolean hasVisible() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Preferences.f().ensureFieldAccessorsInitialized(Preferences$PbActivityGoalPreferences.class, Preferences$PbActivityGoalPreferences$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasVisible()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Preferences$PbActivityGoalPreferences$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Preferences$PbActivityGoalPreferences var13;
      label96: {
         InvalidProtocolBufferException var12;
         Preferences$PbActivityGoalPreferences var14;
         try {
            var13 = (Preferences$PbActivityGoalPreferences)Preferences$PbActivityGoalPreferences.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Preferences$PbActivityGoalPreferences)var10.getUnfinishedMessage();
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

   public Preferences$PbActivityGoalPreferences$Builder mergeFrom(Message var1) {
      Preferences$PbActivityGoalPreferences$Builder var2;
      if (var1 instanceof Preferences$PbActivityGoalPreferences) {
         var2 = this.mergeFrom((Preferences$PbActivityGoalPreferences)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Preferences$PbActivityGoalPreferences$Builder mergeFrom(Preferences$PbActivityGoalPreferences var1) {
      if (var1 != Preferences$PbActivityGoalPreferences.getDefaultInstance()) {
         if (var1.hasVisible()) {
            this.setVisible(var1.getVisible());
         }

         this.mergeUnknownFields(Preferences$PbActivityGoalPreferences.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Preferences$PbActivityGoalPreferences$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Preferences$PbActivityGoalPreferences$Builder)super.mergeUnknownFields(var1);
   }

   public Preferences$PbActivityGoalPreferences$Builder setField(FieldDescriptor var1, Object var2) {
      return (Preferences$PbActivityGoalPreferences$Builder)super.setField(var1, var2);
   }

   public Preferences$PbActivityGoalPreferences$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Preferences$PbActivityGoalPreferences$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Preferences$PbActivityGoalPreferences$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Preferences$PbActivityGoalPreferences$Builder)super.setUnknownFields(var1);
   }

   public Preferences$PbActivityGoalPreferences$Builder setVisible(boolean var1) {
      this.bitField0_ |= 1;
      this.visible_ = var1;
      this.onChanged();
      return this;
   }
}
