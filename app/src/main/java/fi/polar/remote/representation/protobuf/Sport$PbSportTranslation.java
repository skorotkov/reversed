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

public final class Sport$PbSportTranslation extends GeneratedMessageV3 implements Sport$PbSportTranslationOrBuilder {
   private static final Sport$PbSportTranslation DEFAULT_INSTANCE = new Sport$PbSportTranslation();
   public static final int ID_FIELD_NUMBER = 1;
   public static final int LONG_TEXT_FIELD_NUMBER = 4;
   public static final int LONG_TWO_LINE_TEXT_FIELD_NUMBER = 5;
   public static final int MEDIUM_TEXT_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new Sport$PbSportTranslation$1();
   public static final int SHORT_TEXT_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Structures$PbLanguageId id_;
   private Structures$PbOneLineText longText_;
   private Structures$PbOneLineText longTwoLineText_;
   private Structures$PbOneLineText mediumText_;
   private byte memoizedIsInitialized;
   private Structures$PbOneLineText shortText_;

   private Sport$PbSportTranslation() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private Sport$PbSportTranslation(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Sport$PbSportTranslation(CodedInputStream var1, ExtensionRegistryLite var2, Sport$1 var3) {
      this(var1, var2);
   }

   private Sport$PbSportTranslation(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Sport$PbSportTranslation(Builder var1, Sport$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Sport$PbSportTranslation var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Sport$PbSportTranslation var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbLanguageId a(Sport$PbSportTranslation var0, Structures$PbLanguageId var1) {
      var0.id_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText a(Sport$PbSportTranslation var0, Structures$PbOneLineText var1) {
      var0.shortText_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText b(Sport$PbSportTranslation var0, Structures$PbOneLineText var1) {
      var0.mediumText_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText c(Sport$PbSportTranslation var0, Structures$PbOneLineText var1) {
      var0.longText_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText d(Sport$PbSportTranslation var0, Structures$PbOneLineText var1) {
      var0.longTwoLineText_ = var1;
      return var1;
   }

   public static Sport$PbSportTranslation getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Sport.a();
   }

   public static Sport$PbSportTranslation$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Sport$PbSportTranslation$Builder newBuilder(Sport$PbSportTranslation var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Sport$PbSportTranslation parseDelimitedFrom(InputStream var0) {
      return (Sport$PbSportTranslation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Sport$PbSportTranslation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Sport$PbSportTranslation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Sport$PbSportTranslation parseFrom(ByteString var0) {
      return (Sport$PbSportTranslation)PARSER.parseFrom(var0);
   }

   public static Sport$PbSportTranslation parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Sport$PbSportTranslation)PARSER.parseFrom(var0, var1);
   }

   public static Sport$PbSportTranslation parseFrom(CodedInputStream var0) {
      return (Sport$PbSportTranslation)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Sport$PbSportTranslation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Sport$PbSportTranslation)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Sport$PbSportTranslation parseFrom(InputStream var0) {
      return (Sport$PbSportTranslation)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Sport$PbSportTranslation parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Sport$PbSportTranslation)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Sport$PbSportTranslation parseFrom(byte[] var0) {
      return (Sport$PbSportTranslation)PARSER.parseFrom(var0);
   }

   public static Sport$PbSportTranslation parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Sport$PbSportTranslation)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Sport$PbSportTranslation)) {
            var2 = super.equals(var1);
         } else {
            Sport$PbSportTranslation var5 = (Sport$PbSportTranslation)var1;
            boolean var3;
            if (this.hasId() == var5.hasId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasId()) {
               if (var3 && this.getId().equals(var5.getId())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasShortText() == var5.hasShortText()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasShortText()) {
               if (var3 && this.getShortText().equals(var5.getShortText())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMediumText() == var5.hasMediumText()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMediumText()) {
               if (var4 && this.getMediumText().equals(var5.getMediumText())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLongText() == var5.hasLongText()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLongText()) {
               if (var4 && this.getLongText().equals(var5.getLongText())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLongTwoLineText() == var5.hasLongTwoLineText()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLongTwoLineText()) {
               if (var4 && this.getLongTwoLineText().equals(var5.getLongTwoLineText())) {
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

   public Sport$PbSportTranslation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Structures$PbLanguageId getId() {
      Structures$PbLanguageId var1;
      if (this.id_ == null) {
         var1 = Structures$PbLanguageId.getDefaultInstance();
      } else {
         var1 = this.id_;
      }

      return var1;
   }

   public Structures$PbLanguageIdOrBuilder getIdOrBuilder() {
      Structures$PbLanguageId var1;
      if (this.id_ == null) {
         var1 = Structures$PbLanguageId.getDefaultInstance();
      } else {
         var1 = this.id_;
      }

      return var1;
   }

   public Structures$PbOneLineText getLongText() {
      Structures$PbOneLineText var1;
      if (this.longText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.longText_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getLongTextOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.longText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.longText_;
      }

      return var1;
   }

   public Structures$PbOneLineText getLongTwoLineText() {
      Structures$PbOneLineText var1;
      if (this.longTwoLineText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.longTwoLineText_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getLongTwoLineTextOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.longTwoLineText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.longTwoLineText_;
      }

      return var1;
   }

   public Structures$PbOneLineText getMediumText() {
      Structures$PbOneLineText var1;
      if (this.mediumText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.mediumText_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getMediumTextOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.mediumText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.mediumText_;
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
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getId());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getShortText());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getMediumText());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getLongText());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeMessageSize(5, this.getLongTwoLineText());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Structures$PbOneLineText getShortText() {
      Structures$PbOneLineText var1;
      if (this.shortText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.shortText_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getShortTextOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.shortText_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.shortText_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasId()) {
            var1 = (var2 * 37 + 1) * 53 + this.getId().hashCode();
         }

         var2 = var1;
         if (this.hasShortText()) {
            var2 = (var1 * 37 + 2) * 53 + this.getShortText().hashCode();
         }

         var1 = var2;
         if (this.hasMediumText()) {
            var1 = (var2 * 37 + 3) * 53 + this.getMediumText().hashCode();
         }

         var2 = var1;
         if (this.hasLongText()) {
            var2 = (var1 * 37 + 4) * 53 + this.getLongText().hashCode();
         }

         var1 = var2;
         if (this.hasLongTwoLineText()) {
            var1 = (var2 * 37 + 5) * 53 + this.getLongTwoLineText().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Sport.b().ensureFieldAccessorsInitialized(Sport$PbSportTranslation.class, Sport$PbSportTranslation$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasShortText()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getId().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getShortText().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasMediumText() && !this.getMediumText().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasLongText() && !this.getLongText().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasLongTwoLineText() && !this.getLongTwoLineText().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Sport$PbSportTranslation$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Sport$PbSportTranslation$Builder newBuilderForType(BuilderParent var1) {
      return new Sport$PbSportTranslation$Builder(var1, (Sport$1)null);
   }

   public Sport$PbSportTranslation$Builder toBuilder() {
      Sport$PbSportTranslation$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Sport$PbSportTranslation$Builder((Sport$1)null);
      } else {
         var1 = (new Sport$PbSportTranslation$Builder((Sport$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getId());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getShortText());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getMediumText());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getLongText());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getLongTwoLineText());
      }

      this.unknownFields.writeTo(var1);
   }
}
