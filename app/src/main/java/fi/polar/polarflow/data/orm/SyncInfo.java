package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.SyncInfo$PbSyncInfo;
import fi.polar.remote.representation.protobuf.SyncInfo$PbSyncInfo$Builder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class SyncInfo extends ProtoPublishableEntity implements Mergeable {
   @Ignore
   public static final int MAX_AMOUNT_CHANGED_PATHS = 20;
   @Ignore
   private final String TAG;
   private String changedPaths;
   private boolean fullSyncRequired;
   private Date lastModified;
   private boolean lastModifiedTrusted;
   private Date lastSynchronized;
   private boolean lastSynchronizedTrusted;

   public SyncInfo() {
      this.TAG = SyncInfo.class.getSimpleName();
      this.path = "/";
      this.changedPaths = (new JSONArray()).toString();
   }

   public SyncInfo(SyncInfo$PbSyncInfo var1) {
      this();
      if (var1.hasLastSynchronized()) {
         this.lastSynchronized = q.a(var1.getLastSynchronized());
         this.lastSynchronizedTrusted = var1.getLastSynchronized().getTrusted();
      }

      boolean var2;
      if (var1.hasFullSyncRequired() && var1.getFullSyncRequired()) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.fullSyncRequired = var2;
      this.changedPaths = (new JSONArray(var1.getChangedPathList())).toString();
      if (var1.hasLastModified()) {
         this.lastModified = q.a(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

   }

   public SyncInfo(InputStream var1) {
      this(SyncInfo$PbSyncInfo.parseFrom(var1));
   }

   public SyncInfo(Date var1, boolean var2, Date var3, boolean var4, boolean var5, List var6) {
      this();
      this.lastModified = var1;
      this.lastModifiedTrusted = var2;
      this.lastSynchronized = var3;
      this.lastSynchronizedTrusted = var4;
      this.fullSyncRequired = var5;
      this.changedPaths = (new JSONArray(q.b(var6))).toString();
   }

   public void addChangedPath(String var1) {
      JSONArray var2 = new JSONArray();
      if (!TextUtils.isEmpty(this.changedPaths)) {
         label14: {
            JSONArray var3;
            try {
               var3 = new JSONArray(this.changedPaths);
            } catch (JSONException var4) {
               d.c(this.TAG, "Failed to parse changedPaths=\"" + this.changedPaths + "\"", var4);
               break label14;
            }

            var2 = var3;
         }
      }

      var2.put(var1);
      this.changedPaths = var2.toString();
   }

   public String getBasename() {
      return "SYNCINFO";
   }

   public String getChangedPathsJSONArrayString() {
      return this.changedPaths;
   }

   public List getChangedPathsList() {
      ArrayList var1 = new ArrayList();
      Object var2 = var1;
      if (!TextUtils.isEmpty(this.changedPaths)) {
         try {
            JSONArray var4 = new JSONArray(this.changedPaths);
            var2 = q.a(var4);
         } catch (JSONException var3) {
            d.c(this.TAG, "Failed to parse changedPaths=\"" + this.changedPaths + "\"", var3);
            var2 = var1;
         }
      }

      return (List)var2;
   }

   public Date getLastModified() {
      return this.lastModified;
   }

   public Date getLastSynchronized() {
      return this.lastSynchronized;
   }

   public boolean isFullSyncRequired() {
      return this.fullSyncRequired;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public boolean isLastSynchronizedTrusted() {
      return this.lastSynchronizedTrusted;
   }

   public void merge(SyncInfo var1) {
      if (this.lastModified != null && !this.lastModified.equals(var1.lastModified)) {
         d.e(this.TAG, "Not merging syncinfo based on out-of-date information(lastModified=" + this.lastModified + ", remote.lastModified=" + var1.lastModified + ")");
      } else {
         this.lastModified = var1.lastModified;
         this.lastModifiedTrusted = var1.lastModifiedTrusted;
         this.lastSynchronized = var1.lastSynchronized;
         this.lastSynchronizedTrusted = var1.lastModifiedTrusted;
         this.changedPaths = var1.changedPaths;
         this.fullSyncRequired = var1.fullSyncRequired;
      }

   }

   public void setChangedPathsList(List var1) {
      this.changedPaths = (new JSONArray(q.b(var1))).toString();
   }

   public void setFullSyncRequired(boolean var1) {
      this.fullSyncRequired = var1;
   }

   public void setLastModified(Date var1) {
      this.lastModified = var1;
   }

   public void setLastModifiedTrusted(boolean var1) {
      this.lastModifiedTrusted = var1;
   }

   public void setLastSynchronized(Date var1) {
      this.lastSynchronized = var1;
   }

   public void setLastSynchronizedTrusted(boolean var1) {
      this.lastSynchronizedTrusted = var1;
   }

   public SyncInfo$PbSyncInfo toPbObject() {
      SyncInfo$PbSyncInfo$Builder var1 = SyncInfo$PbSyncInfo.newBuilder();
      if (this.lastModified != null) {
         var1.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      if (this.lastSynchronized != null) {
         var1.setLastSynchronized(q.a(this.lastSynchronized, this.lastSynchronizedTrusted));
      }

      var1.setFullSyncRequired(this.fullSyncRequired);
      if (!TextUtils.isEmpty(this.changedPaths)) {
         try {
            JSONArray var2 = new JSONArray(this.changedPaths);
            var1.addAllChangedPath(q.a(var2));
         } catch (JSONException var3) {
            d.c(this.TAG, "Failed to parse changedPaths=\"" + this.changedPaths + "\"", var3);
         }
      }

      return var1.build();
   }
}
