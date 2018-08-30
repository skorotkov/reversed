package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import android.util.Base64;
import com.google.protobuf.ByteString;
import com.orm.dsl.Unique;
import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.UserIds$PbPasswordToken;
import fi.polar.remote.representation.protobuf.UserIds$PbPasswordToken$Builder;
import fi.polar.remote.representation.protobuf.UserIds$PbUserIdentifier;
import fi.polar.remote.representation.protobuf.UserIds$PbUserIdentifier$Builder;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserId extends ProtoPublishableEntity implements Mergeable {
   private static final String TAG = UserId.class.getSimpleName();
   private String email;
   private String firstName;
   private Date lastModified;
   private boolean lastModifiedTrusted;
   private String lastName;
   @Unique
   private long masterIdentifier;
   private String nickname;
   private String passwordToken;
   private boolean passwordTokenEncrypted;

   public UserId() {
      this.masterIdentifier = -1L;
      this.email = null;
      this.passwordToken = null;
      this.passwordTokenEncrypted = false;
      this.nickname = null;
      this.firstName = null;
      this.lastName = null;
      this.lastModified = null;
      this.lastModifiedTrusted = false;
      this.path = "/U/0/";
   }

   public UserId(long var1, String var3, byte[] var4, boolean var5, String var6, String var7, String var8, Date var9, boolean var10) {
      this();
      this.masterIdentifier = var1;
      this.email = var3;
      if (var4 != null && var4.length > 0) {
         this.passwordToken = Base64.encodeToString(var4, 2);
      } else {
         this.passwordToken = null;
      }

      this.passwordTokenEncrypted = var5;
      this.nickname = var6;
      this.firstName = var7;
      this.lastName = var8;
      this.lastModified = var9;
      this.lastModifiedTrusted = var10;
   }

   public UserId(UserIds$PbUserIdentifier var1) {
      this();
      long var2;
      if (var1.hasMasterIdentifier()) {
         var2 = var1.getMasterIdentifier();
      } else {
         var2 = -1L;
      }

      this.masterIdentifier = var2;
      String var4;
      if (var1.hasEmail()) {
         var4 = var1.getEmail();
      } else {
         var4 = null;
      }

      this.email = var4;
      this.passwordToken = null;
      this.passwordTokenEncrypted = false;
      if (var1.hasPasswordToken() && var1.getPasswordToken().hasToken()) {
         this.passwordToken = Base64.encodeToString(var1.getPasswordToken().getToken().toByteArray(), 2);
         this.passwordTokenEncrypted = var1.getPasswordToken().getEncrypted();
      }

      if (var1.hasNickname()) {
         var4 = var1.getNickname();
      } else {
         var4 = null;
      }

      this.nickname = var4;
      if (var1.hasFirstName()) {
         var4 = var1.getFirstName();
      } else {
         var4 = null;
      }

      this.firstName = var4;
      if (var1.hasLastName()) {
         var4 = var1.getLastName();
      } else {
         var4 = null;
      }

      this.lastName = var4;
      this.lastModified = null;
      this.lastModifiedTrusted = false;
      if (var1.hasUserIdLastModified()) {
         this.lastModified = q.a(var1.getUserIdLastModified());
         this.lastModifiedTrusted = var1.getUserIdLastModified().getTrusted();
      }

   }

   public UserId(InputStream var1) {
      this(UserIds$PbUserIdentifier.parseFrom(var1));
   }

   public static UserId getUserId() {
      List var0 = listAll(UserId.class);
      UserId var1;
      switch(var0.size()) {
      case 0:
         var1 = null;
         break;
      case 1:
         var1 = (UserId)var0.get(0);
         break;
      default:
         d.c(TAG, "", new IllegalStateException("More than one UserId for user!"));
         var1 = (UserId)var0.get(0);
      }

      return var1;
   }

   public String getBasename() {
      return "USERID";
   }

   public String getEmail() {
      return this.email;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public Date getLastModified() {
      return this.lastModified;
   }

   public String getLastName() {
      return this.lastName;
   }

   public long getMasterIdentifier() {
      return this.masterIdentifier;
   }

   public String getNickname() {
      return this.nickname;
   }

   public byte[] getPasswordToken() {
      byte[] var1;
      if (!TextUtils.isEmpty(this.passwordToken)) {
         var1 = Base64.decode(this.passwordToken, 2);
      } else {
         var1 = null;
      }

      return var1;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public boolean isPasswordTokenEncrypted() {
      return this.passwordTokenEncrypted;
   }

   public void merge(UserId var1) {
      if (q.a(this.lastModified, var1.lastModified)) {
         this.masterIdentifier = var1.masterIdentifier;
         this.email = var1.email;
         this.passwordToken = var1.passwordToken;
         this.passwordTokenEncrypted = var1.passwordTokenEncrypted;
         this.nickname = var1.nickname;
         this.firstName = var1.firstName;
         this.lastName = var1.lastName;
         this.lastModified = var1.lastModified;
         this.lastModifiedTrusted = var1.lastModifiedTrusted;
      }

   }

   public void setEmail(String var1) {
      this.email = var1;
   }

   public void setFirstName(String var1) {
      this.firstName = var1;
   }

   public void setLastModified(Date var1, boolean var2) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var2;
   }

   public void setLastName(String var1) {
      this.lastName = var1;
   }

   public void setMasterIdentifier(long var1) {
      this.masterIdentifier = var1;
   }

   public void setNickname(String var1) {
      this.nickname = var1;
   }

   public void setPasswordToken(byte[] var1, boolean var2) {
      if (var1 != null && var1.length > 0) {
         this.passwordToken = Base64.encodeToString(var1, 2);
      } else {
         this.passwordToken = null;
      }

      this.passwordTokenEncrypted = var2;
   }

   public UserIds$PbUserIdentifier toPbObject() {
      UserIds$PbUserIdentifier$Builder var1 = UserIds$PbUserIdentifier.newBuilder();
      if (this.masterIdentifier != -1L) {
         var1.setMasterIdentifier(this.masterIdentifier);
      }

      if (!TextUtils.isEmpty(this.email)) {
         var1.setEmail(this.email);
      }

      if (!TextUtils.isEmpty(this.passwordToken)) {
         UserIds$PbPasswordToken$Builder var2 = UserIds$PbPasswordToken.newBuilder();
         var2.setToken(ByteString.copyFrom(this.getPasswordToken()));
         var2.setEncrypted(this.passwordTokenEncrypted);
         var1.setPasswordToken(var2.build());
      }

      if (!TextUtils.isEmpty(this.nickname)) {
         var1.setNickname(this.nickname);
      }

      if (!TextUtils.isEmpty(this.firstName)) {
         var1.setFirstName(this.firstName);
      }

      if (!TextUtils.isEmpty(this.lastName)) {
         var1.setLastName(this.lastName);
      }

      if (this.lastModified != null) {
         var1.setUserIdLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      return var1.build();
   }
}
