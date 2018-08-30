package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.polarmathsmart.types.zones.HeartRateZoneLimits;
import fi.polar.remote.representation.protobuf.Structures$PbHeartRateZone;
import fi.polar.remote.representation.protobuf.Structures$PbHeartRateZone$Builder;
import fi.polar.remote.representation.protobuf.Types$PbHeartRateZoneSettingSource;
import fi.polar.remote.representation.protobuf.Zones$PbRecordedHeartRateZone;
import fi.polar.remote.representation.protobuf.Zones$PbRecordedHeartRateZone$Builder;
import fi.polar.remote.representation.protobuf.Zones$PbRecordedZones;
import fi.polar.remote.representation.protobuf.Zones$PbRecordedZones$Builder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

public class Zones extends ProtoPublishableEntity {
   public static final int HR_ZONE_SETTING_SOURCE_DEFAULT = 0;
   public static final int HR_ZONE_SETTING_SOURCE_FREE = 2;
   public static final int HR_ZONE_SETTING_SOURCE_NONE = -1;
   public static final int HR_ZONE_SETTING_SOURCE_THRESHOLD = 1;
   private static final String TAG = Zones.class.getSimpleName();
   private Exercise exercise;
   private int heartRateSettingSource;
   private String heartRateZones;
   @Ignore
   private List mHrZoneLimitList;
   private long timeInZone1;
   private long timeInZone2;
   private long timeInZone3;
   private long timeInZone4;
   private long timeInZone5;

   public Zones() {
   }

   public Zones(Zones$PbRecordedZones var1) {
      this();
      List var2 = var1.getHeartRateZoneList();
      this.mHrZoneLimitList = new ArrayList();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         Structures$PbHeartRateZone var4 = ((Zones$PbRecordedHeartRateZone)var3.next()).getZoneLimits();
         this.mHrZoneLimitList.add(new int[]{var4.getLowerLimit(), var4.getHigherLimit()});
      }

      this.heartRateZones = (new JSONArray(this.mHrZoneLimitList)).toString();
      this.timeInZone1 = q.a(((Zones$PbRecordedHeartRateZone)var2.get(0)).getInZone());
      this.timeInZone2 = q.a(((Zones$PbRecordedHeartRateZone)var2.get(1)).getInZone());
      this.timeInZone3 = q.a(((Zones$PbRecordedHeartRateZone)var2.get(2)).getInZone());
      this.timeInZone4 = q.a(((Zones$PbRecordedHeartRateZone)var2.get(3)).getInZone());
      this.timeInZone5 = q.a(((Zones$PbRecordedHeartRateZone)var2.get(4)).getInZone());
      if (var1.hasHeartRateSettingSource()) {
         this.heartRateSettingSource = var1.getHeartRateSettingSource().getNumber();
      } else {
         this.heartRateSettingSource = -1;
      }

   }

   public Zones(InputStream var1) {
      this(Zones$PbRecordedZones.parseFrom(var1));
   }

   private Structures$PbHeartRateZone buildPbHeartRateZone(int var1, int var2) {
      Structures$PbHeartRateZone$Builder var3 = Structures$PbHeartRateZone.newBuilder();
      var3.setHigherLimit(var2);
      var3.setLowerLimit(var1);
      return var3.build();
   }

   private Zones$PbRecordedHeartRateZone buildPbRecordedHeartRateZone(long var1, int[] var3) {
      Zones$PbRecordedHeartRateZone$Builder var4 = Zones$PbRecordedHeartRateZone.newBuilder();
      var4.setInZone(q.b(var1));
      var4.setZoneLimits(this.buildPbHeartRateZone(var3[0], var3[1]));
      return var4.build();
   }

   public static Zones findByPath(String var0) {
      Object var1 = null;
      Zones var3;
      if (var0 == null) {
         var3 = (Zones)var1;
      } else {
         List var2 = find(Zones.class, "PATH = ?", new String[]{var0});
         var3 = (Zones)var1;
         if (!var2.isEmpty()) {
            var3 = (Zones)var2.get(0);
         }
      }

      return var3;
   }

   public static int getCurrentHrZone(int var0, List var1) {
      byte var2 = 4;
      byte var3;
      if (heartRateInZone(var0, 4, var1)) {
         var3 = var2;
      } else if (heartRateInZone(var0, 3, var1)) {
         var3 = 3;
      } else if (heartRateInZone(var0, 2, var1)) {
         var3 = 2;
      } else if (heartRateInZone(var0, 1, var1)) {
         var3 = 1;
      } else if (heartRateInZone(var0, 0, var1)) {
         var3 = 0;
      } else {
         var3 = -1;
      }

      return var3;
   }

   public static HeartRateZoneLimits getHeartRateZoneLimits(Training var0) {
      Zones var1 = var0.getZones();
      HeartRateZoneLimits var3 = new HeartRateZoneLimits(var1.mHrZoneLimitList.size());

      for(int var2 = 0; var2 < var1.mHrZoneLimitList.size(); ++var2) {
         var3.setValue(var2, (short)((int[])var1.mHrZoneLimitList.get(var2))[0]);
      }

      var3.setUpperLimitForLastZone((short)((int[])var1.mHrZoneLimitList.get(var1.mHrZoneLimitList.size() - 1))[1]);
      return var3;
   }

   public static boolean heartRateInZone(int var0, int var1, List var2) {
      boolean var3;
      if (var1 == 4) {
         if (var0 >= ((int[])var2.get(var1))[0] && var0 <= ((int[])var2.get(var1))[1] + 5) {
            var3 = true;
            return var3;
         }
      } else if (var0 >= ((int[])var2.get(var1))[0] && var0 <= ((int[])var2.get(var1))[1]) {
         var3 = true;
         return var3;
      }

      var3 = false;
      return var3;
   }

   private void updatePath() {
      if (this.getExercise() == null) {
         d.c(TAG, "", new IllegalStateException("No Exercise entity associated or loaded, cannot create path."));
      } else {
         this.path = this.getExercise().getPath();
      }

   }

   public void addHeartRateSample(int var1) {
      if (heartRateInZone(var1, 4, this.mHrZoneLimitList)) {
         this.timeInZone5 += TimeUnit.SECONDS.toMillis(1L);
      } else if (heartRateInZone(var1, 3, this.mHrZoneLimitList)) {
         this.timeInZone4 += TimeUnit.SECONDS.toMillis(1L);
      } else if (heartRateInZone(var1, 2, this.mHrZoneLimitList)) {
         this.timeInZone3 += TimeUnit.SECONDS.toMillis(1L);
      } else if (heartRateInZone(var1, 1, this.mHrZoneLimitList)) {
         this.timeInZone2 += TimeUnit.SECONDS.toMillis(1L);
      } else if (heartRateInZone(var1, 0, this.mHrZoneLimitList)) {
         this.timeInZone1 += TimeUnit.SECONDS.toMillis(1L);
      }

   }

   public String getBasename() {
      return "ZONES";
   }

   public Exercise getExercise() {
      return this.exercise;
   }

   int getHeartRateSettingSource() {
      return this.heartRateSettingSource;
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   public long getTimeInHrZone(int var1) {
      long var2;
      switch(var1) {
      case 0:
         var2 = this.timeInZone1;
         break;
      case 1:
         var2 = this.timeInZone2;
         break;
      case 2:
         var2 = this.timeInZone3;
         break;
      case 3:
         var2 = this.timeInZone4;
         break;
      default:
         var2 = this.timeInZone5;
      }

      return var2;
   }

   public long[] getTimeInZones() {
      return new long[]{this.timeInZone1, this.timeInZone2, this.timeInZone3, this.timeInZone4, this.timeInZone5};
   }

   public List getZoneLimits() {
      return this.mHrZoneLimitList;
   }

   public void setExercise(Exercise var1) {
      this.exercise = var1;
      this.updatePath();
   }

   public void setHeartRateZones(List var1) {
      this.mHrZoneLimitList = var1;
      this.heartRateZones = (new JSONArray(var1)).toString();
   }

   public void setHrZoneSettingSource(int var1) {
      this.heartRateSettingSource = var1;
   }

   public Zones$PbRecordedZones toPbObject() {
      Zones$PbRecordedZones$Builder var1 = Zones$PbRecordedZones.newBuilder();
      if (this.heartRateSettingSource != -1) {
         var1.setHeartRateSettingSource(Types$PbHeartRateZoneSettingSource.forNumber(this.heartRateSettingSource));
      }

      var1.addHeartRateZone(0, (Zones$PbRecordedHeartRateZone)this.buildPbRecordedHeartRateZone(this.timeInZone1, (int[])this.mHrZoneLimitList.get(0)));
      var1.addHeartRateZone(1, (Zones$PbRecordedHeartRateZone)this.buildPbRecordedHeartRateZone(this.timeInZone2, (int[])this.mHrZoneLimitList.get(1)));
      var1.addHeartRateZone(2, (Zones$PbRecordedHeartRateZone)this.buildPbRecordedHeartRateZone(this.timeInZone3, (int[])this.mHrZoneLimitList.get(2)));
      var1.addHeartRateZone(3, (Zones$PbRecordedHeartRateZone)this.buildPbRecordedHeartRateZone(this.timeInZone4, (int[])this.mHrZoneLimitList.get(3)));
      var1.addHeartRateZone(4, (Zones$PbRecordedHeartRateZone)this.buildPbRecordedHeartRateZone(this.timeInZone5, (int[])this.mHrZoneLimitList.get(4)));
      return var1.build();
   }

   public String toString() {
      String var1 = System.getProperty("line.separator");
      return var1 + "------------------" + this.getClass().getSimpleName() + var1 + "------------------";
   }
}
