package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DialActivity extends AppCompatActivity {


    EditText phone;
    Button dial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);

        phone = (EditText)findViewById(R.id.editText4);
        dial = (Button)findViewById(R.id.button3);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=phone.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }
        });
    }
}
