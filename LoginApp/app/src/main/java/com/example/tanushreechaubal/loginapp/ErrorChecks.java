package com.example.tanushreechaubal.loginapp;

import android.widget.EditText;

/**
 * Created by TanushreeChaubal on 8/23/16.
 */
public class ErrorChecks {

    public boolean checkLoginCredentials(EditText etUserName,EditText etPassword,String userName, String password){

        /**
         *
         * 1. username and pwd not empty
         * 2. username and pwd >= 5 chars
         * 3. username or pwd = 'invalid'
         *
         */

        boolean result = true;

        //Error checks for username and password
        if(userName.matches("") && password.matches("")){
            etUserName.setError("Please enter some username!");
            etPassword.setError("Please enter some password!");
            result = false;
        }else if (userName.matches("")){
            etUserName.setError("Please enter some username!");
            result = false;
        }
        else if(password.matches("")){
            etPassword.setError("Please enter some password!");
            result = false;
        } else if(userName.matches("invalid")){
            etUserName.setError("Invalid username!");
            result = false;
        }else if(password.matches("invalid")){
            etPassword.setError("Invalid password!");
            result = false;
        }else if(password.length()<5){
            etPassword.setError("Password must be minimum 5 characters!");
            result = false;
        }else if(userName.length()<5){
            etUserName.setError("Username must be minimum 5 characters!");
            result = false;
        }

        return result;
    }

    public boolean checkRegistrationCredentials(EditText etAge,EditText etPassword,EditText etUserName, String name,String password, String age){

        /*
        *
        * 1. name, password, age field not empty
        * 2. name, password, age= "invalid"
        * 3. name and password length >=5 age length >0
        *
        */

        int intAge = 0;
        boolean result = true;
        try {
            intAge = Integer.parseInt(age);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

        if(name.matches("") && password.matches("") && age.matches("")){
            etAge.setError("Set some age!");
            etPassword.setError("Set some password!");
            etUserName.setError("Set some username!");
            result = false;
        }

        if(name.matches("")){
            etUserName.setError("Set some username!");
            result = false;
        }

        if(password.matches("")){
            etPassword.setError("Set some password!");
            result = false;
        }

        if(age.matches("")){
            etAge.setError("Set some age!");
            result = false;
        }

        if(age.matches("invalid")){
            etAge.setError("Please enter valid age!");
            result = false;
        }

        if(name.matches("invalid")){
            etUserName.setError("Please enter valid username!");
            result = false;
        }

        if(password.matches("invalid")){
            etPassword.setError("Please enter valid password!");
            result = false;
        }

        if(name.length()<5){
            etUserName.setError("Username must be minimum 5 characters!");
            result = false;
        }

        if(password.length()<5){
            etPassword.setError("Password must be minimum 5 characters!");
            result = false;
        }

        if(intAge<1 || intAge>100){
            etAge.setError("Enter valid age!");
            result = false;
        }
        return result;
    }
}
