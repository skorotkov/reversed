package fi.polar.polarflow.util.a_package;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.MediaSessionManager.OnActiveSessionsChangedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f {
   private final MediaSessionManager a;

   public f(Context var1) {
      this.a = (MediaSessionManager)var1.getSystemService("media_session");
   }

   public static List a(List var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.add(new a((MediaController)var2.next()));
      }

      return var1;
   }

   public List a(ComponentName var1) {
      return a(this.a.getActiveSessions(var1));
   }

   public void a(OnActiveSessionsChangedListener var1) {
      this.a.removeOnActiveSessionsChangedListener(var1);
   }

   public void a(OnActiveSessionsChangedListener var1, ComponentName var2) {
      this.a.addOnActiveSessionsChangedListener(var1, var2);
   }
}
