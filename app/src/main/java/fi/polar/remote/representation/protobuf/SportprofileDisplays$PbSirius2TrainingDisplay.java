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
import com.google.protobuf.Internal.ListAdapter;
import com.google.protobuf.Internal.ListAdapter.Converter;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class SportprofileDisplays$PbSirius2TrainingDisplay extends GeneratedMessageV3 implements SportprofileDisplays$PbSirius2TrainingDisplayOrBuilder {
   private static final SportprofileDisplays$PbSirius2TrainingDisplay DEFAULT_INSTANCE = new SportprofileDisplays$PbSirius2TrainingDisplay();
   public static final int ITEM_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new SportprofileDisplays$PbSirius2TrainingDisplay$2();
   private static final Converter item_converter_ = new SportprofileDisplays$PbSirius2TrainingDisplay$1();
   private static final long serialVersionUID = 0L;
   private List item_;
   private byte memoizedIsInitialized;

   private SportprofileDisplays$PbSirius2TrainingDisplay() {
      this.memoizedIsInitialized = (byte)-1;
      this.item_ = Collections.emptyList();
   }

   private SportprofileDisplays$PbSirius2TrainingDisplay(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileDisplays$PbSirius2TrainingDisplay(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileDisplays$1 var3) {
      this(var1, var2);
   }

   private SportprofileDisplays$PbSirius2TrainingDisplay(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileDisplays$PbSirius2TrainingDisplay(Builder var1, SportprofileDisplays$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static List a(SportprofileDisplays$PbSirius2TrainingDisplay var0) {
      return var0.item_;
   }

   // $FF: synthetic method
   static List a(SportprofileDisplays$PbSirius2TrainingDisplay var0, List var1) {
      var0.item_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(SportprofileDisplays$PbSirius2TrainingDisplay var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Converter c() {
      return item_converter_;
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileDisplays.a();
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay$Builder newBuilder(SportprofileDisplays$PbSirius2TrainingDisplay var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseDelimitedFrom(InputStream var0) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseFrom(ByteString var0) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)PARSER.parseFrom(var0);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseFrom(CodedInputStream var0) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseFrom(InputStream var0) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseFrom(byte[] var0) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)PARSER.parseFrom(var0);
   }

   public static SportprofileDisplays$PbSirius2TrainingDisplay parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileDisplays$PbSirius2TrainingDisplay)) {
            var2 = super.equals(var1);
         } else {
            SportprofileDisplays$PbSirius2TrainingDisplay var4 = (SportprofileDisplays$PbSirius2TrainingDisplay)var1;
            boolean var3;
            if (this.item_.equals(var4.item_)) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var4.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public SportprofileDisplays$PbTrainingDisplayItem getItem(int var1) {
      return (SportprofileDisplays$PbTrainingDisplayItem)item_converter_.convert(this.item_.get(var1));
   }

   public int getItemCount() {
      return this.item_.size();
   }

   public List getItemList() {
      return new ListAdapter(this.item_, item_converter_);
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;

         int var2;
         for(var2 = 0; var1 < this.item_.size(); ++var1) {
            var2 += CodedOutputStream.computeEnumSizeNoTag((Integer)this.item_.get(var1));
         }

         var1 = 0 + var2 + this.item_.size() * 1 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.getItemCount() > 0) {
            var1 = (var2 * 37 + 1) * 53 + this.item_.hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileDisplays.b().ensureFieldAccessorsInitialized(SportprofileDisplays$PbSirius2TrainingDisplay.class, SportprofileDisplays$PbSirius2TrainingDisplay$Builder.class);
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

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileDisplays$PbSirius2TrainingDisplay$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileDisplays$PbSirius2TrainingDisplay$Builder(var1, (SportprofileDisplays$1)null);
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder toBuilder() {
      SportprofileDisplays$PbSirius2TrainingDisplay$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileDisplays$PbSirius2TrainingDisplay$Builder((SportprofileDisplays$1)null);
      } else {
         var1 = (new SportprofileDisplays$PbSirius2TrainingDisplay$Builder((SportprofileDisplays$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      for(int var2 = 0; var2 < this.item_.size(); ++var2) {
         var1.writeEnum(1, (Integer)this.item_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
