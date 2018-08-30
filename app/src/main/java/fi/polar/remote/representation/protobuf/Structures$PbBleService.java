package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class Structures$PbBleService extends GeneratedMessageV3 implements Structures$PbBleServiceOrBuilder {
   public static final int CHARACTERISTICS_FIELD_NUMBER = 2;
   private static final Structures$PbBleService DEFAULT_INSTANCE = new Structures$PbBleService();
   @Deprecated
   public static final Parser PARSER = new Structures$PbBleService$1();
   public static final int SERVICEUUID_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private List characteristics_;
   private byte memoizedIsInitialized;
   private Structures$PbBleUuid serviceUuid_;

   private Structures$PbBleService() {
      this.memoizedIsInitialized = (byte)-1;
      this.characteristics_ = Collections.emptyList();
   }

   private Structures$PbBleService(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbBleService(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbBleService(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbBleService(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbBleService var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbBleUuid a(Structures$PbBleService var0, Structures$PbBleUuid var1) {
      var0.serviceUuid_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(Structures$PbBleService var0) {
      return var0.characteristics_;
   }

   // $FF: synthetic method
   static List a(Structures$PbBleService var0, List var1) {
      var0.characteristics_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(Structures$PbBleService var0) {
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

   public static Structures$PbBleService getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.ae();
   }

   public static Structures$PbBleService$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbBleService$Builder newBuilder(Structures$PbBleService var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbBleService parseDelimitedFrom(InputStream var0) {
      return (Structures$PbBleService)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbBleService parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleService)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleService parseFrom(ByteString var0) {
      return (Structures$PbBleService)PARSER.parseFrom(var0);
   }

   public static Structures$PbBleService parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleService)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbBleService parseFrom(CodedInputStream var0) {
      return (Structures$PbBleService)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbBleService parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleService)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleService parseFrom(InputStream var0) {
      return (Structures$PbBleService)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbBleService parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleService)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleService parseFrom(byte[] var0) {
      return (Structures$PbBleService)PARSER.parseFrom(var0);
   }

   public static Structures$PbBleService parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleService)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbBleService)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbBleService var5 = (Structures$PbBleService)var1;
            boolean var3;
            if (this.hasServiceUuid() == var5.hasServiceUuid()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasServiceUuid()) {
               if (var3 && this.getServiceUuid().equals(var5.getServiceUuid())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getCharacteristicsList().equals(var5.getCharacteristicsList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Structures$PbBleCharacteristic getCharacteristics(int var1) {
      return (Structures$PbBleCharacteristic)this.characteristics_.get(var1);
   }

   public int getCharacteristicsCount() {
      return this.characteristics_.size();
   }

   public List getCharacteristicsList() {
      return this.characteristics_;
   }

   public Structures$PbBleCharacteristicOrBuilder getCharacteristicsOrBuilder(int var1) {
      return (Structures$PbBleCharacteristicOrBuilder)this.characteristics_.get(var1);
   }

   public List getCharacteristicsOrBuilderList() {
      return this.characteristics_;
   }

   public Structures$PbBleService getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeMessageSize(1, this.getServiceUuid()) + 0;
         } else {
            var2 = 0;
         }

         while(var1 < this.characteristics_.size()) {
            int var3 = CodedOutputStream.computeMessageSize(2, (MessageLite)this.characteristics_.get(var1));
            ++var1;
            var2 += var3;
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public Structures$PbBleUuid getServiceUuid() {
      Structures$PbBleUuid var1;
      if (this.serviceUuid_ == null) {
         var1 = Structures$PbBleUuid.getDefaultInstance();
      } else {
         var1 = this.serviceUuid_;
      }

      return var1;
   }

   public Structures$PbBleUuidOrBuilder getServiceUuidOrBuilder() {
      Structures$PbBleUuid var1;
      if (this.serviceUuid_ == null) {
         var1 = Structures$PbBleUuid.getDefaultInstance();
      } else {
         var1 = this.serviceUuid_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasServiceUuid() {
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
         if (this.hasServiceUuid()) {
            var1 = (var2 * 37 + 1) * 53 + this.getServiceUuid().hashCode();
         }

         var2 = var1;
         if (this.getCharacteristicsCount() > 0) {
            var2 = (var1 * 37 + 2) * 53 + this.getCharacteristicsList().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.af().ensureFieldAccessorsInitialized(Structures$PbBleService.class, Structures$PbBleService$Builder.class);
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
            if (!this.hasServiceUuid()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getServiceUuid().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getCharacteristicsCount()) {
                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                     break;
                  }

                  if (!this.getCharacteristics(var4).isInitialized()) {
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

   public Structures$PbBleService$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbBleService$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbBleService$Builder(var1, (Structures$1)null);
   }

   public Structures$PbBleService$Builder toBuilder() {
      Structures$PbBleService$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbBleService$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbBleService$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getServiceUuid());
      }

      for(int var2 = 0; var2 < this.characteristics_.size(); ++var2) {
         var1.writeMessage(2, (MessageLite)this.characteristics_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
