package fi.polar.polarflow.data.orm;

import com.orm.dsl.Ignore;
import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.Identifier$PbIdentifier;
import fi.polar.remote.representation.protobuf.Identifier$PbIdentifier$Builder;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Identifier extends ProtoPublishableEntity implements Mergeable {
   @Ignore
   private static final long ECOSYSTEM_ID_UNDEFINED = -1L;
   private Date created;
   private boolean createdTrusted;
   private boolean deleted;
   private long ecosystemId;
   private Date lastModified;
   private boolean lastModifiedTrusted;

   public Identifier() {
      this.ecosystemId = -1L;
   }

   public Identifier(Identifier$PbIdentifier var1) {
      this();
      if (var1.hasLastModified()) {
         this.lastModified = q.a(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

      if (var1.hasCreated()) {
         this.created = q.a(var1.getCreated());
         this.createdTrusted = var1.getCreated().getTrusted();
      }

      if (var1.hasDeleted()) {
         this.deleted = var1.getDeleted();
      }

      if (var1.hasEcosystemId()) {
         this.ecosystemId = var1.getEcosystemId();
      }

   }

   public Identifier(InputStream var1) {
      this(Identifier$PbIdentifier.parseFrom(var1));
   }

   public static List findActivityIdentifiers() {
      return find(Identifier.class, "PATH LIKE ?", new String[]{"/U/0/________/ACT/"});
   }

   public static Identifier findIdentifier(String var0) {
      List var1 = find(Identifier.class, "PATH=?", new String[]{var0});
      Identifier var2;
      if (var1.size() > 0) {
         var2 = (Identifier)var1.get(0);
      } else {
         var2 = null;
      }

      return var2;
   }

   public String getBasename() {
      return "ID";
   }

   public Date getCreated() {
      return this.created;
   }

   public long getEcosystemId() {
      return this.ecosystemId;
   }

   public Date getLastModified() {
      return this.lastModified;
   }

   public boolean isCreatedTrusted() {
      return this.createdTrusted;
   }

   public boolean isDeleted() {
      return this.deleted;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public void merge(Identifier var1) {
      if (q.a(this.lastModified, var1.lastModified)) {
         this.lastModified = var1.lastModified;
         this.lastModifiedTrusted = var1.lastModifiedTrusted;
         this.created = var1.created;
         this.createdTrusted = var1.createdTrusted;
         this.ecosystemId = var1.ecosystemId;
         this.deleted = var1.deleted;
      }

   }

   public void setCreated(Date var1, boolean var2) {
      this.created = var1;
      this.createdTrusted = var2;
   }

   public void setDeleted(boolean var1) {
      this.deleted = var1;
   }

   public void setEcosystemId(long var1) {
      this.ecosystemId = var1;
   }

   public void setLastModified(Date var1, boolean var2) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var2;
   }

   public Identifier$PbIdentifier toPbObject() {
      Identifier$PbIdentifier$Builder var1 = Identifier$PbIdentifier.newBuilder();
      if (this.lastModified != null) {
         var1.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      if (this.created != null) {
         var1.setCreated(q.a(this.created, this.createdTrusted));
      }

      if (this.ecosystemId != -1L) {
         var1.setEcosystemId(this.ecosystemId);
      }

      var1.setDeleted(this.deleted);
      return var1.build();
   }
}
