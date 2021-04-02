package com.sample.foo.usingcoordinatorlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.albertsnow.camera.R;
import com.google.android.material.snackbar.Snackbar;

public class FabAndSnackbarActivity extends Activity {

    private Button mShowSnackbarButton;
    private CoordinatorLayout mCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_and_snackbar);

        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        mShowSnackbarButton = (Button) findViewById(R.id.showSnackbarButton);
        mShowSnackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(mCoordinatorLayout,
                        "This is a simple Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("CLOSE", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Custom action
                            }
                        }).show();
            }
        });
    }
}
