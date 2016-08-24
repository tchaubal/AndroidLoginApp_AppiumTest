package com.example.tanushreechaubal.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();


        final TextView viewUserName = (TextView) findViewById(R.id.welcomeUsername_textView);

        Bundle bundle = getIntent().getExtras();
        viewUserName.setText(bundle.getString("UserName"));

        Button checkUserArea = (Button) findViewById(R.id.userAreaCheck_button);
        checkUserArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button works!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
