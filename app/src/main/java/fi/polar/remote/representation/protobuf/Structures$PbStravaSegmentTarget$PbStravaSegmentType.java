package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Structures$PbStravaSegmentTarget$PbStravaSegmentType implements ProtocolMessageEnum {
   STRAVA_SEGMENT_TYPE_RIDE(1),

   STRAVA_SEGMENT_TYPE_RUN(2);

   public static final int STRAVA_SEGMENT_TYPE_RIDE_VALUE = 1;
   public static final int STRAVA_SEGMENT_TYPE_RUN_VALUE = 2;
   private static final Structures$PbStravaSegmentTarget$PbStravaSegmentType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Structures$PbStravaSegmentTarget$PbStravaSegmentType$1();
   private final int value;

   private Structures$PbStravaSegmentTarget$PbStravaSegmentType(int var3) {
      this.value = var3;
   }

   public static Structures$PbStravaSegmentTarget$PbStravaSegmentType forNumber(int var0) {
      Structures$PbStravaSegmentTarget$PbStravaSegmentType var1;
      switch(var0) {
      case 1:
         var1 = STRAVA_SEGMENT_TYPE_RIDE;
         break;
      case 2:
         var1 = STRAVA_SEGMENT_TYPE_RUN;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Structures$PbStravaSegmentTarget.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Structures$PbStravaSegmentTarget$PbStravaSegmentType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Structures$PbStravaSegmentTarget$PbStravaSegmentType valueOf(EnumValueDescriptor var0) {
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
