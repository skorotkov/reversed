package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import java.nio.ByteBuffer;

public abstract class e implements aq {
   private static final String a = e.class.getSimpleName();
   private u b = new u();
   private String c;
   private String d;
   private int e;

   private static int a(byte[] var0) {
      byte var1 = 0;
      int var2 = var1;
      if (var0 != null) {
         var2 = var1;
         if (var0.length >= 4) {
            var2 = ByteBuffer.wrap(var0).getInt();
         }
      }

      return var2;
   }

   private static byte[] a(int var0, byte[] var1) {
      int var2;
      if (var1 != null) {
         var2 = var1.length;
      } else {
         var2 = 0;
      }

      ByteBuffer var3 = ByteBuffer.allocate(var2 + 4);
      var3.putInt(var0);
      if (var2 > 0) {
         var3.put(var1);
      }

      return var3.array();
   }

   private static byte[] b(byte[] var0) {
      Object var1 = null;
      byte[] var2 = (byte[])var1;
      if (var0 != null) {
         var2 = (byte[])var1;
         if (var0.length > 4) {
            var2 = new byte[var0.length - 4];
            ByteBuffer.wrap(var0).get(var2);
         }
      }

      return var2;
   }

   public void a(Context var1, String var2, byte[] var3, String var4) {
      this.c = var4;
      this.d = var2;
      this.e = a(var3);
      fi.polar.polarflow.util.d.c(a, "Received " + var2 + " request from " + this.c);
      this.a(var1, b(var3));
   }

   protected abstract void a(Context var1, byte[] var2);

   protected void b(Context var1, byte[] var2) {
      fi.polar.polarflow.util.d.c(a, "Sending " + this.d + " response to " + this.c);
      var2 = a(this.e, var2);
      ar var3 = new ar(this.d, var2, this.c);
      this.b.b(var1).execute(new ar[]{var3});
   }
}
