package fi.polar.polarflow.data;

import android.content.Context;
import android.text.TextUtils;
import fi.polar.polarflow.service.datalayer.at;
import fi.polar.polarflow.service.datalayer.s;
import fi.polar.polarflow.service.datalayer.t;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.Device$PbDeviceInfo;
import fi.polar.remote.representation.protobuf.Device$PbDeviceInfo$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbVersion;

public class DeviceInfo implements ProtoPublishable {
   private static final String FILE_PATH = "/DEVICE.BPB";
   private String mAndroidVersion;
   private String mBuildId;
   private String mDeviceId;
   private String mHardwareCode;
   private String mModelName;
   private String mPolarAppVersion;
   private String mProductColor;
   private String mProductDesign;

   public DeviceInfo() {
   }

   public DeviceInfo(String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8) {
      this.mDeviceId = var1;
      this.mModelName = var2;
      this.mHardwareCode = var3;
      this.mProductColor = var4;
      this.mProductDesign = var5;
      this.mAndroidVersion = var6;
      this.mBuildId = var7;
      this.mPolarAppVersion = var8;
   }

   public s createDataLayerRequest() {
      return this.createDataLayerRequest("/DEVICE.BPB");
   }

   public s createDataLayerRequest(String var1) {
      return new s(0, var1, this.toByteArray());
   }

   public String getDeviceId() {
      return this.mDeviceId;
   }

   public String getHardwareCode() {
      return this.mHardwareCode;
   }

   public String getModelName() {
      return this.mModelName;
   }

   public String getPolarAppVersion() {
      return this.mPolarAppVersion;
   }

   public String getProductColor() {
      return this.mProductColor;
   }

   public String getProductDesign() {
      return this.mProductDesign;
   }

   public void publish(Context var1) {
      this.publish(var1, "/DEVICE.BPB");
   }

   public void publish(Context var1, OnPublishedListener var2) {
      this.publish(var1, "/DEVICE.BPB", (OnPublishedListener)null);
   }

   public void publish(Context var1, String var2) {
      this.publish(var1, var2, (OnPublishedListener)null);
   }

   public void publish(Context var1, String var2, OnPublishedListener var3) {
      t var4 = new t(var1);
      if (var3 != null) {
         var4.a((at)(new DeviceInfo$1(this, var3)));
      }

      var4.execute(new s[]{this.createDataLayerRequest(var2)});
   }

   public void setDeviceId(String var1) {
      this.mDeviceId = var1;
   }

   public void setHardwareCode(String var1) {
      this.mHardwareCode = var1;
   }

   public void setModelName(String var1) {
      this.mModelName = var1;
   }

   public void setProductColor(String var1) {
      this.mProductColor = var1;
   }

   public void setProductDesign(String var1) {
      this.mProductDesign = var1;
   }

   public byte[] toByteArray() {
      return this.toPbObject().toByteArray();
   }

   public Device$PbDeviceInfo toPbObject() {
      Device$PbDeviceInfo$Builder var1 = Device$PbDeviceInfo.newBuilder();
      Structures$PbVersion var2 = q.a(this.mAndroidVersion, this.mBuildId);
      if (var2 != null) {
         var1.setPlatformVersion(var2);
      }

      var2 = q.a((String)this.mPolarAppVersion, (String)null);
      if (var2 != null) {
         var1.setDeviceVersion(var2);
      }

      if (!TextUtils.isEmpty(this.mDeviceId)) {
         var1.setDeviceID(this.mDeviceId);
      }

      if (!TextUtils.isEmpty(this.mModelName)) {
         var1.setModelName(this.mModelName);
      }

      if (!TextUtils.isEmpty(this.mHardwareCode)) {
         var1.setHardwareCode(this.mHardwareCode);
      }

      if (!TextUtils.isEmpty(this.mProductColor)) {
         var1.setProductColor(this.mProductColor);
      }

      if (!TextUtils.isEmpty(this.mProductDesign)) {
         var1.setProductDesign(this.mProductDesign);
      }

      return var1.build();
   }
}
