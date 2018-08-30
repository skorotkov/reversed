package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Notification.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

@TargetApi(11)
class cu {
   static Notification a(Context var0, Notification var1, CharSequence var2, CharSequence var3, CharSequence var4, RemoteViews var5, int var6, PendingIntent var7, PendingIntent var8, Bitmap var9) {
      boolean var10 = true;
      Builder var12 = (new Builder(var0)).setWhen(var1.when).setSmallIcon(var1.icon, var1.iconLevel).setContent(var1.contentView).setTicker(var1.tickerText, var5).setSound(var1.sound, var1.audioStreamType).setVibrate(var1.vibrate).setLights(var1.ledARGB, var1.ledOnMS, var1.ledOffMS);
      boolean var11;
      if ((var1.flags & 2) != 0) {
         var11 = true;
      } else {
         var11 = false;
      }

      var12 = var12.setOngoing(var11);
      if ((var1.flags & 8) != 0) {
         var11 = true;
      } else {
         var11 = false;
      }

      var12 = var12.setOnlyAlertOnce(var11);
      if ((var1.flags & 16) != 0) {
         var11 = true;
      } else {
         var11 = false;
      }

      var12 = var12.setAutoCancel(var11).setDefaults(var1.defaults).setContentTitle(var2).setContentText(var3).setContentInfo(var4).setContentIntent(var7).setDeleteIntent(var1.deleteIntent);
      if ((var1.flags & 128) != 0) {
         var11 = var10;
      } else {
         var11 = false;
      }

      return var12.setFullScreenIntent(var8, var11).setLargeIcon(var9).setNumber(var6).getNotification();
   }
}
