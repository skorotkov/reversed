package com.orm;

import android.database.Cursor;
import java.util.Iterator;

class SugarRecord$CursorIterator implements Iterator {
   Class a;
   Cursor b;

   public SugarRecord$CursorIterator(Class var1, Cursor var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean hasNext() {
      boolean var1;
      if (this.b != null && !this.b.isClosed() && !this.b.isAfterLast()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public Object next() {
      // $FF: Couldn't be decompiled
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
