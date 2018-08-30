package android.support.wearable.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.g;
import android.support.wearable.view.o;
import android.support.wearable.view.r;
import android.util.SparseIntArray;

@TargetApi(21)
public class ConfirmationActivity extends Activity implements r {
   private static final SparseIntArray a = new SparseIntArray();

   static {
      a.append(1, 0);
      a.append(2, 2);
      a.append(3, 1);
   }

   public void a() {
      this.finish();
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setTheme(g.ConfirmationActivity);
      Intent var3 = this.getIntent();
      int var2 = var3.getIntExtra("android.support.wearable.activity.extra.ANIMATION_TYPE", 1);
      if (a.indexOfKey(var2) < 0) {
         throw new IllegalArgumentException((new StringBuilder(38)).append("Unknown type of animation: ").append(var2).toString());
      } else {
         var2 = a.get(var2);
         String var4 = var3.getStringExtra("android.support.wearable.activity.extra.MESSAGE");
         (new o()).a(var2).a(var4).a((r)this).a((Activity)this);
      }
   }
}
