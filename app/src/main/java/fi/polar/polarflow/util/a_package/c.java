package fi.polar.polarflow.util.a_package;

import android.media.session.MediaSessionManager.OnActiveSessionsChangedListener;
import java.util.List;

class c implements OnActiveSessionsChangedListener {
   // $FF: synthetic field
   final b a;

   c(b var1) {
      this.a = var1;
   }

   public void onActiveSessionsChanged(List var1) {
      this.a.a(f.a(var1));
   }
}
