package com.sample.foo.usingcoordinatorlayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.albertsnow.camera.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CustomBehaviorActivity2 extends AppCompatActivity {

    private FloatingActionButton mShowFabButton;
    private CoordinatorLayout mCoordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_behavior_2);
    }
}
