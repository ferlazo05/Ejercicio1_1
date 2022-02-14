package com.example.ejercicio1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_suma, btn_resta, btn_division, btn_multiplicacion;
    EditText txtn1, txtn2;
    int opc, n1, n2;
    double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_suma = (Button) findViewById(R.id.btnSuma);
        btn_resta = (Button) findViewById(R.id.btnResta);
        btn_division = (Button) findViewById(R.id.btnDivision);
        btn_multiplicacion = (Button) findViewById(R.id.btnMultiplicacion);

        txtn1 = (EditText) findViewById(R.id.txtnum1);
        txtn2 = (EditText) findViewById(R.id.txtnum2);

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opc = 1;
                operacion();
            }
        });
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opc = 2;
                operacion();
            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opc = 3;
                operacion();
            }
        });
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opc = 4;
                operacion();
            }
        });
    }

    public void operacion()
    {
        n1 = Integer.parseInt(txtn1.getText().toString());
        n2 = Integer.parseInt(txtn2.getText().toString());
        if(opc==1)
        { //Suma
            resultado = n1 + n2;
        }
        else if(opc==2)
        { //Resta
            resultado = n1 - n2;
        }
        else if(opc==3)
        { //Division
            resultado = n1 / n2;
        }
        else if(opc==4)
        { //Multiplicacion
            resultado = n1 * n2;
        }
        enviarDatos();
    }

    public void enviarDatos()
    {
        Bundle enviar_datos = new Bundle();
        enviar_datos.putDouble("resultado", resultado);

        Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
        intent.putExtras(enviar_datos);

        startActivity(intent);
    }
}