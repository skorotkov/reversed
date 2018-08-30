package fi.polar.polarflow.data.orm;

import com.orm.SugarRecord;
import fi.polar.polarflow.data.ProtoEncodable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class ProtoEncodableEntity extends SugarRecord implements ProtoEncodable {
   protected ProtoEncodableEntity() {
   }

   protected ProtoEncodableEntity(InputStream var1) {
   }

   public int deleteWithParentId(Class var1, String var2) {
      byte var3 = 0;
      int var4 = var3;
      if (this.getId() != null) {
         if (var2 == null) {
            var4 = var3;
         } else {
            var4 = SugarRecord.deleteAll(var1, var2 + "=?", String.valueOf(this.getId()));
         }
      }

      return var4;
   }

   public List findWithParentId(Class var1, String var2) {
      Object var3;
      if (this.getId() != null && var2 != null) {
         var3 = SugarRecord.find(var1, var2 + "=?", String.valueOf(this.getId()));
      } else {
         var3 = new ArrayList();
      }

      return (List)var3;
   }

   public byte[] toByteArray() {
      return this.toPbObject().toByteArray();
   }

   public String toString() {
      return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()) + "[id=" + this.getId() + "]";
   }
}
