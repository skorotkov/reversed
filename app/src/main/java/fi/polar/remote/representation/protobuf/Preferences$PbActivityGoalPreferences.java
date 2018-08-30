package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class Preferences$PbActivityGoalPreferences extends GeneratedMessageV3 implements Preferences$PbActivityGoalPreferencesOrBuilder {
   private static final Preferences$PbActivityGoalPreferences DEFAULT_INSTANCE = new Preferences$PbActivityGoalPreferences();
   @Deprecated
   public static final Parser PARSER = new Preferences$PbActivityGoalPreferences$1();
   public static final int VISIBLE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private boolean visible_;

   private Preferences$PbActivityGoalPreferences() {
      this.memoizedIsInitialized = (byte)-1;
      this.visible_ = false;
   }

   private Preferences$PbActivityGoalPreferences(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Preferences$PbActivityGoalPreferences(CodedInputStream var1, ExtensionRegistryLite var2, Preferences$1 var3) {
      this(var1, var2);
   }

   private Preferences$PbActivityGoalPreferences(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Preferences$PbActivityGoalPreferences(Builder var1, Preferences$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Preferences$PbActivityGoalPreferences var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Preferences$PbActivityGoalPreferences var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(Preferences$PbActivityGoalPreferences var0, boolean var1) {
      var0.visible_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Preferences$PbActivityGoalPreferences getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Preferences.e();
   }

   public static Preferences$PbActivityGoalPreferences$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Preferences$PbActivityGoalPreferences$Builder newBuilder(Preferences$PbActivityGoalPreferences var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Preferences$PbActivityGoalPreferences parseDelimitedFrom(InputStream var0) {
      return (Preferences$PbActivityGoalPreferences)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Preferences$PbActivityGoalPreferences parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbActivityGoalPreferences)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbActivityGoalPreferences parseFrom(ByteString var0) {
      return (Preferences$PbActivityGoalPreferences)PARSER.parseFrom(var0);
   }

   public static Preferences$PbActivityGoalPreferences parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Preferences$PbActivityGoalPreferences)PARSER.parseFrom(var0, var1);
   }

   public static Preferences$PbActivityGoalPreferences parseFrom(CodedInputStream var0) {
      return (Preferences$PbActivityGoalPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Preferences$PbActivityGoalPreferences parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbActivityGoalPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbActivityGoalPreferences parseFrom(InputStream var0) {
      return (Preferences$PbActivityGoalPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Preferences$PbActivityGoalPreferences parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbActivityGoalPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbActivityGoalPreferences parseFrom(byte[] var0) {
      return (Preferences$PbActivityGoalPreferences)PARSER.parseFrom(var0);
   }

   public static Preferences$PbActivityGoalPreferences parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Preferences$PbActivityGoalPreferences)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Preferences$PbActivityGoalPreferences)) {
            var2 = super.equals(var1);
         } else {
            Preferences$PbActivityGoalPreferences var5 = (Preferences$PbActivityGoalPreferences)var1;
            boolean var3;
            if (this.hasVisible() == var5.hasVisible()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasVisible()) {
               if (var3 && this.getVisible() == var5.getVisible()) {
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

   public Preferences$PbActivityGoalPreferences getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.visible_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean getVisible() {
      return this.visible_;
   }

   public boolean hasVisible() {
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
         if (this.hasVisible()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getVisible());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Preferences.f().ensureFieldAccessorsInitialized(Preferences$PbActivityGoalPreferences.class, Preferences$PbActivityGoalPreferences$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasVisible()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Preferences$PbActivityGoalPreferences$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Preferences$PbActivityGoalPreferences$Builder newBuilderForType(BuilderParent var1) {
      return new Preferences$PbActivityGoalPreferences$Builder(var1, (Preferences$1)null);
   }

   public Preferences$PbActivityGoalPreferences$Builder toBuilder() {
      Preferences$PbActivityGoalPreferences$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Preferences$PbActivityGoalPreferences$Builder((Preferences$1)null);
      } else {
         var1 = (new Preferences$PbActivityGoalPreferences$Builder((Preferences$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.visible_);
      }

      this.unknownFields.writeTo(var1);
   }
}
