package com.example.journel.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.journel.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        //databinding하려면 바꾸어야함. setcontentview대신
        DataBindingUtil.setContentView(this, R.layout.activity_splash );



        Intent intent = new Intent( getApplicationContext(), AuthActivity.class );
        startActivity( intent );
        finish();
    }
}