package com.example.asus.padc_ex3.components.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.example.asus.padc_ex3.utils.MMFontUtils;


/**
 * Created by aung on 6/25/16.
 */
public class MMButton extends Button {

    public MMButton(Context context) {
        super(context);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }

    public MMButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }

    public MMButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }
}
