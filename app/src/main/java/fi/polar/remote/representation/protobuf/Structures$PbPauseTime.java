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

public final class Structures$PbPauseTime extends GeneratedMessageV3 implements Structures$PbPauseTimeOrBuilder {
   private static final Structures$PbPauseTime DEFAULT_INSTANCE = new Structures$PbPauseTime();
   public static final int DURATION_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Structures$PbPauseTime$1();
   public static final int START_TIME_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration duration_;
   private byte memoizedIsInitialized;
   private Types$PbDuration startTime_;

   private Structures$PbPauseTime() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private Structures$PbPauseTime(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbPauseTime(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbPauseTime(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbPauseTime(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbPauseTime var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbPauseTime var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Structures$PbPauseTime var0, Types$PbDuration var1) {
      var0.startTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(Structures$PbPauseTime var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbPauseTime getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.S();
   }

   public static Structures$PbPauseTime$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbPauseTime$Builder newBuilder(Structures$PbPauseTime var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbPauseTime parseDelimitedFrom(InputStream var0) {
      return (Structures$PbPauseTime)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbPauseTime parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbPauseTime)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbPauseTime parseFrom(ByteString var0) {
      return (Structures$PbPauseTime)PARSER.parseFrom(var0);
   }

   public static Structures$PbPauseTime parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbPauseTime)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbPauseTime parseFrom(CodedInputStream var0) {
      return (Structures$PbPauseTime)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbPauseTime parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbPauseTime)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbPauseTime parseFrom(InputStream var0) {
      return (Structures$PbPauseTime)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbPauseTime parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbPauseTime)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbPauseTime parseFrom(byte[] var0) {
      return (Structures$PbPauseTime)PARSER.parseFrom(var0);
   }

   public static Structures$PbPauseTime parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbPauseTime)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbPauseTime)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbPauseTime var5 = (Structures$PbPauseTime)var1;
            boolean var3;
            if (this.hasStartTime() == var5.hasStartTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStartTime()) {
               if (var3 && this.getStartTime().equals(var5.getStartTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDuration() == var5.hasDuration()) {
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

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Structures$PbPauseTime getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
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

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getStartTime());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getDuration());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDuration getStartTime() {
      Types$PbDuration var1;
      if (this.startTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getStartTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.startTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
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
         if (this.hasStartTime()) {
            var1 = (var2 * 37 + 1) * 53 + this.getStartTime().hashCode();
         }

         var2 = var1;
         if (this.hasDuration()) {
            var2 = (var1 * 37 + 2) * 53 + this.getDuration().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.T().ensureFieldAccessorsInitialized(Structures$PbPauseTime.class, Structures$PbPauseTime$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasDuration()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbPauseTime$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbPauseTime$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbPauseTime$Builder(var1, (Structures$1)null);
   }

   public Structures$PbPauseTime$Builder toBuilder() {
      Structures$PbPauseTime$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbPauseTime$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbPauseTime$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStartTime());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getDuration());
      }

      this.unknownFields.writeTo(var1);
   }
}
