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

public final class SleepanalysisResult$PbSleepWakePhase extends GeneratedMessageV3 implements SleepanalysisResult$PbSleepWakePhaseOrBuilder {
   private static final SleepanalysisResult$PbSleepWakePhase DEFAULT_INSTANCE = new SleepanalysisResult$PbSleepWakePhase();
   @Deprecated
   public static final Parser PARSER = new SleepanalysisResult$PbSleepWakePhase$1();
   public static final int SECONDS_FROM_SLEEP_START_FIELD_NUMBER = 1;
   public static final int SLEEPWAKE_STATE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int secondsFromSleepStart_;
   private int sleepwakeState_;

   private SleepanalysisResult$PbSleepWakePhase() {
      this.memoizedIsInitialized = (byte)-1;
      this.secondsFromSleepStart_ = 0;
      this.sleepwakeState_ = -2;
   }

   private SleepanalysisResult$PbSleepWakePhase(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SleepanalysisResult$PbSleepWakePhase(CodedInputStream var1, ExtensionRegistryLite var2, SleepanalysisResult$1 var3) {
      this(var1, var2);
   }

   private SleepanalysisResult$PbSleepWakePhase(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SleepanalysisResult$PbSleepWakePhase(Builder var1, SleepanalysisResult$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SleepanalysisResult$PbSleepWakePhase var0, int var1) {
      var0.secondsFromSleepStart_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SleepanalysisResult$PbSleepWakePhase var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(SleepanalysisResult$PbSleepWakePhase var0, int var1) {
      var0.sleepwakeState_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SleepanalysisResult$PbSleepWakePhase var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SleepanalysisResult$PbSleepWakePhase getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SleepanalysisResult.a();
   }

   public static SleepanalysisResult$PbSleepWakePhase$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SleepanalysisResult$PbSleepWakePhase$Builder newBuilder(SleepanalysisResult$PbSleepWakePhase var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseDelimitedFrom(InputStream var0) {
      return (SleepanalysisResult$PbSleepWakePhase)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepWakePhase)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseFrom(ByteString var0) {
      return (SleepanalysisResult$PbSleepWakePhase)PARSER.parseFrom(var0);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepWakePhase)PARSER.parseFrom(var0, var1);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseFrom(CodedInputStream var0) {
      return (SleepanalysisResult$PbSleepWakePhase)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepWakePhase)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseFrom(InputStream var0) {
      return (SleepanalysisResult$PbSleepWakePhase)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepWakePhase)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseFrom(byte[] var0) {
      return (SleepanalysisResult$PbSleepWakePhase)PARSER.parseFrom(var0);
   }

   public static SleepanalysisResult$PbSleepWakePhase parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepWakePhase)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SleepanalysisResult$PbSleepWakePhase)) {
            var2 = super.equals(var1);
         } else {
            SleepanalysisResult$PbSleepWakePhase var5 = (SleepanalysisResult$PbSleepWakePhase)var1;
            boolean var3;
            if (this.hasSecondsFromSleepStart() == var5.hasSecondsFromSleepStart()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSecondsFromSleepStart()) {
               if (var3 && this.getSecondsFromSleepStart() == var5.getSecondsFromSleepStart()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSleepwakeState() == var5.hasSleepwakeState()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSleepwakeState()) {
               if (var3 && this.sleepwakeState_ == var5.sleepwakeState_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public SleepanalysisResult$PbSleepWakePhase getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSecondsFromSleepStart() {
      return this.secondsFromSleepStart_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.secondsFromSleepStart_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeEnumSize(2, this.sleepwakeState_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public SleepanalysisResult$PbSleepWakeState getSleepwakeState() {
      SleepanalysisResult$PbSleepWakeState var1 = SleepanalysisResult$PbSleepWakeState.valueOf(this.sleepwakeState_);
      SleepanalysisResult$PbSleepWakeState var2 = var1;
      if (var1 == null) {
         var2 = SleepanalysisResult$PbSleepWakeState.PB_WAKE;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasSecondsFromSleepStart() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepwakeState() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
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
         if (this.hasSecondsFromSleepStart()) {
            var1 = (var2 * 37 + 1) * 53 + this.getSecondsFromSleepStart();
         }

         var2 = var1;
         if (this.hasSleepwakeState()) {
            var2 = (var1 * 37 + 2) * 53 + this.sleepwakeState_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SleepanalysisResult.b().ensureFieldAccessorsInitialized(SleepanalysisResult$PbSleepWakePhase.class, SleepanalysisResult$PbSleepWakePhase$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSecondsFromSleepStart()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasSleepwakeState()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SleepanalysisResult$PbSleepWakePhase$Builder newBuilderForType(BuilderParent var1) {
      return new SleepanalysisResult$PbSleepWakePhase$Builder(var1, (SleepanalysisResult$1)null);
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder toBuilder() {
      SleepanalysisResult$PbSleepWakePhase$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SleepanalysisResult$PbSleepWakePhase$Builder((SleepanalysisResult$1)null);
      } else {
         var1 = (new SleepanalysisResult$PbSleepWakePhase$Builder((SleepanalysisResult$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.secondsFromSleepStart_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.sleepwakeState_);
      }

      this.unknownFields.writeTo(var1);
   }
}
