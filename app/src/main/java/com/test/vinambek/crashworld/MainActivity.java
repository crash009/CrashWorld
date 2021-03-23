package com.test.vinambek.crashworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button crashButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        crashButton = findViewById(R.id.crashMe);

        crashButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                throw new RuntimeException("Intentional Test Crash for Crashlytics"); // Force a crash
            }
        });
    }

    public void onClick(View view)
    {
        throw new RuntimeException("Test Crash");
    }

    public void makeANRClick(View view){
        while (true);
    }
}