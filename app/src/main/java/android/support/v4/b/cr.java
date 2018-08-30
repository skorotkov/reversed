package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(9)
public class cr {
   private static Method a;

   public static Notification a(Notification var0, Context var1, CharSequence var2, CharSequence var3, PendingIntent var4, PendingIntent var5) {
      if (a == null) {
         try {
            a = Notification.class.getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class);
         } catch (NoSuchMethodException var6) {
            throw new RuntimeException(var6);
         }
      }

      label19: {
         Object var9;
         try {
            a.invoke(var0, var1, var2, var3, var4);
            break label19;
         } catch (IllegalAccessException var7) {
            var9 = var7;
         } catch (InvocationTargetException var8) {
            var9 = var8;
         }

         throw new RuntimeException((Throwable)var9);
      }

      var0.fullScreenIntent = var5;
      return var0;
   }
}
