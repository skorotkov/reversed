package fi.polar.polarflow.data.orm;

import android.content.Context;
import android.text.TextUtils;
import fi.polar.polarflow.data.OnPublishedListener;
import fi.polar.polarflow.data.ProtoPublishable;
import fi.polar.polarflow.service.datalayer.at;
import fi.polar.polarflow.service.datalayer.s;
import fi.polar.polarflow.service.datalayer.t;
import fi.polar.polarflow.util.x;
import java.io.InputStream;

public abstract class ProtoPublishableEntity extends ProtoEncodableEntity implements ProtoPublishable {
   protected String path;

   protected ProtoPublishableEntity() {
   }

   protected ProtoPublishableEntity(InputStream var1) {
   }

   public s createDataLayerRequest() {
      return this.createDataLayerRequest(this.getPath() + this.getFilename());
   }

   public s createDataLayerRequest(String var1) {
      return new s(0, var1, this.toByteArray());
   }

   public x createSyncInfoRequest(boolean var1) {
      return new x(this.getPath() + this.getFilename(), var1);
   }

   public abstract String getBasename();

   public String getFilename() {
      return this.getBasename() + "." + "BPB";
   }

   public String getFilenameZipped() {
      return this.getBasename() + "." + "GZB";
   }

   public String getPath() {
      return this.path;
   }

   public void publish(Context var1) {
      this.publish(var1, (OnPublishedListener)null);
   }

   public void publish(Context var1, OnPublishedListener var2) {
      String var3 = this.getPath();
      String var4 = this.getFilename();
      if (!TextUtils.isEmpty(var3) && !TextUtils.isEmpty(var4)) {
         this.publish(var1, var3 + var4, var2);
      } else if (var2 != null) {
         var2.onPublished(false);
      }

   }

   public void publish(Context var1, String var2) {
      this.publish(var1, var2, (OnPublishedListener)null);
   }

   public void publish(Context var1, String var2, OnPublishedListener var3) {
      t var4 = new t(var1);
      if (var3 != null) {
         var4.a((at)(new ProtoPublishableEntity$1(this, var3)));
      }

      var4.execute(new s[]{this.createDataLayerRequest(var2)});
   }

   public void setPath(String var1) {
      this.path = var1;
   }
}
