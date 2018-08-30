package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface Structures$PbVersionOrBuilder extends MessageOrBuilder {
   int getMajor();

   int getMinor();

   int getPatch();

   String getSpecifier();

   ByteString getSpecifierBytes();

   boolean hasMajor();

   boolean hasMinor();

   boolean hasPatch();

   boolean hasSpecifier();
}
