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

public final class Types$PbDate$Builder extends Builder implements Types$PbDateOrBuilder {
   private int bitField0_;
   private int day_;
   private int month_;
   private int year_;

   private Types$PbDate$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Types$PbDate$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbDate$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbDate$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.c();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbDate.b()) {
      }

   }

   public Types$PbDate$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbDate$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbDate build() {
      Types$PbDate var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbDate buildPartial() {
      byte var1 = 1;
      Types$PbDate var2 = new Types$PbDate(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbDate.a(var2, this.year_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbDate.b(var2, this.month_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Types$PbDate.c(var2, this.day_);
      Types$PbDate.d(var2, var5);
      this.onBuilt();
      return var2;
   }

   public Types$PbDate$Builder clear() {
      super.clear();
      this.year_ = 0;
      this.bitField0_ &= -2;
      this.month_ = 0;
      this.bitField0_ &= -3;
      this.day_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public Types$PbDate$Builder clearDay() {
      this.bitField0_ &= -5;
      this.day_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbDate$Builder clearField(FieldDescriptor var1) {
      return (Types$PbDate$Builder)super.clearField(var1);
   }

   public Types$PbDate$Builder clearMonth() {
      this.bitField0_ &= -3;
      this.month_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbDate$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbDate$Builder)super.clearOneof(var1);
   }

   public Types$PbDate$Builder clearYear() {
      this.bitField0_ &= -2;
      this.year_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbDate$Builder clone() {
      return (Types$PbDate$Builder)super.clone();
   }

   public int getDay() {
      return this.day_;
   }

   public Types$PbDate getDefaultInstanceForType() {
      return Types$PbDate.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.c();
   }

   public int getMonth() {
      return this.month_;
   }

   public int getYear() {
      return this.year_;
   }

   public boolean hasDay() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMonth() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasYear() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.d().ensureFieldAccessorsInitialized(Types$PbDate.class, Types$PbDate$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasYear()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasMonth()) {
            var2 = var1;
            if (this.hasDay()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public Types$PbDate$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbDate var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Types$PbDate)Types$PbDate.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Types$PbDate)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var13.unwrapIOException();
         } finally {
            if (var12 != null) {
               this.mergeFrom(var12);
            }

            throw var13;
         }
      }

      if (var12 != null) {
         this.mergeFrom(var12);
      }

      return this;
   }

   public Types$PbDate$Builder mergeFrom(Message var1) {
      Types$PbDate$Builder var2;
      if (var1 instanceof Types$PbDate) {
         var2 = this.mergeFrom((Types$PbDate)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbDate$Builder mergeFrom(Types$PbDate var1) {
      if (var1 != Types$PbDate.getDefaultInstance()) {
         if (var1.hasYear()) {
            this.setYear(var1.getYear());
         }

         if (var1.hasMonth()) {
            this.setMonth(var1.getMonth());
         }

         if (var1.hasDay()) {
            this.setDay(var1.getDay());
         }

         this.mergeUnknownFields(Types$PbDate.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbDate$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbDate$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbDate$Builder setDay(int var1) {
      this.bitField0_ |= 4;
      this.day_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbDate$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbDate$Builder)super.setField(var1, var2);
   }

   public Types$PbDate$Builder setMonth(int var1) {
      this.bitField0_ |= 2;
      this.month_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbDate$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbDate$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Types$PbDate$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbDate$Builder)super.setUnknownFields(var1);
   }

   public Types$PbDate$Builder setYear(int var1) {
      this.bitField0_ |= 1;
      this.year_ = var1;
      this.onChanged();
      return this;
   }
}
