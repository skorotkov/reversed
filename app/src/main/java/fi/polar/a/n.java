package fi.polar.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

class n extends a {
   private final List c = Collections.synchronizedList(new ArrayList());

   n(UUID var1, l var2) {
      super(var1, var2);
   }

   boolean a() {
      this.c.clear();
      return super.a();
   }

   void b(byte[] var1) {
      fi.polar.a.a_package.b.d("D2HPftpHandler", "Host sending data to D2H characteristic, ignored");
   }

   void d() {
      // $FF: Couldn't be decompiled
   }

   public byte[] deviceProcessQueryRequest(int[] var1, int var2, byte[] var3) {
      fi.polar.a.a_package.e.a(201, var1);
      return new byte[0];
   }

   public byte[] deviceProcessReadRequest(int[] var1, byte[] var2) {
      fi.polar.a.a_package.e.a(201, var1);
      return new byte[0];
   }

   public int deviceProcessWriteRequest(byte[] var1) {
      return 201;
   }

   public void deviceReadRequestCompleted(int var1) {
   }

   public byte[] deviceWaitForRequest(int[] var1) {
      fi.polar.a.a_package.e.a(201, var1);
      return new byte[0];
   }

   public void deviceWriteRequestCompleted(int var1, byte[] var2, byte[] var3) {
   }
}
