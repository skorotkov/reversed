package android.support.v4.g;

import android.util.Log;
import java.io.Writer;

public class g extends Writer {
   private final String a;
   private StringBuilder b = new StringBuilder(128);

   public g(String var1) {
      this.a = var1;
   }

   private void a() {
      if (this.b.length() > 0) {
         Log.d(this.a, this.b.toString());
         this.b.delete(0, this.b.length());
      }

   }

   public void close() {
      this.a();
   }

   public void flush() {
      this.a();
   }

   public void write(char[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var1[var2 + var4];
         if (var5 == '\n') {
            this.a();
         } else {
            this.b.append(var5);
         }
      }

   }
}
