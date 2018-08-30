package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpRequest$PbPFtpOperation$Command implements ProtocolMessageEnum {
   GET(0);

   public static final int GET_VALUE = 0;
   MERGE(2);

   public static final int MERGE_VALUE = 2;
   PUT(1);

   public static final int PUT_VALUE = 1;
   REMOVE(3);

   public static final int REMOVE_VALUE = 3;
   private static final PftpRequest$PbPFtpOperation$Command[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpRequest$PbPFtpOperation$Command$1();
   private final int value;

   private PftpRequest$PbPFtpOperation$Command(int var3) {
      this.value = var3;
   }

   public static PftpRequest$PbPFtpOperation$Command forNumber(int var0) {
      PftpRequest$PbPFtpOperation$Command var1;
      switch(var0) {
      case 0:
         var1 = GET;
         break;
      case 1:
         var1 = PUT;
         break;
      case 2:
         var1 = MERGE;
         break;
      case 3:
         var1 = REMOVE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpRequest$PbPFtpOperation.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpRequest$PbPFtpOperation$Command valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpRequest$PbPFtpOperation$Command valueOf(EnumValueDescriptor var0) {
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
