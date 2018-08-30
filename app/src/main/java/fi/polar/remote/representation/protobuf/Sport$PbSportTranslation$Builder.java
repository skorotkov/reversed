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

public final class Sport$PbSportTranslation$Builder extends Builder implements Sport$PbSportTranslationOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 idBuilder_;
   private Structures$PbLanguageId id_;
   private SingleFieldBuilderV3 longTextBuilder_;
   private Structures$PbOneLineText longText_;
   private SingleFieldBuilderV3 longTwoLineTextBuilder_;
   private Structures$PbOneLineText longTwoLineText_;
   private SingleFieldBuilderV3 mediumTextBuilder_;
   private Structures$PbOneLineText mediumText_;
   private SingleFieldBuilderV3 shortTextBuilder_;
   private Structures$PbOneLineText shortText_;

   private Sport$PbSportTranslation$Builder() {
      this.id_ = null;
      this.shortText_ = null;
      this.mediumText_ = null;
      this.longText_ = null;
      this.longTwoLineText_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Sport$PbSportTranslation$Builder(BuilderParent var1) {
      super(var1);
      this.id_ = null;
      this.shortText_ = null;
      this.mediumText_ = null;
      this.longText_ = null;
      this.longTwoLineText_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Sport$PbSportTranslation$Builder(BuilderParent var1, Sport$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Sport$PbSportTranslation$Builder(Sport$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Sport.a();
   }

   private SingleFieldBuilderV3 getIdFieldBuilder() {
      if (this.idBuilder_ == null) {
         this.idBuilder_ = new SingleFieldBuilderV3(this.getId(), this.getParentForChildren(), this.isClean());
         this.id_ = null;
      }

      return this.idBuilder_;
   }

   private SingleFieldBuilderV3 getLongTextFieldBuilder() {
      if (this.longTextBuilder_ == null) {
         this.longTextBuilder_ = new SingleFieldBuilderV3(this.getLongText(), this.getParentForChildren(), this.isClean());
         this.longText_ = null;
      }

      return this.longTextBuilder_;
   }

   private SingleFieldBuilderV3 getLongTwoLineTextFieldBuilder() {
      if (this.longTwoLineTextBuilder_ == null) {
         this.longTwoLineTextBuilder_ = new SingleFieldBuilderV3(this.getLongTwoLineText(), this.getParentForChildren(), this.isClean());
         this.longTwoLineText_ = null;
      }

      return this.longTwoLineTextBuilder_;
   }

   private SingleFieldBuilderV3 getMediumTextFieldBuilder() {
      if (this.mediumTextBuilder_ == null) {
         this.mediumTextBuilder_ = new SingleFieldBuilderV3(this.getMediumText(), this.getParentForChildren(), this.isClean());
         this.mediumText_ = null;
      }

      return this.mediumTextBuilder_;
   }

   private SingleFieldBuilderV3 getShortTextFieldBuilder() {
      if (this.shortTextBuilder_ == null) {
         this.shortTextBuilder_ = new SingleFieldBuilderV3(this.getShortText(), this.getParentForChildren(), this.isClean());
         this.shortText_ = null;
      }

      return this.shortTextBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Sport$PbSportTranslation.b()) {
         this.getIdFieldBuilder();
         this.getShortTextFieldBuilder();
         this.getMediumTextFieldBuilder();
         this.getLongTextFieldBuilder();
         this.getLongTwoLineTextFieldBuilder();
      }

   }

   public Sport$PbSportTranslation$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Sport$PbSportTranslation$Builder)super.addRepeatedField(var1, var2);
   }

   public Sport$PbSportTranslation build() {
      Sport$PbSportTranslation var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Sport$PbSportTranslation buildPartial() {
      Sport$PbSportTranslation var1 = new Sport$PbSportTranslation(this, (Sport$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.idBuilder_ == null) {
         Sport$PbSportTranslation.a(var1, this.id_);
      } else {
         Sport$PbSportTranslation.a(var1, (Structures$PbLanguageId)this.idBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.shortTextBuilder_ == null) {
         Sport$PbSportTranslation.a(var1, this.shortText_);
      } else {
         Sport$PbSportTranslation.a(var1, (Structures$PbOneLineText)this.shortTextBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.mediumTextBuilder_ == null) {
         Sport$PbSportTranslation.b(var1, this.mediumText_);
      } else {
         Sport$PbSportTranslation.b(var1, (Structures$PbOneLineText)this.mediumTextBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.longTextBuilder_ == null) {
         Sport$PbSportTranslation.c(var1, this.longText_);
      } else {
         Sport$PbSportTranslation.c(var1, (Structures$PbOneLineText)this.longTextBuilder_.build());
      }

      var5 = var4;
      if ((var2 & 16) == 16) {
         var5 = var4 | 16;
      }

      if (this.longTwoLineTextBuilder_ == null) {
         Sport$PbSportTranslation.d(var1, this.longTwoLineText_);
      } else {
         Sport$PbSportTranslation.d(var1, (Structures$PbOneLineText)this.longTwoLineTextBuilder_.build());
      }

      Sport$PbSportTranslation.a(var1, var5);
      this.onBuilt();
      return var1;
   }

   public Sport$PbSportTranslation$Builder clear() {
      super.clear();
      if (this.idBuilder_ == null) {
         this.id_ = null;
      } else {
         this.idBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.shortTextBuilder_ == null) {
         this.shortText_ = null;
      } else {
         this.shortTextBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.mediumTextBuilder_ == null) {
         this.mediumText_ = null;
      } else {
         this.mediumTextBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.longTextBuilder_ == null) {
         this.longText_ = null;
      } else {
         this.longTextBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.longTwoLineTextBuilder_ == null) {
         this.longTwoLineText_ = null;
      } else {
         this.longTwoLineTextBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public Sport$PbSportTranslation$Builder clearField(FieldDescriptor var1) {
      return (Sport$PbSportTranslation$Builder)super.clearField(var1);
   }

   public Sport$PbSportTranslation$Builder clearId() {
      if (this.idBuilder_ == null) {
         this.id_ = null;
         this.onChanged();
      } else {
         this.idBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Sport$PbSportTranslation$Builder clearLongText() {
      if (this.longTextBuilder_ == null) {
         this.longText_ = null;
         this.onChanged();
      } else {
         this.longTextBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public Sport$PbSportTranslation$Builder clearLongTwoLineText() {
      if (this.longTwoLineTextBuilder_ == null) {
         this.longTwoLineText_ = null;
         this.onChanged();
      } else {
         this.longTwoLineTextBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public Sport$PbSportTranslation$Builder clearMediumText() {
      if (this.mediumTextBuilder_ == null) {
         this.mediumText_ = null;
         this.onChanged();
      } else {
         this.mediumTextBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Sport$PbSportTranslation$Builder clearOneof(OneofDescriptor var1) {
      return (Sport$PbSportTranslation$Builder)super.clearOneof(var1);
   }

   public Sport$PbSportTranslation$Builder clearShortText() {
      if (this.shortTextBuilder_ == null) {
         this.shortText_ = null;
         this.onChanged();
      } else {
         this.shortTextBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Sport$PbSportTranslation$Builder clone() {
      return (Sport$PbSportTranslation$Builder)super.clone();
   }

   public Sport$PbSportTranslation getDefaultInstanceForType() {
      return Sport$PbSportTranslation.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Sport.a();
   }

   public Structures$PbLanguageId getId() {
      Structures$PbLanguageId var1;
      if (this.idBuilder_ == null) {
         if (this.id_ == null) {
            var1 = Structures$PbLanguageId.getDefaultInstance();
         } else {
            var1 = this.id_;
         }
      } else {
         var1 = (Structures$PbLanguageId)this.idBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbLanguageId$Builder getIdBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbLanguageId$Builder)this.getIdFieldBuilder().getBuilder();
   }

   public Structures$PbLanguageIdOrBuilder getIdOrBuilder() {
      Object var1;
      if (this.idBuilder_ != null) {
         var1 = (Structures$PbLanguageIdOrBuilder)this.idBuilder_.getMessageOrBuilder();
      } else if (this.id_ == null) {
         var1 = Structures$PbLanguageId.getDefaultInstance();
      } else {
         var1 = this.id_;
      }

      return (Structures$PbLanguageIdOrBuilder)var1;
   }

   public Structures$PbOneLineText getLongText() {
      Structures$PbOneLineText var1;
      if (this.longTextBuilder_ == null) {
         if (this.longText_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.longText_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.longTextBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getLongTextBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getLongTextFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getLongTextOrBuilder() {
      Object var1;
      if (this.longTextBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.longTextBuilder_.getMessageOrBuilder();
      } else if (this.longText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.longText_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public Structures$PbOneLineText getLongTwoLineText() {
      Structures$PbOneLineText var1;
      if (this.longTwoLineTextBuilder_ == null) {
         if (this.longTwoLineText_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.longTwoLineText_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.longTwoLineTextBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getLongTwoLineTextBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getLongTwoLineTextFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getLongTwoLineTextOrBuilder() {
      Object var1;
      if (this.longTwoLineTextBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.longTwoLineTextBuilder_.getMessageOrBuilder();
      } else if (this.longTwoLineText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.longTwoLineText_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public Structures$PbOneLineText getMediumText() {
      Structures$PbOneLineText var1;
      if (this.mediumTextBuilder_ == null) {
         if (this.mediumText_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.mediumText_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.mediumTextBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getMediumTextBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getMediumTextFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getMediumTextOrBuilder() {
      Object var1;
      if (this.mediumTextBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.mediumTextBuilder_.getMessageOrBuilder();
      } else if (this.mediumText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.mediumText_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public Structures$PbOneLineText getShortText() {
      Structures$PbOneLineText var1;
      if (this.shortTextBuilder_ == null) {
         if (this.shortText_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.shortText_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.shortTextBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getShortTextBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getShortTextFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getShortTextOrBuilder() {
      Object var1;
      if (this.shortTextBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.shortTextBuilder_.getMessageOrBuilder();
      } else if (this.shortText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.shortText_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public boolean hasId() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLongText() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLongTwoLineText() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMediumText() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasShortText() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Sport.b().ensureFieldAccessorsInitialized(Sport$PbSportTranslation.class, Sport$PbSportTranslation$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasId()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasShortText()) {
            var2 = var1;
            if (this.getId().isInitialized()) {
               var2 = var1;
               if (this.getShortText().isInitialized()) {
                  if (this.hasMediumText()) {
                     var2 = var1;
                     if (!this.getMediumText().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasLongText()) {
                     var2 = var1;
                     if (!this.getLongText().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasLongTwoLineText()) {
                     var2 = var1;
                     if (!this.getLongTwoLineText().isInitialized()) {
                        return var2;
                     }
                  }

                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public Sport$PbSportTranslation$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Sport$PbSportTranslation var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Sport$PbSportTranslation)Sport$PbSportTranslation.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Sport$PbSportTranslation)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public Sport$PbSportTranslation$Builder mergeFrom(Message var1) {
      Sport$PbSportTranslation$Builder var2;
      if (var1 instanceof Sport$PbSportTranslation) {
         var2 = this.mergeFrom((Sport$PbSportTranslation)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Sport$PbSportTranslation$Builder mergeFrom(Sport$PbSportTranslation var1) {
      if (var1 != Sport$PbSportTranslation.getDefaultInstance()) {
         if (var1.hasId()) {
            this.mergeId(var1.getId());
         }

         if (var1.hasShortText()) {
            this.mergeShortText(var1.getShortText());
         }

         if (var1.hasMediumText()) {
            this.mergeMediumText(var1.getMediumText());
         }

         if (var1.hasLongText()) {
            this.mergeLongText(var1.getLongText());
         }

         if (var1.hasLongTwoLineText()) {
            this.mergeLongTwoLineText(var1.getLongTwoLineText());
         }

         this.mergeUnknownFields(Sport$PbSportTranslation.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Sport$PbSportTranslation$Builder mergeId(Structures$PbLanguageId var1) {
      if (this.idBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.id_ != null && this.id_ != Structures$PbLanguageId.getDefaultInstance()) {
            this.id_ = Structures$PbLanguageId.newBuilder(this.id_).mergeFrom(var1).buildPartial();
         } else {
            this.id_ = var1;
         }

         this.onChanged();
      } else {
         this.idBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Sport$PbSportTranslation$Builder mergeLongText(Structures$PbOneLineText var1) {
      if (this.longTextBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.longText_ != null && this.longText_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.longText_ = Structures$PbOneLineText.newBuilder(this.longText_).mergeFrom(var1).buildPartial();
         } else {
            this.longText_ = var1;
         }

         this.onChanged();
      } else {
         this.longTextBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public Sport$PbSportTranslation$Builder mergeLongTwoLineText(Structures$PbOneLineText var1) {
      if (this.longTwoLineTextBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.longTwoLineText_ != null && this.longTwoLineText_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.longTwoLineText_ = Structures$PbOneLineText.newBuilder(this.longTwoLineText_).mergeFrom(var1).buildPartial();
         } else {
            this.longTwoLineText_ = var1;
         }

         this.onChanged();
      } else {
         this.longTwoLineTextBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public Sport$PbSportTranslation$Builder mergeMediumText(Structures$PbOneLineText var1) {
      if (this.mediumTextBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.mediumText_ != null && this.mediumText_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.mediumText_ = Structures$PbOneLineText.newBuilder(this.mediumText_).mergeFrom(var1).buildPartial();
         } else {
            this.mediumText_ = var1;
         }

         this.onChanged();
      } else {
         this.mediumTextBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Sport$PbSportTranslation$Builder mergeShortText(Structures$PbOneLineText var1) {
      if (this.shortTextBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.shortText_ != null && this.shortText_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.shortText_ = Structures$PbOneLineText.newBuilder(this.shortText_).mergeFrom(var1).buildPartial();
         } else {
            this.shortText_ = var1;
         }

         this.onChanged();
      } else {
         this.shortTextBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Sport$PbSportTranslation$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Sport$PbSportTranslation$Builder)super.mergeUnknownFields(var1);
   }

   public Sport$PbSportTranslation$Builder setField(FieldDescriptor var1, Object var2) {
      return (Sport$PbSportTranslation$Builder)super.setField(var1, var2);
   }

   public Sport$PbSportTranslation$Builder setId(Structures$PbLanguageId$Builder var1) {
      if (this.idBuilder_ == null) {
         this.id_ = var1.build();
         this.onChanged();
      } else {
         this.idBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Sport$PbSportTranslation$Builder setId(Structures$PbLanguageId var1) {
      if (this.idBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.onChanged();
      } else {
         this.idBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Sport$PbSportTranslation$Builder setLongText(Structures$PbOneLineText$Builder var1) {
      if (this.longTextBuilder_ == null) {
         this.longText_ = var1.build();
         this.onChanged();
      } else {
         this.longTextBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public Sport$PbSportTranslation$Builder setLongText(Structures$PbOneLineText var1) {
      if (this.longTextBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.longText_ = var1;
         this.onChanged();
      } else {
         this.longTextBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public Sport$PbSportTranslation$Builder setLongTwoLineText(Structures$PbOneLineText$Builder var1) {
      if (this.longTwoLineTextBuilder_ == null) {
         this.longTwoLineText_ = var1.build();
         this.onChanged();
      } else {
         this.longTwoLineTextBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public Sport$PbSportTranslation$Builder setLongTwoLineText(Structures$PbOneLineText var1) {
      if (this.longTwoLineTextBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.longTwoLineText_ = var1;
         this.onChanged();
      } else {
         this.longTwoLineTextBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public Sport$PbSportTranslation$Builder setMediumText(Structures$PbOneLineText$Builder var1) {
      if (this.mediumTextBuilder_ == null) {
         this.mediumText_ = var1.build();
         this.onChanged();
      } else {
         this.mediumTextBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Sport$PbSportTranslation$Builder setMediumText(Structures$PbOneLineText var1) {
      if (this.mediumTextBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mediumText_ = var1;
         this.onChanged();
      } else {
         this.mediumTextBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Sport$PbSportTranslation$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Sport$PbSportTranslation$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Sport$PbSportTranslation$Builder setShortText(Structures$PbOneLineText$Builder var1) {
      if (this.shortTextBuilder_ == null) {
         this.shortText_ = var1.build();
         this.onChanged();
      } else {
         this.shortTextBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Sport$PbSportTranslation$Builder setShortText(Structures$PbOneLineText var1) {
      if (this.shortTextBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.shortText_ = var1;
         this.onChanged();
      } else {
         this.shortTextBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Sport$PbSportTranslation$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Sport$PbSportTranslation$Builder)super.setUnknownFields(var1);
   }
}
