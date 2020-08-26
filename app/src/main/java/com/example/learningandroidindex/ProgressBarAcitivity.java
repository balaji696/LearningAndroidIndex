package com.example.learningandroidindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarAcitivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_acitivity);

        Button startprogressId = findViewById(R.id.startprogressId);
        Button stopprogressId = findViewById(R.id.stopprogressId);
        final ProgressBar progressBarId=findViewById(R.id.progressBarId);


progressBarId.setVisibility(View.INVISIBLE);
        startprogressId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBarId.setVisibility(View.VISIBLE);

            }
        });

stopprogressId.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
                progressBarId.setVisibility(View.INVISIBLE);
                progressBarId.invalidate();//to stop the progress that run on background
    }
});

    }
}