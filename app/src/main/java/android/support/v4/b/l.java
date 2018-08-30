package android.support.v4.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

@TargetApi(9)
abstract class l extends dp {
   boolean a;

   static void b(int var0) {
      if ((-65536 & var0) != 0) {
         throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
      }
   }

   abstract View a(View var1, String var2, Context var3, AttributeSet var4);

   protected void onCreate(Bundle var1) {
      if (VERSION.SDK_INT < 11 && this.getLayoutInflater().getFactory() == null) {
         this.getLayoutInflater().setFactory(this);
      }

      super.onCreate(var1);
   }

   public View onCreateView(String var1, Context var2, AttributeSet var3) {
      View var4 = this.a((View)null, var1, var2, var3);
      View var5 = var4;
      if (var4 == null) {
         var5 = super.onCreateView(var1, var2, var3);
      }

      return var5;
   }

   public void startIntentSenderForResult(IntentSender var1, int var2, Intent var3, int var4, int var5, int var6) {
      if (!this.a && var2 != -1) {
         b(var2);
      }

      super.startIntentSenderForResult(var1, var2, var3, var4, var5, var6);
   }
}
