package com.example.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DoctorRegisterationActivity extends AppCompatActivity {

    private TextView regpageQuestion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_registeration);

        regpageQuestion = findViewById(R.id.regPageQuestion);
        regpageQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorRegisterationActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}