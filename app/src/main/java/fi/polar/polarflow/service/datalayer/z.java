package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.os.StatFs;
import protocol.PftpResponse$PbPFtpDiskSpaceResult;
import protocol.PftpResponse$PbPFtpDiskSpaceResult$Builder;

public class z extends e {
   private static PftpResponse$PbPFtpDiskSpaceResult a(int var0, long var1, long var3) {
      PftpResponse$PbPFtpDiskSpaceResult$Builder var5 = PftpResponse$PbPFtpDiskSpaceResult.newBuilder();
      var5.setFragmentSize(var0);
      var5.setTotalFragments(var1);
      var5.setFreeFragments(var3);
      return var5.build();
   }

   private static byte[] a(Context var0) {
      StatFs var1 = new StatFs(var0.getFilesDir().getPath());
      return a((int)var1.getBlockSizeLong(), var1.getBlockCountLong(), var1.getAvailableBlocksLong()).toByteArray();
   }

   public String a() {
      return "/MESSAGE/GET_DISK_SPACE";
   }

   protected void a(Context var1, byte[] var2) {
      this.b(var1, a(var1));
   }
}
