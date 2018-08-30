package android.support.b;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class g {
   static long a(File var0) {
      RandomAccessFile var1 = new RandomAccessFile(var0, "r");

      long var2;
      try {
         var2 = a(var1, a(var1));
      } finally {
         var1.close();
      }

      return var2;
   }

   static long a(RandomAccessFile var0, h var1) {
      CRC32 var2 = new CRC32();
      long var3 = var1.b;
      var0.seek(var1.a);
      int var5 = (int)Math.min(16384L, var3);
      byte[] var6 = new byte[16384];

      for(var5 = var0.read(var6, 0, var5); var5 != -1; var5 = var0.read(var6, 0, (int)Math.min(16384L, var3))) {
         var2.update(var6, 0, var5);
         var3 -= (long)var5;
         if (var3 == 0L) {
            break;
         }
      }

      return var2.getValue();
   }

   static h a(RandomAccessFile var0) {
      long var1 = 0L;
      long var3 = var0.length() - 22L;
      if (var3 < 0L) {
         throw new ZipException("File too short to be a zip file: " + var0.length());
      } else {
         long var5 = var3 - 65536L;
         if (var5 >= 0L) {
            var1 = var5;
         }

         int var7 = Integer.reverseBytes(101010256);

         do {
            var0.seek(var3);
            if (var0.readInt() == var7) {
               var0.skipBytes(2);
               var0.skipBytes(2);
               var0.skipBytes(2);
               var0.skipBytes(2);
               h var8 = new h();
               var8.b = (long)Integer.reverseBytes(var0.readInt()) & 4294967295L;
               var8.a = (long)Integer.reverseBytes(var0.readInt()) & 4294967295L;
               return var8;
            }

            var5 = var3 - 1L;
            var3 = var5;
         } while(var5 >= var1);

         throw new ZipException("End Of Central Directory signature not found");
      }
   }
}
