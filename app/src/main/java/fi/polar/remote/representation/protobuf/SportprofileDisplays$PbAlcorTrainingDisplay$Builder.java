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

public final class SportprofileDisplays$PbAlcorTrainingDisplay$Builder extends Builder implements SportprofileDisplays$PbAlcorTrainingDisplayOrBuilder {
   private int bitField0_;
   private List item_;

   private SportprofileDisplays$PbAlcorTrainingDisplay$Builder() {
      this.item_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private SportprofileDisplays$PbAlcorTrainingDisplay$Builder(BuilderParent var1) {
      super(var1);
      this.item_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileDisplays$PbAlcorTrainingDisplay$Builder(BuilderParent var1, SportprofileDisplays$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileDisplays$PbAlcorTrainingDisplay$Builder(SportprofileDisplays$1 var1) {
      this();
   }

   private void ensureItemIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.item_ = new ArrayList(this.item_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return SportprofileDisplays.e();
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileDisplays$PbAlcorTrainingDisplay.b()) {
      }

   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder addAllItem(Iterable var1) {
      this.ensureItemIsMutable();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         SportprofileDisplays$PbTrainingDisplayItem var2 = (SportprofileDisplays$PbTrainingDisplayItem)var3.next();
         this.item_.add(var2.getNumber());
      }

      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder addItem(SportprofileDisplays$PbTrainingDisplayItem var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureItemIsMutable();
         this.item_.add(var1.getNumber());
         this.onChanged();
         return this;
      }
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay build() {
      SportprofileDisplays$PbAlcorTrainingDisplay var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay buildPartial() {
      SportprofileDisplays$PbAlcorTrainingDisplay var1 = new SportprofileDisplays$PbAlcorTrainingDisplay(this, (SportprofileDisplays$1)null);
      int var2 = this.bitField0_;
      if ((this.bitField0_ & 1) == 1) {
         this.item_ = Collections.unmodifiableList(this.item_);
         this.bitField0_ &= -2;
      }

      SportprofileDisplays$PbAlcorTrainingDisplay.a(var1, this.item_);
      this.onBuilt();
      return var1;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder clear() {
      super.clear();
      this.item_ = Collections.emptyList();
      this.bitField0_ &= -2;
      return this;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder clearField(FieldDescriptor var1) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)super.clearField(var1);
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder clearItem() {
      this.item_ = Collections.emptyList();
      this.bitField0_ &= -2;
      this.onChanged();
      return this;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)super.clearOneof(var1);
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder clone() {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)super.clone();
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay getDefaultInstanceForType() {
      return SportprofileDisplays$PbAlcorTrainingDisplay.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileDisplays.e();
   }

   public SportprofileDisplays$PbTrainingDisplayItem getItem(int var1) {
      return (SportprofileDisplays$PbTrainingDisplayItem)SportprofileDisplays$PbAlcorTrainingDisplay.c().convert(this.item_.get(var1));
   }

   public int getItemCount() {
      return this.item_.size();
   }

   public List getItemList() {
      return new ListAdapter(this.item_, SportprofileDisplays$PbAlcorTrainingDisplay.c());
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileDisplays.f().ensureFieldAccessorsInitialized(SportprofileDisplays$PbAlcorTrainingDisplay.class, SportprofileDisplays$PbAlcorTrainingDisplay$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileDisplays$PbAlcorTrainingDisplay var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportprofileDisplays$PbAlcorTrainingDisplay var14;
         try {
            var13 = (SportprofileDisplays$PbAlcorTrainingDisplay)SportprofileDisplays$PbAlcorTrainingDisplay.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportprofileDisplays$PbAlcorTrainingDisplay)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder mergeFrom(Message var1) {
      SportprofileDisplays$PbAlcorTrainingDisplay$Builder var2;
      if (var1 instanceof SportprofileDisplays$PbAlcorTrainingDisplay) {
         var2 = this.mergeFrom((SportprofileDisplays$PbAlcorTrainingDisplay)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder mergeFrom(SportprofileDisplays$PbAlcorTrainingDisplay var1) {
      if (var1 != SportprofileDisplays$PbAlcorTrainingDisplay.getDefaultInstance()) {
         if (!SportprofileDisplays$PbAlcorTrainingDisplay.a(var1).isEmpty()) {
            if (this.item_.isEmpty()) {
               this.item_ = SportprofileDisplays$PbAlcorTrainingDisplay.a(var1);
               this.bitField0_ &= -2;
            } else {
               this.ensureItemIsMutable();
               this.item_.addAll(SportprofileDisplays$PbAlcorTrainingDisplay.a(var1));
            }

            this.onChanged();
         }

         this.mergeUnknownFields(SportprofileDisplays$PbAlcorTrainingDisplay.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileDisplays$PbAlcorTrainingDisplay$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)super.setField(var1, var2);
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder setItem(int var1, SportprofileDisplays$PbTrainingDisplayItem var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         this.ensureItemIsMutable();
         this.item_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }
   }

   public SportprofileDisplays$PbAlcorTrainingDisplay$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileDisplays$PbAlcorTrainingDisplay$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileDisplays$PbAlcorTrainingDisplay$Builder)super.setUnknownFields(var1);
   }
}
