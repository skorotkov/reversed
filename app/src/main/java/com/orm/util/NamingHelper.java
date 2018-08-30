package com.orm.util;

import com.orm.dsl.Column;
import com.orm.dsl.Table;
import java.lang.reflect.Field;

public class NamingHelper {
   public static String toSQLName(Class var0) {
      String var2;
      if (var0.isAnnotationPresent(Table.class)) {
         Table var1 = (Table)var0.getAnnotation(Table.class);
         if ("".equals(var1.name())) {
            var2 = toSQLNameDefault(var0.getSimpleName());
         } else {
            var2 = var1.name();
         }
      } else {
         var2 = toSQLNameDefault(var0.getSimpleName());
      }

      return var2;
   }

   public static String toSQLName(Field var0) {
      String var1;
      if (var0.isAnnotationPresent(Column.class)) {
         var1 = ((Column)var0.getAnnotation(Column.class)).name();
      } else {
         var1 = toSQLNameDefault(var0.getName());
      }

      return var1;
   }

   public static String toSQLNameDefault(String var0) {
      if (var0.equalsIgnoreCase("_id")) {
         var0 = "_id";
      } else {
         StringBuilder var1 = new StringBuilder();
         char[] var7 = var0.toCharArray();

         for(int var2 = 0; var2 < var7.length; ++var2) {
            char var3;
            char var4;
            byte var8;
            if (var2 > 0) {
               var3 = var7[var2 - 1];
               var4 = var3;
            } else {
               var8 = 0;
               var4 = (char)var8;
            }

            char var5 = var7[var2];
            char var6;
            if (var2 < var7.length - 1) {
               var3 = var7[var2 + 1];
               var6 = var3;
            } else {
               var8 = 0;
               var6 = (char)var8;
            }

            boolean var9;
            if (var2 == 0) {
               var9 = true;
            } else {
               var9 = false;
            }

            if (!var9 && !Character.isLowerCase(var5) && !Character.isDigit(var5)) {
               if (Character.isUpperCase(var5)) {
                  if (Character.isLetterOrDigit(var4)) {
                     if (Character.isLowerCase(var4)) {
                        var1.append('_').append(var5);
                     } else if (var6 > 0 && Character.isLowerCase(var6)) {
                        var1.append('_').append(var5);
                     } else {
                        var1.append(var5);
                     }
                  } else {
                     var1.append(var5);
                  }
               }
            } else {
               var1.append(Character.toUpperCase(var5));
            }
         }

         var0 = var1.toString();
      }

      return var0;
   }
}
