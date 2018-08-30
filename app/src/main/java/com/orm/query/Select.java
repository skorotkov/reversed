package com.orm.query;

import android.database.Cursor;
import com.orm.SugarRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Select implements Iterable {
   private static final String GROUP_BY = "GROUP BY ";
   private static final String LEFT_PARENTHESIS = "(";
   private static final String LIMIT = "LIMIT ";
   private static final String OFFSET = "OFFSET ";
   private static final String ORDER_BY = "ORDER BY ";
   private static final String RIGHT_PARENTHESIS = ")";
   private static final String SELECT_FROM = "SELECT * FROM ";
   private static final String SINGLE_QUOTE = "'";
   private static final String SPACE = " ";
   private static final String WHERE = "WHERE ";
   private List args = new ArrayList();
   private String[] arguments;
   private String groupBy = "";
   private String limit = "";
   private String offset = "";
   private String orderBy = "";
   private Class record;
   private String whereClause = "";

   public Select(Class var1) {
      this.record = var1;
   }

   private String[] convertArgs(List var1) {
      String[] var2 = new String[var1.size()];

      for(int var3 = 0; var3 < var1.size(); ++var3) {
         var2[var3] = var1.get(var3).toString();
      }

      return var2;
   }

   public static Select from(Class var0) {
      return new Select(var0);
   }

   private void mergeConditions(Condition[] var1, Condition$Type var2) {
      StringBuilder var3 = new StringBuilder();
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Condition var6 = var1[var5];
         if (var3.length() != 0) {
            var3.append(" ").append(var2.name()).append(" ");
         }

         if (!Condition$Check.LIKE.equals(var6.getCheck()) && !Condition$Check.NOT_LIKE.equals(var6.getCheck())) {
            if (!Condition$Check.IS_NULL.equals(var6.getCheck()) && !Condition$Check.IS_NOT_NULL.equals(var6.getCheck())) {
               var3.append(var6.getProperty()).append(var6.getCheckSymbol()).append("? ");
               this.args.add(var6.getValue());
            } else {
               var3.append(var6.getProperty()).append(var6.getCheckSymbol());
            }
         } else {
            var3.append(var6.getProperty()).append(var6.getCheckSymbol()).append("'").append(var6.getValue().toString()).append("'");
         }
      }

      if (!this.whereClause.isEmpty()) {
         this.whereClause = this.whereClause + " " + var2.name() + " ";
      }

      this.whereClause = this.whereClause + "(" + var3 + ")";
   }

   public Select and(Condition... var1) {
      this.mergeConditions(var1, Condition$Type.AND);
      return this;
   }

   public long count() {
      if (this.arguments == null) {
         this.arguments = this.convertArgs(this.args);
      }

      return SugarRecord.count(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, this.limit);
   }

   public Object first() {
      if (this.arguments == null) {
         this.arguments = this.convertArgs(this.args);
      }

      List var1 = SugarRecord.find(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, "1");
      Object var2;
      if (var1.size() > 0) {
         var2 = var1.get(0);
      } else {
         var2 = null;
      }

      return var2;
   }

   public Cursor getCursor() {
      return SugarRecord.getCursor(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, this.limit);
   }

   public Select groupBy(String var1) {
      this.groupBy = var1;
      return this;
   }

   public Iterator iterator() {
      if (this.arguments == null) {
         this.arguments = this.convertArgs(this.args);
      }

      return SugarRecord.findAsIterator(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, this.limit);
   }

   public Select limit(String var1) {
      this.limit = var1;
      return this;
   }

   public List list() {
      if (this.arguments == null) {
         this.arguments = this.convertArgs(this.args);
      }

      return SugarRecord.find(this.record, this.whereClause, this.arguments, this.groupBy, this.orderBy, this.limit);
   }

   public Select offset(String var1) {
      this.offset = var1;
      return this;
   }

   public Select or(Condition... var1) {
      this.mergeConditions(var1, Condition$Type.OR);
      return this;
   }

   public Select orderBy(String var1) {
      this.orderBy = var1;
      return this;
   }

   public Select where(String var1) {
      this.whereClause = var1;
      return this;
   }

   public Select where(String var1, String[] var2) {
      this.whereClause = var1;
      this.arguments = var2;
      return this;
   }

   public Select where(Condition... var1) {
      this.mergeConditions(var1, Condition$Type.AND);
      return this;
   }

   public Select whereOr(Condition... var1) {
      this.mergeConditions(var1, Condition$Type.OR);
      return this;
   }
}
