package com.example.learningandroidindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxExample extends AppCompatActivity {
private Button resultButtonId;
private CheckBox oreoCheckId,parleCheckId,britaniyaCheckId,fiftyCheckId,nutrichoiceCheckId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_example);

        resultButtonId=findViewById(R.id.resultButtonId);
        oreoCheckId=findViewById(R.id.oreoCheckId);
        parleCheckId=findViewById(R.id.parleCheckId);
        britaniyaCheckId=findViewById(R.id.britaniyaCheckId);
        fiftyCheckId=findViewById(R.id.fiftyCheckId);
        nutrichoiceCheckId=findViewById(R.id.nutrichoiceCheckId);

        resultButtonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append("BISCUIT AVAILABLE !!");
                stringBuilder.append("\n"); //next line la varaduku intha code use pananum

                if (oreoCheckId.isChecked()){
                    stringBuilder.append(oreoCheckId.getText().toString());
                    stringBuilder.append("\n");
                }
                if (parleCheckId.isChecked()){
                    stringBuilder.append(parleCheckId.getText().toString());
                    stringBuilder.append("\n");
                }
                if (britaniyaCheckId.isChecked()){
                    stringBuilder.append(britaniyaCheckId.getText().toString());
                    stringBuilder.append("\n");
                }
                if (fiftyCheckId.isChecked()){
                    stringBuilder.append(fiftyCheckId.getText().toString());
                    stringBuilder.append("\n");
                }
                if (nutrichoiceCheckId.isChecked()){
                    stringBuilder.append(nutrichoiceCheckId.getText().toString());
                    stringBuilder.append("\n");
                }
                if(!oreoCheckId.isChecked()&& !parleCheckId.isChecked()&& !britaniyaCheckId.isChecked()&& !fiftyCheckId.isChecked()&& !nutrichoiceCheckId.isChecked()){
                    stringBuilder.append("NONE");
                }
                Toast.makeText(CheckBoxExample.this, stringBuilder.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}