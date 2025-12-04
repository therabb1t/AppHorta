package com.exemplo.seuapp.activities; // Ajuste seu package

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.exemplo.seuapp.R;

public class Voluntario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voluntario);

        TextView textViewSaudacao = findViewById(R.id.text_view_saudacao);

        textViewSaudacao.setText("Bem-vindo(a) ao Painel de Voluntários!");
    }
}