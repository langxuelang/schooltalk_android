package com.schooltalk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.schooltalk.ui.login.LoginViewModel;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    LoginComponent mLoginComponent;

    @Inject
    LoginViewModel mLoginViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginComponent = ((MainApplication)getApplication()).appComponent.loginComponent().create();
        mLoginComponent.inject(this);
    }
}