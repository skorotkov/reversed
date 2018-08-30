package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Preferences$PbLocalizationPreferences$Builder extends Builder implements Preferences$PbLocalizationPreferencesOrBuilder {
   private int bitField0_;
   private int dateFormatSeparator_;
   private int dateFormat_;
   private int firstdayOfWeek_;
   private SingleFieldBuilderV3 languageBuilder_;
   private Structures$PbLanguageId language_;
   private int timeFormatSeparator_;
   private int timeFormat_;
   private int unitSystem_;

   private Preferences$PbLocalizationPreferences$Builder() {
      this.language_ = null;
      this.unitSystem_ = 1;
      this.timeFormat_ = 1;
      this.timeFormatSeparator_ = 1;
      this.dateFormat_ = 1;
      this.dateFormatSeparator_ = 1;
      this.firstdayOfWeek_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private Preferences$PbLocalizationPreferences$Builder(BuilderParent var1) {
      super(var1);
      this.language_ = null;
      this.unitSystem_ = 1;
      this.timeFormat_ = 1;
      this.timeFormatSeparator_ = 1;
      this.dateFormat_ = 1;
      this.dateFormatSeparator_ = 1;
      this.firstdayOfWeek_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Preferences$PbLocalizationPreferences$Builder(BuilderParent var1, Preferences$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Preferences$PbLocalizationPreferences$Builder(Preferences$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Preferences.a();
   }

   private SingleFieldBuilderV3 getLanguageFieldBuilder() {
      if (this.languageBuilder_ == null) {
         this.languageBuilder_ = new SingleFieldBuilderV3(this.getLanguage(), this.getParentForChildren(), this.isClean());
         this.language_ = null;
      }

      return this.languageBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Preferences$PbLocalizationPreferences.b()) {
         this.getLanguageFieldBuilder();
      }

   }

   public Preferences$PbLocalizationPreferences$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Preferences$PbLocalizationPreferences$Builder)super.addRepeatedField(var1, var2);
   }

   public Preferences$PbLocalizationPreferences build() {
      Preferences$PbLocalizationPreferences var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Preferences$PbLocalizationPreferences buildPartial() {
      Preferences$PbLocalizationPreferences var1 = new Preferences$PbLocalizationPreferences(this, (Preferences$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.languageBuilder_ == null) {
         Preferences$PbLocalizationPreferences.a(var1, this.language_);
      } else {
         Preferences$PbLocalizationPreferences.a(var1, (Structures$PbLanguageId)this.languageBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      Preferences$PbLocalizationPreferences.a(var1, this.unitSystem_);
      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      Preferences$PbLocalizationPreferences.b(var1, this.timeFormat_);
      var4 = var5;
      if ((var2 & 8) == 8) {
         var4 = var5 | 8;
      }

      Preferences$PbLocalizationPreferences.c(var1, this.timeFormatSeparator_);
      var5 = var4;
      if ((var2 & 16) == 16) {
         var5 = var4 | 16;
      }

      Preferences$PbLocalizationPreferences.d(var1, this.dateFormat_);
      var4 = var5;
      if ((var2 & 32) == 32) {
         var4 = var5 | 32;
      }

      Preferences$PbLocalizationPreferences.e(var1, this.dateFormatSeparator_);
      var5 = var4;
      if ((var2 & 64) == 64) {
         var5 = var4 | 64;
      }

      Preferences$PbLocalizationPreferences.f(var1, this.firstdayOfWeek_);
      Preferences$PbLocalizationPreferences.g(var1, var5);
      this.onBuilt();
      return var1;
   }

   public Preferences$PbLocalizationPreferences$Builder clear() {
      super.clear();
      if (this.languageBuilder_ == null) {
         this.language_ = null;
      } else {
         this.languageBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.unitSystem_ = 1;
      this.bitField0_ &= -3;
      this.timeFormat_ = 1;
      this.bitField0_ &= -5;
      this.timeFormatSeparator_ = 1;
      this.bitField0_ &= -9;
      this.dateFormat_ = 1;
      this.bitField0_ &= -17;
      this.dateFormatSeparator_ = 1;
      this.bitField0_ &= -33;
      this.firstdayOfWeek_ = 1;
      this.bitField0_ &= -65;
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder clearDateFormat() {
      this.bitField0_ &= -17;
      this.dateFormat_ = 1;
      this.onChanged();
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder clearDateFormatSeparator() {
      this.bitField0_ &= -33;
      this.dateFormatSeparator_ = 1;
      this.onChanged();
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder clearField(FieldDescriptor var1) {
      return (Preferences$PbLocalizationPreferences$Builder)super.clearField(var1);
   }

   public Preferences$PbLocalizationPreferences$Builder clearFirstdayOfWeek() {
      this.bitField0_ &= -65;
      this.firstdayOfWeek_ = 1;
      this.onChanged();
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder clearLanguage() {
      if (this.languageBuilder_ == null) {
         this.language_ = null;
         this.onChanged();
      } else {
         this.languageBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder clearOneof(OneofDescriptor var1) {
      return (Preferences$PbLocalizationPreferences$Builder)super.clearOneof(var1);
   }

   public Preferences$PbLocalizationPreferences$Builder clearTimeFormat() {
      this.bitField0_ &= -5;
      this.timeFormat_ = 1;
      this.onChanged();
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder clearTimeFormatSeparator() {
      this.bitField0_ &= -9;
      this.timeFormatSeparator_ = 1;
      this.onChanged();
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder clearUnitSystem() {
      this.bitField0_ &= -3;
      this.unitSystem_ = 1;
      this.onChanged();
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder clone() {
      return (Preferences$PbLocalizationPreferences$Builder)super.clone();
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
      return Preferences$PbLocalizationPreferences.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Preferences.a();
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
      if (this.languageBuilder_ == null) {
         if (this.language_ == null) {
            var1 = Structures$PbLanguageId.getDefaultInstance();
         } else {
            var1 = this.language_;
         }
      } else {
         var1 = (Structures$PbLanguageId)this.languageBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbLanguageId$Builder getLanguageBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbLanguageId$Builder)this.getLanguageFieldBuilder().getBuilder();
   }

   public Structures$PbLanguageIdOrBuilder getLanguageOrBuilder() {
      Object var1;
      if (this.languageBuilder_ != null) {
         var1 = (Structures$PbLanguageIdOrBuilder)this.languageBuilder_.getMessageOrBuilder();
      } else if (this.language_ == null) {
         var1 = Structures$PbLanguageId.getDefaultInstance();
      } else {
         var1 = this.language_;
      }

      return (Structures$PbLanguageIdOrBuilder)var1;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Preferences.b().ensureFieldAccessorsInitialized(Preferences$PbLocalizationPreferences.class, Preferences$PbLocalizationPreferences$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (this.hasLanguage() && !this.getLanguage().isInitialized()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Preferences$PbLocalizationPreferences$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Preferences$PbLocalizationPreferences var13;
      label96: {
         InvalidProtocolBufferException var12;
         Preferences$PbLocalizationPreferences var14;
         try {
            var13 = (Preferences$PbLocalizationPreferences)Preferences$PbLocalizationPreferences.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Preferences$PbLocalizationPreferences)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder mergeFrom(Message var1) {
      Preferences$PbLocalizationPreferences$Builder var2;
      if (var1 instanceof Preferences$PbLocalizationPreferences) {
         var2 = this.mergeFrom((Preferences$PbLocalizationPreferences)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Preferences$PbLocalizationPreferences$Builder mergeFrom(Preferences$PbLocalizationPreferences var1) {
      if (var1 != Preferences$PbLocalizationPreferences.getDefaultInstance()) {
         if (var1.hasLanguage()) {
            this.mergeLanguage(var1.getLanguage());
         }

         if (var1.hasUnitSystem()) {
            this.setUnitSystem(var1.getUnitSystem());
         }

         if (var1.hasTimeFormat()) {
            this.setTimeFormat(var1.getTimeFormat());
         }

         if (var1.hasTimeFormatSeparator()) {
            this.setTimeFormatSeparator(var1.getTimeFormatSeparator());
         }

         if (var1.hasDateFormat()) {
            this.setDateFormat(var1.getDateFormat());
         }

         if (var1.hasDateFormatSeparator()) {
            this.setDateFormatSeparator(var1.getDateFormatSeparator());
         }

         if (var1.hasFirstdayOfWeek()) {
            this.setFirstdayOfWeek(var1.getFirstdayOfWeek());
         }

         this.mergeUnknownFields(Preferences$PbLocalizationPreferences.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder mergeLanguage(Structures$PbLanguageId var1) {
      if (this.languageBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.language_ != null && this.language_ != Structures$PbLanguageId.getDefaultInstance()) {
            this.language_ = Structures$PbLanguageId.newBuilder(this.language_).mergeFrom(var1).buildPartial();
         } else {
            this.language_ = var1;
         }

         this.onChanged();
      } else {
         this.languageBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final Preferences$PbLocalizationPreferences$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Preferences$PbLocalizationPreferences$Builder)super.mergeUnknownFields(var1);
   }

   public Preferences$PbLocalizationPreferences$Builder setDateFormat(Types$PbDateFormat var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.dateFormat_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Preferences$PbLocalizationPreferences$Builder setDateFormatSeparator(Types$PbDateFormatSeparator var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.dateFormatSeparator_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Preferences$PbLocalizationPreferences$Builder setField(FieldDescriptor var1, Object var2) {
      return (Preferences$PbLocalizationPreferences$Builder)super.setField(var1, var2);
   }

   public Preferences$PbLocalizationPreferences$Builder setFirstdayOfWeek(Types$PbStartDayOfWeek var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.firstdayOfWeek_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Preferences$PbLocalizationPreferences$Builder setLanguage(Structures$PbLanguageId$Builder var1) {
      if (this.languageBuilder_ == null) {
         this.language_ = var1.build();
         this.onChanged();
      } else {
         this.languageBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder setLanguage(Structures$PbLanguageId var1) {
      if (this.languageBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.language_ = var1;
         this.onChanged();
      } else {
         this.languageBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Preferences$PbLocalizationPreferences$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Preferences$PbLocalizationPreferences$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Preferences$PbLocalizationPreferences$Builder setTimeFormat(Types$PbTimeFormat var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.timeFormat_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Preferences$PbLocalizationPreferences$Builder setTimeFormatSeparator(Types$PbTimeFormatSeparator var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.timeFormatSeparator_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Preferences$PbLocalizationPreferences$Builder setUnitSystem(Types$PbUnitSystem var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.unitSystem_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Preferences$PbLocalizationPreferences$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Preferences$PbLocalizationPreferences$Builder)super.setUnknownFields(var1);
   }
}
