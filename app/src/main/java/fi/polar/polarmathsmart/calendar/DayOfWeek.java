package fi.polar.polarmathsmart.calendar;

import java.util.Calendar;
import java.util.Date;

public enum DayOfWeek {
   FRIDAY(6),
   MONDAY(2),
   SATURDAY(7),
   SUNDAY(1),
   THURSDAY(5),
   TUESDAY(3),
   WEDNESDAY(4);

   private final int fieldValueInJavaCalendar;

   private DayOfWeek(int var3) {
      this.fieldValueInJavaCalendar = var3;
   }

   public static DayOfWeek fromCalendar(Calendar var0) {
      return fromFieldValueInJavaCalendar(var0.get(7));
   }

   public static DayOfWeek fromDate(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.setTime(var0);
      return fromCalendar(var1);
   }

   private static DayOfWeek fromFieldValueInJavaCalendar(int var0) {
      DayOfWeek var1;
      switch(var0) {
      case 1:
         var1 = SUNDAY;
         break;
      case 2:
         var1 = MONDAY;
         break;
      case 3:
         var1 = TUESDAY;
         break;
      case 4:
         var1 = WEDNESDAY;
         break;
      case 5:
         var1 = THURSDAY;
         break;
      case 6:
         var1 = FRIDAY;
         break;
      case 7:
         var1 = SATURDAY;
         break;
      default:
         var1 = MONDAY;
      }

      return var1;
   }

   public DayOfWeek move(int var1) {
      int var2 = var1 % 7;
      var1 = var2;
      if (var2 < 0) {
         var1 = 7 - -var2;
      }

      return fromFieldValueInJavaCalendar((var1 + (this.fieldValueInJavaCalendar - 1)) % 7 + 1);
   }

   public DayOfWeek moveBackOneDay() {
      return this.move(-1);
   }

   public DayOfWeek moveForwardOneDay() {
      return this.move(1);
   }

   public int nightsUntil(DayOfWeek var1) {
      int var2 = var1.fieldValueInJavaCalendar - this.fieldValueInJavaCalendar;
      int var3 = var2;
      if (var2 <= 0) {
         var3 = var2 + 7;
      }

      return var3;
   }
}
