package fi.polar.polarflow.data.orm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.data.SportProfileDisplaySettings;
import fi.polar.polarflow.data.SportProfileSettings;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.SportProfile$PbSportProfile;
import fi.polar.remote.representation.protobuf.SportProfile$PbSportProfile$Builder;
import fi.polar.remote.representation.protobuf.SportProfile$PbSportProfileSettings;
import fi.polar.remote.representation.protobuf.SportProfile$PbSportProfileSettings$Builder;
import fi.polar.remote.representation.protobuf.SportProfile$PbSportProfileSettings$PbSpeedView;
import fi.polar.remote.representation.protobuf.SportprofileDisplays$PbSirius2DisplaySettings;
import fi.polar.remote.representation.protobuf.SportprofileMaseratiSettings$PbMaseratiSportProfileSettings;
import fi.polar.remote.representation.protobuf.SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbHeartRateZone;
import fi.polar.remote.representation.protobuf.Structures$PbHeartRateZone$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbZones;
import fi.polar.remote.representation.protobuf.Structures$PbZones$Builder;
import fi.polar.remote.representation.protobuf.Types$PbAutoLapSettings;
import fi.polar.remote.representation.protobuf.Types$PbAutoLapSettings$Builder;
import fi.polar.remote.representation.protobuf.Types$PbAutoLapSettings$PbAutomaticLap;
import fi.polar.remote.representation.protobuf.Types$PbGPSSetting;
import fi.polar.remote.representation.protobuf.Types$PbHeartRateView;
import fi.polar.remote.representation.protobuf.Types$PbHeartRateZoneSettingSource;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public class SportProfile extends ProtoPublishableEntity implements Parcelable {
   public static final Creator CREATOR;
   @Ignore
   private static final long IDENTIFIER_UNKNOWN = -1L;
   @Ignore
   public static final String KEY_SPORT_ID;
   @Ignore
   private static final String TAG = SportProfile.class.getSimpleName();
   private static final int VIBRATION_DEFAULT = -1;
   private static final int VIBRATION_OFF = 0;
   private static final int VIBRATION_ON = 1;
   private int automaticLap;
   private float automaticLapDistance;
   private long automaticLapDuration;
   private int enabledSensors;
   private int gpsSetting;
   private int heartRateSettingSource;
   private int heartRateView;
   private String heartRateZones;
   private long identifier;
   private String jsonDisplays;
   private long lastModified;
   private boolean lastModifiedTrusted;
   @Deprecated
   private long lastUsed;
   @Ignore
   private SportProfileDisplaySettings mDisplaySettings;
   @Ignore
   private SportProfileSettings mSettings;
   @Ignore
   private Sport mSport;
   private int sensorBroadcastingHr;
   private int speedViewType;
   private long sportId;
   private int vibration;

   static {
      KEY_SPORT_ID = TAG + ".KEY_SPORT_ID";
      CREATOR = new SportProfile$1();
   }

   public SportProfile() {
      this.sportId = -2L;
      this.identifier = -1L;
      this.lastUsed = 0L;
      this.lastModified = 0L;
      this.speedViewType = -1;
      this.enabledSensors = 0;
      this.sensorBroadcastingHr = -1;
      this.heartRateView = -1;
      this.gpsSetting = -1;
      this.automaticLapDuration = 0L;
      this.automaticLapDistance = 0.0F;
      this.automaticLap = -1;
      this.vibration = -1;
      this.jsonDisplays = "";
      this.heartRateZones = "";
      this.heartRateSettingSource = -1;
   }

   protected SportProfile(Parcel var1) {
      boolean var2 = false;
      super();
      this.sportId = -2L;
      this.identifier = -1L;
      this.lastUsed = 0L;
      this.lastModified = 0L;
      this.speedViewType = -1;
      this.enabledSensors = 0;
      this.sensorBroadcastingHr = -1;
      this.heartRateView = -1;
      this.gpsSetting = -1;
      this.automaticLapDuration = 0L;
      this.automaticLapDistance = 0.0F;
      this.automaticLap = -1;
      this.vibration = -1;
      this.jsonDisplays = "";
      this.heartRateZones = "";
      this.heartRateSettingSource = -1;
      this.sportId = var1.readLong();
      this.identifier = var1.readLong();
      this.lastUsed = var1.readLong();
      this.lastModified = var1.readLong();
      if (var1.readByte() != 0) {
         var2 = true;
      }

      this.lastModifiedTrusted = var2;
      this.speedViewType = var1.readInt();
      this.enabledSensors = var1.readInt();
      this.sensorBroadcastingHr = var1.readInt();
      this.heartRateView = var1.readInt();
      this.gpsSetting = var1.readInt();
      this.automaticLapDuration = var1.readLong();
      this.automaticLapDistance = var1.readFloat();
      this.automaticLap = var1.readInt();
      this.vibration = var1.readInt();
      this.jsonDisplays = var1.readString();
      this.heartRateZones = var1.readString();
      this.heartRateSettingSource = var1.readInt();
   }

   public SportProfile(SportProfile$PbSportProfile var1) {
      long var2 = -1L;
      super();
      this.sportId = -2L;
      this.identifier = -1L;
      this.lastUsed = 0L;
      this.lastModified = 0L;
      this.speedViewType = -1;
      this.enabledSensors = 0;
      this.sensorBroadcastingHr = -1;
      this.heartRateView = -1;
      this.gpsSetting = -1;
      this.automaticLapDuration = 0L;
      this.automaticLapDistance = 0.0F;
      this.automaticLap = -1;
      this.vibration = -1;
      this.jsonDisplays = "";
      this.heartRateZones = "";
      this.heartRateSettingSource = -1;
      this.sportId = var1.getSportIdentifier().getValue();
      if (var1.hasIdentifier()) {
         var2 = var1.getIdentifier();
      }

      this.identifier = var2;
      if (var1.hasLastModified()) {
         this.lastModified = q.b(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

      this.mSettings = new SportProfileSettings(var1.getSettings(), getPbGPSSetting(var1), getPbAutoLapSettings(var1), getPbHeartRateView(var1), this.getSport());
      this.updateSettingsValues();
      this.mDisplaySettings = new SportProfileDisplaySettings(getPbSirius2DisplaySettings(var1));
      this.jsonDisplays = this.mDisplaySettings.toJson();
      if (var1.hasMaseratiSettings()) {
         SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var5 = var1.getMaseratiSettings();
         if (var5.hasVibration()) {
            byte var4;
            if (var5.getVibration()) {
               var4 = 1;
            } else {
               var4 = 0;
            }

            this.vibration = var4;
         }
      }

   }

   public SportProfile(InputStream var1) {
      this(SportProfile$PbSportProfile.parseFrom(var1));
   }

   private Types$PbAutoLapSettings buildPbAutoLapSettings() {
      Types$PbAutoLapSettings var2;
      if (Types$PbAutoLapSettings$PbAutomaticLap.forNumber(this.automaticLap) != null) {
         Types$PbAutoLapSettings$Builder var1 = Types$PbAutoLapSettings.newBuilder();
         var1.setAutomaticLap(Types$PbAutoLapSettings$PbAutomaticLap.forNumber(this.automaticLap));
         if (this.automaticLapDistance != 0.0F) {
            var1.setAutomaticLapDistance(this.automaticLapDistance);
         }

         if (this.automaticLapDuration != 0L) {
            var1.setAutomaticLapDuration(q.b(this.automaticLapDuration));
         }

         var2 = var1.build();
      } else {
         var2 = null;
      }

      return var2;
   }

   private static Structures$PbHeartRateZone buildPbHeartRateZone(int var0, int var1) {
      Structures$PbHeartRateZone$Builder var2 = Structures$PbHeartRateZone.newBuilder();
      var2.setHigherLimit(var1);
      var2.setLowerLimit(var0);
      return var2.build();
   }

   private SportprofileMaseratiSettings$PbMaseratiSportProfileSettings buildPbMaseratiSportProfileSettings() {
      boolean var1 = true;
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder var2 = SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.newBuilder();
      if (this.vibration != -1) {
         if (this.vibration != 1) {
            var1 = false;
         }

         var2.setVibration(var1);
      }

      if (buildPbSirius2DisplaySettings(this.jsonDisplays) != null) {
         var2.setSirius2DisplaySettings(buildPbSirius2DisplaySettings(this.jsonDisplays));
      }

      if (Types$PbGPSSetting.forNumber(this.gpsSetting) != null) {
         var2.setGpsSetting(Types$PbGPSSetting.forNumber(this.gpsSetting));
      }

      Types$PbAutoLapSettings var3 = this.buildPbAutoLapSettings();
      if (var3 != null) {
         var2.setAutolapSettings(var3);
      }

      if (Types$PbHeartRateView.forNumber(this.heartRateView) != null) {
         var2.setHeartRateView(Types$PbHeartRateView.forNumber(this.heartRateView));
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var4;
      if (!var2.hasVibration() && !var2.hasSirius2DisplaySettings() && !var2.hasGpsSetting() && !var2.hasAutolapSettings() && !var2.hasHeartRateView()) {
         var4 = null;
      } else {
         var4 = var2.build();
      }

      return var4;
   }

   private static SportprofileDisplays$PbSirius2DisplaySettings buildPbSirius2DisplaySettings(String param0) {
      // $FF: Couldn't be decompiled
   }

   private SportProfile$PbSportProfileSettings buildPbSportProfileSettings() {
      boolean var1 = false;
      boolean var2 = true;
      SportProfile$PbSportProfileSettings$Builder var3 = SportProfile$PbSportProfileSettings.newBuilder();
      boolean var4;
      if (SportProfile$PbSportProfileSettings$PbSpeedView.forNumber(this.speedViewType) != null) {
         var3.setSpeedView(SportProfile$PbSportProfileSettings$PbSpeedView.forNumber(this.speedViewType));
         var4 = true;
      } else {
         var4 = false;
      }

      if (this.sensorBroadcastingHr != -1) {
         if (this.sensorBroadcastingHr == 1) {
            var1 = true;
         }

         var3.setSensorBroadcastingHr(var1);
         var4 = true;
      }

      if (Types$PbHeartRateView.forNumber(this.heartRateView) != null) {
         var3.setOBSOLETEHeartRateView(Types$PbHeartRateView.forNumber(this.heartRateView));
         var4 = true;
      }

      if (Types$PbGPSSetting.forNumber(this.gpsSetting) != null) {
         var3.setOBSOLETEGpsSetting(Types$PbGPSSetting.forNumber(this.gpsSetting));
         var4 = true;
      }

      Types$PbAutoLapSettings var5 = this.buildPbAutoLapSettings();
      if (var5 != null) {
         var3.setOBSOLETEAutolapSettings(var5);
         var4 = true;
      }

      Structures$PbZones var7 = buildPbZones(this.heartRateZones, this.heartRateSettingSource);
      if (var7 != null) {
         var3.setZoneLimits(var7);
         var4 = var2;
      }

      SportProfile$PbSportProfileSettings var6;
      if (var4) {
         var6 = var3.build();
      } else {
         var6 = null;
      }

      return var6;
   }

   private static Structures$PbZones buildPbZones(String var0, int var1) {
      Structures$PbZones$Builder var2 = Structures$PbZones.newBuilder();
      boolean var6;
      if (Types$PbHeartRateZoneSettingSource.forNumber(var1) != null) {
         var2.setHeartRateSettingSource(Types$PbHeartRateZoneSettingSource.forNumber(var1));
         var6 = true;
      } else {
         var6 = false;
      }

      for(Iterator var4 = q.e(var0).iterator(); var4.hasNext(); var6 = true) {
         int[] var3 = (int[])var4.next();
         var2.addHeartRateZone(buildPbHeartRateZone(var3[0], var3[1]));
      }

      Structures$PbZones var5;
      if (var6) {
         var5 = var2.build();
      } else {
         var5 = null;
      }

      return var5;
   }

   private static Sport findSportById(List var0, long var1) {
      Iterator var3 = var0.iterator();

      Sport var4;
      do {
         if (!var3.hasNext()) {
            var4 = null;
            break;
         }

         var4 = (Sport)var3.next();
      } while(var4.getSportId() != var1);

      return var4;
   }

   private static Types$PbAutoLapSettings getPbAutoLapSettings(SportProfile$PbSportProfile var0) {
      Types$PbAutoLapSettings var1;
      if (var0.hasMaseratiSettings() && var0.getMaseratiSettings().hasAutolapSettings()) {
         var1 = var0.getMaseratiSettings().getAutolapSettings();
      } else if (var0.hasSettings() && var0.getSettings().hasOBSOLETEAutolapSettings()) {
         var1 = var0.getSettings().getOBSOLETEAutolapSettings();
      } else {
         var1 = null;
      }

      return var1;
   }

   private static Types$PbGPSSetting getPbGPSSetting(SportProfile$PbSportProfile var0) {
      Types$PbGPSSetting var1;
      if (var0.hasMaseratiSettings() && var0.getMaseratiSettings().hasGpsSetting()) {
         var1 = var0.getMaseratiSettings().getGpsSetting();
      } else if (var0.hasSettings() && var0.getSettings().hasOBSOLETEGpsSetting()) {
         var1 = var0.getSettings().getOBSOLETEGpsSetting();
      } else {
         var1 = null;
      }

      return var1;
   }

   private static Types$PbHeartRateView getPbHeartRateView(SportProfile$PbSportProfile var0) {
      Types$PbHeartRateView var1;
      if (var0.hasMaseratiSettings() && var0.getMaseratiSettings().hasHeartRateView()) {
         var1 = var0.getMaseratiSettings().getHeartRateView();
      } else if (var0.hasSettings() && var0.getSettings().hasOBSOLETEHeartRateView()) {
         var1 = var0.getSettings().getOBSOLETEHeartRateView();
      } else {
         var1 = null;
      }

      return var1;
   }

   private static SportprofileDisplays$PbSirius2DisplaySettings getPbSirius2DisplaySettings(SportProfile$PbSportProfile var0) {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (var0.hasMaseratiSettings() && var0.getMaseratiSettings().hasSirius2DisplaySettings()) {
         var1 = var0.getMaseratiSettings().getSirius2DisplaySettings();
      } else if (var0.hasOBSOLETESirius2DisplaySettings()) {
         var1 = var0.getOBSOLETESirius2DisplaySettings();
      } else {
         var1 = null;
      }

      return var1;
   }

   public static SportProfile getSportProfileBySportId(long var0) {
      return getSportProfileBySportId(var0, true);
   }

   public static SportProfile getSportProfileBySportId(long var0, boolean var2) {
      SportProfile var3 = Training.getInstance().getSportProfile();
      SportProfile var4;
      if (var3 != null) {
         var4 = var3;
         if (var3.getSportId() == var0) {
            return var4;
         }
      }

      List var5 = find(SportProfile.class, "SPORT_ID=?", new String[]{String.valueOf(var0)});
      if (var5.size() > 0) {
         var4 = (SportProfile)var5.get(0);
      } else {
         if (var2) {
            d.c(TAG, "", new IllegalStateException("no database entry for SportProfile with sportId= " + var0));
         }

         var4 = null;
      }

      return var4;
   }

   public static List listAllInOrder() {
      return find(SportProfile.class, (String)null, (String[])null, (String)null, "cast(substr(PATH,12) AS INTEGER)", (String)null);
   }

   public static void setSport(List var0, List var1) {
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         SportProfile var3 = (SportProfile)var2.next();
         Sport var4 = findSportById(var1, var3.getSportId());
         if (var4 != null) {
            var3.setSport(var4);
         }
      }

   }

   private void updateSettingsValues() {
      if (this.mSettings != null) {
         this.enabledSensors = this.mSettings.getEnabledSensors();
         this.speedViewType = this.mSettings.getSpeedViewType();
         this.sensorBroadcastingHr = this.mSettings.getSensorBroadcastingHr();
         this.heartRateView = this.mSettings.getHeartRateView();
         this.gpsSetting = this.mSettings.getGpsSettingValue();
         this.automaticLapDuration = this.mSettings.getAutomaticLapDuration();
         this.automaticLapDistance = this.mSettings.getAutomaticLapDistance();
         this.automaticLap = this.mSettings.getAutomaticLap();
         this.heartRateZones = (new JSONArray(this.mSettings.getHeartRateZones())).toString();
         this.heartRateSettingSource = this.mSettings.getHearRateSettingSource();
      }

   }

   public int describeContents() {
      return 0;
   }

   public String getBasename() {
      return "PROFILE";
   }

   public SportProfileDisplaySettings getDisplaySettings() {
      if (this.mDisplaySettings == null) {
         SportprofileDisplays$PbSirius2DisplaySettings var1 = buildPbSirius2DisplaySettings(this.jsonDisplays);
         if (var1 != null) {
            this.mDisplaySettings = new SportProfileDisplaySettings(var1);
         } else {
            d.c(TAG, "", new IllegalStateException("JsonDisplay string is empty"));
         }
      }

      return this.mDisplaySettings;
   }

   public SportProfileSettings getSettings() {
      if (this.mSettings == null) {
         this.mSettings = new SportProfileSettings(this.buildPbSportProfileSettings(), Types$PbGPSSetting.forNumber(this.gpsSetting), this.buildPbAutoLapSettings(), Types$PbHeartRateView.forNumber(this.heartRateView), this.getSport());
      }

      return this.mSettings;
   }

   public Sport getSport() {
      if (this.mSport == null && this.sportId != -2L) {
         List var1 = Sport.find(Sport.class, "SPORT_ID=?", new String[]{String.valueOf(this.sportId)});
         if (var1.size() > 0) {
            this.mSport = (Sport)var1.get(0);
         } else {
            d.b(TAG, "no database entry for sportId= " + this.sportId);
         }
      }

      return this.mSport;
   }

   public long getSportId() {
      return this.sportId;
   }

   public boolean getVibration() {
      boolean var1;
      if (this.vibration != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public long save() {
      this.updateSettingsValues();
      if (this.mDisplaySettings != null) {
         this.jsonDisplays = this.mDisplaySettings.toJson();
      }

      return super.save();
   }

   void setLastModified(long var1, boolean var3) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var3;
   }

   public void setSport(Sport var1) {
      this.mSport = var1;
      this.sportId = var1.getSportId();
   }

   public SportProfile$PbSportProfile toPbObject() {
      SportProfile$PbSportProfile$Builder var1 = SportProfile$PbSportProfile.newBuilder();
      if (this.identifier != -1L) {
         var1.setIdentifier(this.identifier);
      }

      var1.getSportIdentifierBuilder().setValue(this.sportId);
      SportProfile$PbSportProfileSettings var2 = this.buildPbSportProfileSettings();
      if (var2 != null) {
         var1.setSettings(var2);
      }

      SportprofileDisplays$PbSirius2DisplaySettings var3 = buildPbSirius2DisplaySettings(this.jsonDisplays);
      if (var3 != null) {
         var1.setOBSOLETESirius2DisplaySettings(var3);
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var4 = this.buildPbMaseratiSportProfileSettings();
      if (var4 != null) {
         var1.setMaseratiSettings(var4);
      }

      if (this.lastModified != 0L) {
         var1.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      return var1.build();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeLong(this.sportId);
      var1.writeLong(this.identifier);
      var1.writeLong(this.lastUsed);
      var1.writeLong(this.lastModified);
      byte var3;
      if (this.lastModifiedTrusted) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      var1.writeByte((byte)var3);
      var1.writeInt(this.speedViewType);
      var1.writeInt(this.enabledSensors);
      var1.writeInt(this.sensorBroadcastingHr);
      var1.writeInt(this.heartRateView);
      var1.writeInt(this.gpsSetting);
      var1.writeLong(this.automaticLapDuration);
      var1.writeFloat(this.automaticLapDistance);
      var1.writeInt(this.automaticLap);
      var1.writeInt(this.vibration);
      var1.writeString(this.jsonDisplays);
      var1.writeString(this.heartRateZones);
      var1.writeInt(this.heartRateSettingSource);
   }
}
