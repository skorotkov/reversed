package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class aj extends AsyncTask {
   private static final String a = aj.class.getSimpleName();
   private GoogleApiClient b;
   private DataApi c;
   private o d;
   private ak e;

   public aj(Context var1) {
      this.b = (new Builder(var1)).addApi(Wearable.API).build();
      this.c = Wearable.DataApi;
      this.d = new o(var1);
   }

   private GetFdForAssetResult a(DataItem var1, String var2) {
      DataMap var3 = DataMapItem.fromDataItem(var1).getDataMap();
      GetFdForAssetResult var4;
      if (var3.containsKey(var2)) {
         var4 = (GetFdForAssetResult)this.c.getFdForAsset(this.b, var3.getAsset(var2)).await(10000L, TimeUnit.MILLISECONDS);
      } else {
         var4 = null;
      }

      return var4;
   }

   protected Boolean a(String... var1) {
      boolean var2 = false;
      boolean var3 = false;
      if (var1 != null && var1.length != 0) {
         String var23 = var1[0];
         ConnectionResult var4 = this.b.blockingConnect(10000L, TimeUnit.MILLISECONDS);
         if (var4.isSuccess()) {
            Uri var24 = v.a(v.a(this.b), var23);
            DataItemBuffer var5 = (DataItemBuffer)this.c.getDataItems(this.b, var24, 1).await(10000L, TimeUnit.MILLISECONDS);
            if (var5 == null) {
               fi.polar.polarflow.util.d.b(a, "Data item buffer is null");
            } else {
               Iterator var25 = var5.iterator();
               var3 = true;

               while(true) {
                  while(var25.hasNext()) {
                     DataItem var6 = (DataItem)var25.next();
                     String var7 = var6.getUri().getPath();
                     GetFdForAssetResult var26 = this.a(var6, "fi.polar.polarflow.file.asset");
                     if (var26 != null) {
                        InputStream var8 = var26.getInputStream();
                        if (var8 != null) {
                           label176: {
                              boolean var17 = false;

                              label177: {
                                 label157: {
                                    try {
                                       var17 = true;
                                       Status var9 = this.d.a(var7, fi.polar.polarflow.util.g.a(var8));
                                       if (var9.isSuccess()) {
                                          var17 = false;
                                          break label177;
                                       }

                                       String var10 = a;
                                       StringBuilder var11 = new StringBuilder();
                                       fi.polar.polarflow.util.d.e(var10, var11.append("Cannot create item(path=").append(var7).append(", status=").append(var9).append(")").toString());
                                       var17 = false;
                                    } catch (IOException var21) {
                                       fi.polar.polarflow.util.d.a(a, "", var21);
                                       var17 = false;
                                       break label157;
                                    } finally {
                                       if (var17) {
                                          try {
                                             var8.close();
                                          } catch (IOException var18) {
                                          }

                                       }
                                    }

                                    var3 = false;
                                    break label177;
                                 }

                                 try {
                                    var8.close();
                                 } catch (IOException var20) {
                                    var3 = false;
                                    break label176;
                                 }

                                 var3 = false;
                                 break label176;
                              }

                              try {
                                 var8.close();
                              } catch (IOException var19) {
                              }
                           }
                        } else {
                           fi.polar.polarflow.util.d.b(a, "InputStream for asset is null");
                           var3 = false;
                        }

                        var26.release();
                     } else {
                        fi.polar.polarflow.util.d.c(a, "No asset within data item (path=" + var7 + ")");
                     }
                  }

                  var5.release();
                  break;
               }
            }

            var2 = var3;
            if (var3) {
               var2 = var3;
               if (!((DeleteDataItemsResult)this.c.deleteDataItems(this.b, var24, 1).await(10000L, TimeUnit.MILLISECONDS)).getStatus().isSuccess()) {
                  fi.polar.polarflow.util.d.b(a, "Cannot delete data items");
                  var2 = var3;
               }
            }
         } else {
            fi.polar.polarflow.util.d.b(a, "Failed: (GoogleApiClient result=" + var4 + ")");
         }

         this.b.disconnect();
         return var2;
      } else {
         throw new IllegalArgumentException("Path not specified");
      }
   }

   protected void a(Boolean var1) {
      if (this.e != null) {
         this.e.a(var1);
      }

   }

   // $FF: synthetic method
   protected Object doInBackground(Object[] var1) {
      return this.a((String[])var1);
   }

   // $FF: synthetic method
   protected void onPostExecute(Object var1) {
      this.a((Boolean)var1);
   }
}
