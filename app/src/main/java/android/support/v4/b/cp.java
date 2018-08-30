package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.net.Uri;
import java.util.List;

@TargetApi(24)
class cp {
   public static void a(bq var0, CharSequence var1, CharSequence var2, List var3, List var4, List var5, List var6, List var7) {
      MessagingStyle var9 = (new MessagingStyle(var1)).setConversationTitle(var2);

      for(int var8 = 0; var8 < var3.size(); ++var8) {
         Message var10 = new Message((CharSequence)var3.get(var8), (Long)var4.get(var8), (CharSequence)var5.get(var8));
         if (var6.get(var8) != null) {
            var10.setData((String)var6.get(var8), (Uri)var7.get(var8));
         }

         var9.addMessage(var10);
      }

      var9.setBuilder(var0.a());
   }
}
