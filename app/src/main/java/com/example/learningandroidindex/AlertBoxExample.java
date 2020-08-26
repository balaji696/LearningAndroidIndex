package com.example.learningandroidindex;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertBoxExample extends AppCompatActivity {
    private Button alertType1Id, alertType2Id, alertType3Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_box_example);


        alertType1Id=findViewById(R.id.alertType1Id);
        alertType2Id=findViewById(R.id.alertType2Id);
        alertType3Id=findViewById(R.id.alertType3Id);

        alertType1Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog=new AlertDialog.Builder(AlertBoxExample.this).create();
                alertDialog.setTitle("this is title");
                alertDialog.setMessage("this is messgae");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxExample.this,"Ok button pressed",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();

            }
        });

        alertType2Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog=new AlertDialog.Builder(AlertBoxExample.this).create();
                alertDialog.setTitle("Delete");
                alertDialog.setMessage("Are your sure");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxExample.this,"Ok button pressed",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxExample.this,"cancel button pressed",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });

        alertType3Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog=new AlertDialog.Builder(AlertBoxExample.this).create();
                alertDialog.setTitle("Rating");
                alertDialog.setMessage("ple Rate us");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Rate", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxExample.this,"Rate button pressed",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxExample.this,"cancel button pressed",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Later", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertBoxExample.this,"later button pressed",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();
            }
        });

    }
}