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

public final class Types$PbWeek$Builder extends Builder implements Types$PbWeekOrBuilder {
   private int bitField0_;
   private int timeZoneOffset_;
   private int weekNumberISO8601_;
   private int weekStartDay_;
   private int year_;

   private Types$PbWeek$Builder() {
      this.weekStartDay_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbWeek$Builder(BuilderParent var1) {
      super(var1);
      this.weekStartDay_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbWeek$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbWeek$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.u();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbWeek.b()) {
      }

   }

   public Types$PbWeek$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbWeek$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbWeek build() {
      Types$PbWeek var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbWeek buildPartial() {
      byte var1 = 1;
      Types$PbWeek var2 = new Types$PbWeek(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbWeek.a(var2, this.weekNumberISO8601_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbWeek.b(var2, this.year_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Types$PbWeek.c(var2, this.timeZoneOffset_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      Types$PbWeek.d(var2, this.weekStartDay_);
      Types$PbWeek.e(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Types$PbWeek$Builder clear() {
      super.clear();
      this.weekNumberISO8601_ = 0;
      this.bitField0_ &= -2;
      this.year_ = 0;
      this.bitField0_ &= -3;
      this.timeZoneOffset_ = 0;
      this.bitField0_ &= -5;
      this.weekStartDay_ = 1;
      this.bitField0_ &= -9;
      return this;
   }

   public Types$PbWeek$Builder clearField(FieldDescriptor var1) {
      return (Types$PbWeek$Builder)super.clearField(var1);
   }

   public Types$PbWeek$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbWeek$Builder)super.clearOneof(var1);
   }

   public Types$PbWeek$Builder clearTimeZoneOffset() {
      this.bitField0_ &= -5;
      this.timeZoneOffset_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbWeek$Builder clearWeekNumberISO8601() {
      this.bitField0_ &= -2;
      this.weekNumberISO8601_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbWeek$Builder clearWeekStartDay() {
      this.bitField0_ &= -9;
      this.weekStartDay_ = 1;
      this.onChanged();
      return this;
   }

   public Types$PbWeek$Builder clearYear() {
      this.bitField0_ &= -3;
      this.year_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbWeek$Builder clone() {
      return (Types$PbWeek$Builder)super.clone();
   }

   public Types$PbWeek getDefaultInstanceForType() {
      return Types$PbWeek.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.u();
   }

   public int getTimeZoneOffset() {
      return this.timeZoneOffset_;
   }

   public int getWeekNumberISO8601() {
      return this.weekNumberISO8601_;
   }

   public Types$PbStartDayOfWeek getWeekStartDay() {
      Types$PbStartDayOfWeek var1 = Types$PbStartDayOfWeek.valueOf(this.weekStartDay_);
      Types$PbStartDayOfWeek var2 = var1;
      if (var1 == null) {
         var2 = Types$PbStartDayOfWeek.MONDAY;
      }

      return var2;
   }

   public int getYear() {
      return this.year_;
   }

   public boolean hasTimeZoneOffset() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWeekNumberISO8601() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWeekStartDay() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasYear() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.v().ensureFieldAccessorsInitialized(Types$PbWeek.class, Types$PbWeek$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasWeekNumberISO8601()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasYear()) {
            var2 = var1;
            if (this.hasTimeZoneOffset()) {
               var2 = var1;
               if (this.hasWeekStartDay()) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public Types$PbWeek$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbWeek var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Types$PbWeek)Types$PbWeek.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Types$PbWeek)var11.getUnfinishedMessage();
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

   public Types$PbWeek$Builder mergeFrom(Message var1) {
      Types$PbWeek$Builder var2;
      if (var1 instanceof Types$PbWeek) {
         var2 = this.mergeFrom((Types$PbWeek)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbWeek$Builder mergeFrom(Types$PbWeek var1) {
      if (var1 != Types$PbWeek.getDefaultInstance()) {
         if (var1.hasWeekNumberISO8601()) {
            this.setWeekNumberISO8601(var1.getWeekNumberISO8601());
         }

         if (var1.hasYear()) {
            this.setYear(var1.getYear());
         }

         if (var1.hasTimeZoneOffset()) {
            this.setTimeZoneOffset(var1.getTimeZoneOffset());
         }

         if (var1.hasWeekStartDay()) {
            this.setWeekStartDay(var1.getWeekStartDay());
         }

         this.mergeUnknownFields(Types$PbWeek.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbWeek$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbWeek$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbWeek$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbWeek$Builder)super.setField(var1, var2);
   }

   public Types$PbWeek$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbWeek$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbWeek$Builder setTimeZoneOffset(int var1) {
      this.bitField0_ |= 4;
      this.timeZoneOffset_ = var1;
      this.onChanged();
      return this;
   }

   public final Types$PbWeek$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbWeek$Builder)super.setUnknownFields(var1);
   }

   public Types$PbWeek$Builder setWeekNumberISO8601(int var1) {
      this.bitField0_ |= 1;
      this.weekNumberISO8601_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbWeek$Builder setWeekStartDay(Types$PbStartDayOfWeek var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.weekStartDay_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Types$PbWeek$Builder setYear(int var1) {
      this.bitField0_ |= 2;
      this.year_ = var1;
      this.onChanged();
      return this;
   }
}
