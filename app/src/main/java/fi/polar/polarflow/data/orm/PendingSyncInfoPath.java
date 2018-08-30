package fi.polar.polarflow.data.orm;

import com.orm.SugarRecord;
import com.orm.dsl.NotNull;
import com.orm.dsl.Unique;

public class PendingSyncInfoPath extends SugarRecord {
   @NotNull
   @Unique
   private String changedPath;

   public PendingSyncInfoPath() {
   }

   public PendingSyncInfoPath(String var1) {
      this.changedPath = var1;
   }

   public String getChangedPath() {
      return this.changedPath;
   }

   public void setChangedPath(String var1) {
      this.changedPath = var1;
   }
}
