package fi.polar.polarflow.ui.myday;

import android.view.View;
import android.view.View.OnClickListener;
import fi.polar.polarflow.data.orm.UserId;
import java.nio.ByteBuffer;

class m implements OnClickListener {
   // $FF: synthetic field
   final l a;

   m(l var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      UserId var2 = UserId.getUserId();
      if (fi.polar.polarflow.ftu.o.c() && var2 != null) {
         fi.polar.polarflow.ui.myday.item.c var3 = ((MyDayGridPagerActivity)this.a.getActivity()).a();
         if (var3 != null) {
            byte[] var5;
            if (var3 instanceof fi.polar.polarflow.ui.myday.item.j || var3 instanceof fi.polar.polarflow.ui.myday.item.e) {
               var5 = fi.polar.polarflow.service.datalayer.v.a(var2.getMasterIdentifier(), ByteBuffer.allocate(8).putLong(var3.f()).array());
               l.a(this.a, var5);
               l.a(this.a);
               return;
            }

            if (var3 instanceof fi.polar.polarflow.ui.myday.item.g || var3 instanceof fi.polar.polarflow.ui.myday.item.sleeprating.a) {
               String var4;
               if (var3 instanceof fi.polar.polarflow.ui.myday.item.g) {
                  var4 = ((fi.polar.polarflow.ui.myday.item.g)var3).j();
               } else {
                  var4 = ((fi.polar.polarflow.ui.myday.item.sleeprating.a)var3).e();
               }

               var5 = fi.polar.polarflow.service.datalayer.v.a(var2.getMasterIdentifier(), var4.getBytes());
               l.b(this.a, var5);
               l.a(this.a);
               return;
            }
         }

         l.a(this.a, fi.polar.polarflow.service.datalayer.v.a(var2.getMasterIdentifier(), (byte[])null));
         l.a(this.a);
      }

   }
}
