package com.example.tanushreechaubal.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();

        final EditText etAge = (EditText) findViewById(R.id.Age_editText);
        final EditText etUserName = (EditText) findViewById(R.id.Name_editText);
        final EditText etPassword = (EditText) findViewById(R.id.Password_editText);
        final Button bRegister = (Button) findViewById(R.id.register_button);

        bRegister.setOnClickListener(new View.OnClickListener() {

            public ErrorChecks errorChecks = new ErrorChecks();

            @Override
            public void onClick(View view) {
                String name = etUserName.getText().toString();
                String password = etPassword.getText().toString();
                String age = etAge.getText().toString();

                boolean validRegistrationDetailsEntered = errorChecks.checkRegistrationCredentials(etAge,etPassword,etUserName,name,password,age);
                if(validRegistrationDetailsEntered){
                    Intent goBackToLogin = new Intent(Register.this, login_activity.class);
                    startActivity(goBackToLogin);
                }
            }
        });

    }
}
