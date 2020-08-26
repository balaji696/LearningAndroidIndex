package com.example.learningandroidindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class SeekbarAcitivity extends AppCompatActivity {
    private SeekBar seekBar;
    int a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_acitivity);

        Button seekBarClickId = findViewById(R.id.seekBarClickId);
        seekBar=findViewById(R.id.seekBar);

        seekBarClickId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progress=seekBar.getProgress();
                Toast.makeText(SeekbarAcitivity.this,String.valueOf(progress),Toast.LENGTH_SHORT).show();
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                a=progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
Toast.makeText(SeekbarAcitivity.this,String.valueOf(a),Toast.LENGTH_SHORT).show();
            }
        });

    }
}