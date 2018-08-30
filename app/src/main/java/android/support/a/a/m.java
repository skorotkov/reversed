package android.support.a.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class m extends p {
   public m() {
   }

   public m(m var1) {
      super(var1);
   }

   private void a(TypedArray var1) {
      String var2 = var1.getString(0);
      if (var2 != null) {
         this.n = var2;
      }

      String var3 = var1.getString(1);
      if (var3 != null) {
         this.m = g.a(var3);
      }

   }

   public void a(Resources var1, AttributeSet var2, Theme var3, XmlPullParser var4) {
      if (j.a(var4, "pathData")) {
         TypedArray var5 = k.a(var1, var3, var2, a.d);
         this.a(var5);
         var5.recycle();
      }

   }

   public boolean a() {
      return true;
   }
}
