package android.support.v7.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Color;
import android.support.v7.a.k;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class a {
   private static int a(int var0, float var1) {
      return android.support.v4.d.a.b(var0, Math.round((float)Color.alpha(var0) * var1));
   }

   public static ColorStateList a(Resources var0, XmlPullParser var1, Theme var2) {
      AttributeSet var3 = Xml.asAttributeSet(var1);

      int var4;
      do {
         var4 = var1.next();
      } while(var4 != 2 && var4 != 1);

      if (var4 != 2) {
         throw new XmlPullParserException("No start tag found");
      } else {
         return a(var0, var1, var3, var2);
      }
   }

   private static ColorStateList a(Resources var0, XmlPullParser var1, AttributeSet var2, Theme var3) {
      String var4 = var1.getName();
      if (!var4.equals("selector")) {
         throw new XmlPullParserException(var1.getPositionDescription() + ": invalid color state list tag " + var4);
      } else {
         return b(var0, var1, var2, var3);
      }
   }

   private static TypedArray a(Resources var0, Theme var1, AttributeSet var2, int[] var3) {
      TypedArray var4;
      if (var1 == null) {
         var4 = var0.obtainAttributes(var2, var3);
      } else {
         var4 = var1.obtainStyledAttributes(var2, var3, 0, 0);
      }

      return var4;
   }

   private static ColorStateList b(Resources var0, XmlPullParser var1, AttributeSet var2, Theme var3) {
      int var4 = var1.getDepth() + 1;
      int[][] var5 = new int[20][];
      int[] var6 = new int[var5.length];
      int var7 = 0;

      while(true) {
         int var8 = var1.next();
         if (var8 == 1) {
            break;
         }

         int var9 = var1.getDepth();
         if (var9 < var4 && var8 == 3) {
            break;
         }

         if (var8 == 2 && var9 <= var4 && var1.getName().equals("item")) {
            TypedArray var10 = a(var0, var3, var2, k.ColorStateListItem);
            int var11 = var10.getColor(k.ColorStateListItem_android_color, -65281);
            float var12 = 1.0F;
            if (var10.hasValue(k.ColorStateListItem_android_alpha)) {
               var12 = var10.getFloat(k.ColorStateListItem_android_alpha, 1.0F);
            } else if (var10.hasValue(k.ColorStateListItem_alpha)) {
               var12 = var10.getFloat(k.ColorStateListItem_alpha, 1.0F);
            }

            var10.recycle();
            var8 = 0;
            int var13 = var2.getAttributeCount();
            int[] var17 = new int[var13];

            for(var9 = 0; var9 < var13; ++var9) {
               int var14 = var2.getAttributeNameResource(var9);
               if (var14 != 16843173 && var14 != 16843551 && var14 != android.support.v7.a.b.alpha) {
                  if (!var2.getAttributeBooleanValue(var9, false)) {
                     var14 = -var14;
                  }

                  var17[var8] = var14;
                  ++var8;
               }
            }

            var17 = StateSet.trimStateSet(var17, var8);
            var8 = a(var11, var12);
            if (var7 != 0 && var17.length == 0) {
            }

            var6 = d.a(var6, var7, var8);
            var5 = (int[][])d.a(var5, var7, var17);
            ++var7;
         }
      }

      int[] var16 = new int[var7];
      int[][] var15 = new int[var7][];
      System.arraycopy(var6, 0, var16, 0, var7);
      System.arraycopy(var5, 0, var15, 0, var7);
      return new ColorStateList(var15, var16);
   }
}
