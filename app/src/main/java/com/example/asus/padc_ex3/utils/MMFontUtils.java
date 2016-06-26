package com.example.asus.padc_ex3.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

import com.example.asus.padc_ex3.PADCEx3App;



/**
 * Created by aung on 6/25/16.
 */
public class MMFontUtils {

    private static Typeface mmTypeFace;
    static {
        Context context = PADCEx3App.getContext();
        mmTypeFace = Typeface.createFromAsset(context.getAssets(), "fonts/Zawgyi.ttf");
    }

    public static void setMMFont(TextView view) {
        view.setTypeface(mmTypeFace);
    }

    private static void applyMMFontToMenuItem(MenuItem menuItem) {
        SpannableString mNewTitle = new SpannableString(menuItem.getTitle());
        mNewTitle.setSpan(new CustomTypefaceSpan("" , mmTypeFace), 0 , mNewTitle.length(),  Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        menuItem.setTitle(mNewTitle);
    }

    public static void applyMMFontToMenu(Menu menu) {
        for (int i=0;i<menu.size();i++) {
            MenuItem menuItem = menu.getItem(i);

            //for applying a font to subMenu ...
            SubMenu subMenu = menuItem.getSubMenu();
            if (subMenu!=null && subMenu.size() >0 ) {
                for (int j=0; j <subMenu.size();j++) {
                    MenuItem subMenuItem = subMenu.getItem(j);
                    MMFontUtils.applyMMFontToMenuItem(subMenuItem);
                }
            }

            //the method we have create in activity
            MMFontUtils.applyMMFontToMenuItem(menuItem);
        }
    }
}
