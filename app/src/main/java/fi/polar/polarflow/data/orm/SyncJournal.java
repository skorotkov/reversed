package fi.polar.polarflow.data.orm;

import android.net.Uri;
import com.orm.SugarRecord;
import com.orm.dsl.NotNull;
import com.orm.dsl.Unique;

public class SyncJournal extends SugarRecord {
   public static final int TYPE_CHANGED = 1;
   public static final int TYPE_DELETED = 2;
   private long timeStamp;
   private int type;
   @NotNull
   @Unique
   private String uriString;

   public SyncJournal() {
   }

   public SyncJournal(String var1) {
      this();
      this.uriString = var1;
   }

   public String getPath() {
      return Uri.parse(this.uriString).getPath();
   }

   public long getTimeStamp() {
      return this.timeStamp;
   }

   public int getType() {
      return this.type;
   }

   public Uri getUri() {
      return Uri.parse(this.uriString);
   }

   public void setTimeStamp(long var1) {
      this.timeStamp = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }
}
