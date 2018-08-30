package fi.polar.polarflow.data;

import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.SportProfile$PbSportProfileSettings;
import fi.polar.remote.representation.protobuf.Structures$PbHeartRateZone;
import fi.polar.remote.representation.protobuf.Types$PbAutoLapSettings;
import fi.polar.remote.representation.protobuf.Types$PbGPSSetting;
import fi.polar.remote.representation.protobuf.Types$PbHeartRateView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SportProfileSettings {
   public static final int SENSOR_ACCELEROMETER = 16;
   public static final int SENSOR_BIKE = 2;
   public static final int SENSOR_GPS = 4;
   public static final int SENSOR_HR = 1;
   public static final int SENSOR_RUNNING_CADENCE = 8;
   private int mAutomaticLap = -1;
   private float mAutomaticLapDistance = 0.0F;
   private long mAutomaticLapDuration = 0L;
   private int mEnabledSensors = 0;
   private int mGpsSettingValue = -1;
   private int mHearRateSettingSource = -1;
   private int mHeartRateViewValue = -1;
   private final List mHeartRateZones;
   private int mSensorBroadcastingHr = -1;
   private int mSpeedViewType = -1;
   private long mSportId = -1L;

   public SportProfileSettings() {
      this.mHeartRateZones = new ArrayList();
   }

   public SportProfileSettings(SportProfile$PbSportProfileSettings var1, Types$PbGPSSetting var2, Types$PbAutoLapSettings var3, Types$PbHeartRateView var4, Sport var5) {
      if (var4 != null) {
         this.mHeartRateViewValue = var4.getNumber();
         this.mEnabledSensors |= 1;
      }

      if (var2 != null) {
         this.mGpsSettingValue = var2.getNumber();
         if (var2.getNumber() != 0) {
            this.mEnabledSensors |= 4;
         }
      }

      if (var5 != null) {
         long var6 = var5.getParentId();
         this.mSportId = var5.getSportId();
         if (var6 != 1L && this.mSportId != 3L) {
            if (this.isSwimmingSport()) {
               this.mEnabledSensors |= 16;
               this.mEnabledSensors &= -5;
            }
         } else {
            this.mEnabledSensors |= 8;
         }
      }

      if (var1.hasSpeedView()) {
         this.mSpeedViewType = var1.getSpeedView().getNumber();
      }

      if (var1.hasSensorBroadcastingHr()) {
         byte var8;
         if (var1.getSensorBroadcastingHr()) {
            var8 = 1;
         } else {
            var8 = 0;
         }

         this.mSensorBroadcastingHr = var8;
      }

      if (var3 != null) {
         this.mAutomaticLap = var3.getAutomaticLap().getNumber();
         this.mAutomaticLapDistance = var3.getAutomaticLapDistance();
         this.mAutomaticLapDuration = q.a(var3.getAutomaticLapDuration());
      }

      this.mHeartRateZones = new ArrayList();
      if (var1.hasZoneLimits()) {
         if (var1.getZoneLimits().hasHeartRateSettingSource()) {
            this.mHearRateSettingSource = var1.getZoneLimits().getHeartRateSettingSource().getNumber();
         }

         Iterator var10 = var1.getZoneLimits().getHeartRateZoneList().iterator();

         while(var10.hasNext()) {
            Structures$PbHeartRateZone var9 = (Structures$PbHeartRateZone)var10.next();
            this.mHeartRateZones.add(new int[]{var9.getLowerLimit(), var9.getHigherLimit()});
         }
      }

   }

   public int getAutomaticLap() {
      return this.mAutomaticLap;
   }

   public float getAutomaticLapDistance() {
      return this.mAutomaticLapDistance;
   }

   public long getAutomaticLapDuration() {
      return this.mAutomaticLapDuration;
   }

   public int getEnabledSensors() {
      return this.mEnabledSensors;
   }

   public int getGpsSettingValue() {
      return this.mGpsSettingValue;
   }

   public int getHearRateSettingSource() {
      return this.mHearRateSettingSource;
   }

   public int getHeartRateView() {
      return this.mHeartRateViewValue;
   }

   public List getHeartRateZones() {
      return this.mHeartRateZones;
   }

   public int getSensorBroadcastingHr() {
      return this.mSensorBroadcastingHr;
   }

   public int getSpeedViewType() {
      return this.mSpeedViewType;
   }

   public boolean isSensorEnabled(int var1) {
      boolean var2;
      if ((this.mEnabledSensors & var1) == var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean isSwimmingSport() {
      return Sport.isSwimmingSport(this.mSportId);
   }

   public void setAutomaticLap(int var1) {
      this.mAutomaticLap = var1;
   }

   public void setAutomaticLapDistance(float var1) {
      this.mAutomaticLapDistance = var1;
   }

   public void setAutomaticLapDuration(long var1) {
      this.mAutomaticLapDuration = var1;
   }

   public void setEnabledSensors(int var1) {
      this.mEnabledSensors = var1;
   }

   public void setGpsSettingValue(int var1) {
      this.mGpsSettingValue = var1;
   }

   public void setHeartRateView(int var1) {
      this.mHeartRateViewValue = var1;
   }

   public void setSensorBroadcastingHr(boolean var1) {
      byte var2;
      if (var1) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      this.mSensorBroadcastingHr = var2;
   }

   public void setSpeedView(int var1) {
      this.mSpeedViewType = var1;
   }
}
