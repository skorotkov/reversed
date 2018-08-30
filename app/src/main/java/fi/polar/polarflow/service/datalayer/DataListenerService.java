package fi.polar.polarflow.service.datalayer;

import android.os.SystemClock;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.WearableListenerService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DataListenerService extends WearableListenerService {
   private static final String a = DataListenerService.class.getSimpleName();
   private List b;
   private List c;

   public DataListenerService() {
      fi.polar.polarflow.util.d.c(a, "DataListenerService()");
   }

   private aq a(String var1) {
      Iterator var2 = this.b.iterator();

      aq var4;
      while(true) {
         if (var2.hasNext()) {
            aq var3 = (aq)var2.next();
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

   private void a(Channel var1) {
      l var2 = this.b(var1.getPath());
      if (var2 != null) {
         var2.a(var1);
      } else {
         fi.polar.polarflow.util.d.e(a, "processMessageEvent(): No receiver found: " + var1.getPath());
      }

   }

   private void a(MessageEvent var1) {
      String var2 = var1.getPath();
      aq var3 = this.a(var2);
      if (var3 != null) {
         var3.a(this, var2, var1.getData(), var1.getSourceNodeId());
      } else {
         fi.polar.polarflow.util.d.e(a, "processMessageEvent(): No receiver found: " + var1.getPath());
      }

   }

   private l b(String var1) {
      Iterator var2 = this.c.iterator();

      l var4;
      while(true) {
         if (var2.hasNext()) {
            l var3 = (l)var2.next();
            if (!var1.matches(var3.d())) {
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

   public void onChannelClosed(Channel var1, int var2, int var3) {
      super.onChannelClosed(var1, var2, var3);
      fi.polar.polarflow.util.d.c(a, "onChannelClosed(path=" + var1.getPath() + ", closeReason=" + var2 + ", appSpecificErrorCode=" + var3 + ")");
   }

   public void onChannelOpened(Channel var1) {
      fi.polar.polarflow.util.d.c(a, "onChannelOpened");
      this.a(var1);
      fi.polar.polarflow.util.d.c(a, "returned from onChannelOpened");
   }

   public void onCreate() {
      fi.polar.polarflow.util.d.c(a, "onCreate()");
      SystemClock.uptimeMillis();
      super.onCreate();
      this.b = new CopyOnWriteArrayList();
      this.b.add(new am());
      this.b.add(new z());
      this.b.add(new j());
      this.b.add(new bg());
      this.b.add(new bh());
      this.b.add(new bi());
      this.c = new CopyOnWriteArrayList();
      this.c.add(new bp(this));
      this.c.add(new aw(this));
      this.c.add(new x(this));
      this.c.add(new ap(this));
   }

   public void onDestroy() {
      fi.polar.polarflow.util.d.c(a, "onDestroy()");
      super.onDestroy();
   }

   public void onInputClosed(Channel var1, int var2, int var3) {
      super.onInputClosed(var1, var2, var3);
      fi.polar.polarflow.util.d.c(a, "onInputClosed(path=" + var1.getPath() + ")");
   }

   public void onMessageReceived(MessageEvent var1) {
      fi.polar.polarflow.util.d.c(a, "onMessageReceive() " + var1.getPath());
      this.a(var1);
      fi.polar.polarflow.util.d.c(a, "returned from processMessageEvent");
   }

   public void onOutputClosed(Channel var1, int var2, int var3) {
      super.onOutputClosed(var1, var2, var3);
      fi.polar.polarflow.util.d.c(a, "onOutputClosed(path=" + var1.getPath() + ")");
   }

   public void onPeerConnected(Node var1) {
      fi.polar.polarflow.util.d.c(a, "onPeerConnected(): " + var1.getId() + ": " + var1.getDisplayName());
      fi.polar.polarflow.util.y.c(this);
   }

   public void onPeerDisconnected(Node var1) {
      fi.polar.polarflow.util.d.c(a, "onPeerDisconnected(): " + var1.getId() + ": " + var1.getDisplayName());
      fi.polar.polarflow.util.y.d(this);
   }
}
