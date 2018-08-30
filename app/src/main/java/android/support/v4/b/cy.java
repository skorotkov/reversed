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
import java.util.Iterator;
import java.util.List;

public class cy implements bp, bq {
   private Builder a;
   private final Bundle b;
   private List c = new ArrayList();
   private RemoteViews d;
   private RemoteViews e;

   public cy(Context var1, Notification var2, CharSequence var3, CharSequence var4, CharSequence var5, RemoteViews var6, int var7, PendingIntent var8, PendingIntent var9, Bitmap var10, int var11, int var12, boolean var13, boolean var14, int var15, CharSequence var16, boolean var17, Bundle var18, String var19, boolean var20, String var21, RemoteViews var22, RemoteViews var23) {
      Builder var25 = (new Builder(var1)).setWhen(var2.when).setSmallIcon(var2.icon, var2.iconLevel).setContent(var2.contentView).setTicker(var2.tickerText, var6).setSound(var2.sound, var2.audioStreamType).setVibrate(var2.vibrate).setLights(var2.ledARGB, var2.ledOnMS, var2.ledOffMS);
      boolean var24;
      if ((var2.flags & 2) != 0) {
         var24 = true;
      } else {
         var24 = false;
      }

      var25 = var25.setOngoing(var24);
      if ((var2.flags & 8) != 0) {
         var24 = true;
      } else {
         var24 = false;
      }

      var25 = var25.setOnlyAlertOnce(var24);
      if ((var2.flags & 16) != 0) {
         var24 = true;
      } else {
         var24 = false;
      }

      var25 = var25.setAutoCancel(var24).setDefaults(var2.defaults).setContentTitle(var3).setContentText(var4).setSubText(var16).setContentInfo(var5).setContentIntent(var8).setDeleteIntent(var2.deleteIntent);
      if ((var2.flags & 128) != 0) {
         var24 = true;
      } else {
         var24 = false;
      }

      this.a = var25.setFullScreenIntent(var9, var24).setLargeIcon(var10).setNumber(var7).setUsesChronometer(var14).setPriority(var15).setProgress(var11, var12, var13);
      this.b = new Bundle();
      if (var18 != null) {
         this.b.putAll(var18);
      }

      if (var17) {
         this.b.putBoolean("android.support.localOnly", true);
      }

      if (var19 != null) {
         this.b.putString("android.support.groupKey", var19);
         if (var20) {
            this.b.putBoolean("android.support.isGroupSummary", true);
         } else {
            this.b.putBoolean("android.support.useSideChannel", true);
         }
      }

      if (var21 != null) {
         this.b.putString("android.support.sortKey", var21);
      }

      this.d = var22;
      this.e = var23;
   }

   public Builder a() {
      return this.a;
   }

   public void a(cs var1) {
      this.c.add(cx.a(this.a, var1));
   }

   public Notification b() {
      Notification var1 = this.a.build();
      Bundle var2 = cx.a(var1);
      Bundle var3 = new Bundle(this.b);
      Iterator var4 = this.b.keySet().iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if (var2.containsKey(var5)) {
            var3.remove(var5);
         }
      }

      var2.putAll(var3);
      SparseArray var6 = cx.a(this.c);
      if (var6 != null) {
         cx.a(var1).putSparseParcelableArray("android.support.actionExtras", var6);
      }

      if (this.d != null) {
         var1.contentView = this.d;
      }

      if (this.e != null) {
         var1.bigContentView = this.e;
      }

      return var1;
   }
}
