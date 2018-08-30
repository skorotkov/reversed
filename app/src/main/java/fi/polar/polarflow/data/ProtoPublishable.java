package fi.polar.polarflow.data;

import android.content.Context;
import fi.polar.polarflow.service.datalayer.s;

public interface ProtoPublishable extends ProtoEncodable {
   s createDataLayerRequest();

   s createDataLayerRequest(String var1);

   void publish(Context var1);

   void publish(Context var1, OnPublishedListener var2);

   void publish(Context var1, String var2);

   void publish(Context var1, String var2, OnPublishedListener var3);
}
