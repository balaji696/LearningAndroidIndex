package com.example.learningandroidindex;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ContextMenuAndPopupMenu extends AppCompatActivity {
    public Button contextMenuId;
    private Button PopUpButtonId;



//contextMenu -1
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.context_menu,menu);
        menu.setHeaderTitle("Confirmation");
    }
//contextMenu -2
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.searchContextID:
                {
                Toast.makeText(ContextMenuAndPopupMenu.this, "search clicked", Toast.LENGTH_SHORT).show();
                break;
                }
            case R.id.deletecontextId:
                {
                Toast.makeText(ContextMenuAndPopupMenu.this, "delete clicked", Toast.LENGTH_SHORT).show();
                break;
                }
            default:
                {
                return super.onContextItemSelected(item);
                }
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_example);

        contextMenuId=findViewById(R.id.contextMenuId);     //contextMenu-3
         registerForContextMenu(contextMenuId);                //contextMenu-4


        //pop menu-1
        PopUpButtonId=findViewById(R.id.PopUpButtonId);
        PopUpButtonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu=new PopupMenu(ContextMenuAndPopupMenu.this, PopUpButtonId);
           popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
           popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
               @Override
               public boolean onMenuItemClick(MenuItem item) {
                   switch (item.getItemId()){
                       case R.id.popUpId:
                           {
                           Intent intent=new Intent(ContextMenuAndPopupMenu.this,MainActivity.class);
                           startActivity(intent);
                           break;
                       }
                       case R.id.Item2sumaId:{
                           Toast.makeText(ContextMenuAndPopupMenu.this, "itemits clicked", Toast.LENGTH_SHORT).show();
                       break;
                       }
                       default:
                           return true;
                   }
                   return true;
               }
           });
           popupMenu.show();
            }
        });
    }


}