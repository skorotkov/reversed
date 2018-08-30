package fi.polar.polarflow.data.orm;

import com.google.android.gms.common.api.Status;
import fi.polar.polarflow.data.OnPublishedListener;
import fi.polar.polarflow.service.datalayer.at;
import java.util.List;

class ProtoPublishableEntity$1 implements at {
   // $FF: synthetic field
   final ProtoPublishableEntity this$0;
   // $FF: synthetic field
   final OnPublishedListener val$listener;

   ProtoPublishableEntity$1(ProtoPublishableEntity var1, OnPublishedListener var2) {
      this.this$0 = var1;
      this.val$listener = var2;
   }

   public void onFinished(List var1) {
      OnPublishedListener var2 = this.val$listener;
      boolean var3;
      if (var1.size() > 0 && ((Status)var1.get(0)).isSuccess()) {
         var3 = true;
      } else {
         var3 = false;
      }

      var2.onPublished(var3);
   }
}
