package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Structures$PbVolumeTarget$PbVolymeTargetType implements ProtocolMessageEnum {
   private static final Structures$PbVolumeTarget$PbVolymeTargetType[] VALUES = values();
   VOLUME_TARGET_TYPE_CALORIES(2);

   public static final int VOLUME_TARGET_TYPE_CALORIES_VALUE = 2;
   VOLUME_TARGET_TYPE_DISTANCE(1);

   public static final int VOLUME_TARGET_TYPE_DISTANCE_VALUE = 1;
   VOLUME_TARGET_TYPE_DURATION(0);

   public static final int VOLUME_TARGET_TYPE_DURATION_VALUE = 0;
   private static final EnumLiteMap internalValueMap = new Structures$PbVolumeTarget$PbVolymeTargetType$1();
   private final int value;

   private Structures$PbVolumeTarget$PbVolymeTargetType(int var3) {
      this.value = var3;
   }

   public static Structures$PbVolumeTarget$PbVolymeTargetType forNumber(int var0) {
      Structures$PbVolumeTarget$PbVolymeTargetType var1;
      switch(var0) {
      case 0:
         var1 = VOLUME_TARGET_TYPE_DURATION;
         break;
      case 1:
         var1 = VOLUME_TARGET_TYPE_DISTANCE;
         break;
      case 2:
         var1 = VOLUME_TARGET_TYPE_CALORIES;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Structures$PbVolumeTarget.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Structures$PbVolumeTarget$PbVolymeTargetType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Structures$PbVolumeTarget$PbVolymeTargetType valueOf(EnumValueDescriptor var0) {
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
