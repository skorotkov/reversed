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

public final class SportprofileDisplays$PbAlcorDisplaySettings extends GeneratedMessageV3 implements SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder {
   public static final int ADDED_DEFAULT_DISPLAYS_FIELD_NUMBER = 3;
   private static final SportprofileDisplays$PbAlcorDisplaySettings DEFAULT_INSTANCE = new SportprofileDisplays$PbAlcorDisplaySettings();
   public static final int DISPLAY_FIELD_NUMBER = 1;
   public static final int LAST_SHOWN_DISPLAY_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new SportprofileDisplays$PbAlcorDisplaySettings$1();
   private static final long serialVersionUID = 0L;
   private int addedDefaultDisplays_;
   private int bitField0_;
   private List display_;
   private int lastShownDisplay_;
   private byte memoizedIsInitialized;

   private SportprofileDisplays$PbAlcorDisplaySettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.display_ = Collections.emptyList();
      this.lastShownDisplay_ = 0;
      this.addedDefaultDisplays_ = 0;
   }

   private SportprofileDisplays$PbAlcorDisplaySettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileDisplays$PbAlcorDisplaySettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileDisplays$1 var3) {
      this(var1, var2);
   }

   private SportprofileDisplays$PbAlcorDisplaySettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileDisplays$PbAlcorDisplaySettings(Builder var1, SportprofileDisplays$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileDisplays$PbAlcorDisplaySettings var0, int var1) {
      var0.lastShownDisplay_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(SportprofileDisplays$PbAlcorDisplaySettings var0) {
      return var0.display_;
   }

   // $FF: synthetic method
   static List a(SportprofileDisplays$PbAlcorDisplaySettings var0, List var1) {
      var0.display_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileDisplays$PbAlcorDisplaySettings var0, int var1) {
      var0.addedDefaultDisplays_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(SportprofileDisplays$PbAlcorDisplaySettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SportprofileDisplays$PbAlcorDisplaySettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileDisplays.g();
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings$Builder newBuilder(SportprofileDisplays$PbAlcorDisplaySettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseFrom(ByteString var0) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)PARSER.parseFrom(var0);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseFrom(CodedInputStream var0) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseFrom(InputStream var0) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseFrom(byte[] var0) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)PARSER.parseFrom(var0);
   }

   public static SportprofileDisplays$PbAlcorDisplaySettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileDisplays$PbAlcorDisplaySettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileDisplays$PbAlcorDisplaySettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileDisplays$PbAlcorDisplaySettings var5 = (SportprofileDisplays$PbAlcorDisplaySettings)var1;
            boolean var3;
            if (this.getDisplayList().equals(var5.getDisplayList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasLastShownDisplay() == var5.hasLastShownDisplay()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLastShownDisplay()) {
               if (var3 && this.getLastShownDisplay() == var5.getLastShownDisplay()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAddedDefaultDisplays() == var5.hasAddedDefaultDisplays()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAddedDefaultDisplays()) {
               if (var3 && this.getAddedDefaultDisplays() == var5.getAddedDefaultDisplays()) {
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

   public int getAddedDefaultDisplays() {
      return this.addedDefaultDisplays_;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay getDisplay(int var1) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay)this.display_.get(var1);
   }

   public int getDisplayCount() {
      return this.display_.size();
   }

   public List getDisplayList() {
      return this.display_;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplayOrBuilder getDisplayOrBuilder(int var1) {
      return (SportprofileDisplays$PbAlcorTrainingDisplayOrBuilder)this.display_.get(var1);
   }

   public List getDisplayOrBuilderList() {
      return this.display_;
   }

   public int getLastShownDisplay() {
      return this.lastShownDisplay_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;

         for(var1 = 0; var2 < this.display_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.display_.get(var2));
         }

         var2 = var1;
         if ((this.bitField0_ & 1) == 1) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(2, this.lastShownDisplay_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(3, this.addedDefaultDisplays_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAddedDefaultDisplays() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastShownDisplay() {
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
         if (this.getDisplayCount() > 0) {
            var2 = (var1 * 37 + 1) * 53 + this.getDisplayList().hashCode();
         }

         var1 = var2;
         if (this.hasLastShownDisplay()) {
            var1 = (var2 * 37 + 2) * 53 + this.getLastShownDisplay();
         }

         var2 = var1;
         if (this.hasAddedDefaultDisplays()) {
            var2 = (var1 * 37 + 3) * 53 + this.getAddedDefaultDisplays();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileDisplays.h().ensureFieldAccessorsInitialized(SportprofileDisplays$PbAlcorDisplaySettings.class, SportprofileDisplays$PbAlcorDisplaySettings$Builder.class);
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

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileDisplays$PbAlcorDisplaySettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileDisplays$PbAlcorDisplaySettings$Builder(var1, (SportprofileDisplays$1)null);
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder toBuilder() {
      SportprofileDisplays$PbAlcorDisplaySettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileDisplays$PbAlcorDisplaySettings$Builder((SportprofileDisplays$1)null);
      } else {
         var1 = (new SportprofileDisplays$PbAlcorDisplaySettings$Builder((SportprofileDisplays$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      for(int var2 = 0; var2 < this.display_.size(); ++var2) {
         var1.writeMessage(1, (MessageLite)this.display_.get(var2));
      }

      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(2, this.lastShownDisplay_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(3, this.addedDefaultDisplays_);
      }

      this.unknownFields.writeTo(var1);
   }
}
