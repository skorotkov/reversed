package fi.polar.polarflow.ui.exeview.laps;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import fi.polar.polarflow.service.v;

class b implements ServiceConnection {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public void onServiceConnected(ComponentName var1, IBinder var2) {
      fi.polar.polarflow.util.d.c("AbstractLapFragment", "onServiceConnected: TrainingService");
      this.a.f = ((v)var2).a();
      this.a.j();
   }

   public void onServiceDisconnected(ComponentName var1) {
      fi.polar.polarflow.util.d.c("AbstractLapFragment", "onServiceDisconnected: " + var1.getClassName());
      this.a.f = null;
   }
}
