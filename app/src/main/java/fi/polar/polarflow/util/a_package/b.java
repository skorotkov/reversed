package fi.polar.polarflow.util.a_package;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.media.session.MediaController.Callback;
import android.media.session.MediaSessionManager.OnActiveSessionsChangedListener;
import fi.polar.polarflow.ui.p;
import java.util.Iterator;
import java.util.List;

public class b {
   private static final String a = b.class.getSimpleName();
   private static b b = null;
   private boolean c = false;
   private a d;
   private f e;
   private g f;
   private e g;
   private final OnActiveSessionsChangedListener h = new c(this);
   private final Callback i = new d(this);

   private b(Context var1) {
      this.e = new f(var1);
   }

   private static a a(List var0, g var1) {
      Iterator var2 = var0.iterator();

      a var3;
      do {
         if (!var2.hasNext()) {
            var3 = null;
            break;
         }

         var3 = (a)var2.next();
      } while(!var1.a(var3.a()));

      return var3;
   }

   public static b a(Context var0, p var1) {
      b var2;
      if (b != null) {
         var2 = b;
      } else if (var1.a(var0, "android.permission.MEDIA_CONTENT_CONTROL")) {
         var2 = new b(var0);
      } else {
         fi.polar.polarflow.util.d.e(a, "getNewInstance() - permission MEDIA_CONTENT_CONTROL is not granted!");
         var2 = null;
      }

      return var2;
   }

   private void a(MediaMetadata var1) {
      if (this.g != null) {
         this.g.a(var1);
      }

   }

   private void a(PlaybackState var1) {
      if (this.g != null) {
         this.g.a(var1);
      }

   }

   private void a(a var1) {
      this.g.a(var1);
      this.c(this.d);
      this.d = var1;
      if (this.d != null) {
         this.b(this.d);
         this.a(this.d.b());
         this.a(this.d.c());
      } else {
         this.a((MediaMetadata)null);
         this.a((PlaybackState)null);
      }

   }

   // $FF: synthetic method
   static void a(b var0, MediaMetadata var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(b var0, PlaybackState var1) {
      var0.a(var1);
   }

   private static a b(List var0) {
      fi.polar.polarflow.util.d.c(a, "selectActiveSession() - total sessions: " + var0.size());
      a var1;
      if (var0.isEmpty()) {
         var1 = null;
      } else {
         var1 = (a)var0.get(0);
      }

      return var1;
   }

   private void b(a var1) {
      if (var1 != null) {
         var1.a(this.i);
      }

   }

   private void c(a var1) {
      if (var1 != null) {
         var1.b(this.i);
      }

   }

   private List i() {
      return this.e.a((ComponentName)null);
   }

   public a a(e var1) {
      fi.polar.polarflow.util.d.c(a, "start()");
      if (this.c) {
         this.a();
      }

      this.g = var1;
      a var2 = b(this.i());
      g var3;
      if (var2 != null) {
         var3 = var2.a();
      } else {
         var3 = null;
      }

      this.f = var3;
      this.e.a(this.h, (ComponentName)null);
      this.a(var2);
      this.c = true;
      return var2;
   }

   public void a() {
      fi.polar.polarflow.util.d.c(a, "stop()");
      if (this.c) {
         this.a((a)null);
         this.g = null;
         this.e.a(this.h);
         this.c = false;
      }

   }

   public void a(List var1) {
      a var2 = null;
      a var3 = null;
      if (var1.isEmpty()) {
         if (this.f != null) {
            this.f = null;
            this.a((a)null);
         }
      } else {
         g var4;
         if (this.f != null) {
            if (a(var1, this.f) == null) {
               var2 = b(var1);
               var4 = null;//var3;
               if (var2 != null) {
                  var4 = var2.a();
               }

               this.f = var4;
               this.a(var2);
            }
         } else {
            var3 = b(var1);
            var4 = null;//var2;
            if (var3 != null) {
               var4 = var3.a();
            }

            this.f = var4;
            this.a(var3);
         }
      }

   }

   public PlaybackState b() {
      PlaybackState var1;
      if (this.d != null) {
         var1 = this.d.c();
      } else {
         var1 = null;
      }

      return var1;
   }

   public MediaMetadata c() {
      MediaMetadata var1;
      if (this.d != null) {
         var1 = this.d.b();
      } else {
         var1 = null;
      }

      return var1;
   }

   public void d() {
      if (this.d != null) {
         this.d.d();
      }

   }

   public void e() {
      if (this.d != null) {
         this.d.e();
      }

   }

   public void f() {
      if (this.d != null) {
         this.d.f();
      }

   }

   public void g() {
      if (this.d != null) {
         this.d.g();
      }

   }

   public boolean h() {
      boolean var1;
      if (this.f != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
