package fi.polar.polarflow.util.a_package;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.media.session.MediaController.Callback;

public class a {
   private MediaController a;

   public a(MediaController var1) {
      this.a = var1;
   }

   public g a() {
      return new g(this.a.getSessionToken());
   }

   public void a(Callback var1) {
      this.a.registerCallback(var1);
   }

   public MediaMetadata b() {
      return this.a.getMetadata();
   }

   public void b(Callback var1) {
      this.a.unregisterCallback(var1);
   }

   public PlaybackState c() {
      return this.a.getPlaybackState();
   }

   public void d() {
      this.a.getTransportControls().play();
   }

   public void e() {
      this.a.getTransportControls().pause();
   }

   public void f() {
      this.a.getTransportControls().skipToPrevious();
   }

   public void g() {
      this.a.getTransportControls().skipToNext();
   }
}
