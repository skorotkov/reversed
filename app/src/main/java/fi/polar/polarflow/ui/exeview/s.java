package fi.polar.polarflow.ui.exeview;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;

class s implements fi.polar.polarflow.util.a.e {
   // $FF: synthetic field
   final ExeViewActivity a;

   s(ExeViewActivity var1) {
      this.a = var1;
   }

   public void a(MediaMetadata var1) {
      fi.polar.polarflow.ui.exeview.shader.e var2 = (fi.polar.polarflow.ui.exeview.shader.e)ExeViewActivity.x(this.a).b(fi.polar.polarflow.ui.exeview.shader.p.b);
      if (var2 != null) {
         var2.g().a(var1);
      }

   }

   public void a(PlaybackState var1) {
      fi.polar.polarflow.ui.exeview.shader.e var2 = (fi.polar.polarflow.ui.exeview.shader.e)ExeViewActivity.x(this.a).b(fi.polar.polarflow.ui.exeview.shader.p.b);
      if (var2 != null) {
         var2.g().a(var1);
      }

   }

   public void a(fi.polar.polarflow.util.a.a var1) {
      fi.polar.polarflow.util.d.c("ExeViewActivity", "onActiveMediaSessionChanged " + var1);
      ExeViewActivity.w(this.a);
   }
}
