package com.orm.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import com.orm.dsl.Table;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ReflectionUtil {
   public static void addFieldValueToColumn(ContentValues param0, Field param1, Object param2, Map param3) {
      // $FF: Couldn't be decompiled
   }

   private static List getAllClasses(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static List getAllFields(List var0, Class var1) {
      Collections.addAll(var0, var1.getDeclaredFields());
      List var2 = var0;
      if (var1.getSuperclass() != null) {
         var2 = getAllFields(var0, var1.getSuperclass());
      }

      return var2;
   }

   private static Field getDeepField(String var0, Class var1) {
      Field var2;
      Field var4;
      try {
         var2 = var1.getDeclaredField(var0);
      } catch (NoSuchFieldException var3) {
         var1 = var1.getSuperclass();
         if (var1 != null) {
            var4 = getDeepField(var0, var1);
            return var4;
         }

         throw var3;
      }

      var4 = var2;
      return var4;
   }

   private static Class getDomainClass(String var0, Context var1) {
      Class var4;
      label38: {
         Class var3;
         try {
            var3 = Class.forName(var0, true, var1.getClass().getClassLoader());
         } catch (Throwable var2) {
            if (var2.getMessage() == null) {
               var0 = "getDomainClass " + var0 + " error";
            } else {
               var0 = var2.getMessage();
            }

            Log.e("Sugar", var0);
            var4 = null;
            break label38;
         }

         var4 = var3;
      }

      if (var4 != null && (SugarRecord.class.isAssignableFrom(var4) && !SugarRecord.class.equals(var4) || var4.isAnnotationPresent(Table.class)) && !Modifier.isAbstract(var4.getModifiers())) {
         Log.i("Sugar", "domain class : " + var4.getSimpleName());
      } else {
         var4 = null;
      }

      return var4;
   }

   public static List getDomainClasses(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static String getSourcePath(Context var0) {
      return var0.getPackageManager().getApplicationInfo(var0.getPackageName(), 0).sourceDir;
   }

   public static List getTableFields(Class var0) {
      List var1 = SugarConfig.getFields(var0);
      Object var4;
      if (var1 != null) {
         var4 = var1;
      } else {
         Log.d("Sugar", "Fetching properties");
         ArrayList var2 = new ArrayList();
         getAllFields(var2, var0);
         ArrayList var5 = new ArrayList();
         Iterator var6 = var2.iterator();

         while(var6.hasNext()) {
            Field var3 = (Field)var6.next();
            if (!var3.isAnnotationPresent(Ignore.class) && !Modifier.isStatic(var3.getModifiers()) && !Modifier.isTransient(var3.getModifiers())) {
               var5.add(var3);
            }
         }

         SugarConfig.setFields(var0, var5);
         var4 = var5;
      }

      return (List)var4;
   }

   private static void populateFiles(File var0, List var1, String var2) {
      if (var0.isDirectory()) {
         File[] var3 = var0.listFiles();
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            if ("".equals(var2)) {
               populateFiles(var6, var1, var0.getName());
            } else {
               populateFiles(var6, var1, var2 + "." + var0.getName());
            }
         }
      } else {
         String var8 = var0.getName();
         String var7 = var8;
         if (var8.endsWith(".class")) {
            var7 = var8.substring(0, var8.length() - ".class".length());
         }

         if ("".equals(var2)) {
            var1.add(var7);
         } else {
            var1.add(var2 + "." + var7);
         }
      }

   }

   public static void setFieldValueForId(Object var0, Long var1) {
      try {
         Field var2 = getDeepField("id", var0.getClass());
         var2.setAccessible(true);
         var2.set(var0, var1);
      } catch (IllegalAccessException var3) {
         var3.printStackTrace();
      } catch (NoSuchFieldException var4) {
         var4.printStackTrace();
      }

   }

   public static void setFieldValueFromCursor(Cursor param0, Field param1, Object param2) {
      // $FF: Couldn't be decompiled
   }
}
