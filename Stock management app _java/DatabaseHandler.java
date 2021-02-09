// DatabaseHandler.java
package com.example.best;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public final class DatabaseHandler extends SQLiteOpenHelper {
   @NotNull
   private Context context;

   public void onCreate(@Nullable SQLiteDatabase db) {
      String createTable = "CREATE TABLE " + DatabaseHandlerKt.getTABLE_NAME() + " (" + DatabaseHandlerKt.getCOL_ID() + " INTEGER PRIMARY KEY AUTOINCREMENT," + DatabaseHandlerKt.getCOL_NAME() + " VARCHAR(256)," + DatabaseHandlerKt.getCOL_noOfRoles() + " INTEGER," + DatabaseHandlerKt.getCOL_weight() + " INTEGER," + DatabaseHandlerKt.getCOL_totalWeight() + " INTEGER)";
      if (db != null) {
         db.execSQL(createTable);
      }

   }

   public void onUpgrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
   }

   public final void insertData(@NotNull user user) {
      Intrinsics.checkParameterIsNotNull(user, "user");
      SQLiteDatabase db = this.getWritableDatabase();
      ContentValues cv = new ContentValues();
      cv.put(DatabaseHandlerKt.getCOL_NAME(), user.getName());
      cv.put(DatabaseHandlerKt.getCOL_noOfRoles(), user.getNo_of_roles());
      cv.put(DatabaseHandlerKt.getCOL_weight(), user.getWeight());
      cv.put(DatabaseHandlerKt.getCOL_totalWeight(), user.getTotal_weight());
      long result = db.insert(DatabaseHandlerKt.getTABLE_NAME(), (String)null, cv);
      if (result == -1L) {
         Toast.makeText(this.context, (CharSequence)"Failed", 0).show();
      } else {
         Toast.makeText(this.context, (CharSequence)"Success", 0).show();
      }

   }

   @NotNull
   public final List readData() {
      List list = (List)(new ArrayList());
      SQLiteDatabase db = this.getReadableDatabase();
      String query = "Select * from " + DatabaseHandlerKt.getTABLE_NAME();
      Cursor result = db.rawQuery(query, (String[])null);
      if (result.moveToFirst()) {
         do {
            user user = new user("", 0, 0, 0);
            String var10001 = result.getString(result.getColumnIndex(DatabaseHandlerKt.getCOL_ID()));
            Intrinsics.checkExpressionValueIsNotNull(var10001, "result.getString(result.getColumnIndex(COL_ID))");
            String var6 = var10001;
            boolean var7 = false;
            int var9 = Integer.parseInt(var6);
            user.setId(var9);
            var10001 = result.getString(result.getColumnIndex(DatabaseHandlerKt.getCOL_NAME()));
            Intrinsics.checkExpressionValueIsNotNull(var10001, "result.getString(result.getColumnIndex(COL_NAME))");
            user.setName(var10001);
            var10001 = result.getString(result.getColumnIndex(DatabaseHandlerKt.getCOL_noOfRoles()));
            Intrinsics.checkExpressionValueIsNotNull(var10001, "result.getString(result.…lumnIndex(COL_noOfRoles))");
            var6 = var10001;
            var7 = false;
            var9 = Integer.parseInt(var6);
            user.setNo_of_roles(var9);
            var10001 = result.getString(result.getColumnIndex(DatabaseHandlerKt.getCOL_weight()));
            Intrinsics.checkExpressionValueIsNotNull(var10001, "result.getString(result.…tColumnIndex(COL_weight))");
            var6 = var10001;
            var7 = false;
            var9 = Integer.parseInt(var6);
            user.setWeight(var9);
            var10001 = result.getString(result.getColumnIndex(DatabaseHandlerKt.getCOL_totalWeight()));
            Intrinsics.checkExpressionValueIsNotNull(var10001, "result.getString(result.…mnIndex(COL_totalWeight))");
            var6 = var10001;
            var7 = false;
            var9 = Integer.parseInt(var6);
            user.setTotal_weight(var9);
            list.add(user);
         } while(result.moveToNext());
      }

      result.close();
      db.close();
      return list;
   }

   public final void deleteData() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete(DatabaseHandlerKt.getTABLE_NAME(), (String)null, (String[])null);
      db.close();
   }

   @NotNull
   public final Context getContext() {
      return this.context;
   }

   public final void setContext(@NotNull Context var1) {
      Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
      this.context = var1;
   }

   public DatabaseHandler(@NotNull Context context) {
      Intrinsics.checkParameterIsNotNull(context, "context");
      super(context, DatabaseHandlerKt.getDATABASE_NAME(), (CursorFactory)null, 1);
      this.context = context;
   }
}
// DatabaseHandlerKt.java
package com.example.best;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\f\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003¨\u0006\u0010"},
   d2 = {"COL_ID", "", "getCOL_ID", "()Ljava/lang/String;", "COL_NAME", "getCOL_NAME", "COL_noOfRoles", "getCOL_noOfRoles", "COL_totalWeight", "getCOL_totalWeight", "COL_weight", "getCOL_weight", "DATABASE_NAME", "getDATABASE_NAME", "TABLE_NAME", "getTABLE_NAME", "best-app"}
)
public final class DatabaseHandlerKt {
   @NotNull
   private static final String DATABASE_NAME = "ksr";
   @NotNull
   private static final String TABLE_NAME = "details";
   @NotNull
   private static final String COL_NAME = "name";
   @NotNull
   private static final String COL_noOfRoles = "noOfRoles";
   @NotNull
   private static final String COL_ID = "id";
   @NotNull
   private static final String COL_weight = "weight";
   @NotNull
   private static final String COL_totalWeight = "totalWeight";

   @NotNull
   public static final String getDATABASE_NAME() {
      return DATABASE_NAME;
   }

   @NotNull
   public static final String getTABLE_NAME() {
      return TABLE_NAME;
   }

   @NotNull
   public static final String getCOL_NAME() {
      return COL_NAME;
   }

   @NotNull
   public static final String getCOL_noOfRoles() {
      return COL_noOfRoles;
   }

   @NotNull
   public static final String getCOL_ID() {
      return COL_ID;
   }

   @NotNull
   public static final String getCOL_weight() {
      return COL_weight;
   }

   @NotNull
   public static final String getCOL_totalWeight() {
      return COL_totalWeight;
   }
}

