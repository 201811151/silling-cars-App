package com.example.sellingcarsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button b3;
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        b3  = (Button) findViewById(R.id.b3 );
        b3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity();
            }
        });

        b4 = (Button) findViewById(R.id.b4 );
        b4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { LoginActivity1();}

        });
    }

    public void  LoginActivity(){
        Intent intent=new Intent(HomeActivity  .this, CamryActivity .class);
        startActivity(intent);
    }

    public void  LoginActivity1(){
        Intent intent=new Intent(HomeActivity  .this, MainActivity .class);
        startActivity(intent);
    }
}