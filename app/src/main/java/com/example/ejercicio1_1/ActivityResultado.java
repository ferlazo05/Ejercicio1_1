package com.example.ejercicio1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {
    TextView TvResultado;
    Double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TvResultado = (TextView) findViewById(R.id.ResulTvResul);

        Bundle recibir_datos = getIntent().getExtras();
        resultado = recibir_datos.getDouble("resultado");

        TvResultado.setText(resultado.toString());
    }
}