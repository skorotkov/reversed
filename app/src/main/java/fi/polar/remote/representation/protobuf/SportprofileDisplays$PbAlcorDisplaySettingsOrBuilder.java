package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder extends MessageOrBuilder {
   int getAddedDefaultDisplays();

   SportprofileDisplays$PbAlcorTrainingDisplay getDisplay(int var1);

   int getDisplayCount();

   List getDisplayList();

   SportprofileDisplays$PbAlcorTrainingDisplayOrBuilder getDisplayOrBuilder(int var1);

   List getDisplayOrBuilderList();

   int getLastShownDisplay();

   boolean hasAddedDefaultDisplays();

   boolean hasLastShownDisplay();
}
