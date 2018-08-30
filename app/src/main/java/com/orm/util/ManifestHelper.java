package com.orm.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

public class ManifestHelper {
   public static final String DATABASE_DEFAULT_NAME = "Sugar.db";
   public static final String METADATA_DATABASE = "DATABASE";
   public static final String METADATA_DOMAIN_PACKAGE_NAME = "DOMAIN_PACKAGE_NAME";
   public static final String METADATA_QUERY_LOG = "QUERY_LOG";
   public static final String METADATA_VERSION = "VERSION";

   public static String getDatabaseName(Context var0) {
      String var1 = getMetaDataString(var0, "DATABASE");
      String var2 = var1;
      if (var1 == null) {
         var2 = "Sugar.db";
      }

      return var2;
   }

   public static int getDatabaseVersion(Context var0) {
      Integer var1 = getMetaDataInteger(var0, "VERSION");
      Integer var2;
      if (var1 != null) {
         var2 = var1;
         if (var1 != 0) {
            return var2;
         }
      }

      var2 = 1;
      return var2;
   }

   public static boolean getDebugEnabled(Context var0) {
      return getMetaDataBoolean(var0, "QUERY_LOG");
   }

   public static String getDomainPackageName(Context var0) {
      String var1 = getMetaDataString(var0, "DOMAIN_PACKAGE_NAME");
      String var2 = var1;
      if (var1 == null) {
         var2 = "";
      }

      return var2;
   }

   private static Boolean getMetaDataBoolean(Context var0, String var1) {
      Boolean var2 = false;
      PackageManager var3 = var0.getPackageManager();

      boolean var4;
      Boolean var6;
      try {
         var4 = var3.getApplicationInfo(var0.getPackageName(), 128).metaData.getBoolean(var1);
      } catch (Exception var5) {
         Log.d("sugar", "Couldn't find config value: " + var1);
         var6 = var2;
         return var6;
      }

      var6 = var4;
      return var6;
   }

   private static Integer getMetaDataInteger(Context var0, String var1) {
      Object var2 = null;
      PackageManager var3 = var0.getPackageManager();

      int var4;
      Integer var6;
      try {
         var4 = var3.getApplicationInfo(var0.getPackageName(), 128).metaData.getInt(var1);
      } catch (Exception var5) {
         Log.d("sugar", "Couldn't find config value: " + var1);
         var6 = (Integer)var2;
         return var6;
      }

      var6 = var4;
      return var6;
   }

   private static String getMetaDataString(Context var0, String var1) {
      Object var2 = null;
      PackageManager var3 = var0.getPackageManager();

      String var5;
      try {
         var5 = var3.getApplicationInfo(var0.getPackageName(), 128).metaData.getString(var1);
      } catch (Exception var4) {
         Log.d("sugar", "Couldn't find config value: " + var1);
         var5 = (String)var2;
      }

      return var5;
   }
}
