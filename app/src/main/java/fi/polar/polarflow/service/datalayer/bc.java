package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import protocol.PftpResponse$PbPFtpDirectory;
import protocol.PftpResponse$PbPFtpDirectory$Builder;
import protocol.PftpResponse$PbPFtpEntry;
import protocol.PftpResponse$PbPFtpEntry$Builder;

public class bc extends o {
   private static final String d = bc.class.getSimpleName();

   public bc(Context var1) {
      super(var1);
   }

   private static PftpResponse$PbPFtpDirectory a(List var0) {
      PftpResponse$PbPFtpDirectory$Builder var1 = PftpResponse$PbPFtpDirectory.newBuilder();
      Iterator var4 = var0.iterator();

      while(var4.hasNext()) {
         y var2 = (y)var4.next();
         PftpResponse$PbPFtpEntry$Builder var3 = PftpResponse$PbPFtpEntry.newBuilder();
         var3.setName(var2.a());
         var3.setSize(var2.b());
         var1.addEntries(var3.build());
      }

      return var1.build();
   }

   private List e(String param1) {
      // $FF: Couldn't be decompiled
   }

   public byte[] b(String param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean c(String param1) {
      // $FF: Couldn't be decompiled
   }

   public PftpResponse$PbPFtpDirectory d(String var1) {
      return a(this.e(var1));
   }
}
