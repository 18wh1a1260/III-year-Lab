package com.example.myapplication;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SmsActivity  extends AppCompatActivity {
    EditText phoneNum,message;
    Button Send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);


        phoneNum = (EditText)findViewById(R.id.editText1);
        message = (EditText)findViewById(R.id.editText2);
        Send = (Button)findViewById(R.id.button);

        Send.setOnClickListener(v -> {
            String no=phoneNum.getText().toString();
            String msg=message.getText().toString();


            Intent intent=new Intent(getApplicationContext(),SmsActivity.class);
            PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0,intent,0);


            SmsManager sms=SmsManager.getDefault();
            sms.sendTextMessage(no, null, msg, pi,null);

            Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                    Toast.LENGTH_LONG).show();
        });

    }
}
