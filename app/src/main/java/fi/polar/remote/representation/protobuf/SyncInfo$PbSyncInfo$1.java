package fi.polar.remote.representation.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class SyncInfo$PbSyncInfo$1 extends AbstractParser {
   public SyncInfo$PbSyncInfo parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new SyncInfo$PbSyncInfo(var1, var2, (SyncInfo$1)null);
   }
}
