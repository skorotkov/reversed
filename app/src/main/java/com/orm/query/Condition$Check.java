package com.orm.query;

enum Condition$Check {
   EQUALS(" = "),
   GREATER_THAN(" > "),
   IS_NOT_NULL(" IS NOT NULL "),
   IS_NULL(" IS NULL "),
   LESSER_THAN(" < "),
   LIKE(" LIKE "),
   NOT_EQUALS(" != "),
   NOT_LIKE(" NOT LIKE ");

   private String symbol;

   private Condition$Check(String var3) {
      this.symbol = var3;
   }

   public String getSymbol() {
      return this.symbol;
   }
}
