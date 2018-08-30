package android.support.v4.b;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnCreateContextMenuListener;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class p implements ComponentCallbacks, OnCreateContextMenuListener {
   static final Object j = new Object();
   private static final android.support.v4.g.t sClassMap = new android.support.v4.g.t();
   ad A;
   ah B;
   aq C;
   p D;
   int E;
   int F;
   String G;
   boolean H;
   boolean I;
   boolean J;
   boolean K;
   boolean L;
   boolean M = true;
   boolean N;
   ViewGroup O;
   View P;
   View Q;
   boolean R;
   boolean S = true;
   bm T;
   boolean U;
   boolean V;
   s W;
   boolean X;
   boolean Y;
   float Z;
   int k = 0;
   Bundle l;
   SparseArray m;
   int n = -1;
   String o;
   Bundle p;
   p q;
   int r = -1;
   int s;
   boolean t;
   boolean u;
   boolean v;
   boolean w;
   boolean x;
   int y;
   ah z;

   // $FF: synthetic method
   static void a(p var0) {
      var0.callStartTransitionListener();
   }

   static boolean a(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private void callStartTransitionListener() {
      u var1 = null;
      if (this.W != null) {
         this.W.h = false;
         var1 = this.W.i;
         this.W.i = null;
      }

      if (var1 != null) {
         var1.a();
      }

   }

   private s ensureAnimationInfo() {
      if (this.W == null) {
         this.W = new s();
      }

      return this.W;
   }

   public static p instantiate(Context var0, String var1) {
      return instantiate(var0, var1, (Bundle)null);
   }

   public static p instantiate(Context param0, String param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   p a(String var1) {
      p var2;
      if (var1.equals(this.o)) {
         var2 = this;
      } else if (this.B != null) {
         var2 = this.B.b(var1);
      } else {
         var2 = null;
      }

      return var2;
   }

   View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      if (this.B != null) {
         this.B.i();
      }

      return this.onCreateView(var1, var2, var3);
   }

   void a(int var1) {
      if (this.W != null || var1 != 0) {
         this.ensureAnimationInfo().c = var1;
      }

   }

   void a(int var1, int var2) {
      if (this.W != null || var1 != 0 || var2 != 0) {
         this.ensureAnimationInfo();
         this.W.d = var1;
         this.W.e = var2;
      }

   }

   final void a(int var1, p var2) {
      this.n = var1;
      if (var2 != null) {
         this.o = var2.o + ":" + this.n;
      } else {
         this.o = "android:fragment:" + this.n;
      }

   }

   void a(Configuration var1) {
      this.onConfigurationChanged(var1);
      if (this.B != null) {
         this.B.a(var1);
      }

   }

   final void a(Bundle var1) {
      if (this.m != null) {
         this.Q.restoreHierarchyState(this.m);
         this.m = null;
      }

      this.N = false;
      this.onViewStateRestored(var1);
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onViewStateRestored()");
      }
   }

   void a(u var1) {
      this.ensureAnimationInfo();
      if (var1 != this.W.i) {
         if (var1 != null && this.W.i != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
         }

         if (this.W.h) {
            this.W.i = var1;
         }

         if (var1 != null) {
            var1.b();
         }
      }

   }

   void a(View var1) {
      this.ensureAnimationInfo().a = var1;
   }

   final boolean a() {
      boolean var1;
      if (this.y > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean a(Menu var1) {
      boolean var2 = false;
      boolean var3 = false;
      if (!this.H) {
         boolean var4 = var3;
         if (this.L) {
            var4 = var3;
            if (this.M) {
               var4 = true;
               this.onPrepareOptionsMenu(var1);
            }
         }

         var2 = var4;
         if (this.B != null) {
            var2 = var4 | this.B.a(var1);
         }
      }

      return var2;
   }

   boolean a(Menu var1, MenuInflater var2) {
      boolean var3 = false;
      boolean var4 = false;
      if (!this.H) {
         boolean var5 = var4;
         if (this.L) {
            var5 = var4;
            if (this.M) {
               var5 = true;
               this.onCreateOptionsMenu(var1, var2);
            }
         }

         var3 = var5;
         if (this.B != null) {
            var3 = var5 | this.B.a(var1, var2);
         }
      }

      return var3;
   }

   boolean a(MenuItem var1) {
      boolean var2 = true;
      if (this.H || (!this.L || !this.M || !this.onOptionsItemSelected(var1)) && (this.B == null || !this.B.a(var1))) {
         var2 = false;
      }

      return var2;
   }

   void b() {
      this.n = -1;
      this.o = null;
      this.t = false;
      this.u = false;
      this.v = false;
      this.w = false;
      this.x = false;
      this.y = 0;
      this.z = null;
      this.B = null;
      this.A = null;
      this.E = 0;
      this.F = 0;
      this.G = null;
      this.H = false;
      this.I = false;
      this.K = false;
      this.T = null;
      this.U = false;
      this.V = false;
   }

   void b(int var1) {
      this.ensureAnimationInfo().b = var1;
   }

   void b(Bundle var1) {
      if (var1 != null) {
         Parcelable var2 = var1.getParcelable("android:support:fragments");
         if (var2 != null) {
            if (this.B == null) {
               this.c();
            }

            this.B.a(var2, this.C);
            this.C = null;
            this.B.j();
         }
      }

   }

   void b(Menu var1) {
      if (!this.H) {
         if (this.L && this.M) {
            this.onOptionsMenuClosed(var1);
         }

         if (this.B != null) {
            this.B.b(var1);
         }
      }

   }

   void b(boolean var1) {
      this.onMultiWindowModeChanged(var1);
      if (this.B != null) {
         this.B.a(var1);
      }

   }

   boolean b(MenuItem var1) {
      boolean var2 = true;
      if (this.H || !this.onContextItemSelected(var1) && (this.B == null || !this.B.b(var1))) {
         var2 = false;
      }

      return var2;
   }

   void c() {
      if (this.A == null) {
         throw new IllegalStateException("Fragment has not been attached yet.");
      } else {
         this.B = new ah();
         this.B.a((ad)this.A, (ab)(new r(this)), this);
      }
   }

   void c(Bundle var1) {
      if (this.B != null) {
         this.B.i();
      }

      this.k = 1;
      this.N = false;
      this.onCreate(var1);
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onCreate()");
      }
   }

   void c(boolean var1) {
      this.onPictureInPictureModeChanged(var1);
      if (this.B != null) {
         this.B.b(var1);
      }

   }

   void d() {
      if (this.B != null) {
         this.B.i();
         this.B.d();
      }

      this.k = 4;
      this.N = false;
      this.onStart();
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onStart()");
      } else {
         if (this.B != null) {
            this.B.l();
         }

         if (this.T != null) {
            this.T.g();
         }

      }
   }

   void d(Bundle var1) {
      if (this.B != null) {
         this.B.i();
      }

      this.k = 2;
      this.N = false;
      this.onActivityCreated(var1);
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onActivityCreated()");
      } else {
         if (this.B != null) {
            this.B.k();
         }

      }
   }

   void d(boolean var1) {
      this.ensureAnimationInfo().j = var1;
   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mFragmentId=#");
      var3.print(Integer.toHexString(this.E));
      var3.print(" mContainerId=#");
      var3.print(Integer.toHexString(this.F));
      var3.print(" mTag=");
      var3.println(this.G);
      var3.print(var1);
      var3.print("mState=");
      var3.print(this.k);
      var3.print(" mIndex=");
      var3.print(this.n);
      var3.print(" mWho=");
      var3.print(this.o);
      var3.print(" mBackStackNesting=");
      var3.println(this.y);
      var3.print(var1);
      var3.print("mAdded=");
      var3.print(this.t);
      var3.print(" mRemoving=");
      var3.print(this.u);
      var3.print(" mFromLayout=");
      var3.print(this.v);
      var3.print(" mInLayout=");
      var3.println(this.w);
      var3.print(var1);
      var3.print("mHidden=");
      var3.print(this.H);
      var3.print(" mDetached=");
      var3.print(this.I);
      var3.print(" mMenuVisible=");
      var3.print(this.M);
      var3.print(" mHasMenu=");
      var3.println(this.L);
      var3.print(var1);
      var3.print("mRetainInstance=");
      var3.print(this.J);
      var3.print(" mRetaining=");
      var3.print(this.K);
      var3.print(" mUserVisibleHint=");
      var3.println(this.S);
      if (this.z != null) {
         var3.print(var1);
         var3.print("mFragmentManager=");
         var3.println(this.z);
      }

      if (this.A != null) {
         var3.print(var1);
         var3.print("mHost=");
         var3.println(this.A);
      }

      if (this.D != null) {
         var3.print(var1);
         var3.print("mParentFragment=");
         var3.println(this.D);
      }

      if (this.p != null) {
         var3.print(var1);
         var3.print("mArguments=");
         var3.println(this.p);
      }

      if (this.l != null) {
         var3.print(var1);
         var3.print("mSavedFragmentState=");
         var3.println(this.l);
      }

      if (this.m != null) {
         var3.print(var1);
         var3.print("mSavedViewState=");
         var3.println(this.m);
      }

      if (this.q != null) {
         var3.print(var1);
         var3.print("mTarget=");
         var3.print(this.q);
         var3.print(" mTargetRequestCode=");
         var3.println(this.s);
      }

      if (this.m() != 0) {
         var3.print(var1);
         var3.print("mNextAnim=");
         var3.println(this.m());
      }

      if (this.O != null) {
         var3.print(var1);
         var3.print("mContainer=");
         var3.println(this.O);
      }

      if (this.P != null) {
         var3.print(var1);
         var3.print("mView=");
         var3.println(this.P);
      }

      if (this.Q != null) {
         var3.print(var1);
         var3.print("mInnerView=");
         var3.println(this.P);
      }

      if (this.r() != null) {
         var3.print(var1);
         var3.print("mAnimatingAway=");
         var3.println(this.r());
         var3.print(var1);
         var3.print("mStateAfterAnimating=");
         var3.println(this.s());
      }

      if (this.T != null) {
         var3.print(var1);
         var3.println("Loader Manager:");
         this.T.a(var1 + "  ", var2, var3, var4);
      }

      if (this.B != null) {
         var3.print(var1);
         var3.println("Child " + this.B + ":");
         this.B.a(var1 + "  ", var2, var3, var4);
      }

   }

   void e() {
      if (this.B != null) {
         this.B.i();
         this.B.d();
      }

      this.k = 5;
      this.N = false;
      this.onResume();
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onResume()");
      } else {
         if (this.B != null) {
            this.B.m();
            this.B.d();
         }

      }
   }

   void e(Bundle var1) {
      this.onSaveInstanceState(var1);
      if (this.B != null) {
         Parcelable var2 = this.B.h();
         if (var2 != null) {
            var1.putParcelable("android:support:fragments", var2);
         }
      }

   }

   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   void f() {
      this.onLowMemory();
      if (this.B != null) {
         this.B.s();
      }

   }

   void g() {
      if (this.B != null) {
         this.B.n();
      }

      this.k = 4;
      this.N = false;
      this.onPause();
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onPause()");
      }
   }

   public final x getActivity() {
      x var1;
      if (this.A == null) {
         var1 = null;
      } else {
         var1 = (x)this.A.h();
      }

      return var1;
   }

   public boolean getAllowEnterTransitionOverlap() {
      boolean var1;
      if (this.W != null && android.support.v4.b.s.g(this.W) != null) {
         var1 = android.support.v4.b.s.g(this.W);
      } else {
         var1 = true;
      }

      return var1;
   }

   public boolean getAllowReturnTransitionOverlap() {
      boolean var1;
      if (this.W != null && android.support.v4.b.s.h(this.W) != null) {
         var1 = android.support.v4.b.s.h(this.W);
      } else {
         var1 = true;
      }

      return var1;
   }

   public final Bundle getArguments() {
      return this.p;
   }

   public final ae getChildFragmentManager() {
      if (this.B == null) {
         this.c();
         if (this.k >= 5) {
            this.B.m();
         } else if (this.k >= 4) {
            this.B.l();
         } else if (this.k >= 2) {
            this.B.k();
         } else if (this.k >= 1) {
            this.B.j();
         }
      }

      return this.B;
   }

   public Context getContext() {
      Context var1;
      if (this.A == null) {
         var1 = null;
      } else {
         var1 = this.A.i();
      }

      return var1;
   }

   public Object getEnterTransition() {
      Object var1;
      if (this.W == null) {
         var1 = null;
      } else {
         var1 = android.support.v4.b.s.a(this.W);
      }

      return var1;
   }

   public Object getExitTransition() {
      Object var1;
      if (this.W == null) {
         var1 = null;
      } else {
         var1 = android.support.v4.b.s.c(this.W);
      }

      return var1;
   }

   public final ae getFragmentManager() {
      return this.z;
   }

   public final Object getHost() {
      Object var1;
      if (this.A == null) {
         var1 = null;
      } else {
         var1 = this.A.g();
      }

      return var1;
   }

   public final int getId() {
      return this.E;
   }

   public LayoutInflater getLayoutInflater(Bundle var1) {
      LayoutInflater var2 = this.A.b();
      this.getChildFragmentManager();
      android.support.v4.view.ai.a(var2, this.B.t());
      return var2;
   }

   public bk getLoaderManager() {
      bm var1;
      if (this.T != null) {
         var1 = this.T;
      } else {
         if (this.A == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
         }

         this.V = true;
         this.T = this.A.a(this.o, this.U, true);
         var1 = this.T;
      }

      return var1;
   }

   public final p getParentFragment() {
      return this.D;
   }

   public Object getReenterTransition() {
      Object var1;
      if (this.W == null) {
         var1 = null;
      } else if (android.support.v4.b.s.d(this.W) == j) {
         var1 = this.getExitTransition();
      } else {
         var1 = android.support.v4.b.s.d(this.W);
      }

      return var1;
   }

   public final Resources getResources() {
      if (this.A == null) {
         throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      } else {
         return this.A.i().getResources();
      }
   }

   public final boolean getRetainInstance() {
      return this.J;
   }

   public Object getReturnTransition() {
      Object var1;
      if (this.W == null) {
         var1 = null;
      } else if (android.support.v4.b.s.b(this.W) == j) {
         var1 = this.getEnterTransition();
      } else {
         var1 = android.support.v4.b.s.b(this.W);
      }

      return var1;
   }

   public Object getSharedElementEnterTransition() {
      Object var1;
      if (this.W == null) {
         var1 = null;
      } else {
         var1 = android.support.v4.b.s.e(this.W);
      }

      return var1;
   }

   public Object getSharedElementReturnTransition() {
      Object var1;
      if (this.W == null) {
         var1 = null;
      } else if (android.support.v4.b.s.f(this.W) == j) {
         var1 = this.getSharedElementEnterTransition();
      } else {
         var1 = android.support.v4.b.s.f(this.W);
      }

      return var1;
   }

   public final String getString(int var1) {
      return this.getResources().getString(var1);
   }

   public final String getString(int var1, Object... var2) {
      return this.getResources().getString(var1, var2);
   }

   public final String getTag() {
      return this.G;
   }

   public final p getTargetFragment() {
      return this.q;
   }

   public final int getTargetRequestCode() {
      return this.s;
   }

   public final CharSequence getText(int var1) {
      return this.getResources().getText(var1);
   }

   public boolean getUserVisibleHint() {
      return this.S;
   }

   public View getView() {
      return this.P;
   }

   void h() {
      if (this.B != null) {
         this.B.o();
      }

      this.k = 3;
      this.N = false;
      this.onStop();
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onStop()");
      }
   }

   public final boolean hasOptionsMenu() {
      return this.L;
   }

   public final int hashCode() {
      return super.hashCode();
   }

   void i() {
      if (this.B != null) {
         this.B.p();
      }

      this.k = 2;
      if (this.U) {
         this.U = false;
         if (!this.V) {
            this.V = true;
            this.T = this.A.a(this.o, this.U, false);
         }

         if (this.T != null) {
            if (this.A.l()) {
               this.T.d();
            } else {
               this.T.c();
            }
         }
      }

   }

   public final boolean isAdded() {
      boolean var1;
      if (this.A != null && this.t) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean isDetached() {
      return this.I;
   }

   public final boolean isHidden() {
      return this.H;
   }

   public final boolean isInLayout() {
      return this.w;
   }

   public final boolean isMenuVisible() {
      return this.M;
   }

   public final boolean isRemoving() {
      return this.u;
   }

   public final boolean isResumed() {
      boolean var1;
      if (this.k >= 5) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean isVisible() {
      boolean var1;
      if (this.isAdded() && !this.isHidden() && this.P != null && this.P.getWindowToken() != null && this.P.getVisibility() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   void j() {
      if (this.B != null) {
         this.B.q();
      }

      this.k = 1;
      this.N = false;
      this.onDestroyView();
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onDestroyView()");
      } else {
         if (this.T != null) {
            this.T.f();
         }

      }
   }

   void k() {
      if (this.B != null) {
         this.B.r();
      }

      this.k = 0;
      this.N = false;
      this.onDestroy();
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onDestroy()");
      } else {
         this.B = null;
      }
   }

   void l() {
      this.N = false;
      this.onDetach();
      if (!this.N) {
         throw new doException("Fragment " + this + " did not call through to super.onDetach()");
      } else {
         if (this.B != null) {
            if (!this.K) {
               throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
            }

            this.B.r();
            this.B = null;
         }

      }
   }

   int m() {
      int var1;
      if (this.W == null) {
         var1 = 0;
      } else {
         var1 = this.W.c;
      }

      return var1;
   }

   int n() {
      int var1;
      if (this.W == null) {
         var1 = 0;
      } else {
         var1 = this.W.d;
      }

      return var1;
   }

   int o() {
      int var1;
      if (this.W == null) {
         var1 = 0;
      } else {
         var1 = this.W.e;
      }

      return var1;
   }

   public void onActivityCreated(Bundle var1) {
      this.N = true;
   }

   public void onActivityResult(int var1, int var2, Intent var3) {
   }

   @Deprecated
   public void onAttach(Activity var1) {
      this.N = true;
   }

   public void onAttach(Context var1) {
      this.N = true;
      Activity var2;
      if (this.A == null) {
         var2 = null;
      } else {
         var2 = this.A.h();
      }

      if (var2 != null) {
         this.N = false;
         this.onAttach(var2);
      }

   }

   public void onAttachFragment(p var1) {
   }

   public void onConfigurationChanged(Configuration var1) {
      this.N = true;
   }

   public boolean onContextItemSelected(MenuItem var1) {
      return false;
   }

   public void onCreate(Bundle var1) {
      this.N = true;
      this.b(var1);
      if (this.B != null && !this.B.a(1)) {
         this.B.j();
      }

   }

   public Animation onCreateAnimation(int var1, boolean var2, int var3) {
      return null;
   }

   public void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      this.getActivity().onCreateContextMenu(var1, var2, var3);
   }

   public void onCreateOptionsMenu(Menu var1, MenuInflater var2) {
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return null;
   }

   public void onDestroy() {
      this.N = true;
      if (!this.V) {
         this.V = true;
         this.T = this.A.a(this.o, this.U, false);
      }

      if (this.T != null) {
         this.T.h();
      }

   }

   public void onDestroyOptionsMenu() {
   }

   public void onDestroyView() {
      this.N = true;
   }

   public void onDetach() {
      this.N = true;
   }

   public void onHiddenChanged(boolean var1) {
   }

   @Deprecated
   public void onInflate(Activity var1, AttributeSet var2, Bundle var3) {
      this.N = true;
   }

   public void onInflate(Context var1, AttributeSet var2, Bundle var3) {
      this.N = true;
      Activity var4;
      if (this.A == null) {
         var4 = null;
      } else {
         var4 = this.A.h();
      }

      if (var4 != null) {
         this.N = false;
         this.onInflate(var4, var2, var3);
      }

   }

   public void onLowMemory() {
      this.N = true;
   }

   public void onMultiWindowModeChanged(boolean var1) {
   }

   public boolean onOptionsItemSelected(MenuItem var1) {
      return false;
   }

   public void onOptionsMenuClosed(Menu var1) {
   }

   public void onPause() {
      this.N = true;
   }

   public void onPictureInPictureModeChanged(boolean var1) {
   }

   public void onPrepareOptionsMenu(Menu var1) {
   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
   }

   public void onResume() {
      this.N = true;
   }

   public void onSaveInstanceState(Bundle var1) {
   }

   public void onStart() {
      this.N = true;
      if (!this.U) {
         this.U = true;
         if (!this.V) {
            this.V = true;
            this.T = this.A.a(this.o, this.U, false);
         }

         if (this.T != null) {
            this.T.b();
         }
      }

   }

   public void onStop() {
      this.N = true;
   }

   public void onViewCreated(View var1, Bundle var2) {
   }

   public void onViewStateRestored(Bundle var1) {
      this.N = true;
   }

   dn p() {
      dn var1;
      if (this.W == null) {
         var1 = null;
      } else {
         var1 = this.W.f;
      }

      return var1;
   }

   public void postponeEnterTransition() {
      this.ensureAnimationInfo().h = true;
   }

   dn q() {
      dn var1;
      if (this.W == null) {
         var1 = null;
      } else {
         var1 = this.W.g;
      }

      return var1;
   }

   View r() {
      View var1;
      if (this.W == null) {
         var1 = null;
      } else {
         var1 = this.W.a;
      }

      return var1;
   }

   public void registerForContextMenu(View var1) {
      var1.setOnCreateContextMenuListener(this);
   }

   public final void requestPermissions(String[] var1, int var2) {
      if (this.A == null) {
         throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      } else {
         this.A.a(this, var1, var2);
      }
   }

   int s() {
      int var1;
      if (this.W == null) {
         var1 = 0;
      } else {
         var1 = this.W.b;
      }

      return var1;
   }

   public void setAllowEnterTransitionOverlap(boolean var1) {
      android.support.v4.b.s.a(this.ensureAnimationInfo(), var1);
   }

   public void setAllowReturnTransitionOverlap(boolean var1) {
      android.support.v4.b.s.b(this.ensureAnimationInfo(), var1);
   }

   public void setArguments(Bundle var1) {
      if (this.n >= 0) {
         throw new IllegalStateException("Fragment already active");
      } else {
         this.p = var1;
      }
   }

   public void setEnterSharedElementCallback(dn var1) {
      this.ensureAnimationInfo().f = var1;
   }

   public void setEnterTransition(Object var1) {
      android.support.v4.b.s.a(this.ensureAnimationInfo(), var1);
   }

   public void setExitSharedElementCallback(dn var1) {
      this.ensureAnimationInfo().g = var1;
   }

   public void setExitTransition(Object var1) {
      android.support.v4.b.s.c(this.ensureAnimationInfo(), var1);
   }

   public void setHasOptionsMenu(boolean var1) {
      if (this.L != var1) {
         this.L = var1;
         if (this.isAdded() && !this.isHidden()) {
            this.A.d();
         }
      }

   }

   public void setInitialSavedState(v var1) {
      if (this.n >= 0) {
         throw new IllegalStateException("Fragment already active");
      } else {
         Bundle var2;
         if (var1 != null && var1.a != null) {
            var2 = var1.a;
         } else {
            var2 = null;
         }

         this.l = var2;
      }
   }

   public void setMenuVisibility(boolean var1) {
      if (this.M != var1) {
         this.M = var1;
         if (this.L && this.isAdded() && !this.isHidden()) {
            this.A.d();
         }
      }

   }

   public void setReenterTransition(Object var1) {
      android.support.v4.b.s.d(this.ensureAnimationInfo(), var1);
   }

   public void setRetainInstance(boolean var1) {
      this.J = var1;
   }

   public void setReturnTransition(Object var1) {
      android.support.v4.b.s.b(this.ensureAnimationInfo(), var1);
   }

   public void setSharedElementEnterTransition(Object var1) {
      android.support.v4.b.s.e(this.ensureAnimationInfo(), var1);
   }

   public void setSharedElementReturnTransition(Object var1) {
      android.support.v4.b.s.f(this.ensureAnimationInfo(), var1);
   }

   public void setTargetFragment(p var1, int var2) {
      this.q = var1;
      this.s = var2;
   }

   public void setUserVisibleHint(boolean var1) {
      if (!this.S && var1 && this.k < 4 && this.z != null && this.isAdded()) {
         this.z.a(this);
      }

      this.S = var1;
      if (this.k < 4 && !var1) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.R = var1;
   }

   public boolean shouldShowRequestPermissionRationale(String var1) {
      boolean var2;
      if (this.A != null) {
         var2 = this.A.a(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   public void startActivity(Intent var1) {
      this.startActivity(var1, (Bundle)null);
   }

   public void startActivity(Intent var1, Bundle var2) {
      if (this.A == null) {
         throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      } else {
         this.A.a(this, var1, -1, var2);
      }
   }

   public void startActivityForResult(Intent var1, int var2) {
      this.startActivityForResult(var1, var2, (Bundle)null);
   }

   public void startActivityForResult(Intent var1, int var2, Bundle var3) {
      if (this.A == null) {
         throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      } else {
         this.A.a(this, var1, var2, var3);
      }
   }

   public void startIntentSenderForResult(IntentSender var1, int var2, Intent var3, int var4, int var5, int var6, Bundle var7) {
      if (this.A == null) {
         throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      } else {
         this.A.a(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public void startPostponedEnterTransition() {
      if (this.z != null && this.z.n != null) {
         if (Looper.myLooper() != this.z.n.j().getLooper()) {
            this.z.n.j().postAtFrontOfQueue(new q(this));
         } else {
            this.callStartTransitionListener();
         }
      } else {
         this.ensureAnimationInfo().h = false;
      }

   }

   boolean t() {
      boolean var1;
      if (this.W == null) {
         var1 = false;
      } else {
         var1 = this.W.h;
      }

      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      android.support.v4.g.f.a(this, var1);
      if (this.n >= 0) {
         var1.append(" #");
         var1.append(this.n);
      }

      if (this.E != 0) {
         var1.append(" id=0x");
         var1.append(Integer.toHexString(this.E));
      }

      if (this.G != null) {
         var1.append(" ");
         var1.append(this.G);
      }

      var1.append('}');
      return var1.toString();
   }

   boolean u() {
      boolean var1;
      if (this.W == null) {
         var1 = false;
      } else {
         var1 = this.W.j;
      }

      return var1;
   }

   public void unregisterForContextMenu(View var1) {
      var1.setOnCreateContextMenuListener((OnCreateContextMenuListener)null);
   }
}
