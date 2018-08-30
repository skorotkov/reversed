package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbAutoPause$PbAutoPauseTrigger implements ProtocolMessageEnum {
   AUTO_PAUSE_OFF(0),

   AUTO_PAUSE_TRIGGER_SPEED(1);

   public static final int AUTO_PAUSE_OFF_VALUE = 0;
   public static final int AUTO_PAUSE_TRIGGER_SPEED_VALUE = 1;
   private static final Types$PbAutoPause$PbAutoPauseTrigger[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbAutoPause$PbAutoPauseTrigger$1();
   private final int value;

   private Types$PbAutoPause$PbAutoPauseTrigger(int var3) {
      this.value = var3;
   }

   public static Types$PbAutoPause$PbAutoPauseTrigger forNumber(int var0) {
      Types$PbAutoPause$PbAutoPauseTrigger var1;
      switch(var0) {
      case 0:
         var1 = AUTO_PAUSE_OFF;
         break;
      case 1:
         var1 = AUTO_PAUSE_TRIGGER_SPEED;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types$PbAutoPause.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbAutoPause$PbAutoPauseTrigger valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbAutoPause$PbAutoPauseTrigger valueOf(EnumValueDescriptor var0) {
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
