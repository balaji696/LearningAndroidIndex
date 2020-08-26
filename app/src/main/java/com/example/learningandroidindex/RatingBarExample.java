package com.example.learningandroidindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarExample extends AppCompatActivity {

    private EditText enterNameRatingId;
    private RatingBar ratingBarId;
    private Button ratingSubmitId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_example);

        enterNameRatingId=findViewById(R.id.enterNameRatingId);
        ratingBarId=findViewById(R.id.ratingBarId);
        ratingSubmitId=findViewById(R.id.ratingSubmitId);


        ratingSubmitId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

String movie=enterNameRatingId.getText().toString();
if(!TextUtils.isEmpty(movie)){
float value=ratingBarId.getRating();
String result="movie:"+movie+"\nRating:"+value;
    Toast.makeText(RatingBarExample.this,result,Toast.LENGTH_SHORT).show();
}
else {
    Toast.makeText(RatingBarExample.this,"Enter movie name first",Toast.LENGTH_SHORT).show();
}
            }
        });

    }
}