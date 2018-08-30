package android.support.wearable.complications;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

@TargetApi(24)
public class r {
   private final Context a;
   private final ComponentName b;

   public r(Context var1, ComponentName var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("Context cannot be null");
      } else if (var2 == null) {
         throw new IllegalArgumentException("ProviderComponent cannot be null");
      } else {
         this.a = var1;
         this.b = var2;
      }
   }

   public void a() {
      Intent var1 = new Intent("android.support.wearable.complications.ACTION_REQUEST_UPDATE_ALL");
      var1.setPackage("com.google.android.wearable.app");
      var1.putExtra("android.support.wearable.complications.EXTRA_PROVIDER_COMPONENT", this.b);
      var1.putExtra("android.support.wearable.complications.EXTRA_PENDING_INTENT", PendingIntent.getActivity(this.a, 0, new Intent(""), 0));
      this.a.sendBroadcast(var1);
   }

   public void a(int... var1) {
      Intent var2 = new Intent("android.support.wearable.complications.ACTION_REQUEST_UPDATE");
      var2.setPackage("com.google.android.wearable.app");
      var2.putExtra("android.support.wearable.complications.EXTRA_PROVIDER_COMPONENT", this.b);
      var2.putExtra("android.support.wearable.complications.EXTRA_COMPLICATION_IDS", var1);
      var2.putExtra("android.support.wearable.complications.EXTRA_PENDING_INTENT", PendingIntent.getActivity(this.a, 0, new Intent(""), 0));
      this.a.sendBroadcast(var2);
   }
}
