package fi.polar.remote.representation.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class UserIds$PbPasswordToken$1 extends AbstractParser {
   public UserIds$PbPasswordToken parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new UserIds$PbPasswordToken(var1, var2, (UserIds$1)null);
   }
}
