package com.orm.query;

import com.orm.SugarRecord;

public class Condition {
   private Condition$Check check;
   private String property;
   private Object value;

   public Condition(String var1) {
      this.property = var1;
   }

   public static Condition prop(String var0) {
      return new Condition(var0);
   }

   private void setValue(Object var1) {
      if (var1 instanceof SugarRecord) {
         this.value = ((SugarRecord)var1).getId();
      } else {
         this.value = var1;
      }

   }

   public Condition eq(Object var1) {
      Condition var2;
      if (var1 == null) {
         var2 = this.isNull();
      } else {
         this.setValue(var1);
         this.check = Condition$Check.EQUALS;
         var2 = this;
      }

      return var2;
   }

   public Condition$Check getCheck() {
      return this.check;
   }

   public String getCheckSymbol() {
      return this.check.getSymbol();
   }

   public String getProperty() {
      return this.property;
   }

   public Object getValue() {
      return this.value;
   }

   public Condition gt(Object var1) {
      this.setValue(var1);
      this.check = Condition$Check.GREATER_THAN;
      return this;
   }

   public Condition isNotNull() {
      this.setValue((Object)null);
      this.check = Condition$Check.IS_NOT_NULL;
      return this;
   }

   public Condition isNull() {
      this.setValue((Object)null);
      this.check = Condition$Check.IS_NULL;
      return this;
   }

   public Condition like(Object var1) {
      this.setValue(var1);
      this.check = Condition$Check.LIKE;
      return this;
   }

   public Condition lt(Object var1) {
      this.setValue(var1);
      this.check = Condition$Check.LESSER_THAN;
      return this;
   }

   public Condition notEq(Object var1) {
      Condition var2;
      if (var1 == null) {
         var2 = this.isNotNull();
      } else {
         this.setValue(var1);
         this.check = Condition$Check.NOT_EQUALS;
         var2 = this;
      }

      return var2;
   }

   public Condition notLike(Object var1) {
      this.setValue(var1);
      this.check = Condition$Check.NOT_LIKE;
      return this;
   }
}
