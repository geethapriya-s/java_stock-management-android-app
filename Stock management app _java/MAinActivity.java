package com.example.best;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.best.R.id;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.Nullable;


public final class MainActivity extends AppCompatActivity {
   private HashMap _$_findViewCache;

   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      this.setContentView(1300000);
      MainActivity context = (MainActivity)this;
      final ObjectRef db = new ObjectRef();
      db.element = new DatabaseHandler((Context)context);
      ((Button)this._$_findCachedViewById(id.button)).setOnClickListener((OnClickListener)(new OnClickListener() {
         public final void onClick(View it) {
            EditText var10000 = (EditText)MainActivity.this._$_findCachedViewById(id.t1);
            Intrinsics.checkExpressionValueIsNotNull(var10000, "t1");
            String var15 = var10000.getText().toString();
            EditText var10001 = (EditText)MainActivity.this._$_findCachedViewById(id.t2);
            Intrinsics.checkExpressionValueIsNotNull(var10001, "t2");
            String var3 = var10001.getText().toString();
            String var7 = var15;
            boolean var4 = false;
            int var8 = Integer.parseInt(var3);
            EditText var10002 = (EditText)MainActivity.this._$_findCachedViewById(id.t3);
            Intrinsics.checkExpressionValueIsNotNull(var10002, "t3");
            var3 = var10002.getText().toString();
            var4 = false;
            int var9 = Integer.parseInt(var3);
            EditText var10003 = (EditText)MainActivity.this._$_findCachedViewById(id.t4);
            Intrinsics.checkExpressionValueIsNotNull(var10003, "t4");
            var3 = var10003.getText().toString();
            var4 = false;
            int var10 = Integer.parseInt(var3);
            user user = new user(var7, var8, var9, var10);
            ((DatabaseHandler)db.element).insertData(user);
         }
      }));
      ((Button)this._$_findCachedViewById(id.r)).setOnClickListener((OnClickListener)(new OnClickListener() {
         public final void onClick(View it) {
            Intent intent = new Intent((Context)MainActivity.this, second.class);
            MainActivity.this.startActivity(intent);
         }
      }));
      ((Button)this._$_findCachedViewById(id.d)).setOnClickListener((OnClickListener)(new OnClickListener() {
         public final void onClick(View it) {
            ((DatabaseHandler)db.element).deleteData();
            ((Button)MainActivity.this._$_findCachedViewById(id.r)).performClick();
         }
      }));
   }

   public View _$_findCachedViewById(int var1) {
      if (this._$_findViewCache == null) {
         this._$_findViewCache = new HashMap();
      }

      View var2 = (View)this._$_findViewCache.get(var1);
      if (var2 == null) {
         var2 = this.findViewById(var1);
         this._$_findViewCache.put(var1, var2);
      }

      return var2;
   }

   public void _$_clearFindViewByIdCache() {
      if (this._$_findViewCache != null) {
         this._$_findViewCache.clear();
      }

   }
}

