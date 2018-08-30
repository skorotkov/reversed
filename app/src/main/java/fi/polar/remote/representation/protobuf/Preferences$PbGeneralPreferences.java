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

public final class Preferences$PbGeneralPreferences extends GeneratedMessageV3 implements Preferences$PbGeneralPreferencesOrBuilder {
   public static final int ACTIVITY_GOAL_PREFERENCES_FIELD_NUMBER = 3;
   private static final Preferences$PbGeneralPreferences DEFAULT_INSTANCE = new Preferences$PbGeneralPreferences();
   public static final int LAST_MODIFIED_FIELD_NUMBER = 101;
   public static final int LOCALIZATION_PREFERENCES_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Preferences$PbGeneralPreferences$1();
   public static final int TRAINING_PREFERENCES_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private Preferences$PbActivityGoalPreferences activityGoalPreferences_;
   private int bitField0_;
   private Types$PbSystemDateTime lastModified_;
   private Preferences$PbLocalizationPreferences localizationPreferences_;
   private byte memoizedIsInitialized;
   private Preferences$PbTrainingPreferences trainingPreferences_;

   private Preferences$PbGeneralPreferences() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private Preferences$PbGeneralPreferences(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Preferences$PbGeneralPreferences(CodedInputStream var1, ExtensionRegistryLite var2, Preferences$1 var3) {
      this(var1, var2);
   }

   private Preferences$PbGeneralPreferences(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Preferences$PbGeneralPreferences(Builder var1, Preferences$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Preferences$PbGeneralPreferences var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Preferences$PbGeneralPreferences var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Preferences$PbActivityGoalPreferences a(Preferences$PbGeneralPreferences var0, Preferences$PbActivityGoalPreferences var1) {
      var0.activityGoalPreferences_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Preferences$PbLocalizationPreferences a(Preferences$PbGeneralPreferences var0, Preferences$PbLocalizationPreferences var1) {
      var0.localizationPreferences_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Preferences$PbTrainingPreferences a(Preferences$PbGeneralPreferences var0, Preferences$PbTrainingPreferences var1) {
      var0.trainingPreferences_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(Preferences$PbGeneralPreferences var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Preferences$PbGeneralPreferences getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Preferences.g();
   }

   public static Preferences$PbGeneralPreferences$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Preferences$PbGeneralPreferences$Builder newBuilder(Preferences$PbGeneralPreferences var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Preferences$PbGeneralPreferences parseDelimitedFrom(InputStream var0) {
      return (Preferences$PbGeneralPreferences)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Preferences$PbGeneralPreferences parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbGeneralPreferences)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbGeneralPreferences parseFrom(ByteString var0) {
      return (Preferences$PbGeneralPreferences)PARSER.parseFrom(var0);
   }

   public static Preferences$PbGeneralPreferences parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Preferences$PbGeneralPreferences)PARSER.parseFrom(var0, var1);
   }

   public static Preferences$PbGeneralPreferences parseFrom(CodedInputStream var0) {
      return (Preferences$PbGeneralPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Preferences$PbGeneralPreferences parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbGeneralPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbGeneralPreferences parseFrom(InputStream var0) {
      return (Preferences$PbGeneralPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Preferences$PbGeneralPreferences parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbGeneralPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbGeneralPreferences parseFrom(byte[] var0) {
      return (Preferences$PbGeneralPreferences)PARSER.parseFrom(var0);
   }

   public static Preferences$PbGeneralPreferences parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Preferences$PbGeneralPreferences)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Preferences$PbGeneralPreferences)) {
            var2 = super.equals(var1);
         } else {
            Preferences$PbGeneralPreferences var5 = (Preferences$PbGeneralPreferences)var1;
            boolean var3;
            if (this.hasLocalizationPreferences() == var5.hasLocalizationPreferences()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLocalizationPreferences()) {
               if (var3 && this.getLocalizationPreferences().equals(var5.getLocalizationPreferences())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrainingPreferences() == var5.hasTrainingPreferences()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTrainingPreferences()) {
               if (var4 && this.getTrainingPreferences().equals(var5.getTrainingPreferences())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasActivityGoalPreferences() == var5.hasActivityGoalPreferences()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasActivityGoalPreferences()) {
               if (var3 && this.getActivityGoalPreferences().equals(var5.getActivityGoalPreferences())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
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

   public Preferences$PbActivityGoalPreferences getActivityGoalPreferences() {
      Preferences$PbActivityGoalPreferences var1;
      if (this.activityGoalPreferences_ == null) {
         var1 = Preferences$PbActivityGoalPreferences.getDefaultInstance();
      } else {
         var1 = this.activityGoalPreferences_;
      }

      return var1;
   }

   public Preferences$PbActivityGoalPreferencesOrBuilder getActivityGoalPreferencesOrBuilder() {
      Preferences$PbActivityGoalPreferences var1;
      if (this.activityGoalPreferences_ == null) {
         var1 = Preferences$PbActivityGoalPreferences.getDefaultInstance();
      } else {
         var1 = this.activityGoalPreferences_;
      }

      return var1;
   }

   public Preferences$PbGeneralPreferences getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Preferences$PbLocalizationPreferences getLocalizationPreferences() {
      Preferences$PbLocalizationPreferences var1;
      if (this.localizationPreferences_ == null) {
         var1 = Preferences$PbLocalizationPreferences.getDefaultInstance();
      } else {
         var1 = this.localizationPreferences_;
      }

      return var1;
   }

   public Preferences$PbLocalizationPreferencesOrBuilder getLocalizationPreferencesOrBuilder() {
      Preferences$PbLocalizationPreferences var1;
      if (this.localizationPreferences_ == null) {
         var1 = Preferences$PbLocalizationPreferences.getDefaultInstance();
      } else {
         var1 = this.localizationPreferences_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getLocalizationPreferences());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getTrainingPreferences());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getActivityGoalPreferences());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(101, this.getLastModified());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Preferences$PbTrainingPreferences getTrainingPreferences() {
      Preferences$PbTrainingPreferences var1;
      if (this.trainingPreferences_ == null) {
         var1 = Preferences$PbTrainingPreferences.getDefaultInstance();
      } else {
         var1 = this.trainingPreferences_;
      }

      return var1;
   }

   public Preferences$PbTrainingPreferencesOrBuilder getTrainingPreferencesOrBuilder() {
      Preferences$PbTrainingPreferences var1;
      if (this.trainingPreferences_ == null) {
         var1 = Preferences$PbTrainingPreferences.getDefaultInstance();
      } else {
         var1 = this.trainingPreferences_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasActivityGoalPreferences() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLocalizationPreferences() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingPreferences() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasLocalizationPreferences()) {
            var2 = (var1 * 37 + 1) * 53 + this.getLocalizationPreferences().hashCode();
         }

         var1 = var2;
         if (this.hasTrainingPreferences()) {
            var1 = (var2 * 37 + 2) * 53 + this.getTrainingPreferences().hashCode();
         }

         var2 = var1;
         if (this.hasActivityGoalPreferences()) {
            var2 = (var1 * 37 + 3) * 53 + this.getActivityGoalPreferences().hashCode();
         }

         var1 = var2;
         if (this.hasLastModified()) {
            var1 = (var2 * 37 + 101) * 53 + this.getLastModified().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Preferences.h().ensureFieldAccessorsInitialized(Preferences$PbGeneralPreferences.class, Preferences$PbGeneralPreferences$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasLocalizationPreferences() && !this.getLocalizationPreferences().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasActivityGoalPreferences() && !this.getActivityGoalPreferences().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Preferences$PbGeneralPreferences$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Preferences$PbGeneralPreferences$Builder newBuilderForType(BuilderParent var1) {
      return new Preferences$PbGeneralPreferences$Builder(var1, (Preferences$1)null);
   }

   public Preferences$PbGeneralPreferences$Builder toBuilder() {
      Preferences$PbGeneralPreferences$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Preferences$PbGeneralPreferences$Builder((Preferences$1)null);
      } else {
         var1 = (new Preferences$PbGeneralPreferences$Builder((Preferences$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getLocalizationPreferences());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getTrainingPreferences());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getActivityGoalPreferences());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(101, this.getLastModified());
      }

      this.unknownFields.writeTo(var1);
   }
}
