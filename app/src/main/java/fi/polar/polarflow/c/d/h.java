package fi.polar.polarflow.c.d;

import android.location.OnNmeaMessageListener;
import java.lang.ref.WeakReference;

class h implements OnNmeaMessageListener {
   private final WeakReference a;

   h(b var1) {
      this.a = new WeakReference(var1);
   }

   public void onNmeaMessage(String var1, long var2) {
      b var4 = (b)this.a.get();
      if (var4 != null && b.r(var4) && b.b(var4)) {
         i.a(b.f(var4), var1);
      }

   }
}
