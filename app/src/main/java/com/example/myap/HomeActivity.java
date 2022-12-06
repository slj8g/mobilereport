package com.example.myap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button addmemo;
    private Button buttoncal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setTitle("홈 화면");

        addmemo = findViewById(R.id.addmemo);
        addmemo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, memo.class);
                startActivity(intent);

            }
        });

        buttoncal = findViewById(R.id.buttoncal);
        buttoncal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, calender.class);
                startActivity(intent);

            }
        });
    }




}