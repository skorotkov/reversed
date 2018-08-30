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

public final class ExerciseLap$PbLapStrideLengthStatistics$Builder extends Builder implements ExerciseLap$PbLapStrideLengthStatisticsOrBuilder {
   private int average_;
   private int bitField0_;

   private ExerciseLap$PbLapStrideLengthStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapStrideLengthStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapStrideLengthStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapStrideLengthStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.w();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapStrideLengthStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapStrideLengthStatistics build() {
      ExerciseLap$PbLapStrideLengthStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapStrideLengthStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapStrideLengthStatistics var2 = new ExerciseLap$PbLapStrideLengthStatistics(this, (ExerciseLap$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapStrideLengthStatistics.a(var2, this.average_);
      ExerciseLap$PbLapStrideLengthStatistics.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder clone() {
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseLap$PbLapStrideLengthStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapStrideLengthStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.w();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.x().ensureFieldAccessorsInitialized(ExerciseLap$PbLapStrideLengthStatistics.class, ExerciseLap$PbLapStrideLengthStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapStrideLengthStatistics var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseLap$PbLapStrideLengthStatistics)ExerciseLap$PbLapStrideLengthStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseLap$PbLapStrideLengthStatistics)var11.getUnfinishedMessage();
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

   public ExerciseLap$PbLapStrideLengthStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapStrideLengthStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapStrideLengthStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapStrideLengthStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder mergeFrom(ExerciseLap$PbLapStrideLengthStatistics var1) {
      if (var1 != ExerciseLap$PbLapStrideLengthStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapStrideLengthStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapStrideLengthStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapStrideLengthStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)super.setUnknownFields(var1);
   }
}
