package com.orm.util;

import android.database.Cursor;
import android.database.CursorWrapper;

public class SugarCursor extends CursorWrapper {
   public SugarCursor(Cursor var1) {
      super(var1);
   }

   public int getColumnIndex(String var1) {
      String var2 = var1;
      if (var1.equals("_id")) {
         var2 = "ID";
      }

      return super.getColumnIndex(var2);
   }

   public int getColumnIndexOrThrow(String var1) {
      int var2;
      try {
         var2 = super.getColumnIndexOrThrow(var1);
      } catch (IllegalArgumentException var4) {
         if (!var1.equals("_id")) {
            throw var4;
         }

         var2 = super.getColumnIndexOrThrow("ID");
      }

      return var2;
   }
}
