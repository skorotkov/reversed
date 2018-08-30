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

public final class Structures$PbStravaSegmentTargets extends GeneratedMessageV3 implements Structures$PbStravaSegmentTargetsOrBuilder {
   private static final Structures$PbStravaSegmentTargets DEFAULT_INSTANCE = new Structures$PbStravaSegmentTargets();
   public static final int KOM_QOM_FIELD_NUMBER = 2;
   public static final int OWN_BEST_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Structures$PbStravaSegmentTargets$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration komQom_;
   private byte memoizedIsInitialized;
   private Types$PbDuration ownBest_;

   private Structures$PbStravaSegmentTargets() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private Structures$PbStravaSegmentTargets(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbStravaSegmentTargets(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbStravaSegmentTargets(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbStravaSegmentTargets(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbStravaSegmentTargets var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbStravaSegmentTargets var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Structures$PbStravaSegmentTargets var0, Types$PbDuration var1) {
      var0.ownBest_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(Structures$PbStravaSegmentTargets var0, Types$PbDuration var1) {
      var0.komQom_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbStravaSegmentTargets getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.c();
   }

   public static Structures$PbStravaSegmentTargets$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbStravaSegmentTargets$Builder newBuilder(Structures$PbStravaSegmentTargets var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbStravaSegmentTargets parseDelimitedFrom(InputStream var0) {
      return (Structures$PbStravaSegmentTargets)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbStravaSegmentTargets parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTargets)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbStravaSegmentTargets parseFrom(ByteString var0) {
      return (Structures$PbStravaSegmentTargets)PARSER.parseFrom(var0);
   }

   public static Structures$PbStravaSegmentTargets parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTargets)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbStravaSegmentTargets parseFrom(CodedInputStream var0) {
      return (Structures$PbStravaSegmentTargets)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbStravaSegmentTargets parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTargets)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbStravaSegmentTargets parseFrom(InputStream var0) {
      return (Structures$PbStravaSegmentTargets)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbStravaSegmentTargets parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTargets)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbStravaSegmentTargets parseFrom(byte[] var0) {
      return (Structures$PbStravaSegmentTargets)PARSER.parseFrom(var0);
   }

   public static Structures$PbStravaSegmentTargets parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTargets)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbStravaSegmentTargets)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbStravaSegmentTargets var5 = (Structures$PbStravaSegmentTargets)var1;
            boolean var3;
            if (this.hasOwnBest() == var5.hasOwnBest()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasOwnBest()) {
               if (var3 && this.getOwnBest().equals(var5.getOwnBest())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasKomQom() == var5.hasKomQom()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasKomQom()) {
               if (var3 && this.getKomQom().equals(var5.getKomQom())) {
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

   public Structures$PbStravaSegmentTargets getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbDuration getKomQom() {
      Types$PbDuration var1;
      if (this.komQom_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.komQom_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getKomQomOrBuilder() {
      Types$PbDuration var1;
      if (this.komQom_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.komQom_;
      }

      return var1;
   }

   public Types$PbDuration getOwnBest() {
      Types$PbDuration var1;
      if (this.ownBest_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.ownBest_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getOwnBestOrBuilder() {
      Types$PbDuration var1;
      if (this.ownBest_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.ownBest_;
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getOwnBest());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getKomQom());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasKomQom() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOwnBest() {
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
         if (this.hasOwnBest()) {
            var1 = (var2 * 37 + 1) * 53 + this.getOwnBest().hashCode();
         }

         var2 = var1;
         if (this.hasKomQom()) {
            var2 = (var1 * 37 + 2) * 53 + this.getKomQom().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.d().ensureFieldAccessorsInitialized(Structures$PbStravaSegmentTargets.class, Structures$PbStravaSegmentTargets$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbStravaSegmentTargets$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbStravaSegmentTargets$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbStravaSegmentTargets$Builder(var1, (Structures$1)null);
   }

   public Structures$PbStravaSegmentTargets$Builder toBuilder() {
      Structures$PbStravaSegmentTargets$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbStravaSegmentTargets$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbStravaSegmentTargets$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getOwnBest());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getKomQom());
      }

      this.unknownFields.writeTo(var1);
   }
}
