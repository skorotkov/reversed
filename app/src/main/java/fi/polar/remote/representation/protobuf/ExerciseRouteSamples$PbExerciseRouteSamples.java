package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class ExerciseRouteSamples$PbExerciseRouteSamples extends GeneratedMessageV3 implements ExerciseRouteSamples$PbExerciseRouteSamplesOrBuilder {
   private static final ExerciseRouteSamples$PbExerciseRouteSamples DEFAULT_INSTANCE = new ExerciseRouteSamples$PbExerciseRouteSamples();
   public static final int DURATION_FIELD_NUMBER = 1;
   public static final int FIRST_LOCATION_TIME_FIELD_NUMBER = 9;
   public static final int GPS_ALTITUDE_FIELD_NUMBER = 4;
   public static final int LATITUDE_FIELD_NUMBER = 2;
   public static final int LONGITUDE_FIELD_NUMBER = 3;
   public static final int OBSOLETE_FIX_FIELD_NUMBER = 6;
   public static final int OBSOLETE_GPS_DATE_TIME_FIELD_NUMBER = 8;
   public static final int OBSOLETE_GPS_OFFLINE_FIELD_NUMBER = 7;
   @Deprecated
   public static final Parser PARSER = new ExerciseRouteSamples$PbExerciseRouteSamples$1();
   public static final int SATELLITE_AMOUNT_FIELD_NUMBER = 5;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int durationMemoizedSerializedSize;
   private List duration_;
   private Types$PbSystemDateTime firstLocationTime_;
   private int gpsAltitudeMemoizedSerializedSize;
   private List gpsAltitude_;
   private List latitude_;
   private List longitude_;
   private byte memoizedIsInitialized;
   private int oBSOLETEFixMemoizedSerializedSize;
   private List oBSOLETEFix_;
   private List oBSOLETEGpsDateTime_;
   private List oBSOLETEGpsOffline_;
   private int satelliteAmountMemoizedSerializedSize;
   private List satelliteAmount_;

   private ExerciseRouteSamples$PbExerciseRouteSamples() {
      this.durationMemoizedSerializedSize = -1;
      this.gpsAltitudeMemoizedSerializedSize = -1;
      this.satelliteAmountMemoizedSerializedSize = -1;
      this.oBSOLETEFixMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
      this.duration_ = Collections.emptyList();
      this.latitude_ = Collections.emptyList();
      this.longitude_ = Collections.emptyList();
      this.gpsAltitude_ = Collections.emptyList();
      this.satelliteAmount_ = Collections.emptyList();
      this.oBSOLETEFix_ = Collections.emptyList();
      this.oBSOLETEGpsOffline_ = Collections.emptyList();
      this.oBSOLETEGpsDateTime_ = Collections.emptyList();
   }

   private ExerciseRouteSamples$PbExerciseRouteSamples(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseRouteSamples$PbExerciseRouteSamples(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseRouteSamples$1 var3) {
      this(var1, var2);
   }

   private ExerciseRouteSamples$PbExerciseRouteSamples(Builder var1) {
      super(var1);
      this.durationMemoizedSerializedSize = -1;
      this.gpsAltitudeMemoizedSerializedSize = -1;
      this.satelliteAmountMemoizedSerializedSize = -1;
      this.oBSOLETEFixMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseRouteSamples$PbExerciseRouteSamples(Builder var1, ExerciseRouteSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseRouteSamples$PbExerciseRouteSamples var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(ExerciseRouteSamples$PbExerciseRouteSamples var0, Types$PbSystemDateTime var1) {
      var0.firstLocationTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.duration_;
   }

   // $FF: synthetic method
   static List a(ExerciseRouteSamples$PbExerciseRouteSamples var0, List var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.latitude_;
   }

   // $FF: synthetic method
   static List b(ExerciseRouteSamples$PbExerciseRouteSamples var0, List var1) {
      var0.latitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List c(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.longitude_;
   }

   // $FF: synthetic method
   static List c(ExerciseRouteSamples$PbExerciseRouteSamples var0, List var1) {
      var0.longitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List d(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.gpsAltitude_;
   }

   // $FF: synthetic method
   static List d(ExerciseRouteSamples$PbExerciseRouteSamples var0, List var1) {
      var0.gpsAltitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean d() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List e(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.satelliteAmount_;
   }

   // $FF: synthetic method
   static List e(ExerciseRouteSamples$PbExerciseRouteSamples var0, List var1) {
      var0.satelliteAmount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List f(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.oBSOLETEFix_;
   }

   // $FF: synthetic method
   static List f(ExerciseRouteSamples$PbExerciseRouteSamples var0, List var1) {
      var0.oBSOLETEFix_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List g(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.oBSOLETEGpsOffline_;
   }

   // $FF: synthetic method
   static List g(ExerciseRouteSamples$PbExerciseRouteSamples var0, List var1) {
      var0.oBSOLETEGpsOffline_ = var1;
      return var1;
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseRouteSamples.a();
   }

   // $FF: synthetic method
   static List h(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.oBSOLETEGpsDateTime_;
   }

   // $FF: synthetic method
   static List h(ExerciseRouteSamples$PbExerciseRouteSamples var0, List var1) {
      var0.oBSOLETEGpsDateTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet i(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return var0.unknownFields;
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples$Builder newBuilder(ExerciseRouteSamples$PbExerciseRouteSamples var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseDelimitedFrom(InputStream var0) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseFrom(ByteString var0) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)PARSER.parseFrom(var0);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseFrom(CodedInputStream var0) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseFrom(InputStream var0) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseFrom(byte[] var0) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)PARSER.parseFrom(var0);
   }

   public static ExerciseRouteSamples$PbExerciseRouteSamples parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseRouteSamples$PbExerciseRouteSamples)) {
            var2 = super.equals(var1);
         } else {
            ExerciseRouteSamples$PbExerciseRouteSamples var5 = (ExerciseRouteSamples$PbExerciseRouteSamples)var1;
            boolean var3;
            if (this.getDurationList().equals(var5.getDurationList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getLatitudeList().equals(var5.getLatitudeList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getLongitudeList().equals(var5.getLongitudeList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getGpsAltitudeList().equals(var5.getGpsAltitudeList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getSatelliteAmountList().equals(var5.getSatelliteAmountList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getOBSOLETEFixList().equals(var5.getOBSOLETEFixList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getOBSOLETEGpsOfflineList().equals(var5.getOBSOLETEGpsOfflineList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getOBSOLETEGpsDateTimeList().equals(var5.getOBSOLETEGpsDateTimeList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4;
            if (var3 && this.hasFirstLocationTime() == var5.hasFirstLocationTime()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFirstLocationTime()) {
               if (var4 && this.getFirstLocationTime().equals(var5.getFirstLocationTime())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getDuration(int var1) {
      return (Integer)this.duration_.get(var1);
   }

   public int getDurationCount() {
      return this.duration_.size();
   }

   public List getDurationList() {
      return this.duration_;
   }

   public Types$PbSystemDateTime getFirstLocationTime() {
      Types$PbSystemDateTime var1;
      if (this.firstLocationTime_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.firstLocationTime_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getFirstLocationTimeOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.firstLocationTime_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.firstLocationTime_;
      }

      return var1;
   }

   public int getGpsAltitude(int var1) {
      return (Integer)this.gpsAltitude_.get(var1);
   }

   public int getGpsAltitudeCount() {
      return this.gpsAltitude_.size();
   }

   public List getGpsAltitudeList() {
      return this.gpsAltitude_;
   }

   public double getLatitude(int var1) {
      return (Double)this.latitude_.get(var1);
   }

   public int getLatitudeCount() {
      return this.latitude_.size();
   }

   public List getLatitudeList() {
      return this.latitude_;
   }

   public double getLongitude(int var1) {
      return (Double)this.longitude_.get(var1);
   }

   public int getLongitudeCount() {
      return this.longitude_.size();
   }

   public List getLongitudeList() {
      return this.longitude_;
   }

   public boolean getOBSOLETEFix(int var1) {
      return (Boolean)this.oBSOLETEFix_.get(var1);
   }

   public int getOBSOLETEFixCount() {
      return this.oBSOLETEFix_.size();
   }

   public List getOBSOLETEFixList() {
      return this.oBSOLETEFix_;
   }

   public Types$PbSystemDateTime getOBSOLETEGpsDateTime(int var1) {
      return (Types$PbSystemDateTime)this.oBSOLETEGpsDateTime_.get(var1);
   }

   public int getOBSOLETEGpsDateTimeCount() {
      return this.oBSOLETEGpsDateTime_.size();
   }

   public List getOBSOLETEGpsDateTimeList() {
      return this.oBSOLETEGpsDateTime_;
   }

   public Types$PbSystemDateTimeOrBuilder getOBSOLETEGpsDateTimeOrBuilder(int var1) {
      return (Types$PbSystemDateTimeOrBuilder)this.oBSOLETEGpsDateTime_.get(var1);
   }

   public List getOBSOLETEGpsDateTimeOrBuilderList() {
      return this.oBSOLETEGpsDateTime_;
   }

   public Types$PbSensorOffline getOBSOLETEGpsOffline(int var1) {
      return (Types$PbSensorOffline)this.oBSOLETEGpsOffline_.get(var1);
   }

   public int getOBSOLETEGpsOfflineCount() {
      return this.oBSOLETEGpsOffline_.size();
   }

   public List getOBSOLETEGpsOfflineList() {
      return this.oBSOLETEGpsOffline_;
   }

   public Types$PbSensorOfflineOrBuilder getOBSOLETEGpsOfflineOrBuilder(int var1) {
      return (Types$PbSensorOfflineOrBuilder)this.oBSOLETEGpsOffline_.get(var1);
   }

   public List getOBSOLETEGpsOfflineOrBuilderList() {
      return this.oBSOLETEGpsOffline_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSatelliteAmount(int var1) {
      return (Integer)this.satelliteAmount_.get(var1);
   }

   public int getSatelliteAmountCount() {
      return this.satelliteAmount_.size();
   }

   public List getSatelliteAmountList() {
      return this.satelliteAmount_;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         var2 = 0;

         int var3;
         for(var3 = 0; var2 < this.duration_.size(); ++var2) {
            var3 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.duration_.get(var2));
         }

         int var4 = 0 + var3;
         var2 = var4;
         if (!this.getDurationList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.durationMemoizedSerializedSize = var3;
         int var5 = this.getLatitudeList().size();
         int var6 = this.getLatitudeList().size();
         int var7 = this.getLongitudeList().size();
         int var8 = this.getLongitudeList().size();
         var4 = 0;

         for(var3 = 0; var4 < this.gpsAltitude_.size(); ++var4) {
            var3 += CodedOutputStream.computeSInt32SizeNoTag((Integer)this.gpsAltitude_.get(var4));
         }

         var2 = var2 + var5 * 8 + var6 * 1 + var7 * 8 + var8 * 1 + var3;
         if (!this.getGpsAltitudeList().isEmpty()) {
            var2 = var2 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.gpsAltitudeMemoizedSerializedSize = var3;
         var4 = 0;

         for(var3 = 0; var4 < this.satelliteAmount_.size(); ++var4) {
            var3 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.satelliteAmount_.get(var4));
         }

         var4 = var2 + var3;
         var2 = var4;
         if (!this.getSatelliteAmountList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.satelliteAmountMemoizedSerializedSize = var3;
         var4 = this.getOBSOLETEFixList().size() * 1;
         var3 = var2 + var4;
         var2 = var3;
         if (!this.getOBSOLETEFixList().isEmpty()) {
            var2 = var3 + 1 + CodedOutputStream.computeInt32SizeNoTag(var4);
         }

         this.oBSOLETEFixMemoizedSerializedSize = var4;
         var7 = 0;
         var3 = var2;

         while(true) {
            var4 = var1;
            var2 = var3;
            if (var7 >= this.oBSOLETEGpsOffline_.size()) {
               while(var4 < this.oBSOLETEGpsDateTime_.size()) {
                  var2 += CodedOutputStream.computeMessageSize(8, (MessageLite)this.oBSOLETEGpsDateTime_.get(var4));
                  ++var4;
               }

               var3 = var2;
               if ((this.bitField0_ & 1) == 1) {
                  var3 = var2 + CodedOutputStream.computeMessageSize(9, this.getFirstLocationTime());
               }

               var2 = this.unknownFields.getSerializedSize() + var3;
               this.memoizedSize = var2;
               break;
            }

            var3 += CodedOutputStream.computeMessageSize(7, (MessageLite)this.oBSOLETEGpsOffline_.get(var7));
            ++var7;
         }
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasFirstLocationTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.getDurationCount() > 0) {
            var1 = (var2 * 37 + 1) * 53 + this.getDurationList().hashCode();
         }

         var2 = var1;
         if (this.getLatitudeCount() > 0) {
            var2 = (var1 * 37 + 2) * 53 + this.getLatitudeList().hashCode();
         }

         var1 = var2;
         if (this.getLongitudeCount() > 0) {
            var1 = (var2 * 37 + 3) * 53 + this.getLongitudeList().hashCode();
         }

         var2 = var1;
         if (this.getGpsAltitudeCount() > 0) {
            var2 = (var1 * 37 + 4) * 53 + this.getGpsAltitudeList().hashCode();
         }

         var1 = var2;
         if (this.getSatelliteAmountCount() > 0) {
            var1 = (var2 * 37 + 5) * 53 + this.getSatelliteAmountList().hashCode();
         }

         var2 = var1;
         if (this.getOBSOLETEFixCount() > 0) {
            var2 = (var1 * 37 + 6) * 53 + this.getOBSOLETEFixList().hashCode();
         }

         var1 = var2;
         if (this.getOBSOLETEGpsOfflineCount() > 0) {
            var1 = (var2 * 37 + 7) * 53 + this.getOBSOLETEGpsOfflineList().hashCode();
         }

         var2 = var1;
         if (this.getOBSOLETEGpsDateTimeCount() > 0) {
            var2 = (var1 * 37 + 8) * 53 + this.getOBSOLETEGpsDateTimeList().hashCode();
         }

         var1 = var2;
         if (this.hasFirstLocationTime()) {
            var1 = (var2 * 37 + 9) * 53 + this.getFirstLocationTime().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseRouteSamples.b().ensureFieldAccessorsInitialized(ExerciseRouteSamples$PbExerciseRouteSamples.class, ExerciseRouteSamples$PbExerciseRouteSamples$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            int var4 = 0;

            while(true) {
               if (var4 >= this.getOBSOLETEGpsOfflineCount()) {
                  for(var4 = 0; var4 < this.getOBSOLETEGpsDateTimeCount(); ++var4) {
                     if (!this.getOBSOLETEGpsDateTime(var4).isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                        return var3;
                     }
                  }

                  if (this.hasFirstLocationTime() && !this.getFirstLocationTime().isInitialized()) {
                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                  } else {
                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                  }
                  break;
               }

               if (!this.getOBSOLETEGpsOffline(var4).isInitialized()) {
                  this.memoizedIsInitialized = (byte)0;
                  var3 = var1;
                  break;
               }

               ++var4;
            }
         }
      }

      return var3;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseRouteSamples$PbExerciseRouteSamples$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseRouteSamples$PbExerciseRouteSamples$Builder(var1, (ExerciseRouteSamples$1)null);
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder toBuilder() {
      ExerciseRouteSamples$PbExerciseRouteSamples$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseRouteSamples$PbExerciseRouteSamples$Builder((ExerciseRouteSamples$1)null);
      } else {
         var1 = (new ExerciseRouteSamples$PbExerciseRouteSamples$Builder((ExerciseRouteSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      this.getSerializedSize();
      if (this.getDurationList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.durationMemoizedSerializedSize);
      }

      int var3;
      for(var3 = 0; var3 < this.duration_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.duration_.get(var3));
      }

      for(var3 = 0; var3 < this.latitude_.size(); ++var3) {
         var1.writeDouble(2, (Double)this.latitude_.get(var3));
      }

      for(var3 = 0; var3 < this.longitude_.size(); ++var3) {
         var1.writeDouble(3, (Double)this.longitude_.get(var3));
      }

      if (this.getGpsAltitudeList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.gpsAltitudeMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.gpsAltitude_.size(); ++var3) {
         var1.writeSInt32NoTag((Integer)this.gpsAltitude_.get(var3));
      }

      if (this.getSatelliteAmountList().size() > 0) {
         var1.writeUInt32NoTag(42);
         var1.writeUInt32NoTag(this.satelliteAmountMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.satelliteAmount_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.satelliteAmount_.get(var3));
      }

      if (this.getOBSOLETEFixList().size() > 0) {
         var1.writeUInt32NoTag(50);
         var1.writeUInt32NoTag(this.oBSOLETEFixMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.oBSOLETEFix_.size(); ++var3) {
         var1.writeBoolNoTag((Boolean)this.oBSOLETEFix_.get(var3));
      }

      int var4 = 0;

      while(true) {
         var3 = var2;
         if (var4 >= this.oBSOLETEGpsOffline_.size()) {
            while(var3 < this.oBSOLETEGpsDateTime_.size()) {
               var1.writeMessage(8, (MessageLite)this.oBSOLETEGpsDateTime_.get(var3));
               ++var3;
            }

            if ((this.bitField0_ & 1) == 1) {
               var1.writeMessage(9, this.getFirstLocationTime());
            }

            this.unknownFields.writeTo(var1);
            return;
         }

         var1.writeMessage(7, (MessageLite)this.oBSOLETEGpsOffline_.get(var4));
         ++var4;
      }
   }
}
