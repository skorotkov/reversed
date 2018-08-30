package com.orm;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.orm.dsl.Column;
import com.orm.dsl.MultiUnique;
import com.orm.dsl.NotNull;
import com.orm.dsl.Unique;
import com.orm.util.NamingHelper;
import com.orm.util.QueryBuilder;
import com.orm.util.ReflectionUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SchemaGenerator {
   public static final String NOT_NULL = " NOT NULL";
   public static final String NULL = " NULL";
   public static final String SUGAR = "Sugar";
   public static final String UNIQUE = " UNIQUE";
   private Context context;

   public SchemaGenerator(Context var1) {
      this.context = var1;
   }

   private void addColumns(Class var1, SQLiteDatabase var2) {
      List var3 = ReflectionUtil.getTableFields(var1);
      String var4 = NamingHelper.toSQLName(var1);
      ArrayList var5 = this.getColumnNames(var2, var4);
      ArrayList var6 = new ArrayList();
      Iterator var7 = var3.iterator();

      String var10;
      while(var7.hasNext()) {
         Field var11 = (Field)var7.next();
         var10 = NamingHelper.toSQLName(var11);
         String var8 = QueryBuilder.getColumnType(var11.getType());
         if (var11.isAnnotationPresent(Column.class)) {
            var10 = ((Column)var11.getAnnotation(Column.class)).name();
         }

         if (!var5.contains(var10)) {
            StringBuilder var9 = new StringBuilder("ALTER TABLE ");
            var9.append(var4).append(" ADD COLUMN ").append(var10).append(" ").append(var8);
            if (var11.isAnnotationPresent(NotNull.class)) {
               if (var8.endsWith(" NULL")) {
                  var9.delete(var9.length() - 5, var9.length());
               }

               var9.append(" NOT NULL");
            }

            var6.add(var9.toString());
         }
      }

      Iterator var12 = var6.iterator();

      while(var12.hasNext()) {
         var10 = (String)var12.next();
         Log.i("Sugar", var10);
         var2.execSQL(var10);
      }

   }

   private void createTable(Class var1, SQLiteDatabase var2) {
      String var4 = this.createTableSQL(var1);
      if (!var4.isEmpty()) {
         try {
            var2.execSQL(var4);
         } catch (SQLException var3) {
            var3.printStackTrace();
         }
      }

   }

   private void executeScript(SQLiteDatabase param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean executeSugarUpgrade(SQLiteDatabase param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private ArrayList getColumnNames(SQLiteDatabase var1, String var2) {
      Cursor var4 = var1.query(var2, (String[])null, (String)null, (String[])null, (String)null, (String)null, (String)null);
      ArrayList var5 = new ArrayList();

      for(int var3 = 0; var3 < var4.getColumnCount(); ++var3) {
         var5.add(var4.getColumnName(var3));
      }

      var4.close();
      return var5;
   }

   public void createDatabase(SQLiteDatabase var1) {
      Iterator var2 = ReflectionUtil.getDomainClasses(this.context).iterator();

      while(var2.hasNext()) {
         this.createTable((Class)var2.next(), var1);
      }

   }

   protected String createTableSQL(Class var1) {
      Log.i("Sugar", "Create table if not exists");
      List var2 = ReflectionUtil.getTableFields(var1);
      String var3 = NamingHelper.toSQLName(var1);
      StringBuilder var4 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
      var4.append(var3).append(" ( ID INTEGER PRIMARY KEY AUTOINCREMENT ");
      Iterator var11 = var2.iterator();

      while(var11.hasNext()) {
         Field var5 = (Field)var11.next();
         String var6 = NamingHelper.toSQLName(var5);
         String var7 = QueryBuilder.getColumnType(var5.getType());
         if (var7 != null && !var6.equalsIgnoreCase("Id")) {
            if (var5.isAnnotationPresent(Column.class)) {
               Column var12 = (Column)var5.getAnnotation(Column.class);
               var6 = var12.name();
               var4.append(", ").append(var6).append(" ").append(var7);
               if (var12.notNull()) {
                  if (var7.endsWith(" NULL")) {
                     var4.delete(var4.length() - 5, var4.length());
                  }

                  var4.append(" NOT NULL");
               }

               if (var12.unique()) {
                  var4.append(" UNIQUE");
               }
            } else {
               var4.append(", ").append(var6).append(" ").append(var7);
               if (var5.isAnnotationPresent(NotNull.class)) {
                  if (var7.endsWith(" NULL")) {
                     var4.delete(var4.length() - 5, var4.length());
                  }

                  var4.append(" NOT NULL");
               }

               if (var5.isAnnotationPresent(Unique.class)) {
                  var4.append(" UNIQUE");
               }
            }
         }
      }

      if (var1.isAnnotationPresent(MultiUnique.class)) {
         String var9 = ((MultiUnique)var1.getAnnotation(MultiUnique.class)).value();
         var4.append(", UNIQUE(");
         String[] var10 = var9.split(",");

         for(int var8 = 0; var8 < var10.length; ++var8) {
            var4.append(NamingHelper.toSQLNameDefault(var10[var8]));
            if (var8 < var10.length - 1) {
               var4.append(",");
            }
         }

         var4.append(") ON CONFLICT REPLACE");
      }

      var4.append(" ) ");
      Log.i("Sugar", "Creating table " + var3);
      return var4.toString();
   }

   public void deleteTables(SQLiteDatabase var1) {
      Iterator var2 = ReflectionUtil.getDomainClasses(this.context).iterator();

      while(var2.hasNext()) {
         Class var3 = (Class)var2.next();
         var1.execSQL("DROP TABLE IF EXISTS " + NamingHelper.toSQLName(var3));
      }

   }

   public void doUpgrade(SQLiteDatabase var1, int var2, int var3) {
      Iterator var4 = ReflectionUtil.getDomainClasses(this.context).iterator();

      while(true) {
         while(var4.hasNext()) {
            Class var5 = (Class)var4.next();
            Cursor var6 = var1.rawQuery(String.format("select count(*) from sqlite_master where type='table' and name='%s';", NamingHelper.toSQLName(var5)), (String[])null);
            if (var6.moveToFirst() && var6.getInt(0) == 0) {
               this.createTable(var5, var1);
            } else {
               this.addColumns(var5, var1);
            }
         }

         this.executeSugarUpgrade(var1, var2, var3);
         return;
      }
   }
}
