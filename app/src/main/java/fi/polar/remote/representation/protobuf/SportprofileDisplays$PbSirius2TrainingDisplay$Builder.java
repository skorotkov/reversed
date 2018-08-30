package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.Internal.ListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SportprofileDisplays$PbSirius2TrainingDisplay$Builder extends Builder implements SportprofileDisplays$PbSirius2TrainingDisplayOrBuilder {
   private int bitField0_;
   private List item_;

   private SportprofileDisplays$PbSirius2TrainingDisplay$Builder() {
      this.item_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private SportprofileDisplays$PbSirius2TrainingDisplay$Builder(BuilderParent var1) {
      super(var1);
      this.item_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileDisplays$PbSirius2TrainingDisplay$Builder(BuilderParent var1, SportprofileDisplays$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileDisplays$PbSirius2TrainingDisplay$Builder(SportprofileDisplays$1 var1) {
      this();
   }

   private void ensureItemIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.item_ = new ArrayList(this.item_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return SportprofileDisplays.a();
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileDisplays$PbSirius2TrainingDisplay.b()) {
      }

   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder addAllItem(Iterable var1) {
      this.ensureItemIsMutable();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         SportprofileDisplays$PbTrainingDisplayItem var3 = (SportprofileDisplays$PbTrainingDisplayItem)var2.next();
         this.item_.add(var3.getNumber());
      }

      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder addItem(SportprofileDisplays$PbTrainingDisplayItem var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureItemIsMutable();
         this.item_.add(var1.getNumber());
         this.onChanged();
         return this;
      }
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay build() {
      SportprofileDisplays$PbSirius2TrainingDisplay var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay buildPartial() {
      SportprofileDisplays$PbSirius2TrainingDisplay var1 = new SportprofileDisplays$PbSirius2TrainingDisplay(this, (SportprofileDisplays$1)null);
      int var2 = this.bitField0_;
      if ((this.bitField0_ & 1) == 1) {
         this.item_ = Collections.unmodifiableList(this.item_);
         this.bitField0_ &= -2;
      }

      SportprofileDisplays$PbSirius2TrainingDisplay.a(var1, this.item_);
      this.onBuilt();
      return var1;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder clear() {
      super.clear();
      this.item_ = Collections.emptyList();
      this.bitField0_ &= -2;
      return this;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder clearField(FieldDescriptor var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)super.clearField(var1);
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder clearItem() {
      this.item_ = Collections.emptyList();
      this.bitField0_ &= -2;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)super.clearOneof(var1);
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder clone() {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)super.clone();
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay getDefaultInstanceForType() {
      return SportprofileDisplays$PbSirius2TrainingDisplay.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileDisplays.a();
   }

   public SportprofileDisplays$PbTrainingDisplayItem getItem(int var1) {
      return (SportprofileDisplays$PbTrainingDisplayItem)SportprofileDisplays$PbSirius2TrainingDisplay.c().convert(this.item_.get(var1));
   }

   public int getItemCount() {
      return this.item_.size();
   }

   public List getItemList() {
      return new ListAdapter(this.item_, SportprofileDisplays$PbSirius2TrainingDisplay.c());
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileDisplays.b().ensureFieldAccessorsInitialized(SportprofileDisplays$PbSirius2TrainingDisplay.class, SportprofileDisplays$PbSirius2TrainingDisplay$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileDisplays$PbSirius2TrainingDisplay var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (SportprofileDisplays$PbSirius2TrainingDisplay)SportprofileDisplays$PbSirius2TrainingDisplay.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (SportprofileDisplays$PbSirius2TrainingDisplay)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder mergeFrom(Message var1) {
      SportprofileDisplays$PbSirius2TrainingDisplay$Builder var2;
      if (var1 instanceof SportprofileDisplays$PbSirius2TrainingDisplay) {
         var2 = this.mergeFrom((SportprofileDisplays$PbSirius2TrainingDisplay)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder mergeFrom(SportprofileDisplays$PbSirius2TrainingDisplay var1) {
      if (var1 != SportprofileDisplays$PbSirius2TrainingDisplay.getDefaultInstance()) {
         if (!SportprofileDisplays$PbSirius2TrainingDisplay.a(var1).isEmpty()) {
            if (this.item_.isEmpty()) {
               this.item_ = SportprofileDisplays$PbSirius2TrainingDisplay.a(var1);
               this.bitField0_ &= -2;
            } else {
               this.ensureItemIsMutable();
               this.item_.addAll(SportprofileDisplays$PbSirius2TrainingDisplay.a(var1));
            }

            this.onChanged();
         }

         this.mergeUnknownFields(SportprofileDisplays$PbSirius2TrainingDisplay.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileDisplays$PbSirius2TrainingDisplay$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)super.setField(var1, var2);
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder setItem(int var1, SportprofileDisplays$PbTrainingDisplayItem var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         this.ensureItemIsMutable();
         this.item_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }
   }

   public SportprofileDisplays$PbSirius2TrainingDisplay$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileDisplays$PbSirius2TrainingDisplay$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileDisplays$PbSirius2TrainingDisplay$Builder)super.setUnknownFields(var1);
   }
}
