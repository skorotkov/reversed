package com.orm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.orm.util.ManifestHelper;
import com.orm.util.SugarCursorFactory;

public class SugarDb extends SQLiteOpenHelper {
   private int openedConnections = 0;
   private final SchemaGenerator schemaGenerator;
   private SQLiteDatabase sqLiteDatabase;

   public SugarDb(Context var1) {
      super(var1, ManifestHelper.getDatabaseName(var1), new SugarCursorFactory(ManifestHelper.getDebugEnabled(var1)), ManifestHelper.getDatabaseVersion(var1));
      this.schemaGenerator = new SchemaGenerator(var1);
   }

   public void close() {
      synchronized(this){}

      try {
         Log.d("SUGAR", "getReadableDatabase");
         --this.openedConnections;
         if (this.openedConnections == 0) {
            Log.d("SUGAR", "closing");
            super.close();
         }
      } finally {
         ;
      }

   }

   public SQLiteDatabase getDB() {
      synchronized(this){}

      SQLiteDatabase var1;
      try {
         if (this.sqLiteDatabase == null) {
            this.sqLiteDatabase = this.getWritableDatabase();
         }

         var1 = this.sqLiteDatabase;
      } finally {
         ;
      }

      return var1;
   }

   public SQLiteDatabase getReadableDatabase() {
      synchronized(this){}

      SQLiteDatabase var1;
      try {
         Log.d("SUGAR", "getReadableDatabase");
         ++this.openedConnections;
         var1 = super.getReadableDatabase();
      } finally {
         ;
      }

      return var1;
   }

   public void onCreate(SQLiteDatabase var1) {
      this.schemaGenerator.createDatabase(var1);
   }

   public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
      this.schemaGenerator.doUpgrade(var1, var2, var3);
   }
}
