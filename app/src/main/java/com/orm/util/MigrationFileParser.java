package com.orm.util;

public class MigrationFileParser {
   private String content;

   public MigrationFileParser(String var1) {
      this.content = var1.replaceAll("(\\/\\*([\\s\\S]*?)\\*\\/)|(--(.)*)|(\n)", "");
   }

   public String[] getStatements() {
      return this.content.split(";");
   }
}
