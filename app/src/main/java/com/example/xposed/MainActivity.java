package com.example.xposed;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private boolean isModuleActive() {
        return false;
    }

    public void onClick(View view) {
        if (isModuleActive()) {
            Toast.makeText(this, "模块已启动", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "模块未启动", Toast.LENGTH_SHORT).show();
        }
    }
}