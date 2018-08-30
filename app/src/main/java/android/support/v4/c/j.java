package android.support.v4.c;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

class j {
   final IntentFilter a;
   final BroadcastReceiver b;
   boolean c;

   j(IntentFilter var1, BroadcastReceiver var2) {
      this.a = var1;
      this.b = var2;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("Receiver{");
      var1.append(this.b);
      var1.append(" filter=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }
}
