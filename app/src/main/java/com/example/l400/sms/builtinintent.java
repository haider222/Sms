package com.example.l400.sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class builtinintent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builtinintent);
        Button composesms = (Button)findViewById(R.id.cmposesms);

        composesms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("Sms TO :"));
                intent.setType("vnd.android-dir/mms-sms");
                intent.putExtra("address" ,new String (""));
                intent.putExtra("sms_body" , "");
                startActivity(intent);

            }
        });
    }
}
