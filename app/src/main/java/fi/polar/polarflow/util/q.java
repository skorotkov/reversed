package fi.polar.polarflow.util;

import android.text.TextUtils;
import com.google.protobuf.ByteString;
import fi.polar.remote.representation.protobuf.Structures$PbBleMac;
import fi.polar.remote.representation.protobuf.Structures$PbBleMac$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbVersion;
import fi.polar.remote.representation.protobuf.Types$PbDate;
import fi.polar.remote.representation.protobuf.Types$PbDate$Builder;
import fi.polar.remote.representation.protobuf.Types$PbDuration;
import fi.polar.remote.representation.protobuf.Types$PbFeatureType;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTime;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTime$Builder;
import fi.polar.remote.representation.protobuf.Types$PbMacType;
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTime;
import fi.polar.remote.representation.protobuf.Types$PbSystemDateTime$Builder;
import fi.polar.remote.representation.protobuf.Types$PbTime;
import fi.polar.remote.representation.protobuf.Types$PbTime$Builder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;
import org.json.JSONArray;
import org.json.JSONException;

public class q {
   private static final String a = q.class.getSimpleName();

   private q() {
   }

   public static long a(Types$PbDuration var0) {
      return TimeUnit.HOURS.toMillis((long)var0.getHours()) + TimeUnit.MINUTES.toMillis((long)var0.getMinutes()) + TimeUnit.SECONDS.toMillis((long)var0.getSeconds()) + TimeUnit.MILLISECONDS.toMillis((long)var0.getMillis());
   }

   public static Structures$PbBleMac a(String var0, int var1) {
      Structures$PbBleMac$Builder var2 = Structures$PbBleMac.newBuilder();
      if (!TextUtils.isEmpty(var0)) {
         var2.setMac(ByteString.copyFrom(c.a(var0, true)));
      }

      if (var1 != Integer.MAX_VALUE) {
         var2.setType(Types$PbMacType.forNumber(var1));
      }

      return var2.build();
   }

   public static Structures$PbVersion a(String param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public static Types$PbDate a(String var0) {
      return a(LocalDate.parse(var0, ISODateTimeFormat.basicDate()));
   }

   public static Types$PbDate a(LocalDate var0) {
      Types$PbDate$Builder var1 = Types$PbDate.newBuilder();
      var1.setYear(var0.getYear());
      var1.setMonth(var0.getMonthOfYear());
      var1.setDay(var0.getDayOfMonth());
      return var1.build();
   }

   public static Types$PbDuration a(int var0, int var1, int var2, int var3) {
      Calendar var4 = Calendar.getInstance();
      var4.clear();
      var4.setTimeZone(TimeZone.getTimeZone("UTC"));
      var4.add(11, var0);
      var4.add(12, var1);
      var4.add(13, var2);
      var4.add(14, var3);
      var0 = (int)(var4.getTimeInMillis() / 3600000L);
      var2 = var4.get(12);
      var1 = var4.get(13);
      var3 = var4.get(14);
      return Types$PbDuration.newBuilder().setHours(var0).setMinutes(var2).setSeconds(var1).setMillis(var3).build();
   }

   public static Types$PbLocalDateTime a(long var0) {
      return a(var0, DateTimeZone.getDefault());
   }

   public static Types$PbLocalDateTime a(long var0, int var2) {
      return a(var0, DateTimeZone.forOffsetMillis((int)TimeUnit.MINUTES.toMillis((long)var2)));
   }

   public static Types$PbLocalDateTime a(long var0, DateTimeZone var2) {
      DateTime var7 = b(var0, var2);
      int var3 = ab.d(var7);
      Types$PbLocalDateTime$Builder var4 = Types$PbLocalDateTime.newBuilder();
      Types$PbDate$Builder var5 = Types$PbDate.newBuilder();
      var5.setYear(var7.getYear());
      var5.setMonth(var7.getMonthOfYear());
      var5.setDay(var7.getDayOfMonth());
      var4.setDate(var5.build());
      Types$PbTime$Builder var6 = Types$PbTime.newBuilder();
      var6.setHour(var7.getHourOfDay());
      var6.setMinute(var7.getMinuteOfHour());
      var6.setSeconds(var7.getSecondOfMinute());
      var6.setMillis(var7.getMillisOfSecond());
      var4.setTime(var6.build());
      var4.setTimeZoneOffset(var3);
      var4.setOBSOLETETrusted(false);
      return var4.build();
   }

   public static Types$PbLocalDateTime a(Date var0) {
      return a(var0.getTime());
   }

   public static Types$PbLocalDateTime a(Date var0, int var1) {
      return a(var0.getTime(), var1);
   }

   public static Types$PbSystemDateTime a(long var0, boolean var2) {
      DateTime var3 = new DateTime(var0, DateTimeZone.UTC);
      Types$PbSystemDateTime$Builder var4 = Types$PbSystemDateTime.newBuilder();
      Types$PbDate$Builder var5 = Types$PbDate.newBuilder();
      var5.setYear(var3.getYear());
      var5.setMonth(var3.getMonthOfYear());
      var5.setDay(var3.getDayOfMonth());
      var4.setDate(var5.build());
      Types$PbTime$Builder var6 = Types$PbTime.newBuilder();
      var6.setHour(var3.getHourOfDay());
      var6.setMinute(var3.getMinuteOfHour());
      var6.setSeconds(var3.getSecondOfMinute());
      var6.setMillis(var3.getMillisOfSecond());
      var4.setTime(var6.build());
      var4.setTrusted(var2);
      return var4.build();
   }

   public static Types$PbSystemDateTime a(Date var0, boolean var1) {
      return a(var0.getTime(), var1);
   }

   public static String a(int var0) {
      if (var0 < 0 || var0 > 99) {
         d.c(a, "", new IllegalArgumentException("Value not in range 0-99!"));
      }

      return String.format(Locale.US, "%02d", var0);
   }

   public static String a(Structures$PbVersion var0) {
      String var1;
      if (var0 != null) {
         var1 = var0.getMajor() + "." + var0.getMinor() + "." + var0.getPatch();
      } else {
         var1 = "";
      }

      return var1;
   }

   public static String a(Types$PbDate var0) {
      return b(var0).toString(ISODateTimeFormat.basicDate());
   }

   public static Date a(Types$PbLocalDateTime var0) {
      return new Date(b(var0));
   }

   public static Date a(Types$PbSystemDateTime var0) {
      return new Date(b(var0));
   }

   public static List a(JSONArray var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.add(var0.getString(var2));
      }

      return var1;
   }

   public static Set a(List var0) {
      LinkedHashSet var1 = new LinkedHashSet();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.add(((Types$PbFeatureType)var2.next()).getNumber());
      }

      return var1;
   }

   public static boolean a(Date var0, Date var1) {
      boolean var2 = true;
      if (var0 == null) {
         if (var1 != null) {
            return var2;
         }
      } else if (var1 != null && var1.after(var0)) {
         return var2;
      }

      var2 = false;
      return var2;
   }

   public static long b(Types$PbLocalDateTime var0) {
      return c(var0).getMillis();
   }

   public static long b(Types$PbSystemDateTime var0) {
      return (new DateTime(var0.getDate().getYear(), var0.getDate().getMonth(), var0.getDate().getDay(), var0.getTime().getHour(), var0.getTime().getMinute(), var0.getTime().getSeconds(), var0.getTime().getMillis(), DateTimeZone.UTC)).getMillis();
   }

   public static Types$PbDuration b(long var0) {
      return c(var0, 10);
   }

   public static List b(String var0) {
      List var3;
      label19: {
         if (!TextUtils.isEmpty(var0)) {
            try {
               JSONArray var1 = new JSONArray(var0);
               var3 = d(var1);
               break label19;
            } catch (JSONException var2) {
               d.c(a, "", var2);
            }
         }

         var3 = null;
      }

      List var4 = var3;
      if (var3 == null) {
         var4 = Collections.emptyList();
      }

      return var4;
   }

   public static List b(List var0) {
      List var1 = var0;
      if (var0 == null) {
         var1 = Collections.EMPTY_LIST;
      }

      return var1;
   }

   public static List b(JSONArray var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.add(var0.getDouble(var2));
      }

      return var1;
   }

   public static DateTime b(long var0, int var2) {
      return b(var0, DateTimeZone.forOffsetMillis((int)TimeUnit.MINUTES.toMillis((long)var2)));
   }

   public static DateTime b(long var0, DateTimeZone var2) {
      return (new DateTime(var0, DateTimeZone.UTC)).withZone(var2);
   }

   public static DateTime b(Date var0, int var1) {
      return b(var0.getTime(), var1);
   }

   public static LocalDate b(Types$PbDate var0) {
      return new LocalDate(var0.getYear(), var0.getMonth(), var0.getDay());
   }

   public static Types$PbDuration c(long var0, int var2) {
      var0 = fi.polar.polarflow.a.a.a(var2, var0);
      Calendar var3 = Calendar.getInstance();
      var3.clear();
      var3.setTimeZone(TimeZone.getTimeZone("UTC"));
      int var4 = (int)(var0 / 1000L);
      var2 = (int)(var0 % 1000L);
      var3.add(13, var4);
      var3.add(14, var2);
      return Types$PbDuration.newBuilder().setHours((int)(var3.getTimeInMillis() / 3600000L)).setMinutes(var3.get(12)).setSeconds(var3.get(13)).setMillis(var3.get(14)).build();
   }

   public static String c(long var0) {
      return (new SimpleDateFormat("yyyyMMdd", Locale.US)).format(new Date(var0));
   }

   public static List c(String var0) {
      List var3;
      label19: {
         if (!TextUtils.isEmpty(var0)) {
            try {
               JSONArray var1 = new JSONArray(var0);
               var3 = c(var1);
               break label19;
            } catch (JSONException var2) {
               d.c(a, "", var2);
            }
         }

         var3 = null;
      }

      List var4 = var3;
      if (var3 == null) {
         var4 = Collections.emptyList();
      }

      return var4;
   }

   public static List c(JSONArray var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.add(Float.parseFloat(var0.getString(var2)));
      }

      return var1;
   }

   public static DateTime c(Types$PbLocalDateTime var0) {
      DateTimeZone var1;
      if (var0.hasTimeZoneOffset()) {
         var1 = DateTimeZone.forOffsetMillis((int)TimeUnit.MINUTES.toMillis((long)var0.getTimeZoneOffset()));
      } else {
         var1 = DateTimeZone.getDefault();
      }

      return new DateTime(var0.getDate().getYear(), var0.getDate().getMonth(), var0.getDate().getDay(), var0.getTime().getHour(), var0.getTime().getMinute(), var0.getTime().getSeconds(), var0.getTime().getMillis(), var1);
   }

   public static String d(long var0) {
      return (new SimpleDateFormat("HHmmss", Locale.US)).format(new Date(var0));
   }

   public static List d(String var0) {
      List var3;
      label19: {
         if (!TextUtils.isEmpty(var0)) {
            try {
               JSONArray var1 = new JSONArray(var0);
               var3 = b(var1);
               break label19;
            } catch (JSONException var2) {
               d.c(a, "", var2);
            }
         }

         var3 = null;
      }

      List var4 = var3;
      if (var3 == null) {
         var4 = Collections.emptyList();
      }

      return var4;
   }

   public static List d(JSONArray var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.add(var0.getInt(var2));
      }

      return var1;
   }

   public static List e(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static String f(String var0) {
      if (var0 != null) {
         Matcher var1 = Pattern.compile("(\\d+\\.\\d+\\.\\d+)").matcher(var0);
         if (var1.find()) {
            var0 = var1.group();
            return var0;
         }
      }

      var0 = "";
      return var0;
   }
}
