package com.example.ejer34_holamundo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Log.e("RegistroActivity","onCreate: He pasado por aquí");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("RegistroActivity","onResume: He pasado por aquí");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("RegistroActivity","onPause: He pasado por aquí");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("RegistroActivity","onDestroy: He pasado por aquí");
    }
}