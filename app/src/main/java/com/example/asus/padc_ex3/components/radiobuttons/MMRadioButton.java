package com.example.asus.padc_ex3.components.radiobuttons;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.example.asus.padc_ex3.utils.MMFontUtils;



public class MMRadioButton extends RadioButton {

    public MMRadioButton(Context context) {
        super(context);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }

    public MMRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }

    public MMRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }
}
