package com.orm;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class SugarContext {
   private static SugarContext instance = null;
   private Map entitiesMap;
   private SugarDb sugarDb;

   private SugarContext(Context var1) {
      this.sugarDb = new SugarDb(var1);
      this.entitiesMap = Collections.synchronizedMap(new WeakHashMap());
   }

   private void doTerminate() {
      if (this.sugarDb != null) {
         this.sugarDb.getDB().close();
      }

   }

   public static SugarContext getSugarContext() {
      if (instance == null) {
         throw new NullPointerException("SugarContext has not been initialized properly. Call SugarContext.init(Context) in your Application.onCreate() method and SugarContext.terminate() in your Application.onTerminate() method.");
      } else {
         return instance;
      }
   }

   public static void init(Context var0) {
      instance = new SugarContext(var0);
   }

   public static void terminate() {
      if (instance != null) {
         instance.doTerminate();
      }

   }

   Map a() {
      return this.entitiesMap;
   }

   protected SugarDb getSugarDb() {
      return this.sugarDb;
   }
}
