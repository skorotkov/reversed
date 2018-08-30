package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

interface c {
   void a(Drawable var1);

   void a(Drawable var1, float var2, float var3);

   void a(Drawable var1, int var2);

   void a(Drawable var1, int var2, int var3, int var4, int var5);

   void a(Drawable var1, ColorStateList var2);

   void a(Drawable var1, Theme var2);

   void a(Drawable var1, Resources var2, XmlPullParser var3, AttributeSet var4, Theme var5);

   void a(Drawable var1, Mode var2);

   void a(Drawable var1, boolean var2);

   boolean b(Drawable var1);

   Drawable c(Drawable var1);

   int d(Drawable var1);

   boolean e(Drawable var1);

   ColorFilter f(Drawable var1);
}
