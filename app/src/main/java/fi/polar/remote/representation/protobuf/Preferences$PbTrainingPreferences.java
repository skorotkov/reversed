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

public final class Preferences$PbTrainingPreferences extends GeneratedMessageV3 implements Preferences$PbTrainingPreferencesOrBuilder {
   private static final Preferences$PbTrainingPreferences DEFAULT_INSTANCE = new Preferences$PbTrainingPreferences();
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 2;
   public static final int OBSOLETE_HEART_RATE_ZONE_LOCK_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Preferences$PbTrainingPreferences$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int heartRateView_;
   private byte memoizedIsInitialized;
   private int oBSOLETEHeartRateZoneLock_;

   private Preferences$PbTrainingPreferences() {
      this.memoizedIsInitialized = (byte)-1;
      this.oBSOLETEHeartRateZoneLock_ = 0;
      this.heartRateView_ = 1;
   }

   private Preferences$PbTrainingPreferences(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Preferences$PbTrainingPreferences(CodedInputStream var1, ExtensionRegistryLite var2, Preferences$1 var3) {
      this(var1, var2);
   }

   private Preferences$PbTrainingPreferences(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Preferences$PbTrainingPreferences(Builder var1, Preferences$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Preferences$PbTrainingPreferences var0, int var1) {
      var0.oBSOLETEHeartRateZoneLock_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Preferences$PbTrainingPreferences var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Preferences$PbTrainingPreferences var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Preferences$PbTrainingPreferences var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Preferences$PbTrainingPreferences getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Preferences.c();
   }

   public static Preferences$PbTrainingPreferences$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Preferences$PbTrainingPreferences$Builder newBuilder(Preferences$PbTrainingPreferences var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Preferences$PbTrainingPreferences parseDelimitedFrom(InputStream var0) {
      return (Preferences$PbTrainingPreferences)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Preferences$PbTrainingPreferences parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbTrainingPreferences)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbTrainingPreferences parseFrom(ByteString var0) {
      return (Preferences$PbTrainingPreferences)PARSER.parseFrom(var0);
   }

   public static Preferences$PbTrainingPreferences parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Preferences$PbTrainingPreferences)PARSER.parseFrom(var0, var1);
   }

   public static Preferences$PbTrainingPreferences parseFrom(CodedInputStream var0) {
      return (Preferences$PbTrainingPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Preferences$PbTrainingPreferences parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbTrainingPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbTrainingPreferences parseFrom(InputStream var0) {
      return (Preferences$PbTrainingPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Preferences$PbTrainingPreferences parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbTrainingPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbTrainingPreferences parseFrom(byte[] var0) {
      return (Preferences$PbTrainingPreferences)PARSER.parseFrom(var0);
   }

   public static Preferences$PbTrainingPreferences parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Preferences$PbTrainingPreferences)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Preferences$PbTrainingPreferences)) {
            var2 = super.equals(var1);
         } else {
            Preferences$PbTrainingPreferences var5 = (Preferences$PbTrainingPreferences)var1;
            boolean var3;
            if (this.hasOBSOLETEHeartRateZoneLock() == var5.hasOBSOLETEHeartRateZoneLock()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasOBSOLETEHeartRateZoneLock()) {
               if (var3 && this.getOBSOLETEHeartRateZoneLock() == var5.getOBSOLETEHeartRateZoneLock()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHeartRateView() == var5.hasHeartRateView()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasHeartRateView()) {
               if (var3 && this.heartRateView_ == var5.heartRateView_) {
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

   public Preferences$PbTrainingPreferences getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbHeartRateView getHeartRateView() {
      Types$PbHeartRateView var1 = Types$PbHeartRateView.valueOf(this.heartRateView_);
      Types$PbHeartRateView var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartRateView.HEART_RATE_VIEW_BPM;
      }

      return var2;
   }

   public int getOBSOLETEHeartRateZoneLock() {
      return this.oBSOLETEHeartRateZoneLock_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.oBSOLETEHeartRateZoneLock_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeEnumSize(2, this.heartRateView_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEHeartRateZoneLock() {
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
         if (this.hasOBSOLETEHeartRateZoneLock()) {
            var1 = (var2 * 37 + 1) * 53 + this.getOBSOLETEHeartRateZoneLock();
         }

         var2 = var1;
         if (this.hasHeartRateView()) {
            var2 = (var1 * 37 + 2) * 53 + this.heartRateView_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Preferences.d().ensureFieldAccessorsInitialized(Preferences$PbTrainingPreferences.class, Preferences$PbTrainingPreferences$Builder.class);
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

   public Preferences$PbTrainingPreferences$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Preferences$PbTrainingPreferences$Builder newBuilderForType(BuilderParent var1) {
      return new Preferences$PbTrainingPreferences$Builder(var1, (Preferences$1)null);
   }

   public Preferences$PbTrainingPreferences$Builder toBuilder() {
      Preferences$PbTrainingPreferences$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Preferences$PbTrainingPreferences$Builder((Preferences$1)null);
      } else {
         var1 = (new Preferences$PbTrainingPreferences$Builder((Preferences$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.oBSOLETEHeartRateZoneLock_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.heartRateView_);
      }

      this.unknownFields.writeTo(var1);
   }
}
