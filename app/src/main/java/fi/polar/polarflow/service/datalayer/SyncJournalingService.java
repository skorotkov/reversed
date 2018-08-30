package fi.polar.polarflow.service.datalayer;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import fi.polar.polarflow.data.orm.SyncJournal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncJournalingService extends IntentService {
   private android.support.v4.c.g a;
   private List b;
   private List c;
   private o d;

   public SyncJournalingService() {
      this("SyncJournalingService");
   }

   public SyncJournalingService(String var1) {
      super(var1);
      this.b = new CopyOnWriteArrayList();
      this.b.add(new m());
      this.b.add(new f());
      this.b.add(new au());
      this.b.add(new av());
      this.b.add(new bo());
      this.b.add(new ba());
      this.b.add(new az());
      this.b.add(new bd());
      this.b.add(new k());
      this.b.add(new bj());
      this.b.add(new bl());
      this.b.add(new bm());
      this.b.add(new ax());
      this.b.add(new n());
      this.b.add(new al());
      this.b.add(new ay());
   }

   private List a(String var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.b.iterator();

      while(var3.hasNext()) {
         q var4 = (q)var3.next();
         if (var1.matches(var4.a())) {
            var2.add(var4);
         }
      }

      if (var2.isEmpty()) {
         var2.add(new w());
      }

      return var2;
   }

   private void a() {
      // $FF: Couldn't be decompiled
   }

   private void a(SyncJournal var1) {
      String var2 = var1.getPath();
      Iterator var3 = this.a(var2).iterator();

      while(var3.hasNext()) {
         q var4 = (q)var3.next();
         Status var5 = this.d.a((Uri)var1.getUri(), (p)(new bf(this, var4, var2)));
         if (!var5.isSuccess()) {
            fi.polar.polarflow.util.d.b("SyncJournalingService", "Cannot retrieve data item(status=" + var5 + ")");
         }
      }

   }

   private int b() {
      fi.polar.polarflow.util.d.c("SyncJournalingService", "Found #" + this.c.size() + " cached events");
      Iterator var1 = this.c.iterator();

      int var2;
      SyncJournal var3;
      for(var2 = 0; var1.hasNext(); var3.delete()) {
         var3 = (SyncJournal)var1.next();
         if (var3.getType() == 1) {
            this.a(var3);
            ++var2;
         } else if (var3.getType() == 2) {
            this.b(var3);
            ++var2;
         } else {
            fi.polar.polarflow.util.d.b("SyncJournalingService", "Unsupported DataEvent type: " + var3.getType());
         }
      }

      return var2;
   }

   private void b(SyncJournal var1) {
      Iterator var2 = this.a(var1.getPath()).iterator();

      while(var2.hasNext()) {
         ((q)var2.next()).a(var1.getPath());
      }

   }

   public void onCreate() {
      super.onCreate();
      if (this.a == null) {
         this.a = android.support.v4.c.g.a(this);
      }

      if (this.d == null) {
         this.d = new o(this);
      }

   }

   protected void onHandleIntent(Intent var1) {
      if (fi.polar.polarflow.util.r.a.b() && !fi.polar.polarflow.util.r.a.a()) {
         fi.polar.polarflow.util.d.c("SyncJournalingService", "Call for journaling start...");
         this.a();
      } else {
         fi.polar.polarflow.util.r var3 = fi.polar.polarflow.util.r.a;
         boolean var2;
         if (SyncJournal.count(SyncJournal.class) > 0L) {
            var2 = true;
         } else {
            var2 = false;
         }

         var3.f(var2);
         var1 = new Intent("SyncJournalingService.action.JOURNALING_COMPLETED");
         var1.putExtra("SyncJournalingService.extra.NUM_OF_ENTRIES", 0);
         this.a.a(var1);
      }

   }
}
