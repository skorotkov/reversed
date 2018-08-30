package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class TrainingSessionTarget$PbTrainingSessionTarget extends GeneratedMessageV3 implements TrainingSessionTarget$PbTrainingSessionTargetOrBuilder {
   private static final TrainingSessionTarget$PbTrainingSessionTarget DEFAULT_INSTANCE = new TrainingSessionTarget$PbTrainingSessionTarget();
   public static final int DESCRIPTION_FIELD_NUMBER = 5;
   public static final int DURATION_FIELD_NUMBER = 8;
   public static final int EVENT_ID_FIELD_NUMBER = 10;
   public static final int EXERCISE_TARGET_FIELD_NUMBER = 6;
   public static final int NAME_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new TrainingSessionTarget$PbTrainingSessionTarget$1();
   public static final int SPORT_ID_FIELD_NUMBER = 3;
   public static final int START_TIME_FIELD_NUMBER = 4;
   public static final int TARGET_DONE_FIELD_NUMBER = 7;
   public static final int TRAINING_PROGRAM_ID_FIELD_NUMBER = 9;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Structures$PbMultiLineText description_;
   private Types$PbDuration duration_;
   private Structures$PbEventId eventId_;
   private List exerciseTarget_;
   private byte memoizedIsInitialized;
   private Structures$PbOneLineText name_;
   private Structures$PbSportIdentifier sportId_;
   private Types$PbLocalDateTime startTime_;
   private boolean targetDone_;
   private Structures$PbTrainingProgramId trainingProgramId_;

   private TrainingSessionTarget$PbTrainingSessionTarget() {
      this.memoizedIsInitialized = (byte)-1;
      this.exerciseTarget_ = Collections.emptyList();
      this.targetDone_ = false;
   }

   private TrainingSessionTarget$PbTrainingSessionTarget(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbTrainingSessionTarget(CodedInputStream var1, ExtensionRegistryLite var2, TrainingSessionTarget$1 var3) {
      this(var1, var2);
   }

   private TrainingSessionTarget$PbTrainingSessionTarget(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbTrainingSessionTarget(Builder var1, TrainingSessionTarget$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(TrainingSessionTarget$PbTrainingSessionTarget var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbEventId a(TrainingSessionTarget$PbTrainingSessionTarget var0, Structures$PbEventId var1) {
      var0.eventId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbMultiLineText a(TrainingSessionTarget$PbTrainingSessionTarget var0, Structures$PbMultiLineText var1) {
      var0.description_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText a(TrainingSessionTarget$PbTrainingSessionTarget var0, Structures$PbOneLineText var1) {
      var0.name_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSportIdentifier a(TrainingSessionTarget$PbTrainingSessionTarget var0, Structures$PbSportIdentifier var1) {
      var0.sportId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbTrainingProgramId a(TrainingSessionTarget$PbTrainingSessionTarget var0, Structures$PbTrainingProgramId var1) {
      var0.trainingProgramId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(TrainingSessionTarget$PbTrainingSessionTarget var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(TrainingSessionTarget$PbTrainingSessionTarget var0, Types$PbLocalDateTime var1) {
      var0.startTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(TrainingSessionTarget$PbTrainingSessionTarget var0) {
      return var0.exerciseTarget_;
   }

   // $FF: synthetic method
   static List a(TrainingSessionTarget$PbTrainingSessionTarget var0, List var1) {
      var0.exerciseTarget_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(TrainingSessionTarget$PbTrainingSessionTarget var0, boolean var1) {
      var0.targetDone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(TrainingSessionTarget$PbTrainingSessionTarget var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return TrainingSessionTarget.e();
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget$Builder newBuilder(TrainingSessionTarget$PbTrainingSessionTarget var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseDelimitedFrom(InputStream var0) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseFrom(ByteString var0) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)PARSER.parseFrom(var0);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)PARSER.parseFrom(var0, var1);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseFrom(CodedInputStream var0) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseFrom(InputStream var0) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseFrom(byte[] var0) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)PARSER.parseFrom(var0);
   }

   public static TrainingSessionTarget$PbTrainingSessionTarget parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof TrainingSessionTarget$PbTrainingSessionTarget)) {
            var2 = super.equals(var1);
         } else {
            TrainingSessionTarget$PbTrainingSessionTarget var5 = (TrainingSessionTarget$PbTrainingSessionTarget)var1;
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

            if (var4 && this.hasSportId() == var5.hasSportId()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSportId()) {
               if (var4 && this.getSportId().equals(var5.getSportId())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasStartTime() == var5.hasStartTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStartTime()) {
               if (var3 && this.getStartTime().equals(var5.getStartTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDescription() == var5.hasDescription()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDescription()) {
               if (var4 && this.getDescription().equals(var5.getDescription())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.getExerciseTargetList().equals(var5.getExerciseTargetList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasTargetDone() == var5.hasTargetDone()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTargetDone()) {
               if (var4 && this.getTargetDone() == var5.getTargetDone()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDuration() == var5.hasDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDuration()) {
               if (var3 && this.getDuration().equals(var5.getDuration())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrainingProgramId() == var5.hasTrainingProgramId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTrainingProgramId()) {
               if (var3 && this.getTrainingProgramId().equals(var5.getTrainingProgramId())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasEventId() == var5.hasEventId()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasEventId()) {
               if (var4 && this.getEventId().equals(var5.getEventId())) {
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

   public TrainingSessionTarget$PbTrainingSessionTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Structures$PbMultiLineText getDescription() {
      Structures$PbMultiLineText var1;
      if (this.description_ == null) {
         var1 = Structures$PbMultiLineText.getDefaultInstance();
      } else {
         var1 = this.description_;
      }

      return var1;
   }

   public Structures$PbMultiLineTextOrBuilder getDescriptionOrBuilder() {
      Structures$PbMultiLineText var1;
      if (this.description_ == null) {
         var1 = Structures$PbMultiLineText.getDefaultInstance();
      } else {
         var1 = this.description_;
      }

      return var1;
   }

   public Types$PbDuration getDuration() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public Structures$PbEventId getEventId() {
      Structures$PbEventId var1;
      if (this.eventId_ == null) {
         var1 = Structures$PbEventId.getDefaultInstance();
      } else {
         var1 = this.eventId_;
      }

      return var1;
   }

   public Structures$PbEventIdOrBuilder getEventIdOrBuilder() {
      Structures$PbEventId var1;
      if (this.eventId_ == null) {
         var1 = Structures$PbEventId.getDefaultInstance();
      } else {
         var1 = this.eventId_;
      }

      return var1;
   }

   public TrainingSessionTarget$PbExerciseTarget getExerciseTarget(int var1) {
      return (TrainingSessionTarget$PbExerciseTarget)this.exerciseTarget_.get(var1);
   }

   public int getExerciseTargetCount() {
      return this.exerciseTarget_.size();
   }

   public List getExerciseTargetList() {
      return this.exerciseTarget_;
   }

   public TrainingSessionTarget$PbExerciseTargetOrBuilder getExerciseTargetOrBuilder(int var1) {
      return (TrainingSessionTarget$PbExerciseTargetOrBuilder)this.exerciseTarget_.get(var1);
   }

   public List getExerciseTargetOrBuilderList() {
      return this.exerciseTarget_;
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

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeMessageSize(2, this.getName()) + 0;
         } else {
            var2 = 0;
         }

         int var3 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var3 = var2 + CodedOutputStream.computeMessageSize(3, this.getSportId());
         }

         var2 = var3;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var3 + CodedOutputStream.computeMessageSize(4, this.getStartTime());
         }

         var3 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var3 = var2 + CodedOutputStream.computeMessageSize(5, this.getDescription());
         }

         var2 = var3;

         int var4;
         for(var3 = var1; var3 < this.exerciseTarget_.size(); var2 += var4) {
            var4 = CodedOutputStream.computeMessageSize(6, (MessageLite)this.exerciseTarget_.get(var3));
            ++var3;
         }

         var3 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var3 = var2 + CodedOutputStream.computeBoolSize(7, this.targetDone_);
         }

         var2 = var3;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var3 + CodedOutputStream.computeMessageSize(8, this.getDuration());
         }

         var3 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var3 = var2 + CodedOutputStream.computeMessageSize(9, this.getTrainingProgramId());
         }

         var2 = var3;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var3 + CodedOutputStream.computeMessageSize(10, this.getEventId());
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public Structures$PbSportIdentifier getSportId() {
      Structures$PbSportIdentifier var1;
      if (this.sportId_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sportId_;
      }

      return var1;
   }

   public Structures$PbSportIdentifierOrBuilder getSportIdOrBuilder() {
      Structures$PbSportIdentifier var1;
      if (this.sportId_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sportId_;
      }

      return var1;
   }

   public Types$PbLocalDateTime getStartTime() {
      Types$PbLocalDateTime var1;
      if (this.startTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getStartTimeOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.startTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return var1;
   }

   public boolean getTargetDone() {
      return this.targetDone_;
   }

   public Structures$PbTrainingProgramId getTrainingProgramId() {
      Structures$PbTrainingProgramId var1;
      if (this.trainingProgramId_ == null) {
         var1 = Structures$PbTrainingProgramId.getDefaultInstance();
      } else {
         var1 = this.trainingProgramId_;
      }

      return var1;
   }

   public Structures$PbTrainingProgramIdOrBuilder getTrainingProgramIdOrBuilder() {
      Structures$PbTrainingProgramId var1;
      if (this.trainingProgramId_ == null) {
         var1 = Structures$PbTrainingProgramId.getDefaultInstance();
      } else {
         var1 = this.trainingProgramId_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDescription() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEventId() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
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

   public boolean hasSportId() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartTime() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTargetDone() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingProgramId() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
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
         if (this.hasName()) {
            var1 = (var2 * 37 + 2) * 53 + this.getName().hashCode();
         }

         var2 = var1;
         if (this.hasSportId()) {
            var2 = (var1 * 37 + 3) * 53 + this.getSportId().hashCode();
         }

         var1 = var2;
         if (this.hasStartTime()) {
            var1 = (var2 * 37 + 4) * 53 + this.getStartTime().hashCode();
         }

         var2 = var1;
         if (this.hasDescription()) {
            var2 = (var1 * 37 + 5) * 53 + this.getDescription().hashCode();
         }

         var1 = var2;
         if (this.getExerciseTargetCount() > 0) {
            var1 = (var2 * 37 + 6) * 53 + this.getExerciseTargetList().hashCode();
         }

         var2 = var1;
         if (this.hasTargetDone()) {
            var2 = (var1 * 37 + 7) * 53 + Internal.hashBoolean(this.getTargetDone());
         }

         var1 = var2;
         if (this.hasDuration()) {
            var1 = (var2 * 37 + 8) * 53 + this.getDuration().hashCode();
         }

         var2 = var1;
         if (this.hasTrainingProgramId()) {
            var2 = (var1 * 37 + 9) * 53 + this.getTrainingProgramId().hashCode();
         }

         var1 = var2;
         if (this.hasEventId()) {
            var1 = (var2 * 37 + 10) * 53 + this.getEventId().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TrainingSessionTarget.f().ensureFieldAccessorsInitialized(TrainingSessionTarget$PbTrainingSessionTarget.class, TrainingSessionTarget$PbTrainingSessionTarget$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            if (!this.hasName()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getName().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasSportId() && !this.getSportId().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasStartTime() && !this.getStartTime().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasDescription() && !this.getDescription().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getExerciseTargetCount()) {
                     if (this.hasTrainingProgramId() && !this.getTrainingProgramId().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else if (this.hasEventId() && !this.getEventId().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else {
                        this.memoizedIsInitialized = (byte)1;
                        var3 = true;
                     }
                     break;
                  }

                  if (!this.getExerciseTarget(var4).isInitialized()) {
                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                     break;
                  }

                  ++var4;
               }
            }
         }
      }

      return var3;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder newBuilderForType() {
      return newBuilder();
   }

   protected TrainingSessionTarget$PbTrainingSessionTarget$Builder newBuilderForType(BuilderParent var1) {
      return new TrainingSessionTarget$PbTrainingSessionTarget$Builder(var1, (TrainingSessionTarget$1)null);
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder toBuilder() {
      TrainingSessionTarget$PbTrainingSessionTarget$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new TrainingSessionTarget$PbTrainingSessionTarget$Builder((TrainingSessionTarget$1)null);
      } else {
         var1 = (new TrainingSessionTarget$PbTrainingSessionTarget$Builder((TrainingSessionTarget$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(2, this.getName());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(3, this.getSportId());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(4, this.getStartTime());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(5, this.getDescription());
      }

      for(int var2 = 0; var2 < this.exerciseTarget_.size(); ++var2) {
         var1.writeMessage(6, (MessageLite)this.exerciseTarget_.get(var2));
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeBool(7, this.targetDone_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(8, this.getDuration());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(9, this.getTrainingProgramId());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(10, this.getEventId());
      }

      this.unknownFields.writeTo(var1);
   }
}
