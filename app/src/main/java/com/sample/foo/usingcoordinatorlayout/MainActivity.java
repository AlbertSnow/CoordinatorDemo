package com.sample.foo.usingcoordinatorlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.albertsnow.camera.R;

public class MainActivity extends Activity {

    private Button mFabAndSnackbarButton;
    private Button mFabAndTwoWidgetsButton;
    private Button mCollapsingToolbarButton;
    private Button mCustomBehaviorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFabAndSnackbarButton = (Button) findViewById(R.id.fabAndSnackbarButton);
        mFabAndSnackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FabAndSnackbarActivity.class));
            }
        });

        mFabAndTwoWidgetsButton = (Button) findViewById(R.id.fabAndTwoWidgetsButton);
        mFabAndTwoWidgetsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FabFollowsWidgetActivity.class));
            }
        });

        mCollapsingToolbarButton = (Button) findViewById(R.id.collapseToolbarButton);
        mCollapsingToolbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CollapsingToolbarActivity.class));
            }
        });

        mCustomBehaviorButton = (Button) findViewById(R.id.customBehaviorButton);
        mCustomBehaviorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CustomBehaviorActivity.class));
            }
        });
        findViewById(R.id.customBehaviorButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomBehaviorActivity3.class));
            }
        });
    }

    boolean firstArrive = true;

    @Override
    protected void onResume() {
        super.onResume();
        if (firstArrive) {
            firstArrive = !firstArrive;
            startActivity(new Intent(MainActivity.this, CustomBehaviorActivity2.class));
        }
    }
}
