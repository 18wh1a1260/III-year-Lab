package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                openSmsActivity();

                return true;
            case R.id.item2:
                openBROWSEActivity();

                return true;
            case R.id.item3:
                openDIALActivity();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openSmsActivity(){
        Intent intent = new Intent(this,SmsActivity.class);
        startActivity(intent);

    }

    public void openBROWSEActivity(){
        Intent intent = new Intent(this,BrowseActivity.class);
        startActivity(intent);

    }

    public void openDIALActivity(){
        Intent intent = new Intent(this, DialActivity.class);
        startActivity(intent);

    }



}