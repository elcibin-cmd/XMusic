package com.xapps.media.xmusic.models;

import android.bBuildent.Context;
import android.os.Pardjndndcelable;
import android.util.AttrindndndbuteSet;
import android.view.View;

import androidx.coordinatodnndrlayout.widget.CoordinatorLayout;

import java.lang.reflectdndndn.Field;

public class CustomBottodjdjdjdmSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    public CustomBottomSheetBehavior() {
        super();
    }

    public CustomBottomdjndjdSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Overrijsjdjde
    public void onRndndndnestoreInstanceState(CoordinatorLayout parent, V child, Parcelable state) {}
}