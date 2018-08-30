package fi.polar.polarflow.service.datalayer;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;

public class v {
   private static final String a = v.class.getSimpleName();
   private static NodeApi b;

   static {
      b = Wearable.NodeApi;
   }

   private v() {
   }

   public static Uri a(String var0, String var1) {
      return (new Builder()).scheme("wear").authority(var0).path(var1).build();
   }

   public static String a() {
      return a(new LocalDate());
   }

   public static String a(GoogleApiClient var0) {
      GetLocalNodeResult var2 = (GetLocalNodeResult)b.getLocalNode(var0).await(10000L, TimeUnit.MILLISECONDS);
      Status var1 = var2.getStatus();
      String var4;
      if (var1.isSuccess()) {
         Node var3 = var2.getNode();
         if (var3 != null && !TextUtils.isEmpty(var3.getId())) {
            var4 = var3.getId();
         } else {
            var4 = "unknown";
         }
      } else {
         fi.polar.polarflow.util.d.b(a, "Cannot get localNodeID(status=" + var1 + ")");
         var4 = "unknown";
      }

      fi.polar.polarflow.util.d.c(a, "getLocalNodeId(id=" + var4 + ")");
      return var4;
   }

   public static String a(String var0) {
      int var1 = var0.lastIndexOf(47);
      String var2 = var0;
      if (var1 >= 0) {
         var2 = var0;
         if (var1 < var0.length() - 1) {
            var2 = var0.substring(0, var1 + 1);
         }
      }

      return var2;
   }

   public static String a(LocalDate var0) {
      return "/U/0/" + var0.toString(ISODateTimeFormat.basicDate());
   }

   public static byte[] a(long var0, byte[] var2) {
      int var3;
      if (var2 != null) {
         var3 = var2.length;
      } else {
         var3 = 0;
      }

      ByteBuffer var4 = ByteBuffer.allocate(var3 + 8);
      var4.putLong(var0);
      if (var2 != null) {
         var4.put(var2);
      }

      return var4.array();
   }

   public static byte[] a(boolean var0) {
      byte var1 = 1;
      byte var2;
      if (var0) {
         var2 = var1;
      } else {
         var1 = 0;
         var2 = var1;
      }

      return new byte[]{var2};
   }

   public static String b(String var0) {
      int var1 = var0.lastIndexOf(47);
      String var2 = var0;
      if (var1 >= 0) {
         var2 = var0.substring(var1 + 1);
      }

      return var2;
   }

   public static String c(String var0) {
      int var1 = var0.lastIndexOf(46);
      String var2 = var0;
      if (var1 >= 0) {
         var2 = var0.substring(0, var1);
      }

      return var2;
   }

   public static String d(String var0) {
      String[] var1 = var0.split(String.valueOf('/'));
      StringBuilder var2 = new StringBuilder();
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         var0 = var1[var4];
         var2.append(var0).append('/');
         if (var0.matches("[0-9]{6}")) {
            break;
         }
      }

      return var2.toString();
   }

   public static String e(String var0) {
      return var0.replaceFirst("^/read", "").replaceFirst("^/write", "").replaceFirst("^/delete", "").replaceFirst("^/list", "");
   }
}
