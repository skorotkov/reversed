package fi.polar.remote.representation.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

final class DailySummary$PbDailySummary$1 extends AbstractParser {
   public DailySummary$PbDailySummary parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      return new DailySummary$PbDailySummary(var1, var2, (DailySummary$1)null);
   }
}
