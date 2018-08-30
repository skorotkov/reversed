package com.orm.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SugarConfig {
   static Map a = new HashMap();

   public static void clearCache() {
      a.clear();
      a = new HashMap();
   }

   public static List getFields(Class var0) {
      List var1;
      if (a.containsKey(var0)) {
         var1 = Collections.synchronizedList((List)a.get(var0));
      } else {
         var1 = null;
      }

      return var1;
   }

   public static void setFields(Class var0, List var1) {
      a.put(var0, var1);
   }
}
