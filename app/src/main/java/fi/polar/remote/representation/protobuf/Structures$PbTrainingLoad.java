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

public final class Structures$PbTrainingLoad extends GeneratedMessageV3 implements Structures$PbTrainingLoadOrBuilder {
   public static final int CARBOHYDRATE_CONSUMPTION_FIELD_NUMBER = 3;
   private static final Structures$PbTrainingLoad DEFAULT_INSTANCE = new Structures$PbTrainingLoad();
   public static final int FAT_CONSUMPTION_FIELD_NUMBER = 5;
   @Deprecated
   public static final Parser PARSER = new Structures$PbTrainingLoad$1();
   public static final int PROTEIN_CONSUMPTION_FIELD_NUMBER = 4;
   public static final int RECOVERY_TIME_FIELD_NUMBER = 2;
   public static final int TRAINING_LOAD_VAL_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int carbohydrateConsumption_;
   private int fatConsumption_;
   private byte memoizedIsInitialized;
   private int proteinConsumption_;
   private Types$PbDuration recoveryTime_;
   private int trainingLoadVal_;

   private Structures$PbTrainingLoad() {
      this.memoizedIsInitialized = (byte)-1;
      this.trainingLoadVal_ = 0;
      this.carbohydrateConsumption_ = 0;
      this.proteinConsumption_ = 0;
      this.fatConsumption_ = 0;
   }

   private Structures$PbTrainingLoad(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbTrainingLoad(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbTrainingLoad(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbTrainingLoad(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbTrainingLoad var0, int var1) {
      var0.trainingLoadVal_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbTrainingLoad var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Structures$PbTrainingLoad var0, Types$PbDuration var1) {
      var0.recoveryTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Structures$PbTrainingLoad var0, int var1) {
      var0.carbohydrateConsumption_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Structures$PbTrainingLoad var0, int var1) {
      var0.proteinConsumption_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Structures$PbTrainingLoad var0, int var1) {
      var0.fatConsumption_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(Structures$PbTrainingLoad var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Structures$PbTrainingLoad getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.g();
   }

   public static Structures$PbTrainingLoad$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbTrainingLoad$Builder newBuilder(Structures$PbTrainingLoad var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbTrainingLoad parseDelimitedFrom(InputStream var0) {
      return (Structures$PbTrainingLoad)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbTrainingLoad parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingLoad)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbTrainingLoad parseFrom(ByteString var0) {
      return (Structures$PbTrainingLoad)PARSER.parseFrom(var0);
   }

   public static Structures$PbTrainingLoad parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingLoad)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbTrainingLoad parseFrom(CodedInputStream var0) {
      return (Structures$PbTrainingLoad)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbTrainingLoad parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingLoad)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbTrainingLoad parseFrom(InputStream var0) {
      return (Structures$PbTrainingLoad)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbTrainingLoad parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingLoad)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbTrainingLoad parseFrom(byte[] var0) {
      return (Structures$PbTrainingLoad)PARSER.parseFrom(var0);
   }

   public static Structures$PbTrainingLoad parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbTrainingLoad)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbTrainingLoad)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbTrainingLoad var5 = (Structures$PbTrainingLoad)var1;
            boolean var3;
            if (this.hasTrainingLoadVal() == var5.hasTrainingLoadVal()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasTrainingLoadVal()) {
               if (var3 && this.getTrainingLoadVal() == var5.getTrainingLoadVal()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasRecoveryTime() == var5.hasRecoveryTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasRecoveryTime()) {
               if (var3 && this.getRecoveryTime().equals(var5.getRecoveryTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCarbohydrateConsumption() == var5.hasCarbohydrateConsumption()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCarbohydrateConsumption()) {
               if (var4 && this.getCarbohydrateConsumption() == var5.getCarbohydrateConsumption()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasProteinConsumption() == var5.hasProteinConsumption()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasProteinConsumption()) {
               if (var4 && this.getProteinConsumption() == var5.getProteinConsumption()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasFatConsumption() == var5.hasFatConsumption()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFatConsumption()) {
               if (var4 && this.getFatConsumption() == var5.getFatConsumption()) {
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

   public int getCarbohydrateConsumption() {
      return this.carbohydrateConsumption_;
   }

   public Structures$PbTrainingLoad getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getFatConsumption() {
      return this.fatConsumption_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getProteinConsumption() {
      return this.proteinConsumption_;
   }

   public Types$PbDuration getRecoveryTime() {
      Types$PbDuration var1;
      if (this.recoveryTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.recoveryTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getRecoveryTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.recoveryTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.recoveryTime_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.trainingLoadVal_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getRecoveryTime());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.carbohydrateConsumption_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(4, this.proteinConsumption_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(5, this.fatConsumption_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getTrainingLoadVal() {
      return this.trainingLoadVal_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCarbohydrateConsumption() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFatConsumption() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasProteinConsumption() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRecoveryTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingLoadVal() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasTrainingLoadVal()) {
            var2 = (var1 * 37 + 1) * 53 + this.getTrainingLoadVal();
         }

         var1 = var2;
         if (this.hasRecoveryTime()) {
            var1 = (var2 * 37 + 2) * 53 + this.getRecoveryTime().hashCode();
         }

         var2 = var1;
         if (this.hasCarbohydrateConsumption()) {
            var2 = (var1 * 37 + 3) * 53 + this.getCarbohydrateConsumption();
         }

         var1 = var2;
         if (this.hasProteinConsumption()) {
            var1 = (var2 * 37 + 4) * 53 + this.getProteinConsumption();
         }

         var2 = var1;
         if (this.hasFatConsumption()) {
            var2 = (var1 * 37 + 5) * 53 + this.getFatConsumption();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.h().ensureFieldAccessorsInitialized(Structures$PbTrainingLoad.class, Structures$PbTrainingLoad$Builder.class);
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

   public Structures$PbTrainingLoad$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbTrainingLoad$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbTrainingLoad$Builder(var1, (Structures$1)null);
   }

   public Structures$PbTrainingLoad$Builder toBuilder() {
      Structures$PbTrainingLoad$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbTrainingLoad$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbTrainingLoad$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.trainingLoadVal_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getRecoveryTime());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.carbohydrateConsumption_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.proteinConsumption_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeUInt32(5, this.fatConsumption_);
      }

      this.unknownFields.writeTo(var1);
   }
}
