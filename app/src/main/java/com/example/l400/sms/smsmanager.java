package com.example.l400.sms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class smsmanager extends AppCompatActivity {

    EditText mobilenumber , sms;
    Button smssend;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsmanager);
        mobilenumber = (EditText)findViewById(R.id.mobilenumber);
        sms = (EditText)findViewById(R.id.text);
        smssend = (Button)findViewById(R.id.smssend);


        smssend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = mobilenumber.getText().toString();
                String texxt = sms.getText().toString();
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(number ,null ,texxt ,null ,null);
            }
        });
    }
}
