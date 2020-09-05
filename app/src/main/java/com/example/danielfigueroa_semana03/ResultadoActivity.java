package com.example.danielfigueroa_semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView NombrePrevio;
    private TextView NotaFinal;
    private Button CalcularOtra;
    public ConstraintLayout Fondo;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        NombrePrevio = findViewById(R.id.NombrePrevio);
        NotaFinal = findViewById(R.id.NotaFinal);
        CalcularOtra = findViewById(R.id.CalcularOtra);
        Fondo = findViewById(R.id.Fondo);


        sharedPreferences = getSharedPreferences("Preferencias", MODE_PRIVATE);
        cambiarColor();

        Intent Activity = getIntent(); //esta actividad
        String username = getIntent().getExtras().getString("Username"); //recibe el nombre anterior
        double resultado = Activity.getDoubleExtra("resultado", 0.00); //recibe el resultado anterior

        NombrePrevio.setText("Hola, " +username+ " aqui esta tu nota final");
        NotaFinal.setText(""+resultado);
        //boton
        CalcularOtra.setOnClickListener(
                (v)->{
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
        );

    }

    public void cambiarColor(){ //aqui selecciona entre los casos de shared prefences
        int color = sharedPreferences.getInt("color", 0);
        switch(color){
            case 1: Fondo.setBackgroundColor(Color.CYAN);
                break;
            case 2: Fondo.setBackgroundColor(Color.YELLOW);
                break;
            case 3: Fondo.setBackgroundColor(Color.RED);
                break;
        }
    }
}