package fi.polar.remote.representation.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessage.GeneratedExtension;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Nanopb {
   public static final int NANOPB_FIELD_NUMBER = 1010;
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_NanoPBOptions_descriptor;
   private static final FieldAccessorTable internal_static_NanoPBOptions_fieldAccessorTable;
   public static final GeneratedExtension nanopb = GeneratedMessage.newFileScopedGeneratedExtension(Nanopb$NanoPBOptions.class, Nanopb$NanoPBOptions.getDefaultInstance());

   static {
      Nanopb$1 var0 = new Nanopb$1();
      FileDescriptor var1 = DescriptorProtos.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fnanopb.proto\u001a google/protobuf/descriptor.proto\"4\n\rNanoPBOptions\u0012\u0010\n\bmax_size\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tmax_count\u0018\u0002 \u0001(\u0005:>\n\u0006nanopb\u0012\u001d.google.protobuf.FieldOptions\u0018ò\u0007 \u0001(\u000b2\u000e.NanoPBOptionsB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1}, var0);
      internal_static_NanoPBOptions_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_NanoPBOptions_fieldAccessorTable = new FieldAccessorTable(internal_static_NanoPBOptions_descriptor, new String[]{"MaxSize", "MaxCount"});
      nanopb.internalInit((FieldDescriptor)descriptor.getExtensions().get(0));
      DescriptorProtos.getDescriptor();
   }

   private Nanopb() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_NanoPBOptions_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_NanoPBOptions_fieldAccessorTable;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
      var0.add(nanopb);
   }
}
