package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class SportProfile$PbTrainingReminder extends GeneratedMessageV3 implements SportProfile$PbTrainingReminderOrBuilder {
   public static final int CALORIE_REMINDER_VALUE_FIELD_NUMBER = 3;
   private static final SportProfile$PbTrainingReminder DEFAULT_INSTANCE = new SportProfile$PbTrainingReminder();
   public static final int DISTANCE_REMINDER_VALUE_FIELD_NUMBER = 5;
   @Deprecated
   public static final Parser PARSER = new SportProfile$PbTrainingReminder$1();
   public static final int REMINDER_TEXT_FIELD_NUMBER = 2;
   public static final int REMINDER_TYPE_FIELD_NUMBER = 1;
   public static final int TIME_REMINDER_VALUE_FIELD_NUMBER = 4;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int calorieReminderValue_;
   private float distanceReminderValue_;
   private byte memoizedIsInitialized;
   private Structures$PbOneLineText reminderText_;
   private int reminderType_;
   private Types$PbDuration timeReminderValue_;

   private SportProfile$PbTrainingReminder() {
      this.memoizedIsInitialized = (byte)-1;
      this.reminderType_ = 1;
      this.calorieReminderValue_ = 0;
      this.distanceReminderValue_ = 0.0F;
   }

   private SportProfile$PbTrainingReminder(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportProfile$PbTrainingReminder(CodedInputStream var1, ExtensionRegistryLite var2, SportProfile$1 var3) {
      this(var1, var2);
   }

   private SportProfile$PbTrainingReminder(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportProfile$PbTrainingReminder(Builder var1, SportProfile$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(SportProfile$PbTrainingReminder var0, float var1) {
      var0.distanceReminderValue_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(SportProfile$PbTrainingReminder var0, int var1) {
      var0.reminderType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportProfile$PbTrainingReminder var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText a(SportProfile$PbTrainingReminder var0, Structures$PbOneLineText var1) {
      var0.reminderText_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(SportProfile$PbTrainingReminder var0, Types$PbDuration var1) {
      var0.timeReminderValue_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportProfile$PbTrainingReminder var0, int var1) {
      var0.calorieReminderValue_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SportProfile$PbTrainingReminder var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportProfile$PbTrainingReminder getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportProfile.a();
   }

   public static SportProfile$PbTrainingReminder$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportProfile$PbTrainingReminder$Builder newBuilder(SportProfile$PbTrainingReminder var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportProfile$PbTrainingReminder parseDelimitedFrom(InputStream var0) {
      return (SportProfile$PbTrainingReminder)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportProfile$PbTrainingReminder parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbTrainingReminder)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbTrainingReminder parseFrom(ByteString var0) {
      return (SportProfile$PbTrainingReminder)PARSER.parseFrom(var0);
   }

   public static SportProfile$PbTrainingReminder parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbTrainingReminder)PARSER.parseFrom(var0, var1);
   }

   public static SportProfile$PbTrainingReminder parseFrom(CodedInputStream var0) {
      return (SportProfile$PbTrainingReminder)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportProfile$PbTrainingReminder parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbTrainingReminder)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbTrainingReminder parseFrom(InputStream var0) {
      return (SportProfile$PbTrainingReminder)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportProfile$PbTrainingReminder parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbTrainingReminder)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbTrainingReminder parseFrom(byte[] var0) {
      return (SportProfile$PbTrainingReminder)PARSER.parseFrom(var0);
   }

   public static SportProfile$PbTrainingReminder parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbTrainingReminder)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportProfile$PbTrainingReminder)) {
            var2 = super.equals(var1);
         } else {
            SportProfile$PbTrainingReminder var5 = (SportProfile$PbTrainingReminder)var1;
            boolean var3;
            if (this.hasReminderType() == var5.hasReminderType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasReminderType()) {
               if (var3 && this.reminderType_ == var5.reminderType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasReminderText() == var5.hasReminderText()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasReminderText()) {
               if (var4 && this.getReminderText().equals(var5.getReminderText())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasCalorieReminderValue() == var5.hasCalorieReminderValue()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCalorieReminderValue()) {
               if (var4 && this.getCalorieReminderValue() == var5.getCalorieReminderValue()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTimeReminderValue() == var5.hasTimeReminderValue()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimeReminderValue()) {
               if (var4 && this.getTimeReminderValue().equals(var5.getTimeReminderValue())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDistanceReminderValue() == var5.hasDistanceReminderValue()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDistanceReminderValue()) {
               if (var4 && Float.floatToIntBits(this.getDistanceReminderValue()) == Float.floatToIntBits(var5.getDistanceReminderValue())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int getCalorieReminderValue() {
      return this.calorieReminderValue_;
   }

   public SportProfile$PbTrainingReminder getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getDistanceReminderValue() {
      return this.distanceReminderValue_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public Structures$PbOneLineText getReminderText() {
      Structures$PbOneLineText var1;
      if (this.reminderText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.reminderText_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getReminderTextOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.reminderText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.reminderText_;
      }

      return var1;
   }

   public SportProfile$PbTrainingReminder$PbTrainingReminderType getReminderType() {
      SportProfile$PbTrainingReminder$PbTrainingReminderType var1 = SportProfile$PbTrainingReminder$PbTrainingReminderType.valueOf(this.reminderType_);
      SportProfile$PbTrainingReminder$PbTrainingReminderType var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbTrainingReminder$PbTrainingReminderType.TRAINING_REMINDER_OFF;
      }

      return var2;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.reminderType_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getReminderText());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.calorieReminderValue_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getTimeReminderValue());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeFloatSize(5, this.distanceReminderValue_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDuration getTimeReminderValue() {
      Types$PbDuration var1;
      if (this.timeReminderValue_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeReminderValue_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeReminderValueOrBuilder() {
      Types$PbDuration var1;
      if (this.timeReminderValue_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeReminderValue_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCalorieReminderValue() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistanceReminderValue() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasReminderText() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasReminderType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeReminderValue() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
         if (this.hasReminderType()) {
            var1 = (var2 * 37 + 1) * 53 + this.reminderType_;
         }

         int var3 = var1;
         if (this.hasReminderText()) {
            var3 = (var1 * 37 + 2) * 53 + this.getReminderText().hashCode();
         }

         var2 = var3;
         if (this.hasCalorieReminderValue()) {
            var2 = (var3 * 37 + 3) * 53 + this.getCalorieReminderValue();
         }

         var1 = var2;
         if (this.hasTimeReminderValue()) {
            var1 = (var2 * 37 + 4) * 53 + this.getTimeReminderValue().hashCode();
         }

         var2 = var1;
         if (this.hasDistanceReminderValue()) {
            var2 = (var1 * 37 + 5) * 53 + Float.floatToIntBits(this.getDistanceReminderValue());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportProfile.b().ensureFieldAccessorsInitialized(SportProfile$PbTrainingReminder.class, SportProfile$PbTrainingReminder$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasReminderType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasReminderText() && !this.getReminderText().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SportProfile$PbTrainingReminder$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportProfile$PbTrainingReminder$Builder newBuilderForType(BuilderParent var1) {
      return new SportProfile$PbTrainingReminder$Builder(var1, (SportProfile$1)null);
   }

   public SportProfile$PbTrainingReminder$Builder toBuilder() {
      SportProfile$PbTrainingReminder$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportProfile$PbTrainingReminder$Builder((SportProfile$1)null);
      } else {
         var1 = (new SportProfile$PbTrainingReminder$Builder((SportProfile$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.reminderType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getReminderText());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.calorieReminderValue_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getTimeReminderValue());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeFloat(5, this.distanceReminderValue_);
      }

      this.unknownFields.writeTo(var1);
   }
}
