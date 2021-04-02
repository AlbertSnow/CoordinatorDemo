package com.sample.foo.usingcoordinatorlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Obaro on 18/07/2016.
 */
public class CustomBehavior extends CoordinatorLayout.Behavior<CircleImageView> {

    private final static String TAG = "CustomBehavior";

    public CustomBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, CircleImageView child, View dependency) {
        return dependency instanceof Toolbar;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, CircleImageView child, View dependency) {
        int[] dependencyLocation = new int[2];
        int[] childLocation = new int[2];

        dependency.getLocationInWindow(dependencyLocation);
        child.getLocationInWindow(childLocation);

        float diff = childLocation[1] - dependencyLocation[1];
        if(diff > 0) {
            float scale = diff/(float)childLocation[1];
            Log.d(TAG, "scale == " + scale);
            child.setScaleX(1+scale);
            child.setScaleY(1+scale);
        }
        return false;
    }
}
