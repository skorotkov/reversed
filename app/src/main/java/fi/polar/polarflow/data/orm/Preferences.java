package fi.polar.polarflow.data.orm;

import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.polarflow.util.r;
import fi.polar.remote.representation.protobuf.Preferences$PbGeneralPreferences;
import fi.polar.remote.representation.protobuf.Preferences$PbGeneralPreferences$Builder;
import fi.polar.remote.representation.protobuf.Preferences$PbLocalizationPreferences;
import fi.polar.remote.representation.protobuf.Preferences$PbLocalizationPreferences$Builder;
import fi.polar.remote.representation.protobuf.Preferences$PbTrainingPreferences;
import fi.polar.remote.representation.protobuf.Preferences$PbTrainingPreferences$Builder;
import fi.polar.remote.representation.protobuf.Types$PbDateFormat;
import fi.polar.remote.representation.protobuf.Types$PbDateFormatSeparator;
import fi.polar.remote.representation.protobuf.Types$PbHeartRateView;
import fi.polar.remote.representation.protobuf.Types$PbStartDayOfWeek;
import fi.polar.remote.representation.protobuf.Types$PbTimeFormat;
import fi.polar.remote.representation.protobuf.Types$PbTimeFormatSeparator;
import fi.polar.remote.representation.protobuf.Types$PbUnitSystem;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Preferences extends ProtoPublishableEntity implements Mergeable {
   public static final int DATE_FORMAT_DD_MM_YYYY = 1;
   public static final int DATE_FORMAT_MM_DD_YYYY = 2;
   public static final int DATE_FORMAT_SEPARATOR_DOT = 1;
   public static final int DATE_FORMAT_SEPARATOR_HYPHEN = 3;
   public static final int DATE_FORMAT_SEPARATOR_SLASH = 2;
   public static final int DATE_FORMAT_SEPARATOR_UNDEFINED = Integer.MAX_VALUE;
   public static final int DATE_FORMAT_UNDEFINED = Integer.MAX_VALUE;
   public static final int DATE_FORMAT_YYYY_MM_DD = 3;
   private static final String DEFAULT_DEVICE_PATH = "/U/0/S/";
   public static final int FIRST_DAY_OF_WEEK_MONDAY = 1;
   public static final int FIRST_DAY_OF_WEEK_SATURDAY = 2;
   public static final int FIRST_DAY_OF_WEEK_SUNDAY = 3;
   public static final int FIRST_DAY_OF_WEEK_UNDEFINED = Integer.MAX_VALUE;
   public static final int HR_VIEW_BPM = 1;
   public static final int HR_VIEW_PERCENTS_OF_HR_RESERVE = 2;
   public static final int HR_VIEW_PERCENTS_OF_MAX_HR = 3;
   public static final int HR_VIEW_UNDEFINED = Integer.MAX_VALUE;
   private static final String TAG = Preferences.class.getSimpleName();
   public static final int TIME_FORMAT_12H = 2;
   public static final int TIME_FORMAT_24H = 1;
   public static final int TIME_FORMAT_SEPARATOR_COLON = 2;
   public static final int TIME_FORMAT_SEPARATOR_DOT = 1;
   public static final int TIME_FORMAT_SEPARATOR_UNDEFINED = Integer.MAX_VALUE;
   public static final int TIME_FORMAT_UNDEFINED = Integer.MAX_VALUE;
   public static final int UNIT_SYSTEM_IMPERIAL = 2;
   public static final int UNIT_SYSTEM_METRIC = 1;
   public static final int UNIT_SYSTEM_UNDEFINED = Integer.MAX_VALUE;
   private int dateFormat;
   private int dateFormatSeparator;
   private int firstDayOfWeek;
   private int heartRateView;
   private Date lastModified;
   private boolean lastModifiedTrusted;
   private int timeFormat;
   private int timeFormatSeparator;
   private int unitSystem;

   public Preferences() {
      this.unitSystem = Integer.MAX_VALUE;
      this.timeFormat = Integer.MAX_VALUE;
      this.timeFormatSeparator = Integer.MAX_VALUE;
      this.dateFormat = Integer.MAX_VALUE;
      this.dateFormatSeparator = Integer.MAX_VALUE;
      this.firstDayOfWeek = Integer.MAX_VALUE;
      this.heartRateView = Integer.MAX_VALUE;
      this.lastModified = null;
      this.lastModifiedTrusted = false;
      this.path = "/U/0/S/";
   }

   public Preferences(Preferences$PbGeneralPreferences var1) {
      this();
      if (var1.hasLocalizationPreferences()) {
         Preferences$PbLocalizationPreferences var2 = var1.getLocalizationPreferences();
         if (var2.hasUnitSystem()) {
            this.unitSystem = var2.getUnitSystem().getNumber();
         }

         if (var2.hasTimeFormat()) {
            this.timeFormat = var2.getTimeFormat().getNumber();
         }

         if (var2.hasTimeFormatSeparator()) {
            this.timeFormatSeparator = var2.getTimeFormatSeparator().getNumber();
         }

         if (var2.hasDateFormat()) {
            this.dateFormat = var2.getDateFormat().getNumber();
         }

         if (var2.hasDateFormatSeparator()) {
            this.dateFormatSeparator = var2.getDateFormatSeparator().getNumber();
         }

         if (var2.hasFirstdayOfWeek()) {
            this.firstDayOfWeek = var2.getFirstdayOfWeek().getNumber();
         }
      }

      if (var1.hasTrainingPreferences()) {
         Preferences$PbTrainingPreferences var3 = var1.getTrainingPreferences();
         if (var3.hasHeartRateView()) {
            this.heartRateView = var3.getHeartRateView().getNumber();
         }
      }

      if (var1.hasLastModified()) {
         this.lastModified = q.a(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

   }

   public Preferences(InputStream var1) {
      this(Preferences$PbGeneralPreferences.parseFrom(var1));
   }

   private Preferences$PbLocalizationPreferences buildPbLocalizationPreferences() {
      Preferences$PbLocalizationPreferences$Builder var1 = Preferences$PbLocalizationPreferences.newBuilder();
      if (this.unitSystem != Integer.MAX_VALUE) {
         var1.setUnitSystem(Types$PbUnitSystem.forNumber(this.unitSystem));
      }

      if (this.timeFormat != Integer.MAX_VALUE) {
         var1.setTimeFormat(Types$PbTimeFormat.forNumber(this.timeFormat));
      }

      if (this.timeFormatSeparator != Integer.MAX_VALUE) {
         var1.setTimeFormatSeparator(Types$PbTimeFormatSeparator.forNumber(this.timeFormatSeparator));
      }

      if (this.dateFormat != Integer.MAX_VALUE) {
         var1.setDateFormat(Types$PbDateFormat.forNumber(this.dateFormat));
      }

      if (this.dateFormatSeparator != Integer.MAX_VALUE) {
         var1.setDateFormatSeparator(Types$PbDateFormatSeparator.forNumber(this.dateFormatSeparator));
      }

      if (this.firstDayOfWeek != Integer.MAX_VALUE) {
         var1.setFirstdayOfWeek(Types$PbStartDayOfWeek.forNumber(this.firstDayOfWeek));
      }

      return var1.build();
   }

   private Preferences$PbTrainingPreferences buildPbTrainingPreferences() {
      Preferences$PbTrainingPreferences$Builder var1 = Preferences$PbTrainingPreferences.newBuilder();
      if (this.heartRateView != Integer.MAX_VALUE) {
         var1.setHeartRateView(Types$PbHeartRateView.forNumber(this.heartRateView));
      }

      return var1.build();
   }

   public static Preferences getUserPreferences() {
      List var0 = find(Preferences.class, "PATH=?", new String[]{"/U/0/S/"});
      Preferences var1;
      switch(var0.size()) {
      case 0:
         var1 = null;
         break;
      case 1:
         var1 = (Preferences)var0.get(0);
         break;
      default:
         d.c(TAG, "", new IllegalStateException("More than one Preferences for user!"));
         var1 = (Preferences)var0.get(0);
      }

      return var1;
   }

   public static int getUserUnitSystem() {
      return getUserUnitSystem(true);
   }

   public static int getUserUnitSystem(boolean var0) {
      int var1;
      if (var0) {
         var1 = r.a.h();
      } else {
         var1 = -1;
      }

      int var2 = var1;
      if (var1 == -1) {
         Preferences var3 = getUserPreferences();
         if (var3 != null) {
            var1 = var3.getUnitSystem();
         } else {
            var1 = 1;
         }

         r.a.b(var1);
         var2 = var1;
      }

      return var2;
   }

   private boolean hasLocalizationPreferences() {
      boolean var1;
      if (this.unitSystem == Integer.MAX_VALUE && this.timeFormat == Integer.MAX_VALUE && this.timeFormatSeparator == Integer.MAX_VALUE && this.dateFormat == Integer.MAX_VALUE && this.dateFormatSeparator == Integer.MAX_VALUE && this.firstDayOfWeek == Integer.MAX_VALUE) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   private boolean hasTrainingPreferences() {
      boolean var1;
      if (this.heartRateView != Integer.MAX_VALUE) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean delete() {
      r.a.b(-1);
      return super.delete();
   }

   public String getBasename() {
      return "PREFS";
   }

   public int getDateFormat() {
      return this.dateFormat;
   }

   public int getDateFormatSeparator() {
      return this.dateFormatSeparator;
   }

   public int getFirstDayOfWeek() {
      return this.firstDayOfWeek;
   }

   public int getHeartRateView() {
      return this.heartRateView;
   }

   public Date getLastModified() {
      return this.lastModified;
   }

   public int getTimeFormat() {
      return this.timeFormat;
   }

   public int getTimeFormatSeparator() {
      return this.timeFormatSeparator;
   }

   public int getUnitSystem() {
      return this.unitSystem;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public void merge(Preferences var1) {
      if (q.a(this.lastModified, var1.lastModified)) {
         this.unitSystem = var1.unitSystem;
         this.timeFormat = var1.timeFormat;
         this.timeFormatSeparator = var1.timeFormatSeparator;
         this.dateFormat = var1.dateFormat;
         this.dateFormatSeparator = var1.dateFormatSeparator;
         this.firstDayOfWeek = var1.firstDayOfWeek;
         this.heartRateView = var1.heartRateView;
         this.lastModified = var1.lastModified;
         this.lastModifiedTrusted = var1.lastModifiedTrusted;
      }

   }

   public long save() {
      r.a.b(this.unitSystem);
      return super.save();
   }

   public void setDateFormat(int var1) {
      this.dateFormat = var1;
   }

   public void setDateFormatSeparator(int var1) {
      this.dateFormatSeparator = var1;
   }

   public void setFirstDayOfWeek(int var1) {
      this.firstDayOfWeek = var1;
   }

   public void setHeartRateView(int var1) {
      this.heartRateView = var1;
   }

   public void setLastModified(Date var1, boolean var2) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var2;
   }

   public void setTimeFormat(int var1) {
      this.timeFormat = var1;
   }

   public void setTimeFormatSeparator(int var1) {
      this.timeFormatSeparator = var1;
   }

   public void setUnitSystem(int var1) {
      this.unitSystem = var1;
   }

   public Preferences$PbGeneralPreferences toPbObject() {
      Preferences$PbGeneralPreferences$Builder var1 = Preferences$PbGeneralPreferences.newBuilder();
      if (this.hasLocalizationPreferences()) {
         var1.setLocalizationPreferences(this.buildPbLocalizationPreferences());
      }

      if (this.hasTrainingPreferences()) {
         var1.setTrainingPreferences(this.buildPbTrainingPreferences());
      }

      if (this.lastModified != null) {
         var1.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      } else {
         d.f(TAG, "No required field last_modified");
      }

      return var1.build();
   }
}
