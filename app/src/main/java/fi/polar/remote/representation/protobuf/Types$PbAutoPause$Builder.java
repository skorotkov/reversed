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

public final class Types$PbAutoPause$Builder extends Builder implements Types$PbAutoPauseOrBuilder {
   private int bitField0_;
   private float speedThreshold_;
   private int trigger_;

   private Types$PbAutoPause$Builder() {
      this.trigger_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbAutoPause$Builder(BuilderParent var1) {
      super(var1);
      this.trigger_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbAutoPause$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbAutoPause$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.E();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbAutoPause.b()) {
      }

   }

   public Types$PbAutoPause$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbAutoPause$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbAutoPause build() {
      Types$PbAutoPause var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbAutoPause buildPartial() {
      byte var1 = 1;
      Types$PbAutoPause var2 = new Types$PbAutoPause(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbAutoPause.a(var2, this.trigger_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbAutoPause.a(var2, this.speedThreshold_);
      Types$PbAutoPause.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Types$PbAutoPause$Builder clear() {
      super.clear();
      this.trigger_ = 0;
      this.bitField0_ &= -2;
      this.speedThreshold_ = 0.0F;
      this.bitField0_ &= -3;
      return this;
   }

   public Types$PbAutoPause$Builder clearField(FieldDescriptor var1) {
      return (Types$PbAutoPause$Builder)super.clearField(var1);
   }

   public Types$PbAutoPause$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbAutoPause$Builder)super.clearOneof(var1);
   }

   public Types$PbAutoPause$Builder clearSpeedThreshold() {
      this.bitField0_ &= -3;
      this.speedThreshold_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Types$PbAutoPause$Builder clearTrigger() {
      this.bitField0_ &= -2;
      this.trigger_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbAutoPause$Builder clone() {
      return (Types$PbAutoPause$Builder)super.clone();
   }

   public Types$PbAutoPause getDefaultInstanceForType() {
      return Types$PbAutoPause.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.E();
   }

   public float getSpeedThreshold() {
      return this.speedThreshold_;
   }

   public Types$PbAutoPause$PbAutoPauseTrigger getTrigger() {
      Types$PbAutoPause$PbAutoPauseTrigger var1 = Types$PbAutoPause$PbAutoPauseTrigger.valueOf(this.trigger_);
      Types$PbAutoPause$PbAutoPauseTrigger var2 = var1;
      if (var1 == null) {
         var2 = Types$PbAutoPause$PbAutoPauseTrigger.AUTO_PAUSE_OFF;
      }

      return var2;
   }

   public boolean hasSpeedThreshold() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrigger() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.F().ensureFieldAccessorsInitialized(Types$PbAutoPause.class, Types$PbAutoPause$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasTrigger()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Types$PbAutoPause$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbAutoPause var13;
      label96: {
         InvalidProtocolBufferException var12;
         Types$PbAutoPause var14;
         try {
            var13 = (Types$PbAutoPause)Types$PbAutoPause.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Types$PbAutoPause)var10.getUnfinishedMessage();
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

   public Types$PbAutoPause$Builder mergeFrom(Message var1) {
      Types$PbAutoPause$Builder var2;
      if (var1 instanceof Types$PbAutoPause) {
         var2 = this.mergeFrom((Types$PbAutoPause)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbAutoPause$Builder mergeFrom(Types$PbAutoPause var1) {
      if (var1 != Types$PbAutoPause.getDefaultInstance()) {
         if (var1.hasTrigger()) {
            this.setTrigger(var1.getTrigger());
         }

         if (var1.hasSpeedThreshold()) {
            this.setSpeedThreshold(var1.getSpeedThreshold());
         }

         this.mergeUnknownFields(Types$PbAutoPause.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbAutoPause$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbAutoPause$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbAutoPause$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbAutoPause$Builder)super.setField(var1, var2);
   }

   public Types$PbAutoPause$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbAutoPause$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbAutoPause$Builder setSpeedThreshold(float var1) {
      this.bitField0_ |= 2;
      this.speedThreshold_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbAutoPause$Builder setTrigger(Types$PbAutoPause$PbAutoPauseTrigger var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.trigger_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Types$PbAutoPause$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbAutoPause$Builder)super.setUnknownFields(var1);
   }
}
