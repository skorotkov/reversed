package fi.polar.remote.representation.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class Identifier$PbIdentifier$1 extends AbstractParser {
   public Identifier$PbIdentifier parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new Identifier$PbIdentifier(var1, var2, (Identifier$1)null);
   }
}
