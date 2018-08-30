package fi.polar.polarflow.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Align;

public class e {
   public static Bitmap a(Context var0, int var1, float var2, int var3) {
      Paint var4 = new Paint();
      var4.setTextSize(var2);
      var4.setColor(var3);
      var4.setTextAlign(Align.LEFT);
      var4.setAntiAlias(true);
      var4.setTypeface(fi.polar.polarflow.ui.custom.s.a(var0.getApplicationContext()));
      String var6 = var0.getApplicationContext().getResources().getString(var1);
      var2 = -var4.ascent();
      Bitmap var5 = Bitmap.createBitmap((int)(var4.measureText(var6) + 0.5F), (int)(var4.descent() + var2 + 0.5F), Config.ARGB_8888);
      (new Canvas(var5)).drawText(var6, 0.0F, var2, var4);
      return var5;
   }

   static Bitmap a(Context var0, String var1, float var2, int var3, float var4, float var5) {
      Paint var6 = new Paint(1);
      var6.setTextSize(var2);
      var6.setColor(var3);
      var6.setTextAlign(Align.LEFT);
      var6.setTypeface(fi.polar.polarflow.ui.custom.s.a(var0));
      var2 = -var6.ascent();
      Bitmap var7 = Bitmap.createBitmap((int)(var6.measureText(var1) + var5), (int)(var6.descent() + var2 + var4), Config.ARGB_8888);
      (new Canvas(var7)).drawText(var1, var5 / 2.0F, var2 + var4 / 2.0F, var6);
      return var7;
   }
}
