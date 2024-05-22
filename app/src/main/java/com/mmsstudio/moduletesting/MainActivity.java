package com.mmsstudio.moduletesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mmsstudio.mrmmslibs.MMSCounter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MMSCounter.showToast(this, "Hello");

        MMSCounter.Counter(12000, 2000, findViewById(R.id.SabbirMMS));
    }
}