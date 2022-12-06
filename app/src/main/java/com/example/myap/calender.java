package com.example.myap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calender extends AppCompatActivity {
    private Button buttonmemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        setTitle("달력");

        buttonmemo = findViewById(R.id.buttonmemo);
        buttonmemo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(calender.this, HomeActivity.class);
                startActivity(intent);

            }
        });
    }
}