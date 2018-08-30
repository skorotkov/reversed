package android.support.v4.b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class bz extends ck {
   CharSequence a;
   CharSequence b;
   List c = new ArrayList();

   bz() {
   }

   public void a(Bundle var1) {
      super.a(var1);
      if (this.a != null) {
         var1.putCharSequence("android.selfDisplayName", this.a);
      }

      if (this.b != null) {
         var1.putCharSequence("android.conversationTitle", this.b);
      }

      if (!this.c.isEmpty()) {
         var1.putParcelableArray("android.messages", ca.a(this.c));
      }

   }
}
