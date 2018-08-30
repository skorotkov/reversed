package com.orm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.Log;
import com.orm.dsl.Table;
import com.orm.dsl.Unique;
import com.orm.util.NamingHelper;
import com.orm.util.QueryBuilder;
import com.orm.util.ReflectionUtil;
import com.orm.util.SugarCursor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SugarRecord {
   public static final String SUGAR = "Sugar";
   private Long id = null;

   // $FF: synthetic method
   static void access$000(Cursor var0, Object var1, Map var2) {
      inflate(var0, var1, var2);
   }

   public static long count(Class var0) {
      return count(var0, (String)null, (String[])null, (String)null, (String)null, (String)null);
   }

   public static long count(Class var0, String var1, String[] var2) {
      return count(var0, var1, var2, (String)null, (String)null, (String)null);
   }

   public static long count(Class var0, String var1, String[] var2, String var3, String var4, String var5) {
      if (!TextUtils.isEmpty(var1)) {
         var1 = " where " + var1;
      } else {
         var1 = "";
      }

      long var7;
      SQLiteStatement var13;
      try {
         SQLiteDatabase var15 = getSugarDataBase();
         StringBuilder var14 = new StringBuilder();
         var13 = var15.compileStatement(var14.append("SELECT count(*) FROM ").append(NamingHelper.toSQLName(var0)).append(var1).toString());
      } catch (SQLiteException var12) {
         var12.printStackTrace();
         var7 = -1L;
         return var7;
      }

      if (var2 != null) {
         for(int var6 = var2.length; var6 != 0; --var6) {
            var13.bindString(var6, var2[var6 - 1]);
         }
      }

      try {
         var7 = var13.simpleQueryForLong();
      } finally {
         var13.close();
      }

      return var7;
   }

   public static boolean delete(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static int deleteAll(Class var0) {
      return deleteAll(var0, (String)null);
   }

   public static int deleteAll(Class var0, String var1, String... var2) {
      return getSugarDataBase().delete(NamingHelper.toSQLName(var0), var1, var2);
   }

   public static int deleteInTx(Collection param0) {
      // $FF: Couldn't be decompiled
   }

   public static int deleteInTx(Object... var0) {
      return deleteInTx((Collection)Arrays.asList(var0));
   }

   public static void executeQuery(String var0, String... var1) {
      getSugarDataBase().execSQL(var0, var1);
   }

   public static List find(Class var0, String var1, String... var2) {
      return find(var0, var1, var2, (String)null, (String)null, (String)null);
   }

   public static List find(Class var0, String var1, String[] var2, String var3, String var4, String var5) {
      return getEntitiesFromCursor(getSugarDataBase().query(NamingHelper.toSQLName(var0), (String[])null, var1, var2, var3, (String)null, var4, var5), var0);
   }

   public static Iterator findAll(Class var0) {
      return findAsIterator(var0, (String)null, (String[])null, (String)null, (String)null, (String)null);
   }

   public static Iterator findAsIterator(Class var0, String var1, String... var2) {
      return findAsIterator(var0, var1, var2, (String)null, (String)null, (String)null);
   }

   public static Iterator findAsIterator(Class var0, String var1, String[] var2, String var3, String var4, String var5) {
      return new SugarRecord$CursorIterator(var0, getSugarDataBase().query(NamingHelper.toSQLName(var0), (String[])null, var1, var2, var3, (String)null, var4, var5));
   }

   public static Object findById(Class var0, Integer var1) {
      return findById(var0, (long)var1);
   }

   public static Object findById(Class var0, Long var1) {
      Object var2 = null;
      List var3 = find(var0, "id=?", new String[]{String.valueOf(var1)}, (String)null, (String)null, "1");
      Object var4;
      if (var3.isEmpty()) {
         var4 = var2;
      } else {
         var4 = var3.get(0);
      }

      return var4;
   }

   public static List findById(Class var0, String[] var1) {
      return find(var0, "id IN (" + QueryBuilder.generatePlaceholders(var1.length) + ")", var1);
   }

   public static List findWithQuery(Class var0, String var1, String... var2) {
      return getEntitiesFromCursor(getSugarDataBase().rawQuery(var1, var2), var0);
   }

   public static Iterator findWithQueryAsIterator(Class var0, String var1, String... var2) {
      return new SugarRecord$CursorIterator(var0, getSugarDataBase().rawQuery(var1, var2));
   }

   public static Object first(Class var0) {
      List var1 = findWithQuery(var0, "SELECT * FROM " + NamingHelper.toSQLName(var0) + " ORDER BY ID ASC LIMIT 1");
      Object var2;
      if (var1.isEmpty()) {
         var2 = null;
      } else {
         var2 = var1.get(0);
      }

      return var2;
   }

   public static Cursor getCursor(Class var0, String var1, String[] var2, String var3, String var4, String var5) {
      return new SugarCursor(getSugarDataBase().query(NamingHelper.toSQLName(var0), (String[])null, var1, var2, var3, (String)null, var4, var5));
   }

   public static List getEntitiesFromCursor(Cursor var0, Class var1) {
      ArrayList var2 = new ArrayList();

      while(true) {
         boolean var6 = false;

         label57: {
            try {
               var6 = true;
               if (var0.moveToNext()) {
                  Object var3 = var1.getDeclaredConstructor().newInstance();
                  inflate(var0, var3, SugarContext.getSugarContext().a());
                  var2.add(var3);
                  var6 = false;
                  continue;
               }

               var6 = false;
            } catch (Exception var7) {
               var7.printStackTrace();
               var6 = false;
               break label57;
            } finally {
               if (var6) {
                  var0.close();
               }
            }

            var0.close();
            break;
         }

         var0.close();
         break;
      }

      return var2;
   }

   private static SQLiteDatabase getSugarDataBase() {
      return SugarContext.getSugarContext().getSugarDb().getDB();
   }

   private static void inflate(Cursor param0, Object param1, Map param2) {
      // $FF: Couldn't be decompiled
   }

   public static boolean isSugarEntity(Class var0) {
      boolean var1;
      if (!var0.isAnnotationPresent(Table.class) && !SugarRecord.class.isAssignableFrom(var0)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public static Object last(Class var0) {
      List var1 = findWithQuery(var0, "SELECT * FROM " + NamingHelper.toSQLName(var0) + " ORDER BY ID DESC LIMIT 1");
      Object var2;
      if (var1.isEmpty()) {
         var2 = null;
      } else {
         var2 = var1.get(0);
      }

      return var2;
   }

   public static List listAll(Class var0) {
      return find(var0, (String)null, (String[])null, (String)null, (String)null, (String)null);
   }

   public static List listAll(Class var0, String var1) {
      return find(var0, (String)null, (String[])null, (String)null, var1, (String)null);
   }

   static long save(SQLiteDatabase var0, Object var1) {
      Map var2 = SugarContext.getSugarContext().a();
      List var3 = ReflectionUtil.getTableFields(var1.getClass());
      ContentValues var4 = new ContentValues(var3.size());
      Iterator var5 = var3.iterator();
      Field var11 = null;

      while(var5.hasNext()) {
         Field var6 = (Field)var5.next();
         ReflectionUtil.addFieldValueToColumn(var4, var6, var1, var2);
         if (var6.getName().equals("id")) {
            var11 = var6;
         }
      }

      if (isSugarEntity(var1.getClass()) && var2.containsKey(var1)) {
         var4.put("id", (Long)var2.get(var1));
      }

      long var7 = var0.insertWithOnConflict(NamingHelper.toSQLName(var1.getClass()), (String)null, var4, 5);
      if (var1.getClass().isAnnotationPresent(Table.class)) {
         if (var11 != null) {
            var11.setAccessible(true);

            try {
               Long var10 = new Long(var7);
               var11.set(var1, var10);
            } catch (IllegalAccessException var9) {
               var9.printStackTrace();
            }
         } else {
            var2.put(var1, var7);
         }
      } else if (SugarRecord.class.isAssignableFrom(var1.getClass())) {
         ((SugarRecord)var1).setId(var7);
      }

      Log.i("Sugar", var1.getClass().getSimpleName() + " saved : " + var7);
      return var7;
   }

   public static long save(Object var0) {
      return save(getSugarDataBase(), var0);
   }

   public static void saveInTx(Collection param0) {
      // $FF: Couldn't be decompiled
   }

   public static void saveInTx(Object... var0) {
      saveInTx((Collection)Arrays.asList(var0));
   }

   static long update(SQLiteDatabase var0, Object var1) {
      Map var2 = SugarContext.getSugarContext().a();
      List var3 = ReflectionUtil.getTableFields(var1.getClass());
      ContentValues var4 = new ContentValues(var3.size());
      StringBuilder var5 = new StringBuilder();
      ArrayList var6 = new ArrayList();
      Iterator var15 = var3.iterator();

      while(var15.hasNext()) {
         Field var7 = (Field)var15.next();
         if (var7.isAnnotationPresent(Unique.class)) {
            try {
               var7.setAccessible(true);
               String var8 = NamingHelper.toSQLName(var7);
               Object var16 = var7.get(var1);
               var5.append(var8).append(" = ?");
               var6.add(String.valueOf(var16));
            } catch (IllegalAccessException var13) {
               var13.printStackTrace();
            }
         } else if (!var7.getName().equals("id")) {
            ReflectionUtil.addFieldValueToColumn(var4, var7, var1, var2);
         }
      }

      String[] var14 = (String[])var6.toArray(new String[var6.size()]);
      long var9 = (long)var0.update(NamingHelper.toSQLName(var1.getClass()), var4, var5.toString(), var14);
      long var11 = var9;
      if (var9 == 0L) {
         var11 = save(var0, var1);
      }

      return var11;
   }

   public static long update(Object var0) {
      return update(getSugarDataBase(), var0);
   }

   public static void updateInTx(Collection param0) {
      // $FF: Couldn't be decompiled
   }

   public static void updateInTx(Object... var0) {
      updateInTx((Collection)Arrays.asList(var0));
   }

   public boolean delete() {
      boolean var1 = true;
      Long var2 = this.getId();
      Class var3 = this.getClass();
      if (var2 != null && var2 > 0L) {
         Log.i("Sugar", var3.getSimpleName() + " deleted : " + var2);
         if (getSugarDataBase().delete(NamingHelper.toSQLName(var3), "Id=?", new String[]{var2.toString()}) != 1) {
            var1 = false;
         }
      } else {
         Log.i("Sugar", "Cannot delete object: " + var3.getSimpleName() + " - object has not been saved");
         var1 = false;
      }

      return var1;
   }

   public Long getId() {
      return this.id;
   }

   void inflate(Cursor var1) {
      inflate(var1, this, SugarContext.getSugarContext().a());
   }

   public long save() {
      return save(getSugarDataBase(), this);
   }

   public void setId(Long var1) {
      this.id = var1;
   }

   public long update() {
      return update(getSugarDataBase(), this);
   }
}
