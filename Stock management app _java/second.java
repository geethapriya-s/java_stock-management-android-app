package com.example.best;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

public final class second extends AppCompatActivity {
   private HashMap _$_findViewCache;

   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      this.setContentView(1300001);
      second context = (second)this;
      DatabaseHandler db = new DatabaseHandler((Context)context);
      TableLayout t1 = null;
      TableLayout tl = (TableLayout)this.findViewById(1000001);
      TableRow trHead = new TableRow((Context)this);
      trHead.setBackgroundColor(-7829368);
      trHead.setLayoutParams((LayoutParams)(new android.widget.TableLayout.LayoutParams(-2, -2)));
      int count = 0;
      int count = count + 1;
      TextView companyName = new TextView((Context)this);
      companyName.setText((CharSequence)"DATE");
      companyName.setTextColor(-1);
      companyName.setPadding(5, 5, 5, 5);
      trHead.addView((View)companyName);
      TextView noOfRoll = new TextView((Context)this);
      noOfRoll.setText((CharSequence)"NO OF ROLLS(Kg.)");
      noOfRoll.setTextColor(-1);
      noOfRoll.setPadding(5, 5, 5, 5);
      trHead.addView((View)noOfRoll);
      TextView weight = new TextView((Context)this);
      weight.setText((CharSequence)"WEIGHT");
      weight.setTextColor(-1);
      weight.setPadding(5, 5, 5, 5);
      trHead.addView((View)weight);
      TextView totalWeight = new TextView((Context)this);
      totalWeight.setText((CharSequence)"TOTAL WEIGHT");
      totalWeight.setTextColor(-1);
      totalWeight.setPadding(5, 5, 5, 5);
      trHead.addView((View)totalWeight);
      tl.addView((View)trHead, (LayoutParams)(new android.widget.TableLayout.LayoutParams(-2, -2)));
      List data = db.readData();
      int i = 0;
      int var14 = data.size() - 1;
      if (i <= var14) {
         while(true) {
            TableRow tr = new TableRow((Context)this);
            if (count % 2 != 0) {
               tr.setBackgroundColor(-7829368);
            }

            tr.setId(100 + count);
            tr.setLayoutParams((LayoutParams)(new android.widget.TableRow.LayoutParams(-2, -2)));
            List data = db.readData();
            TextView companyName1 = new TextView((Context)this);
            companyName1.setText((CharSequence)((user)data.get(i)).getName().toString());
            companyName1.setPadding(2, 0, 5, 0);
            companyName1.setTextColor(-1);
            tr.addView((View)companyName1);
            TextView noOfRoles1 = new TextView((Context)this);
            noOfRoles1.setText((CharSequence)String.valueOf(((user)data.get(i)).getNo_of_roles()));
            noOfRoles1.setTextColor(-1);
            tr.addView((View)noOfRoles1);
            TextView weight1 = new TextView((Context)this);
            weight1.setText((CharSequence)String.valueOf(((user)data.get(i)).getWeight()));
            weight1.setTextColor(-1);
            tr.addView((View)weight1);
            TextView totalWeight1 = new TextView((Context)this);
            totalWeight1.setText((CharSequence)String.valueOf(((user)data.get(i)).getTotal_weight()));
            totalWeight1.setTextColor(-1);
            tr.addView((View)totalWeight1);
            tl.addView((View)tr, (LayoutParams)(new android.widget.TableLayout.LayoutParams(-2, -2)));
            if (i == var14) {
               break;
            }

            ++i;
         }
      }

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

