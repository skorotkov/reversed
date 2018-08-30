package fi.polar.polarflow.service.sensorhubsocket;

import android.app.IntentService;
import android.content.Intent;

public class SensorHubDataWriterService extends IntentService {
   private d a;

   public SensorHubDataWriterService() {
      super("SensorHubDataWriterService");
   }

   private void a(long var1, long var3) {
      this.a((new f(var1)).a(var3).a());
   }

   private void a(a var1) {
      fi.polar.polarflow.util.d.c("SensorHubDataWriterService", "sendEventToOhrApp(" + var1 + ")");
      this.a((new f(e.b)).a(var1).a());
   }

   private void a(g var1) {
      this.a((new f(e.a)).a(var1.a).a(var1.e).a());
   }

   private void a(String var1) {
      if (var1 != null) {
         this.a = this.b("/data/physicaldata/physicaldata_socket/socket");
         if (this.a != null) {
            this.a.a(var1, true, false);
         }
      }

   }

   private d b(String var1) {
      if (this.a == null && d.a(this)) {
         this.a = new d(var1);
      }

      return this.a;
   }

   private void b(g var1) {
      this.a((new f(e.b)).b(var1.f).c(var1.g).a());
   }

   protected void onHandleIntent(Intent var1) {
      fi.polar.polarflow.util.d.c("SensorHubDataWriterService", "onHandleIntent(): " + var1.getAction());
      String var2 = var1.getAction();
      byte var3 = -1;
      switch(var2.hashCode()) {
      case -1322178895:
         if (var2.equals("SensorHubDataWriterService.action.SET_SENSOR_PHYSICAL_DATA")) {
            var3 = 0;
         }
         break;
      case -132369775:
         if (var2.equals("SensorHubDataWriterService.action.SENSOR_SPORT_EVENT")) {
            var3 = 1;
         }
         break;
      case -66288931:
         if (var2.equals("SensorHubDataWriterService.action.USB_UNPLUGGED")) {
            var3 = 3;
         }
         break;
      case 421335830:
         if (var2.equals("SensorHubDataWriterService.action.USB_PLUGGED")) {
            var3 = 2;
         }
      }

      switch(var3) {
      case 0:
         g var6 = (g)var1.getParcelableExtra("SensorHubDataWriterService.extra.PHYSICAL_DATA");
         this.a(var6);
         this.b(var6);
         break;
      case 1:
         long var4 = var1.getLongExtra("SensorHubDataWriterService.extra.SPORT_ID", -2L);
         if (var4 == -1L) {
            this.a(e.a, 0L);
         } else if (var4 != -2L) {
            this.a(e.a, var4);
         }
         break;
      case 2:
         this.a(fi.polar.polarflow.service.sensorhubsocket.a.c);
         break;
      case 3:
         this.a(fi.polar.polarflow.service.sensorhubsocket.a.d);
         break;
      default:
         fi.polar.polarflow.util.d.f("SensorHubDataWriterService", "Unknown action: " + var1);
      }

   }
}
