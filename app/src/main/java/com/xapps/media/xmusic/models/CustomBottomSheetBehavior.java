package com.xapps.media.xmusic.models;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.lang.reflect.Field;

public class CustomBottomSheetBehavior<V extends View>
        extends BottomSheetBehavior<V> {

    public CustomBottomSheetBehavior() {
        super();
    }

    public CustomBottomSheetBehavior(
            Context context,
            AttributeSet attrs
    ) {
        super(context, attrs);
    }

    @Override
    public void onRestoreInstanceState(
            @NonNull CoordinatorLayout parent,
            @NonNull V child,
            Parcelable state
    ) {
        try {
            super.onRestoreInstanceState(parent, child, state);

            // Drag state bug fix
            Field viewDragHelperField =
                    BottomSheetBehavior.class.getDeclaredField("viewDragHelper");

            viewDragHelperField.setAccessible(true);

            Object viewDragHelper = viewDragHelperField.get(this);

            if (viewDragHelper == null) {
                setState(STATE_COLLAPSED);
            }

        } catch (Exception e) {
            e.printStackTrace();

            try {
                setState(STATE_COLLAPSED);
            } catch (Exception ignored) {
            }
        }
    }

    /**
     * BottomSheet'i güvenli şekilde expand eder
     */
    public void safeExpand() {
        try {
            setState(STATE_EXPANDED);
        } catch (Exception ignored) {
        }
    }

    /**
     * BottomSheet'i güvenli şekilde collapse eder
     */
    public void safeCollapse() {
        try {
            setState(STATE_COLLAPSED);
        } catch (Exception ignored) {
        }
    }

    /**
     * BottomSheet'i gizler
     */
    public void safeHide() {
        try {
            setHideable(true);
            setState(STATE_HIDDEN);
        } catch (Exception ignored) {
        }
    }
}