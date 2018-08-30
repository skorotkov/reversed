package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(16)
class cx {
   private static final Object a = new Object();
   private static Field b;
   private static boolean c;
   private static final Object d = new Object();

   public static Bundle a(Builder var0, cs var1) {
      var0.addAction(var1.a(), var1.b(), var1.c());
      Bundle var2 = new Bundle(var1.d());
      if (var1.g() != null) {
         var2.putParcelableArray("android.support.remoteInputs", dm.a(var1.g()));
      }

      var2.putBoolean("android.support.allowGeneratedReplies", var1.e());
      return var2;
   }

   public static Bundle a(Notification param0) {
      // $FF: Couldn't be decompiled
   }

   public static SparseArray a(List var0) {
      SparseArray var1 = null;
      int var2 = var0.size();

      SparseArray var5;
      for(int var3 = 0; var3 < var2; var1 = var5) {
         Bundle var4 = (Bundle)var0.get(var3);
         var5 = var1;
         if (var4 != null) {
            var5 = var1;
            if (var1 == null) {
               var5 = new SparseArray();
            }

            var5.put(var3, var4);
         }

         ++var3;
      }

      return var1;
   }

   public static void a(bq var0, CharSequence var1, boolean var2, CharSequence var3, Bitmap var4, Bitmap var5, boolean var6) {
      BigPictureStyle var7 = (new BigPictureStyle(var0.a())).setBigContentTitle(var1).bigPicture(var4);
      if (var6) {
         var7.bigLargeIcon(var5);
      }

      if (var2) {
         var7.setSummaryText(var3);
      }

   }

   public static void a(bq var0, CharSequence var1, boolean var2, CharSequence var3, CharSequence var4) {
      BigTextStyle var5 = (new BigTextStyle(var0.a())).setBigContentTitle(var1).bigText(var4);
      if (var2) {
         var5.setSummaryText(var3);
      }

   }

   public static void a(bq var0, CharSequence var1, boolean var2, CharSequence var3, ArrayList var4) {
      InboxStyle var5 = (new InboxStyle(var0.a())).setBigContentTitle(var1);
      if (var2) {
         var5.setSummaryText(var3);
      }

      Iterator var6 = var4.iterator();

      while(var6.hasNext()) {
         var5.addLine((CharSequence)var6.next());
      }

   }
}
