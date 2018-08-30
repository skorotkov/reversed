package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Sport$PbSport$PbSportType implements ProtocolMessageEnum {
   SPORT_TYPE_FREE_MULTI_SPORT(4);

   public static final int SPORT_TYPE_FREE_MULTI_SPORT_VALUE = 4;
   SPORT_TYPE_MULTI_SPORT(2);

   public static final int SPORT_TYPE_MULTI_SPORT_VALUE = 2;
   SPORT_TYPE_SINGLE_SPORT(1);

   public static final int SPORT_TYPE_SINGLE_SPORT_VALUE = 1;
   SPORT_TYPE_SUB_SPORT(3);

   public static final int SPORT_TYPE_SUB_SPORT_VALUE = 3;
   private static final Sport$PbSport$PbSportType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Sport$PbSport$PbSportType$1();
   private final int value;

   private Sport$PbSport$PbSportType(int var3) {
      this.value = var3;
   }

   public static Sport$PbSport$PbSportType forNumber(int var0) {
      Sport$PbSport$PbSportType var1;
      switch(var0) {
      case 1:
         var1 = SPORT_TYPE_SINGLE_SPORT;
         break;
      case 2:
         var1 = SPORT_TYPE_MULTI_SPORT;
         break;
      case 3:
         var1 = SPORT_TYPE_SUB_SPORT;
         break;
      case 4:
         var1 = SPORT_TYPE_FREE_MULTI_SPORT;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Sport$PbSport.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Sport$PbSport$PbSportType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Sport$PbSport$PbSportType valueOf(EnumValueDescriptor var0) {
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
