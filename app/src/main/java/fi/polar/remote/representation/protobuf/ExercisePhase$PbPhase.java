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

public final class ExercisePhase$PbPhase extends GeneratedMessageV3 implements ExercisePhase$PbPhaseOrBuilder {
   public static final int CHANGE_FIELD_NUMBER = 2;
   private static final ExercisePhase$PbPhase DEFAULT_INSTANCE = new ExercisePhase$PbPhase();
   public static final int GOAL_FIELD_NUMBER = 3;
   public static final int INTENSITY_FIELD_NUMBER = 4;
   public static final int JUMP_INDEX_FIELD_NUMBER = 6;
   public static final int NAME_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExercisePhase$PbPhase$1();
   public static final int REPEAT_COUNT_FIELD_NUMBER = 5;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int change_;
   private ExercisePhase$PbPhaseGoal goal_;
   private ExercisePhase$PbPhaseIntensity intensity_;
   private int jumpIndex_;
   private byte memoizedIsInitialized;
   private Structures$PbOneLineText name_;
   private int repeatCount_;

   private ExercisePhase$PbPhase() {
      this.memoizedIsInitialized = (byte)-1;
      this.change_ = 0;
      this.repeatCount_ = 0;
      this.jumpIndex_ = 0;
   }

   private ExercisePhase$PbPhase(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExercisePhase$PbPhase(CodedInputStream var1, ExtensionRegistryLite var2, ExercisePhase$1 var3) {
      this(var1, var2);
   }

   private ExercisePhase$PbPhase(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExercisePhase$PbPhase(Builder var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExercisePhase$PbPhase var0, int var1) {
      var0.change_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExercisePhase$PbPhase var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExercisePhase$PbPhaseGoal a(ExercisePhase$PbPhase var0, ExercisePhase$PbPhaseGoal var1) {
      var0.goal_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExercisePhase$PbPhaseIntensity a(ExercisePhase$PbPhase var0, ExercisePhase$PbPhaseIntensity var1) {
      var0.intensity_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText a(ExercisePhase$PbPhase var0, Structures$PbOneLineText var1) {
      var0.name_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExercisePhase$PbPhase var0, int var1) {
      var0.repeatCount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExercisePhase$PbPhase var0, int var1) {
      var0.jumpIndex_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(ExercisePhase$PbPhase var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExercisePhase$PbPhase getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.g();
   }

   public static ExercisePhase$PbPhase$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExercisePhase$PbPhase$Builder newBuilder(ExercisePhase$PbPhase var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExercisePhase$PbPhase parseDelimitedFrom(InputStream var0) {
      return (ExercisePhase$PbPhase)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhase parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhase)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhase parseFrom(ByteString var0) {
      return (ExercisePhase$PbPhase)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhase parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhase)PARSER.parseFrom(var0, var1);
   }

   public static ExercisePhase$PbPhase parseFrom(CodedInputStream var0) {
      return (ExercisePhase$PbPhase)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhase parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhase)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhase parseFrom(InputStream var0) {
      return (ExercisePhase$PbPhase)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhase parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhase)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhase parseFrom(byte[] var0) {
      return (ExercisePhase$PbPhase)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhase parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhase)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExercisePhase$PbPhase)) {
            var2 = super.equals(var1);
         } else {
            ExercisePhase$PbPhase var5 = (ExercisePhase$PbPhase)var1;
            boolean var3;
            if (this.hasName() == var5.hasName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasName()) {
               if (var3 && this.getName().equals(var5.getName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasChange() == var5.hasChange()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasChange()) {
               if (var4 && this.change_ == var5.change_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasGoal() == var5.hasGoal()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasGoal()) {
               if (var4 && this.getGoal().equals(var5.getGoal())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasIntensity() == var5.hasIntensity()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasIntensity()) {
               if (var3 && this.getIntensity().equals(var5.getIntensity())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasRepeatCount() == var5.hasRepeatCount()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasRepeatCount()) {
               if (var4 && this.getRepeatCount() == var5.getRepeatCount()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasJumpIndex() == var5.hasJumpIndex()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasJumpIndex()) {
               if (var4 && this.getJumpIndex() == var5.getJumpIndex()) {
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

   public ExercisePhase$PbPhase$PbPhaseChangeType getChange() {
      ExercisePhase$PbPhase$PbPhaseChangeType var1 = ExercisePhase$PbPhase$PbPhaseChangeType.valueOf(this.change_);
      ExercisePhase$PbPhase$PbPhaseChangeType var2 = var1;
      if (var1 == null) {
         var2 = ExercisePhase$PbPhase$PbPhaseChangeType.CHANGE_MANUAL;
      }

      return var2;
   }

   public ExercisePhase$PbPhase getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ExercisePhase$PbPhaseGoal getGoal() {
      ExercisePhase$PbPhaseGoal var1;
      if (this.goal_ == null) {
         var1 = ExercisePhase$PbPhaseGoal.getDefaultInstance();
      } else {
         var1 = this.goal_;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseGoalOrBuilder getGoalOrBuilder() {
      ExercisePhase$PbPhaseGoal var1;
      if (this.goal_ == null) {
         var1 = ExercisePhase$PbPhaseGoal.getDefaultInstance();
      } else {
         var1 = this.goal_;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity getIntensity() {
      ExercisePhase$PbPhaseIntensity var1;
      if (this.intensity_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity.getDefaultInstance();
      } else {
         var1 = this.intensity_;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensityOrBuilder getIntensityOrBuilder() {
      ExercisePhase$PbPhaseIntensity var1;
      if (this.intensity_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity.getDefaultInstance();
      } else {
         var1 = this.intensity_;
      }

      return var1;
   }

   public int getJumpIndex() {
      return this.jumpIndex_;
   }

   public Structures$PbOneLineText getName() {
      Structures$PbOneLineText var1;
      if (this.name_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.name_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getNameOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.name_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.name_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getRepeatCount() {
      return this.repeatCount_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getName());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeEnumSize(2, this.change_);
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getGoal());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeMessageSize(4, this.getIntensity());
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(5, this.repeatCount_);
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(6, this.jumpIndex_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasChange() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoal() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntensity() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasJumpIndex() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasName() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRepeatCount() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasName()) {
            var2 = (var1 * 37 + 1) * 53 + this.getName().hashCode();
         }

         var1 = var2;
         if (this.hasChange()) {
            var1 = (var2 * 37 + 2) * 53 + this.change_;
         }

         var2 = var1;
         if (this.hasGoal()) {
            var2 = (var1 * 37 + 3) * 53 + this.getGoal().hashCode();
         }

         int var3 = var2;
         if (this.hasIntensity()) {
            var3 = (var2 * 37 + 4) * 53 + this.getIntensity().hashCode();
         }

         var1 = var3;
         if (this.hasRepeatCount()) {
            var1 = (var3 * 37 + 5) * 53 + this.getRepeatCount();
         }

         var2 = var1;
         if (this.hasJumpIndex()) {
            var2 = (var1 * 37 + 6) * 53 + this.getJumpIndex();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhase.h().ensureFieldAccessorsInitialized(ExercisePhase$PbPhase.class, ExercisePhase$PbPhase$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasChange()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasGoal()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasIntensity()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getName().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getGoal().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getIntensity().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExercisePhase$PbPhase$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExercisePhase$PbPhase$Builder newBuilderForType(BuilderParent var1) {
      return new ExercisePhase$PbPhase$Builder(var1, (ExercisePhase$1)null);
   }

   public ExercisePhase$PbPhase$Builder toBuilder() {
      ExercisePhase$PbPhase$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExercisePhase$PbPhase$Builder((ExercisePhase$1)null);
      } else {
         var1 = (new ExercisePhase$PbPhase$Builder((ExercisePhase$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getName());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.change_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getGoal());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getIntensity());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeUInt32(5, this.repeatCount_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeUInt32(6, this.jumpIndex_);
      }

      this.unknownFields.writeTo(var1);
   }
}
