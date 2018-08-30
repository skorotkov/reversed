package fi.polar.polarflow.data.orm;

import com.google.protobuf.ByteString;
import com.orm.dsl.Unique;
import fi.polar.polarflow.a;
import fi.polar.polarflow.ui.custom.s;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.Sport$PbSport;
import fi.polar.remote.representation.protobuf.Sport$PbSport$Builder;
import fi.polar.remote.representation.protobuf.Sport$PbSport$PbSportType;
import fi.polar.remote.representation.protobuf.Sport$PbSportTranslation;
import fi.polar.remote.representation.protobuf.Sport$PbSportTranslation$Builder;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class Sport extends ProtoPublishableEntity {
   private static final String KEY_LONG_TEXT = Sport$PbSportTranslation.getDescriptor().findFieldByNumber(4).getName();
   private static final String KEY_LONG_TWO_LINE_TEXT = Sport$PbSportTranslation.getDescriptor().findFieldByNumber(5).getName();
   private static final String KEY_MEDIUM_TEXT = Sport$PbSportTranslation.getDescriptor().findFieldByNumber(3).getName();
   private static final String KEY_SHORT_TEXT = Sport$PbSportTranslation.getDescriptor().findFieldByNumber(2).getName();
   public static final int SPORT_TYPE_FREE_MULTI_SPORT = 4;
   public static final int SPORT_TYPE_MULTI_SPORT = 2;
   public static final int SPORT_TYPE_SINGLE_SPORT = 1;
   public static final int SPORT_TYPE_SUB_SPORT = 3;
   private static final String TAG = "Sport";
   private float factor;
   private long lastModified;
   private boolean lastModifiedTrusted;
   private String locales;
   private String name;
   private String nameLanguage;
   private long parentId;
   private int speedZonesEnabled;
   @Unique
   private long sportId;
   private int sportType;

   public Sport() {
      this.name = "Other";
      this.nameLanguage = "";
      this.locales = "";
      this.sportId = -2L;
      this.sportType = -1;
      this.factor = -1.0F;
      this.lastModified = 0L;
      this.speedZonesEnabled = -1;
   }

   public Sport(Sport$PbSport var1) {
      this.name = "Other";
      this.nameLanguage = "";
      this.locales = "";
      this.sportId = -2L;
      this.sportType = -1;
      this.factor = -1.0F;
      this.lastModified = 0L;
      this.speedZonesEnabled = -1;
      this.sportId = var1.getIdentifier().getValue();
      long var2;
      if (var1.hasParentIdentifier()) {
         var2 = var1.getParentIdentifier().getValue();
      } else {
         var2 = this.sportId;
      }

      this.parentId = var2;
      float var4;
      if (var1.hasFactor()) {
         var4 = var1.getFactor();
      } else {
         var4 = -1.0F;
      }

      this.factor = var4;
      int var5;
      if (var1.hasSportType()) {
         var5 = var1.getSportType().getNumber();
      } else {
         var5 = -1;
      }

      this.sportType = var5;
      if (var1.hasSpeedZonesEnabled()) {
         byte var6;
         if (var1.getSpeedZonesEnabled()) {
            var6 = 1;
         } else {
            var6 = 0;
         }

         this.speedZonesEnabled = var6;
      }

      this.lastModifiedTrusted = false;
      if (var1.hasLastModified()) {
         this.lastModified = q.b(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

      this.locales = pbTranslationsToJson(var1);
      this.updateName(getISO2Language());
   }

   public Sport(InputStream var1) {
      this(Sport$PbSport.parseFrom(var1));
   }

   private static String convertLocaleValueToJson(String var0) {
      return (new JSONObject()).put(KEY_SHORT_TEXT, var0).toString();
   }

   private static String getISO2Language() {
      String var0 = Locale.getDefault().getLanguage();
      String var1 = var0;
      if (!Arrays.asList(a.a).contains(var0)) {
         d.c("Sport", "Language not supported, using english");
         var1 = Locale.ENGLISH.getLanguage();
      }

      if (var1.equals("in")) {
         var0 = "id";
      } else {
         var0 = var1;
         if (var1.equals("nb")) {
            var0 = "no";
         }
      }

      return var0;
   }

   private String getNameFromJson(String var1, String var2) {
      JSONObject var3 = new JSONObject(this.locales);
      String var4 = var1;
      if (!var3.has(var1)) {
         var4 = Locale.ENGLISH.getLanguage();
      }

      String var5 = var3.getString(var4);
      var1 = var5;
      if (!isJsonString(var5)) {
         var1 = convertLocaleValueToJson(var5);
         var3.put(var4, var1);
         this.locales = var3.toString();
      }

      JSONObject var6 = new JSONObject(var1);
      if (var6.has(var2)) {
         var1 = var6.getString(var2);
      } else {
         var1 = var6.getString(KEY_SHORT_TEXT);
      }

      return var1;
   }

   public static Sport getSport(long var0) {
      List var2 = find(Sport.class, "SPORT_ID=?", new String[]{String.valueOf(var0)});
      Sport var3;
      if (var2.size() > 0) {
         var3 = (Sport)var2.get(0);
      } else {
         d.b("Sport", "no database entry for sportId=" + var0);
         var3 = null;
      }

      return var3;
   }

   private static boolean isJsonString(String var0) {
      boolean var1;
      if (var0 != null && (!var0.startsWith("{") || !var0.endsWith("}")) && (!var0.startsWith("[") || !var0.endsWith("]"))) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public static boolean isSwimmingSport(long var0) {
      boolean var2;
      if (var0 != 23L && var0 != 103L) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   private static Sport$PbSportTranslation pbTranslationFromJson(String var0, String var1) {
      Sport$PbSportTranslation$Builder var2 = Sport$PbSportTranslation.newBuilder();
      var2.getIdBuilder().setLanguage(var0);
      var0 = var1;
      if (!isJsonString(var1)) {
         var0 = convertLocaleValueToJson(var1);
      }

      JSONObject var3 = new JSONObject(var0);
      if (var3.has(KEY_SHORT_TEXT)) {
         var2.getShortTextBuilder().setTextBytes(ByteString.copyFromUtf8(var3.getString(KEY_SHORT_TEXT)));
      }

      if (var3.has(KEY_MEDIUM_TEXT)) {
         var2.getMediumTextBuilder().setTextBytes(ByteString.copyFromUtf8(var3.getString(KEY_MEDIUM_TEXT)));
      }

      if (var3.has(KEY_LONG_TEXT)) {
         var2.getLongTextBuilder().setTextBytes(ByteString.copyFromUtf8(var3.getString(KEY_LONG_TEXT)));
      }

      if (var3.has(KEY_LONG_TWO_LINE_TEXT)) {
         var2.getLongTwoLineTextBuilder().setTextBytes(ByteString.copyFromUtf8(var3.getString(KEY_LONG_TWO_LINE_TEXT)));
      }

      return var2.build();
   }

   private static String pbTranslationTextsToJson(Sport$PbSportTranslation var0) {
      HashMap var1 = new HashMap();
      var1.put(KEY_SHORT_TEXT, new String(var0.getShortText().getTextBytes().toByteArray(), "utf-8"));
      if (var0.hasMediumText()) {
         var1.put(KEY_MEDIUM_TEXT, new String(var0.getMediumText().getTextBytes().toByteArray(), "utf-8"));
      }

      if (var0.hasLongText()) {
         var1.put(KEY_LONG_TEXT, new String(var0.getLongText().getTextBytes().toByteArray(), "utf-8"));
      }

      if (var0.hasLongTwoLineText()) {
         var1.put(KEY_LONG_TWO_LINE_TEXT, new String(var0.getLongTwoLineText().getTextBytes().toByteArray(), "utf-8"));
      }

      return (new JSONObject(var1)).toString();
   }

   private static List pbTranslationsFromJson(String param0) {
      // $FF: Couldn't be decompiled
   }

   private static String pbTranslationsToJson(Sport$PbSport var0) {
      List var1 = var0.getTranslationList();
      LinkedHashMap var4 = new LinkedHashMap();
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         Sport$PbSportTranslation var2 = (Sport$PbSportTranslation)var5.next();

         try {
            var4.put(var2.getId().getLanguage(), pbTranslationTextsToJson(var2));
         } catch (UnsupportedEncodingException var3) {
            d.c("Sport", "pbTranslationsToJson()", var3);
         }
      }

      return (new JSONObject(var4)).toString();
   }

   private void updateName(String var1) {
      try {
         this.name = this.getNameFromJson(var1, KEY_LONG_TWO_LINE_TEXT);
         this.nameLanguage = var1;
      } catch (JSONException var2) {
         d.c("Sport", "Something wrong with stored json string of locales= " + this.locales, var2);
      }

   }

   public String getBasename() {
      return "SPORT";
   }

   public float getFactor() {
      return this.factor;
   }

   public String getGlyph() {
      return s.a(this.sportId);
   }

   public String getMediumName() {
      String var1 = getISO2Language();

      try {
         var1 = this.getNameFromJson(var1, KEY_MEDIUM_TEXT);
      } catch (JSONException var2) {
         d.c("Sport", "Something wrong with stored json string of locales= " + this.locales, var2);
         var1 = this.name;
      }

      return var1;
   }

   public String getName() {
      String var1 = getISO2Language();
      if (!var1.equalsIgnoreCase(this.nameLanguage)) {
         this.updateName(var1);
         if (this.getId() != null) {
            this.update();
         }
      }

      return this.name;
   }

   public long getParentId() {
      return this.parentId;
   }

   public String getPath() {
      return "/SYS/SPORT/" + this.getSportId() + '/';
   }

   public long getSportId() {
      return this.sportId;
   }

   public int getSportType() {
      return this.sportType;
   }

   public boolean isSwimmingSport() {
      return isSwimmingSport(this.sportId);
   }

   void setLocales(String var1) {
      this.locales = var1;
   }

   public void setParentId(long var1) {
      this.parentId = var1;
   }

   public void setSportId(long var1) {
      this.sportId = var1;
   }

   public Sport$PbSport toPbObject() {
      boolean var1 = true;
      Sport$PbSport$Builder var2 = Sport$PbSport.newBuilder();
      var2.getIdentifierBuilder().setValue(this.sportId);
      var2.getParentIdentifierBuilder().setValue(this.parentId);
      if (this.factor != -1.0F) {
         var2.setFactor(this.factor);
      }

      if (Sport$PbSport$PbSportType.forNumber(this.sportType) != null) {
         var2.setSportType(Sport$PbSport$PbSportType.forNumber(this.sportType));
      }

      if (this.speedZonesEnabled != -1) {
         if (this.speedZonesEnabled != 1) {
            var1 = false;
         }

         var2.setSpeedZonesEnabled(var1);
      }

      Iterator var3 = pbTranslationsFromJson(this.locales).iterator();

      while(var3.hasNext()) {
         var2.addTranslation((Sport$PbSportTranslation)var3.next());
      }

      if (this.lastModified != 0L) {
         var2.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      return var2.build();
   }
}
