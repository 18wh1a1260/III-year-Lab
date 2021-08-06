package com.example.experimentseveneight;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    boolean isPresent;

    DBHelper openhelper;
    EditText e1,e2;
    Button b1;
    public String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);
        e1 = (EditText)findViewById(R.id.Email);
        e2 = (EditText)findViewById(R.id.Password);
        b1 = (Button)findViewById(R.id.Login);
        openhelper = new DBHelper(this);
        b1.setOnClickListener(v -> {
            email = e1.getText().toString();
            String pass = e2.getText().toString();
            isPresent = openhelper.isValidLogin(email,pass);
            if(isPresent) {
                Toast.makeText(getApplicationContext(), "Logged in successfully", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Looks like you have entered something wrong,check and refill the details", Toast.LENGTH_LONG).show();
            }
        });
    }
}