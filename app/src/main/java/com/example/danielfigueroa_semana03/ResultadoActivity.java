package com.example.danielfigueroa_semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView NombrePrevio;
    private TextView NotaFinal;
    private Button CalcularOtra;
    public ConstraintLayout Fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        NombrePrevio = findViewById(R.id.NombrePrevio);
        NotaFinal = findViewById(R.id.NotaFinal);
        CalcularOtra = findViewById(R.id.CalcularOtra);
        Fondo = findViewById(R.id.Fondo);

        Intent Activity = getIntent(); //esta actividad
        String username = Activity.getStringExtra("username"); //recibe el nombre anterior
        double resultado = Activity.getDoubleExtra("resultado", 0.00); //recibe el resultado anterior

        NombrePrevio.setText("Hola,"+username+"aqui esta tu nota final");
        NotaFinal.setText(""+resultado);
        //boton
        CalcularOtra.setOnClickListener(
                (v)->{
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
        );

    }
}