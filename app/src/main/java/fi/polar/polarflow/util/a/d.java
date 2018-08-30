package fi.polar.polarflow.util.a;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.media.session.MediaController.Callback;

class d extends Callback {
   // $FF: synthetic field
   final b a;

   d(b var1) {
      this.a = var1;
   }

   public void onMetadataChanged(MediaMetadata var1) {
      b.a(this.a, var1);
   }

   public void onPlaybackStateChanged(PlaybackState var1) {
      b.a(this.a, var1);
   }
}
