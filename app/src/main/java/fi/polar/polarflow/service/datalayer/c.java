package fi.polar.polarflow.service.datalayer;

import android.os.AsyncTask;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class c extends AsyncTask {
   private final Set a = new HashSet();

   public c(at var1) {
      if (var1 != null) {
         this.a.add(var1);
      }

   }

   public void a(at var1) {
      this.a.add(var1);
   }

   protected void a(List var1) {
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         ((at)var2.next()).onFinished(var1);
      }

   }

   // $FF: synthetic method
   protected void onPostExecute(Object var1) {
      this.a((List)var1);
   }
}
