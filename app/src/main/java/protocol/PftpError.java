package protocol;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.FileDescriptor;
import fi.polar.remote.representation.protobuf.Types;

public final class PftpError {
   private static FileDescriptor descriptor;

   static {
      PftpError$1 var0 = new PftpError$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010pftp_error.proto\u0012\bprotocol\u001a\u000btypes.proto*õ\u0003\n\u000bPbPFtpError\u0012\u0017\n\u0013OPERATION_SUCCEEDED\u0010\u0000\u0012\r\n\tREBOOTING\u0010\u0001\u0012\r\n\tTRY_AGAIN\u0010\u0002\u0012\u001b\n\u0017UNIDENTIFIED_HOST_ERROR\u0010d\u0012\u0013\n\u000fINVALID_COMMAND\u0010e\u0012\u0015\n\u0011INVALID_PARAMETER\u0010f\u0012\u001d\n\u0019NO_SUCH_FILE_OR_DIRECTORY\u0010g\u0012\u0014\n\u0010DIRECTORY_EXISTS\u0010h\u0012\u000f\n\u000bFILE_EXISTS\u0010i\u0012\u001b\n\u0017OPERATION_NOT_PERMITTED\u0010j\u0012\u0010\n\fNO_SUCH_USER\u0010k\u0012\u000b\n\u0007TIMEOUT\u0010l\u0012\u001e\n\u0019UNIDENTIFIED_DEVICE_ERROR\u0010È\u0001\u0012\u0014\n\u000fNOT_IMPLEMENTED\u0010É\u0001\u0012\u0010\n\u000bSYSTEM_BUSY\u0010Ê\u0001\u0012\u0014\n\u000fINVALID_C", "ONTENT\u0010Ë\u0001\u0012\u0015\n\u0010CHECKSUM_FAILURE\u0010Ì\u0001\u0012\u000e\n\tDISK_FULL\u0010Í\u0001\u0012\u0019\n\u0014PREREQUISITE_NOT_MET\u0010Î\u0001\u0012\u0018\n\u0013INSUFFICIENT_BUFFER\u0010Ï\u0001\u0012\u0014\n\u000fWAIT_FOR_IDLING\u0010Ð\u0001\u0012\u0014\n\u000fBATTERY_TOO_LOW\u0010Ñ\u0001"}, new FileDescriptor[]{var1}, var0);
      Types.getDescriptor();
   }

   private PftpError() {
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
