package com.orm.util;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

public class SugarCursorFactory implements CursorFactory {
   private boolean debugEnabled;

   public SugarCursorFactory() {
      this.debugEnabled = false;
   }

   public SugarCursorFactory(boolean var1) {
      this.debugEnabled = var1;
   }

   public Cursor newCursor(SQLiteDatabase var1, SQLiteCursorDriver var2, String var3, SQLiteQuery var4) {
      if (this.debugEnabled) {
         Log.d("SQL Log", var4.toString());
      }

      return new SQLiteCursor(var1, var2, var3, var4);
   }
}
