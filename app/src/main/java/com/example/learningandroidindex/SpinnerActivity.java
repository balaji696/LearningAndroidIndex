package com.example.learningandroidindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_acitivity);
        Button spinnerSelectId = findViewById(R.id.spinnerSelectId);
        final Spinner spinnerMainId = findViewById(R.id.spinnerMainId);

        String[] listarray = getResources().getStringArray(R.array.language);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(SpinnerActivity.this,android.R.layout.simple_spinner_item, listarray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMainId.setAdapter(adapter);

        spinnerSelectId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result=spinnerMainId.getSelectedItem().toString();
                Toast.makeText(SpinnerActivity.this,result,Toast.LENGTH_SHORT).show();

            }
        });
    }
}