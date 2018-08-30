package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.List;

public class o {
   static final Object a = new Object();
   private static final String d = o.class.getSimpleName();
   final File b;
   fi.polar.polarflow.util.h c;

   public o(Context var1) {
      this.b = new File(var1.getFilesDir(), "storage");
      this.c = new fi.polar.polarflow.util.h();
   }

   public Status a(Uri param1, p param2) {
      // $FF: Couldn't be decompiled
   }

   public Status a(String var1, int var2) {
      return this.a(var1, var2, (List)null);
   }

   public Status a(String param1, int param2, List param3) {
      // $FF: Couldn't be decompiled
   }

   public Status a(String param1, byte[] param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean a() {
      // $FF: Couldn't be decompiled
   }

   public boolean a(String param1) {
      // $FF: Couldn't be decompiled
   }
}
