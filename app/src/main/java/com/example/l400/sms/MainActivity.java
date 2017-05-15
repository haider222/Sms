package com.example.l400.sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button smsmanager = (Button)findViewById(R.id.smsmanager);
        Button builtinIntent = (Button)findViewById(R.id.builtinintent);
        smsmanager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , com.example.l400.sms.smsmanager.class);
                startActivity(intent);
            }
        });

        builtinIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , builtinintent.class);
                startActivity(intent);
            }
        });


    }
}
