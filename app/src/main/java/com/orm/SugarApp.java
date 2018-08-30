package com.orm;

import android.app.Application;

public class SugarApp extends Application {
   public void onCreate() {
      super.onCreate();
      SugarContext.init(this);
   }

   public void onTerminate() {
      super.onTerminate();
      SugarContext.terminate();
   }
}
