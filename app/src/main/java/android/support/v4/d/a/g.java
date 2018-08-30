package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class g extends f {
   public void a(Drawable var1, float var2, float var3) {
      l.a(var1, var2, var3);
   }

   public void a(Drawable var1, int var2) {
      l.a(var1, var2);
   }

   public void a(Drawable var1, int var2, int var3, int var4, int var5) {
      l.a(var1, var2, var3, var4, var5);
   }

   public void a(Drawable var1, ColorStateList var2) {
      l.a(var1, var2);
   }

   public void a(Drawable var1, Theme var2) {
      l.a(var1, var2);
   }

   public void a(Drawable var1, Resources var2, XmlPullParser var3, AttributeSet var4, Theme var5) {
      l.a(var1, var2, var3, var4, var5);
   }

   public void a(Drawable var1, Mode var2) {
      l.a(var1, var2);
   }

   public Drawable c(Drawable var1) {
      return l.a(var1);
   }

   public boolean e(Drawable var1) {
      return l.b(var1);
   }

   public ColorFilter f(Drawable var1) {
      return l.c(var1);
   }
}
