package com.sample.foo.usingcoordinatorlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.albertsnow.camera.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class CustomBehaviorActivity extends AppCompatActivity {

    private FloatingActionButton mShowFabButton;
    private CoordinatorLayout mCoordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_behavior);

        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        mShowFabButton = (FloatingActionButton) findViewById(R.id.fab);
        mShowFabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(mCoordinatorLayout,
                        "This is a simple Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("CLOSE", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }
        });
    }
}
