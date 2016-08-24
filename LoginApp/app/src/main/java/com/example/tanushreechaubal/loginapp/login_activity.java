package com.example.tanushreechaubal.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    public ErrorChecks errorChecks = new ErrorChecks();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        final EditText etUserName = (EditText) findViewById(R.id.userName_editText);
        final EditText etPassword = (EditText) findViewById(R.id.Password_editText);
        final Button bLogin = (Button) findViewById(R.id.login_button);
        final TextView registerLink = (TextView) findViewById(R.id.registerHere_textView);


                bLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String username = etUserName.getText().toString();
                        String password = etPassword.getText().toString();

                        Boolean validCredentialsEntered = errorChecks.checkLoginCredentials(etUserName,etPassword,username,password);
                        if(validCredentialsEntered){
                            Intent loginIntent = new Intent(login_activity.this, UserAreaActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putString("UserName", username);
                            loginIntent.putExtras(bundle);
                            startActivity(loginIntent);
                            finish();
                        }
                    }
                });

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(login_activity.this, Register.class);
                startActivity(registerIntent);
            }
        });
    }
}
