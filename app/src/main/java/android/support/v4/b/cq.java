package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.app.Notification.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

public class cq implements bp, bq {
   private Builder a;

   public cq(Context var1, Notification var2, CharSequence var3, CharSequence var4, CharSequence var5, RemoteViews var6, int var7, PendingIntent var8, PendingIntent var9, Bitmap var10, int var11, int var12, boolean var13, boolean var14, boolean var15, int var16, CharSequence var17, boolean var18, String var19, ArrayList var20, Bundle var21, int var22, int var23, Notification var24, String var25, boolean var26, String var27, CharSequence[] var28, RemoteViews var29, RemoteViews var30, RemoteViews var31) {
      Builder var32 = (new Builder(var1)).setWhen(var2.when).setShowWhen(var14).setSmallIcon(var2.icon, var2.iconLevel).setContent(var2.contentView).setTicker(var2.tickerText, var6).setSound(var2.sound, var2.audioStreamType).setVibrate(var2.vibrate).setLights(var2.ledARGB, var2.ledOnMS, var2.ledOffMS);
      if ((var2.flags & 2) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var32 = var32.setOngoing(var14);
      if ((var2.flags & 8) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var32 = var32.setOnlyAlertOnce(var14);
      if ((var2.flags & 16) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var32 = var32.setAutoCancel(var14).setDefaults(var2.defaults).setContentTitle(var3).setContentText(var4).setSubText(var17).setContentInfo(var5).setContentIntent(var8).setDeleteIntent(var2.deleteIntent);
      if ((var2.flags & 128) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      this.a = var32.setFullScreenIntent(var9, var14).setLargeIcon(var10).setNumber(var7).setUsesChronometer(var15).setPriority(var16).setProgress(var11, var12, var13).setLocalOnly(var18).setExtras(var21).setGroup(var25).setGroupSummary(var26).setSortKey(var27).setCategory(var19).setColor(var22).setVisibility(var23).setPublicVersion(var24).setRemoteInputHistory(var28);
      if (var29 != null) {
         this.a.setCustomContentView(var29);
      }

      if (var30 != null) {
         this.a.setCustomBigContentView(var30);
      }

      if (var31 != null) {
         this.a.setCustomHeadsUpContentView(var31);
      }

      Iterator var33 = var20.iterator();

      while(var33.hasNext()) {
         String var34 = (String)var33.next();
         this.a.addPerson(var34);
      }

   }

   public Builder a() {
      return this.a;
   }

   public void a(cs var1) {
      android.app.Notification.Action.Builder var2 = new android.app.Notification.Action.Builder(var1.a(), var1.b(), var1.c());
      if (var1.g() != null) {
         RemoteInput[] var3 = di.a(var1.g());
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            var2.addRemoteInput(var3[var5]);
         }
      }

      Bundle var6;
      if (var1.d() != null) {
         var6 = new Bundle(var1.d());
      } else {
         var6 = new Bundle();
      }

      var6.putBoolean("android.support.allowGeneratedReplies", var1.e());
      var2.addExtras(var6);
      var2.setAllowGeneratedReplies(var1.e());
      this.a.addAction(var2.build());
   }

   public Notification b() {
      return this.a.build();
   }
}
