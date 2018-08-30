package android.support.v4.b;

import android.view.View;
import java.util.ArrayList;

final class bf implements Runnable {
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final ArrayList b;
   // $FF: synthetic field
   final ArrayList c;
   // $FF: synthetic field
   final ArrayList d;
   // $FF: synthetic field
   final ArrayList e;

   bf(int var1, ArrayList var2, ArrayList var3, ArrayList var4, ArrayList var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void run() {
      for(int var1 = 0; var1 < this.a; ++var1) {
         ((View)this.b.get(var1)).setTransitionName((String)this.c.get(var1));
         ((View)this.d.get(var1)).setTransitionName((String)this.e.get(var1));
      }

   }
}
