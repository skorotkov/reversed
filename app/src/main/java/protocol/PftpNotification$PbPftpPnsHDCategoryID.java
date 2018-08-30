package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpNotification$PbPftpPnsHDCategoryID implements ProtocolMessageEnum {
   CATEGORY_ID_ALARM(13),

//   public static final int CATEGORY_ID_ALARM_VALUE = 13;
   CATEGORY_ID_BUSINESSANDFINANCE(10),

//   public static final int CATEGORY_ID_BUSINESSANDFINANCE_VALUE = 10;
   CATEGORY_ID_EMAIL(7),

//   public static final int CATEGORY_ID_EMAIL_VALUE = 7;
   CATEGORY_ID_ENTERTAINMENT(12),

//   public static final int CATEGORY_ID_ENTERTAINMENT_VALUE = 12;
   CATEGORY_ID_HEALTHANDFITNESS(9),

//   public static final int CATEGORY_ID_HEALTHANDFITNESS_VALUE = 9;
   CATEGORY_ID_INCOMINGCALL(2),

//   public static final int CATEGORY_ID_INCOMINGCALL_VALUE = 2;
   CATEGORY_ID_LOCATION(11),

//   public static final int CATEGORY_ID_LOCATION_VALUE = 11;
   CATEGORY_ID_MISSEDCALL(3),

//   public static final int CATEGORY_ID_MISSEDCALL_VALUE = 3;
   CATEGORY_ID_NEWS(8),

//   public static final int CATEGORY_ID_NEWS_VALUE = 8;
   CATEGORY_ID_OTHER(0),

//   public static final int CATEGORY_ID_OTHER_VALUE = 0;
   CATEGORY_ID_POLAR(1),

//   public static final int CATEGORY_ID_POLAR_VALUE = 1;
   CATEGORY_ID_PROMO(14),

//   public static final int CATEGORY_ID_PROMO_VALUE = 14;
   CATEGORY_ID_RECOMMENDATION(15),

//   public static final int CATEGORY_ID_RECOMMENDATION_VALUE = 15;
   CATEGORY_ID_SCHEDULE(6),

//   public static final int CATEGORY_ID_SCHEDULE_VALUE = 6;
   CATEGORY_ID_SOCIAL(5),

//   public static final int CATEGORY_ID_SOCIAL_VALUE = 5;
   CATEGORY_ID_STATUS(16),

//   public static final int CATEGORY_ID_STATUS_VALUE = 16;
   CATEGORY_ID_TRANSPORT(17),

//   public static final int CATEGORY_ID_TRANSPORT_VALUE = 17;
   CATEGORY_ID_VOICEMAIL(4);

//   public static final int CATEGORY_ID_VOICEMAIL_VALUE = 4;
   private static final PftpNotification$PbPftpPnsHDCategoryID[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpNotification$PbPftpPnsHDCategoryID$1();
   private final int value;

   private PftpNotification$PbPftpPnsHDCategoryID(int var3) {
      this.value = var3;
   }

   public static PftpNotification$PbPftpPnsHDCategoryID forNumber(int var0) {
      PftpNotification$PbPftpPnsHDCategoryID var1;
      switch(var0) {
      case 0:
         var1 = CATEGORY_ID_OTHER;
         break;
      case 1:
         var1 = CATEGORY_ID_POLAR;
         break;
      case 2:
         var1 = CATEGORY_ID_INCOMINGCALL;
         break;
      case 3:
         var1 = CATEGORY_ID_MISSEDCALL;
         break;
      case 4:
         var1 = CATEGORY_ID_VOICEMAIL;
         break;
      case 5:
         var1 = CATEGORY_ID_SOCIAL;
         break;
      case 6:
         var1 = CATEGORY_ID_SCHEDULE;
         break;
      case 7:
         var1 = CATEGORY_ID_EMAIL;
         break;
      case 8:
         var1 = CATEGORY_ID_NEWS;
         break;
      case 9:
         var1 = CATEGORY_ID_HEALTHANDFITNESS;
         break;
      case 10:
         var1 = CATEGORY_ID_BUSINESSANDFINANCE;
         break;
      case 11:
         var1 = CATEGORY_ID_LOCATION;
         break;
      case 12:
         var1 = CATEGORY_ID_ENTERTAINMENT;
         break;
      case 13:
         var1 = CATEGORY_ID_ALARM;
         break;
      case 14:
         var1 = CATEGORY_ID_PROMO;
         break;
      case 15:
         var1 = CATEGORY_ID_RECOMMENDATION;
         break;
      case 16:
         var1 = CATEGORY_ID_STATUS;
         break;
      case 17:
         var1 = CATEGORY_ID_TRANSPORT;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpNotification.getDescriptor().getEnumTypes().get(4);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpNotification$PbPftpPnsHDCategoryID valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpNotification$PbPftpPnsHDCategoryID valueOf(EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return VALUES[var0.getIndex()];
      }
   }

   public final EnumDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   public final int getNumber() {
      return this.value;
   }

   public final EnumValueDescriptor getValueDescriptor() {
      return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
   }
}
