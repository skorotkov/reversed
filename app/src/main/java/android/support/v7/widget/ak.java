package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

@TargetApi(11)
class ak implements am {
   @SuppressLint({"NewApi"})
   public Drawable a(Context var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      android.support.a.a.c var6;
      try {
         var6 = android.support.a.a.c.a(var1, var1.getResources(), var2, var3, var4);
      } catch (Exception var5) {
         Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", var5);
         var6 = null;
      }

      return var6;
   }
}
