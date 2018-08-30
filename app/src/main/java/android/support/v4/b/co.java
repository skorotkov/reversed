package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Notification.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

public class co implements bp, bq {
   private Builder a;
   private Bundle b;
   private RemoteViews c;
   private RemoteViews d;
   private RemoteViews e;

   public co(Context var1, Notification var2, CharSequence var3, CharSequence var4, CharSequence var5, RemoteViews var6, int var7, PendingIntent var8, PendingIntent var9, Bitmap var10, int var11, int var12, boolean var13, boolean var14, boolean var15, int var16, CharSequence var17, boolean var18, String var19, ArrayList var20, Bundle var21, int var22, int var23, Notification var24, String var25, boolean var26, String var27, RemoteViews var28, RemoteViews var29, RemoteViews var30) {
      Builder var31 = (new Builder(var1)).setWhen(var2.when).setShowWhen(var14).setSmallIcon(var2.icon, var2.iconLevel).setContent(var2.contentView).setTicker(var2.tickerText, var6).setSound(var2.sound, var2.audioStreamType).setVibrate(var2.vibrate).setLights(var2.ledARGB, var2.ledOnMS, var2.ledOffMS);
      if ((var2.flags & 2) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var31 = var31.setOngoing(var14);
      if ((var2.flags & 8) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var31 = var31.setOnlyAlertOnce(var14);
      if ((var2.flags & 16) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      var31 = var31.setAutoCancel(var14).setDefaults(var2.defaults).setContentTitle(var3).setContentText(var4).setSubText(var17).setContentInfo(var5).setContentIntent(var8).setDeleteIntent(var2.deleteIntent);
      if ((var2.flags & 128) != 0) {
         var14 = true;
      } else {
         var14 = false;
      }

      this.a = var31.setFullScreenIntent(var9, var14).setLargeIcon(var10).setNumber(var7).setUsesChronometer(var15).setPriority(var16).setProgress(var11, var12, var13).setLocalOnly(var18).setGroup(var25).setGroupSummary(var26).setSortKey(var27).setCategory(var19).setColor(var22).setVisibility(var23).setPublicVersion(var24);
      this.b = new Bundle();
      if (var21 != null) {
         this.b.putAll(var21);
      }

      Iterator var32 = var20.iterator();

      while(var32.hasNext()) {
         String var33 = (String)var32.next();
         this.a.addPerson(var33);
      }

      this.c = var28;
      this.d = var29;
      this.e = var30;
   }

   public Builder a() {
      return this.a;
   }

   public void a(cs var1) {
      cl.a(this.a, var1);
   }

   public Notification b() {
      this.a.setExtras(this.b);
      Notification var1 = this.a.build();
      if (this.c != null) {
         var1.contentView = this.c;
      }

      if (this.d != null) {
         var1.bigContentView = this.d;
      }

      if (this.e != null) {
         var1.headsUpContentView = this.e;
      }

      return var1;
   }
}
