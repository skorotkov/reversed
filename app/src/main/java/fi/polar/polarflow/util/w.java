package fi.polar.polarflow.util;

import android.content.Context;
import fi.polar.polarflow.data.OnPublishedListener;
import fi.polar.polarflow.data.orm.PendingSyncInfoPath;
import fi.polar.polarflow.data.orm.SyncInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class w {
   public static SyncInfo a() {
      List var0 = SyncInfo.listAll(SyncInfo.class);
      SyncInfo var1;
      if (var0.size() == 0) {
         var1 = new SyncInfo();
         var1.setLastModified(new Date(System.currentTimeMillis()));
         var1.setLastModifiedTrusted(true);
         var1.setFullSyncRequired(false);
         var1.save();
      } else {
         var1 = (SyncInfo)var0.get(0);
      }

      return var1;
   }

   public static fi.polar.polarflow.service.datalayer.s a(String var0) {
      synchronized(w.class){}

      fi.polar.polarflow.service.datalayer.s var4;
      try {
         SyncInfo var3 = c(var0);
         var3.save();
         var4 = var3.createDataLayerRequest();
      } finally {
         ;
      }

      return var4;
   }

   public static fi.polar.polarflow.service.datalayer.s a(List var0) {
      synchronized(w.class){}

      fi.polar.polarflow.service.datalayer.s var4;
      try {
         SyncInfo var3 = c(var0);
         var3.save();
         var4 = var3.createDataLayerRequest();
      } finally {
         ;
      }

      return var4;
   }

   public static void a(Context var0, String var1) {
      synchronized(w.class){}

      try {
         SyncInfo var4 = c(var1);
         var4.save();
         var4.publish(var0);
      } finally {
         ;
      }

   }

   public static void a(Context var0, List var1, OnPublishedListener var2) {
      synchronized(w.class){}

      try {
         SyncInfo var5 = c(var1);
         var5.save();
         var5.publish(var0, var2);
      } finally {
         ;
      }

   }

   private static void a(Set var0) {
      Iterator var1 = var0.iterator();

      while(var1.hasNext()) {
         (new PendingSyncInfoPath((String)var1.next())).save();
      }

   }

   public static boolean a(Context var0) {
      return a(var0, (OnPublishedListener)null);
   }

   public static boolean a(Context var0, OnPublishedListener var1) {
      String var2 = fi.polar.polarflow.service.datalayer.v.a();
      List var3 = PendingSyncInfoPath.find(PendingSyncInfoPath.class, "CHANGED_PATH != ?", new String[]{var2});
      boolean var5;
      if (!var3.isEmpty()) {
         ArrayList var4 = new ArrayList();
         Iterator var6 = var3.iterator();

         while(var6.hasNext()) {
            var4.add(((PendingSyncInfoPath)var6.next()).getChangedPath());
         }

         a(var0, var4, var1);
         PendingSyncInfoPath.deleteAll(PendingSyncInfoPath.class, "CHANGED_PATH != ?", new String[]{var2});
         var5 = true;
      } else {
         var5 = false;
      }

      return var5;
   }

   private static boolean a(SyncInfo var0) {
      boolean var1;
      if (var0.getLastSynchronized() != null && !var0.getLastSynchronized().before(var0.getLastModified())) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public static fi.polar.polarflow.service.datalayer.s b(List param0) {
      // $FF: Couldn't be decompiled
   }

   private static String b(String var0) {
      String var1 = var0;
      if (var0.matches("/U/0/[0-9]{8}/\\S+")) {
         var1 = var0.substring(0, 13);
      }

      return var1;
   }

   public static boolean b() {
      SyncInfo var0 = a();
      boolean var1;
      if (var0.getLastSynchronized() == null) {
         var1 = true;
      } else if (!var0.isFullSyncRequired() && var0.getChangedPathsList().isEmpty()) {
         var1 = false;
      } else {
         var1 = a(var0);
      }

      return var1;
   }

   private static SyncInfo c(String var0) {
      return c(Collections.singletonList(var0));
   }

   private static SyncInfo c(List var0) {
      SyncInfo var1 = a();
      Iterator var4 = var0.iterator();

      while(var4.hasNext()) {
         String var2 = (String)var4.next();
         if (!var1.isFullSyncRequired()) {
            ArrayList var3 = new ArrayList();
            var2 = b(var2);
            var3.addAll(var1.getChangedPathsList());
            if (!var3.contains(var2)) {
               var3.add(var2);
               if (var3.size() > 20) {
                  var1.setChangedPathsList((List)null);
                  var1.setFullSyncRequired(true);
               } else {
                  var1.setChangedPathsList(var3);
               }
            }
         }
      }

      var1.setLastModified(new Date());
      var1.setLastModifiedTrusted(true);
      return var1;
   }

   private static boolean d(String var0) {
      boolean var1;
      if (!var0.startsWith(fi.polar.polarflow.service.datalayer.v.a()) || !var0.matches("/U/0/[0-9]{8}/ACT/.*") && !var0.matches("/U/0/[0-9]{8}/DSUM/.*")) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }
}
