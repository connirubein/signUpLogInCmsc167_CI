package com.connirubein.signuplogincmsc167;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.support.annotation.VisibleForTesting;
//import android.support.test.espresso.IdlingResource;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Declaration Button
    private Button buttonSignup;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }

    private View.OnClickListener btnOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnSignup:
                    openSignUpActivity();
                    break;
                case R.id.btnLogin:
                    openLogInActivity();
                    break;
            }
        }
    };

    private void initViews(){
        buttonLogin = findViewById(R.id.btnLogin);
        buttonSignup = findViewById(R.id.btnSignup);
    }

    private void initListeners(){
        buttonSignup.setOnClickListener(btnOnClickListener);
        buttonLogin.setOnClickListener(btnOnClickListener);
    }

    private void openSignUpActivity(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    private void openLogInActivity(){
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
    }

}
