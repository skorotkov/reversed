package com.orm.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MultiDexHelper {
   private static final String EXTRACTED_NAME_EXT = ".classes";
   private static final String EXTRACTED_SUFFIX = ".zip";
   private static final String KEY_DEX_NUMBER = "dex.number";
   private static final String PREFS_FILE = "multidex.version";
   private static final String SECONDARY_FOLDER_NAME;

   static {
      SECONDARY_FOLDER_NAME = "code_cache" + File.separator + "secondary-dexes";
   }

   public static List getAllClasses(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static SharedPreferences getMultiDexPreferences(Context var0) {
      byte var1;
      if (VERSION.SDK_INT < 11) {
         var1 = 0;
      } else {
         var1 = 4;
      }

      return var0.getSharedPreferences("multidex.version", var1);
   }

   public static List getSourcePaths(Context var0) {
      ApplicationInfo var1 = var0.getPackageManager().getApplicationInfo(var0.getPackageName(), 0);
      File var2 = new File(var1.sourceDir);
      File var3 = new File(var1.dataDir, SECONDARY_FOLDER_NAME);
      ArrayList var4 = new ArrayList();
      var4.add(var1.sourceDir);
      String var8 = var2.getName() + ".classes";
      int var5 = getMultiDexPreferences(var0).getInt("dex.number", 1);

      for(int var6 = 2; var6 <= var5; ++var6) {
         File var7 = new File(var3, var8 + var6 + ".zip");
         if (var7.isFile()) {
            var4.add(var7.getAbsolutePath());
         }
      }

      return var4;
   }
}
