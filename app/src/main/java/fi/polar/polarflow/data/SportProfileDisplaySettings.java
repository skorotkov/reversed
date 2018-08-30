package fi.polar.polarflow.data;

import fi.polar.remote.representation.protobuf.SportprofileDisplays$PbSirius2DisplaySettings;
import fi.polar.remote.representation.protobuf.SportprofileDisplays$PbSirius2TrainingDisplay;
import fi.polar.remote.representation.protobuf.SportprofileDisplays$PbTrainingDisplayItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public class SportProfileDisplaySettings {
   private List mDisplays;

   public SportProfileDisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      this.setDisplays(var1);
   }

   private void setDisplays(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      this.mDisplays = new ArrayList();
      if (var1 != null) {
         Iterator var2 = var1.getDisplayList().iterator();

         while(var2.hasNext()) {
            SportprofileDisplays$PbSirius2TrainingDisplay var3 = (SportprofileDisplays$PbSirius2TrainingDisplay)var2.next();
            ArrayList var4 = new ArrayList();
            Iterator var5 = var3.getItemList().iterator();

            while(var5.hasNext()) {
               var4.add(new SportProfileDisplaySettings$DisplayItem(((SportprofileDisplays$PbTrainingDisplayItem)var5.next()).getNumber()));
            }

            this.mDisplays.add(new SportProfileDisplaySettings$Display(var4));
         }
      }

   }

   public int getDisplayCount() {
      return this.mDisplays.size();
   }

   public int getDisplayItemCount(int var1) {
      return this.getDisplayItems(var1).size();
   }

   public int getDisplayItemValue(int var1, int var2) {
      return ((SportProfileDisplaySettings$DisplayItem)this.getDisplayItems(var1).get(var2)).getValue();
   }

   public List getDisplayItems(int var1) {
      return ((SportProfileDisplaySettings$Display)this.getDisplayList().get(var1)).getDisplayItems();
   }

   public List getDisplayList() {
      return this.mDisplays;
   }

   public String toJson() {
      JSONArray var1 = new JSONArray();
      Iterator var2 = this.mDisplays.iterator();

      while(var2.hasNext()) {
         SportProfileDisplaySettings$Display var3 = (SportProfileDisplaySettings$Display)var2.next();
         JSONArray var4 = new JSONArray();
         Iterator var5 = var3.getDisplayItems().iterator();

         while(var5.hasNext()) {
            var4.put(((SportProfileDisplaySettings$DisplayItem)var5.next()).getValue());
         }

         var1.put(var4);
      }

      return var1.toString();
   }
}
