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

public final class Structures$PbDeviceId extends GeneratedMessageV3 implements Structures$PbDeviceIdOrBuilder {
   private static final Structures$PbDeviceId DEFAULT_INSTANCE = new Structures$PbDeviceId();
   public static final int DEVICE_ID_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Structures$PbDeviceId$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private volatile Object deviceId_;
   private byte memoizedIsInitialized;

   private Structures$PbDeviceId() {
      this.memoizedIsInitialized = (byte)-1;
      this.deviceId_ = "";
   }

   private Structures$PbDeviceId(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbDeviceId(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbDeviceId(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbDeviceId(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbDeviceId var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(Structures$PbDeviceId var0) {
      return var0.deviceId_;
   }

   // $FF: synthetic method
   static Object a(Structures$PbDeviceId var0, Object var1) {
      var0.deviceId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(Structures$PbDeviceId var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbDeviceId getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.u();
   }

   public static Structures$PbDeviceId$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbDeviceId$Builder newBuilder(Structures$PbDeviceId var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbDeviceId parseDelimitedFrom(InputStream var0) {
      return (Structures$PbDeviceId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbDeviceId parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbDeviceId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbDeviceId parseFrom(ByteString var0) {
      return (Structures$PbDeviceId)PARSER.parseFrom(var0);
   }

   public static Structures$PbDeviceId parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbDeviceId)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbDeviceId parseFrom(CodedInputStream var0) {
      return (Structures$PbDeviceId)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbDeviceId parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbDeviceId)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbDeviceId parseFrom(InputStream var0) {
      return (Structures$PbDeviceId)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbDeviceId parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbDeviceId)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbDeviceId parseFrom(byte[] var0) {
      return (Structures$PbDeviceId)PARSER.parseFrom(var0);
   }

   public static Structures$PbDeviceId parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbDeviceId)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbDeviceId)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbDeviceId var5 = (Structures$PbDeviceId)var1;
            boolean var3;
            if (this.hasDeviceId() == var5.hasDeviceId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasDeviceId()) {
               if (var3 && this.getDeviceId().equals(var5.getDeviceId())) {
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

   public Structures$PbDeviceId getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public String getDeviceId() {
      Object var1 = this.deviceId_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.deviceId_ = var3;
         }
      }

      return var3;
   }

   public ByteString getDeviceIdBytes() {
      Object var1 = this.deviceId_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.deviceId_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + GeneratedMessageV3.computeStringSize(1, this.deviceId_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDeviceId() {
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
         if (this.hasDeviceId()) {
            var1 = (var2 * 37 + 1) * 53 + this.getDeviceId().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.v().ensureFieldAccessorsInitialized(Structures$PbDeviceId.class, Structures$PbDeviceId$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasDeviceId()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbDeviceId$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbDeviceId$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbDeviceId$Builder(var1, (Structures$1)null);
   }

   public Structures$PbDeviceId$Builder toBuilder() {
      Structures$PbDeviceId$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbDeviceId$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbDeviceId$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         GeneratedMessageV3.writeString(var1, 1, this.deviceId_);
      }

      this.unknownFields.writeTo(var1);
   }
}
