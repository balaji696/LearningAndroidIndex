package com.example.learningandroidindex;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] listOfActivity;


    @Override                           //option menu coding - 1
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override                           //option menu coding - 2
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menusetingId:
            {
            Toast.makeText(MainActivity.this, "setting button clicked",Toast.LENGTH_SHORT).show();
            return true;
            }
            case  R.id.logoutMenuId:
            {
                Toast.makeText(MainActivity.this,"logout clicked",Toast.LENGTH_SHORT).show();
                return  true;
            }
            default:
                {
                return super.onOptionsItemSelected(item);
                }
        }

    }

    @Override                       // on starting app program default
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listViewIndexingId = findViewById(R.id.listViewIndexingId);

                                    //list view code example
        listOfActivity = getResources().getStringArray(R.array.indexing);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, listOfActivity);
        listViewIndexingId.setAdapter(adapter);
        listViewIndexingId.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String indextype = adapter.getItem(position);

                assert indextype != null;
                switch (indextype)
                {
                    case "1.MOVE TO CHECKBOXEXAMPLE":
                        {
                        startActivity(new Intent(MainActivity.this, CheckBoxExample.class));
                        Toast.makeText(MainActivity.this, "CHECKBOX CLICKED", Toast.LENGTH_SHORT).show();
                        }
                    break;
                    case "2.MOVE TO RADIO BUTTON EXAMPLE":
                        {
                        startActivity(new Intent(MainActivity.this, RadioButtonExample.class));
                        Toast.makeText(MainActivity.this, "RADIO BUTTON CLICKED", Toast.LENGTH_SHORT).show();
                        }
                    break;
                    case "3.MOVE TO PROGRESS BAR ACTIVITY":
                        {
                        startActivity(new Intent(MainActivity.this, ProgressBarAcitivity.class));
                        Toast.makeText(MainActivity.this, "PROGRESS BAR CLICKED", Toast.LENGTH_SHORT).show();
                        }
                    break;
                    case "4.MOVE TO RATING BAR ACTIVITY":
                        {
                        startActivity(new Intent(MainActivity.this, RatingBarExample.class));
                        Toast.makeText(MainActivity.this, "RATING BAR CLICKED", Toast.LENGTH_SHORT).show();
                        }
                    break;
                    case "5.MOVE TO SEEK BAR ACTIVITY":
                        {
                        startActivity(new Intent(MainActivity.this, SeekbarAcitivity.class));
                        Toast.makeText(MainActivity.this, "SEEK BAR CLICKED", Toast.LENGTH_SHORT).show();
                        }
                    break;
                    case "6.MOVE TO SPINNER ACTIVITY":
                        {
                        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
                        Toast.makeText(MainActivity.this, "SPINNER ACTIVITY CLICKED", Toast.LENGTH_SHORT).show();
                        }
                    break;
                    case "7.WEB VIEW":
                        {
                        startActivity(new Intent(MainActivity.this, WebView.class));
                        Toast.makeText(MainActivity.this, "WEB VIEW CLICKED", Toast.LENGTH_SHORT).show();
                        }
                    break;
                    case "8.ALERT DIALOG BOX":
                        {
                        startActivity(new Intent(MainActivity.this, AlertBoxExample.class));
                        Toast.makeText(MainActivity.this, "alerBox clicked", Toast.LENGTH_SHORT).show();
                        }
                    break;
                    case "9.ContextMenuExample":
                    {
                        startActivity(new Intent(MainActivity.this, ContextMenuAndPopupMenu.class));
                        Toast.makeText(MainActivity.this, "ContextMenu clicked", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
            }
        });
        }
    }
