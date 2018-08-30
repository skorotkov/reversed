package com.orm.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
   public static Collection$Entry entry(Object var0, Object var1) {
      return new Collection$Entry(var0, var1);
   }

   public static List list(Object... var0) {
      return Arrays.asList(var0);
   }

   public static Map map(Collection$Entry... var0) {
      HashMap var1 = new HashMap(var0.length);
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Collection$Entry var4 = var0[var3];
         if (var4.b != null) {
            var1.put(var4.a, var4.b);
         }
      }

      return var1;
   }

   public static Set set(Object... var0) {
      HashSet var1 = new HashSet(var0.length);
      var1.addAll(Arrays.asList(var0));
      return var1;
   }
}
