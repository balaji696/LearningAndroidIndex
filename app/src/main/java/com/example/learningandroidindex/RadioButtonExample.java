package com.example.learningandroidindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonExample extends AppCompatActivity {
    private Button biriyaniSubmit;
    private RadioGroup radioGroupId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_example);

        biriyaniSubmit=findViewById(R.id.biriyaniSubmitId);
        radioGroupId=findViewById(R.id.radioGroupId);

        biriyaniSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder briy=new StringBuilder();
                briy.append("TYPE OF BIRIYANI :");
                int id=radioGroupId.getCheckedRadioButtonId();
                RadioButton chickenBriyaniId= findViewById(id);
                if (chickenBriyaniId!=null){
                    briy.append(chickenBriyaniId.getText().toString());
                    Toast.makeText(RadioButtonExample.this,briy.toString(),Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RadioButtonExample.this,"select anyone",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}