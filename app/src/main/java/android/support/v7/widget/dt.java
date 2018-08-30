package android.support.v7.widget;

import android.database.Observable;

class dt extends Observable {
   public void a() {
      for(int var1 = this.mObservers.size() - 1; var1 >= 0; --var1) {
         ((du)this.mObservers.get(var1)).a();
      }

   }

   public void a(int var1, int var2) {
      this.a(var1, var2, (Object)null);
   }

   public void a(int var1, int var2, Object var3) {
      for(int var4 = this.mObservers.size() - 1; var4 >= 0; --var4) {
         ((du)this.mObservers.get(var4)).a(var1, var2, var3);
      }

   }

   public void b(int var1, int var2) {
      for(int var3 = this.mObservers.size() - 1; var3 >= 0; --var3) {
         ((du)this.mObservers.get(var3)).b(var1, var2);
      }

   }

   public void c(int var1, int var2) {
      for(int var3 = this.mObservers.size() - 1; var3 >= 0; --var3) {
         ((du)this.mObservers.get(var3)).c(var1, var2);
      }

   }
}
