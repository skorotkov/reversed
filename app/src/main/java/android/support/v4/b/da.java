package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Notification.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

public class da implements bp, bq {
   private Builder a;
   private Bundle b;
   private List c = new ArrayList();
   private RemoteViews d;
   private RemoteViews e;

   public da(Context var1, Notification var2, CharSequence var3, CharSequence var4, CharSequence var5, RemoteViews var6, int var7, PendingIntent var8, PendingIntent var9, Bitmap var10, int var11, int var12, boolean var13, boolean var14, boolean var15, int var16, CharSequence var17, boolean var18, ArrayList var19, Bundle var20, String var21, boolean var22, String var23, RemoteViews var24, RemoteViews var25) {
      Builder var26 = (new Builder(var1)).setWhen(var2.when).setShowWhen(var14).setSmallIcon(var2.icon, var2.iconLevel).setContent(var2.contentView).setTicker(var2.tickerText, var6).setSound(var2.sound, var2.audioStreamType).setVibrate(var2.vibrate).setLights(var2.ledARGB, var2.ledOnMS, var2.ledOffMS);
      if ((var2.flags & 2) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var26 = var26.setOngoing(var14);
      if ((var2.flags & 8) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var26 = var26.setOnlyAlertOnce(var14);
      if ((var2.flags & 16) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var26 = var26.setAutoCancel(var14).setDefaults(var2.defaults).setContentTitle(var3).setContentText(var4).setSubText(var17).setContentInfo(var5).setContentIntent(var8).setDeleteIntent(var2.deleteIntent);
      if ((var2.flags & 128) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      this.a = var26.setFullScreenIntent(var9, var14).setLargeIcon(var10).setNumber(var7).setUsesChronometer(var15).setPriority(var16).setProgress(var11, var12, var13);
      this.b = new Bundle();
      if (var20 != null) {
         this.b.putAll(var20);
      }

      if (var19 != null && !var19.isEmpty()) {
         this.b.putStringArray("android.people", (String[])var19.toArray(new String[var19.size()]));
      }

      if (var18) {
         this.b.putBoolean("android.support.localOnly", true);
      }

      if (var21 != null) {
         this.b.putString("android.support.groupKey", var21);
         if (var22) {
            this.b.putBoolean("android.support.isGroupSummary", true);
         } else {
            this.b.putBoolean("android.support.useSideChannel", true);
         }
      }

      if (var23 != null) {
         this.b.putString("android.support.sortKey", var23);
      }

      this.d = var24;
      this.e = var25;
   }

   public Builder a() {
      return this.a;
   }

   public void a(cs var1) {
      this.c.add(cx.a(this.a, var1));
   }

   public Notification b() {
      SparseArray var1 = cx.a(this.c);
      if (var1 != null) {
         this.b.putSparseParcelableArray("android.support.actionExtras", var1);
      }

      this.a.setExtras(this.b);
      Notification var2 = this.a.build();
      if (this.d != null) {
         var2.contentView = this.d;
      }

      if (this.e != null) {
         var2.bigContentView = this.e;
      }

      return var2;
   }
}
