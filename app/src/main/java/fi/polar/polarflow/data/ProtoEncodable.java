package fi.polar.polarflow.data;

import com.google.protobuf.GeneratedMessageV3;

public interface ProtoEncodable {
   byte[] toByteArray();

   GeneratedMessageV3 toPbObject();
}
