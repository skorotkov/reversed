package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.Types$PbDeviceLocation;
import fi.polar.remote.representation.protobuf.Types$PbHandedness;
import fi.polar.remote.representation.protobuf.UserDeviceSettings$PbUserDeviceGeneralSettings;
import fi.polar.remote.representation.protobuf.UserDeviceSettings$PbUserDeviceGeneralSettings$Builder;
import fi.polar.remote.representation.protobuf.UserDeviceSettings$PbUserDeviceSettings;
import fi.polar.remote.representation.protobuf.UserDeviceSettings$PbUserDeviceSettings$Builder;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserDeviceSettings extends ProtoPublishableEntity implements Mergeable {
   private static final String DEFAULT_DEVICE_PATH = "/U/0/S/";
   public static final int DEVICE_LOCATION_UNDEFINED = 0;
   public static final int DEVICE_LOCATION_WRIST_LEFT = 2;
   public static final int DEVICE_LOCATION_WRIST_RIGHT = 3;
   static final int HANDEDNESS_LEFT = 1;
   static final int HANDEDNESS_RIGHT = 2;
   static final int HANDEDNESS_UNDEFINED = Integer.MAX_VALUE;
   private static final String TAG = "UserDeviceSettings";
   private int deviceLocation;
   private int handedness;
   private Date lastModified;
   private boolean lastModifiedTrusted;

   public UserDeviceSettings() {
      this.deviceLocation = 0;
      this.handedness = Integer.MAX_VALUE;
      this.setPath("/U/0/S/");
   }

   public UserDeviceSettings(UserDeviceSettings$PbUserDeviceSettings var1) {
      this();
      if (var1.hasGeneralSettings()) {
         UserDeviceSettings$PbUserDeviceGeneralSettings var2 = var1.getGeneralSettings();
         if (var2.hasOBSOLETEHandedness()) {
            this.handedness = var2.getOBSOLETEHandedness().getNumber();
         }

         if (var2.hasDeviceLocation()) {
            this.deviceLocation = var2.getDeviceLocation().getNumber();
            if (this.deviceLocation != 3 && this.deviceLocation != 2) {
               d.e("UserDeviceSettings", "Device location which is not supported by device was given: " + this.deviceLocation);
            }
         }
      }

      if (var1.hasLastModified()) {
         this.lastModified = q.a(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

   }

   public UserDeviceSettings(InputStream var1) {
      this(UserDeviceSettings$PbUserDeviceSettings.parseFrom(var1));
   }

   private UserDeviceSettings$PbUserDeviceGeneralSettings buildPbUserDeviceGeneralSettings() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$Builder var1 = UserDeviceSettings$PbUserDeviceGeneralSettings.newBuilder();
      if (this.handedness != Integer.MAX_VALUE) {
         var1.setOBSOLETEHandedness(Types$PbHandedness.forNumber(this.handedness));
      }

      if (this.deviceLocation != 0) {
         var1.setDeviceLocation(Types$PbDeviceLocation.forNumber(this.deviceLocation));
      }

      return var1.build();
   }

   public static int getUsersDeviceLocation() {
      byte var0 = 3;
      byte var1 = 2;
      List var2 = listAll(UserDeviceSettings.class);
      byte var3 = var1;
      if (!var2.isEmpty()) {
         UserDeviceSettings var4 = (UserDeviceSettings)var2.get(0);
         if (var4.deviceLocation != 0) {
            if (var4.deviceLocation == 3) {
               var3 = 3;
            } else {
               var3 = 2;
            }
         } else {
            var3 = var1;
            if (var4.handedness != Integer.MAX_VALUE) {
               if (var4.handedness == 2) {
                  var3 = var0;
               } else {
                  var3 = 2;
               }
            }
         }
      }

      return var3;
   }

   public String getBasename() {
      return "UDEVSET";
   }

   public int getDeviceLocation() {
      return this.deviceLocation;
   }

   public int getHandedness() {
      return this.handedness;
   }

   public Date getLastModified() {
      return this.lastModified;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public void merge(UserDeviceSettings var1) {
      if (q.a(this.lastModified, var1.lastModified)) {
         this.lastModified = var1.lastModified;
         this.lastModifiedTrusted = var1.lastModifiedTrusted;
         this.handedness = var1.handedness;
         this.deviceLocation = var1.deviceLocation;
      }

   }

   public void setDeviceLocation(int var1) {
      this.deviceLocation = var1;
   }

   public void setHandedness(int var1) {
      this.handedness = var1;
   }

   public void setLastModified(Date var1, boolean var2) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var2;
   }

   public UserDeviceSettings$PbUserDeviceSettings toPbObject() {
      UserDeviceSettings$PbUserDeviceSettings$Builder var1 = UserDeviceSettings$PbUserDeviceSettings.newBuilder();
      var1.setGeneralSettings(this.buildPbUserDeviceGeneralSettings());
      if (this.lastModified != null) {
         var1.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      return var1.build();
   }
}
