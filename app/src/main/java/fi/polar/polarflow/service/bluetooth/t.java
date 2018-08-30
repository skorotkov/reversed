package fi.polar.polarflow.service.bluetooth;

import android.content.Context;
import protocol.PftpNotification$PbPFtpStopSyncParams;

class t extends r {
   public int a() {
      return 4;
   }

   public boolean a(Context var1, byte[] var2) {
      boolean var3 = super.a(var1, PftpNotification$PbPFtpStopSyncParams.newBuilder().setCompleted(false).build().toByteArray());
      var1.startService(BluetoothAdaptationService.a(var1));
      return var3;
   }
}
