package fi.polar.polarflow.service.bluetooth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import fi.polar.polarflow.service.datalayer.SyncJournalingService;
import fi.polar.polarflow.service.datalayer.bc;
import fi.polar.polarflow.service.datalayer.be;
import fi.polar.polarflow.service.datalayer.bn;
import fi.polar.polarflow.util.u;
import fi.polar.polarflow.util.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class m extends fi.polar.a.l implements p {
   private static final String a = m.class.getSimpleName();
   private final List b;
   private final List c;
   private final Context d;
   private be e;
   private bc f;

   public m(Context var1) {
      this.d = var1;
      this.e = new be();
      this.f = new bc(var1);
      q var2 = new q();
      r var4 = new r();
      var2.a(this);
      var4.a(this);
      t var3 = new t();
      var3.a(this);
      this.b = new ArrayList();
      this.b.add(var2);
      this.b.add(var4);
      this.b.add(var3);
      this.b.add(new n());
      this.b.add(new s());
      this.c = new ArrayList();
      this.c.add(new bn());
   }

   private int a(String var1, int var2) {
      byte var6;
      if (!TextUtils.isEmpty(var1)) {
         ArrayList var3 = new ArrayList();
         boolean var4 = this.f.a(var1, var2, var3).getStatus().isSuccess();
         if (var4) {
            Iterator var5 = var3.iterator();

            while(var5.hasNext()) {
               String var7 = (String)var5.next();
               this.e.b(this.g(var7));
            }
         }

         if (var4) {
            var6 = 0;
         } else {
            var6 = 103;
         }
      } else {
         var6 = 102;
      }

      return var6;
   }

   private o a(int var1) {
      Iterator var2 = this.b.iterator();

      o var3;
      do {
         if (!var2.hasNext()) {
            var3 = null;
            break;
         }

         var3 = (o)var2.next();
      } while(var1 != var3.a());

      return var3;
   }

   private fi.polar.polarflow.service.datalayer.r f(String var1) {
      Iterator var2 = this.c.iterator();

      fi.polar.polarflow.service.datalayer.r var4;
      while(true) {
         if (var2.hasNext()) {
            fi.polar.polarflow.service.datalayer.r var3 = (fi.polar.polarflow.service.datalayer.r)var2.next();
            if (!var1.matches(var3.a())) {
               continue;
            }

            var4 = var3;
            break;
         }

         var4 = null;
         break;
      }

      return var4;
   }

   private Uri g(String var1) {
      return Uri.fromFile(new File(var1));
   }

   public int a(String param1, byte[] param2) {
      // $FF: Couldn't be decompiled
      return 0;
   }

   public fi.polar.a.m a(int var1, byte[] var2) {
      String var3 = a;
      StringBuilder var4 = (new StringBuilder()).append("onCreateDirectoryRequest(id=").append(var1).append(", parameters=");
      Integer var5;
      if (var2 != null) {
         var5 = var2.length;
      } else {
         var5 = null;
      }

      fi.polar.polarflow.util.d.c(var3, var4.append(var5).append(")").toString());
      return super.a(var1, var2);
   }

   public fi.polar.a.m a(String param1) {
      // $FF: Couldn't be decompiled
      return null;
   }

   public void a() {
      fi.polar.polarflow.util.d.c(a, "onSyncStart()");
      y.e(this.d);
   }

   public void a(boolean var1) {
      fi.polar.polarflow.util.d.c(a, "onConnectionStateChange(connected=" + var1 + ")");
      if (!var1) {
         fi.polar.polarflow.util.d.e(a, "onConnectionState(Disconnected during sync)");
         this.b(false);
      }

   }

   public int b(String var1) {
      fi.polar.polarflow.util.d.c(a, "onDeleteFileRequest(path=" + var1 + ")");
      return this.a(var1, 0);
   }

   public void b(int var1, byte[] var2) {
      String var3 = a;
      StringBuilder var4 = (new StringBuilder()).append("onNotificationReceived(id=").append(var1).append(", params=");
      Integer var5;
      if (var2 != null) {
         var5 = var2.length;
      } else {
         var5 = null;
      }

      fi.polar.polarflow.util.d.c(var3, var4.append(var5).append(")").toString());
      o var6 = this.a(var1);
      if (var6 != null) {
         var6.a(this.d, var2);
      } else {
         fi.polar.polarflow.util.d.c(a, "onNotificationReceived(no receiver found for id=" + var1 + ")");
      }

   }

   public void b(boolean var1) {
      fi.polar.polarflow.util.d.c(a, "onSyncStop()");
      y.a(this.d, var1);
      if (var1) {
         u.a().a(System.currentTimeMillis());
      }

      this.d.startService(new Intent(this.d, SyncJournalingService.class));
   }

   public int c(String var1) {
      fi.polar.polarflow.util.d.c(a, "onDeleteDirectoryRequest(path=" + var1 + ")");
      return this.a(var1, 1);
   }

   public fi.polar.a.m d(String param1) {
      // $FF: Couldn't be decompiled
      return null;
   }

   public int e(String var1) {
      fi.polar.polarflow.util.d.c(a, "onCreateDirectoryRequest(path=" + var1 + ")");
      byte var2;
      if (this.f.c(var1)) {
         var2 = 0;
      } else {
         var2 = 104;
      }

      return var2;
   }
}
