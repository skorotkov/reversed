package com.orm;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class SugarTransactionHelper {
   public static void doInTransaction(SugarTransactionHelper$Callback var0) {
      SQLiteDatabase var1 = SugarContext.getSugarContext().getSugarDb().getDB();
      var1.beginTransaction();

      try {
         Log.d(SugarTransactionHelper.class.getSimpleName(), "Callback executing within transaction");
         var0.manipulateInTransaction();
         var1.setTransactionSuccessful();
         Log.d(SugarTransactionHelper.class.getSimpleName(), "Callback successfully executed within transaction");
      } catch (Throwable var4) {
         Log.d(SugarTransactionHelper.class.getSimpleName(), "Could execute callback within transaction", var4);
      } finally {
         var1.endTransaction();
      }

   }
}
