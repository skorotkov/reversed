package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Sport$PbSportTranslationOrBuilder extends MessageOrBuilder {
   Structures$PbLanguageId getId();

   Structures$PbLanguageIdOrBuilder getIdOrBuilder();

   Structures$PbOneLineText getLongText();

   Structures$PbOneLineTextOrBuilder getLongTextOrBuilder();

   Structures$PbOneLineText getLongTwoLineText();

   Structures$PbOneLineTextOrBuilder getLongTwoLineTextOrBuilder();

   Structures$PbOneLineText getMediumText();

   Structures$PbOneLineTextOrBuilder getMediumTextOrBuilder();

   Structures$PbOneLineText getShortText();

   Structures$PbOneLineTextOrBuilder getShortTextOrBuilder();

   boolean hasId();

   boolean hasLongText();

   boolean hasLongTwoLineText();

   boolean hasMediumText();

   boolean hasShortText();
}
