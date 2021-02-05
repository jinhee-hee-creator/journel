package com.example.journel.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.example.journel.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //xml에서 fragment~로 attatch
        // 이 액티비티에서 작동하도록

//        if(savedInstanceState == null){
//            LoginFragment login = new LoginFragment();
//            login.setArguments( getIntent().getExtras() );//여기 세줄은 loginfragment가 지나가는 루트
//            getSupportFragmentManager().beginTransaction().add(android.R.id.content,login).commit();
//            //번거로우니까 navigation graph 사용 : fragment간 소통 // gradle추가해야함


        Toolbar toolbar = findViewById( R.id.toolBar );
        setSupportActionBar( toolbar );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.toolbar_menu, menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings:
                Toast.makeText( getApplicationContext(), "SETTING MENU", Toast.LENGTH_LONG ).show();
                break;

            case R.id.menu_email:
                Toast.makeText( getApplicationContext(), "EMAIL", Toast.LENGTH_LONG ).show();
                break;
            case R.id.menu_logout:
                Toast.makeText( getApplicationContext(), "LOGOUT", Toast.LENGTH_LONG ).show();
                break;
        }


        return super.onOptionsItemSelected( item );
    }
}
