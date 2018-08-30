package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder extends MessageOrBuilder {
   int getAddedDefaultDisplays();

   SportprofileDisplays$PbSirius2TrainingDisplay getDisplay(int var1);

   int getDisplayCount();

   List getDisplayList();

   SportprofileDisplays$PbSirius2TrainingDisplayOrBuilder getDisplayOrBuilder(int var1);

   List getDisplayOrBuilderList();

   int getLastShownDisplay();

   boolean hasAddedDefaultDisplays();

   boolean hasLastShownDisplay();
}
