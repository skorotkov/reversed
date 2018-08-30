package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Device {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbDeviceInfo_descriptor;
   private static final FieldAccessorTable internal_static_data_PbDeviceInfo_fieldAccessorTable;

   static {
      Device$1 var0 = new Device$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fdevice.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"¨\u0003\n\fPbDeviceInfo\u0012&\n\u0012bootloader_version\u0018\u0001 \u0001(\u000b2\n.PbVersion\u0012$\n\u0010platform_version\u0018\u0002 \u0001(\u000b2\n.PbVersion\u0012\"\n\u000edevice_version\u0018\u0003 \u0001(\u000b2\n.PbVersion\u0012\u000f\n\u0007svn_rev\u0018\u0004 \u0001(\r\u0012 \n\u0018electrical_serial_number\u0018\u0005 \u0001(\t\u0012\u0010\n\bdeviceID\u0018\u0006 \u0001(\t\u0012\u0012\n\nmodel_name\u0018\u0007 \u0001(\t\u0012\u0015\n\rhardware_code\u0018\b \u0001(\t\u0012\u0015\n\rproduct_color\u0018\t \u0001(\t\u0012\u0016\n\u000eproduct_design\u0018\n \u0001(\t\u0012\u0011\n\tsystem_id\u0018\u000b \u0001(\t\u0012\u0017\n\bgit_hash\u0018\f \u0001(\fB\u0005\u0092?\u0002\b\u0014\u0012", "*\n\u0016polarmathsmart_version\u0018\r \u0001(\u000b2\n.PbVersion\u0012/\n\u0012sub_component_info\u0018\u000e \u0003(\u000b2\u0013.PbSubcomponentInfoB1\n'fi.polar.remote.representation.protobufB\u0006Device"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbDeviceInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbDeviceInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbDeviceInfo_descriptor, new String[]{"BootloaderVersion", "PlatformVersion", "DeviceVersion", "SvnRev", "ElectricalSerialNumber", "DeviceID", "ModelName", "HardwareCode", "ProductColor", "ProductDesign", "SystemId", "GitHash", "PolarmathsmartVersion", "SubComponentInfo"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private Device() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbDeviceInfo_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbDeviceInfo_fieldAccessorTable;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
