package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SyncInfo$PbSyncInfoOrBuilder extends MessageOrBuilder {
   String getChangedPath(int var1);

   ByteString getChangedPathBytes(int var1);

   int getChangedPathCount();

   List getChangedPathList();

   boolean getFullSyncRequired();

   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   Types$PbSystemDateTime getLastSynchronized();

   Types$PbSystemDateTimeOrBuilder getLastSynchronizedOrBuilder();

   boolean hasFullSyncRequired();

   boolean hasLastModified();

   boolean hasLastSynchronized();
}
