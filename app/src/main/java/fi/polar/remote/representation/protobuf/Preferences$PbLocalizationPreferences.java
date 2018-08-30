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

public final class Preferences$PbLocalizationPreferences extends GeneratedMessageV3 implements Preferences$PbLocalizationPreferencesOrBuilder {
   public static final int DATE_FORMAT_FIELD_NUMBER = 5;
   public static final int DATE_FORMAT_SEPARATOR_FIELD_NUMBER = 6;
   private static final Preferences$PbLocalizationPreferences DEFAULT_INSTANCE = new Preferences$PbLocalizationPreferences();
   public static final int FIRSTDAY_OF_WEEK_FIELD_NUMBER = 7;
   public static final int LANGUAGE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Preferences$PbLocalizationPreferences$1();
   public static final int TIME_FORMAT_FIELD_NUMBER = 3;
   public static final int TIME_FORMAT_SEPARATOR_FIELD_NUMBER = 4;
   public static final int UNIT_SYSTEM_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int dateFormatSeparator_;
   private int dateFormat_;
   private int firstdayOfWeek_;
   private Structures$PbLanguageId language_;
   private byte memoizedIsInitialized;
   private int timeFormatSeparator_;
   private int timeFormat_;
   private int unitSystem_;

   private Preferences$PbLocalizationPreferences() {
      this.memoizedIsInitialized = (byte)-1;
      this.unitSystem_ = 1;
      this.timeFormat_ = 1;
      this.timeFormatSeparator_ = 1;
      this.dateFormat_ = 1;
      this.dateFormatSeparator_ = 1;
      this.firstdayOfWeek_ = 1;
   }

   private Preferences$PbLocalizationPreferences(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Preferences$PbLocalizationPreferences(CodedInputStream var1, ExtensionRegistryLite var2, Preferences$1 var3) {
      this(var1, var2);
   }

   private Preferences$PbLocalizationPreferences(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Preferences$PbLocalizationPreferences(Builder var1, Preferences$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Preferences$PbLocalizationPreferences var0, int var1) {
      var0.unitSystem_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Preferences$PbLocalizationPreferences var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbLanguageId a(Preferences$PbLocalizationPreferences var0, Structures$PbLanguageId var1) {
      var0.language_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Preferences$PbLocalizationPreferences var0, int var1) {
      var0.timeFormat_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Preferences$PbLocalizationPreferences var0, int var1) {
      var0.timeFormatSeparator_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Preferences$PbLocalizationPreferences var0, int var1) {
      var0.dateFormat_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(Preferences$PbLocalizationPreferences var0, int var1) {
      var0.dateFormatSeparator_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int f(Preferences$PbLocalizationPreferences var0, int var1) {
      var0.firstdayOfWeek_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int g(Preferences$PbLocalizationPreferences var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Preferences$PbLocalizationPreferences getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Preferences.a();
   }

   public static Preferences$PbLocalizationPreferences$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Preferences$PbLocalizationPreferences$Builder newBuilder(Preferences$PbLocalizationPreferences var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Preferences$PbLocalizationPreferences parseDelimitedFrom(InputStream var0) {
      return (Preferences$PbLocalizationPreferences)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Preferences$PbLocalizationPreferences parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbLocalizationPreferences)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbLocalizationPreferences parseFrom(ByteString var0) {
      return (Preferences$PbLocalizationPreferences)PARSER.parseFrom(var0);
   }

   public static Preferences$PbLocalizationPreferences parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Preferences$PbLocalizationPreferences)PARSER.parseFrom(var0, var1);
   }

   public static Preferences$PbLocalizationPreferences parseFrom(CodedInputStream var0) {
      return (Preferences$PbLocalizationPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Preferences$PbLocalizationPreferences parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbLocalizationPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbLocalizationPreferences parseFrom(InputStream var0) {
      return (Preferences$PbLocalizationPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Preferences$PbLocalizationPreferences parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Preferences$PbLocalizationPreferences)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Preferences$PbLocalizationPreferences parseFrom(byte[] var0) {
      return (Preferences$PbLocalizationPreferences)PARSER.parseFrom(var0);
   }

   public static Preferences$PbLocalizationPreferences parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Preferences$PbLocalizationPreferences)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Preferences$PbLocalizationPreferences)) {
            var2 = super.equals(var1);
         } else {
            Preferences$PbLocalizationPreferences var5 = (Preferences$PbLocalizationPreferences)var1;
            boolean var3;
            if (this.hasLanguage() == var5.hasLanguage()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLanguage()) {
               if (var3 && this.getLanguage().equals(var5.getLanguage())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasUnitSystem() == var5.hasUnitSystem()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasUnitSystem()) {
               if (var3 && this.unitSystem_ == var5.unitSystem_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeFormat() == var5.hasTimeFormat()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeFormat()) {
               if (var3 && this.timeFormat_ == var5.timeFormat_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeFormatSeparator() == var5.hasTimeFormatSeparator()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimeFormatSeparator()) {
               if (var4 && this.timeFormatSeparator_ == var5.timeFormatSeparator_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDateFormat() == var5.hasDateFormat()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDateFormat()) {
               if (var3 && this.dateFormat_ == var5.dateFormat_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDateFormatSeparator() == var5.hasDateFormatSeparator()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDateFormatSeparator()) {
               if (var3 && this.dateFormatSeparator_ == var5.dateFormatSeparator_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasFirstdayOfWeek() == var5.hasFirstdayOfWeek()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFirstdayOfWeek()) {
               if (var4 && this.firstdayOfWeek_ == var5.firstdayOfWeek_) {
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

   public Types$PbDateFormat getDateFormat() {
      Types$PbDateFormat var1 = Types$PbDateFormat.valueOf(this.dateFormat_);
      Types$PbDateFormat var2 = var1;
      if (var1 == null) {
         var2 = Types$PbDateFormat.DD_MM_YYYY;
      }

      return var2;
   }

   public Types$PbDateFormatSeparator getDateFormatSeparator() {
      Types$PbDateFormatSeparator var1 = Types$PbDateFormatSeparator.valueOf(this.dateFormatSeparator_);
      Types$PbDateFormatSeparator var2 = var1;
      if (var1 == null) {
         var2 = Types$PbDateFormatSeparator.DOT;
      }

      return var2;
   }

   public Preferences$PbLocalizationPreferences getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbStartDayOfWeek getFirstdayOfWeek() {
      Types$PbStartDayOfWeek var1 = Types$PbStartDayOfWeek.valueOf(this.firstdayOfWeek_);
      Types$PbStartDayOfWeek var2 = var1;
      if (var1 == null) {
         var2 = Types$PbStartDayOfWeek.MONDAY;
      }

      return var2;
   }

   public Structures$PbLanguageId getLanguage() {
      Structures$PbLanguageId var1;
      if (this.language_ == null) {
         var1 = Structures$PbLanguageId.getDefaultInstance();
      } else {
         var1 = this.language_;
      }

      return var1;
   }

   public Structures$PbLanguageIdOrBuilder getLanguageOrBuilder() {
      Structures$PbLanguageId var1;
      if (this.language_ == null) {
         var1 = Structures$PbLanguageId.getDefaultInstance();
      } else {
         var1 = this.language_;
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
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getLanguage());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeEnumSize(2, this.unitSystem_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeEnumSize(3, this.timeFormat_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeEnumSize(4, this.timeFormatSeparator_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeEnumSize(5, this.dateFormat_);
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeEnumSize(6, this.dateFormatSeparator_);
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeEnumSize(7, this.firstdayOfWeek_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbTimeFormat getTimeFormat() {
      Types$PbTimeFormat var1 = Types$PbTimeFormat.valueOf(this.timeFormat_);
      Types$PbTimeFormat var2 = var1;
      if (var1 == null) {
         var2 = Types$PbTimeFormat.TIME_FORMAT_24H;
      }

      return var2;
   }

   public Types$PbTimeFormatSeparator getTimeFormatSeparator() {
      Types$PbTimeFormatSeparator var1 = Types$PbTimeFormatSeparator.valueOf(this.timeFormatSeparator_);
      Types$PbTimeFormatSeparator var2 = var1;
      if (var1 == null) {
         var2 = Types$PbTimeFormatSeparator.TIME_FORMAT_SEPARATOR_DOT;
      }

      return var2;
   }

   public Types$PbUnitSystem getUnitSystem() {
      Types$PbUnitSystem var1 = Types$PbUnitSystem.valueOf(this.unitSystem_);
      Types$PbUnitSystem var2 = var1;
      if (var1 == null) {
         var2 = Types$PbUnitSystem.METRIC;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDateFormat() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDateFormatSeparator() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFirstdayOfWeek() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLanguage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeFormat() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeFormatSeparator() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUnitSystem() {
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
         if (this.hasLanguage()) {
            var2 = (var1 * 37 + 1) * 53 + this.getLanguage().hashCode();
         }

         var1 = var2;
         if (this.hasUnitSystem()) {
            var1 = (var2 * 37 + 2) * 53 + this.unitSystem_;
         }

         var2 = var1;
         if (this.hasTimeFormat()) {
            var2 = (var1 * 37 + 3) * 53 + this.timeFormat_;
         }

         var1 = var2;
         if (this.hasTimeFormatSeparator()) {
            var1 = (var2 * 37 + 4) * 53 + this.timeFormatSeparator_;
         }

         var2 = var1;
         if (this.hasDateFormat()) {
            var2 = (var1 * 37 + 5) * 53 + this.dateFormat_;
         }

         var1 = var2;
         if (this.hasDateFormatSeparator()) {
            var1 = (var2 * 37 + 6) * 53 + this.dateFormatSeparator_;
         }

         var2 = var1;
         if (this.hasFirstdayOfWeek()) {
            var2 = (var1 * 37 + 7) * 53 + this.firstdayOfWeek_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Preferences.b().ensureFieldAccessorsInitialized(Preferences$PbLocalizationPreferences.class, Preferences$PbLocalizationPreferences$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasLanguage() && !this.getLanguage().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Preferences$PbLocalizationPreferences$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Preferences$PbLocalizationPreferences$Builder newBuilderForType(BuilderParent var1) {
      return new Preferences$PbLocalizationPreferences$Builder(var1, (Preferences$1)null);
   }

   public Preferences$PbLocalizationPreferences$Builder toBuilder() {
      Preferences$PbLocalizationPreferences$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Preferences$PbLocalizationPreferences$Builder((Preferences$1)null);
      } else {
         var1 = (new Preferences$PbLocalizationPreferences$Builder((Preferences$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getLanguage());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.unitSystem_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.timeFormat_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(4, this.timeFormatSeparator_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeEnum(5, this.dateFormat_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeEnum(6, this.dateFormatSeparator_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeEnum(7, this.firstdayOfWeek_);
      }

      this.unknownFields.writeTo(var1);
   }
}
