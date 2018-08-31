package fi.polar.polarflow.b_package;

import java.io.IOException;
import java.io.OutputStream;

public abstract class a {
   private final OutputStream a;
   private boolean b;

   private boolean c() {
      boolean var1;
      if (!this.b) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void a() {
      if (this.c()) {
         try {
            this.a.flush();
         } catch (IOException var2) {
            fi.polar.polarflow.util.d.a("Formatter", "", var2);
         }
      }

   }

   abstract void a(String var1);

   abstract void a(String[] var1);

   public void b() {
      if (this.c()) {
         try {
            this.a.close();
            this.b = true;
         } catch (IOException var2) {
            fi.polar.polarflow.util.d.a("Formatter", "", var2);
         }
      }

   }
}
