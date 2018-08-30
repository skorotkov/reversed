package fi.polar.polarflow.util;

import fi.polar.polarflow.data.OnPublishedListener;

class p implements OnPublishedListener {
   // $FF: synthetic field
   final o a;

   p(o var1) {
      this.a = var1;
   }

   public void onPublished(boolean var1) {
      o.a(this.a).countDown();
   }
}
