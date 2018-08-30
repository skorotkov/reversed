package com.orm.util;

import com.orm.SugarRecord;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class QueryBuilder {
   public static String generatePlaceholders(int var0) {
      int var1 = 1;
      if (var0 < 1) {
         throw new RuntimeException("The number of arguments must be greater than or equal to 1.");
      } else {
         StringBuilder var2 = new StringBuilder(var0 * 2 - 1);
         var2.append("?");

         while(var1 < var0) {
            var2.append(",?");
            ++var1;
         }

         return var2.toString();
      }
   }

   public static String getColumnType(Class var0) {
      String var1;
      if (!var0.equals(Boolean.class) && !var0.equals(Boolean.TYPE) && !var0.equals(Integer.class) && !var0.equals(Integer.TYPE) && !var0.equals(Long.class) && !var0.equals(Long.TYPE) && (var0.isPrimitive() || !SugarRecord.class.isAssignableFrom(var0))) {
         if (!var0.equals(Date.class) && !var0.equals(java.sql.Date.class) && !var0.equals(Calendar.class)) {
            if (var0.getName().equals("[B")) {
               var1 = "BLOB";
            } else if (!var0.equals(Double.class) && !var0.equals(Double.TYPE) && !var0.equals(Float.class) && !var0.equals(Float.TYPE)) {
               if (!var0.equals(String.class) && !var0.equals(Character.TYPE) && !var0.equals(BigDecimal.class)) {
                  var1 = "";
               } else {
                  var1 = "TEXT";
               }
            } else {
               var1 = "FLOAT";
            }
         } else {
            var1 = "INTEGER NULL";
         }
      } else {
         var1 = "INTEGER";
      }

      return var1;
   }
}
