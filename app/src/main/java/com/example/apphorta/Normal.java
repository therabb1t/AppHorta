package com.exemplo.seuapp.activities; // Ajuste seu package

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.exemplo.seuapp.R;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }
}