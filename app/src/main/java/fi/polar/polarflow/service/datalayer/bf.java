package fi.polar.polarflow.service.datalayer;

import java.io.InputStream;

class bf implements p {
   // $FF: synthetic field
   final q a;
   // $FF: synthetic field
   final String b;
   // $FF: synthetic field
   final SyncJournalingService c;

   bf(SyncJournalingService var1, q var2, String var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void a(InputStream var1) {
      this.a.a(this.c, this.b, var1);
   }
}
