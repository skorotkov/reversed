package fi.polar.polarmathsmart.types;

public enum InActivityAlertType {
   CANCEL_LOW_ACTIVITY_MEASUREMENT,
   MARK_INACTIVITY_STAMP,
   NOTIFY_USER_TO_GET_MOVING,
   NO_CHANGE,
   START_LOW_ACTIVITY_MEASUREMENT;

   public static InActivityAlertType convertFromInt(int var0) {
      return values()[var0];
   }
}
